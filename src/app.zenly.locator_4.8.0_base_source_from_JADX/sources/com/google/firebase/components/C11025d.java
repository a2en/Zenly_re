package com.google.firebase.components;

import com.google.android.gms.common.internal.C10123l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.d */
public final class C11025d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f28614a;

    /* renamed from: b */
    private final Set<C11040k> f28615b;

    /* renamed from: c */
    private final int f28616c;

    /* renamed from: d */
    private final int f28617d;

    /* renamed from: e */
    private final ComponentFactory<T> f28618e;

    /* renamed from: f */
    private final Set<Class<?>> f28619f;

    /* renamed from: com.google.firebase.components.d$b */
    public static class C11027b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f28620a;

        /* renamed from: b */
        private final Set<C11040k> f28621b;

        /* renamed from: c */
        private int f28622c;

        /* renamed from: d */
        private int f28623d;

        /* renamed from: e */
        private ComponentFactory<T> f28624e;

        /* renamed from: f */
        private Set<Class<?>> f28625f;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C11027b<T> m28409c() {
            this.f28623d = 1;
            return this;
        }

        /* renamed from: b */
        public C11025d<T> mo32186b() {
            C10123l.m25517b(this.f28624e != null, "Missing required property: factory.");
            C11025d dVar = new C11025d(new HashSet(this.f28620a), new HashSet(this.f28621b), this.f28622c, this.f28623d, this.f28624e, this.f28625f);
            return dVar;
        }

        @SafeVarargs
        private C11027b(Class<T> cls, Class<? super T>... clsArr) {
            this.f28620a = new HashSet();
            this.f28621b = new HashSet();
            this.f28622c = 0;
            this.f28623d = 0;
            this.f28625f = new HashSet();
            String str = "Null interface";
            C10123l.m25506a(cls, (Object) str);
            this.f28620a.add(cls);
            for (Class<? super T> a : clsArr) {
                C10123l.m25506a(a, (Object) str);
            }
            Collections.addAll(this.f28620a, clsArr);
        }

        /* renamed from: a */
        public C11027b<T> mo32185a(C11040k kVar) {
            C10123l.m25506a(kVar, (Object) "Null dependency");
            m28408a(kVar.mo32201a());
            this.f28621b.add(kVar);
            return this;
        }

        /* renamed from: a */
        public C11027b<T> mo32183a() {
            m28406a(1);
            return this;
        }

        /* renamed from: a */
        private C11027b<T> m28406a(int i) {
            C10123l.m25517b(this.f28622c == 0, "Instantiation type has already been set.");
            this.f28622c = i;
            return this;
        }

        /* renamed from: a */
        private void m28408a(Class<?> cls) {
            C10123l.m25513a(!this.f28620a.contains(cls), (Object) "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: a */
        public C11027b<T> mo32184a(ComponentFactory<T> componentFactory) {
            C10123l.m25506a(componentFactory, (Object) "Null factory");
            this.f28624e = componentFactory;
            return this;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m28396a(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* renamed from: b */
    static /* synthetic */ Object m28398b(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* renamed from: a */
    public Set<C11040k> mo32175a() {
        return this.f28615b;
    }

    /* renamed from: b */
    public ComponentFactory<T> mo32176b() {
        return this.f28618e;
    }

    /* renamed from: c */
    public Set<Class<? super T>> mo32177c() {
        return this.f28614a;
    }

    /* renamed from: d */
    public Set<Class<?>> mo32178d() {
        return this.f28619f;
    }

    /* renamed from: e */
    public boolean mo32179e() {
        return this.f28616c == 1;
    }

    /* renamed from: f */
    public boolean mo32180f() {
        return this.f28616c == 2;
    }

    /* renamed from: g */
    public boolean mo32181g() {
        return this.f28617d == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f28614a.toArray()));
        sb.append(">{");
        sb.append(this.f28616c);
        sb.append(", type=");
        sb.append(this.f28617d);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f28615b.toArray()));
        sb.append("}");
        return sb.toString();
    }

    private C11025d(Set<Class<? super T>> set, Set<C11040k> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.f28614a = Collections.unmodifiableSet(set);
        this.f28615b = Collections.unmodifiableSet(set2);
        this.f28616c = i;
        this.f28617d = i2;
        this.f28618e = componentFactory;
        this.f28619f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C11027b<T> m28392a(Class<T> cls) {
        return new C11027b<>(cls, new Class[0]);
    }

    /* renamed from: b */
    public static <T> C11027b<T> m28397b(Class<T> cls) {
        C11027b<T> a = m28392a(cls);
        a.m28409c();
        return a;
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C11027b<T> m28393a(Class<T> cls, Class<? super T>... clsArr) {
        return new C11027b<>(cls, clsArr);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C11025d<T> m28395a(T t, Class<T> cls, Class<? super T>... clsArr) {
        C11027b a = m28393a(cls, clsArr);
        a.mo32184a(C11023b.m28390a(t));
        return a.mo32186b();
    }

    /* renamed from: a */
    public static <T> C11025d<T> m28394a(T t, Class<T> cls) {
        C11027b b = m28397b(cls);
        b.mo32184a(C11024c.m28391a(t));
        return b.mo32186b();
    }
}
