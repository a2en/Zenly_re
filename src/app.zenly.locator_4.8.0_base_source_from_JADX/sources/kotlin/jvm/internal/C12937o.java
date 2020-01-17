package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.p413v.C13042b;
import kotlin.reflect.KCallable;

/* renamed from: kotlin.jvm.internal.o */
public final class C12937o implements ClassBasedDeclarationContainer {

    /* renamed from: e */
    private final Class<?> f33519e;

    public C12937o(Class<?> cls, String str) {
        C12932j.m33818b(cls, "jClass");
        C12932j.m33818b(str, "moduleName");
        this.f33519e = cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12937o) && C12932j.m33817a((Object) getJClass(), (Object) ((C12937o) obj).getJClass());
    }

    public Class<?> getJClass() {
        return this.f33519e;
    }

    public Collection<KCallable<?>> getMembers() {
        throw new C13042b();
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getJClass().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
