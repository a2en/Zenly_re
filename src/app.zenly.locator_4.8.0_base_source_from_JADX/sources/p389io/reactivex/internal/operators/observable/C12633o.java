package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.observers.C12462a;

/* renamed from: io.reactivex.internal.operators.observable.o */
public final class C12633o<T, K> extends C12538a<T, T> {

    /* renamed from: f */
    final Function<? super T, K> f32864f;

    /* renamed from: g */
    final BiPredicate<? super K, ? super K> f32865g;

    /* renamed from: io.reactivex.internal.operators.observable.o$a */
    static final class C12634a<T, K> extends C12462a<T, T> {

        /* renamed from: j */
        final Function<? super T, K> f32866j;

        /* renamed from: k */
        final BiPredicate<? super K, ? super K> f32867k;

        /* renamed from: l */
        K f32868l;

        /* renamed from: m */
        boolean f32869m;

        C12634a(Observer<? super T> observer, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.f32866j = function;
            this.f32867k = biPredicate;
        }

        public void onNext(T t) {
            if (!this.f32323h) {
                if (this.f32324i != 0) {
                    this.f32320e.onNext(t);
                    return;
                }
                try {
                    K apply = this.f32866j.apply(t);
                    if (this.f32869m) {
                        boolean test = this.f32867k.test(this.f32868l, apply);
                        this.f32868l = apply;
                        if (test) {
                            return;
                        }
                    } else {
                        this.f32869m = true;
                        this.f32868l = apply;
                    }
                    this.f32320e.onNext(t);
                } catch (Throwable th) {
                    mo36669a(th);
                }
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f32322g.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f32866j.apply(poll);
                if (!this.f32869m) {
                    this.f32869m = true;
                    this.f32868l = apply;
                    return poll;
                } else if (!this.f32867k.test(this.f32868l, apply)) {
                    this.f32868l = apply;
                    return poll;
                } else {
                    this.f32868l = apply;
                }
            }
        }

        public int requestFusion(int i) {
            return mo36667a(i);
        }
    }

    public C12633o(ObservableSource<T> observableSource, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.f32864f = function;
        this.f32865g = biPredicate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12634a(observer, this.f32864f, this.f32865g));
    }
}
