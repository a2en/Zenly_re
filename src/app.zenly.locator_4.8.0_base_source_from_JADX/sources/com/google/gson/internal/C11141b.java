package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.b */
public final class C11141b {

    /* renamed from: a */
    static final Type[] f28853a = new Type[0];

    /* renamed from: com.google.gson.internal.b$a */
    private static final class C11142a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final Type f28854e;

        public C11142a(Type type) {
            this.f28854e = C11141b.m28691b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C11141b.m28690a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f28854e;
        }

        public int hashCode() {
            return this.f28854e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C11141b.m28699h(this.f28854e));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    private static final class C11143b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final Type f28855e;

        /* renamed from: f */
        private final Type f28856f;

        /* renamed from: g */
        private final Type[] f28857g;

        public C11143b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C11140a.m28678a(z);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C11141b.m28691b(type);
            }
            this.f28855e = type3;
            this.f28856f = C11141b.m28691b(type2);
            this.f28857g = (Type[]) typeArr.clone();
            int length = this.f28857g.length;
            for (int i = 0; i < length; i++) {
                C11140a.m28677a(this.f28857g[i]);
                C11141b.m28694c(this.f28857g[i]);
                Type[] typeArr2 = this.f28857g;
                typeArr2[i] = C11141b.m28691b(typeArr2[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C11141b.m28690a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f28857g.clone();
        }

        public Type getOwnerType() {
            return this.f28855e;
        }

        public Type getRawType() {
            return this.f28856f;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f28857g) ^ this.f28856f.hashCode()) ^ C11141b.m28679a((Object) this.f28855e);
        }

        public String toString() {
            int length = this.f28857g.length;
            if (length == 0) {
                return C11141b.m28699h(this.f28856f);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C11141b.m28699h(this.f28856f));
            sb.append("<");
            sb.append(C11141b.m28699h(this.f28857g[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C11141b.m28699h(this.f28857g[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.b$c */
    private static final class C11144c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final Type f28858e;

        /* renamed from: f */
        private final Type f28859f;

        public C11144c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C11140a.m28678a(typeArr2.length <= 1);
            C11140a.m28678a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C11140a.m28677a(typeArr2[0]);
                C11141b.m28694c(typeArr2[0]);
                if (typeArr[0] != cls) {
                    z = false;
                }
                C11140a.m28678a(z);
                this.f28859f = C11141b.m28691b(typeArr2[0]);
                this.f28858e = cls;
                return;
            }
            C11140a.m28677a(typeArr[0]);
            C11141b.m28694c(typeArr[0]);
            this.f28859f = null;
            this.f28858e = C11141b.m28691b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C11141b.m28690a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f28859f;
            if (type == null) {
                return C11141b.f28853a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f28858e};
        }

        public int hashCode() {
            Type type = this.f28859f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f28858e.hashCode() + 31);
        }

        public String toString() {
            if (this.f28859f != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("? super ");
                sb.append(C11141b.m28699h(this.f28859f));
                return sb.toString();
            } else if (this.f28858e == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("? extends ");
                sb2.append(C11141b.m28699h(this.f28858e));
                return sb2.toString();
            }
        }
    }

    /* renamed from: a */
    public static ParameterizedType m28683a(Type type, Type type2, Type... typeArr) {
        return new C11143b(type, type2, typeArr);
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m28691b(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m28691b(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            return r3
        L_0x001b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0033
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.b$b r0 = new com.google.gson.internal.b$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0033:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0043
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0043:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0057
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.b$c r0 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C11141b.m28691b(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: c */
    static void m28694c(Type type) {
        C11140a.m28678a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    public static Type m28695d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: e */
    public static Class<?> m28696e(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C11140a.m28678a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m28696e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m28696e(((WildcardType) type).getUpperBounds()[0]);
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

    /* renamed from: f */
    public static WildcardType m28697f(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C11144c(typeArr, f28853a);
    }

    /* renamed from: g */
    public static WildcardType m28698g(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C11144c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: h */
    public static String m28699h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    public static GenericArrayType m28682a(Type type) {
        return new C11142a(type);
    }

    /* renamed from: a */
    static boolean m28689a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m28690a(Type type, Type type2) {
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
            if (!m28689a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m28690a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    static Type m28692b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C11140a.m28678a(cls2.isAssignableFrom(cls));
        return m28686a(type, cls, m28685a(type, cls, cls2));
    }

    /* renamed from: b */
    public static Type[] m28693b(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = m28692b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: a */
    static int m28679a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    static Type m28685a(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m28685a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m28685a(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static Type m28684a(Type type, Class<?> cls) {
        Type b = m28692b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: a */
    public static Type m28686a(Type type, Class<?> cls, Type type2) {
        return m28687a(type, cls, type2, new HashSet());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19, types: [java.lang.Class] */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r10v11, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.reflect.Type, code=null, for r10v0, types: [java.lang.reflect.Type] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v11, types: [java.lang.reflect.Type]
      assigns: [java.lang.reflect.Type, java.lang.reflect.WildcardType]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.reflect.Type, ?[OBJECT, ARRAY], java.lang.reflect.WildcardType]
      mth insns count: 84
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m28687a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m28688a(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m28687a(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = m28682a(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m28687a(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = m28682a(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008b
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m28687a(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m28687a(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008a
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = m28683a(r3, r8, r4)
        L_0x008a:
            return r10
        L_0x008b:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bd
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ab
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m28687a(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bd
            java.lang.reflect.WildcardType r8 = m28698g(r8)
            return r8
        L_0x00ab:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bd
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m28687a(r8, r9, r0, r11)     // Catch:{ all -> 0x00be }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bd
            java.lang.reflect.WildcardType r8 = m28697f(r8)
            return r8
        L_0x00bd:
            return r10
        L_0x00be:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C11141b.m28687a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: a */
    static Type m28688a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = m28681a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m28685a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m28680a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    private static int m28680a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m28681a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }
}
