package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.l */
public abstract class C11178l {

    /* renamed from: com.google.gson.internal.l$a */
    static class C11179a extends C11178l {

        /* renamed from: a */
        final /* synthetic */ Method f28913a;

        /* renamed from: b */
        final /* synthetic */ Object f28914b;

        C11179a(Method method, Object obj) {
            this.f28913a = method;
            this.f28914b = obj;
        }

        /* renamed from: a */
        public <T> T mo32569a(Class<T> cls) throws Exception {
            C11178l.m28747b(cls);
            return this.f28913a.invoke(this.f28914b, new Object[]{cls});
        }
    }

    /* renamed from: com.google.gson.internal.l$b */
    static class C11180b extends C11178l {

        /* renamed from: a */
        final /* synthetic */ Method f28915a;

        /* renamed from: b */
        final /* synthetic */ int f28916b;

        C11180b(Method method, int i) {
            this.f28915a = method;
            this.f28916b = i;
        }

        /* renamed from: a */
        public <T> T mo32569a(Class<T> cls) throws Exception {
            C11178l.m28747b(cls);
            return this.f28915a.invoke(null, new Object[]{cls, Integer.valueOf(this.f28916b)});
        }
    }

    /* renamed from: com.google.gson.internal.l$c */
    static class C11181c extends C11178l {

        /* renamed from: a */
        final /* synthetic */ Method f28917a;

        C11181c(Method method) {
            this.f28917a = method;
        }

        /* renamed from: a */
        public <T> T mo32569a(Class<T> cls) throws Exception {
            C11178l.m28747b(cls);
            return this.f28917a.invoke(null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.google.gson.internal.l$d */
    static class C11182d extends C11178l {
        C11182d() {
        }

        /* renamed from: a */
        public <T> T mo32569a(Class<T> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot allocate ");
            sb.append(cls);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: a */
    public static C11178l m28746a() {
        String str = "newInstance";
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C11179a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(str, new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C11180b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(str, new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C11181c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C11182d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m28747b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo32569a(Class<T> cls) throws Exception;
}
