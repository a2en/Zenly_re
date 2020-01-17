package androidx.emoji.widget;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;

/* renamed from: androidx.emoji.widget.e */
final class C0766e implements InputFilter {
    /* renamed from: a */
    static void m3548a(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }
}
