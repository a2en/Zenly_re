package com.google.common.collect;

import java.lang.reflect.Array;

/* renamed from: com.google.common.collect.a0 */
final class C10867a0 {
    /* renamed from: a */
    static <T> T[] m28033a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }
}
