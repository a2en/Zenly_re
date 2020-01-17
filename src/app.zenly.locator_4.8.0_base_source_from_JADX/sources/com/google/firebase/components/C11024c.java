package com.google.firebase.components;

/* renamed from: com.google.firebase.components.c */
final /* synthetic */ class C11024c implements ComponentFactory {

    /* renamed from: a */
    private final Object f28613a;

    private C11024c(Object obj) {
        this.f28613a = obj;
    }

    /* renamed from: a */
    public static ComponentFactory m28391a(Object obj) {
        return new C11024c(obj);
    }

    public Object create(ComponentContainer componentContainer) {
        Object obj = this.f28613a;
        C11025d.m28396a(obj, componentContainer);
        return obj;
    }
}
