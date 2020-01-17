package p333g.p357d.p358a.p361b.p365o;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.StateSet;
import p214e.p234h.p235e.C7614a;

/* renamed from: g.d.a.b.o.a */
public class C12090a {

    /* renamed from: a */
    public static final boolean f31482a = (VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f31483b = {16842919};

    /* renamed from: c */
    private static final int[] f31484c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f31485d = {16842908};

    /* renamed from: e */
    private static final int[] f31486e = {16843623};

    /* renamed from: f */
    private static final int[] f31487f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f31488g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f31489h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f31490i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f31491j = {16842913};

    /* renamed from: a */
    public static ColorStateList m31908a(ColorStateList colorStateList) {
        if (f31482a) {
            return new ColorStateList(new int[][]{f31491j, StateSet.NOTHING}, new int[]{m31907a(colorStateList, f31487f), m31907a(colorStateList, f31483b)});
        }
        int[] iArr = f31487f;
        int[] iArr2 = f31488g;
        int[] iArr3 = f31489h;
        int[] iArr4 = f31490i;
        int[] iArr5 = f31483b;
        int[] iArr6 = f31484c;
        int[] iArr7 = f31485d;
        int[] iArr8 = f31486e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f31491j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m31907a(colorStateList, iArr), m31907a(colorStateList, iArr2), m31907a(colorStateList, iArr3), m31907a(colorStateList, iArr4), 0, m31907a(colorStateList, iArr5), m31907a(colorStateList, iArr6), m31907a(colorStateList, iArr7), m31907a(colorStateList, iArr8), 0});
    }

    /* renamed from: a */
    private static int m31907a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f31482a ? m31906a(colorForState) : colorForState;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m31906a(int i) {
        return C7614a.m18493c(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
