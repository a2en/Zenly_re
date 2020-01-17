package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p214e.p222b.p223a.p224a.C7551a;

/* renamed from: androidx.lifecycle.c */
public abstract class C0855c<T> {

    /* renamed from: a */
    final Executor f3448a;

    /* renamed from: b */
    final LiveData<T> f3449b;

    /* renamed from: c */
    final AtomicBoolean f3450c = new AtomicBoolean(true);

    /* renamed from: d */
    final AtomicBoolean f3451d = new AtomicBoolean(false);

    /* renamed from: e */
    final Runnable f3452e = new C0857b();

    /* renamed from: f */
    final Runnable f3453f = new C0858c();

    /* renamed from: androidx.lifecycle.c$a */
    class C0856a extends LiveData<T> {
        C0856a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo4397c() {
            C0855c cVar = C0855c.this;
            cVar.f3448a.execute(cVar.f3452e);
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    class C0857b implements Runnable {
        C0857b() {
        }

        public void run() {
            boolean z;
            do {
                if (C0855c.this.f3451d.compareAndSet(false, true)) {
                    Object obj = null;
                    z = false;
                    while (C0855c.this.f3450c.compareAndSet(true, false)) {
                        try {
                            obj = C0855c.this.mo4425a();
                            z = true;
                        } finally {
                            C0855c.this.f3451d.set(false);
                        }
                    }
                    if (z) {
                        C0855c.this.f3449b.mo4394a(obj);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (C0855c.this.f3450c.get());
        }
    }

    /* renamed from: androidx.lifecycle.c$c */
    class C0858c implements Runnable {
        C0858c() {
        }

        public void run() {
            boolean b = C0855c.this.f3449b.mo4396b();
            if (C0855c.this.f3450c.compareAndSet(false, true) && b) {
                C0855c cVar = C0855c.this;
                cVar.f3448a.execute(cVar.f3452e);
            }
        }
    }

    public C0855c(Executor executor) {
        this.f3448a = executor;
        this.f3449b = new C0856a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo4425a();

    /* renamed from: b */
    public LiveData<T> mo4426b() {
        return this.f3449b;
    }

    /* renamed from: c */
    public void mo4427c() {
        C7551a.m18218c().mo19441b(this.f3453f);
    }
}
