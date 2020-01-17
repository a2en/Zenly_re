package kotlinx.coroutines.p415c1;

import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.C13159z;

/* renamed from: kotlinx.coroutines.c1.a */
public final class C13065a {
    /* renamed from: a */
    public static final <T> void m34085a(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        C12932j.m33818b(function1, "$this$startCoroutineCancellable");
        C12932j.m33818b(continuation, "completion");
        try {
            C13159z.m34347a(C12877c.m33719a(C12877c.m33720a(function1, continuation)), C12956q.f33541a);
        } catch (Throwable th) {
            C12919a aVar = C12918j.f33499e;
            Object a = C12949k.m33848a(th);
            C12918j.m33783a(a);
            continuation.resumeWith(a);
        }
    }
}
