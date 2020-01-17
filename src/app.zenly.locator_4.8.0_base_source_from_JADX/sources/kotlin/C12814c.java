package kotlin;

import java.io.Serializable;

/* renamed from: kotlin.c */
public final class C12814c<T> implements Lazy<T>, Serializable {

    /* renamed from: e */
    private final T f33409e;

    public C12814c(T t) {
        this.f33409e = t;
    }

    public T getValue() {
        return this.f33409e;
    }

    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
