package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.k */
class C12840k extends C12838j {
    /* renamed from: a */
    public static <T> boolean m33571a(T[] tArr, T t) {
        C12932j.m33818b(tArr, "$this$contains");
        return m33572b(tArr, t) >= 0;
    }

    /* renamed from: b */
    public static final <T> int m33572b(T[] tArr, T t) {
        C12932j.m33818b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            int length2 = tArr.length;
            while (i < length2) {
                if (C12932j.m33817a((Object) t, (Object) tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static <T> T m33577c(T[] tArr) {
        C12932j.m33818b(tArr, "$this$first");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: d */
    public static final <T> int m33579d(T[] tArr) {
        C12932j.m33818b(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    /* renamed from: e */
    public static <T> T m33580e(T[] tArr) {
        C12932j.m33818b(tArr, "$this$last");
        if (!(tArr.length == 0)) {
            return tArr[m33579d(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: f */
    public static <T> T m33581f(T[] tArr) {
        C12932j.m33818b(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: g */
    public static <T> List<T> m33582g(T[] tArr) {
        C12932j.m33818b(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return C12848o.m33640a();
        }
        if (length != 1) {
            return m33583h(tArr);
        }
        return C12846n.m33635a(tArr[0]);
    }

    /* renamed from: h */
    public static <T> List<T> m33583h(T[] tArr) {
        C12932j.m33818b(tArr, "$this$toMutableList");
        return new ArrayList(C12848o.m33639a(tArr));
    }

    /* renamed from: i */
    public static final <T> Set<T> m33584i(T[] tArr) {
        C12932j.m33818b(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return C12845m0.m33632a();
        }
        if (length == 1) {
            return C12843l0.m33589a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C12835h0.m33544a(tArr.length));
        m33569a(tArr, (C) linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static int m33567a(int[] iArr, int i) {
        C12932j.m33818b(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static char m33566a(char[] cArr) {
        C12932j.m33818b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: c */
    public static <T> List<T> m33578c(T[] tArr, Comparator<? super T> comparator) {
        C12932j.m33818b(tArr, "$this$sortedWith");
        C12932j.m33818b(comparator, "comparator");
        return C12838j.m33557a(m33575b(tArr, comparator));
    }

    /* renamed from: b */
    public static final <T> List<T> m33574b(T[] tArr, int i) {
        C12932j.m33818b(tArr, "$this$takeLast");
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C12848o.m33640a();
        } else {
            int length = tArr.length;
            if (i >= length) {
                return m33582g(tArr);
            }
            if (i == 1) {
                return C12846n.m33635a(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(tArr[i2]);
            }
            return arrayList;
        }
    }

    /* renamed from: c */
    public static Long m33576c(long[] jArr) {
        C12932j.m33818b(jArr, "$this$min");
        int i = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int a = m33568a(jArr);
        if (1 <= a) {
            while (true) {
                long j2 = jArr[i];
                if (j > j2) {
                    j = j2;
                }
                if (i == a) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    /* renamed from: a */
    public static <T> List<T> m33570a(T[] tArr, int i) {
        C12932j.m33818b(tArr, "$this$drop");
        if (i >= 0) {
            return m33574b(tArr, C12973l.m33885a(tArr.length - i, 0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested element count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static final int m33568a(long[] jArr) {
        C12932j.m33818b(jArr, "$this$lastIndex");
        return jArr.length - 1;
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m33569a(T[] tArr, C c) {
        C12932j.m33818b(tArr, "$this$toCollection");
        C12932j.m33818b(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: b */
    public static final <T> T[] m33575b(T[] tArr, Comparator<? super T> comparator) {
        C12932j.m33818b(tArr, "$this$sortedArrayWith");
        C12932j.m33818b(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C12932j.m33815a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        C12838j.m33560a(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: b */
    public static Long m33573b(long[] jArr) {
        C12932j.m33818b(jArr, "$this$max");
        int i = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int a = m33568a(jArr);
        if (1 <= a) {
            while (true) {
                long j2 = jArr[i];
                if (j < j2) {
                    j = j2;
                }
                if (i == a) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }
}
