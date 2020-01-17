package p389io.reactivex.internal.observers;

import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.observers.j */
public final class C12471j<T> implements Observer<T>, Disposable {

    /* renamed from: e */
    final Observer<? super T> f32339e;

    /* renamed from: f */
    final Consumer<? super Disposable> f32340f;

    /* renamed from: g */
    final Action f32341g;

    /* renamed from: h */
    Disposable f32342h;

    public C12471j(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.f32339e = observer;
        this.f32340f = consumer;
        this.f32341g = action;
    }

    public void dispose() {
        Disposable disposable = this.f32342h;
        C12458b bVar = C12458b.DISPOSED;
        if (disposable != bVar) {
            this.f32342h = bVar;
            try {
                this.f32341g.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
            disposable.dispose();
        }
    }

    public boolean isDisposed() {
        return this.f32342h.isDisposed();
    }

    public void onComplete() {
        Disposable disposable = this.f32342h;
        C12458b bVar = C12458b.DISPOSED;
        if (disposable != bVar) {
            this.f32342h = bVar;
            this.f32339e.onComplete();
        }
    }

    public void onError(Throwable th) {
        Disposable disposable = this.f32342h;
        C12458b bVar = C12458b.DISPOSED;
        if (disposable != bVar) {
            this.f32342h = bVar;
            this.f32339e.onError(th);
            return;
        }
        C12768a.m33415b(th);
    }

    public void onNext(T t) {
        this.f32339e.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        try {
            this.f32340f.accept(disposable);
            if (C12458b.m32974a(this.f32342h, disposable)) {
                this.f32342h = disposable;
                this.f32339e.onSubscribe(this);
            }
        } catch (Throwable th) {
            C12285a.m32748b(th);
            disposable.dispose();
            this.f32342h = C12458b.DISPOSED;
            C12459c.m32985a(th, this.f32339e);
        }
    }
}
