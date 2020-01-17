package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.s */
public class C12941s extends C12940r {

    /* renamed from: h */
    private final KDeclarationContainer f33523h;

    /* renamed from: i */
    private final String f33524i;

    /* renamed from: j */
    private final String f33525j;

    public C12941s(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f33523h = kDeclarationContainer;
        this.f33524i = str;
        this.f33525j = str2;
    }

    /* renamed from: d */
    public KDeclarationContainer mo6620d() {
        return this.f33523h;
    }

    /* renamed from: f */
    public String mo6621f() {
        return this.f33525j;
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public String getName() {
        return this.f33524i;
    }
}
