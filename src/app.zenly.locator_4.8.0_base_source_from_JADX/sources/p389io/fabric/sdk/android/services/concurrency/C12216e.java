package p389io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p389io.fabric.sdk.android.services.concurrency.C12202a.C12211h;

/* renamed from: io.fabric.sdk.android.services.concurrency.e */
public abstract class C12216e<Params, Progress, Result> extends C12202a<Params, Progress, Result> implements Dependency<Task>, PriorityProvider, Task, DelegateProvider {

    /* renamed from: r */
    private final C12221h f31765r = new C12221h();

    /* renamed from: io.fabric.sdk.android.services.concurrency.e$a */
    private static class C12217a<Result> implements Executor {

        /* renamed from: a */
        private final Executor f31766a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C12216e f31767b;

        /* renamed from: io.fabric.sdk.android.services.concurrency.e$a$a */
        class C12218a extends C12220g<Result> {
            C12218a(Runnable runnable, Object obj) {
                super(runnable, obj);
            }

            public <T extends Dependency<Task> & PriorityProvider & Task> T getDelegate() {
                return C12217a.this.f31767b;
            }
        }

        public C12217a(Executor executor, C12216e eVar) {
            this.f31766a = executor;
            this.f31767b = eVar;
        }

        public void execute(Runnable runnable) {
            this.f31766a.execute(new C12218a(runnable, null));
        }
    }

    /* renamed from: a */
    public final void mo36139a(ExecutorService executorService, Params... paramsArr) {
        super.mo36107a((Executor) new C12217a(executorService, this), paramsArr);
    }

    public boolean areDependenciesMet() {
        return ((Dependency) ((PriorityProvider) getDelegate())).areDependenciesMet();
    }

    public int compareTo(Object obj) {
        return C12215d.m32354a(this, obj);
    }

    public <T extends Dependency<Task> & PriorityProvider & Task> T getDelegate() {
        return this.f31765r;
    }

    public Collection<Task> getDependencies() {
        return ((Dependency) ((PriorityProvider) getDelegate())).getDependencies();
    }

    public Throwable getError() {
        return ((Task) ((PriorityProvider) getDelegate())).getError();
    }

    public boolean isFinished() {
        return ((Task) ((PriorityProvider) getDelegate())).isFinished();
    }

    public void setError(Throwable th) {
        ((Task) ((PriorityProvider) getDelegate())).setError(th);
    }

    public void setFinished(boolean z) {
        ((Task) ((PriorityProvider) getDelegate())).setFinished(z);
    }

    /* renamed from: a */
    public void addDependency(Task task) {
        if (mo36106a() == C12211h.PENDING) {
            ((Dependency) ((PriorityProvider) getDelegate())).addDependency(task);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }
}
