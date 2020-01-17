package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

/* renamed from: kotlin.jvm.internal.x */
public class C12946x {

    /* renamed from: a */
    private static final C12947y f33529a;

    static {
        C12947y yVar = null;
        try {
            yVar = (C12947y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (yVar == null) {
            yVar = new C12947y();
        }
        f33529a = yVar;
    }

    /* renamed from: a */
    public static KDeclarationContainer m33835a(Class cls, String str) {
        return f33529a.mo37305a(cls, str);
    }

    /* renamed from: a */
    public static KClass m33834a(Class cls) {
        return f33529a.mo37304a(cls);
    }

    /* renamed from: a */
    public static String m33833a(C12933k kVar) {
        return f33529a.mo37303a(kVar);
    }

    /* renamed from: a */
    public static String m33832a(FunctionBase functionBase) {
        return f33529a.mo37302a(functionBase);
    }

    /* renamed from: a */
    public static KFunction m33836a(C12931i iVar) {
        f33529a.mo37306a(iVar);
        return iVar;
    }

    /* renamed from: a */
    public static KProperty0 m33838a(C12938p pVar) {
        f33529a.mo37308a(pVar);
        return pVar;
    }

    /* renamed from: a */
    public static KProperty1 m33839a(C12940r rVar) {
        f33529a.mo37309a(rVar);
        return rVar;
    }

    /* renamed from: a */
    public static KMutableProperty1 m33837a(C12934l lVar) {
        f33529a.mo37307a(lVar);
        return lVar;
    }
}
