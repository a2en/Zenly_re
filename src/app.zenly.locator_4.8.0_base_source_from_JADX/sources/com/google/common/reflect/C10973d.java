package com.google.common.reflect;

import com.google.common.base.C10850i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.common.reflect.d */
abstract class C10973d<T> {
    C10973d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Type mo32062a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C10850i.m28011a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", (Object) genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
