package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Element.C12865a;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineExceptionHandler.C13046a;
import kotlinx.coroutines.selects.SelectClause0;

public interface Job extends Element {

    /* renamed from: d */
    public static final C13049b f33627d = C13049b.f33628a;

    /* renamed from: kotlinx.coroutines.Job$a */
    public static final class C13048a {
        /* renamed from: a */
        public static <R> R m34058a(Job job, R r, Function2<? super R, ? super Element, ? extends R> function2) {
            C12932j.m33818b(function2, "operation");
            return C12865a.m33704a(job, r, function2);
        }

        /* renamed from: a */
        public static <E extends Element> E m34059a(Job job, Key<E> key) {
            C12932j.m33818b(key, "key");
            return C12865a.m33705a((Element) job, key);
        }

        /* renamed from: a */
        public static CoroutineContext m34060a(Job job, CoroutineContext coroutineContext) {
            C12932j.m33818b(coroutineContext, "context");
            return C12865a.m33706a((Element) job, coroutineContext);
        }

        /* renamed from: a */
        public static Job m34062a(Job job, Job job2) {
            C12932j.m33818b(job2, "other");
            return job2;
        }

        /* renamed from: a */
        public static /* synthetic */ void m34064a(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                job.cancel(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static CoroutineContext m34065b(Job job, Key<?> key) {
            C12932j.m33818b(key, "key");
            return C12865a.m33707b(job, key);
        }

        /* renamed from: a */
        public static /* synthetic */ DisposableHandle m34061a(Job job, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return job.invokeOnCompletion(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
    }

    /* renamed from: kotlinx.coroutines.Job$b */
    public static final class C13049b implements Key<Job> {

        /* renamed from: a */
        static final /* synthetic */ C13049b f33628a = new C13049b();

        static {
            C13046a aVar = CoroutineExceptionHandler.f33625c;
        }

        private C13049b() {
        }
    }

    ChildHandle attachChild(ChildJob childJob);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    Sequence<Job> getChildren();

    SelectClause0 getOnJoin();

    DisposableHandle invokeOnCompletion(Function1<? super Throwable, C12956q> function1);

    DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, C12956q> function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation<? super C12956q> continuation);

    Job plus(Job job);

    boolean start();
}
