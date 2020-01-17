package kotlin.text;

import kotlin.ranges.C12963e;

/* renamed from: kotlin.text.a */
class C13003a {
    /* renamed from: a */
    public static final boolean m33944a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: a */
    public static final int m33942a(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: a */
    public static final int m33943a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C12963e(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
