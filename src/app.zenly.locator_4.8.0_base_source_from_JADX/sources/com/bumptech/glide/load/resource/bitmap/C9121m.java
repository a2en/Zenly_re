package com.bumptech.glide.load.resource.bitmap;

import android.os.Build.VERSION;
import com.bumptech.glide.load.Option;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
public abstract class C9121m {

    /* renamed from: a */
    public static final C9121m f23696a = new C9126e();

    /* renamed from: b */
    public static final C9121m f23697b = new C9124c();

    /* renamed from: c */
    public static final C9121m f23698c = new C9125d();

    /* renamed from: d */
    public static final C9121m f23699d = new C9127f();

    /* renamed from: e */
    public static final C9121m f23700e = f23698c;

    /* renamed from: f */
    public static final Option<C9121m> f23701f = Option.m21321a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", f23700e);

    /* renamed from: g */
    static final boolean f23702g = (VERSION.SDK_INT >= 19);

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$a */
    private static class C9122a extends C9121m {
        C9122a() {
        }

        /* renamed from: a */
        public C9128g mo24638a(int i, int i2, int i3, int i4) {
            return C9128g.QUALITY;
        }

        /* renamed from: b */
        public float mo24639b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$b */
    private static class C9123b extends C9121m {
        C9123b() {
        }

        /* renamed from: a */
        public C9128g mo24638a(int i, int i2, int i3, int i4) {
            return C9128g.MEMORY;
        }

        /* renamed from: b */
        public float mo24639b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$c */
    private static class C9124c extends C9121m {
        C9124c() {
        }

        /* renamed from: a */
        public C9128g mo24638a(int i, int i2, int i3, int i4) {
            if (mo24639b(i, i2, i3, i4) == 1.0f) {
                return C9128g.QUALITY;
            }
            return C9121m.f23696a.mo24638a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo24639b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C9121m.f23696a.mo24639b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$d */
    private static class C9125d extends C9121m {
        C9125d() {
        }

        /* renamed from: a */
        public C9128g mo24638a(int i, int i2, int i3, int i4) {
            return C9128g.QUALITY;
        }

        /* renamed from: b */
        public float mo24639b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$e */
    private static class C9126e extends C9121m {
        C9126e() {
        }

        /* renamed from: a */
        public C9128g mo24638a(int i, int i2, int i3, int i4) {
            if (C9121m.f23702g) {
                return C9128g.QUALITY;
            }
            return C9128g.MEMORY;
        }

        /* renamed from: b */
        public float mo24639b(int i, int i2, int i3, int i4) {
            if (C9121m.f23702g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            float f = 1.0f;
            if (max != 0) {
                f = 1.0f / ((float) Integer.highestOneBit(max));
            }
            return f;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$f */
    private static class C9127f extends C9121m {
        C9127f() {
        }

        /* renamed from: a */
        public C9128g mo24638a(int i, int i2, int i3, int i4) {
            return C9128g.QUALITY;
        }

        /* renamed from: b */
        public float mo24639b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$g */
    public enum C9128g {
        MEMORY,
        QUALITY
    }

    static {
        new C9122a();
        new C9123b();
    }

    /* renamed from: a */
    public abstract C9128g mo24638a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo24639b(int i, int i2, int i3, int i4);
}
