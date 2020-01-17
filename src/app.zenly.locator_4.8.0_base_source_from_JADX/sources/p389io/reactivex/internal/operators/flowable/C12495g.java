package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.fuseable.ConditionalSubscriber;
import p389io.reactivex.internal.fuseable.QueueSubscription;
import p389io.reactivex.internal.subscribers.C12746a;
import p389io.reactivex.internal.subscribers.C12747b;

/* renamed from: io.reactivex.internal.operators.flowable.g */
public final class C12495g<T> extends C12480a<T, T> {

    /* renamed from: g */
    final Predicate<? super T> f32415g;

    /* renamed from: io.reactivex.internal.operators.flowable.g$a */
    static final class C12496a<T> extends C12746a<T, T> {

        /* renamed from: j */
        final Predicate<? super T> f32416j;

        C12496a(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(conditionalSubscriber);
            this.f32416j = predicate;
        }

        public void onNext(T t) {
            if (!tryOnNext(t)) {
                this.f33240f.request(1);
            }
        }

        public T poll() throws Exception {
            QueueSubscription<T> queueSubscription = this.f33241g;
            Predicate<? super T> predicate = this.f32416j;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.f33243i == 2) {
                    queueSubscription.request(1);
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
                return this.f33239e.tryOnNext(null);
            }
            boolean z = true;
            try {
                if (!this.f32416j.test(t) || !this.f33239e.tryOnNext(t)) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                mo36908a(th);
                return true;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.g$b */
    static final class C12497b<T> extends C12747b<T, T> implements ConditionalSubscriber<T> {

        /* renamed from: j */
        final Predicate<? super T> f32417j;

        C12497b(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f32417j = predicate;
        }

        public void onNext(T t) {
            if (!tryOnNext(t)) {
                this.f33245f.request(1);
            }
        }

        public T poll() throws Exception {
            QueueSubscription<T> queueSubscription = this.f33246g;
            Predicate<? super T> predicate = this.f32417j;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.f33248i == 2) {
                    queueSubscription.request(1);
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
                this.f33244e.onNext(null);
                return true;
            }
            try {
                boolean test = this.f32417j.test(t);
                if (test) {
                    this.f33244e.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                mo36912a(th);
                return true;
            }
        }
    }

    public C12495g(C12272c<T> cVar, Predicate<? super T> predicate) {
        super(cVar);
        this.f32415g = predicate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12496a<Object>((ConditionalSubscriber) subscriber, this.f32415g));
        } else {
            this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12497b<Object>(subscriber, this.f32415g));
        }
    }
}
