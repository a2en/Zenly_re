package app.zenly.locator.p143s.p160v.p161b;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.widget.TextView;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.v.b.h */
public final class C5541h {

    /* renamed from: a */
    private final int f14190a;

    /* renamed from: b */
    private final CharacterStyle f14191b;

    /* renamed from: app.zenly.locator.s.v.b.h$a */
    public static final class C5542a {
        private C5542a() {
        }

        public /* synthetic */ C5542a(C12928f fVar) {
            this();
        }
    }

    static {
        new C5542a(null);
    }

    public C5541h() {
        this(0, null, 3, null);
    }

    public C5541h(int i, CharacterStyle characterStyle) {
        C12932j.m33818b(characterStyle, "highlightStyle");
        this.f14190a = i;
        this.f14191b = characterStyle;
    }

    /* renamed from: a */
    public final void mo13161a(TextView textView, CharSequence charSequence, CharSequence charSequence2) {
        C12932j.m33818b(textView, "view");
        C12932j.m33818b(charSequence, "text");
        C12932j.m33818b(charSequence2, "query");
        textView.setText(mo13160a(charSequence, charSequence2));
    }

    public /* synthetic */ C5541h(int i, CharacterStyle characterStyle, int i2, C12928f fVar) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            characterStyle = new StyleSpan(1);
        }
        this(i, characterStyle);
    }

    /* renamed from: a */
    public final CharSequence mo13160a(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        C12932j.m33818b(charSequence, "text");
        C12932j.m33818b(charSequence2, "query");
        int i2 = this.f14190a;
        if (i2 == 1) {
            i = C13029r.m34009a(charSequence, charSequence2.toString(), 0, true, 2, (Object) null);
        } else if (i2 != 2) {
            i = -1;
        } else if (C13029r.m34029b(charSequence, charSequence2, true)) {
            i = 0;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(charSequence2);
            i = C13029r.m34009a(charSequence, sb.toString(), 0, true, 2, (Object) null);
            if (i != -1) {
                i++;
            }
        }
        if (i == -1) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(this.f14191b, i, charSequence2.length() + i, 0);
        return spannableString;
    }
}
