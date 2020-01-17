package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

/* renamed from: kotlin.jvm.internal.y */
public class C12947y {
    /* renamed from: a */
    public KDeclarationContainer mo37305a(Class cls, String str) {
        return new C12937o(cls, str);
    }

    /* renamed from: a */
    public KFunction mo37306a(C12931i iVar) {
        return iVar;
    }

    /* renamed from: a */
    public KMutableProperty1 mo37307a(C12934l lVar) {
        return lVar;
    }

    /* renamed from: a */
    public KProperty0 mo37308a(C12938p pVar) {
        return pVar;
    }

    /* renamed from: a */
    public KProperty1 mo37309a(C12940r rVar) {
        return rVar;
    }

    /* renamed from: a */
    public KClass mo37304a(Class cls) {
        return new C12926d(cls);
    }

    /* renamed from: a */
    public String mo37303a(C12933k kVar) {
        return mo37302a((FunctionBase) kVar);
    }

    /* renamed from: a */
    public String mo37302a(FunctionBase functionBase) {
        String obj = functionBase.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
