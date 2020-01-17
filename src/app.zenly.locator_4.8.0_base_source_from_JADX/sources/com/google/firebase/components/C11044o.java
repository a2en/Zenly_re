package com.google.firebase.components;

import com.google.firebase.events.C11046a;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.o */
final class C11044o extends C11022a {

    /* renamed from: a */
    private final Set<Class<?>> f28653a;

    /* renamed from: b */
    private final Set<Class<?>> f28654b;

    /* renamed from: c */
    private final Set<Class<?>> f28655c;

    /* renamed from: d */
    private final Set<Class<?>> f28656d;

    /* renamed from: e */
    private final Set<Class<?>> f28657e;

    /* renamed from: f */
    private final ComponentContainer f28658f;

    /* renamed from: com.google.firebase.components.o$a */
    private static class C11045a implements Publisher {

        /* renamed from: a */
        private final Set<Class<?>> f28659a;

        /* renamed from: b */
        private final Publisher f28660b;

        public C11045a(Set<Class<?>> set, Publisher publisher) {
            this.f28659a = set;
            this.f28660b = publisher;
        }

        public void publish(C11046a<?> aVar) {
            if (this.f28659a.contains(aVar.mo32215a())) {
                this.f28660b.publish(aVar);
            } else {
                throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    C11044o(C11025d<?> dVar, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C11040k kVar : dVar.mo32175a()) {
            if (kVar.mo32202b()) {
                if (kVar.mo32204d()) {
                    hashSet3.add(kVar.mo32201a());
                } else {
                    hashSet.add(kVar.mo32201a());
                }
            } else if (kVar.mo32204d()) {
                hashSet4.add(kVar.mo32201a());
            } else {
                hashSet2.add(kVar.mo32201a());
            }
        }
        if (!dVar.mo32178d().isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.f28653a = Collections.unmodifiableSet(hashSet);
        this.f28654b = Collections.unmodifiableSet(hashSet2);
        this.f28655c = Collections.unmodifiableSet(hashSet3);
        this.f28656d = Collections.unmodifiableSet(hashSet4);
        this.f28657e = dVar.mo32178d();
        this.f28658f = componentContainer;
    }

    public <T> T get(Class<T> cls) {
        if (this.f28653a.contains(cls)) {
            T t = this.f28658f.get(cls);
            if (!cls.equals(Publisher.class)) {
                return t;
            }
            return new C11045a(this.f28657e, (Publisher) t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> Provider<T> getProvider(Class<T> cls) {
        if (this.f28654b.contains(cls)) {
            return this.f28658f.getProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> Set<T> setOf(Class<T> cls) {
        if (this.f28655c.contains(cls)) {
            return this.f28658f.setOf(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        if (this.f28656d.contains(cls)) {
            return this.f28658f.setOfProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
