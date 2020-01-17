package com.google.firebase.components;

/* renamed from: com.google.firebase.components.b */
final /* synthetic */ class C11023b implements ComponentFactory {

    /* renamed from: a */
    private final Object f28612a;

    private C11023b(Object obj) {
        this.f28612a = obj;
    }

    /* renamed from: a */
    public static ComponentFactory m28390a(Object obj) {
        return new C11023b(obj);
    }

    public Object create(ComponentContainer componentContainer) {
        Object obj = this.f28612a;
        C11025d.m28398b(obj, componentContainer);
        return obj;
    }
}
