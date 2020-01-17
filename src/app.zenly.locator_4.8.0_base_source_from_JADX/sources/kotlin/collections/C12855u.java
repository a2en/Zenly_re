package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12963e;

/* renamed from: kotlin.collections.u */
class C12855u extends C12854t {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final int m33655c(List<?> list, int i) {
        int a = C12848o.m33638a(list);
        if (i >= 0 && a >= i) {
            return C12848o.m33638a(list) - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C12963e(0, C12848o.m33638a(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m33656d(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C12963e(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: d */
    public static <T> List<T> m33657d(List<T> list) {
        C12932j.m33818b(list, "$this$asReversed");
        return new C12839j0(list);
    }
}
