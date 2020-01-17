package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.t */
public final class C13147t extends Error {
    public C13147t(String str, Throwable th) {
        C12932j.m33818b(str, "message");
        C12932j.m33818b(th, "cause");
        super(str, th);
    }
}
