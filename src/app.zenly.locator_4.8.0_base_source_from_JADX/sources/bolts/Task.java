package bolts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public class Task<TResult> {

    /* renamed from: i */
    private static final Executor f15868i = C6342b.m17439b();

    /* renamed from: j */
    private static volatile UnobservedExceptionHandler f15869j;

    /* renamed from: k */
    private static Task<?> f15870k = new Task<>((TResult) null);

    /* renamed from: l */
    private static Task<Boolean> f15871l = new Task<>((TResult) Boolean.valueOf(true));

    /* renamed from: m */
    private static Task<Boolean> f15872m = new Task<>((TResult) Boolean.valueOf(false));

    /* renamed from: a */
    private final Object f15873a = new Object();

    /* renamed from: b */
    private boolean f15874b;

    /* renamed from: c */
    private boolean f15875c;

    /* renamed from: d */
    private TResult f15876d;

    /* renamed from: e */
    private Exception f15877e;

    /* renamed from: f */
    private boolean f15878f;

    /* renamed from: g */
    private C6347e f15879g;

    /* renamed from: h */
    private List<Continuation<TResult, Void>> f15880h = new ArrayList();

    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    /* renamed from: bolts.Task$a */
    class C6336a implements Continuation<TResult, Void> {

        /* renamed from: a */
        final /* synthetic */ C6346d f15881a;

        /* renamed from: b */
        final /* synthetic */ Continuation f15882b;

        /* renamed from: c */
        final /* synthetic */ Executor f15883c;

        /* renamed from: d */
        final /* synthetic */ C6345c f15884d;

        C6336a(Task task, C6346d dVar, Continuation continuation, Executor executor, C6345c cVar) {
            this.f15881a = dVar;
            this.f15882b = continuation;
            this.f15883c = executor;
            this.f15884d = cVar;
        }

        public Void then(Task<TResult> task) {
            Task.m17422b(this.f15881a, this.f15882b, task, this.f15883c, this.f15884d);
            return null;
        }
    }

    /* renamed from: bolts.Task$b */
    static class C6337b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C6345c f15885e;

        /* renamed from: f */
        final /* synthetic */ C6346d f15886f;

        /* renamed from: g */
        final /* synthetic */ Continuation f15887g;

        /* renamed from: h */
        final /* synthetic */ Task f15888h;

        C6337b(C6345c cVar, C6346d dVar, Continuation continuation, Task task) {
            this.f15885e = cVar;
            this.f15886f = dVar;
            this.f15887g = continuation;
            this.f15888h = task;
        }

        public void run() {
            C6345c cVar = this.f15885e;
            if (cVar == null) {
                try {
                    this.f15886f.mo14196a(this.f15887g.then(this.f15888h));
                } catch (CancellationException unused) {
                    this.f15886f.mo14197b();
                } catch (Exception e) {
                    this.f15886f.mo14195a(e);
                }
            } else {
                cVar.mo14193a();
                throw null;
            }
        }
    }

    /* renamed from: bolts.Task$c */
    static class C6338c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C6345c f15889e;

        /* renamed from: f */
        final /* synthetic */ C6346d f15890f;

        /* renamed from: g */
        final /* synthetic */ Callable f15891g;

        C6338c(C6345c cVar, C6346d dVar, Callable callable) {
            this.f15889e = cVar;
            this.f15890f = dVar;
            this.f15891g = callable;
        }

        public void run() {
            C6345c cVar = this.f15889e;
            if (cVar == null) {
                try {
                    this.f15890f.mo14196a(this.f15891g.call());
                } catch (CancellationException unused) {
                    this.f15890f.mo14197b();
                } catch (Exception e) {
                    this.f15890f.mo14195a(e);
                }
            } else {
                cVar.mo14193a();
                throw null;
            }
        }
    }

    static {
        C6342b.m17438a();
        C6339a.m17437b();
        new Task(true);
    }

    Task() {
    }

    /* renamed from: g */
    public static UnobservedExceptionHandler m17423g() {
        return f15869j;
    }

    /* renamed from: h */
    private void m17424h() {
        synchronized (this.f15873a) {
            for (Continuation then : this.f15880h) {
                try {
                    then.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f15880h = null;
        }
    }

    /* renamed from: b */
    public TResult mo14183b() {
        TResult tresult;
        synchronized (this.f15873a) {
            tresult = this.f15876d;
        }
        return tresult;
    }

    /* renamed from: c */
    public boolean mo14184c() {
        boolean z;
        synchronized (this.f15873a) {
            z = this.f15875c;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo14185d() {
        boolean z;
        synchronized (this.f15873a) {
            z = this.f15874b;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo14186e() {
        boolean z;
        synchronized (this.f15873a) {
            z = mo14180a() != null;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo14187f() {
        synchronized (this.f15873a) {
            if (this.f15874b) {
                return false;
            }
            this.f15874b = true;
            this.f15875c = true;
            this.f15873a.notifyAll();
            m17424h();
            return true;
        }
    }

    /* renamed from: a */
    public Exception mo14180a() {
        Exception exc;
        synchronized (this.f15873a) {
            if (this.f15877e != null) {
                this.f15878f = true;
                if (this.f15879g != null) {
                    this.f15879g.mo14201a();
                    this.f15879g = null;
                }
            }
            exc = this.f15877e;
        }
        return exc;
    }

    private Task(TResult tresult) {
        mo14182a(tresult);
    }

    /* renamed from: b */
    public static <TResult> Task<TResult> m17421b(TResult tresult) {
        if (tresult == null) {
            return f15870k;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? f15871l : f15872m;
        }
        C6346d dVar = new C6346d();
        dVar.mo14196a(tresult);
        return dVar.mo14194a();
    }

    private Task(boolean z) {
        if (z) {
            mo14187f();
        } else {
            mo14182a((TResult) null);
        }
    }

    /* renamed from: a */
    public static <TResult> Task<TResult> m17417a(Callable<TResult> callable, Executor executor) {
        return m17418a(callable, executor, (C6345c) null);
    }

    /* renamed from: b */
    public static <TResult> Task<TResult> m17420b(Exception exc) {
        C6346d dVar = new C6346d();
        dVar.mo14195a(exc);
        return dVar.mo14194a();
    }

    /* renamed from: a */
    public static <TResult> Task<TResult> m17418a(Callable<TResult> callable, Executor executor, C6345c cVar) {
        C6346d dVar = new C6346d();
        try {
            executor.execute(new C6338c(cVar, dVar, callable));
        } catch (Exception e) {
            dVar.mo14195a((Exception) new ExecutorException(e));
        }
        return dVar.mo14194a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <TContinuationResult, TResult> void m17422b(C6346d<TContinuationResult> dVar, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, C6345c cVar) {
        try {
            executor.execute(new C6337b(cVar, dVar, continuation, task));
        } catch (Exception e) {
            dVar.mo14195a((Exception) new ExecutorException(e));
        }
    }

    /* renamed from: a */
    public <TContinuationResult> Task<TContinuationResult> mo14179a(Continuation<TResult, TContinuationResult> continuation, Executor executor, C6345c cVar) {
        boolean d;
        C6346d dVar = new C6346d();
        synchronized (this.f15873a) {
            d = mo14185d();
            if (!d) {
                List<Continuation<TResult, Void>> list = this.f15880h;
                C6336a aVar = new C6336a(this, dVar, continuation, executor, cVar);
                list.add(aVar);
            }
        }
        if (d) {
            m17422b(dVar, continuation, this, executor, cVar);
        }
        return dVar.mo14194a();
    }

    /* renamed from: a */
    public <TContinuationResult> Task<TContinuationResult> mo14178a(Continuation<TResult, TContinuationResult> continuation) {
        return mo14179a(continuation, f15868i, (C6345c) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo14182a(TResult tresult) {
        synchronized (this.f15873a) {
            if (this.f15874b) {
                return false;
            }
            this.f15874b = true;
            this.f15876d = tresult;
            this.f15873a.notifyAll();
            m17424h();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14181a(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f15873a
            monitor-enter(r0)
            boolean r1 = r3.f15874b     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f15874b = r1     // Catch:{ all -> 0x002c }
            r3.f15877e = r4     // Catch:{ all -> 0x002c }
            r3.f15878f = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f15873a     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.m17424h()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f15878f     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            bolts.Task$UnobservedExceptionHandler r4 = m17423g()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            bolts.e r4 = new bolts.e     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f15879g = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.Task.mo14181a(java.lang.Exception):boolean");
    }
}
