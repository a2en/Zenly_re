package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import kotlin.p413v.C13041a;
import kotlin.p413v.C13042b;
import kotlin.reflect.C12976b;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;

/* renamed from: kotlin.jvm.internal.d */
public final class C12926d implements KClass<Object>, ClassBasedDeclarationContainer {

    /* renamed from: e */
    private final Class<?> f33507e;

    public C12926d(Class<?> cls) {
        C12932j.m33818b(cls, "jClass");
        this.f33507e = cls;
    }

    /* renamed from: a */
    private final Void m33802a() {
        throw new C13042b();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12926d) && C12932j.m33817a((Object) C13041a.m34049b(this), (Object) C13041a.m34049b((KClass) obj));
    }

    public List<Annotation> getAnnotations() {
        m33802a();
        throw null;
    }

    public Collection<KFunction<Object>> getConstructors() {
        m33802a();
        throw null;
    }

    public Class<?> getJClass() {
        return this.f33507e;
    }

    public Collection<KCallable<?>> getMembers() {
        m33802a();
        throw null;
    }

    public Collection<KClass<?>> getNestedClasses() {
        m33802a();
        throw null;
    }

    public Object getObjectInstance() {
        m33802a();
        throw null;
    }

    public String getQualifiedName() {
        m33802a();
        throw null;
    }

    public List<KClass<? extends Object>> getSealedSubclasses() {
        m33802a();
        throw null;
    }

    public String getSimpleName() {
        m33802a();
        throw null;
    }

    public List<KType> getSupertypes() {
        m33802a();
        throw null;
    }

    public List<KTypeParameter> getTypeParameters() {
        m33802a();
        throw null;
    }

    public C12976b getVisibility() {
        m33802a();
        throw null;
    }

    public int hashCode() {
        return C13041a.m34049b(this).hashCode();
    }

    public boolean isAbstract() {
        m33802a();
        throw null;
    }

    public boolean isCompanion() {
        m33802a();
        throw null;
    }

    public boolean isData() {
        m33802a();
        throw null;
    }

    public boolean isFinal() {
        m33802a();
        throw null;
    }

    public boolean isInner() {
        m33802a();
        throw null;
    }

    public boolean isInstance(Object obj) {
        m33802a();
        throw null;
    }

    public boolean isOpen() {
        m33802a();
        throw null;
    }

    public boolean isSealed() {
        m33802a();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getJClass().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
