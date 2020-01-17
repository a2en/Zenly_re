package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* renamed from: kotlin.jvm.internal.i */
public class C12931i extends C12924c implements FunctionBase, KFunction {

    /* renamed from: h */
    private final int f33514h;

    public C12931i(int i) {
        this.f33514h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public KCallable mo37239b() {
        C12946x.m33836a(this);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a(mo37240c(), r5.mo37240c()) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof kotlin.jvm.internal.C12931i
            r2 = 0
            if (r1 == 0) goto L_0x0053
            kotlin.jvm.internal.i r5 = (kotlin.jvm.internal.C12931i) r5
            kotlin.reflect.KDeclarationContainer r1 = r4.mo6620d()
            if (r1 != 0) goto L_0x0018
            kotlin.reflect.KDeclarationContainer r1 = r5.mo6620d()
            if (r1 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0018:
            kotlin.reflect.KDeclarationContainer r1 = r4.mo6620d()
            kotlin.reflect.KDeclarationContainer r3 = r5.mo6620d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
        L_0x0026:
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r4.mo6621f()
            java.lang.String r3 = r5.mo6621f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r4.mo37240c()
            java.lang.Object r5 = r5.mo37240c()
            boolean r5 = kotlin.jvm.internal.C12932j.m33817a(r1, r5)
            if (r5 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            return r0
        L_0x0053:
            boolean r0 = r5 instanceof kotlin.reflect.KFunction
            if (r0 == 0) goto L_0x0060
            kotlin.reflect.KCallable r0 = r4.mo37238a()
            boolean r5 = r5.equals(r0)
            return r5
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C12931i.equals(java.lang.Object):boolean");
    }

    public int getArity() {
        return this.f33514h;
    }

    public int hashCode() {
        return (((mo6620d() == null ? 0 : mo6620d().hashCode() * 31) + getName().hashCode()) * 31) + mo6621f().hashCode();
    }

    public boolean isExternal() {
        return mo37243e().isExternal();
    }

    public boolean isInfix() {
        return mo37243e().isInfix();
    }

    public boolean isInline() {
        return mo37243e().isInline();
    }

    public boolean isOperator() {
        return mo37243e().isOperator();
    }

    public boolean isSuspend() {
        return mo37243e().isSuspend();
    }

    public String toString() {
        String str;
        KCallable a = mo37238a();
        if (a != this) {
            return a.toString();
        }
        if ("<init>".equals(getName())) {
            str = "constructor (Kotlin reflection is not available)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(getName());
            sb.append(" (Kotlin reflection is not available)");
            str = sb.toString();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public KFunction m33810e() {
        return (KFunction) super.mo37243e();
    }

    public C12931i(int i, Object obj) {
        super(obj);
        this.f33514h = i;
    }
}
