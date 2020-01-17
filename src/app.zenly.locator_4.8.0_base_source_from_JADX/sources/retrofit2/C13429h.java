package retrofit2;

import okhttp3.C13167a0;
import okhttp3.C13170b0;
import okhttp3.C13317r;

/* renamed from: retrofit2.h */
public final class C13429h<T> {

    /* renamed from: a */
    private final C13167a0 f34825a;

    /* renamed from: b */
    private final T f34826b;

    /* renamed from: c */
    private final C13170b0 f34827c;

    private C13429h(C13167a0 a0Var, T t, C13170b0 b0Var) {
        this.f34825a = a0Var;
        this.f34826b = t;
        this.f34827c = b0Var;
    }

    /* renamed from: a */
    public static <T> C13429h<T> m35546a(T t, C13167a0 a0Var) {
        C13435k.m35594a(a0Var, "rawResponse == null");
        if (a0Var.mo37796g()) {
            return new C13429h<>(a0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: b */
    public int mo38663b() {
        return this.f34825a.mo37793d();
    }

    /* renamed from: c */
    public C13170b0 mo38664c() {
        return this.f34827c;
    }

    /* renamed from: d */
    public C13317r mo38665d() {
        return this.f34825a.mo37795f();
    }

    /* renamed from: e */
    public boolean mo38666e() {
        return this.f34825a.mo37796g();
    }

    /* renamed from: f */
    public String mo38667f() {
        return this.f34825a.mo37797h();
    }

    /* renamed from: g */
    public C13167a0 mo38668g() {
        return this.f34825a;
    }

    public String toString() {
        return this.f34825a.toString();
    }

    /* renamed from: a */
    public static <T> C13429h<T> m35547a(C13170b0 b0Var, C13167a0 a0Var) {
        C13435k.m35594a(b0Var, "body == null");
        C13435k.m35594a(a0Var, "rawResponse == null");
        if (!a0Var.mo37796g()) {
            return new C13429h<>(a0Var, null, b0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: a */
    public T mo38662a() {
        return this.f34826b;
    }
}
