package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.f */
public final class C13076f {
    /* renamed from: a */
    public static final void m34134a(CancellableContinuation<?> cancellableContinuation, DisposableHandle disposableHandle) {
        C12932j.m33818b(cancellableContinuation, "$this$disposeOnCancellation");
        C12932j.m33818b(disposableHandle, "handle");
        cancellableContinuation.invokeOnCancellation(new C13061b0(disposableHandle));
    }
}
