package p389io.reactivex.p404l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p393i.p401d.C12450a;
import p389io.reactivex.p393i.p401d.C12453d;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.l.c */
public final class C12771c<T> extends C12769a<T> {

    /* renamed from: f */
    final C12449c<T> f33308f;

    /* renamed from: g */
    final AtomicReference<Runnable> f33309g;

    /* renamed from: h */
    final boolean f33310h;

    /* renamed from: i */
    volatile boolean f33311i;

    /* renamed from: j */
    Throwable f33312j;

    /* renamed from: k */
    final AtomicReference<Subscriber<? super T>> f33313k;

    /* renamed from: l */
    volatile boolean f33314l;

    /* renamed from: m */
    final AtomicBoolean f33315m;

    /* renamed from: n */
    final C12450a<T> f33316n;

    /* renamed from: o */
    final AtomicLong f33317o;

    /* renamed from: p */
    boolean f33318p;

    /* renamed from: io.reactivex.l.c$a */
    final class C12772a extends C12450a<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        C12772a() {
        }

        public void cancel() {
            if (!C12771c.this.f33314l) {
                C12771c cVar = C12771c.this;
                cVar.f33314l = true;
                cVar.mo36953j();
                C12771c cVar2 = C12771c.this;
                if (!cVar2.f33318p && cVar2.f33316n.getAndIncrement() == 0) {
                    C12771c.this.f33308f.clear();
                    C12771c.this.f33313k.lazySet(null);
                }
            }
        }

        public void clear() {
            C12771c.this.f33308f.clear();
        }

        public boolean isEmpty() {
            return C12771c.this.f33308f.isEmpty();
        }

        public T poll() {
            return C12771c.this.f33308f.poll();
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a(C12771c.this.f33317o, j);
                C12771c.this.mo36954k();
            }
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C12771c.this.f33318p = true;
            return 2;
        }
    }

    C12771c(int i) {
        this(i, null, true);
    }

    /* renamed from: a */
    public static <T> C12771c<T> m33425a(int i) {
        return new C12771c<>(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36951b(Subscriber<? super T> subscriber) {
        C12449c<T> cVar = this.f33308f;
        int i = 1;
        boolean z = !this.f33310h;
        while (!this.f33314l) {
            boolean z2 = this.f33311i;
            if (!z || !z2 || this.f33312j == null) {
                subscriber.onNext(null);
                if (z2) {
                    this.f33313k.lazySet(null);
                    Throwable th = this.f33312j;
                    if (th != null) {
                        subscriber.onError(th);
                    } else {
                        subscriber.onComplete();
                    }
                    return;
                }
                i = this.f33316n.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                cVar.clear();
                this.f33313k.lazySet(null);
                subscriber.onError(this.f33312j);
                return;
            }
        }
        cVar.clear();
        this.f33313k.lazySet(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo36952c(Subscriber<? super T> subscriber) {
        int i;
        long j;
        C12449c<T> cVar = this.f33308f;
        boolean z = !this.f33310h;
        int i2 = 1;
        while (true) {
            long j2 = this.f33317o.get();
            long j3 = 0;
            while (true) {
                i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                if (i == 0) {
                    j = j3;
                    break;
                }
                boolean z2 = this.f33311i;
                Object poll = cVar.poll();
                boolean z3 = poll == null;
                Object obj = poll;
                j = j3;
                if (!mo36950a(z, z2, z3, subscriber, cVar)) {
                    if (z3) {
                        break;
                    }
                    subscriber.onNext(obj);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            Subscriber<? super T> subscriber2 = subscriber;
            if (i == 0) {
                if (mo36950a(z, this.f33311i, cVar.isEmpty(), subscriber, cVar)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                this.f33317o.addAndGet(-j);
            }
            i2 = this.f33316n.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo36953j() {
        Runnable runnable = (Runnable) this.f33309g.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo36954k() {
        if (this.f33316n.getAndIncrement() == 0) {
            int i = 1;
            Subscriber subscriber = (Subscriber) this.f33313k.get();
            while (subscriber == null) {
                i = this.f33316n.addAndGet(-i);
                if (i != 0) {
                    subscriber = (Subscriber) this.f33313k.get();
                } else {
                    return;
                }
            }
            if (this.f33318p) {
                mo36951b(subscriber);
            } else {
                mo36952c(subscriber);
            }
        }
    }

    public void onComplete() {
        if (!this.f33311i && !this.f33314l) {
            this.f33311i = true;
            mo36953j();
            mo36954k();
        }
    }

    public void onError(Throwable th) {
        C12324b.m32836a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f33311i || this.f33314l) {
            C12768a.m33415b(th);
            return;
        }
        this.f33312j = th;
        this.f33311i = true;
        mo36953j();
        mo36954k();
    }

    public void onNext(T t) {
        C12324b.m32836a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f33311i && !this.f33314l) {
            this.f33308f.offer(t);
            mo36954k();
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (this.f33311i || this.f33314l) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    C12771c(int i, Runnable runnable, boolean z) {
        C12324b.m32833a(i, "capacityHint");
        this.f33308f = new C12449c<>(i);
        this.f33309g = new AtomicReference<>(runnable);
        this.f33310h = z;
        this.f33313k = new AtomicReference<>();
        this.f33315m = new AtomicBoolean();
        this.f33316n = new C12772a();
        this.f33317o = new AtomicLong();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36950a(boolean z, boolean z2, boolean z3, Subscriber<? super T> subscriber, C12449c<T> cVar) {
        if (this.f33314l) {
            cVar.clear();
            this.f33313k.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.f33312j != null) {
                cVar.clear();
                this.f33313k.lazySet(null);
                subscriber.onError(this.f33312j);
                return true;
            } else if (z3) {
                Throwable th = this.f33312j;
                this.f33313k.lazySet(null);
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        if (this.f33315m.get() || !this.f33315m.compareAndSet(false, true)) {
            C12453d.m32958a(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
            return;
        }
        subscriber.onSubscribe(this.f33316n);
        this.f33313k.set(subscriber);
        if (this.f33314l) {
            this.f33313k.lazySet(null);
        } else {
            mo36954k();
        }
    }
}
