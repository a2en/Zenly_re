package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.internal.fuseable.ConditionalSubscriber;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p401d.C12451b;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.operators.flowable.s */
public final class C12522s extends C12272c<Integer> {

    /* renamed from: f */
    final int f32513f;

    /* renamed from: g */
    final int f32514g;

    /* renamed from: io.reactivex.internal.operators.flowable.s$a */
    static abstract class C12523a extends C12451b<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: e */
        final int f32515e;

        /* renamed from: f */
        int f32516f;

        /* renamed from: g */
        volatile boolean f32517g;

        C12523a(int i, int i2) {
            this.f32516f = i;
            this.f32515e = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo36721a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo36722a(long j);

        public final void cancel() {
            this.f32517g = true;
        }

        public final void clear() {
            this.f32516f = this.f32515e;
        }

        public final boolean isEmpty() {
            return this.f32516f == this.f32515e;
        }

        public final void request(long j) {
            if (C12456g.m32971b(j) && C12753c.m33346a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo36721a();
                } else {
                    mo36722a(j);
                }
            }
        }

        public final int requestFusion(int i) {
            return i & 1;
        }

        public final Integer poll() {
            int i = this.f32516f;
            if (i == this.f32515e) {
                return null;
            }
            this.f32516f = i + 1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.s$b */
    static final class C12524b extends C12523a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: h */
        final ConditionalSubscriber<? super Integer> f32518h;

        C12524b(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.f32518h = conditionalSubscriber;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36721a() {
            int i = this.f32515e;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.f32518h;
            int i2 = this.f32516f;
            while (i2 != i) {
                if (!this.f32517g) {
                    conditionalSubscriber.tryOnNext(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.f32517g) {
                conditionalSubscriber.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36722a(long j) {
            int i = this.f32515e;
            int i2 = this.f32516f;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.f32518h;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.f32517g) {
                                conditionalSubscriber.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f32516f = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f32517g) {
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i2))) {
                            j3++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.s$c */
    static final class C12525c extends C12523a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: h */
        final Subscriber<? super Integer> f32519h;

        C12525c(Subscriber<? super Integer> subscriber, int i, int i2) {
            super(i, i2);
            this.f32519h = subscriber;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36721a() {
            int i = this.f32515e;
            Subscriber<? super Integer> subscriber = this.f32519h;
            int i2 = this.f32516f;
            while (i2 != i) {
                if (!this.f32517g) {
                    subscriber.onNext(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.f32517g) {
                subscriber.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36722a(long j) {
            int i = this.f32515e;
            int i2 = this.f32516f;
            Subscriber<? super Integer> subscriber = this.f32519h;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.f32517g) {
                                subscriber.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f32516f = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f32517g) {
                        subscriber.onNext(Integer.valueOf(i2));
                        j3++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public C12522s(int i, int i2) {
        this.f32513f = i;
        this.f32514g = i + i2;
    }

    /* renamed from: a */
    public void mo36365a(Subscriber<? super Integer> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new C12524b((ConditionalSubscriber) subscriber, this.f32513f, this.f32514g));
        } else {
            subscriber.onSubscribe(new C12525c(subscriber, this.f32513f, this.f32514g));
        }
    }
}
