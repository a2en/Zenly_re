package com.google.common.reflect;

import com.google.common.base.C10842e;
import com.google.common.base.C10848g;
import com.google.common.base.C10850i;
import com.google.common.base.C10851j;
import com.google.common.base.Function;
import com.google.common.collect.C10897l0;
import com.google.common.collect.C10904p;
import com.google.common.collect.C10904p.C10905a;
import com.google.common.collect.C10909q;
import com.google.common.collect.C10909q.C10910a;
import com.google.common.collect.C10914s;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;

/* renamed from: com.google.common.reflect.j */
final class C10983j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Function<Type, String> f28552a = new C10984a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C10842e f28553b = C10842e.m27982b(", ").mo31466a("null");

    /* renamed from: com.google.common.reflect.j$a */
    static class C10984a implements Function<Type, String> {
        C10984a() {
        }

        /* renamed from: a */
        public String apply(Type type) {
            return C10991d.f28563i.mo32082b(type);
        }
    }

    /* renamed from: com.google.common.reflect.j$b */
    private enum C10985b {
        OWNED_BY_ENCLOSING_CLASS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Class<?> mo32074a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Class<?> mo32074a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: g */
        static final C10985b f28556g = null;

        /* renamed from: com.google.common.reflect.j$b$b */
        class C10987b<T> {
            C10987b() {
            }
        }

        /* renamed from: com.google.common.reflect.j$b$d */
        static class C10989d extends C10987b<String> {
            C10989d() {
            }
        }

        static {
            f28556g = m28339a();
        }

        /* renamed from: a */
        private static C10985b m28339a() {
            C10985b[] values;
            new C10989d();
            ParameterizedType parameterizedType = (ParameterizedType) C10989d.class.getGenericSuperclass();
            for (C10985b bVar : values()) {
                if (bVar.mo32074a(C10987b.class) == parameterizedType.getOwnerType()) {
                    return bVar;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Class<?> mo32074a(Class<?> cls);
    }

    /* renamed from: com.google.common.reflect.j$c */
    private static final class C10990c implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final Type f28558e;

        C10990c(Type type) {
            this.f28558e = C10991d.f28563i.mo32083c(type);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return C10848g.m28000a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }

        public Type getGenericComponentType() {
            return this.f28558e;
        }

        public int hashCode() {
            return this.f28558e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C10983j.m28337d(this.f28558e));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.reflect.j$d */
    enum C10991d {
        JAVA6 {
            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public Type mo32083c(Type type) {
                C10850i.m28004a(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new C10990c(cls.getComponentType()) : type;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public GenericArrayType m28349a(Type type) {
                return new C10990c(type);
            }
        },
        JAVA7 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Type mo32080a(Type type) {
                if (type instanceof Class) {
                    return C10983j.m28322a((Class) type);
                }
                return new C10990c(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public Type mo32083c(Type type) {
                C10850i.m28004a(type);
                return type;
            }
        },
        JAVA8 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Type mo32080a(Type type) {
                return C10991d.JAVA7.mo32080a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public String mo32082b(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public Type mo32083c(Type type) {
                return C10991d.JAVA7.mo32083c(type);
            }
        },
        JAVA9 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Type mo32080a(Type type) {
                return C10991d.JAVA8.mo32080a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo32081a() {
                return false;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public String mo32082b(Type type) {
                return C10991d.JAVA8.mo32082b(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public Type mo32083c(Type type) {
                return C10991d.JAVA8.mo32083c(type);
            }
        };
        

        /* renamed from: i */
        static final C10991d f28563i = null;

        /* renamed from: com.google.common.reflect.j$d$e */
        static class C10996e extends C10973d<Entry<String, int[][]>> {
            C10996e() {
            }
        }

        /* renamed from: com.google.common.reflect.j$d$f */
        static class C10997f extends C10973d<int[]> {
            C10997f() {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C10904p<Type> mo32079a(Type[] typeArr) {
            C10905a a = C10904p.m28095a();
            for (Type c : typeArr) {
                a.mo31744a(mo32083c(c));
            }
            return a.mo31757a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Type mo32080a(Type type);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32081a() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo32082b(Type type) {
            return C10983j.m28337d(type);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract Type mo32083c(Type type);
    }

    /* renamed from: com.google.common.reflect.j$e */
    static final class C10998e<X> {

        /* renamed from: a */
        static final boolean f28565a;

        static {
            Class<C10998e> cls = C10998e.class;
            f28565a = !cls.getTypeParameters()[0].equals(C10983j.m28327a(cls, "X", new Type[0]));
        }

        C10998e() {
        }
    }

    /* renamed from: com.google.common.reflect.j$f */
    private static final class C10999f implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final Type f28566e;

        /* renamed from: f */
        private final C10904p<Type> f28567f;

        /* renamed from: g */
        private final Class<?> f28568g;

        C10999f(Type type, Class<?> cls, Type[] typeArr) {
            C10850i.m28004a(cls);
            C10850i.m28008a(typeArr.length == cls.getTypeParameters().length);
            C10983j.m28334b(typeArr, "type parameter");
            this.f28566e = type;
            this.f28568g = cls;
            this.f28567f = C10991d.f28563i.mo32079a(typeArr);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (getRawType().equals(parameterizedType.getRawType()) && C10848g.m28000a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                z = true;
            }
            return z;
        }

        public Type[] getActualTypeArguments() {
            return C10983j.m28335b((Collection<Type>) this.f28567f);
        }

        public Type getOwnerType() {
            return this.f28566e;
        }

        public Type getRawType() {
            return this.f28568g;
        }

        public int hashCode() {
            Type type = this.f28566e;
            return ((type == null ? 0 : type.hashCode()) ^ this.f28567f.hashCode()) ^ this.f28568g.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f28566e != null && C10991d.f28563i.mo32081a()) {
                sb.append(C10991d.f28563i.mo32082b(this.f28566e));
                sb.append('.');
            }
            sb.append(this.f28568g.getName());
            sb.append('<');
            sb.append(C10983j.f28553b.mo31469a(C10914s.m28127a((Iterable<F>) this.f28567f, C10983j.f28552a)));
            sb.append('>');
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.reflect.j$g */
    private static final class C11000g<D extends GenericDeclaration> {

        /* renamed from: a */
        private final D f28569a;

        /* renamed from: b */
        private final String f28570b;

        /* renamed from: c */
        private final C10904p<Type> f28571c;

        C11000g(D d, String str, Type[] typeArr) {
            C10983j.m28334b(typeArr, "bound for type variable");
            C10850i.m28004a(d);
            this.f28569a = (GenericDeclaration) d;
            C10850i.m28004a(str);
            this.f28570b = str;
            this.f28571c = C10904p.m28101c(typeArr);
        }

        /* renamed from: a */
        public D mo32090a() {
            return this.f28569a;
        }

        /* renamed from: b */
        public String mo32091b() {
            return this.f28570b;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (C10998e.f28565a) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C11001h)) {
                    return false;
                }
                C11000g a = ((C11001h) Proxy.getInvocationHandler(obj)).f28573a;
                if (!this.f28570b.equals(a.mo32091b()) || !this.f28569a.equals(a.mo32090a()) || !this.f28571c.equals(a.f28571c)) {
                    z = false;
                }
                return z;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f28570b.equals(typeVariable.getName()) || !this.f28569a.equals(typeVariable.getGenericDeclaration())) {
                    z = false;
                }
                return z;
            }
        }

        public int hashCode() {
            return this.f28569a.hashCode() ^ this.f28570b.hashCode();
        }

        public String toString() {
            return this.f28570b;
        }
    }

    /* renamed from: com.google.common.reflect.j$h */
    private static final class C11001h implements InvocationHandler {

        /* renamed from: b */
        private static final C10909q<String, Method> f28572b;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C11000g<?> f28573a;

        static {
            Method[] methods;
            Class<C11000g> cls = C11000g.class;
            C10910a d = C10909q.m28107d();
            for (Method method : cls.getMethods()) {
                if (method.getDeclaringClass().equals(cls)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    d.mo31776a(method.getName(), method);
                }
            }
            f28572b = d.mo31777a();
        }

        C11001h(C11000g<?> gVar) {
            this.f28573a = gVar;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f28572b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f28573a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    /* renamed from: com.google.common.reflect.j$i */
    static final class C11002i implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final C10904p<Type> f28574e;

        /* renamed from: f */
        private final C10904p<Type> f28575f;

        C11002i(Type[] typeArr, Type[] typeArr2) {
            C10983j.m28334b(typeArr, "lower bound for wildcard");
            C10983j.m28334b(typeArr2, "upper bound for wildcard");
            this.f28574e = C10991d.f28563i.mo32079a(typeArr);
            this.f28575f = C10991d.f28563i.mo32079a(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.f28574e.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.f28575f.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            return C10983j.m28335b((Collection<Type>) this.f28574e);
        }

        public Type[] getUpperBounds() {
            return C10983j.m28335b((Collection<Type>) this.f28575f);
        }

        public int hashCode() {
            return this.f28574e.hashCode() ^ this.f28575f.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            C10897l0 it = this.f28574e.iterator();
            while (it.hasNext()) {
                Type type = (Type) it.next();
                sb.append(" super ");
                sb.append(C10991d.f28563i.mo32082b(type));
            }
            for (Type type2 : C10983j.m28331b((Iterable<Type>) this.f28575f)) {
                sb.append(" extends ");
                sb.append(C10991d.f28563i.mo32082b(type2));
            }
            return sb.toString();
        }
    }

    /* renamed from: c */
    static WildcardType m28336c(Type type) {
        return new C11002i(new Type[]{type}, new Type[]{Object.class});
    }

    /* renamed from: d */
    static String m28337d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: b */
    static WildcardType m28333b(Type type) {
        return new C11002i(new Type[0], new Type[]{type});
    }

    /* renamed from: b */
    private static <D extends GenericDeclaration> TypeVariable<D> m28332b(D d, String str, Type[] typeArr) {
        return (TypeVariable) C10972c.m28308a(TypeVariable.class, new C11001h(new C11000g(d, str, typeArr)));
    }

    /* renamed from: a */
    static Type m28326a(Type type) {
        if (!(type instanceof WildcardType)) {
            return C10991d.f28563i.mo32080a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z = true;
        C10850i.m28009a(lowerBounds.length <= 1, (Object) "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m28336c(m28326a(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z = false;
        }
        C10850i.m28009a(z, (Object) "Wildcard should have only one upper bound.");
        return m28333b(m28326a(upperBounds[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Type[] m28335b(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Iterable<Type> m28331b(Iterable<Type> iterable) {
        return C10914s.m28128a(iterable, C10851j.m28022a(C10851j.m28023a(Object.class)));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m28334b(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                C10850i.m28012a(!cls2.isPrimitive(), "Primitive type '%s' used as %s", cls2, str);
            }
        }
    }

    /* renamed from: a */
    static ParameterizedType m28325a(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return m28324a(cls, typeArr);
        }
        C10850i.m28004a(typeArr);
        C10850i.m28011a(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", (Object) cls);
        return new C10999f(type, cls, typeArr);
    }

    /* renamed from: a */
    static ParameterizedType m28324a(Class<?> cls, Type... typeArr) {
        return new C10999f(C10985b.f28556g.mo32074a(cls), cls, typeArr);
    }

    /* renamed from: a */
    static <D extends GenericDeclaration> TypeVariable<D> m28327a(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m28332b(d, str, typeArr);
    }

    /* renamed from: a */
    static Class<?> m28322a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }
}
