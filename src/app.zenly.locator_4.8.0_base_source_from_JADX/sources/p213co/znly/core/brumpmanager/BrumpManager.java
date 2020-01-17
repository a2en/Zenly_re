package p213co.znly.core.brumpmanager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import p213co.znly.core.brump.Brump.BrumpEvent;
import p213co.znly.core.brump.Brump.BrumpEvent.Builder;

/* renamed from: co.znly.core.brumpmanager.BrumpManager */
public class BrumpManager implements SensorEventListener {
    private final float ALPHA = 0.8f;
    private final int MINIMUM_TIME_BETWEEN_BUMP = 500;
    private final int NB_LAST_POINT_TO_CHECK = 5;
    private final int SAMPLE_RATE = 50;
    private final int SAMPLE_SIZE = 1;
    private final int SAMPLE_STEP = 10;
    private final int SAMPLING_PERIOD = 10000;
    private int accelerationThreshold = 0;
    private BrumpState brumpState = BrumpState.BRUMP_ALLOWED;
    private final Handler handler;
    private final HandlerThread handlerThread;
    private boolean hasGravitySensor = false;
    private long lastBumpTime = 0;
    private long lastTs = 0;
    private float[] mGSamples = {0.0f, 0.0f, 0.0f};
    private float[] mGravity = {0.0f, 0.0f, 0.0f};
    private boolean mInitialized = false;
    private int markedIdx = 0;
    private long nbSamples = 0;
    private float power = 0.0f;
    private float[] sGravity = {0.0f, 0.0f, 0.0f};
    private Samples samples = new Samples(50, 1);
    private final SensorManager sensorManager;
    private long tsDiffSum = 0;

    /* renamed from: co.znly.core.brumpmanager.BrumpManager$1 */
    static /* synthetic */ class C63951 {
        static final /* synthetic */ int[] $SwitchMap$co$znly$core$brumpmanager$BrumpManager$BrumpState = new int[BrumpState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                co.znly.core.brumpmanager.BrumpManager$BrumpState[] r0 = p213co.znly.core.brumpmanager.BrumpManager.BrumpState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$co$znly$core$brumpmanager$BrumpManager$BrumpState = r0
                int[] r0 = $SwitchMap$co$znly$core$brumpmanager$BrumpManager$BrumpState     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.brumpmanager.BrumpManager$BrumpState r1 = p213co.znly.core.brumpmanager.BrumpManager.BrumpState.BRUMP_ALLOWED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$co$znly$core$brumpmanager$BrumpManager$BrumpState     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.brumpmanager.BrumpManager$BrumpState r1 = p213co.znly.core.brumpmanager.BrumpManager.BrumpState.BRUMP_DETECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$co$znly$core$brumpmanager$BrumpManager$BrumpState     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.brumpmanager.BrumpManager$BrumpState r1 = p213co.znly.core.brumpmanager.BrumpManager.BrumpState.BRUMP_DISABLED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.brumpmanager.BrumpManager.C63951.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.brumpmanager.BrumpManager$BrumpState */
    enum BrumpState {
        BRUMP_ALLOWED,
        BRUMP_DETECTED,
        BRUMP_DISABLED
    }

    /* renamed from: co.znly.core.brumpmanager.BrumpManager$Samples */
    class Samples {
        /* access modifiers changed from: private */

        /* renamed from: ax */
        public float[] f15970ax;
        /* access modifiers changed from: private */

        /* renamed from: ay */
        public float[] f15971ay;
        /* access modifiers changed from: private */

        /* renamed from: az */
        public float[] f15972az;
        /* access modifiers changed from: private */
        public int idx;
        private boolean[] isInterpolated;
        /* access modifiers changed from: private */
        public float power;
        private int sample_rate;
        private int sample_size;
        /* access modifiers changed from: private */
        public int size;

        public Samples(int i, int i2) {
            this.sample_rate = i;
            this.sample_size = i2;
            this.size = i * i2;
            int i3 = this.size;
            this.f15970ax = new float[i3];
            this.f15971ay = new float[i3];
            this.f15972az = new float[i3];
            this.isInterpolated = new boolean[i3];
        }

        private void addValue(float[] fArr, float f, int i, int i2) {
            if (i != i2) {
                float f2 = fArr[i];
                int abs = Math.abs((i2 - i) % fArr.length);
                int i3 = (int) ((f - f2) / ((float) abs));
                for (int i4 = 1; i4 < abs - 1; i4++) {
                    fArr[(i + i4) % fArr.length] = ((float) (i4 * i3)) + f2;
                }
            }
            fArr[i2] = f;
        }

        private int computeIndex(int i) {
            return i < 0 ? this.size + i : i;
        }

        private void markInterpolated(boolean[] zArr, int i, int i2) {
            if (i != i2) {
                int abs = Math.abs((i2 - i) % zArr.length);
                for (int i3 = 1; i3 < abs - 1; i3++) {
                    zArr[(i + i3) % zArr.length] = true;
                }
            }
            zArr[i2] = false;
        }

        public synchronized void addPoint(float f, float f2, float f3, long j) {
            int i = (int) ((j / 10) % ((long) this.size));
            addValue(this.f15970ax, f, this.idx, i);
            addValue(this.f15971ay, f2, this.idx, i);
            addValue(this.f15972az, f3, this.idx, i);
            markInterpolated(this.isInterpolated, this.idx, i);
            this.idx = i;
        }

        public synchronized Boolean detectBrump(int i, float f) {
            Boolean valueOf;
            int i2 = i;
            synchronized (this) {
                boolean z = true;
                int computeIndex = computeIndex(this.idx - 1);
                int i3 = this.idx;
                int i4 = 5;
                int i5 = this.size;
                float f2 = Float.MAX_VALUE;
                float f3 = this.f15970ax[this.idx];
                float f4 = this.f15971ay[this.idx];
                float f5 = this.f15972az[this.idx];
                float exp = (float) ((((Math.exp((((double) Math.max(1.0f, Math.min(10.0f, Math.abs(f)))) * 15.0d) / 10.0d) - 1.0d) * 9.0d) / (Math.exp(15.0d) - 1.0d)) + 1.0d);
                while (i4 > 0 && i5 > 0) {
                    if (!this.isInterpolated[computeIndex]) {
                        i4--;
                        i5--;
                        float abs = Math.abs(f3 - this.f15970ax[computeIndex]) + Math.abs(f4 - this.f15971ay[computeIndex]) + (Math.abs(f5 - this.f15972az[computeIndex]) / exp);
                        if (abs < f2) {
                            i3 = computeIndex;
                            f2 = abs;
                        }
                    }
                    computeIndex = computeIndex(computeIndex - 1);
                }
                if (i3 != this.idx) {
                    this.power = f2;
                }
                if (this.power >= ((float) (i2 - ((i2 * 30) / 100)))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("debug signature: power=");
                    sb.append(this.power);
                    sb.append(", idx=");
                    sb.append(this.idx);
                    sb.append(", [cur]=");
                    sb.append(f3);
                    sb.append(",");
                    sb.append(f4);
                    sb.append(",");
                    sb.append(f5);
                    sb.append("(/");
                    sb.append(exp);
                    sb.append("), [");
                    sb.append(i3);
                    sb.append("]=");
                    sb.append(this.f15970ax[i3]);
                    sb.append(",");
                    sb.append(this.f15971ay[i3]);
                    sb.append(",");
                    sb.append(this.f15972az[i3]);
                    sb.append("(/");
                    sb.append(exp);
                    sb.append("), ");
                    String sb2 = sb.toString();
                    int i6 = 10;
                    int i7 = this.idx;
                    while (i6 >= 0) {
                        float abs2 = Math.abs(f3 - this.f15970ax[i7]) + Math.abs(f4 - this.f15971ay[i7]) + (Math.abs(f5 - this.f15972az[i7]) / exp);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append("[");
                        sb3.append(i7);
                        sb3.append("] (");
                        sb3.append(this.f15970ax[i7]);
                        sb3.append(",");
                        sb3.append(this.f15971ay[i7]);
                        sb3.append(",");
                        sb3.append(this.f15972az[i7]);
                        sb3.append("(/");
                        sb3.append(exp);
                        sb3.append("),");
                        sb3.append(this.isInterpolated[i7]);
                        sb3.append(",");
                        sb3.append(abs2);
                        sb3.append("), ");
                        sb2 = sb3.toString();
                        i6--;
                        i7 = computeIndex(i7 - 1);
                    }
                    Log.d("brump", sb2);
                }
                if (this.power < ((float) i2)) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            return valueOf;
        }
    }

    public BrumpManager(Context context, int i) {
        this.accelerationThreshold = i;
        this.sensorManager = (SensorManager) context.getSystemService("sensor");
        this.handlerThread = new HandlerThread("co.znly.core.brumpmanager.thread");
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    private native void _onSensorChanged(byte[] bArr);

    public byte[] createProtoMessage(int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i2, float f) {
        Builder newBuilder = BrumpEvent.newBuilder();
        for (int i3 = 0; i3 < fArr.length; i3++) {
            int length = (i + i3) % fArr.length;
            newBuilder.addAx(fArr[length]);
            newBuilder.addAx(fArr2[length]);
            newBuilder.addAx(fArr3[length]);
        }
        for (float addGsamples : fArr4) {
            newBuilder.addGsamples(addGsamples);
        }
        newBuilder.setSampleRate(i2);
        newBuilder.setPower(f);
        return ((BrumpEvent) newBuilder.build()).toByteArray();
    }

    public int getEstimatedFrequency() {
        long j = this.tsDiffSum;
        if (j == 0) {
            return 0;
        }
        return (int) ((this.nbSamples * 1000) / j);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float f2;
        float f3;
        SensorEvent sensorEvent2 = sensorEvent;
        if (sensorEvent2.sensor.getType() == 9) {
            float[] fArr = sensorEvent2.values;
            float[] fArr2 = this.sGravity;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        } else if (sensorEvent2.sensor.getType() == 1) {
            float[] fArr3 = sensorEvent2.values;
            if (fArr3.length >= 3) {
                float f4 = fArr3[0];
                float f5 = fArr3[1];
                float f6 = fArr3[2];
                float[] fArr4 = this.mGravity;
                fArr4[0] = (fArr4[0] * 0.8f) + (f4 * 0.19999999f);
                fArr4[1] = (fArr4[1] * 0.8f) + (f5 * 0.19999999f);
                fArr4[2] = (fArr4[2] * 0.8f) + (0.19999999f * f6);
                float f7 = f4 - fArr4[0];
                float f8 = f5 - fArr4[1];
                float f9 = f6 - fArr4[2];
                if (!this.mInitialized) {
                    this.mInitialized = true;
                    fArr4[0] = 0.0f;
                    fArr4[1] = 0.0f;
                    fArr4[2] = 0.0f;
                    f3 = 0.0f;
                    f2 = 0.0f;
                    f = 0.0f;
                } else {
                    f = f9;
                    f3 = f7;
                    f2 = f8;
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.samples.addPoint(f3, f2, f, currentTimeMillis);
                this.nbSamples++;
                long j = this.lastTs;
                if (j > 0) {
                    this.tsDiffSum += currentTimeMillis - j;
                }
                this.lastTs = currentTimeMillis;
                if (this.nbSamples >= 5) {
                    int i = C63951.$SwitchMap$co$znly$core$brumpmanager$BrumpManager$BrumpState[this.brumpState.ordinal()];
                    if (i == 1) {
                        float[] fArr5 = this.mGravity;
                        float f10 = fArr5[0];
                        float f11 = fArr5[1];
                        float f12 = fArr5[2];
                        if (this.hasGravitySensor) {
                            float[] fArr6 = this.sGravity;
                            f10 = fArr6[0];
                            f11 = fArr6[1];
                            f12 = fArr6[2];
                        }
                        if (this.samples.detectBrump(this.accelerationThreshold, f12).booleanValue()) {
                            this.power = this.samples.power;
                            this.markedIdx = this.samples.idx;
                            this.brumpState = BrumpState.BRUMP_DETECTED;
                            float[] fArr7 = this.mGSamples;
                            fArr7[0] = f10;
                            fArr7[1] = f11;
                            fArr7[2] = f12;
                        }
                    } else if (i != 2) {
                        if (i == 3 && System.currentTimeMillis() - this.lastBumpTime >= 500) {
                            this.brumpState = BrumpState.BRUMP_ALLOWED;
                        }
                    } else if (Math.abs((this.markedIdx - this.samples.idx) % this.samples.size) >= this.samples.size / 2) {
                        _onSensorChanged(createProtoMessage(this.samples.idx, this.samples.f15970ax, this.samples.f15971ay, this.samples.f15972az, this.mGSamples, 10, this.power));
                        this.lastBumpTime = System.currentTimeMillis();
                        this.brumpState = BrumpState.BRUMP_DISABLED;
                    }
                }
            }
        }
    }

    public synchronized void start() {
        boolean z = true;
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(1);
        Sensor defaultSensor2 = this.sensorManager.getDefaultSensor(9);
        if (defaultSensor2 == null) {
            z = false;
        }
        this.hasGravitySensor = z;
        this.sensorManager.registerListener(this, defaultSensor, 10000, this.handler);
        this.sensorManager.registerListener(this, defaultSensor2, 10000, this.handler);
    }

    public synchronized void stop() {
        this.sensorManager.unregisterListener(this);
    }
}
