package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.n */
public final class C8782n implements SensorEventListener {

    /* renamed from: ʻ */
    private final int f22748;

    /* renamed from: ˊ */
    private final String f22749;

    /* renamed from: ˋ */
    private final long[] f22750 = new long[2];

    /* renamed from: ˎ */
    private final String f22751;

    /* renamed from: ˏ */
    private final float[][] f22752 = new float[2][];

    /* renamed from: ॱ */
    private final int f22753;

    /* renamed from: ॱॱ */
    private double f22754;

    /* renamed from: ᐝ */
    private long f22755;

    private C8782n(int i, String str, String str2) {
        this.f22753 = i;
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        this.f22751 = str;
        if (str2 == null) {
            str2 = str3;
        }
        this.f22749 = str2;
        this.f22748 = ((((i + 31) * 31) + this.f22751.hashCode()) * 31) + this.f22749.hashCode();
    }

    /* renamed from: ˊ */
    private static double m20744(float[] fArr, float[] fArr2) {
        double d = 0.0d;
        for (int i = 0; i < Math.min(fArr.length, fArr2.length); i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    /* renamed from: ˋ */
    static C8782n m20746(Sensor sensor) {
        return new C8782n(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    /* renamed from: ˏ */
    private boolean m20747(int i, String str, String str2) {
        return this.f22753 == i && this.f22751.equals(str) && this.f22749.equals(str2);
    }

    /* renamed from: ॱ */
    private static List<Float> m20748(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8782n)) {
            return false;
        }
        C8782n nVar = (C8782n) obj;
        return m20747(nVar.f22753, nVar.f22751, nVar.f22749);
    }

    public final int hashCode() {
        return this.f22748;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!(sensorEvent == null || sensorEvent.values == null)) {
            Sensor sensor = sensorEvent.sensor;
            if ((sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true) {
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (m20747(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[][] fArr2 = this.f22752;
                    float[] fArr3 = fArr2[0];
                    if (fArr3 == null) {
                        fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                        this.f22750[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr4 = fArr2[1];
                    if (fArr4 == null) {
                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                        this.f22752[1] = copyOf;
                        this.f22750[1] = currentTimeMillis;
                        this.f22754 = m20744(fArr3, copyOf);
                    } else if (50000000 <= j - this.f22755) {
                        this.f22755 = j;
                        if (Arrays.equals(fArr4, fArr)) {
                            this.f22750[1] = currentTimeMillis;
                            return;
                        }
                        double r0 = m20744(fArr3, fArr);
                        if (r0 > this.f22754) {
                            this.f22752[1] = Arrays.copyOf(fArr, fArr.length);
                            this.f22750[1] = currentTimeMillis;
                            this.f22754 = r0;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final void mo23802(Map<C8782n, Map<String, Object>> map, boolean z) {
        if (this.f22752[0] != null) {
            map.put(this, m20745());
            if (z) {
                for (int i = 0; i < 2; i++) {
                    this.f22752[i] = null;
                }
                for (int i2 = 0; i2 < 2; i2++) {
                    this.f22750[i2] = 0;
                }
                this.f22754 = 0.0d;
                this.f22755 = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m20745());
        }
    }

    /* renamed from: ˊ */
    private Map<String, Object> m20745() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f22753));
        hashMap.put("sN", this.f22751);
        hashMap.put("sV", this.f22749);
        float[] fArr = this.f22752[0];
        if (fArr != null) {
            hashMap.put("sVS", m20748(fArr));
        }
        float[] fArr2 = this.f22752[1];
        if (fArr2 != null) {
            hashMap.put("sVE", m20748(fArr2));
        }
        return hashMap;
    }
}
