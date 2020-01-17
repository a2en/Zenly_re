package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

/* renamed from: dagger.internal.d */
public final class C12022d<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    private static final Object f31310c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f31311a;

    /* renamed from: b */
    private volatile Object f31312b = f31310c;

    private C12022d(Provider<T> provider) {
        this.f31311a = provider;
    }

    /* renamed from: a */
    public static <T> Provider<T> m31673a(Provider<T> provider) {
        if ((provider instanceof C12022d) || (provider instanceof C12020b)) {
            return provider;
        }
        C12021c.m31670a(provider);
        return new C12022d(provider);
    }

    public T get() {
        Provider<T> provider = this.f31311a;
        if (this.f31312b == f31310c) {
            this.f31312b = provider.get();
            this.f31311a = null;
        }
        return this.f31312b;
    }
}
