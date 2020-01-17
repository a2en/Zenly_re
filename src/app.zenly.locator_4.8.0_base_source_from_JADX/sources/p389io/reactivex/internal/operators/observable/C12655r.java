package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.observers.C12471j;

/* renamed from: io.reactivex.internal.operators.observable.r */
public final class C12655r<T> extends C12538a<T, T> {

    /* renamed from: f */
    private final Consumer<? super Disposable> f32943f;

    /* renamed from: g */
    private final Action f32944g;

    public C12655r(C12279e<T> eVar, Consumer<? super Disposable> consumer, Action action) {
        super(eVar);
        this.f32943f = consumer;
        this.f32944g = action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12471j(observer, this.f32943f, this.f32944g));
    }
}
