package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: androidx.core.text.b */
public final class C0586b {
    /* renamed from: a */
    public static Spanned m2733a(String str, int i) {
        if (VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
