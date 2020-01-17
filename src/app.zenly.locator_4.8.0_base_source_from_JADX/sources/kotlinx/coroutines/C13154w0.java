package kotlinx.coroutines;

import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.internal.C13106m;
import kotlinx.coroutines.internal.C13111r;

/* renamed from: kotlinx.coroutines.w0 */
public final class C13154w0 {
    /* renamed from: a */
    public static final <T> void m34337a(Continuation<? super T> continuation, T t, int i) {
        C12932j.m33818b(continuation, "$this$resumeMode");
        if (i == 0) {
            C12919a aVar = C12918j.f33499e;
            C12918j.m33783a(t);
            continuation.resumeWith(t);
        } else if (i == 1) {
            C13159z.m34347a(continuation, t);
        } else if (i == 2) {
            C13159z.m34352b(continuation, t);
        } else if (i == 3) {
            C13157y yVar = (C13157y) continuation;
            CoroutineContext context = yVar.getContext();
            Object b = C13111r.m34226b(context, yVar.f33763i);
            try {
                Continuation<T> continuation2 = yVar.f33765k;
                C12919a aVar2 = C12918j.f33499e;
                C12918j.m33783a(t);
                continuation2.resumeWith(t);
                C12956q qVar = C12956q.f33541a;
            } finally {
                C13111r.m34225a(context, b);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: a */
    public static final boolean m34339a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final boolean m34340b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public static final <T> void m34338a(Continuation<? super T> continuation, Throwable th, int i) {
        C12932j.m33818b(continuation, "$this$resumeWithExceptionMode");
        C12932j.m33818b(th, "exception");
        if (i == 0) {
            C12919a aVar = C12918j.f33499e;
            Object a = C12949k.m33848a(th);
            C12918j.m33783a(a);
            continuation.resumeWith(a);
        } else if (i == 1) {
            C13159z.m34348a(continuation, th);
        } else if (i == 2) {
            C13159z.m34353b(continuation, th);
        } else if (i == 3) {
            C13157y yVar = (C13157y) continuation;
            CoroutineContext context = yVar.getContext();
            Object b = C13111r.m34226b(context, yVar.f33763i);
            try {
                Continuation<T> continuation2 = yVar.f33765k;
                C12919a aVar2 = C12918j.f33499e;
                Object a2 = C12949k.m33848a(C13106m.m34208a(th, continuation2));
                C12918j.m33783a(a2);
                continuation2.resumeWith(a2);
                C12956q qVar = C12956q.f33541a;
            } finally {
                C13111r.m34225a(context, b);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
