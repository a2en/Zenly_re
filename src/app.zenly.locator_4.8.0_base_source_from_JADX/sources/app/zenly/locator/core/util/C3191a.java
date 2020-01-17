package app.zenly.locator.core.util;

import java.util.Arrays;

/* renamed from: app.zenly.locator.core.util.a */
public final class C3191a {
    /* renamed from: a */
    public static <T> T[] m10160a(T[] tArr, T t) {
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        return copyOf;
    }
}
