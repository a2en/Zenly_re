package app.zenly.locator.core.util;

import android.text.Spanned;
import androidx.core.text.C0586b;
import java.text.Normalizer;
import java.text.Normalizer.Form;

/* renamed from: app.zenly.locator.core.util.w */
public final class C3242w {
    /* renamed from: a */
    public static String m10278a(CharSequence charSequence) {
        return Normalizer.normalize(charSequence, Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }

    /* renamed from: a */
    public static Spanned m10277a(String str) {
        return C0586b.m2733a(str, 0);
    }
}
