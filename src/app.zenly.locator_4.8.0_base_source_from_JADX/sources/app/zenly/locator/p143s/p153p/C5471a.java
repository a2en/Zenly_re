package app.zenly.locator.p143s.p153p;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p333g.p339c.p344b.p345a.C12033b;

/* renamed from: app.zenly.locator.s.p.a */
public class C5471a {

    /* renamed from: a */
    private boolean f14069a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final float f14070b;

    /* renamed from: c */
    private final SensorManager f14071c;

    /* renamed from: d */
    private final C5473b f14072d;

    /* renamed from: e */
    private final Context f14073e;

    /* renamed from: f */
    private final float f14074f;

    /* renamed from: g */
    private final float f14075g;

    /* renamed from: h */
    private final float f14076h;

    /* renamed from: i */
    private final Function3<Float, Float, Float, C12956q> f14077i;

    /* renamed from: app.zenly.locator.s.p.a$a */
    public static final class C5472a {
        private C5472a() {
        }

        public /* synthetic */ C5472a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.s.p.a$b */
    public static final class C5473b implements SensorEventListener {

        /* renamed from: a */
        private Long f14078a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final float[] f14079b = {0.0f, 0.0f, 0.0f};
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final float[] f14080c = {0.0f, 0.0f, 0.0f};

        /* renamed from: d */
        private final ValueAnimator f14081d;

        /* renamed from: e */
        final /* synthetic */ C5471a f14082e;

        /* renamed from: app.zenly.locator.s.p.a$b$a */
        public static final class C5474a implements AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C5473b f14083a;

            public C5474a(C5473b bVar) {
                this.f14083a = bVar;
            }

            public void onAnimationCancel(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationEnd(Animator animator) {
                C12932j.m33818b(animator, "animator");
                C12838j.m33559a(this.f14083a.f14079b, 0.0f, 0, 0, 6, null);
                C12838j.m33559a(this.f14083a.f14080c, 0.0f, 0, 0, 6, null);
            }

            public void onAnimationRepeat(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationStart(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }
        }

        /* renamed from: app.zenly.locator.s.p.a$b$b */
        static final class C5475b implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C5473b f14084a;

            C5475b(C5473b bVar) {
                this.f14084a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C12932j.m33815a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    this.f14084a.f14082e.mo13094a().invoke(Float.valueOf(((-this.f14084a.f14080c[0]) / this.f14084a.f14082e.mo13095b()) * floatValue), Float.valueOf((this.f14084a.f14080c[1] / this.f14084a.f14082e.mo13096c()) * floatValue), Float.valueOf((this.f14084a.f14080c[2] / this.f14084a.f14082e.mo13097d()) * floatValue));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        C5473b(C5471a aVar) {
            this.f14082e = aVar;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            C12932j.m33815a((Object) ofFloat, "ValueAnimator.ofFloat(1f, 0f)");
            this.f14081d = ofFloat;
            this.f14081d.setInterpolator(C7657c.m18650f());
            this.f14081d.addUpdateListener(new C5475b(this));
            this.f14081d.addListener(new C5474a(this));
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            C12932j.m33818b(sensor, "sensor");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            boolean z;
            C12932j.m33818b(sensorEvent, "event");
            Long l = this.f14078a;
            if (l != null) {
                float longValue = ((float) (sensorEvent.timestamp - l.longValue())) / 1.0E9f;
                m15567a(sensorEvent, 0, longValue, this.f14082e.mo13095b());
                m15567a(sensorEvent, 1, longValue, this.f14082e.mo13096c());
                m15567a(sensorEvent, 2, longValue, this.f14082e.mo13097d());
                int length = this.f14079b.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (Math.abs(this.f14079b[i] - this.f14080c[i]) > this.f14082e.f14070b) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    int length2 = this.f14079b.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        this.f14080c[i2] = this.f14079b[i2];
                    }
                    this.f14082e.mo13094a().invoke(Float.valueOf((-this.f14080c[0]) / this.f14082e.mo13095b()), Float.valueOf(this.f14080c[1] / this.f14082e.mo13096c()), Float.valueOf(this.f14080c[2] / this.f14082e.mo13097d()));
                }
            }
            this.f14078a = Long.valueOf(sensorEvent.timestamp);
        }

        /* renamed from: a */
        private final void m15567a(SensorEvent sensorEvent, int i, float f, float f2) {
            float[] fArr = this.f14079b;
            fArr[i] = fArr[i] + ((((((sensorEvent.values[i] * f) * 180.0f) / 3.1415927f) + 180.0f) % 360.0f) - 180.0f);
            fArr[i] = C12973l.m33892c(C12973l.m33889b(fArr[i], -f2), f2);
        }

        /* renamed from: a */
        public final void mo13100a() {
            this.f14078a = null;
            this.f14081d.start();
        }
    }

    static {
        new C5472a(null);
    }

    public C5471a(Context context, float f, float f2, float f3, Function3<? super Float, ? super Float, ? super Float, C12956q> function3) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(function3, "listener");
        this.f14073e = context;
        this.f14074f = f;
        this.f14075g = f2;
        this.f14076h = f3;
        this.f14077i = function3;
        boolean z = false;
        float f4 = (float) 0;
        if (this.f14074f > f4 && this.f14075g > f4 && this.f14076h > f4) {
            z = true;
        }
        if (z) {
            Object systemService = this.f14073e.getSystemService("sensor");
            if (systemService != null) {
                this.f14071c = (SensorManager) systemService;
                int c = C12033b.m31704c(this.f14073e);
                float f5 = c < 2013 ? 3.0f : c == 2013 ? 1.0f : 0.1f;
                this.f14070b = f5;
                this.f14072d = new C5473b(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
        }
        throw new IllegalArgumentException("maxTiltX, maxTiltY and maxTiltZ must be > 0".toString());
    }

    /* renamed from: b */
    public final float mo13095b() {
        return this.f14074f;
    }

    /* renamed from: c */
    public final float mo13096c() {
        return this.f14075g;
    }

    /* renamed from: d */
    public final float mo13097d() {
        return this.f14076h;
    }

    /* renamed from: e */
    public void mo13098e() {
        if (!this.f14069a) {
            int i = 1;
            this.f14069a = true;
            SensorManager sensorManager = this.f14071c;
            C5473b bVar = this.f14072d;
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            if (this.f14070b == 3.0f) {
                i = 2;
            }
            sensorManager.registerListener(bVar, defaultSensor, i);
        }
    }

    /* renamed from: f */
    public final void mo13099f() {
        if (this.f14069a) {
            this.f14069a = false;
            this.f14071c.unregisterListener(this.f14072d);
            this.f14072d.mo13100a();
        }
    }

    /* renamed from: a */
    public final Function3<Float, Float, Float, C12956q> mo13094a() {
        return this.f14077i;
    }
}
