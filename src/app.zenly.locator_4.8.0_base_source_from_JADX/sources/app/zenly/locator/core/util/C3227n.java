package app.zenly.locator.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: app.zenly.locator.core.util.n */
public final class C3227n {
    @SafeVarargs
    /* renamed from: a */
    public static <T> List<T> m10229a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList(tArr));
    }

    /* renamed from: a */
    public static <T> ArrayList<T> m10228a(List<T> list) {
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }
}
