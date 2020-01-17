package p389io.reactivex;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.fuseable.FuseToFlowable;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.internal.observers.C12467f;
import p389io.reactivex.internal.observers.C12469h;
import p389io.reactivex.internal.operators.flowable.C12534y;
import p389io.reactivex.internal.operators.observable.C12553c1;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p395b.p397b.C12357h;
import p389io.reactivex.p393i.p395b.p398c.C12397e;
import p389io.reactivex.p393i.p395b.p399d.C12399a;
import p389io.reactivex.p393i.p395b.p399d.C12401b;
import p389io.reactivex.p393i.p395b.p399d.C12403c;
import p389io.reactivex.p393i.p395b.p399d.C12406e;
import p389io.reactivex.p393i.p395b.p399d.C12408f;
import p389io.reactivex.p393i.p395b.p399d.C12410g;
import p389io.reactivex.p393i.p395b.p399d.C12412h;
import p389io.reactivex.p393i.p395b.p399d.C12414i;
import p389io.reactivex.p393i.p395b.p399d.C12416j;
import p389io.reactivex.p393i.p395b.p399d.C12417k;
import p389io.reactivex.p393i.p395b.p399d.C12420l;
import p389io.reactivex.p393i.p395b.p399d.C12422m;
import p389io.reactivex.p393i.p395b.p399d.C12423n;
import p389io.reactivex.p393i.p395b.p399d.C12424o;
import p389io.reactivex.p393i.p395b.p399d.C12426p;
import p389io.reactivex.p393i.p395b.p399d.C12427q;
import p389io.reactivex.p393i.p395b.p399d.C12429r;
import p389io.reactivex.p393i.p395b.p399d.C12431s;
import p389io.reactivex.p393i.p395b.p399d.C12433t;
import p389io.reactivex.p393i.p395b.p399d.C12436u;
import p389io.reactivex.p393i.p395b.p399d.C12438v;
import p389io.reactivex.p393i.p395b.p399d.C12440w;
import p389io.reactivex.p393i.p395b.p399d.C12442x;
import p389io.reactivex.p403k.C12768a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: io.reactivex.g */
public abstract class C12291g<T> implements SingleSource<T> {
    /* renamed from: a */
    public static <T> C12291g<T> m32760a(SingleOnSubscribe<T> singleOnSubscribe) {
        C12324b.m32836a(singleOnSubscribe, "source is null");
        return C12768a.m33401a((C12291g<T>) new C12401b<T>(singleOnSubscribe));
    }

    /* renamed from: b */
    public static <T> C12291g<T> m32768b(Callable<? extends Throwable> callable) {
        C12324b.m32836a(callable, "errorSupplier is null");
        return C12768a.m33401a((C12291g<T>) new C12416j<T>(callable));
    }

    /* renamed from: c */
    public static <T> C12291g<T> m32769c(Callable<? extends T> callable) {
        C12324b.m32836a(callable, "callable is null");
        return C12768a.m33401a((C12291g<T>) new C12422m<T>(callable));
    }

    /* renamed from: f */
    public static <T> C12291g<T> m32770f() {
        return C12768a.m33401a(C12426p.f32232e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36541a(SingleObserver<? super T> singleObserver);

    /* renamed from: d */
    public final <R> C12291g<R> mo36552d(Function<? super T, ? extends R> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33401a((C12291g<T>) new C12424o<T>(this, function));
    }

    /* renamed from: e */
    public final C12291g<T> mo36554e(Function<Throwable, ? extends T> function) {
        C12324b.m32836a(function, "resumeFunction is null");
        return C12768a.m33401a((C12291g<T>) new C12429r<T>(this, function, null));
    }

    public final void subscribe(SingleObserver<? super T> singleObserver) {
        C12324b.m32836a(singleObserver, "observer is null");
        SingleObserver a = C12768a.m33392a(this, singleObserver);
        C12324b.m32836a(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo36541a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12285a.m32748b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public final C12291g<T> mo36555f(Function<? super C12272c<Throwable>, ? extends Publisher<?>> function) {
        return m32762a(mo36550d().mo36371d(function));
    }

    /* renamed from: a */
    public static <T> C12291g<T> m32765a(Callable<? extends SingleSource<? extends T>> callable) {
        C12324b.m32836a(callable, "singleSupplier is null");
        return C12768a.m33401a((C12291g<T>) new C12403c<T>(callable));
    }

    /* renamed from: b */
    public static <T> C12291g<T> m32767b(T t) {
        C12324b.m32836a(t, "item is null");
        return C12768a.m33401a((C12291g<T>) new C12423n<T>(t));
    }

    /* renamed from: c */
    public final C12291g<T> mo36549c(Consumer<? super T> consumer) {
        C12324b.m32836a(consumer, "onSuccess is null");
        return C12768a.m33401a((C12291g<T>) new C12414i<T>(this, consumer));
    }

    /* renamed from: d */
    public final Disposable mo36551d(Consumer<? super T> consumer) {
        return mo36533a(consumer, C12301a.f31983e);
    }

    /* renamed from: e */
    public final C12279e<T> mo36553e() {
        if (this instanceof FuseToObservable) {
            return ((FuseToObservable) this).fuseToObservable();
        }
        return C12768a.m33396a((C12279e<T>) new C12440w<T>(this));
    }

    /* renamed from: d */
    public final C12272c<T> mo36550d() {
        if (this instanceof FuseToFlowable) {
            return ((FuseToFlowable) this).fuseToFlowable();
        }
        return C12768a.m33394a((C12272c<T>) new C12438v<T>(this));
    }

    /* renamed from: a */
    public static <T> C12291g<T> m32764a(Throwable th) {
        C12324b.m32836a(th, "exception is null");
        return m32768b(C12301a.m32818a(th));
    }

    /* renamed from: b */
    public static C12291g<Long> m32766b(long j, TimeUnit timeUnit) {
        return m32757a(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: c */
    public final <R> C12279e<R> mo36548c(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33396a((C12279e<T>) new C12397e<T>(this, function));
    }

    /* renamed from: b */
    public final C12291g<T> mo36543b() {
        return C12768a.m33401a((C12291g<T>) new C12399a<T>(this));
    }

    /* renamed from: a */
    public static <T> C12291g<T> m32759a(ObservableSource<? extends T> observableSource) {
        C12324b.m32836a(observableSource, "observableSource is null");
        return C12768a.m33401a((C12291g<T>) new C12553c1<T>(observableSource, null));
    }

    /* renamed from: b */
    public final C12291g<T> mo36546b(Consumer<? super Disposable> consumer) {
        C12324b.m32836a(consumer, "onSubscribe is null");
        return C12768a.m33401a((C12291g<T>) new C12412h<T>(this, consumer));
    }

    /* renamed from: c */
    public final Disposable mo36547c() {
        return mo36533a(C12301a.m32808a(), C12301a.f31983e);
    }

    /* renamed from: a */
    public static C12291g<Long> m32757a(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33401a((C12291g<T>) new C12436u<T>(j, timeUnit, fVar));
    }

    /* renamed from: b */
    public final C12291g<T> mo36545b(Action action) {
        C12324b.m32836a(action, "onDispose is null");
        return C12768a.m33401a((C12291g<T>) new C12408f<T>(this, action));
    }

    /* renamed from: b */
    public final C12271b mo36542b(Function<? super T, ? extends CompletableSource> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33393a((C12271b) new C12420l(this, function));
    }

    /* renamed from: a */
    public static <T1, T2, R> C12291g<R> m32761a(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C12324b.m32836a(singleSource, "source1 is null");
        C12324b.m32836a(singleSource2, "source2 is null");
        return m32763a(C12301a.m32810a(biFunction), (SingleSource<? extends T>[]) new SingleSource[]{singleSource, singleSource2});
    }

    /* renamed from: b */
    public final C12291g<T> mo36544b(C12286f fVar) {
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33401a((C12291g<T>) new C12431s<T>(this, fVar));
    }

    /* renamed from: a */
    public static <T, R> C12291g<R> m32763a(Function<? super Object[], ? extends R> function, SingleSource<? extends T>... singleSourceArr) {
        C12324b.m32836a(function, "zipper is null");
        C12324b.m32836a(singleSourceArr, "sources is null");
        if (singleSourceArr.length == 0) {
            return m32764a((Throwable) new NoSuchElementException());
        }
        return C12768a.m33401a((C12291g<T>) new C12442x<T>(singleSourceArr, function));
    }

    /* renamed from: a */
    public final C12291g<T> mo36536a(Action action) {
        C12324b.m32836a(action, "onAfterTerminate is null");
        return C12768a.m33401a((C12291g<T>) new C12406e<T>(this, action));
    }

    /* renamed from: a */
    public final C12291g<T> mo36537a(Consumer<? super Throwable> consumer) {
        C12324b.m32836a(consumer, "onError is null");
        return C12768a.m33401a((C12291g<T>) new C12410g<T>(this, consumer));
    }

    /* renamed from: a */
    public final C12273d<T> mo36532a(Predicate<? super T> predicate) {
        C12324b.m32836a(predicate, "predicate is null");
        return C12768a.m33395a((C12273d<T>) new C12357h<T>(this, predicate));
    }

    /* renamed from: a */
    public final <R> C12291g<R> mo36538a(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33401a((C12291g<T>) new C12417k<T>(this, function));
    }

    /* renamed from: a */
    public final T mo36540a() {
        C12467f fVar = new C12467f();
        subscribe(fVar);
        return fVar.mo36672a();
    }

    /* renamed from: a */
    public final C12291g<T> mo36535a(C12286f fVar) {
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33401a((C12291g<T>) new C12427q<T>(this, fVar));
    }

    /* renamed from: a */
    public final C12291g<T> mo36539a(T t) {
        C12324b.m32836a(t, "value is null");
        return C12768a.m33401a((C12291g<T>) new C12429r<T>(this, null, t));
    }

    /* renamed from: a */
    public final Disposable mo36533a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        C12324b.m32836a(consumer, "onSuccess is null");
        C12324b.m32836a(consumer2, "onError is null");
        C12469h hVar = new C12469h(consumer, consumer2);
        subscribe(hVar);
        return hVar;
    }

    /* renamed from: a */
    public final C12291g<T> mo36534a(long j, TimeUnit timeUnit) {
        return m32758a(j, timeUnit, C12802a.m33490a(), null);
    }

    /* renamed from: a */
    private C12291g<T> m32758a(long j, TimeUnit timeUnit, C12286f fVar, SingleSource<? extends T> singleSource) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12433t tVar = new C12433t(this, j, timeUnit, fVar, singleSource);
        return C12768a.m33401a((C12291g<T>) tVar);
    }

    /* renamed from: a */
    private static <T> C12291g<T> m32762a(C12272c<T> cVar) {
        return C12768a.m33401a((C12291g<T>) new C12534y<T>(cVar, null));
    }
}
