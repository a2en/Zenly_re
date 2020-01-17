package p389io.reactivex;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p395b.p397b.C12347b;
import p389io.reactivex.p393i.p395b.p397b.C12348c;
import p389io.reactivex.p393i.p395b.p397b.C12350d;
import p389io.reactivex.p393i.p395b.p397b.C12352e;
import p389io.reactivex.p393i.p395b.p397b.C12354f;
import p389io.reactivex.p393i.p395b.p397b.C12355g;
import p389io.reactivex.p393i.p395b.p397b.C12359i;
import p389io.reactivex.p393i.p395b.p397b.C12362j;
import p389io.reactivex.p393i.p395b.p397b.C12363k;
import p389io.reactivex.p393i.p395b.p397b.C12364l;
import p389io.reactivex.p393i.p395b.p397b.C12366m;
import p389io.reactivex.p393i.p395b.p397b.C12368n;
import p389io.reactivex.p393i.p395b.p397b.C12370o;
import p389io.reactivex.p393i.p395b.p397b.C12372p;
import p389io.reactivex.p393i.p395b.p397b.C12375q;
import p389io.reactivex.p393i.p395b.p397b.C12378r;
import p389io.reactivex.p393i.p395b.p397b.C12382s;
import p389io.reactivex.p393i.p395b.p397b.C12384t;
import p389io.reactivex.p393i.p395b.p397b.C12386u;
import p389io.reactivex.p403k.C12768a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: io.reactivex.d */
public abstract class C12273d<T> implements MaybeSource<T> {
    /* renamed from: a */
    public static <T> C12272c<T> m32556a(MaybeSource<? extends T> maybeSource, MaybeSource<? extends T> maybeSource2) {
        C12324b.m32836a(maybeSource, "source1 is null");
        C12324b.m32836a(maybeSource2, "source2 is null");
        return m32557a((MaybeSource<? extends T>[]) new MaybeSource[]{maybeSource, maybeSource2});
    }

    /* renamed from: c */
    public static <T> C12273d<T> m32560c() {
        return C12768a.m33395a((C12273d<T>) C12354f.f32074e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36387a(MaybeObserver<? super T> maybeObserver);

    /* renamed from: b */
    public final C12273d<T> mo36393b(Consumer<? super T> consumer) {
        Consumer a = C12301a.m32808a();
        C12324b.m32836a(consumer, "onSuccess is null");
        Consumer consumer2 = consumer;
        Consumer a2 = C12301a.m32808a();
        Action action = C12301a.f31981c;
        C12370o oVar = new C12370o(this, a, consumer2, a2, action, action, action);
        return C12768a.m33395a((C12273d<T>) oVar);
    }

    public final void subscribe(MaybeObserver<? super T> maybeObserver) {
        C12324b.m32836a(maybeObserver, "observer is null");
        MaybeObserver a = C12768a.m33390a(this, maybeObserver);
        C12324b.m32836a(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo36387a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12285a.m32748b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public static <T> C12273d<T> m32562c(T t) {
        C12324b.m32836a(t, "item is null");
        return C12768a.m33395a((C12273d<T>) new C12363k<T>(t));
    }

    /* renamed from: a */
    public static <T> C12272c<T> m32557a(MaybeSource<? extends T>... maybeSourceArr) {
        C12324b.m32836a(maybeSourceArr, "sources is null");
        if (maybeSourceArr.length == 0) {
            return C12272c.m32533h();
        }
        if (maybeSourceArr.length == 1) {
            return C12768a.m33394a((C12272c<T>) new C12384t<T>(maybeSourceArr[0]));
        }
        return C12768a.m33394a((C12272c<T>) new C12348c<T>(maybeSourceArr));
    }

    /* renamed from: c */
    public static C12273d<Long> m32561c(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33395a((C12273d<T>) new C12382s<T>(Math.max(0, j), timeUnit, fVar));
    }

    /* renamed from: b */
    public final <R> C12273d<R> mo36394b(Function<? super T, ? extends R> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33395a((C12273d<T>) new C12364l<T>(this, function));
    }

    /* renamed from: c */
    public final C12273d<T> mo36397c(Function<? super Throwable, ? extends T> function) {
        C12324b.m32836a(function, "valueSupplier is null");
        return C12768a.m33395a((C12273d<T>) new C12368n<T>(this, function));
    }

    /* renamed from: b */
    public final C12279e<T> mo36396b() {
        if (this instanceof FuseToObservable) {
            return ((FuseToObservable) this).fuseToObservable();
        }
        return C12768a.m33396a((C12279e<T>) new C12386u<T>(this));
    }

    /* renamed from: c */
    public final Disposable mo36398c(Consumer<? super T> consumer) {
        return mo36386a(consumer, C12301a.f31983e, C12301a.f31981c);
    }

    /* renamed from: a */
    public static <T> C12273d<T> m32558a(MaybeOnSubscribe<T> maybeOnSubscribe) {
        C12324b.m32836a(maybeOnSubscribe, "onSubscribe is null");
        return C12768a.m33395a((C12273d<T>) new C12350d<T>(maybeOnSubscribe));
    }

    /* renamed from: b */
    public final C12273d<T> mo36395b(T t) {
        C12324b.m32836a(t, "item is null");
        return mo36397c(C12301a.m32820b(t));
    }

    /* renamed from: a */
    public static <T> C12273d<T> m32559a(Callable<? extends T> callable) {
        C12324b.m32836a(callable, "callable is null");
        return C12768a.m33395a((C12273d<T>) new C12362j<T>(callable));
    }

    /* renamed from: b */
    public final C12273d<T> mo36392b(C12286f fVar) {
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33395a((C12273d<T>) new C12372p<T>(this, fVar));
    }

    /* renamed from: a */
    public final C12273d<T> mo36383a(T t) {
        C12324b.m32836a(t, "defaultItem is null");
        return mo36377a((MaybeSource<? extends T>) m32562c(t));
    }

    /* renamed from: b */
    public final <E extends MaybeObserver<? super T>> E mo36388b(E e) {
        subscribe(e);
        return e;
    }

    /* renamed from: a */
    public final C12273d<T> mo36375a(long j, TimeUnit timeUnit) {
        return mo36376a(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: b */
    public final C12273d<T> mo36389b(long j, TimeUnit timeUnit) {
        return mo36390b(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: a */
    public final C12273d<T> mo36376a(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12352e eVar = new C12352e(this, Math.max(0, j), timeUnit, fVar);
        return C12768a.m33395a((C12273d<T>) eVar);
    }

    /* renamed from: b */
    public final C12273d<T> mo36390b(long j, TimeUnit timeUnit, C12286f fVar) {
        return mo36391b((MaybeSource<U>) m32561c(j, timeUnit, fVar));
    }

    /* renamed from: b */
    public final <U> C12273d<T> mo36391b(MaybeSource<U> maybeSource) {
        C12324b.m32836a(maybeSource, "timeoutIndicator is null");
        return C12768a.m33395a((C12273d<T>) new C12378r<T>(this, maybeSource, null));
    }

    /* renamed from: a */
    public final C12273d<T> mo36379a(Action action) {
        Consumer a = C12301a.m32808a();
        Consumer a2 = C12301a.m32808a();
        Consumer a3 = C12301a.m32808a();
        Action action2 = C12301a.f31981c;
        C12324b.m32836a(action, "onAfterTerminate is null");
        C12370o oVar = new C12370o(this, a, a2, a3, action2, action, C12301a.f31981c);
        return C12768a.m33395a((C12273d<T>) oVar);
    }

    /* renamed from: a */
    public final C12273d<T> mo36380a(Consumer<? super Throwable> consumer) {
        Consumer a = C12301a.m32808a();
        Consumer a2 = C12301a.m32808a();
        C12324b.m32836a(consumer, "onError is null");
        Consumer consumer2 = consumer;
        Action action = C12301a.f31981c;
        C12370o oVar = new C12370o(this, a, a2, consumer2, action, action, action);
        return C12768a.m33395a((C12273d<T>) oVar);
    }

    /* renamed from: a */
    public final C12273d<T> mo36382a(Predicate<? super T> predicate) {
        C12324b.m32836a(predicate, "predicate is null");
        return C12768a.m33395a((C12273d<T>) new C12355g<T>(this, predicate));
    }

    /* renamed from: a */
    public final <R> C12273d<R> mo36381a(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33395a((C12273d<T>) new C12359i<T>(this, function));
    }

    /* renamed from: a */
    public final C12273d<T> mo36378a(C12286f fVar) {
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33395a((C12273d<T>) new C12366m<T>(this, fVar));
    }

    /* renamed from: a */
    public final Disposable mo36384a() {
        return mo36386a(C12301a.m32808a(), C12301a.f31983e, C12301a.f31981c);
    }

    /* renamed from: a */
    public final Disposable mo36385a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return mo36386a(consumer, consumer2, C12301a.f31981c);
    }

    /* renamed from: a */
    public final Disposable mo36386a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        C12324b.m32836a(consumer, "onSuccess is null");
        C12324b.m32836a(consumer2, "onError is null");
        C12324b.m32836a(action, "onComplete is null");
        C12347b bVar = new C12347b(consumer, consumer2, action);
        mo36388b((E) bVar);
        return bVar;
    }

    /* renamed from: a */
    public final C12273d<T> mo36377a(MaybeSource<? extends T> maybeSource) {
        C12324b.m32836a(maybeSource, "other is null");
        return C12768a.m33395a((C12273d<T>) new C12375q<T>(this, maybeSource));
    }
}
