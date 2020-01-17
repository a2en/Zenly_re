package kotlinx.coroutines.android;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.C13148t0;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Delay.C13047a;
import kotlinx.coroutines.DisposableHandle;

/* renamed from: kotlinx.coroutines.android.b */
public abstract class C13058b extends C13148t0 implements Delay {
    private C13058b() {
    }

    public Object delay(long j, Continuation<? super C12956q> continuation) {
        return C13047a.m34056a((Delay) this, j, continuation);
    }

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable) {
        C12932j.m33818b(runnable, "block");
        return C13047a.m34057a((Delay) this, j, runnable);
    }

    public /* synthetic */ C13058b(C12928f fVar) {
        this();
    }
}
