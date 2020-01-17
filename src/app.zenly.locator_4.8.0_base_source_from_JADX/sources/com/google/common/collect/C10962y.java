package com.google.common.collect;

/* renamed from: com.google.common.collect.y */
public final class C10962y {
    /* renamed from: a */
    static Object[] m28303a(Object... objArr) {
        m28304a(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: b */
    public static <T> T[] m28305b(T[] tArr, int i) {
        return C10867a0.m28033a(tArr, i);
    }

    /* renamed from: a */
    static Object[] m28304a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m28302a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: a */
    static Object m28302a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
