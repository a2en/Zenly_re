package kotlin.text;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.text.t */
class C13033t extends C13032s {
    /* renamed from: c */
    public static final String m34036c(String str, int i) {
        C12932j.m33818b(str, "$this$drop");
        if (i >= 0) {
            String substring = str.substring(C12973l.m33890b(i, str.length()));
            C12932j.m33815a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
