package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.k */
public abstract class C12933k<R> implements FunctionBase<R>, Serializable {

    /* renamed from: e */
    private final int f33515e;

    public C12933k(int i) {
        this.f33515e = i;
    }

    public int getArity() {
        return this.f33515e;
    }

    public String toString() {
        String a = C12946x.m33833a(this);
        C12932j.m33815a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
