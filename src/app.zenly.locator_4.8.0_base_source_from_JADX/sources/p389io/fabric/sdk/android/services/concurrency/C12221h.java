package p389io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.fabric.sdk.android.services.concurrency.h */
public class C12221h implements Dependency<Task>, PriorityProvider, Task {

    /* renamed from: e */
    private final List<Task> f31770e = new ArrayList();

    /* renamed from: f */
    private final AtomicBoolean f31771f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AtomicReference<Throwable> f31772g = new AtomicReference<>(null);

    /* renamed from: a */
    public synchronized void addDependency(Task task) {
        this.f31770e.add(task);
    }

    public boolean areDependenciesMet() {
        for (Task isFinished : getDependencies()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public int compareTo(Object obj) {
        return C12215d.m32354a(this, obj);
    }

    public synchronized Collection<Task> getDependencies() {
        return Collections.unmodifiableCollection(this.f31770e);
    }

    public Throwable getError() {
        return (Throwable) this.f31772g.get();
    }

    public C12215d getPriority() {
        return C12215d.NORMAL;
    }

    public boolean isFinished() {
        return this.f31771f.get();
    }

    public void setError(Throwable th) {
        this.f31772g.set(th);
    }

    public synchronized void setFinished(boolean z) {
        this.f31771f.set(z);
    }

    /* renamed from: a */
    public static boolean m32360a(Object obj) {
        try {
            Dependency dependency = (Dependency) obj;
            Task task = (Task) obj;
            PriorityProvider priorityProvider = (PriorityProvider) obj;
            if (dependency == null || task == null || priorityProvider == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
