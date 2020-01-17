package p389io.reactivex.internal.observers;

import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.util.C12766l;
import p389io.reactivex.internal.util.ObservableQueueDrain;

/* renamed from: io.reactivex.internal.observers.n */
public abstract class C12475n<T, U, V> extends C12477p implements Observer<T>, ObservableQueueDrain<U, V> {

    /* renamed from: f */
    protected final Observer<? super V> f32347f;

    /* renamed from: g */
    protected final SimplePlainQueue<U> f32348g;

    /* renamed from: h */
    protected volatile boolean f32349h;

    /* renamed from: i */
    protected volatile boolean f32350i;

    /* renamed from: j */
    protected Throwable f32351j;

    public C12475n(Observer<? super V> observer, SimplePlainQueue<U> simplePlainQueue) {
        this.f32347f = observer;
        this.f32348g = simplePlainQueue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36678a(U u, boolean z, Disposable disposable) {
        Observer<? super V> observer = this.f32347f;
        SimplePlainQueue<U> simplePlainQueue = this.f32348g;
        if (this.f32352e.get() != 0 || !this.f32352e.compareAndSet(0, 1)) {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        } else {
            accept(observer, u);
            if (leave(-1) == 0) {
                return;
            }
        }
        C12766l.m33380a(simplePlainQueue, observer, z, disposable, this);
    }

    public abstract void accept(Observer<? super V> observer, U u);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36680b(U u, boolean z, Disposable disposable) {
        Observer<? super V> observer = this.f32347f;
        SimplePlainQueue<U> simplePlainQueue = this.f32348g;
        if (this.f32352e.get() != 0 || !this.f32352e.compareAndSet(0, 1)) {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        } else if (simplePlainQueue.isEmpty()) {
            accept(observer, u);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u);
        }
        C12766l.m33380a(simplePlainQueue, observer, z, disposable, this);
    }

    public final boolean cancelled() {
        return this.f32349h;
    }

    public final boolean done() {
        return this.f32350i;
    }

    public final boolean enter() {
        return this.f32352e.getAndIncrement() == 0;
    }

    public final Throwable error() {
        return this.f32351j;
    }

    public final int leave(int i) {
        return this.f32352e.addAndGet(i);
    }
}
