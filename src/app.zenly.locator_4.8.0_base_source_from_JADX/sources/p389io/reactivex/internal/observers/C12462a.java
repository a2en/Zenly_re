package p389io.reactivex.internal.observers;

import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.QueueDisposable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.observers.a */
public abstract class C12462a<T, R> implements Observer<T>, QueueDisposable<R> {

    /* renamed from: e */
    protected final Observer<? super R> f32320e;

    /* renamed from: f */
    protected Disposable f32321f;

    /* renamed from: g */
    protected QueueDisposable<T> f32322g;

    /* renamed from: h */
    protected boolean f32323h;

    /* renamed from: i */
    protected int f32324i;

    public C12462a(Observer<? super R> observer) {
        this.f32320e = observer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36668a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36669a(Throwable th) {
        C12285a.m32748b(th);
        this.f32321f.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo36670b() {
        return true;
    }

    public void clear() {
        this.f32322g.clear();
    }

    public void dispose() {
        this.f32321f.dispose();
    }

    public boolean isDisposed() {
        return this.f32321f.isDisposed();
    }

    public boolean isEmpty() {
        return this.f32322g.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f32323h) {
            this.f32323h = true;
            this.f32320e.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f32323h) {
            C12768a.m33415b(th);
            return;
        }
        this.f32323h = true;
        this.f32320e.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (C12458b.m32974a(this.f32321f, disposable)) {
            this.f32321f = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f32322g = (QueueDisposable) disposable;
            }
            if (mo36670b()) {
                this.f32320e.onSubscribe(this);
                mo36668a();
            }
        }
    }

    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo36667a(int i) {
        QueueDisposable<T> queueDisposable = this.f32322g;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = queueDisposable.requestFusion(i);
        if (requestFusion != 0) {
            this.f32324i = requestFusion;
        }
        return requestFusion;
    }
}
