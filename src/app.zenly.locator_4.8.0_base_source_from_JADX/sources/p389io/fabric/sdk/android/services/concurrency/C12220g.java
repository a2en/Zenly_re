package p389io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: io.fabric.sdk.android.services.concurrency.g */
public class C12220g<V> extends FutureTask<V> implements Dependency<Task>, PriorityProvider, Task, DelegateProvider {

    /* renamed from: e */
    final Object f31769e;

    public C12220g(Callable<V> callable) {
        super(callable);
        this.f31769e = mo36142a((Object) callable);
    }

    /* renamed from: a */
    public void addDependency(Task task) {
        ((Dependency) ((PriorityProvider) getDelegate())).addDependency(task);
    }

    public boolean areDependenciesMet() {
        return ((Dependency) ((PriorityProvider) getDelegate())).areDependenciesMet();
    }

    public int compareTo(Object obj) {
        return ((PriorityProvider) getDelegate()).compareTo(obj);
    }

    public <T extends Dependency<Task> & PriorityProvider & Task> T getDelegate() {
        return (Dependency) this.f31769e;
    }

    public Collection<Task> getDependencies() {
        return ((Dependency) ((PriorityProvider) getDelegate())).getDependencies();
    }

    public Throwable getError() {
        return ((Task) ((PriorityProvider) getDelegate())).getError();
    }

    public C12215d getPriority() {
        return ((PriorityProvider) getDelegate()).getPriority();
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends Dependency<Task> & PriorityProvider & Task> T mo36142a(Object obj) {
        if (C12221h.m32360a(obj)) {
            return (Dependency) obj;
        }
        return new C12221h();
    }

    public C12220g(Runnable runnable, V v) {
        super(runnable, v);
        this.f31769e = mo36142a((Object) runnable);
    }
}
