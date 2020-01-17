package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.engine.cache.f */
public final class C8950f {

    /* renamed from: a */
    private final int f23313a;

    /* renamed from: b */
    private final int f23314b;

    /* renamed from: c */
    private final Context f23315c;

    /* renamed from: d */
    private final int f23316d;

    /* renamed from: com.bumptech.glide.load.engine.cache.f$a */
    public static final class C8951a {

        /* renamed from: i */
        static final int f23317i = (VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f23318a;

        /* renamed from: b */
        ActivityManager f23319b;

        /* renamed from: c */
        C8953c f23320c;

        /* renamed from: d */
        float f23321d = 2.0f;

        /* renamed from: e */
        float f23322e = ((float) f23317i);

        /* renamed from: f */
        float f23323f = 0.4f;

        /* renamed from: g */
        float f23324g = 0.33f;

        /* renamed from: h */
        int f23325h = 4194304;

        public C8951a(Context context) {
            this.f23318a = context;
            this.f23319b = (ActivityManager) context.getSystemService("activity");
            this.f23320c = new C8952b(context.getResources().getDisplayMetrics());
            if (VERSION.SDK_INT >= 26 && C8950f.m21501a(this.f23319b)) {
                this.f23322e = 0.0f;
            }
        }

        /* renamed from: a */
        public C8950f mo24391a() {
            return new C8950f(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.f$b */
    private static final class C8952b implements C8953c {

        /* renamed from: a */
        private final DisplayMetrics f23326a;

        C8952b(DisplayMetrics displayMetrics) {
            this.f23326a = displayMetrics;
        }

        /* renamed from: a */
        public int mo24392a() {
            return this.f23326a.heightPixels;
        }

        /* renamed from: b */
        public int mo24393b() {
            return this.f23326a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.f$c */
    interface C8953c {
        /* renamed from: a */
        int mo24392a();

        /* renamed from: b */
        int mo24393b();
    }

    C8950f(C8951a aVar) {
        int i;
        this.f23315c = aVar.f23318a;
        if (m21501a(aVar.f23319b)) {
            i = aVar.f23325h / 2;
        } else {
            i = aVar.f23325h;
        }
        this.f23316d = i;
        int a = m21499a(aVar.f23319b, aVar.f23323f, aVar.f23324g);
        float b = (float) (aVar.f23320c.mo24393b() * aVar.f23320c.mo24392a() * 4);
        int round = Math.round(aVar.f23322e * b);
        int round2 = Math.round(b * aVar.f23321d);
        int i2 = a - this.f23316d;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f23314b = round2;
            this.f23313a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f23322e;
            float f3 = aVar.f23321d;
            float f4 = f / (f2 + f3);
            this.f23314b = Math.round(f3 * f4);
            this.f23313a = Math.round(f4 * aVar.f23322e);
        }
        String str = "MemorySizeCalculator";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m21500a(this.f23314b));
            sb.append(", pool size: ");
            sb.append(m21500a(this.f23313a));
            sb.append(", byte array size: ");
            sb.append(m21500a(this.f23316d));
            sb.append(", memory class limited? ");
            sb.append(i3 > a);
            sb.append(", max size: ");
            sb.append(m21500a(a));
            sb.append(", memoryClass: ");
            sb.append(aVar.f23319b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m21501a(aVar.f23319b));
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: a */
    public int mo24388a() {
        return this.f23316d;
    }

    /* renamed from: b */
    public int mo24389b() {
        return this.f23313a;
    }

    /* renamed from: c */
    public int mo24390c() {
        return this.f23314b;
    }

    /* renamed from: a */
    private static int m21499a(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (m21501a(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: a */
    private String m21500a(int i) {
        return Formatter.formatFileSize(this.f23315c, (long) i);
    }

    @TargetApi(19)
    /* renamed from: a */
    static boolean m21501a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }
}
