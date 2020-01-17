package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.coroutines.jvm.internal.g */
final class C12890g {

    /* renamed from: a */
    private static final C12891a f33462a = new C12891a(null, null, null);

    /* renamed from: b */
    public static C12891a f33463b;

    /* renamed from: c */
    public static final C12890g f33464c = new C12890g();

    /* renamed from: kotlin.coroutines.jvm.internal.g$a */
    private static final class C12891a {

        /* renamed from: a */
        public final Method f33465a;

        /* renamed from: b */
        public final Method f33466b;

        /* renamed from: c */
        public final Method f33467c;

        public C12891a(Method method, Method method2, Method method3) {
            this.f33465a = method;
            this.f33466b = method2;
            this.f33467c = method3;
        }
    }

    private C12890g() {
    }

    /* renamed from: b */
    private final C12891a m33746b(C12884a aVar) {
        try {
            C12891a aVar2 = new C12891a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f33463b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C12891a aVar3 = f33462a;
            f33463b = aVar3;
            return aVar3;
        }
    }

    /* renamed from: a */
    public final String mo37200a(C12884a aVar) {
        C12932j.m33818b(aVar, "continuation");
        C12891a aVar2 = f33463b;
        if (aVar2 == null) {
            aVar2 = m33746b(aVar);
        }
        if (aVar2 == f33462a) {
            return null;
        }
        Method method = aVar2.f33465a;
        if (method != null) {
            Object invoke = method.invoke(aVar.getClass(), new Object[0]);
            if (invoke != null) {
                Method method2 = aVar2.f33466b;
                if (method2 != null) {
                    Object invoke2 = method2.invoke(invoke, new Object[0]);
                    if (invoke2 != null) {
                        Method method3 = aVar2.f33467c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (!(invoke3 instanceof String)) {
                            invoke3 = null;
                        }
                        return (String) invoke3;
                    }
                }
            }
        }
        return null;
    }
}
