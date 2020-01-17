package kotlinx.coroutines.p415c1;

import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C12889f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12922a0;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.c1.b */
public final class C13066b {
    /* renamed from: a */
    public static final <T> void m34086a(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        C12932j.m33818b(function1, "$this$startCoroutineUnintercepted");
        C12932j.m33818b(continuation, "completion");
        C12889f.m33743a(continuation);
        try {
            C12922a0.m33789a((Object) function1, 1);
            Object invoke = function1.invoke(continuation);
            if (invoke != C12882d.m33726a()) {
                C12919a aVar = C12918j.f33499e;
                C12918j.m33783a(invoke);
                continuation.resumeWith(invoke);
            }
        } catch (Throwable th) {
            C12919a aVar2 = C12918j.f33499e;
            Object a = C12949k.m33848a(th);
            C12918j.m33783a(a);
            continuation.resumeWith(a);
        }
    }
}
