package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.fuseable.ConditionalSubscriber;
import p389io.reactivex.internal.subscribers.C12746a;
import p389io.reactivex.internal.subscribers.C12747b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.c */
public final class C12487c<T> extends C12480a<T, T> {

    /* renamed from: g */
    final Consumer<? super T> f32386g;

    /* renamed from: h */
    final Consumer<? super Throwable> f32387h;

    /* renamed from: i */
    final Action f32388i;

    /* renamed from: j */
    final Action f32389j;

    /* renamed from: io.reactivex.internal.operators.flowable.c$a */
    static final class C12488a<T> extends C12746a<T, T> {

        /* renamed from: j */
        final Consumer<? super T> f32390j;

        /* renamed from: k */
        final Consumer<? super Throwable> f32391k;

        /* renamed from: l */
        final Action f32392l;

        /* renamed from: m */
        final Action f32393m;

        C12488a(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f32390j = consumer;
            this.f32391k = consumer2;
            this.f32392l = action;
            this.f32393m = action2;
        }

        public void onComplete() {
            if (!this.f33242h) {
                try {
                    this.f32392l.run();
                    this.f33242h = true;
                    this.f33239e.onComplete();
                    try {
                        this.f32393m.run();
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        C12768a.m33415b(th);
                    }
                } catch (Throwable th2) {
                    mo36908a(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f33242h) {
                C12768a.m33415b(th);
                return;
            }
            boolean z = true;
            this.f33242h = true;
            try {
                this.f32391k.accept(th);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                this.f33239e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f33239e.onError(th);
            }
            try {
                this.f32393m.run();
            } catch (Throwable th3) {
                C12285a.m32748b(th3);
                C12768a.m33415b(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f33242h) {
                if (this.f33243i != 0) {
                    this.f33239e.onNext(null);
                    return;
                }
                try {
                    this.f32390j.accept(t);
                    this.f33239e.onNext(t);
                } catch (Throwable th) {
                    mo36908a(th);
                }
            }
        }

        public T poll() throws Exception {
            try {
                T poll = this.f33241g.poll();
                if (poll != null) {
                    try {
                        this.f32390j.accept(poll);
                        this.f32393m.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f33243i == 1) {
                    this.f32392l.run();
                    this.f32393m.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public int requestFusion(int i) {
            return mo36906a(i);
        }

        public boolean tryOnNext(T t) {
            if (this.f33242h) {
                return false;
            }
            try {
                this.f32390j.accept(t);
                return this.f33239e.tryOnNext(t);
            } catch (Throwable th) {
                mo36908a(th);
                return false;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.c$b */
    static final class C12489b<T> extends C12747b<T, T> {

        /* renamed from: j */
        final Consumer<? super T> f32394j;

        /* renamed from: k */
        final Consumer<? super Throwable> f32395k;

        /* renamed from: l */
        final Action f32396l;

        /* renamed from: m */
        final Action f32397m;

        C12489b(Subscriber<? super T> subscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(subscriber);
            this.f32394j = consumer;
            this.f32395k = consumer2;
            this.f32396l = action;
            this.f32397m = action2;
        }

        public void onComplete() {
            if (!this.f33247h) {
                try {
                    this.f32396l.run();
                    this.f33247h = true;
                    this.f33244e.onComplete();
                    try {
                        this.f32397m.run();
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        C12768a.m33415b(th);
                    }
                } catch (Throwable th2) {
                    mo36912a(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f33247h) {
                C12768a.m33415b(th);
                return;
            }
            boolean z = true;
            this.f33247h = true;
            try {
                this.f32395k.accept(th);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                this.f33244e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f33244e.onError(th);
            }
            try {
                this.f32397m.run();
            } catch (Throwable th3) {
                C12285a.m32748b(th3);
                C12768a.m33415b(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f33247h) {
                if (this.f33248i != 0) {
                    this.f33244e.onNext(null);
                    return;
                }
                try {
                    this.f32394j.accept(t);
                    this.f33244e.onNext(t);
                } catch (Throwable th) {
                    mo36912a(th);
                }
            }
        }

        public T poll() throws Exception {
            try {
                T poll = this.f33246g.poll();
                if (poll != null) {
                    try {
                        this.f32394j.accept(poll);
                        this.f32397m.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f33248i == 1) {
                    this.f32396l.run();
                    this.f32397m.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public int requestFusion(int i) {
            return mo36910a(i);
        }
    }

    public C12487c(C12272c<T> cVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(cVar);
        this.f32386g = consumer;
        this.f32387h = consumer2;
        this.f32388i = action;
        this.f32389j = action2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            C12272c<T> cVar = this.f32355f;
            C12488a aVar = new C12488a((ConditionalSubscriber) subscriber, this.f32386g, this.f32387h, this.f32388i, this.f32389j);
            cVar.mo36364a((FlowableSubscriber<? super T>) aVar);
            return;
        }
        C12272c<T> cVar2 = this.f32355f;
        C12489b bVar = new C12489b(subscriber, this.f32386g, this.f32387h, this.f32388i, this.f32389j);
        cVar2.mo36364a((FlowableSubscriber<? super T>) bVar);
    }
}
