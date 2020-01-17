package p389io.reactivex.p403k;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.Subscriber;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.exceptions.MissingBackpressureException;
import p389io.reactivex.exceptions.OnErrorNotImplementedException;
import p389io.reactivex.exceptions.UndeliverableException;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.BooleanSupplier;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.schedulers.C12720b;
import p389io.reactivex.internal.schedulers.C12739l;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p402j.C12767a;

/* renamed from: io.reactivex.k.a */
public final class C12768a {

    /* renamed from: a */
    static volatile Consumer<? super Throwable> f33281a;

    /* renamed from: b */
    static volatile Function<? super Runnable, ? extends Runnable> f33282b;

    /* renamed from: c */
    static volatile Function<? super Callable<C12286f>, ? extends C12286f> f33283c;

    /* renamed from: d */
    static volatile Function<? super Callable<C12286f>, ? extends C12286f> f33284d;

    /* renamed from: e */
    static volatile Function<? super Callable<C12286f>, ? extends C12286f> f33285e;

    /* renamed from: f */
    static volatile Function<? super Callable<C12286f>, ? extends C12286f> f33286f;

    /* renamed from: g */
    static volatile Function<? super C12286f, ? extends C12286f> f33287g;

    /* renamed from: h */
    static volatile Function<? super C12286f, ? extends C12286f> f33288h;

    /* renamed from: i */
    static volatile Function<? super C12286f, ? extends C12286f> f33289i;

    /* renamed from: j */
    static volatile Function<? super C12272c, ? extends C12272c> f33290j;

    /* renamed from: k */
    static volatile Function<? super C12279e, ? extends C12279e> f33291k;

    /* renamed from: l */
    static volatile Function<? super C12767a, ? extends C12767a> f33292l;

    /* renamed from: m */
    static volatile Function<? super C12273d, ? extends C12273d> f33293m;

    /* renamed from: n */
    static volatile Function<? super C12291g, ? extends C12291g> f33294n;

    /* renamed from: o */
    static volatile Function<? super C12271b, ? extends C12271b> f33295o;

    /* renamed from: p */
    static volatile BiFunction<? super C12272c, ? super Subscriber, ? extends Subscriber> f33296p;

    /* renamed from: q */
    static volatile BiFunction<? super C12273d, ? super MaybeObserver, ? extends MaybeObserver> f33297q;

    /* renamed from: r */
    static volatile BiFunction<? super C12279e, ? super Observer, ? extends Observer> f33298r;

    /* renamed from: s */
    static volatile BiFunction<? super C12291g, ? super SingleObserver, ? extends SingleObserver> f33299s;

    /* renamed from: t */
    static volatile BiFunction<? super C12271b, ? super CompletableObserver, ? extends CompletableObserver> f33300t;

    /* renamed from: u */
    static volatile BooleanSupplier f33301u;

    /* renamed from: v */
    static volatile boolean f33302v;

    /* renamed from: w */
    static volatile boolean f33303w;

    /* renamed from: a */
    public static boolean m33409a() {
        return f33303w;
    }

    /* renamed from: b */
    public static C12286f m33412b(Callable<C12286f> callable) {
        C12324b.m32836a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C12286f>, ? extends C12286f> function = f33283c;
        if (function == null) {
            return m33399a(callable);
        }
        return m33398a(function, callable);
    }

    /* renamed from: c */
    public static C12286f m33418c(Callable<C12286f> callable) {
        C12324b.m32836a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C12286f>, ? extends C12286f> function = f33285e;
        if (function == null) {
            return m33399a(callable);
        }
        return m33398a(function, callable);
    }

    /* renamed from: d */
    public static C12286f m33420d(Callable<C12286f> callable) {
        C12324b.m32836a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C12286f>, ? extends C12286f> function = f33286f;
        if (function == null) {
            return m33399a(callable);
        }
        return m33398a(function, callable);
    }

    /* renamed from: e */
    public static C12286f m33421e(Callable<C12286f> callable) {
        C12324b.m32836a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C12286f>, ? extends C12286f> function = f33284d;
        if (function == null) {
            return m33399a(callable);
        }
        return m33398a(function, callable);
    }

    /* renamed from: a */
    public static C12286f m33397a(C12286f fVar) {
        Function<? super C12286f, ? extends C12286f> function = f33287g;
        if (function == null) {
            return fVar;
        }
        return (C12286f) m33404a(function, (T) fVar);
    }

    /* renamed from: a */
    static boolean m33410a(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m33415b(Throwable th) {
        Consumer<? super Throwable> consumer = f33281a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m33410a(th)) {
            th = new UndeliverableException(th);
        }
        if (consumer != null) {
            try {
                consumer.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m33419c(th2);
            }
        }
        th.printStackTrace();
        m33419c(th);
    }

    /* renamed from: c */
    static void m33419c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: c */
    public static C12286f m33417c(C12286f fVar) {
        Function<? super C12286f, ? extends C12286f> function = f33288h;
        if (function == null) {
            return fVar;
        }
        return (C12286f) m33404a(function, (T) fVar);
    }

    /* renamed from: a */
    public static Runnable m33405a(Runnable runnable) {
        C12324b.m32836a(runnable, "run is null");
        Function<? super Runnable, ? extends Runnable> function = f33282b;
        if (function == null) {
            return runnable;
        }
        return (Runnable) m33404a(function, (T) runnable);
    }

    /* renamed from: a */
    public static void m33407a(Consumer<? super Throwable> consumer) {
        if (!f33302v) {
            f33281a = consumer;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: b */
    public static C12286f m33411b(C12286f fVar) {
        Function<? super C12286f, ? extends C12286f> function = f33289i;
        if (function == null) {
            return fVar;
        }
        return (C12286f) m33404a(function, (T) fVar);
    }

    /* renamed from: a */
    public static void m33408a(Function<? super Callable<C12286f>, ? extends C12286f> function) {
        if (!f33302v) {
            f33283c = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: b */
    public static void m33414b(Function<? super Callable<C12286f>, ? extends C12286f> function) {
        if (!f33302v) {
            f33284d = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: a */
    public static <T> Subscriber<? super T> m33406a(C12272c<T> cVar, Subscriber<? super T> subscriber) {
        BiFunction<? super C12272c, ? super Subscriber, ? extends Subscriber> biFunction = f33296p;
        return biFunction != null ? (Subscriber) m33403a(biFunction, cVar, subscriber) : subscriber;
    }

    /* renamed from: b */
    public static boolean m33416b() {
        BooleanSupplier booleanSupplier = f33301u;
        if (booleanSupplier == null) {
            return false;
        }
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            throw C12757g.m33354b(th);
        }
    }

    /* renamed from: a */
    public static <T> Observer<? super T> m33391a(C12279e<T> eVar, Observer<? super T> observer) {
        BiFunction<? super C12279e, ? super Observer, ? extends Observer> biFunction = f33298r;
        return biFunction != null ? (Observer) m33403a(biFunction, eVar, observer) : observer;
    }

    /* renamed from: b */
    public static C12286f m33413b(ThreadFactory threadFactory) {
        C12324b.m32836a(threadFactory, "threadFactory is null");
        return new C12739l(threadFactory);
    }

    /* renamed from: a */
    public static <T> SingleObserver<? super T> m33392a(C12291g<T> gVar, SingleObserver<? super T> singleObserver) {
        BiFunction<? super C12291g, ? super SingleObserver, ? extends SingleObserver> biFunction = f33299s;
        return biFunction != null ? (SingleObserver) m33403a(biFunction, gVar, singleObserver) : singleObserver;
    }

    /* renamed from: a */
    public static CompletableObserver m33389a(C12271b bVar, CompletableObserver completableObserver) {
        BiFunction<? super C12271b, ? super CompletableObserver, ? extends CompletableObserver> biFunction = f33300t;
        return biFunction != null ? (CompletableObserver) m33403a(biFunction, bVar, completableObserver) : completableObserver;
    }

    /* renamed from: a */
    public static <T> MaybeObserver<? super T> m33390a(C12273d<T> dVar, MaybeObserver<? super T> maybeObserver) {
        BiFunction<? super C12273d, ? super MaybeObserver, ? extends MaybeObserver> biFunction = f33297q;
        return biFunction != null ? (MaybeObserver) m33403a(biFunction, dVar, maybeObserver) : maybeObserver;
    }

    /* renamed from: a */
    public static <T> C12273d<T> m33395a(C12273d<T> dVar) {
        Function<? super C12273d, ? extends C12273d> function = f33293m;
        return function != null ? (C12273d) m33404a(function, (T) dVar) : dVar;
    }

    /* renamed from: a */
    public static <T> C12272c<T> m33394a(C12272c<T> cVar) {
        Function<? super C12272c, ? extends C12272c> function = f33290j;
        return function != null ? (C12272c) m33404a(function, (T) cVar) : cVar;
    }

    /* renamed from: a */
    public static <T> C12279e<T> m33396a(C12279e<T> eVar) {
        Function<? super C12279e, ? extends C12279e> function = f33291k;
        return function != null ? (C12279e) m33404a(function, (T) eVar) : eVar;
    }

    /* renamed from: a */
    public static <T> C12767a<T> m33402a(C12767a<T> aVar) {
        Function<? super C12767a, ? extends C12767a> function = f33292l;
        return function != null ? (C12767a) m33404a(function, (T) aVar) : aVar;
    }

    /* renamed from: a */
    public static <T> C12291g<T> m33401a(C12291g<T> gVar) {
        Function<? super C12291g, ? extends C12291g> function = f33294n;
        return function != null ? (C12291g) m33404a(function, (T) gVar) : gVar;
    }

    /* renamed from: a */
    public static C12271b m33393a(C12271b bVar) {
        Function<? super C12271b, ? extends C12271b> function = f33295o;
        return function != null ? (C12271b) m33404a(function, (T) bVar) : bVar;
    }

    /* renamed from: a */
    public static C12286f m33400a(ThreadFactory threadFactory) {
        C12324b.m32836a(threadFactory, "threadFactory is null");
        return new C12720b(threadFactory);
    }

    /* renamed from: a */
    static <T, R> R m33404a(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Throwable th) {
            throw C12757g.m33354b(th);
        }
    }

    /* renamed from: a */
    static <T, U, R> R m33403a(BiFunction<T, U, R> biFunction, T t, U u) {
        try {
            return biFunction.apply(t, u);
        } catch (Throwable th) {
            throw C12757g.m33354b(th);
        }
    }

    /* renamed from: a */
    static C12286f m33399a(Callable<C12286f> callable) {
        try {
            Object call = callable.call();
            C12324b.m32836a(call, "Scheduler Callable result can't be null");
            return (C12286f) call;
        } catch (Throwable th) {
            throw C12757g.m33354b(th);
        }
    }

    /* renamed from: a */
    static C12286f m33398a(Function<? super Callable<C12286f>, ? extends C12286f> function, Callable<C12286f> callable) {
        Object a = m33404a(function, (T) callable);
        C12324b.m32836a(a, "Scheduler Callable result can't be null");
        return (C12286f) a;
    }
}
