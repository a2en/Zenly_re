package p389io.reactivex.p390h.p391b;

import java.util.concurrent.Callable;
import p389io.reactivex.C12286f;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;

/* renamed from: io.reactivex.h.b.a */
public final class C12294a {

    /* renamed from: a */
    private static volatile Function<Callable<C12286f>, C12286f> f31967a;

    /* renamed from: b */
    private static volatile Function<C12286f, C12286f> f31968b;

    /* renamed from: a */
    public static void m32800a(Function<Callable<C12286f>, C12286f> function) {
        f31967a = function;
    }

    /* renamed from: b */
    public static C12286f m32801b(Callable<C12286f> callable) {
        if (callable != null) {
            Function<Callable<C12286f>, C12286f> function = f31967a;
            if (function == null) {
                return m32798a(callable);
            }
            return m32797a(function, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    public static C12286f m32796a(C12286f fVar) {
        if (fVar != null) {
            Function<C12286f, C12286f> function = f31968b;
            if (function == null) {
                return fVar;
            }
            return (C12286f) m32799a(function, (T) fVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    static C12286f m32798a(Callable<C12286f> callable) {
        try {
            C12286f fVar = (C12286f) callable.call();
            if (fVar != null) {
                return fVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            C12285a.m32747a(th);
            throw null;
        }
    }

    /* renamed from: a */
    static C12286f m32797a(Function<Callable<C12286f>, C12286f> function, Callable<C12286f> callable) {
        C12286f fVar = (C12286f) m32799a(function, (T) callable);
        if (fVar != null) {
            return fVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: a */
    static <T, R> R m32799a(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Throwable th) {
            C12285a.m32747a(th);
            throw null;
        }
    }
}
