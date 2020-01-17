package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p402j.C12767a;

/* renamed from: io.reactivex.internal.operators.observable.d */
public final class C12555d<T> extends C12279e<T> {

    /* renamed from: e */
    final C12767a<? extends T> f32590e;

    /* renamed from: f */
    final int f32591f;

    /* renamed from: g */
    final Consumer<? super Disposable> f32592g;

    /* renamed from: h */
    final AtomicInteger f32593h = new AtomicInteger();

    public C12555d(C12767a<? extends T> aVar, int i, Consumer<? super Disposable> consumer) {
        this.f32590e = aVar;
        this.f32591f = i;
        this.f32592g = consumer;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32590e.subscribe(observer);
        if (this.f32593h.incrementAndGet() == this.f32591f) {
            this.f32590e.mo36790e(this.f32592g);
        }
    }
}
