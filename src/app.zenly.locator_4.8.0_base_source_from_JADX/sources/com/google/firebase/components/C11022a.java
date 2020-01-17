package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
abstract class C11022a implements ComponentContainer {
    C11022a() {
    }

    public <T> T get(Class<T> cls) {
        Provider provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    public <T> Set<T> setOf(Class<T> cls) {
        return (Set) setOfProvider(cls).get();
    }
}
