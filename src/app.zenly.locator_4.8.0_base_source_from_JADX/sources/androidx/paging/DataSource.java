package androidx.paging;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DataSource<Key, Value> {

    /* renamed from: a */
    private AtomicBoolean f3760a = new AtomicBoolean(false);

    /* renamed from: b */
    private CopyOnWriteArrayList<InvalidatedCallback> f3761b = new CopyOnWriteArrayList<>();

    public interface InvalidatedCallback {
        void onInvalidated();
    }

    /* renamed from: androidx.paging.DataSource$a */
    public static abstract class C1000a<Key, Value> {
        /* renamed from: a */
        public abstract DataSource<Key, Value> mo4806a();
    }

    /* renamed from: androidx.paging.DataSource$b */
    static class C1001b<T> {

        /* renamed from: a */
        final int f3762a;

        /* renamed from: b */
        private final DataSource f3763b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1017a<T> f3764c;

        /* renamed from: d */
        private final Object f3765d = new Object();

        /* renamed from: e */
        private Executor f3766e = null;

        /* renamed from: f */
        private boolean f3767f = false;

        /* renamed from: androidx.paging.DataSource$b$a */
        class C1002a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C1016e f3768e;

            C1002a(C1016e eVar) {
                this.f3768e = eVar;
            }

            public void run() {
                C1001b.this.f3764c.mo4834a(C1001b.this.f3762a, this.f3768e);
            }
        }

        C1001b(DataSource dataSource, int i, Executor executor, C1017a<T> aVar) {
            this.f3763b = dataSource;
            this.f3762a = i;
            this.f3766e = executor;
            this.f3764c = aVar;
        }

        /* renamed from: a */
        static void m4518a(List<?> list, int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.size() + i > i2) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            } else if (list.size() == 0 && i2 > 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4808a(Executor executor) {
            synchronized (this.f3765d) {
                this.f3766e = executor;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4809a() {
            if (!this.f3763b.mo4804c()) {
                return false;
            }
            mo4807a(C1016e.m4553b());
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4807a(C1016e<T> eVar) {
            Executor executor;
            synchronized (this.f3765d) {
                if (!this.f3767f) {
                    this.f3767f = true;
                    executor = this.f3766e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new C1002a(eVar));
            } else {
                this.f3764c.mo4834a(this.f3762a, eVar);
            }
        }
    }

    DataSource() {
    }

    /* renamed from: a */
    public void mo4801a(InvalidatedCallback invalidatedCallback) {
        this.f3761b.add(invalidatedCallback);
    }

    /* renamed from: b */
    public void mo4802b(InvalidatedCallback invalidatedCallback) {
        this.f3761b.remove(invalidatedCallback);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo4803b();

    /* renamed from: c */
    public boolean mo4804c() {
        return this.f3760a.get();
    }

    /* renamed from: a */
    public void mo4800a() {
        if (this.f3760a.compareAndSet(false, true)) {
            Iterator it = this.f3761b.iterator();
            while (it.hasNext()) {
                ((InvalidatedCallback) it.next()).onInvalidated();
            }
        }
    }
}
