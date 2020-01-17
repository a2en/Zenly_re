package p389io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.observers.LambdaConsumerIntrospection;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.subscribers.d */
public final class C12749d<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: e */
    final Consumer<? super T> f33249e;

    /* renamed from: f */
    final Consumer<? super Throwable> f33250f;

    /* renamed from: g */
    final Action f33251g;

    /* renamed from: h */
    final Consumer<? super Subscription> f33252h;

    public C12749d(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Subscription> consumer3) {
        this.f33249e = consumer;
        this.f33250f = consumer2;
        this.f33251g = action;
        this.f33252h = consumer3;
    }

    public void cancel() {
        C12456g.m32967a((AtomicReference<Subscription>) this);
    }

    public void dispose() {
        cancel();
    }

    public boolean hasCustomOnError() {
        return this.f33250f != C12301a.f31983e;
    }

    public boolean isDisposed() {
        return get() == C12456g.CANCELLED;
    }

    public void onComplete() {
        Object obj = get();
        C12456g gVar = C12456g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f33251g.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        C12456g gVar = C12456g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f33250f.accept(th);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                C12768a.m33415b((Throwable) new CompositeException(th, th2));
            }
        } else {
            C12768a.m33415b(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f33249e.accept(t);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                ((Subscription) get()).cancel();
                onError(th);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (C12456g.m32969a((AtomicReference<Subscription>) this, subscription)) {
            try {
                this.f33252h.accept(this);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    public void request(long j) {
        ((Subscription) get()).request(j);
    }
}
