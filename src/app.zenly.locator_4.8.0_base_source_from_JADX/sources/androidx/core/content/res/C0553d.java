package androidx.core.content.res;

import java.lang.reflect.Array;

/* renamed from: androidx.core.content.res.d */
final class C0553d {
    /* renamed from: a */
    public static int m2601a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static <T> T[] m2603a(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m2601a(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: a */
    public static int[] m2602a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m2601a(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }
}
