package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import java.util.Map.Entry;
import p214e.p222b.p223a.p224a.C7551a;
import p214e.p222b.p223a.p225b.C7558b;

public abstract class LiveData<T> {

    /* renamed from: j */
    static final Object f3411j = new Object();

    /* renamed from: a */
    final Object f3412a;

    /* renamed from: b */
    private C7558b<Observer<? super T>, C0844b> f3413b;

    /* renamed from: c */
    int f3414c;

    /* renamed from: d */
    private volatile Object f3415d;

    /* renamed from: e */
    volatile Object f3416e;

    /* renamed from: f */
    private int f3417f;

    /* renamed from: g */
    private boolean f3418g;

    /* renamed from: h */
    private boolean f3419h;

    /* renamed from: i */
    private final Runnable f3420i;

    class LifecycleBoundObserver extends C0844b implements LifecycleEventObserver {

        /* renamed from: i */
        final LifecycleOwner f3421i;

        LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f3421i = lifecycleOwner;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4400a(LifecycleOwner lifecycleOwner) {
            return this.f3421i == lifecycleOwner;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4401b() {
            return this.f3421i.getLifecycle().mo4445a().mo4448a(C0864b.STARTED);
        }

        public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
            if (this.f3421i.getLifecycle().mo4445a() == C0864b.DESTROYED) {
                LiveData.this.mo4393a(this.f3424e);
            } else {
                mo4403a(mo4401b());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4399a() {
            this.f3421i.getLifecycle().mo4447b(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0843a implements Runnable {
        C0843a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3412a) {
                obj = LiveData.this.f3416e;
                LiveData.this.f3416e = LiveData.f3411j;
            }
            LiveData.this.mo4395b(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private abstract class C0844b {

        /* renamed from: e */
        final Observer<? super T> f3424e;

        /* renamed from: f */
        boolean f3425f;

        /* renamed from: g */
        int f3426g = -1;

        C0844b(Observer<? super T> observer) {
            this.f3424e = observer;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4399a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4403a(boolean z) {
            if (z != this.f3425f) {
                this.f3425f = z;
                int i = 1;
                boolean z2 = LiveData.this.f3414c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f3414c;
                if (!this.f3425f) {
                    i = -1;
                }
                liveData.f3414c = i2 + i;
                if (z2 && this.f3425f) {
                    LiveData.this.mo4397c();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f3414c == 0 && !this.f3425f) {
                    liveData2.mo4398d();
                }
                if (this.f3425f) {
                    LiveData.this.mo4392a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4400a(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo4401b();
    }

    public LiveData(T t) {
        this.f3412a = new Object();
        this.f3413b = new C7558b<>();
        this.f3414c = 0;
        this.f3416e = f3411j;
        this.f3420i = new C0843a();
        this.f3415d = t;
        this.f3417f = 0;
    }

    /* renamed from: b */
    private void m3979b(C0844b bVar) {
        if (bVar.f3425f) {
            if (!bVar.mo4401b()) {
                bVar.mo4403a(false);
                return;
            }
            int i = bVar.f3426g;
            int i2 = this.f3417f;
            if (i < i2) {
                bVar.f3426g = i2;
                bVar.f3424e.onChanged(this.f3415d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4392a(C0844b bVar) {
        if (this.f3418g) {
            this.f3419h = true;
            return;
        }
        this.f3418g = true;
        do {
            this.f3419h = false;
            if (bVar == null) {
                C7562d b = this.f3413b.mo19449b();
                while (b.hasNext()) {
                    m3979b((C0844b) ((Entry) b.next()).getValue());
                    if (this.f3419h) {
                        break;
                    }
                }
            } else {
                m3979b(bVar);
                bVar = null;
            }
        } while (this.f3419h);
        this.f3418g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4397c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4398d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4395b(T t) {
        m3978a("setValue");
        this.f3417f++;
        this.f3415d = t;
        mo4392a(null);
    }

    public LiveData() {
        this.f3412a = new Object();
        this.f3413b = new C7558b<>();
        this.f3414c = 0;
        this.f3416e = f3411j;
        this.f3420i = new C0843a();
        this.f3415d = f3411j;
        this.f3417f = -1;
    }

    /* renamed from: b */
    public boolean mo4396b() {
        return this.f3414c > 0;
    }

    /* renamed from: a */
    public void mo4391a(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        m3978a("observe");
        if (lifecycleOwner.getLifecycle().mo4445a() != C0864b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
            C0844b bVar = (C0844b) this.f3413b.mo19443b(observer, lifecycleBoundObserver);
            if (bVar != null && !bVar.mo4400a(lifecycleOwner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (bVar == null) {
                lifecycleOwner.getLifecycle().mo4446a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo4393a(Observer<? super T> observer) {
        m3978a("removeObserver");
        C0844b bVar = (C0844b) this.f3413b.remove(observer);
        if (bVar != null) {
            bVar.mo4399a();
            bVar.mo4403a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4394a(T t) {
        boolean z;
        synchronized (this.f3412a) {
            z = this.f3416e == f3411j;
            this.f3416e = t;
        }
        if (z) {
            C7551a.m18218c().mo19437c(this.f3420i);
        }
    }

    /* renamed from: a */
    public T mo4390a() {
        T t = this.f3415d;
        if (t != f3411j) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    static void m3978a(String str) {
        if (!C7551a.m18218c().mo19436a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
