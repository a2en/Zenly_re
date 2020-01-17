package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12461e;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.internal.util.C12760i;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.i.b.b.c */
public final class C12348c<T> extends C12272c<T> {

    /* renamed from: f */
    final MaybeSource<? extends T>[] f32055f;

    /* renamed from: io.reactivex.i.b.b.c$a */
    static final class C12349a<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {
        private static final long serialVersionUID = 3520831347801429610L;

        /* renamed from: e */
        final Subscriber<? super T> f32056e;

        /* renamed from: f */
        final AtomicLong f32057f = new AtomicLong();

        /* renamed from: g */
        final AtomicReference<Object> f32058g = new AtomicReference<>(C12760i.COMPLETE);

        /* renamed from: h */
        final C12461e f32059h = new C12461e();

        /* renamed from: i */
        final MaybeSource<? extends T>[] f32060i;

        /* renamed from: j */
        int f32061j;

        /* renamed from: k */
        long f32062k;

        C12349a(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f32056e = subscriber;
            this.f32060i = maybeSourceArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36587a() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.f32058g;
                Subscriber<? super T> subscriber = this.f32056e;
                C12461e eVar = this.f32059h;
                while (!eVar.isDisposed()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        boolean z = true;
                        if (obj != C12760i.COMPLETE) {
                            long j = this.f32062k;
                            if (j != this.f32057f.get()) {
                                this.f32062k = j + 1;
                                atomicReference.lazySet(null);
                                subscriber.onNext(obj);
                            } else {
                                z = false;
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (z && !eVar.isDisposed()) {
                            int i = this.f32061j;
                            MaybeSource<? extends T>[] maybeSourceArr = this.f32060i;
                            if (i == maybeSourceArr.length) {
                                subscriber.onComplete();
                                return;
                            } else {
                                this.f32061j = i + 1;
                                maybeSourceArr[i].subscribe(this);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        public void cancel() {
            this.f32059h.dispose();
        }

        public void onComplete() {
            this.f32058g.lazySet(C12760i.COMPLETE);
            mo36587a();
        }

        public void onError(Throwable th) {
            this.f32056e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32059h.mo36653a(disposable);
        }

        public void onSuccess(T t) {
            this.f32058g.lazySet(t);
            mo36587a();
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a(this.f32057f, j);
                mo36587a();
            }
        }
    }

    public C12348c(MaybeSource<? extends T>[] maybeSourceArr) {
        this.f32055f = maybeSourceArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        C12349a aVar = new C12349a(subscriber, this.f32055f);
        subscriber.onSubscribe(aVar);
        aVar.mo36587a();
    }
}
