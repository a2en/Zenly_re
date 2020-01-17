package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.q */
public class C12939q extends C12938p {

    /* renamed from: h */
    private final KDeclarationContainer f33520h;

    /* renamed from: i */
    private final String f33521i;

    /* renamed from: j */
    private final String f33522j;

    public C12939q(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f33520h = kDeclarationContainer;
        this.f33521i = str;
        this.f33522j = str2;
    }

    /* renamed from: d */
    public KDeclarationContainer mo6620d() {
        return this.f33520h;
    }

    /* renamed from: f */
    public String mo6621f() {
        return this.f33522j;
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public String getName() {
        return this.f33521i;
    }
}
