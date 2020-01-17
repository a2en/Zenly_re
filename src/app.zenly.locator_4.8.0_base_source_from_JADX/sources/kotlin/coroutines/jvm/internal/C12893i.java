package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.jvm.internal.FunctionBase;

/* renamed from: kotlin.coroutines.jvm.internal.i */
public abstract class C12893i extends C12892h implements FunctionBase<Object>, SuspendFunction {

    /* renamed from: f */
    private final int f33468f;

    public C12893i(int i, Continuation<Object> continuation) {
        super(continuation);
        this.f33468f = i;
    }

    public int getArity() {
        return this.f33468f;
    }

    public String toString() {
        if (mo37188a() != null) {
            return super.toString();
        }
        String a = C12946x.m33832a((FunctionBase) this);
        C12932j.m33815a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
