package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.text.n */
class C13025n extends C13024m {
    /* renamed from: a */
    public static <T> void m33993a(Appendable appendable, T t, Function1<? super T, ? extends CharSequence> function1) {
        C12932j.m33818b(appendable, "$this$appendElement");
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
