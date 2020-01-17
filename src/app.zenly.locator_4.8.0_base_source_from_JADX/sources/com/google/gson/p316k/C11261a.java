package com.google.gson.p316k;

import com.google.gson.internal.C11140a;
import com.google.gson.internal.C11141b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.k.a */
public class C11261a<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    protected C11261a() {
        this.type = getSuperclassTypeParameter(getClass());
        this.rawType = C11141b.m28696e(this.type);
        this.hashCode = this.type.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb.append(name.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static C11261a<?> get(Type type2) {
        return new C11261a<>(type2);
    }

    public static C11261a<?> getArray(Type type2) {
        return new C11261a<>(C11141b.m28682a(type2));
    }

    public static C11261a<?> getParameterized(Type type2, Type... typeArr) {
        return new C11261a<>(C11141b.m28683a((Type) null, type2, typeArr));
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C11141b.m28691b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        return type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11261a) && C11141b.m28690a(this.type, ((C11261a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return C11141b.m28699h(this.type);
    }

    public static <T> C11261a<T> get(Class<T> cls) {
        return new C11261a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type2) {
        boolean z = false;
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(C11141b.m28696e(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) type3, new HashMap());
        }
        if (type3 instanceof GenericArrayType) {
            if (this.rawType.isAssignableFrom(C11141b.m28696e(type2)) && isAssignableFrom(type2, (GenericArrayType) this.type)) {
                z = true;
            }
            return z;
        }
        throw buildUnexpectedTypeError(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    C11261a(Type type2) {
        C11140a.m28677a(type2);
        this.type = C11141b.m28691b(type2);
        this.rawType = C11141b.m28696e(this.type);
        this.hashCode = this.type.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(C11261a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }

    private static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        } else if (type2 instanceof Class) {
            r1 = (Class) type2;
            while (r1.isArray()) {
                r1 = r1.getComponentType();
            }
            type2 = r1;
        }
        return isAssignableFrom(type2, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class e = C11141b.m28696e(type2);
        ParameterizedType parameterizedType2 = null;
        if (type2 instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type2;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = e.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type3 = actualTypeArguments[i];
                TypeVariable typeVariable = typeParameters[i];
                while (type3 instanceof TypeVariable) {
                    type3 = (Type) map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type isAssignableFrom : e.getGenericInterfaces()) {
            if (isAssignableFrom(isAssignableFrom, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(e.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }
}
