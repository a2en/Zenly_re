package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

/* renamed from: com.google.firebase.components.g */
final /* synthetic */ class C11033g implements Provider {

    /* renamed from: a */
    private final Set f28630a;

    private C11033g(Set set) {
        this.f28630a = set;
    }

    /* renamed from: a */
    public static Provider m28422a(Set set) {
        return new C11033g(set);
    }

    public Object get() {
        return C11035i.m28425a(this.f28630a);
    }
}
