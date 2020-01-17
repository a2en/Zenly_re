package p214e.p234h.p235e;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.core.util.C0603e;

/* renamed from: e.h.e.b */
public final class C7615b {

    /* renamed from: a */
    private static final ThreadLocal<C0603e<Rect, Rect>> f19186a = new ThreadLocal<>();

    /* renamed from: a */
    public static boolean m18495a(Paint paint, String str) {
        if (VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        String str2 = "󟿽";
        float measureText = paint.measureText(str2);
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C0603e a = m18494a();
        paint.getTextBounds(str2, 0, 2, (Rect) a.f2729a);
        paint.getTextBounds(str, 0, length, (Rect) a.f2730b);
        return !((Rect) a.f2729a).equals(a.f2730b);
    }

    /* renamed from: a */
    private static C0603e<Rect, Rect> m18494a() {
        C0603e<Rect, Rect> eVar = (C0603e) f19186a.get();
        if (eVar == null) {
            C0603e<Rect, Rect> eVar2 = new C0603e<>(new Rect(), new Rect());
            f19186a.set(eVar2);
            return eVar2;
        }
        ((Rect) eVar.f2729a).setEmpty();
        ((Rect) eVar.f2730b).setEmpty();
        return eVar;
    }
}
