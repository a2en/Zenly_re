package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.v0 */
public final class C13152v0 implements DisposableHandle, ChildHandle {

    /* renamed from: e */
    public static final C13152v0 f33756e = new C13152v0();

    private C13152v0() {
    }

    public boolean childCancelled(Throwable th) {
        C12932j.m33818b(th, "cause");
        return false;
    }

    public void dispose() {
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
