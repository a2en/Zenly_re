package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.fuseable.ConditionalSubscriber;
import p389io.reactivex.internal.subscribers.C12746a;
import p389io.reactivex.internal.subscribers.C12747b;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.flowable.m */
public final class C12507m<T, U> extends C12480a<T, U> {

    /* renamed from: g */
    final Function<? super T, ? extends U> f32462g;

    /* renamed from: io.reactivex.internal.operators.flowable.m$a */
    static final class C12508a<T, U> extends C12746a<T, U> {

        /* renamed from: j */
        final Function<? super T, ? extends U> f32463j;

        C12508a(ConditionalSubscriber<? super U> conditionalSubscriber, Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.f32463j = function;
        }

        public void onNext(T t) {
            if (!this.f33242h) {
                if (this.f33243i != 0) {
                    this.f33239e.onNext(null);
                    return;
                }
                try {
                    this.f33239e.onNext(C12324b.m32836a(this.f32463j.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo36908a(th);
                }
            }
        }

        public U poll() throws Exception {
            Object poll = this.f33241g.poll();
            if (poll != null) {
                return C12324b.m32836a(this.f32463j.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public int requestFusion(int i) {
            return mo36906a(i);
        }

        public boolean tryOnNext(T t) {
            if (this.f33242h) {
                return false;
            }
            try {
                Object apply = this.f32463j.apply(t);
                C12324b.m32836a(apply, "The mapper function returned a null value.");
                return this.f33239e.tryOnNext(apply);
            } catch (Throwable th) {
                mo36908a(th);
                return true;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.m$b */
    static final class C12509b<T, U> extends C12747b<T, U> {

        /* renamed from: j */
        final Function<? super T, ? extends U> f32464j;

        C12509b(Subscriber<? super U> subscriber, Function<? super T, ? extends U> function) {
            super(subscriber);
            this.f32464j = function;
        }

        public void onNext(T t) {
            if (!this.f33247h) {
                if (this.f33248i != 0) {
                    this.f33244e.onNext(null);
                    return;
                }
                try {
                    this.f33244e.onNext(C12324b.m32836a(this.f32464j.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo36912a(th);
                }
            }
        }

        public U poll() throws Exception {
            Object poll = this.f33246g.poll();
            if (poll != null) {
                return C12324b.m32836a(this.f32464j.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public int requestFusion(int i) {
            return mo36910a(i);
        }
    }

    public C12507m(C12272c<T> cVar, Function<? super T, ? extends U> function) {
        super(cVar);
        this.f32462g = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super U> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12508a<Object>((ConditionalSubscriber) subscriber, this.f32462g));
        } else {
            this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12509b<Object>(subscriber, this.f32462g));
        }
    }
}
