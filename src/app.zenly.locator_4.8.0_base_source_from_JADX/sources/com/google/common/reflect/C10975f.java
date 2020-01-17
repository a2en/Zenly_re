package com.google.common.reflect;

import com.google.common.base.C10848g;
import com.google.common.base.C10850i;
import com.google.common.collect.C10909q;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: com.google.common.reflect.f */
public final class C10975f {

    /* renamed from: a */
    private final C10976a f28546a;

    /* renamed from: com.google.common.reflect.f$a */
    private static class C10976a {

        /* renamed from: a */
        private final C10909q<C10978b, Type> f28547a = C10909q.m28108e();

        /* renamed from: com.google.common.reflect.f$a$a */
        class C10977a extends C10976a {

            /* renamed from: b */
            final /* synthetic */ TypeVariable f28548b;

            /* renamed from: c */
            final /* synthetic */ C10976a f28549c;

            C10977a(C10976a aVar, TypeVariable typeVariable, C10976a aVar2) {
                this.f28548b = typeVariable;
                this.f28549c = aVar2;
            }

            /* renamed from: a */
            public Type mo32065a(TypeVariable<?> typeVariable, C10976a aVar) {
                if (typeVariable.getGenericDeclaration().equals(this.f28548b.getGenericDeclaration())) {
                    return typeVariable;
                }
                return this.f28549c.mo32065a(typeVariable, aVar);
            }
        }

        C10976a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Type mo32064a(TypeVariable<?> typeVariable) {
            return mo32065a(typeVariable, new C10977a(this, typeVariable, this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Type mo32065a(TypeVariable<?> typeVariable, C10976a aVar) {
            Type type = (Type) this.f28547a.get(new C10978b(typeVariable));
            if (type != null) {
                return new C10975f(aVar, null).mo32063a(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a = new C10975f(aVar, null).m28314a(bounds);
            if (!C10998e.f28565a || !Arrays.equals(bounds, a)) {
                return C10983j.m28327a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
            }
            return typeVariable;
        }
    }

    /* renamed from: com.google.common.reflect.f$b */
    static final class C10978b {

        /* renamed from: a */
        private final TypeVariable<?> f28550a;

        C10978b(TypeVariable<?> typeVariable) {
            C10850i.m28004a(typeVariable);
            this.f28550a = typeVariable;
        }

        /* renamed from: a */
        private boolean m28319a(TypeVariable<?> typeVariable) {
            return this.f28550a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f28550a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10978b) {
                return m28319a(((C10978b) obj).f28550a);
            }
            return false;
        }

        public int hashCode() {
            return C10848g.m27999a(this.f28550a.getGenericDeclaration(), this.f28550a.getName());
        }

        public String toString() {
            return this.f28550a.toString();
        }
    }

    /* synthetic */ C10975f(C10976a aVar, C10974e eVar) {
        this(aVar);
    }

    public C10975f() {
        this.f28546a = new C10976a();
    }

    /* renamed from: a */
    public Type mo32063a(Type type) {
        C10850i.m28004a(type);
        if (type instanceof TypeVariable) {
            return this.f28546a.mo32064a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m28310a((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m28311a((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            type = m28312a((WildcardType) type);
        }
        return type;
    }

    private C10975f(C10976a aVar) {
        this.f28546a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Type[] m28314a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo32063a(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: a */
    private WildcardType m28312a(WildcardType wildcardType) {
        return new C11002i(m28314a(wildcardType.getLowerBounds()), m28314a(wildcardType.getUpperBounds()));
    }

    /* renamed from: a */
    private Type m28311a(GenericArrayType genericArrayType) {
        return C10983j.m28326a(mo32063a(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: a */
    private ParameterizedType m28310a(ParameterizedType parameterizedType) {
        Type type;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            type = null;
        } else {
            type = mo32063a(ownerType);
        }
        return C10983j.m28325a(type, (Class) mo32063a(parameterizedType.getRawType()), m28314a(parameterizedType.getActualTypeArguments()));
    }
}
