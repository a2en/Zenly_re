package com.google.common.reflect;

import com.google.common.base.C10850i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: com.google.common.reflect.c */
public final class C10972c {
    /* renamed from: a */
    public static <T> T m28308a(Class<T> cls, InvocationHandler invocationHandler) {
        C10850i.m28004a(invocationHandler);
        C10850i.m28011a(cls.isInterface(), "%s is not an interface", (Object) cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
