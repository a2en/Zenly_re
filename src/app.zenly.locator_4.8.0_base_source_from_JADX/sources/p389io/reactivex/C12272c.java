package p389io.reactivex;

import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.fuseable.ScalarCallable;
import p389io.reactivex.internal.operators.flowable.C12481a0;
import p389io.reactivex.internal.operators.flowable.C12484b;
import p389io.reactivex.internal.operators.flowable.C12487c;
import p389io.reactivex.internal.operators.flowable.C12492e;
import p389io.reactivex.internal.operators.flowable.C12494f;
import p389io.reactivex.internal.operators.flowable.C12495g;
import p389io.reactivex.internal.operators.flowable.C12498h;
import p389io.reactivex.internal.operators.flowable.C12503j;
import p389io.reactivex.internal.operators.flowable.C12504k;
import p389io.reactivex.internal.operators.flowable.C12506l;
import p389io.reactivex.internal.operators.flowable.C12507m;
import p389io.reactivex.internal.operators.flowable.C12510n;
import p389io.reactivex.internal.operators.flowable.C12514o;
import p389io.reactivex.internal.operators.flowable.C12516p;
import p389io.reactivex.internal.operators.flowable.C12520r;
import p389io.reactivex.internal.operators.flowable.C12522s;
import p389io.reactivex.internal.operators.flowable.C12528v;
import p389io.reactivex.internal.operators.flowable.C12530w;
import p389io.reactivex.internal.operators.flowable.C12536z;
import p389io.reactivex.internal.operators.observable.C12573f0;
import p389io.reactivex.internal.subscribers.C12749d;
import p389io.reactivex.internal.subscribers.C12750e;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: io.reactivex.c */
public abstract class C12272c<T> implements Publisher<T> {

    /* renamed from: e */
    static final int f31942e = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: a */
    public static C12272c<Long> m32524a(long j, long j2, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12504k kVar = new C12504k(Math.max(0, j), Math.max(0, j2), timeUnit, fVar);
        return C12768a.m33394a((C12272c<T>) kVar);
    }

    /* renamed from: b */
    public static C12272c<Long> m32531b(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33394a((C12272c<T>) new C12536z<T>(Math.max(0, j), timeUnit, fVar));
    }

    /* renamed from: g */
    public static int m32532g() {
        return f31942e;
    }

    /* renamed from: h */
    public static <T> C12272c<T> m32533h() {
        return C12768a.m33394a(C12494f.f32414f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36365a(Subscriber<? super T> subscriber);

    /* renamed from: c */
    public final <R> C12272c<R> mo36369c(Function<? super T, ? extends R> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33394a((C12272c<T>) new C12507m<T>(this, function));
    }

    /* renamed from: d */
    public final C12272c<T> mo36370d() {
        return C12768a.m33394a((C12272c<T>) new C12516p<T>(this));
    }

    /* renamed from: e */
    public final C12272c<T> mo36372e() {
        return C12768a.m33394a((C12272c<T>) new C12520r<T>(this));
    }

    /* renamed from: f */
    public final C12279e<T> mo36373f() {
        return C12768a.m33396a((C12279e<T>) new C12573f0<T>(this));
    }

    public final void subscribe(Subscriber<? super T> subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            mo36364a((FlowableSubscriber) subscriber);
            return;
        }
        C12324b.m32836a(subscriber, "s is null");
        mo36364a((FlowableSubscriber<? super T>) new C12750e<Object>(subscriber));
    }

    /* renamed from: d */
    public final C12272c<T> mo36371d(Function<? super C12272c<Throwable>, ? extends Publisher<?>> function) {
        C12324b.m32836a(function, "handler is null");
        return C12768a.m33394a((C12272c<T>) new C12528v<T>(this, function));
    }

    /* renamed from: c */
    public final C12272c<T> mo36368c() {
        return mo36353a(m32532g(), false, true);
    }

    /* renamed from: a */
    public static C12272c<Long> m32526a(long j, TimeUnit timeUnit, C12286f fVar) {
        return m32524a(j, j, timeUnit, fVar);
    }

    /* renamed from: b */
    public final C12273d<T> mo36367b() {
        return mo36361a(0);
    }

    /* renamed from: a */
    public static <T> C12272c<T> m32529a(T t) {
        C12324b.m32836a(t, "item is null");
        return C12768a.m33394a((C12272c<T>) new C12506l<T>(t));
    }

    /* renamed from: b */
    public final <R> C12272c<R> mo36366b(Function<? super T, ? extends Publisher<? extends R>> function) {
        return mo36358a(function, false, m32532g(), m32532g());
    }

    /* renamed from: a */
    public static C12272c<Integer> m32523a(int i, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 == 0) {
            return m32533h();
        } else {
            if (i2 == 1) {
                return m32529a((T) Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return C12768a.m33394a((C12272c<T>) new C12522s<T>(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    /* renamed from: a */
    public static C12272c<Long> m32525a(long j, TimeUnit timeUnit) {
        return m32531b(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: a */
    public static <T1, T2, R> C12272c<R> m32530a(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C12324b.m32836a(publisher, "source1 is null");
        C12324b.m32836a(publisher2, "source2 is null");
        return m32528a(C12301a.m32810a(biFunction), false, m32532g(), (Publisher<? extends T>[]) new Publisher[]{publisher, publisher2});
    }

    /* renamed from: a */
    public static <T, R> C12272c<R> m32528a(Function<? super Object[], ? extends R> function, boolean z, int i, Publisher<? extends T>... publisherArr) {
        if (publisherArr.length == 0) {
            return m32533h();
        }
        C12324b.m32836a(function, "zipper is null");
        C12324b.m32833a(i, "bufferSize");
        C12481a0 a0Var = new C12481a0(publisherArr, null, function, i, z);
        return C12768a.m33394a((C12272c<T>) a0Var);
    }

    /* renamed from: a */
    public final C12272c<T> mo36352a() {
        return mo36357a(C12301a.m32819b());
    }

    /* renamed from: a */
    public final <K> C12272c<T> mo36357a(Function<? super T, K> function) {
        C12324b.m32836a(function, "keySelector is null");
        return C12768a.m33394a((C12272c<T>) new C12484b<T>(this, function, C12324b.m32835a()));
    }

    /* renamed from: a */
    private C12272c<T> m32527a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        C12324b.m32836a(consumer, "onNext is null");
        C12324b.m32836a(consumer2, "onError is null");
        C12324b.m32836a(action, "onComplete is null");
        C12324b.m32836a(action2, "onAfterTerminate is null");
        C12487c cVar = new C12487c(this, consumer, consumer2, action, action2);
        return C12768a.m33394a((C12272c<T>) cVar);
    }

    /* renamed from: a */
    public final C12272c<T> mo36356a(Consumer<? super T> consumer) {
        Consumer a = C12301a.m32808a();
        Action action = C12301a.f31981c;
        return m32527a(consumer, a, action, action);
    }

    /* renamed from: a */
    public final C12273d<T> mo36361a(long j) {
        if (j >= 0) {
            return C12768a.m33395a((C12273d<T>) new C12492e<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final C12272c<T> mo36359a(Predicate<? super T> predicate) {
        C12324b.m32836a(predicate, "predicate is null");
        return C12768a.m33394a((C12272c<T>) new C12495g<T>(this, predicate));
    }

    /* renamed from: a */
    public final <R> C12272c<R> mo36358a(Function<? super T, ? extends Publisher<? extends R>> function, boolean z, int i, int i2) {
        C12324b.m32836a(function, "mapper is null");
        C12324b.m32833a(i, "maxConcurrency");
        C12324b.m32833a(i2, "bufferSize");
        if (this instanceof ScalarCallable) {
            Object call = ((ScalarCallable) this).call();
            if (call == null) {
                return m32533h();
            }
            return C12530w.m33064a(call, function);
        }
        C12498h hVar = new C12498h(this, function, z, i, i2);
        return C12768a.m33394a((C12272c<T>) hVar);
    }

    /* renamed from: a */
    public final C12272c<T> mo36354a(C12286f fVar) {
        return mo36355a(fVar, false, m32532g());
    }

    /* renamed from: a */
    public final C12272c<T> mo36355a(C12286f fVar, boolean z, int i) {
        C12324b.m32836a(fVar, "scheduler is null");
        C12324b.m32833a(i, "bufferSize");
        return C12768a.m33394a((C12272c<T>) new C12510n<T>(this, fVar, z, i));
    }

    /* renamed from: a */
    public final C12272c<T> mo36353a(int i, boolean z, boolean z2) {
        C12324b.m32833a(i, "capacity");
        C12514o oVar = new C12514o(this, i, z2, z, C12301a.f31981c);
        return C12768a.m33394a((C12272c<T>) oVar);
    }

    /* renamed from: a */
    public final Disposable mo36362a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return mo36363a(consumer, consumer2, action, (Consumer<? super Subscription>) C12503j.INSTANCE);
    }

    /* renamed from: a */
    public final Disposable mo36363a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Subscription> consumer3) {
        C12324b.m32836a(consumer, "onNext is null");
        C12324b.m32836a(consumer2, "onError is null");
        C12324b.m32836a(action, "onComplete is null");
        C12324b.m32836a(consumer3, "onSubscribe is null");
        C12749d dVar = new C12749d(consumer, consumer2, action, consumer3);
        mo36364a((FlowableSubscriber<? super T>) dVar);
        return dVar;
    }

    /* renamed from: a */
    public final void mo36364a(FlowableSubscriber<? super T> flowableSubscriber) {
        C12324b.m32836a(flowableSubscriber, "s is null");
        try {
            Subscriber a = C12768a.m33406a(this, (Subscriber<? super T>) flowableSubscriber);
            C12324b.m32836a(a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo36365a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12768a.m33415b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public final <U, R> C12272c<R> mo36360a(Publisher<? extends U> publisher, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C12324b.m32836a(publisher, "other is null");
        return m32530a((Publisher<? extends T1>) this, publisher, biFunction);
    }
}
