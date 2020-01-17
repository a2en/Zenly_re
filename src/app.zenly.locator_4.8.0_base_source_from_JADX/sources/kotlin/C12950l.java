package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.l */
final class C12950l<T> implements Lazy<T>, Serializable {

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater<C12950l<?>, Object> f33531g = AtomicReferenceFieldUpdater.newUpdater(C12950l.class, Object.class, "f");

    /* renamed from: e */
    private volatile Function0<? extends T> f33532e;

    /* renamed from: f */
    private volatile Object f33533f = C12955p.f33540a;

    /* renamed from: kotlin.l$a */
    public static final class C12951a {
        private C12951a() {
        }

        public /* synthetic */ C12951a(C12928f fVar) {
            this();
        }
    }

    static {
        new C12951a(null);
    }

    public C12950l(Function0<? extends T> function0) {
        C12932j.m33818b(function0, "initializer");
        this.f33532e = function0;
    }

    private final Object writeReplace() {
        return new C12814c(getValue());
    }

    public T getValue() {
        T t = this.f33533f;
        if (t != C12955p.f33540a) {
            return t;
        }
        Function0<? extends T> function0 = this.f33532e;
        if (function0 != null) {
            T invoke = function0.invoke();
            if (f33531g.compareAndSet(this, C12955p.f33540a, invoke)) {
                this.f33532e = null;
                return invoke;
            }
        }
        return this.f33533f;
    }

    public boolean isInitialized() {
        return this.f33533f != C12955p.f33540a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
