package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.m */
public class C12935m extends C12934l {

    /* renamed from: h */
    private final KDeclarationContainer f33516h;

    /* renamed from: i */
    private final String f33517i;

    /* renamed from: j */
    private final String f33518j;

    public C12935m(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f33516h = kDeclarationContainer;
        this.f33517i = str;
        this.f33518j = str2;
    }

    /* renamed from: d */
    public KDeclarationContainer mo6620d() {
        return this.f33516h;
    }

    /* renamed from: f */
    public String mo6621f() {
        return this.f33518j;
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public String getName() {
        return this.f33517i;
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
