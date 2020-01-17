package p250f.p251a.p252a.p253a.p260i;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.i.a */
public final class C7684a implements InputFilter {

    /* renamed from: e */
    private final String f19310e;

    public C7684a(String str) {
        C12932j.m33818b(str, "characters");
        this.f19310e = str;
    }

    /* renamed from: a */
    private final boolean m18708a(char c) {
        return C13029r.m34019a((CharSequence) this.f19310e, c, false, 2, (Object) null);
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C12932j.m33818b(charSequence, "source");
        int i5 = i;
        while (i5 < i2 && m18708a(charSequence.charAt(i5))) {
            i5++;
        }
        if (i5 == i2) {
            return null;
        }
        if (i2 - i == 1) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, i, i2);
        int i6 = i2 - 1;
        if (i6 >= i5) {
            while (true) {
                if (!m18708a(charSequence.charAt(i6))) {
                    spannableStringBuilder.delete(i6, i6 + 1);
                }
                if (i6 == i5) {
                    break;
                }
                i6--;
            }
        }
        return spannableStringBuilder;
    }
}
