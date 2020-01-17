package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.r */
public final class C12957r<T> implements Lazy<T>, Serializable {

    /* renamed from: e */
    private Function0<? extends T> f33542e;

    /* renamed from: f */
    private Object f33543f = C12955p.f33540a;

    public C12957r(Function0<? extends T> function0) {
        C12932j.m33818b(function0, "initializer");
        this.f33542e = function0;
    }

    private final Object writeReplace() {
        return new C12814c(getValue());
    }

    public T getValue() {
        if (this.f33543f == C12955p.f33540a) {
            Function0<? extends T> function0 = this.f33542e;
            if (function0 != null) {
                this.f33543f = function0.invoke();
                this.f33542e = null;
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
        return this.f33543f;
    }

    public boolean isInitialized() {
        return this.f33543f != C12955p.f33540a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
