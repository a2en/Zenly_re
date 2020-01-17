package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.fuseable.ConditionalSubscriber;
import p389io.reactivex.internal.subscribers.C12746a;
import p389io.reactivex.internal.subscribers.C12747b;

/* renamed from: io.reactivex.internal.operators.flowable.b */
public final class C12484b<T, K> extends C12480a<T, T> {

    /* renamed from: g */
    final Function<? super T, K> f32376g;

    /* renamed from: h */
    final BiPredicate<? super K, ? super K> f32377h;

    /* renamed from: io.reactivex.internal.operators.flowable.b$a */
    static final class C12485a<T, K> extends C12746a<T, T> {

        /* renamed from: j */
        final Function<? super T, K> f32378j;

        /* renamed from: k */
        final BiPredicate<? super K, ? super K> f32379k;

        /* renamed from: l */
        K f32380l;

        /* renamed from: m */
        boolean f32381m;

        C12485a(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.f32378j = function;
            this.f32379k = biPredicate;
        }

        public void onNext(T t) {
            if (!tryOnNext(t)) {
                this.f33240f.request(1);
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f33241g.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f32378j.apply(poll);
                if (!this.f32381m) {
                    this.f32381m = true;
                    this.f32380l = apply;
                    return poll;
                } else if (!this.f32379k.test(this.f32380l, apply)) {
                    this.f32380l = apply;
                    return poll;
                } else {
                    this.f32380l = apply;
                    if (this.f33243i != 1) {
                        this.f33240f.request(1);
                    }
                }
            }
        }

        public int requestFusion(int i) {
            return mo36906a(i);
        }

        public boolean tryOnNext(T t) {
            if (this.f33242h) {
                return false;
            }
            if (this.f33243i != 0) {
                return this.f33239e.tryOnNext(t);
            }
            try {
                K apply = this.f32378j.apply(t);
                if (this.f32381m) {
                    boolean test = this.f32379k.test(this.f32380l, apply);
                    this.f32380l = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f32381m = true;
                    this.f32380l = apply;
                }
                this.f33239e.onNext(t);
                return true;
            } catch (Throwable th) {
                mo36908a(th);
                return true;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$b */
    static final class C12486b<T, K> extends C12747b<T, T> implements ConditionalSubscriber<T> {

        /* renamed from: j */
        final Function<? super T, K> f32382j;

        /* renamed from: k */
        final BiPredicate<? super K, ? super K> f32383k;

        /* renamed from: l */
        K f32384l;

        /* renamed from: m */
        boolean f32385m;

        C12486b(Subscriber<? super T> subscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(subscriber);
            this.f32382j = function;
            this.f32383k = biPredicate;
        }

        public void onNext(T t) {
            if (!tryOnNext(t)) {
                this.f33245f.request(1);
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f33246g.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f32382j.apply(poll);
                if (!this.f32385m) {
                    this.f32385m = true;
                    this.f32384l = apply;
                    return poll;
                } else if (!this.f32383k.test(this.f32384l, apply)) {
                    this.f32384l = apply;
                    return poll;
                } else {
                    this.f32384l = apply;
                    if (this.f33248i != 1) {
                        this.f33245f.request(1);
                    }
                }
            }
        }

        public int requestFusion(int i) {
            return mo36910a(i);
        }

        public boolean tryOnNext(T t) {
            if (this.f33247h) {
                return false;
            }
            if (this.f33248i != 0) {
                this.f33244e.onNext(t);
                return true;
            }
            try {
                K apply = this.f32382j.apply(t);
                if (this.f32385m) {
                    boolean test = this.f32383k.test(this.f32384l, apply);
                    this.f32384l = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f32385m = true;
                    this.f32384l = apply;
                }
                this.f33244e.onNext(t);
                return true;
            } catch (Throwable th) {
                mo36912a(th);
                return true;
            }
        }
    }

    public C12484b(C12272c<T> cVar, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(cVar);
        this.f32376g = function;
        this.f32377h = biPredicate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12485a<Object>((ConditionalSubscriber) subscriber, this.f32376g, this.f32377h));
            return;
        }
        this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12486b<Object>(subscriber, this.f32376g, this.f32377h));
    }
}
