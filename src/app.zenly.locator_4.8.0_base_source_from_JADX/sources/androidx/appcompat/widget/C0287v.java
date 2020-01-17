package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p214e.p234h.p235e.C7614a;

/* renamed from: androidx.appcompat.widget.v */
class C0287v {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1297a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1298b = {-16842910};

    /* renamed from: c */
    static final int[] f1299c = {16842908};

    /* renamed from: d */
    static final int[] f1300d = {16842919};

    /* renamed from: e */
    static final int[] f1301e = {16842912};

    /* renamed from: f */
    static final int[] f1302f = new int[0];

    /* renamed from: g */
    private static final int[] f1303g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    /* renamed from: a */
    public static int m1186a(Context context, int i) {
        ColorStateList c = m1190c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f1298b, c.getDefaultColor());
        }
        TypedValue a = m1188a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1187a(context, i, a.getFloat());
    }

    /* renamed from: b */
    public static int m1189b(Context context, int i) {
        int[] iArr = f1303g;
        iArr[0] = i;
        C0291z a = C0291z.m1195a(context, (AttributeSet) null, iArr);
        try {
            return a.mo2099a(0, 0);
        } finally {
            a.mo2102a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m1190c(Context context, int i) {
        int[] iArr = f1303g;
        iArr[0] = i;
        C0291z a = C0291z.m1195a(context, (AttributeSet) null, iArr);
        try {
            return a.mo2100a(0);
        } finally {
            a.mo2102a();
        }
    }

    /* renamed from: a */
    private static TypedValue m1188a() {
        TypedValue typedValue = (TypedValue) f1297a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1297a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    static int m1187a(Context context, int i, float f) {
        int b = m1189b(context, i);
        return C7614a.m18493c(b, Math.round(((float) Color.alpha(b)) * f));
    }
}
