package p389io.reactivex.p393i.p401d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.d.f */
public class C12455f extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: e */
    Subscription f32303e;

    /* renamed from: f */
    long f32304f;

    /* renamed from: g */
    final AtomicReference<Subscription> f32305g = new AtomicReference<>();

    /* renamed from: h */
    final AtomicLong f32306h = new AtomicLong();

    /* renamed from: i */
    final AtomicLong f32307i = new AtomicLong();

    /* renamed from: j */
    final boolean f32308j;

    /* renamed from: k */
    volatile boolean f32309k;

    /* renamed from: l */
    protected boolean f32310l;

    public C12455f(boolean z) {
        this.f32308j = z;
    }

    /* renamed from: a */
    public final void mo36649a(Subscription subscription) {
        if (this.f32309k) {
            subscription.cancel();
            return;
        }
        C12324b.m32836a(subscription, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription subscription2 = (Subscription) this.f32305g.getAndSet(subscription);
            if (subscription2 != null && this.f32308j) {
                subscription2.cancel();
            }
            mo36647a();
            return;
        }
        Subscription subscription3 = this.f32303e;
        if (subscription3 != null && this.f32308j) {
            subscription3.cancel();
        }
        this.f32303e = subscription;
        long j = this.f32304f;
        if (decrementAndGet() != 0) {
            mo36650b();
        }
        if (j != 0) {
            subscription.request(j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo36650b() {
        Subscription subscription = null;
        long j = 0;
        int i = 1;
        do {
            Subscription subscription2 = (Subscription) this.f32305g.get();
            if (subscription2 != null) {
                subscription2 = (Subscription) this.f32305g.getAndSet(null);
            }
            long j2 = this.f32306h.get();
            if (j2 != 0) {
                j2 = this.f32306h.getAndSet(0);
            }
            long j3 = this.f32307i.get();
            if (j3 != 0) {
                j3 = this.f32307i.getAndSet(0);
            }
            Subscription subscription3 = this.f32303e;
            if (this.f32309k) {
                if (subscription3 != null) {
                    subscription3.cancel();
                    this.f32303e = null;
                }
                if (subscription2 != null) {
                    subscription2.cancel();
                }
            } else {
                long j4 = this.f32304f;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C12753c.m33345a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        long j5 = j4 - j3;
                        if (j5 < 0) {
                            C12456g.m32965a(j5);
                            j5 = 0;
                        }
                        j4 = j5;
                    }
                    this.f32304f = j4;
                }
                if (subscription2 != null) {
                    if (subscription3 != null && this.f32308j) {
                        subscription3.cancel();
                    }
                    this.f32303e = subscription2;
                    if (j4 != 0) {
                        j = C12753c.m33345a(j, j4);
                        subscription = subscription2;
                    }
                } else if (!(subscription3 == null || j2 == 0)) {
                    j = C12753c.m33345a(j, j2);
                    subscription = subscription3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            subscription.request(j);
        }
    }

    public void cancel() {
        if (!this.f32309k) {
            this.f32309k = true;
            mo36647a();
        }
    }

    public final void request(long j) {
        if (C12456g.m32971b(j) && !this.f32310l) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12753c.m33346a(this.f32306h, j);
                mo36647a();
                return;
            }
            long j2 = this.f32304f;
            if (j2 != Long.MAX_VALUE) {
                long a = C12753c.m33345a(j2, j);
                this.f32304f = a;
                if (a == Long.MAX_VALUE) {
                    this.f32310l = true;
                }
            }
            Subscription subscription = this.f32303e;
            if (decrementAndGet() != 0) {
                mo36650b();
            }
            if (subscription != null) {
                subscription.request(j);
            }
        }
    }

    /* renamed from: a */
    public final void mo36648a(long j) {
        if (!this.f32310l) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12753c.m33346a(this.f32307i, j);
                mo36647a();
                return;
            }
            long j2 = this.f32304f;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                long j4 = 0;
                if (j3 < 0) {
                    C12456g.m32965a(j3);
                } else {
                    j4 = j3;
                }
                this.f32304f = j4;
            }
            if (decrementAndGet() != 0) {
                mo36650b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36647a() {
        if (getAndIncrement() == 0) {
            mo36650b();
        }
    }
}
