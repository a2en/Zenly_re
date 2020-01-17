package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.m */
final class C12952m<T> implements Lazy<T>, Serializable {

    /* renamed from: e */
    private Function0<? extends T> f33534e;

    /* renamed from: f */
    private volatile Object f33535f;

    /* renamed from: g */
    private final Object f33536g;

    public C12952m(Function0<? extends T> function0, Object obj) {
        C12932j.m33818b(function0, "initializer");
        this.f33534e = function0;
        this.f33535f = C12955p.f33540a;
        if (obj == 0) {
            obj = this;
        }
        this.f33536g = obj;
    }

    private final Object writeReplace() {
        return new C12814c(getValue());
    }

    public T getValue() {
        T t;
        T t2 = this.f33535f;
        if (t2 != C12955p.f33540a) {
            return t2;
        }
        synchronized (this.f33536g) {
            t = this.f33535f;
            if (t == C12955p.f33540a) {
                Function0<? extends T> function0 = this.f33534e;
                if (function0 != null) {
                    t = function0.invoke();
                    this.f33535f = t;
                    this.f33534e = null;
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
        return t;
    }

    public boolean isInitialized() {
        return this.f33535f != C12955p.f33540a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C12952m(Function0 function0, Object obj, int i, C12928f fVar) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(function0, obj);
    }
}
