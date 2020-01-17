package p250f.p251a.p252a.p253a.p254d;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

/* renamed from: f.a.a.a.d.c */
public final class C7657c {

    /* renamed from: a */
    private static final AccelerateInterpolator f19285a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final AccelerateDecelerateInterpolator f19286b = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    private static final DecelerateInterpolator f19287c = new DecelerateInterpolator();

    /* renamed from: d */
    private static final C7658a f19288d = new C7658a(0.0f, 1, null);

    /* renamed from: e */
    private static final LinearInterpolator f19289e = new LinearInterpolator();

    /* renamed from: f */
    private static final OvershootInterpolator f19290f = new OvershootInterpolator();

    /* renamed from: f.a.a.a.d.c$a */
    private static final class C7658a implements TimeInterpolator {

        /* renamed from: a */
        private final float f19291a;

        public C7658a(float f) {
            this.f19291a = f;
        }

        public float getInterpolation(float f) {
            double pow = Math.pow(2.0d, (double) (((float) -10) * f));
            float f2 = this.f19291a;
            return (float) ((pow * Math.sin((((double) (f - (f2 / ((float) 4)))) * 6.283185307179586d) / ((double) f2))) + ((double) 1));
        }

        public /* synthetic */ C7658a(float f, int i, C12928f fVar) {
            if ((i & 1) != 0) {
                f = 0.3f;
            }
            this(f);
        }
    }

    static {
        new C7657c();
        new BounceInterpolator();
    }

    private C7657c() {
    }

    /* renamed from: a */
    public static final TimeInterpolator m18641a() {
        return f19285a;
    }

    /* renamed from: b */
    public static final TimeInterpolator m18643b() {
        return f19286b;
    }

    /* renamed from: c */
    public static final TimeInterpolator m18645c() {
        return f19287c;
    }

    /* renamed from: d */
    public static final TimeInterpolator m18647d() {
        return f19288d;
    }

    /* renamed from: e */
    public static final TimeInterpolator m18649e() {
        return f19289e;
    }

    /* renamed from: f */
    public static final TimeInterpolator m18650f() {
        return f19290f;
    }

    /* renamed from: a */
    public static final TimeInterpolator m18642a(float f) {
        return new AccelerateInterpolator(f);
    }

    /* renamed from: b */
    public static final TimeInterpolator m18644b(float f) {
        return new DecelerateInterpolator(f);
    }

    /* renamed from: c */
    public static final TimeInterpolator m18646c(float f) {
        return new C7658a(f);
    }

    /* renamed from: d */
    public static final TimeInterpolator m18648d(float f) {
        return new OvershootInterpolator(f);
    }
}
