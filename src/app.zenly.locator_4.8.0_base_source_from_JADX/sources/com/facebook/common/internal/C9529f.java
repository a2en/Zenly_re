package com.facebook.common.internal;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.facebook.common.internal.f */
public class C9529f<E> extends ArrayList<E> {
    private C9529f(int i) {
        super(i);
    }

    /* renamed from: a */
    public static <E> C9529f<E> m23256a(E... eArr) {
        C9529f<E> fVar = new C9529f<>(eArr.length);
        Collections.addAll(fVar, eArr);
        return fVar;
    }
}
