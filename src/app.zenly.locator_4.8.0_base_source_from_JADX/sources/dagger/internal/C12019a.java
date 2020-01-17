package dagger.internal;

import javax.inject.Provider;

/* renamed from: dagger.internal.a */
public final class C12019a<T> implements Factory<T> {

    /* renamed from: a */
    private Provider<T> f31306a;

    /* renamed from: a */
    public void mo35646a(Provider<T> provider) {
        if (provider == null) {
            throw new IllegalArgumentException();
        } else if (this.f31306a == null) {
            this.f31306a = provider;
        } else {
            throw new IllegalStateException();
        }
    }

    public T get() {
        Provider<T> provider = this.f31306a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
