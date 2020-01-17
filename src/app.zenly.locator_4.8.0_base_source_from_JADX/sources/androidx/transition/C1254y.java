package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.y */
class C1254y {

    /* renamed from: a */
    private static final C1224c0 f4666a;

    /* renamed from: b */
    private static Field f4667b;

    /* renamed from: c */
    private static boolean f4668c;

    /* renamed from: d */
    static final Property<View, Float> f4669d = new C1255a(Float.class, "translationAlpha");

    /* renamed from: androidx.transition.y$a */
    static class C1255a extends Property<View, Float> {
        C1255a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1254y.m6017c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C1254y.m6011a(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.y$b */
    static class C1256b extends Property<View, Rect> {
        C1256b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return ViewCompat.m2855i(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            ViewCompat.m2821a(view, rect);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 22) {
            f4666a = new C1222b0();
        } else if (i >= 21) {
            f4666a = new C1216a0();
        } else if (i >= 19) {
            f4666a = new C1257z();
        } else {
            f4666a = new C1224c0();
        }
        new C1256b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m6011a(View view, float f) {
        f4666a.mo6070a(view, f);
    }

    /* renamed from: b */
    static C1253x m6015b(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C1252w(view);
        }
        return C1250v.m5995c(view);
    }

    /* renamed from: c */
    static float m6017c(View view) {
        return f4666a.mo6071b(view);
    }

    /* renamed from: d */
    static C1232g0 m6018d(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C1230f0(view);
        }
        return new C1228e0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m6019e(View view) {
        f4666a.mo6072c(view);
    }

    /* renamed from: a */
    static void m6010a(View view) {
        f4666a.mo6069a(view);
    }

    /* renamed from: a */
    static void m6012a(View view, int i) {
        m6009a();
        Field field = f4667b;
        if (field != null) {
            try {
                f4667b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: b */
    static void m6016b(View view, Matrix matrix) {
        f4666a.mo6067b(view, matrix);
    }

    /* renamed from: a */
    static void m6014a(View view, Matrix matrix) {
        f4666a.mo6066a(view, matrix);
    }

    /* renamed from: a */
    static void m6013a(View view, int i, int i2, int i3, int i4) {
        f4666a.mo6068a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static void m6009a() {
        if (!f4668c) {
            try {
                f4667b = View.class.getDeclaredField("mViewFlags");
                f4667b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f4668c = true;
        }
    }
}
