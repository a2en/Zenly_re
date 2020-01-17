package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.n */
class C12846n {
    /* renamed from: a */
    public static <T> List<T> m33635a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C12932j.m33815a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m33636a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C12932j.m33818b(tArr, "$this$copyToArrayOfAny");
        if (z && C12932j.m33817a((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C12932j.m33815a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
