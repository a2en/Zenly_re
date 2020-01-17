package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.internal.C13106m;
import kotlinx.coroutines.internal.C13107n;
import kotlinx.coroutines.internal.C13111r;

/* renamed from: kotlinx.coroutines.z */
public final class C13159z {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13107n f33768a = new C13107n("UNDEFINED");

    /* renamed from: b */
    public static final <T> void m34352b(Continuation<? super T> continuation, T t) {
        C12932j.m33818b(continuation, "$this$resumeDirect");
        if (continuation instanceof C13157y) {
            Continuation<T> continuation2 = ((C13157y) continuation).f33765k;
            C12919a aVar = C12918j.f33499e;
            C12918j.m33783a(t);
            continuation2.resumeWith(t);
            return;
        }
        C12919a aVar2 = C12918j.f33499e;
        C12918j.m33783a(t);
        continuation.resumeWith(t);
    }

    /* renamed from: a */
    private static final void m34349a(C13052a0<?> a0Var) {
        C13069d0 a = C13160z0.f33770b.mo37696a();
        if (a.mo37541b()) {
            a.mo37538a(a0Var);
            return;
        }
        a.mo37540b(true);
        try {
            m34351a(a0Var, a0Var.mo37486a(), 3);
            do {
            } while (a.mo37543d());
        } catch (Throwable th) {
            a.mo37539a(true);
            throw th;
        }
        a.mo37539a(true);
    }

    /* renamed from: b */
    public static final <T> void m34353b(Continuation<? super T> continuation, Throwable th) {
        C12932j.m33818b(continuation, "$this$resumeDirectWithException");
        C12932j.m33818b(th, "exception");
        if (continuation instanceof C13157y) {
            Continuation<T> continuation2 = ((C13157y) continuation).f33765k;
            C12919a aVar = C12918j.f33499e;
            Object a = C12949k.m33848a(C13106m.m34208a(th, continuation2));
            C12918j.m33783a(a);
            continuation2.resumeWith(a);
            return;
        }
        C12919a aVar2 = C12918j.f33499e;
        Object a2 = C12949k.m33848a(C13106m.m34208a(th, continuation));
        C12918j.m33783a(a2);
        continuation.resumeWith(a2);
    }

    /* renamed from: a */
    public static final <T> void m34347a(Continuation<? super T> continuation, T t) {
        boolean z;
        CoroutineContext context;
        Object b;
        C12932j.m33818b(continuation, "$this$resumeCancellable");
        if (continuation instanceof C13157y) {
            C13157y yVar = (C13157y) continuation;
            if (yVar.f33764j.mo37496a(yVar.getContext())) {
                yVar.f33761g = t;
                yVar.f33631f = 1;
                yVar.f33764j.mo37495a(yVar.getContext(), yVar);
                return;
            }
            C13069d0 a = C13160z0.f33770b.mo37696a();
            if (a.mo37541b()) {
                yVar.f33761g = t;
                yVar.f33631f = 1;
                a.mo37538a((C13052a0<?>) yVar);
                return;
            }
            a.mo37540b(true);
            try {
                Job job = (Job) yVar.getContext().get(Job.f33627d);
                if (job == null || job.isActive()) {
                    z = false;
                } else {
                    CancellationException cancellationException = job.getCancellationException();
                    C12919a aVar = C12918j.f33499e;
                    Object a2 = C12949k.m33848a((Throwable) cancellationException);
                    C12918j.m33783a(a2);
                    yVar.resumeWith(a2);
                    z = true;
                }
                if (!z) {
                    context = yVar.getContext();
                    b = C13111r.m34226b(context, yVar.f33763i);
                    Continuation<T> continuation2 = yVar.f33765k;
                    C12919a aVar2 = C12918j.f33499e;
                    C12918j.m33783a(t);
                    continuation2.resumeWith(t);
                    C12956q qVar = C12956q.f33541a;
                    C13111r.m34225a(context, b);
                }
                do {
                } while (a.mo37543d());
            } catch (Throwable th) {
                try {
                    yVar.mo37488a(th, (Throwable) null);
                } catch (Throwable th2) {
                    a.mo37539a(true);
                    throw th2;
                }
            }
            a.mo37539a(true);
            return;
        }
        C12919a aVar3 = C12918j.f33499e;
        C12918j.m33783a(t);
        continuation.resumeWith(t);
    }

    /* renamed from: a */
    public static final <T> void m34348a(Continuation<? super T> continuation, Throwable th) {
        CoroutineContext context;
        Object b;
        C12932j.m33818b(continuation, "$this$resumeCancellableWithException");
        C12932j.m33818b(th, "exception");
        if (continuation instanceof C13157y) {
            C13157y yVar = (C13157y) continuation;
            CoroutineContext context2 = yVar.f33765k.getContext();
            boolean z = false;
            C13118j jVar = new C13118j(th, false, 2, null);
            if (yVar.f33764j.mo37496a(context2)) {
                yVar.f33761g = new C13118j(th, false, 2, null);
                yVar.f33631f = 1;
                yVar.f33764j.mo37495a(context2, yVar);
                return;
            }
            C13069d0 a = C13160z0.f33770b.mo37696a();
            if (a.mo37541b()) {
                yVar.f33761g = jVar;
                yVar.f33631f = 1;
                a.mo37538a((C13052a0<?>) yVar);
                return;
            }
            a.mo37540b(true);
            try {
                Job job = (Job) yVar.getContext().get(Job.f33627d);
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    C12919a aVar = C12918j.f33499e;
                    Object a2 = C12949k.m33848a((Throwable) cancellationException);
                    C12918j.m33783a(a2);
                    yVar.resumeWith(a2);
                    z = true;
                }
                if (!z) {
                    context = yVar.getContext();
                    b = C13111r.m34226b(context, yVar.f33763i);
                    Continuation<T> continuation2 = yVar.f33765k;
                    C12919a aVar2 = C12918j.f33499e;
                    Object a3 = C12949k.m33848a(C13106m.m34208a(th, continuation2));
                    C12918j.m33783a(a3);
                    continuation2.resumeWith(a3);
                    C12956q qVar = C12956q.f33541a;
                    C13111r.m34225a(context, b);
                }
                do {
                } while (a.mo37543d());
            } catch (Throwable th2) {
                try {
                    yVar.mo37488a(th2, (Throwable) null);
                } catch (Throwable th3) {
                    a.mo37539a(true);
                    throw th3;
                }
            }
            a.mo37539a(true);
            return;
        }
        C12919a aVar3 = C12918j.f33499e;
        Object a4 = C12949k.m33848a(C13106m.m34208a(th, continuation));
        C12918j.m33783a(a4);
        continuation.resumeWith(a4);
    }

    /* renamed from: a */
    public static final <T> void m34350a(C13052a0<? super T> a0Var, int i) {
        C12932j.m33818b(a0Var, "$this$dispatch");
        Continuation a = a0Var.mo37486a();
        if (!C13154w0.m34340b(i) || !(a instanceof C13157y) || C13154w0.m34339a(i) != C13154w0.m34339a(a0Var.f33631f)) {
            m34351a(a0Var, a, i);
            return;
        }
        C13128o oVar = ((C13157y) a).f33764j;
        CoroutineContext context = a.getContext();
        if (oVar.mo37496a(context)) {
            oVar.mo37495a(context, a0Var);
        } else {
            m34349a(a0Var);
        }
    }

    /* renamed from: a */
    public static final <T> void m34351a(C13052a0<? super T> a0Var, Continuation<? super T> continuation, int i) {
        C12932j.m33818b(a0Var, "$this$resume");
        C12932j.m33818b(continuation, "delegate");
        Object b = a0Var.mo37489b();
        Throwable a = a0Var.mo37485a(b);
        if (a != null) {
            if (!(continuation instanceof C13052a0)) {
                a = C13106m.m34208a(a, continuation);
            }
            C13154w0.m34338a(continuation, a, i);
            return;
        }
        C13154w0.m34337a(continuation, a0Var.mo37490b(b), i);
    }
}
