package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;

public final class CompletionHandlerException extends RuntimeException {
    public CompletionHandlerException(String str, Throwable th) {
        C12932j.m33818b(str, "message");
        C12932j.m33818b(th, "cause");
        super(str, th);
    }
}
