package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.p413v.C13042b;
import kotlin.reflect.C12976b;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;

/* renamed from: kotlin.jvm.internal.c */
public abstract class C12924c implements KCallable, Serializable {

    /* renamed from: g */
    public static final Object f33503g = C12925a.f33506e;

    /* renamed from: e */
    private transient KCallable f33504e;

    /* renamed from: f */
    protected final Object f33505f;

    /* renamed from: kotlin.jvm.internal.c$a */
    private static class C12925a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static final C12925a f33506e = new C12925a();

        private C12925a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f33506e;
        }
    }

    public C12924c() {
        this(f33503g);
    }

    /* renamed from: a */
    public KCallable mo37238a() {
        KCallable kCallable = this.f33504e;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable b = mo37239b();
        this.f33504e = b;
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract KCallable mo37239b();

    /* renamed from: c */
    public Object mo37240c() {
        return this.f33505f;
    }

    public Object call(Object... objArr) {
        return mo37243e().call(objArr);
    }

    public Object callBy(Map map) {
        return mo37243e().callBy(map);
    }

    /* renamed from: d */
    public KDeclarationContainer mo6620d() {
        throw new AbstractMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public KCallable mo37243e() {
        KCallable a = mo37238a();
        if (a != this) {
            return a;
        }
        throw new C13042b();
    }

    /* renamed from: f */
    public String mo6621f() {
        throw new AbstractMethodError();
    }

    public List<Annotation> getAnnotations() {
        return mo37243e().getAnnotations();
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public List<KParameter> getParameters() {
        return mo37243e().getParameters();
    }

    public KType getReturnType() {
        return mo37243e().getReturnType();
    }

    public List<KTypeParameter> getTypeParameters() {
        return mo37243e().getTypeParameters();
    }

    public C12976b getVisibility() {
        return mo37243e().getVisibility();
    }

    public boolean isAbstract() {
        return mo37243e().isAbstract();
    }

    public boolean isFinal() {
        return mo37243e().isFinal();
    }

    public boolean isOpen() {
        return mo37243e().isOpen();
    }

    public boolean isSuspend() {
        return mo37243e().isSuspend();
    }

    protected C12924c(Object obj) {
        this.f33505f = obj;
    }
}
