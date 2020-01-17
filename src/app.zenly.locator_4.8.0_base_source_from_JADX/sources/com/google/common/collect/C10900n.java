package com.google.common.collect;

/* renamed from: com.google.common.collect.n */
final class C10900n {
    /* renamed from: a */
    static int m28089a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: a */
    static int m28090a(Object obj) {
        return m28089a(obj == null ? 0 : obj.hashCode());
    }
}
