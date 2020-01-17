package p389io.reactivex;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.observers.C12468g;
import p389io.reactivex.internal.observers.C12472k;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p395b.p396a.C12326a;
import p389io.reactivex.p393i.p395b.p396a.C12329b;
import p389io.reactivex.p393i.p395b.p396a.C12331c;
import p389io.reactivex.p393i.p395b.p396a.C12333d;
import p389io.reactivex.p393i.p395b.p396a.C12335e;
import p389io.reactivex.p393i.p395b.p396a.C12336f;
import p389io.reactivex.p393i.p395b.p396a.C12337g;
import p389io.reactivex.p393i.p395b.p396a.C12338h;
import p389io.reactivex.p393i.p395b.p396a.C12340i;
import p389io.reactivex.p393i.p395b.p396a.C12342j;
import p389io.reactivex.p393i.p395b.p396a.C12344k;
import p389io.reactivex.p393i.p395b.p398c.C12388a;
import p389io.reactivex.p393i.p395b.p399d.C12404d;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.b */
public abstract class C12271b implements CompletableSource {
    /* renamed from: a */
    public static C12271b m32503a(CompletableOnSubscribe completableOnSubscribe) {
        C12324b.m32836a(completableOnSubscribe, "source is null");
        return C12768a.m33393a((C12271b) new C12331c(completableOnSubscribe));
    }

    /* renamed from: b */
    public static C12271b m32506b(Action action) {
        C12324b.m32836a(action, "run is null");
        return C12768a.m33393a((C12271b) new C12336f(action));
    }

    /* renamed from: c */
    public static C12271b m32508c() {
        return C12768a.m33393a(C12335e.f32023e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36349a(CompletableObserver completableObserver);

    public final void subscribe(CompletableObserver completableObserver) {
        C12324b.m32836a(completableObserver, "observer is null");
        try {
            CompletableObserver a = C12768a.m33389a(this, completableObserver);
            C12324b.m32836a(a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo36349a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12768a.m33415b(th);
            throw m32505a(th);
        }
    }

    /* renamed from: a */
    private static NullPointerException m32505a(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: b */
    public static C12271b m32507b(Callable<?> callable) {
        C12324b.m32836a(callable, "callable is null");
        return C12768a.m33393a((C12271b) new C12337g(callable));
    }

    /* renamed from: a */
    public final <T> C12279e<T> mo36346a(ObservableSource<T> observableSource) {
        C12324b.m32836a(observableSource, "next is null");
        return C12768a.m33396a((C12279e<T>) new C12388a<T>(this, observableSource));
    }

    /* renamed from: b */
    public final Disposable mo36351b() {
        C12472k kVar = new C12472k();
        subscribe(kVar);
        return kVar;
    }

    /* renamed from: a */
    public final <T> C12291g<T> mo36347a(SingleSource<T> singleSource) {
        C12324b.m32836a(singleSource, "next is null");
        return C12768a.m33401a((C12291g<T>) new C12404d<T>(singleSource, this));
    }

    /* renamed from: b */
    public final C12271b mo36350b(C12286f fVar) {
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33393a((C12271b) new C12342j(this, fVar));
    }

    /* renamed from: a */
    public final C12271b mo36341a(CompletableSource completableSource) {
        C12324b.m32836a(completableSource, "next is null");
        return C12768a.m33393a((C12271b) new C12326a(this, completableSource));
    }

    /* renamed from: a */
    public final C12271b mo36338a() {
        return C12768a.m33393a((C12271b) new C12329b(this));
    }

    /* renamed from: a */
    public final C12271b mo36339a(long j, TimeUnit timeUnit, C12286f fVar) {
        return mo36340a(j, timeUnit, fVar, false);
    }

    /* renamed from: a */
    public final C12271b mo36340a(long j, TimeUnit timeUnit, C12286f fVar, boolean z) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12333d dVar = new C12333d(this, j, timeUnit, fVar, z);
        return C12768a.m33393a((C12271b) dVar);
    }

    /* renamed from: a */
    public final C12271b mo36343a(Consumer<? super Throwable> consumer) {
        Consumer a = C12301a.m32808a();
        Action action = C12301a.f31981c;
        return m32504a(a, consumer, action, action, action, action);
    }

    /* renamed from: a */
    private C12271b m32504a(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        C12324b.m32836a(consumer, "onSubscribe is null");
        C12324b.m32836a(consumer2, "onError is null");
        C12324b.m32836a(action, "onComplete is null");
        C12324b.m32836a(action2, "onTerminate is null");
        C12324b.m32836a(action3, "onAfterTerminate is null");
        C12324b.m32836a(action4, "onDispose is null");
        C12340i iVar = new C12340i(this, consumer, consumer2, action, action2, action3, action4);
        return C12768a.m33393a((C12271b) iVar);
    }

    /* renamed from: a */
    public final C12271b mo36342a(C12286f fVar) {
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33393a((C12271b) new C12338h(this, fVar));
    }

    /* renamed from: a */
    public final Disposable mo36345a(Action action, Consumer<? super Throwable> consumer) {
        C12324b.m32836a(consumer, "onError is null");
        C12324b.m32836a(action, "onComplete is null");
        C12468g gVar = new C12468g(consumer, action);
        subscribe(gVar);
        return gVar;
    }

    /* renamed from: a */
    public final Disposable mo36344a(Action action) {
        C12324b.m32836a(action, "onComplete is null");
        C12468g gVar = new C12468g(action);
        subscribe(gVar);
        return gVar;
    }

    /* renamed from: a */
    public final <T> C12291g<T> mo36348a(Callable<? extends T> callable) {
        C12324b.m32836a(callable, "completionValueSupplier is null");
        return C12768a.m33401a((C12291g<T>) new C12344k<T>(this, callable, null));
    }
}
