package p389io.reactivex;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.functions.Function4;
import p389io.reactivex.functions.Function5;
import p389io.reactivex.functions.Function6;
import p389io.reactivex.functions.Function8;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.fuseable.ScalarCallable;
import p389io.reactivex.internal.observers.C12466e;
import p389io.reactivex.internal.observers.C12474m;
import p389io.reactivex.internal.operators.flowable.C12501i;
import p389io.reactivex.internal.operators.flowable.C12518q;
import p389io.reactivex.internal.operators.observable.C12539a0;
import p389io.reactivex.internal.operators.observable.C12541a1;
import p389io.reactivex.internal.operators.observable.C12546b0;
import p389io.reactivex.internal.operators.observable.C12548b1;
import p389io.reactivex.internal.operators.observable.C12550c;
import p389io.reactivex.internal.operators.observable.C12552c0;
import p389io.reactivex.internal.operators.observable.C12556d0;
import p389io.reactivex.internal.operators.observable.C12557d1;
import p389io.reactivex.internal.operators.observable.C12559e;
import p389io.reactivex.internal.operators.observable.C12562e0;
import p389io.reactivex.internal.operators.observable.C12564e1;
import p389io.reactivex.internal.operators.observable.C12567f;
import p389io.reactivex.internal.operators.observable.C12575f1;
import p389io.reactivex.internal.operators.observable.C12577g;
import p389io.reactivex.internal.operators.observable.C12580g0;
import p389io.reactivex.internal.operators.observable.C12581g1;
import p389io.reactivex.internal.operators.observable.C12584h;
import p389io.reactivex.internal.operators.observable.C12587h0;
import p389io.reactivex.internal.operators.observable.C12589h1;
import p389io.reactivex.internal.operators.observable.C12591i;
import p389io.reactivex.internal.operators.observable.C12596i0;
import p389io.reactivex.internal.operators.observable.C12598i1;
import p389io.reactivex.internal.operators.observable.C12602j0;
import p389io.reactivex.internal.operators.observable.C12604j1;
import p389io.reactivex.internal.operators.observable.C12606k;
import p389io.reactivex.internal.operators.observable.C12608k0;
import p389io.reactivex.internal.operators.observable.C12610k1;
import p389io.reactivex.internal.operators.observable.C12613l;
import p389io.reactivex.internal.operators.observable.C12616l0;
import p389io.reactivex.internal.operators.observable.C12617l1;
import p389io.reactivex.internal.operators.observable.C12619m;
import p389io.reactivex.internal.operators.observable.C12622m0;
import p389io.reactivex.internal.operators.observable.C12624m1;
import p389io.reactivex.internal.operators.observable.C12626n;
import p389io.reactivex.internal.operators.observable.C12629n0;
import p389io.reactivex.internal.operators.observable.C12631n1;
import p389io.reactivex.internal.operators.observable.C12633o;
import p389io.reactivex.internal.operators.observable.C12635o0;
import p389io.reactivex.internal.operators.observable.C12637o1;
import p389io.reactivex.internal.operators.observable.C12643p;
import p389io.reactivex.internal.operators.observable.C12645p0;
import p389io.reactivex.internal.operators.observable.C12647p1;
import p389io.reactivex.internal.operators.observable.C12649q;
import p389io.reactivex.internal.operators.observable.C12651q0;
import p389io.reactivex.internal.operators.observable.C12655r;
import p389io.reactivex.internal.operators.observable.C12656r0;
import p389io.reactivex.internal.operators.observable.C12660r1;
import p389io.reactivex.internal.operators.observable.C12667s1;
import p389io.reactivex.internal.operators.observable.C12670t;
import p389io.reactivex.internal.operators.observable.C12672t0;
import p389io.reactivex.internal.operators.observable.C12674t1;
import p389io.reactivex.internal.operators.observable.C12677u;
import p389io.reactivex.internal.operators.observable.C12682u1;
import p389io.reactivex.internal.operators.observable.C12684v;
import p389io.reactivex.internal.operators.observable.C12685v0;
import p389io.reactivex.internal.operators.observable.C12687w;
import p389io.reactivex.internal.operators.observable.C12689w0;
import p389io.reactivex.internal.operators.observable.C12701x;
import p389io.reactivex.internal.operators.observable.C12704x0;
import p389io.reactivex.internal.operators.observable.C12706y;
import p389io.reactivex.internal.operators.observable.C12709y0;
import p389io.reactivex.internal.operators.observable.C12712z;
import p389io.reactivex.internal.operators.observable.C12715z0;
import p389io.reactivex.internal.util.C12751a;
import p389io.reactivex.internal.util.C12756f;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p395b.p398c.C12390b;
import p389io.reactivex.p393i.p395b.p398c.C12393c;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p403k.C12768a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: io.reactivex.e */
public abstract class C12279e<T> implements ObservableSource<T> {

    /* renamed from: io.reactivex.e$a */
    static /* synthetic */ class C12280a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31945a = new int[C12270a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.reactivex.a[] r0 = p389io.reactivex.C12270a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31945a = r0
                int[] r0 = f31945a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.a r1 = p389io.reactivex.C12270a.DROP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f31945a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.a r1 = p389io.reactivex.C12270a.LATEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f31945a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.reactivex.a r1 = p389io.reactivex.C12270a.MISSING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f31945a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.reactivex.a r1 = p389io.reactivex.C12270a.ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.C12279e.C12280a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static <T, R> C12279e<R> m32612a(Function<? super Object[], ? extends R> function, int i, ObservableSource<? extends T>... observableSourceArr) {
        return m32619a(observableSourceArr, function, i);
    }

    /* renamed from: b */
    public static <T> C12279e<T> m32623b(Iterable<? extends T> iterable) {
        C12324b.m32836a(iterable, "source is null");
        return C12768a.m33396a((C12279e<T>) new C12562e0<T>(iterable));
    }

    /* renamed from: c */
    public static <T> C12279e<T> m32624c(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return m32623b(iterable).mo36490e(C12301a.m32819b());
    }

    /* renamed from: e */
    public static C12279e<Long> m32625e(long j, TimeUnit timeUnit, C12286f fVar) {
        return m32600a(j, j, timeUnit, fVar);
    }

    /* renamed from: f */
    public static C12279e<Long> m32627f(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33396a((C12279e<T>) new C12647p1<T>(Math.max(j, 0), timeUnit, fVar));
    }

    /* renamed from: g */
    public static <T> C12279e<T> m32629g(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return m32603a(observableSource, m32632p());
    }

    /* renamed from: h */
    public static C12279e<Long> m32630h(long j, TimeUnit timeUnit) {
        return m32627f(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: p */
    public static int m32632p() {
        return C12272c.m32532g();
    }

    /* renamed from: q */
    public static <T> C12279e<T> m32633q() {
        return C12768a.m33396a(C12684v.f33049e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35836a(Observer<? super T> observer);

    /* renamed from: d */
    public final C12279e<T> mo36477d() {
        return mo36484d(C12301a.m32819b());
    }

    /* renamed from: i */
    public final C12273d<T> mo36500i() {
        return C12768a.m33395a((C12273d<T>) new C12622m0<T>(this));
    }

    /* renamed from: j */
    public final C12279e<T> mo36502j(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        C12324b.m32836a(function, "resumeFunction is null");
        return C12768a.m33396a((C12279e<T>) new C12645p0<T>(this, function, false));
    }

    /* renamed from: k */
    public final C12279e<T> mo36504k(Function<? super Throwable, ? extends T> function) {
        C12324b.m32836a(function, "valueSupplier is null");
        return C12768a.m33396a((C12279e<T>) new C12651q0<T>(this, function));
    }

    /* renamed from: l */
    public final C12279e<T> mo36507l(Function<? super C12279e<Throwable>, ? extends ObservableSource<?>> function) {
        C12324b.m32836a(function, "handler is null");
        return C12768a.m33396a((C12279e<T>) new C12709y0<T>(this, function));
    }

    /* renamed from: m */
    public final Disposable mo36508m() {
        return mo36414a(C12301a.m32808a(), C12301a.f31983e, C12301a.f31981c, C12301a.m32808a());
    }

    /* renamed from: n */
    public final <R> C12279e<R> mo36510n(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33396a((C12279e<T>) new C12393c<T>(this, function, false));
    }

    /* renamed from: o */
    public final C12291g<List<T>> mo36512o() {
        return mo36462b(C12301a.m32821c());
    }

    public final void subscribe(Observer<? super T> observer) {
        C12324b.m32836a(observer, "observer is null");
        try {
            Observer a = C12768a.m33391a(this, observer);
            C12324b.m32836a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo35836a(a);
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
    public static <T, R> C12279e<R> m32614a(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return m32615a(iterable, function, m32632p());
    }

    /* renamed from: e */
    public static <T> C12279e<T> m32626e(T t) {
        C12324b.m32836a(t, "item is null");
        return C12768a.m33396a((C12279e<T>) new C12616l0<T>(t));
    }

    /* renamed from: g */
    public static C12279e<Long> m32628g(long j, TimeUnit timeUnit) {
        return m32600a(j, j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: h */
    public static <T> C12279e<T> m32631h(ObservableSource<T> observableSource) {
        C12324b.m32836a(observableSource, "source is null");
        if (observableSource instanceof C12279e) {
            return C12768a.m33396a((C12279e) observableSource);
        }
        return C12768a.m33396a((C12279e<T>) new C12580g0<T>(observableSource));
    }

    /* renamed from: c */
    public final <R> C12279e<R> mo36469c(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return mo36457b(function, 2);
    }

    /* renamed from: d */
    public final <K> C12279e<T> mo36484d(Function<? super T, K> function) {
        C12324b.m32836a(function, "keySelector is null");
        return C12768a.m33396a((C12279e<T>) new C12633o<T>(this, function, C12324b.m32835a()));
    }

    /* renamed from: i */
    public final <R> C12279e<R> mo36501i(Function<? super T, ? extends R> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33396a((C12279e<T>) new C12629n0<T>(this, function));
    }

    /* renamed from: m */
    public final <R> C12279e<R> mo36509m(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return mo36470c(function, m32632p());
    }

    /* renamed from: a */
    public static <T, R> C12279e<R> m32615a(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        C12324b.m32836a(iterable, "sources is null");
        C12324b.m32836a(function, "combiner is null");
        C12324b.m32833a(i, "bufferSize");
        C12584h hVar = new C12584h(null, iterable, function, i << 1, false);
        return C12768a.m33396a((C12279e<T>) hVar);
    }

    /* renamed from: b */
    public static <T> C12279e<T> m32621b(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        return m32620a((T[]) new ObservableSource[]{observableSource, observableSource2}).mo36437a(C12301a.m32819b(), false, 2);
    }

    /* renamed from: c */
    public final C12291g<Long> mo36474c() {
        return C12768a.m33401a((C12291g<T>) new C12606k<T>(this));
    }

    /* renamed from: g */
    public final <R> C12279e<R> mo36497g(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return mo36458b(function, false);
    }

    /* renamed from: j */
    public final C12767a<T> mo36503j() {
        return C12656r0.m33174i(this);
    }

    /* renamed from: k */
    public final C12767a<T> mo36505k() {
        return C12689w0.m33215i(this);
    }

    /* renamed from: l */
    public final C12279e<T> mo36506l() {
        return mo36503j().mo36947s();
    }

    /* renamed from: n */
    public final C12291g<List<T>> mo36511n() {
        return mo36491e(16);
    }

    /* renamed from: c */
    public final C12279e<T> mo36464c(long j, TimeUnit timeUnit) {
        return mo36450b(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: d */
    public final C12279e<T> mo36483d(Action action) {
        C12324b.m32836a(action, "onTerminate is null");
        return m32611a(C12301a.m32808a(), C12301a.m32809a(action), action, C12301a.f31981c);
    }

    /* renamed from: e */
    public final C12273d<T> mo36486e() {
        return mo36410a(0);
    }

    /* renamed from: f */
    public final C12291g<T> mo36495f() {
        return mo36461b(0);
    }

    /* renamed from: g */
    public final C12279e<T> mo36496g() {
        return C12768a.m33396a((C12279e<T>) new C12587h0<T>(this));
    }

    /* renamed from: c */
    public final C12279e<T> mo36467c(Action action) {
        return mo36433a(C12301a.m32808a(), action);
    }

    /* renamed from: e */
    public final <R> C12279e<R> mo36490e(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return mo36436a(function, false);
    }

    /* renamed from: f */
    public final <U> C12279e<U> mo36494f(Function<? super T, ? extends Iterable<? extends U>> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33396a((C12279e<T>) new C12539a0<T>(this, function));
    }

    /* renamed from: b */
    public static <T1, T2, R> C12279e<R> m32622b(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        return m32613a(C12301a.m32810a(biFunction), false, m32632p(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2});
    }

    /* renamed from: c */
    public final C12279e<T> mo36468c(Consumer<? super Disposable> consumer) {
        return mo36433a(consumer, C12301a.f31981c);
    }

    /* renamed from: e */
    public final C12279e<T> mo36489e(ObservableSource<? extends T> observableSource) {
        C12324b.m32836a(observableSource, "other is null");
        return C12768a.m33396a((C12279e<T>) new C12575f1<T>(this, observableSource));
    }

    /* renamed from: h */
    public final <R> C12279e<R> mo36499h(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return mo36471c(function, false);
    }

    /* renamed from: a */
    public static <T, R> C12279e<R> m32619a(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i) {
        C12324b.m32836a(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return m32633q();
        }
        C12324b.m32836a(function, "combiner is null");
        C12324b.m32833a(i, "bufferSize");
        C12584h hVar = new C12584h(observableSourceArr, null, function, i << 1, false);
        return C12768a.m33396a((C12279e<T>) hVar);
    }

    /* renamed from: c */
    public final <R> C12279e<R> mo36471c(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33396a((C12279e<T>) new C12712z<T>(this, function, z));
    }

    /* renamed from: f */
    public final <U> C12279e<T> mo36493f(ObservableSource<U> observableSource) {
        C12324b.m32836a(observableSource, "other is null");
        return C12768a.m33396a((C12279e<T>) new C12610k1<T>(this, observableSource));
    }

    /* renamed from: h */
    public final C12271b mo36498h() {
        return C12768a.m33393a((C12271b) new C12602j0(this));
    }

    /* renamed from: d */
    public final C12279e<T> mo36480d(long j, TimeUnit timeUnit) {
        return mo36465c(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: e */
    public final C12279e<T> mo36487e(long j) {
        if (j >= 0) {
            return C12768a.m33396a((C12279e<T>) new C12589h1<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final C12279e<T> mo36447b() {
        return mo36448b(16);
    }

    /* renamed from: c */
    public final C12279e<T> mo36466c(ObservableSource<? extends T> observableSource) {
        C12324b.m32836a(observableSource, "next is null");
        return mo36502j(C12301a.m32820b(observableSource));
    }

    /* renamed from: d */
    public final C12279e<T> mo36479d(long j) {
        if (j <= 0) {
            return C12768a.m33396a(this);
        }
        return C12768a.m33396a((C12279e<T>) new C12557d1<T>(this, j));
    }

    /* renamed from: f */
    public final C12279e<T> mo36492f(long j, TimeUnit timeUnit) {
        return mo36480d(j, timeUnit);
    }

    /* renamed from: b */
    public final C12279e<T> mo36448b(int i) {
        C12324b.m32833a(i, "initialCapacity");
        return C12768a.m33396a((C12279e<T>) new C12577g<T>(this, i));
    }

    /* renamed from: e */
    public final C12279e<T> mo36488e(long j, TimeUnit timeUnit) {
        return mo36481d(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: c */
    public final C12279e<T> mo36473c(T t) {
        C12324b.m32836a(t, "item is null");
        return mo36504k(C12301a.m32820b(t));
    }

    /* renamed from: d */
    public final C12279e<T> mo36482d(ObservableSource<? extends T> observableSource) {
        C12324b.m32836a(observableSource, "other is null");
        return m32618a((ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, this});
    }

    /* renamed from: e */
    public final C12291g<List<T>> mo36491e(int i) {
        C12324b.m32833a(i, "capacityHint");
        return C12768a.m33401a((C12291g<T>) new C12660r1<T>(this, i));
    }

    /* renamed from: b */
    public final <U> C12279e<U> mo36456b(Function<? super T, ? extends Iterable<? extends U>> function) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33396a((C12279e<T>) new C12539a0<T>(this, function));
    }

    /* renamed from: a */
    public static <T1, T2, R> C12279e<R> m32610a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        return m32612a(C12301a.m32810a(biFunction), m32632p(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2});
    }

    /* renamed from: c */
    public final C12279e<T> mo36463c(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("times >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return m32633q();
        } else {
            return C12768a.m33396a((C12279e<T>) new C12685v0<T>(this, j));
        }
    }

    /* renamed from: d */
    public final C12279e<T> mo36485d(T t) {
        C12324b.m32836a(t, "item is null");
        return m32618a((ObservableSource<? extends T>[]) new ObservableSource[]{m32626e(t), this});
    }

    /* renamed from: b */
    public final <R> C12279e<R> mo36457b(Function<? super T, ? extends SingleSource<? extends R>> function, int i) {
        C12324b.m32836a(function, "mapper is null");
        C12324b.m32833a(i, "prefetch");
        return C12768a.m33396a((C12279e<T>) new C12390b<T>(this, function, C12756f.IMMEDIATE, i));
    }

    /* renamed from: d */
    public final Disposable mo36476d(Consumer<? super T> consumer) {
        return mo36414a(consumer, C12301a.f31983e, C12301a.f31981c, C12301a.m32808a());
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> C12279e<R> m32609a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        C12324b.m32836a(observableSource3, "source3 is null");
        return m32612a(C12301a.m32811a(function3), m32632p(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3});
    }

    /* renamed from: c */
    public final C12767a<T> mo36475c(int i) {
        C12324b.m32833a(i, "bufferSize");
        return C12689w0.m33214b(this, i);
    }

    /* renamed from: d */
    public final C12279e<T> mo36478d(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i == 0) {
            return C12768a.m33396a((C12279e<T>) new C12596i0<T>(this));
        } else {
            if (i == 1) {
                return C12768a.m33396a((C12279e<T>) new C12604j1<T>(this));
            }
            return C12768a.m33396a((C12279e<T>) new C12598i1<T>(this, i));
        }
    }

    /* renamed from: b */
    public final C12279e<T> mo36449b(long j, TimeUnit timeUnit) {
        return mo36420a(j, timeUnit, C12802a.m33490a());
    }

    /* renamed from: b */
    public final C12279e<T> mo36460b(T t) {
        C12324b.m32836a(t, "defaultItem is null");
        return mo36489e((ObservableSource<? extends T>) m32626e(t));
    }

    /* renamed from: c */
    public final C12279e<T> mo36465c(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12715z0 z0Var = new C12715z0(this, j, timeUnit, fVar, false);
        return C12768a.m33396a((C12279e<T>) z0Var);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> C12279e<R> m32608a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        C12324b.m32836a(observableSource3, "source3 is null");
        C12324b.m32836a(observableSource4, "source4 is null");
        return m32612a(C12301a.m32812a(function4), m32632p(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4});
    }

    /* renamed from: b */
    public final C12279e<T> mo36450b(long j, TimeUnit timeUnit, C12286f fVar) {
        return mo36425a((ObservableSource<U>) m32627f(j, timeUnit, fVar));
    }

    /* renamed from: d */
    public final C12279e<T> mo36481d(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12624m1 m1Var = new C12624m1(this, j, timeUnit, fVar);
        return C12768a.m33396a((C12279e<T>) m1Var);
    }

    /* renamed from: b */
    public final C12279e<T> mo36453b(Action action) {
        return m32611a(C12301a.m32808a(), C12301a.m32808a(), action, C12301a.f31981c);
    }

    /* renamed from: c */
    public final <R> C12279e<R> mo36470c(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C12324b.m32836a(function, "mapper is null");
        C12324b.m32833a(i, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return C12768a.m33396a((C12279e<T>) new C12581g1<T>(this, function, i, false));
        }
        Object call = ((ScalarCallable) this).call();
        if (call == null) {
            return m32633q();
        }
        return C12541a1.m33072a(call, function);
    }

    /* renamed from: b */
    public final C12279e<T> mo36455b(Consumer<? super T> consumer) {
        Consumer a = C12301a.m32808a();
        Action action = C12301a.f31981c;
        return m32611a(consumer, a, action, action);
    }

    /* renamed from: b */
    public final C12291g<T> mo36461b(long j) {
        if (j >= 0) {
            return C12768a.m33401a((C12291g<T>) new C12677u<T>(this, j, null));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> C12279e<R> m32607a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        C12324b.m32836a(observableSource3, "source3 is null");
        C12324b.m32836a(observableSource4, "source4 is null");
        C12324b.m32836a(observableSource5, "source5 is null");
        return m32612a(C12301a.m32813a(function5), m32632p(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5});
    }

    /* renamed from: b */
    public final C12279e<T> mo36459b(Predicate<? super T> predicate) {
        C12324b.m32836a(predicate, "predicate is null");
        return C12768a.m33396a((C12279e<T>) new C12687w<T>(this, predicate));
    }

    /* renamed from: b */
    public final <R> C12279e<R> mo36458b(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        C12324b.m32836a(function, "mapper is null");
        return C12768a.m33396a((C12279e<T>) new C12706y<T>(this, function, z));
    }

    /* renamed from: c */
    public final C12279e<T> mo36472c(Predicate<? super T> predicate) {
        C12324b.m32836a(predicate, "stopPredicate is null");
        return C12768a.m33396a((C12279e<T>) new C12617l1<T>(this, predicate));
    }

    /* renamed from: b */
    public final C12279e<T> mo36451b(ObservableSource<? extends T> observableSource) {
        C12324b.m32836a(observableSource, "other is null");
        return m32621b((ObservableSource<? extends T>) this, observableSource);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> C12279e<R> m32606a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        C12324b.m32836a(observableSource3, "source3 is null");
        C12324b.m32836a(observableSource4, "source4 is null");
        C12324b.m32836a(observableSource5, "source5 is null");
        C12324b.m32836a(observableSource6, "source6 is null");
        return m32612a(C12301a.m32814a(function6), m32632p(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6});
    }

    /* renamed from: b */
    public final C12279e<T> mo36454b(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        C12324b.m32836a(biPredicate, "predicate is null");
        return C12768a.m33396a((C12279e<T>) new C12704x0<T>(this, biPredicate));
    }

    /* renamed from: b */
    public final C12279e<T> mo36452b(C12286f fVar) {
        C12324b.m32836a(fVar, "scheduler is null");
        return C12768a.m33396a((C12279e<T>) new C12564e1<T>(this, fVar));
    }

    /* renamed from: b */
    public final C12291g<List<T>> mo36462b(Comparator<? super T> comparator) {
        C12324b.m32836a(comparator, "comparator is null");
        return mo36511n().mo36552d(C12301a.m32816a(comparator));
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C12279e<R> m32605a(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        C12324b.m32836a(observableSource3, "source3 is null");
        C12324b.m32836a(observableSource4, "source4 is null");
        C12324b.m32836a(observableSource5, "source5 is null");
        C12324b.m32836a(observableSource6, "source6 is null");
        C12324b.m32836a(observableSource7, "source7 is null");
        C12324b.m32836a(observableSource8, "source8 is null");
        return m32612a(C12301a.m32815a(function8), m32632p(), (ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8});
    }

    /* renamed from: a */
    public static <T> C12279e<T> m32603a(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C12324b.m32836a(observableSource, "sources is null");
        C12324b.m32833a(i, "prefetch");
        return C12768a.m33396a((C12279e<T>) new C12591i<T>(observableSource, C12301a.m32819b(), i, C12756f.IMMEDIATE));
    }

    /* renamed from: a */
    public static <T> C12279e<T> m32604a(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C12324b.m32836a(observableSource, "source1 is null");
        C12324b.m32836a(observableSource2, "source2 is null");
        return m32618a((ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2});
    }

    /* renamed from: a */
    public static <T> C12279e<T> m32618a(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return m32633q();
        }
        if (observableSourceArr.length == 1) {
            return m32631h(observableSourceArr[0]);
        }
        return C12768a.m33396a((C12279e<T>) new C12591i<T>(m32620a((T[]) observableSourceArr), C12301a.m32819b(), m32632p(), C12756f.BOUNDARY));
    }

    /* renamed from: a */
    public static <T> C12279e<T> m32602a(ObservableOnSubscribe<T> observableOnSubscribe) {
        C12324b.m32836a(observableOnSubscribe, "source is null");
        return C12768a.m33396a((C12279e<T>) new C12613l<T>(observableOnSubscribe));
    }

    /* renamed from: a */
    public static <T> C12279e<T> m32620a(T... tArr) {
        C12324b.m32836a(tArr, "items is null");
        if (tArr.length == 0) {
            return m32633q();
        }
        if (tArr.length == 1) {
            return m32626e(tArr[0]);
        }
        return C12768a.m33396a((C12279e<T>) new C12546b0<T>(tArr));
    }

    /* renamed from: a */
    public static <T> C12279e<T> m32616a(Callable<? extends T> callable) {
        C12324b.m32836a(callable, "supplier is null");
        return C12768a.m33396a((C12279e<T>) new C12552c0<T>(callable));
    }

    /* renamed from: a */
    public static <T> C12279e<T> m32617a(Future<? extends T> future) {
        C12324b.m32836a(future, "future is null");
        return C12768a.m33396a((C12279e<T>) new C12556d0<T>(future, 0, null));
    }

    /* renamed from: a */
    public static C12279e<Long> m32599a(long j, long j2, TimeUnit timeUnit) {
        return m32600a(j, j2, timeUnit, C12802a.m33490a());
    }

    /* renamed from: a */
    public static C12279e<Long> m32600a(long j, long j2, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12608k0 k0Var = new C12608k0(Math.max(0, j), Math.max(0, j2), timeUnit, fVar);
        return C12768a.m33396a((C12279e<T>) k0Var);
    }

    /* renamed from: a */
    public static <T, R> C12279e<R> m32613a(Function<? super Object[], ? extends R> function, boolean z, int i, ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return m32633q();
        }
        C12324b.m32836a(function, "zipper is null");
        C12324b.m32833a(i, "bufferSize");
        C12674t1 t1Var = new C12674t1(observableSourceArr, null, function, i, z);
        return C12768a.m33396a((C12279e<T>) t1Var);
    }

    /* renamed from: a */
    public final C12291g<Boolean> mo36444a(Predicate<? super T> predicate) {
        C12324b.m32836a(predicate, "predicate is null");
        return C12768a.m33401a((C12291g<T>) new C12550c<T>(this, predicate));
    }

    /* renamed from: a */
    public final T mo36445a() {
        C12466e eVar = new C12466e();
        subscribe(eVar);
        T a = eVar.mo36671a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public final T mo36446a(T t) {
        C12466e eVar = new C12466e();
        subscribe(eVar);
        Object a = eVar.mo36671a();
        return a != null ? a : t;
    }

    /* renamed from: a */
    public final C12279e<List<T>> mo36415a(int i) {
        return mo36416a(i, i);
    }

    /* renamed from: a */
    public final C12279e<List<T>> mo36416a(int i, int i2) {
        return mo36417a(i, i2, C12751a.m33342a());
    }

    /* renamed from: a */
    public final <U extends Collection<? super T>> C12279e<U> mo36417a(int i, int i2, Callable<U> callable) {
        C12324b.m32833a(i, "count");
        C12324b.m32833a(i2, "skip");
        C12324b.m32836a(callable, "bufferSupplier is null");
        return C12768a.m33396a((C12279e<T>) new C12559e<T>(this, i, i2, callable));
    }

    /* renamed from: a */
    public final C12279e<List<T>> mo36418a(long j, TimeUnit timeUnit) {
        return mo36421a(j, timeUnit, C12802a.m33490a(), Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public final C12279e<List<T>> mo36421a(long j, TimeUnit timeUnit, C12286f fVar, int i) {
        return mo36422a(j, timeUnit, fVar, i, C12751a.m33342a(), false);
    }

    /* renamed from: a */
    public final <U extends Collection<? super T>> C12279e<U> mo36422a(long j, TimeUnit timeUnit, C12286f fVar, int i, Callable<U> callable, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        C12324b.m32836a(timeUnit, "unit is null");
        C12286f fVar2 = fVar;
        C12324b.m32836a(fVar2, "scheduler is null");
        Callable<U> callable2 = callable;
        C12324b.m32836a(callable2, "bufferSupplier is null");
        int i2 = i;
        C12324b.m32833a(i2, "count");
        C12567f fVar3 = new C12567f(this, j, j, timeUnit2, fVar2, callable2, i2, z);
        return C12768a.m33396a((C12279e<T>) fVar3);
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36427a(ObservableTransformer<? super T, ? extends R> observableTransformer) {
        C12324b.m32836a(observableTransformer, "composer is null");
        return m32631h(observableTransformer.apply(this));
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36434a(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return mo36435a(function, 2);
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36435a(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C12324b.m32836a(function, "mapper is null");
        C12324b.m32833a(i, "prefetch");
        if (!(this instanceof ScalarCallable)) {
            return C12768a.m33396a((C12279e<T>) new C12591i<T>(this, function, i, C12756f.IMMEDIATE));
        }
        Object call = ((ScalarCallable) this).call();
        if (call == null) {
            return m32633q();
        }
        return C12541a1.m33072a(call, function);
    }

    /* renamed from: a */
    public final C12279e<T> mo36420a(long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12619m mVar = new C12619m(this, j, timeUnit, fVar);
        return C12768a.m33396a((C12279e<T>) mVar);
    }

    /* renamed from: a */
    public final <U> C12279e<T> mo36425a(ObservableSource<U> observableSource) {
        C12324b.m32836a(observableSource, "other is null");
        return C12768a.m33396a((C12279e<T>) new C12626n<T>(this, observableSource));
    }

    /* renamed from: a */
    public final C12279e<T> mo36431a(BiPredicate<? super T, ? super T> biPredicate) {
        C12324b.m32836a(biPredicate, "comparer is null");
        return C12768a.m33396a((C12279e<T>) new C12633o<T>(this, C12301a.m32819b(), biPredicate));
    }

    /* renamed from: a */
    public final C12279e<T> mo36430a(Action action) {
        C12324b.m32836a(action, "onFinally is null");
        return C12768a.m33396a((C12279e<T>) new C12643p<T>(this, action));
    }

    /* renamed from: a */
    private C12279e<T> m32611a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        C12324b.m32836a(consumer, "onNext is null");
        C12324b.m32836a(consumer2, "onError is null");
        C12324b.m32836a(action, "onComplete is null");
        C12324b.m32836a(action2, "onAfterTerminate is null");
        C12649q qVar = new C12649q(this, consumer, consumer2, action, action2);
        return C12768a.m33396a((C12279e<T>) qVar);
    }

    /* renamed from: a */
    public final C12279e<T> mo36432a(Consumer<? super Throwable> consumer) {
        Consumer a = C12301a.m32808a();
        Action action = C12301a.f31981c;
        return m32611a(a, consumer, action, action);
    }

    /* renamed from: a */
    public final C12279e<T> mo36433a(Consumer<? super Disposable> consumer, Action action) {
        C12324b.m32836a(consumer, "onSubscribe is null");
        C12324b.m32836a(action, "onDispose is null");
        return C12768a.m33396a((C12279e<T>) new C12655r<T>(this, consumer, action));
    }

    /* renamed from: a */
    public final C12273d<T> mo36410a(long j) {
        if (j >= 0) {
            return C12768a.m33395a((C12273d<T>) new C12670t<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36436a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return mo36437a(function, z, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36437a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i) {
        return mo36438a(function, z, i, m32632p());
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36438a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, int i2) {
        C12324b.m32836a(function, "mapper is null");
        C12324b.m32833a(i, "maxConcurrency");
        C12324b.m32833a(i2, "bufferSize");
        if (this instanceof ScalarCallable) {
            Object call = ((ScalarCallable) this).call();
            if (call == null) {
                return m32633q();
            }
            return C12541a1.m33072a(call, function);
        }
        C12701x xVar = new C12701x(this, function, z, i, i2);
        return C12768a.m33396a((C12279e<T>) xVar);
    }

    /* renamed from: a */
    public final C12279e<T> mo36428a(C12286f fVar) {
        return mo36429a(fVar, false, m32632p());
    }

    /* renamed from: a */
    public final C12279e<T> mo36429a(C12286f fVar, boolean z, int i) {
        C12324b.m32836a(fVar, "scheduler is null");
        C12324b.m32833a(i, "bufferSize");
        return C12768a.m33396a((C12279e<T>) new C12635o0<T>(this, fVar, z, i));
    }

    /* renamed from: a */
    public final C12273d<T> mo36411a(BiFunction<T, T, T> biFunction) {
        C12324b.m32836a(biFunction, "reducer is null");
        return C12768a.m33395a((C12273d<T>) new C12672t0<T>(this, biFunction));
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36441a(R r, BiFunction<R, ? super T, R> biFunction) {
        C12324b.m32836a(r, "initialValue is null");
        return mo36443a(C12301a.m32818a(r), biFunction);
    }

    /* renamed from: a */
    public final <R> C12279e<R> mo36443a(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        C12324b.m32836a(callable, "seedSupplier is null");
        C12324b.m32836a(biFunction, "accumulator is null");
        return C12768a.m33396a((C12279e<T>) new C12548b1<T>(this, callable, biFunction));
    }

    /* renamed from: a */
    public final C12279e<T> mo36442a(Comparator<? super T> comparator) {
        C12324b.m32836a(comparator, "sortFunction is null");
        return mo36511n().mo36553e().mo36501i(C12301a.m32816a(comparator)).mo36494f(C12301a.m32819b());
    }

    /* renamed from: a */
    public final C12279e<T> mo36439a(Iterable<? extends T> iterable) {
        return m32618a((ObservableSource<? extends T>[]) new ObservableSource[]{m32623b(iterable), this});
    }

    /* renamed from: a */
    public final Disposable mo36412a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return mo36414a(consumer, consumer2, C12301a.f31981c, C12301a.m32808a());
    }

    /* renamed from: a */
    public final Disposable mo36413a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return mo36414a(consumer, consumer2, action, C12301a.m32808a());
    }

    /* renamed from: a */
    public final Disposable mo36414a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        C12324b.m32836a(consumer, "onNext is null");
        C12324b.m32836a(consumer2, "onError is null");
        C12324b.m32836a(action, "onComplete is null");
        C12324b.m32836a(consumer3, "onSubscribe is null");
        C12474m mVar = new C12474m(consumer, consumer2, action, consumer3);
        subscribe(mVar);
        return mVar;
    }

    /* renamed from: a */
    public final C12279e<T> mo36424a(long j, TimeUnit timeUnit, boolean z) {
        return mo36423a(j, timeUnit, C12802a.m33490a(), z);
    }

    /* renamed from: a */
    public final C12279e<T> mo36423a(long j, TimeUnit timeUnit, C12286f fVar, boolean z) {
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12631n1 n1Var = new C12631n1(this, j, timeUnit, fVar, z);
        return C12768a.m33396a((C12279e<T>) n1Var);
    }

    /* renamed from: a */
    public final C12279e<T> mo36419a(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource) {
        C12324b.m32836a(observableSource, "other is null");
        return m32601a(j, timeUnit, observableSource, C12802a.m33490a());
    }

    /* renamed from: a */
    private C12279e<T> m32601a(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource, C12286f fVar) {
        C12324b.m32836a(timeUnit, "timeUnit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12637o1 o1Var = new C12637o1(this, j, timeUnit, fVar, observableSource);
        return C12768a.m33396a((C12279e<T>) o1Var);
    }

    /* renamed from: a */
    public final C12272c<T> mo36409a(C12270a aVar) {
        C12501i iVar = new C12501i(this);
        int i = C12280a.f31945a[aVar.ordinal()];
        if (i == 1) {
            return iVar.mo36370d();
        }
        if (i == 2) {
            return iVar.mo36372e();
        }
        if (i == 3) {
            return iVar;
        }
        if (i != 4) {
            return iVar.mo36368c();
        }
        return C12768a.m33394a((C12272c<T>) new C12518q<T>(iVar));
    }

    /* renamed from: a */
    public final <U, R> C12279e<R> mo36426a(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C12324b.m32836a(observableSource, "other is null");
        C12324b.m32836a(biFunction, "combiner is null");
        return C12768a.m33396a((C12279e<T>) new C12667s1<T>(this, biFunction, observableSource));
    }

    /* renamed from: a */
    public final <U, R> C12279e<R> mo36440a(Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C12324b.m32836a(iterable, "other is null");
        C12324b.m32836a(biFunction, "zipper is null");
        return C12768a.m33396a((C12279e<T>) new C12682u1<T>(this, iterable, biFunction));
    }
}
