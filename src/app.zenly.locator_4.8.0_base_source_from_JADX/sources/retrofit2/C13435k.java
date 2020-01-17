package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import okhttp3.C13170b0;
import okio.C13342c;

/* renamed from: retrofit2.k */
final class C13435k {

    /* renamed from: a */
    static final Type[] f34882a = new Type[0];

    /* renamed from: retrofit2.k$a */
    private static final class C13436a implements GenericArrayType {

        /* renamed from: e */
        private final Type f34883e;

        C13436a(Type type) {
            this.f34883e = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C13435k.m35603a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f34883e;
        }

        public int hashCode() {
            return this.f34883e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13435k.m35609e(this.f34883e));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: retrofit2.k$b */
    private static final class C13437b implements ParameterizedType {

        /* renamed from: e */
        private final Type f34884e;

        /* renamed from: f */
        private final Type f34885f;

        /* renamed from: g */
        private final Type[] f34886g;

        C13437b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                boolean z = true;
                boolean z2 = type == null;
                if (((Class) type2).getEnclosingClass() != null) {
                    z = false;
                }
                if (z2 != z) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                C13435k.m35594a(type3, "typeArgument == null");
                C13435k.m35602a(type3);
            }
            this.f34884e = type;
            this.f34885f = type2;
            this.f34886g = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C13435k.m35603a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f34886g.clone();
        }

        public Type getOwnerType() {
            return this.f34884e;
        }

        public Type getRawType() {
            return this.f34885f;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f34886g) ^ this.f34885f.hashCode();
            Type type = this.f34884e;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f34886g;
            if (typeArr.length == 0) {
                return C13435k.m35609e(this.f34885f);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C13435k.m35609e(this.f34885f));
            sb.append("<");
            sb.append(C13435k.m35609e(this.f34886g[0]));
            for (int i = 1; i < this.f34886g.length; i++) {
                sb.append(", ");
                sb.append(C13435k.m35609e(this.f34886g[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: retrofit2.k$c */
    private static final class C13438c implements WildcardType {

        /* renamed from: e */
        private final Type f34887e;

        /* renamed from: f */
        private final Type f34888f;

        C13438c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C13435k.m35602a(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f34888f = typeArr2[0];
                        this.f34887e = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                C13435k.m35602a(typeArr[0]);
                this.f34888f = null;
                this.f34887e = typeArr[0];
            } else {
                throw new NullPointerException();
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C13435k.m35603a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f34888f;
            if (type == null) {
                return C13435k.f34882a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f34887e};
        }

        public int hashCode() {
            Type type = this.f34888f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f34887e.hashCode() + 31);
        }

        public String toString() {
            if (this.f34888f != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("? super ");
                sb.append(C13435k.m35609e(this.f34888f));
                return sb.toString();
            } else if (this.f34887e == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("? extends ");
                sb2.append(C13435k.m35609e(this.f34887e));
                return sb2.toString();
            }
        }
    }

    /* renamed from: a */
    static boolean m35603a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m35603a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: b */
    static Type m35606b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m35597a(type, cls, m35596a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    static Class<?> m35607c(Type type) {
        m35594a((T) type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m35607c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m35607c(((WildcardType) type).getUpperBounds()[0]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            sb.append("> is of type ");
            sb.append(type.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    static boolean m35608d(Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type d : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m35608d(d)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m35608d(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            sb.append("> is of type ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    static String m35609e(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: b */
    static Type m35605b(Type type) {
        if (type instanceof ParameterizedType) {
            return m35595a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: a */
    static Type m35596a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m35596a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m35596a(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    private static int m35592a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v23, types: [retrofit2.k$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Type m35597a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m35598a(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m35597a(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            retrofit2.k$a r0 = new retrofit2.k$a
            r0.<init>(r8)
        L_0x002c:
            return r0
        L_0x002d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m35597a(r8, r9, r0)
            if (r0 != r8) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            retrofit2.k$a r10 = new retrofit2.k$a
            r10.<init>(r8)
        L_0x0043:
            return r10
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0087
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m35597a(r8, r9, r0)
            if (r3 == r0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005e:
            if (r2 >= r5) goto L_0x0079
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m35597a(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0076
            if (r0 != 0) goto L_0x0074
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x0074:
            r4[r2] = r6
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0079:
            if (r0 == 0) goto L_0x0085
            retrofit2.k$b r8 = new retrofit2.k$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            goto L_0x0086
        L_0x0085:
            r8 = r10
        L_0x0086:
            return r8
        L_0x0087:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00cb
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00b2
            r3 = r0[r2]
            java.lang.reflect.Type r8 = m35597a(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00cb
            retrofit2.k$c r9 = new retrofit2.k$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00b2:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00cb
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m35597a(r8, r9, r0)     // Catch:{ all -> 0x00cc }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00cb
            retrofit2.k$c r9 = new retrofit2.k$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = f34882a
            r9.<init>(r10, r8)
            return r9
        L_0x00cb:
            return r10
        L_0x00cc:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C13435k.m35597a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: a */
    private static Type m35598a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = m35593a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m35596a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m35592a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    private static Class<?> m35593a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    static void m35602a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    static <T> T m35594a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m35604a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static C13170b0 m35599a(C13170b0 b0Var) throws IOException {
        C13342c cVar = new C13342c();
        b0Var.mo37829f().readAll(cVar);
        return C13170b0.m34432a(b0Var.mo37828e(), b0Var.mo37827d(), cVar);
    }

    /* renamed from: a */
    static <T> void m35600a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: a */
    static Type m35595a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new IllegalArgumentException(sb.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    /* renamed from: a */
    static void m35601a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
