package androidx.paging;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.paging.f */
public abstract class C1018f<T> extends AbstractList<T> {

    /* renamed from: e */
    final Executor f3820e;

    /* renamed from: f */
    final Executor f3821f;

    /* renamed from: g */
    final C1021c<T> f3822g;

    /* renamed from: h */
    final C1024f f3823h;

    /* renamed from: i */
    final C1028h<T> f3824i;

    /* renamed from: j */
    int f3825j = 0;

    /* renamed from: k */
    T f3826k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f3827l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f3828m = false;

    /* renamed from: n */
    private int f3829n = Integer.MAX_VALUE;

    /* renamed from: o */
    private int f3830o = Integer.MIN_VALUE;

    /* renamed from: p */
    private final AtomicBoolean f3831p = new AtomicBoolean(false);

    /* renamed from: q */
    private final ArrayList<WeakReference<C1023e>> f3832q = new ArrayList<>();

    /* renamed from: androidx.paging.f$a */
    class C1019a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ boolean f3833e;

        /* renamed from: f */
        final /* synthetic */ boolean f3834f;

        /* renamed from: g */
        final /* synthetic */ boolean f3835g;

        C1019a(boolean z, boolean z2, boolean z3) {
            this.f3833e = z;
            this.f3834f = z2;
            this.f3835g = z3;
        }

        public void run() {
            if (this.f3833e) {
                C1018f.this.f3822g.mo4856a();
            }
            if (this.f3834f) {
                C1018f.this.f3827l = true;
            }
            if (this.f3835g) {
                C1018f.this.f3828m = true;
            }
            C1018f.this.m4558a(false);
        }
    }

    /* renamed from: androidx.paging.f$b */
    class C1020b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ boolean f3837e;

        /* renamed from: f */
        final /* synthetic */ boolean f3838f;

        C1020b(boolean z, boolean z2) {
            this.f3837e = z;
            this.f3838f = z2;
        }

        public void run() {
            C1018f.this.m4559a(this.f3837e, this.f3838f);
        }
    }

    /* renamed from: androidx.paging.f$c */
    public static abstract class C1021c<T> {
        /* renamed from: a */
        public abstract void mo4856a();

        /* renamed from: a */
        public abstract void mo4857a(T t);

        /* renamed from: b */
        public abstract void mo4858b(T t);
    }

    /* renamed from: androidx.paging.f$d */
    public static final class C1022d<Key, Value> {

        /* renamed from: a */
        private final DataSource<Key, Value> f3840a;

        /* renamed from: b */
        private final C1024f f3841b;

        /* renamed from: c */
        private Executor f3842c;

        /* renamed from: d */
        private Executor f3843d;

        /* renamed from: e */
        private C1021c f3844e;

        /* renamed from: f */
        private Key f3845f;

        public C1022d(DataSource<Key, Value> dataSource, C1024f fVar) {
            if (dataSource == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (fVar != null) {
                this.f3840a = dataSource;
                this.f3841b = fVar;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }

        /* renamed from: a */
        public C1022d<Key, Value> mo4861a(Executor executor) {
            this.f3843d = executor;
            return this;
        }

        /* renamed from: b */
        public C1022d<Key, Value> mo4863b(Executor executor) {
            this.f3842c = executor;
            return this;
        }

        /* renamed from: a */
        public C1022d<Key, Value> mo4859a(C1021c cVar) {
            this.f3844e = cVar;
            return this;
        }

        /* renamed from: a */
        public C1022d<Key, Value> mo4860a(Key key) {
            this.f3845f = key;
            return this;
        }

        /* renamed from: a */
        public C1018f<Value> mo4862a() {
            Executor executor = this.f3842c;
            if (executor != null) {
                Executor executor2 = this.f3843d;
                if (executor2 != null) {
                    return C1018f.m4561b(this.f3840a, executor, executor2, this.f3844e, this.f3841b, this.f3845f);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }
    }

    /* renamed from: androidx.paging.f$e */
    public static abstract class C1023e {
        /* renamed from: a */
        public abstract void mo4815a(int i, int i2);

        /* renamed from: b */
        public abstract void mo4816b(int i, int i2);
    }

    /* renamed from: androidx.paging.f$f */
    public static class C1024f {

        /* renamed from: a */
        public final int f3846a;

        /* renamed from: b */
        public final int f3847b;

        /* renamed from: c */
        public final boolean f3848c;

        /* renamed from: d */
        public final int f3849d;

        /* renamed from: androidx.paging.f$f$a */
        public static final class C1025a {

            /* renamed from: a */
            private int f3850a = -1;

            /* renamed from: b */
            private int f3851b = -1;

            /* renamed from: c */
            private int f3852c = -1;

            /* renamed from: d */
            private boolean f3853d = true;

            /* renamed from: a */
            public C1025a mo4865a(boolean z) {
                this.f3853d = z;
                return this;
            }

            /* renamed from: b */
            public C1025a mo4867b(int i) {
                this.f3850a = i;
                return this;
            }

            /* renamed from: c */
            public C1025a mo4868c(int i) {
                this.f3851b = i;
                return this;
            }

            /* renamed from: a */
            public C1025a mo4864a(int i) {
                this.f3852c = i;
                return this;
            }

            /* renamed from: a */
            public C1024f mo4866a() {
                int i = this.f3850a;
                if (i >= 1) {
                    if (this.f3851b < 0) {
                        this.f3851b = i;
                    }
                    if (this.f3852c < 0) {
                        this.f3852c = this.f3850a * 3;
                    }
                    if (this.f3853d || this.f3851b != 0) {
                        C1024f fVar = new C1024f(this.f3850a, this.f3851b, this.f3853d, this.f3852c, null);
                        return fVar;
                    }
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }
        }

        /* synthetic */ C1024f(int i, int i2, boolean z, int i3, C1019a aVar) {
            this(i, i2, z, i3);
        }

        private C1024f(int i, int i2, boolean z, int i3) {
            this.f3846a = i;
            this.f3847b = i2;
            this.f3848c = z;
            this.f3849d = i3;
        }
    }

    C1018f(C1028h<T> hVar, Executor executor, Executor executor2, C1021c<T> cVar, C1024f fVar) {
        this.f3824i = hVar;
        this.f3820e = executor;
        this.f3821f = executor2;
        this.f3822g = cVar;
        this.f3823h = fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo4827a(C1018f<T> fVar, C1023e eVar);

    /* renamed from: b */
    public abstract DataSource<?, T> mo4828b();

    /* renamed from: c */
    public abstract Object mo4831c();

    /* renamed from: d */
    public int mo4847d() {
        return this.f3824i.mo4889i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract void mo4832d(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4848e(int i) {
        this.f3825j += i;
        this.f3829n += i;
        this.f3830o += i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract boolean mo4833e();

    /* renamed from: f */
    public boolean mo4849f() {
        return this.f3831p.get();
    }

    /* renamed from: g */
    public boolean mo4850g() {
        return mo4849f();
    }

    public T get(int i) {
        T t = this.f3824i.get(i);
        if (t != null) {
            this.f3826k = t;
        }
        return t;
    }

    /* renamed from: h */
    public List<T> mo4852h() {
        if (mo4850g()) {
            return this;
        }
        return new C1041k(this);
    }

    public int size() {
        return this.f3824i.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <K, T> C1018f<T> m4561b(DataSource<K, T> dataSource, Executor executor, Executor executor2, C1021c<T> cVar, C1024f fVar, K k) {
        int i;
        if (dataSource.mo4803b() || !fVar.f3848c) {
            if (!dataSource.mo4803b()) {
                dataSource = ((C1033j) dataSource).mo4909d();
                if (k != null) {
                    i = ((Integer) k).intValue();
                    C1009c cVar2 = new C1009c((C1008b) dataSource, executor, executor2, cVar, fVar, k, i);
                    return cVar2;
                }
            }
            i = -1;
            C1009c cVar22 = new C1009c((C1008b) dataSource, executor, executor2, cVar, fVar, k, i);
            return cVar22;
        }
        C1042l lVar = new C1042l((C1033j) dataSource, executor, executor2, cVar, fVar, k != null ? ((Integer) k).intValue() : 0);
        return lVar;
    }

    /* renamed from: c */
    public void mo4845c(int i) {
        this.f3825j = mo4847d() + i;
        mo4832d(i);
        this.f3829n = Math.min(this.f3829n, i);
        this.f3830o = Math.max(this.f3830o, i);
        m4558a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4843a(boolean z, boolean z2, boolean z3) {
        if (this.f3822g != null) {
            if (this.f3829n == Integer.MAX_VALUE) {
                this.f3829n = this.f3824i.size();
            }
            if (this.f3830o == Integer.MIN_VALUE) {
                this.f3830o = 0;
            }
            if (z || z2 || z3) {
                this.f3820e.execute(new C1019a(z, z2, z3));
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4846c(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f3832q.size() - 1; size >= 0; size--) {
                C1023e eVar = (C1023e) ((WeakReference) this.f3832q.get(size)).get();
                if (eVar != null) {
                    eVar.mo4816b(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4558a(boolean z) {
        boolean z2 = true;
        boolean z3 = this.f3827l && this.f3829n <= this.f3823h.f3847b;
        if (!this.f3828m || this.f3830o < (size() - 1) - this.f3823h.f3847b) {
            z2 = false;
        }
        if (z3 || z2) {
            if (z3) {
                this.f3827l = false;
            }
            if (z2) {
                this.f3828m = false;
            }
            if (z) {
                this.f3820e.execute(new C1020b(z3, z2));
            } else {
                m4559a(z3, z2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4844b(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f3832q.size() - 1; size >= 0; size--) {
                C1023e eVar = (C1023e) ((WeakReference) this.f3832q.get(size)).get();
                if (eVar != null) {
                    eVar.mo4815a(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4559a(boolean z, boolean z2) {
        if (z) {
            this.f3822g.mo4858b(this.f3824i.mo4882c());
        }
        if (z2) {
            this.f3822g.mo4857a(this.f3824i.mo4883d());
        }
    }

    /* renamed from: a */
    public void mo4840a() {
        this.f3831p.set(true);
    }

    /* renamed from: a */
    public void mo4842a(List<T> list, C1023e eVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                mo4827a((C1018f) list, eVar);
            } else if (!this.f3824i.isEmpty()) {
                eVar.mo4816b(0, this.f3824i.size());
            }
        }
        for (int size = this.f3832q.size() - 1; size >= 0; size--) {
            if (((C1023e) ((WeakReference) this.f3832q.get(size)).get()) == null) {
                this.f3832q.remove(size);
            }
        }
        this.f3832q.add(new WeakReference(eVar));
    }

    /* renamed from: a */
    public void mo4841a(C1023e eVar) {
        for (int size = this.f3832q.size() - 1; size >= 0; size--) {
            C1023e eVar2 = (C1023e) ((WeakReference) this.f3832q.get(size)).get();
            if (eVar2 == null || eVar2 == eVar) {
                this.f3832q.remove(size);
            }
        }
    }
}
