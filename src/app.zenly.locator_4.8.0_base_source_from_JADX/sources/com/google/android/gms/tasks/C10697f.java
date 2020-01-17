package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C10123l;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.f */
public final class C10697f {

    /* renamed from: com.google.android.gms.tasks.f$a */
    private static final class C10698a implements C10699b {

        /* renamed from: a */
        private final CountDownLatch f27794a;

        private C10698a() {
            this.f27794a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo29331a() throws InterruptedException {
            this.f27794a.await();
        }

        public final void onCanceled() {
            this.f27794a.countDown();
        }

        public final void onFailure(Exception exc) {
            this.f27794a.countDown();
        }

        public final void onSuccess(Object obj) {
            this.f27794a.countDown();
        }

        /* renamed from: a */
        public final boolean mo29332a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f27794a.await(j, timeUnit);
        }

        /* synthetic */ C10698a(C10692b0 b0Var) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.tasks.f$b */
    interface C10699b extends OnCanceledListener, OnFailureListener, OnSuccessListener<Object> {
    }

    /* renamed from: a */
    public static <TResult> C10693c<TResult> m27261a(TResult tresult) {
        C10690a0 a0Var = new C10690a0();
        a0Var.mo29312a(tresult);
        return a0Var;
    }

    /* renamed from: b */
    private static <TResult> TResult m27266b(C10693c<TResult> cVar) throws ExecutionException {
        if (cVar.mo29320e()) {
            return cVar.mo29315b();
        }
        if (cVar.mo29318c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(cVar.mo29309a());
    }

    /* renamed from: a */
    public static <TResult> C10693c<TResult> m27260a(Exception exc) {
        C10690a0 a0Var = new C10690a0();
        a0Var.mo29311a(exc);
        return a0Var;
    }

    /* renamed from: a */
    public static <TResult> C10693c<TResult> m27262a(Executor executor, Callable<TResult> callable) {
        C10123l.m25506a(executor, (Object) "Executor must not be null");
        C10123l.m25506a(callable, (Object) "Callback must not be null");
        C10690a0 a0Var = new C10690a0();
        executor.execute(new C10692b0(a0Var, callable));
        return a0Var;
    }

    /* renamed from: a */
    public static <TResult> TResult m27263a(C10693c<TResult> cVar) throws ExecutionException, InterruptedException {
        C10123l.m25508a();
        C10123l.m25506a(cVar, (Object) "Task must not be null");
        if (cVar.mo29319d()) {
            return m27266b(cVar);
        }
        C10698a aVar = new C10698a(null);
        m27265a(cVar, (C10699b) aVar);
        aVar.mo29331a();
        return m27266b(cVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m27264a(C10693c<TResult> cVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C10123l.m25508a();
        C10123l.m25506a(cVar, (Object) "Task must not be null");
        C10123l.m25506a(timeUnit, (Object) "TimeUnit must not be null");
        if (cVar.mo29319d()) {
            return m27266b(cVar);
        }
        C10698a aVar = new C10698a(null);
        m27265a(cVar, (C10699b) aVar);
        if (aVar.mo29332a(j, timeUnit)) {
            return m27266b(cVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    private static void m27265a(C10693c<?> cVar, C10699b bVar) {
        cVar.mo29307a(C10695e.f27792b, (OnSuccessListener<? super TResult>) bVar);
        cVar.mo29306a(C10695e.f27792b, (OnFailureListener) bVar);
        cVar.mo29304a(C10695e.f27792b, (OnCanceledListener) bVar);
    }
}
