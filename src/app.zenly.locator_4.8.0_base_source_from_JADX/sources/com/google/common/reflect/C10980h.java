package com.google.common.reflect;

import com.google.common.base.C10850i;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.common.reflect.h */
public abstract class C10980h<T> extends C10973d<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* renamed from: e */
    private final Type f28551e;

    /* renamed from: com.google.common.reflect.h$a */
    private static final class C10981a<T> extends C10980h<T> {
        private static final long serialVersionUID = 0;

        C10981a(Type type) {
            super(type, null);
        }
    }

    /* synthetic */ C10980h(Type type, C10979g gVar) {
        this(type);
    }

    /* renamed from: a */
    public static C10980h<?> m28320a(Type type) {
        return new C10981a(type);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10980h)) {
            return false;
        }
        return this.f28551e.equals(((C10980h) obj).f28551e);
    }

    public int hashCode() {
        return this.f28551e.hashCode();
    }

    public String toString() {
        return C10983j.m28337d(this.f28551e);
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return m28320a(new C10975f().mo32063a(this.f28551e));
    }

    protected C10980h() {
        this.f28551e = mo32062a();
        Type type = this.f28551e;
        C10850i.m28018b(!(type instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", (Object) type);
    }

    private C10980h(Type type) {
        C10850i.m28004a(type);
        this.f28551e = type;
    }
}
