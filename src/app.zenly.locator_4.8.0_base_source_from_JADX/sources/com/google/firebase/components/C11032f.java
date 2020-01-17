package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.components.f */
final /* synthetic */ class C11032f implements Provider {

    /* renamed from: a */
    private final C11035i f28628a;

    /* renamed from: b */
    private final C11025d f28629b;

    private C11032f(C11035i iVar, C11025d dVar) {
        this.f28628a = iVar;
        this.f28629b = dVar;
    }

    /* renamed from: a */
    public static Provider m28421a(C11035i iVar, C11025d dVar) {
        return new C11032f(iVar, dVar);
    }

    public Object get() {
        return this.f28629b.mo32176b().create(new C11044o(this.f28629b, this.f28628a));
    }
}
