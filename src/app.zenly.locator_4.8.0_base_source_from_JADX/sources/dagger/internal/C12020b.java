package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

/* renamed from: dagger.internal.b */
public final class C12020b<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    private static final Object f31307c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f31308a;

    /* renamed from: b */
    private volatile Object f31309b = f31307c;

    private C12020b(Provider<T> provider) {
        this.f31308a = provider;
    }

    /* renamed from: a */
    public static <T> Lazy<T> m31668a(Provider<T> provider) {
        if (provider instanceof Lazy) {
            return (Lazy) provider;
        }
        C12021c.m31670a(provider);
        return new C12020b(provider);
    }

    /* renamed from: b */
    public static <T> Provider<T> m31669b(Provider<T> provider) {
        C12021c.m31670a(provider);
        if (provider instanceof C12020b) {
            return provider;
        }
        return new C12020b(provider);
    }

    public T get() {
        T t = this.f31309b;
        if (t == f31307c) {
            synchronized (this) {
                t = this.f31309b;
                if (t == f31307c) {
                    t = this.f31308a.get();
                    T t2 = this.f31309b;
                    if (t2 != f31307c) {
                        if (t2 != t) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(t2);
                            sb.append(" & ");
                            sb.append(t);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f31309b = t;
                    this.f31308a = null;
                }
            }
        }
        return t;
    }
}
