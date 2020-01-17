package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.internal.C13106m;
import kotlinx.coroutines.internal.C13111r;
import kotlinx.coroutines.scheduling.C13145b;
import kotlinx.coroutines.scheduling.TaskContext;

/* renamed from: kotlinx.coroutines.a0 */
public abstract class C13052a0<T> extends C13145b {

    /* renamed from: f */
    public int f33631f;

    public C13052a0(int i) {
        this.f33631f = i;
    }

    /* renamed from: a */
    public final Throwable mo37485a(Object obj) {
        if (!(obj instanceof C13118j)) {
            obj = null;
        }
        C13118j jVar = (C13118j) obj;
        if (jVar != null) {
            return jVar.f33714a;
        }
        return null;
    }

    /* renamed from: a */
    public abstract Continuation<T> mo37486a();

    /* renamed from: a */
    public void mo37487a(Object obj, Throwable th) {
        C12932j.m33818b(th, "cause");
    }

    /* renamed from: b */
    public abstract Object mo37489b();

    /* renamed from: b */
    public <T> T mo37490b(Object obj) {
        return obj;
    }

    public final void run() {
        Object obj;
        CoroutineContext context;
        Object b;
        Object obj2;
        TaskContext taskContext = this.f33750e;
        try {
            Continuation a = mo37486a();
            if (a != null) {
                C13157y yVar = (C13157y) a;
                Continuation<T> continuation = yVar.f33765k;
                context = continuation.getContext();
                Object b2 = mo37489b();
                b = C13111r.m34226b(context, yVar.f33763i);
                Throwable a2 = mo37485a(b2);
                Job job = C13154w0.m34339a(this.f33631f) ? (Job) context.get(Job.f33627d) : null;
                if (a2 == null && job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    mo37487a(b2, (Throwable) cancellationException);
                    C12919a aVar = C12918j.f33499e;
                    Object a3 = C12949k.m33848a(C13106m.m34208a(cancellationException, continuation));
                    C12918j.m33783a(a3);
                    continuation.resumeWith(a3);
                } else if (a2 != null) {
                    C12919a aVar2 = C12918j.f33499e;
                    Object a4 = C12949k.m33848a(C13106m.m34208a(a2, continuation));
                    C12918j.m33783a(a4);
                    continuation.resumeWith(a4);
                } else {
                    Object b3 = mo37490b(b2);
                    C12919a aVar3 = C12918j.f33499e;
                    C12918j.m33783a(b3);
                    continuation.resumeWith(b3);
                }
                C12956q qVar = C12956q.f33541a;
                C13111r.m34225a(context, b);
                try {
                    C12919a aVar4 = C12918j.f33499e;
                    taskContext.afterTask();
                    obj2 = C12956q.f33541a;
                    C12918j.m33783a(obj2);
                } catch (Throwable th) {
                    C12919a aVar5 = C12918j.f33499e;
                    obj2 = C12949k.m33848a(th);
                    C12918j.m33783a(obj2);
                }
                mo37488a((Throwable) null, C12918j.m33784b(obj2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                C12919a aVar6 = C12918j.f33499e;
                taskContext.afterTask();
                obj = C12956q.f33541a;
                C12918j.m33783a(obj);
            } catch (Throwable th3) {
                C12919a aVar7 = C12918j.f33499e;
                obj = C12949k.m33848a(th3);
                C12918j.m33783a(obj);
            }
            mo37488a(th2, C12918j.m33784b(obj));
        }
    }

    /* renamed from: a */
    public final void mo37488a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C12813b.m33495a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fatal exception in coroutines machinery for ");
            sb.append(this);
            sb.append(". ");
            sb.append("Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
            String sb2 = sb.toString();
            if (th != null) {
                C13132q.m34262a(mo37486a().getContext(), (Throwable) new C13147t(sb2, th));
                return;
            }
            C12932j.m33814a();
            throw null;
        }
    }
}
