package kotlin.text;

/* renamed from: kotlin.text.b */
class C13004b extends C13003a {
    /* renamed from: a */
    public static final boolean m33945a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
