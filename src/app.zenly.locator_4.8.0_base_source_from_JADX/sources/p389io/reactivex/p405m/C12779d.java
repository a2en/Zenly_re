package p389io.reactivex.p405m;

import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;

/* renamed from: io.reactivex.m.d */
public final class C12779d {

    /* renamed from: a */
    private static final Function1<Object, C12956q> f33325a = C12782c.f33330f;

    /* renamed from: b */
    private static final Function1<Throwable, C12956q> f33326b = C12781b.f33329f;

    /* renamed from: c */
    private static final Function0<C12956q> f33327c = C12780a.f33328f;

    /* renamed from: io.reactivex.m.d$a */
    static final class C12780a extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        public static final C12780a f33328f = new C12780a();

        C12780a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: io.reactivex.m.d$b */
    static final class C12781b extends C12933k implements Function1<Throwable, C12956q> {

        /* renamed from: f */
        public static final C12781b f33329f = new C12781b();

        C12781b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo36958a(Throwable th) {
            C12932j.m33818b(th, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo36958a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: io.reactivex.m.d$c */
    static final class C12782c extends C12933k implements Function1<Object, C12956q> {

        /* renamed from: f */
        public static final C12782c f33330f = new C12782c();

        C12782c() {
            super(1);
        }

        public final void invoke(Object obj) {
            C12932j.m33818b(obj, "it");
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.m.f] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> p389io.reactivex.functions.Consumer<T> m33443a(kotlin.jvm.functions.Function1<? super T, kotlin.C12956q> r1) {
        /*
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.q> r0 = f33325a
            if (r1 != r0) goto L_0x000e
            io.reactivex.functions.Consumer r1 = p389io.reactivex.p393i.p394a.C12301a.m32808a()
            java.lang.String r0 = "Functions.emptyConsumer()"
            kotlin.jvm.internal.C12932j.m33815a(r1, r0)
            goto L_0x0018
        L_0x000e:
            if (r1 == 0) goto L_0x0016
            io.reactivex.m.f r0 = new io.reactivex.m.f
            r0.<init>(r1)
            r1 = r0
        L_0x0016:
            io.reactivex.functions.Consumer r1 = (p389io.reactivex.functions.Consumer) r1
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p405m.C12779d.m33443a(kotlin.jvm.functions.Function1):io.reactivex.functions.Consumer");
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.m.f] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p389io.reactivex.functions.Consumer<java.lang.Throwable> m33444b(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.C12956q> r1) {
        /*
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.q> r0 = f33326b
            if (r1 != r0) goto L_0x000c
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = p389io.reactivex.p393i.p394a.C12301a.f31983e
            java.lang.String r0 = "Functions.ON_ERROR_MISSING"
            kotlin.jvm.internal.C12932j.m33815a(r1, r0)
            goto L_0x0016
        L_0x000c:
            if (r1 == 0) goto L_0x0014
            io.reactivex.m.f r0 = new io.reactivex.m.f
            r0.<init>(r1)
            r1 = r0
        L_0x0014:
            io.reactivex.functions.Consumer r1 = (p389io.reactivex.functions.Consumer) r1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p405m.C12779d.m33444b(kotlin.jvm.functions.Function1):io.reactivex.functions.Consumer");
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.m.e] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p389io.reactivex.functions.Action m33442a(kotlin.jvm.functions.Function0<kotlin.C12956q> r1) {
        /*
            kotlin.jvm.functions.Function0<kotlin.q> r0 = f33327c
            if (r1 != r0) goto L_0x000c
            io.reactivex.functions.Action r1 = p389io.reactivex.p393i.p394a.C12301a.f31981c
            java.lang.String r0 = "Functions.EMPTY_ACTION"
            kotlin.jvm.internal.C12932j.m33815a(r1, r0)
            goto L_0x0016
        L_0x000c:
            if (r1 == 0) goto L_0x0014
            io.reactivex.m.e r0 = new io.reactivex.m.e
            r0.<init>(r1)
            r1 = r0
        L_0x0014:
            io.reactivex.functions.Action r1 = (p389io.reactivex.functions.Action) r1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p405m.C12779d.m33442a(kotlin.jvm.functions.Function0):io.reactivex.functions.Action");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function0, code=kotlin.jvm.functions.Function0<kotlin.q>, for r2v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Object, kotlin.q>, for r3v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.q>, for r1v0, types: [kotlin.jvm.functions.Function1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* bridge */ /* synthetic */ p389io.reactivex.disposables.Disposable m33439a(p389io.reactivex.C12279e r0, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.C12956q> r1, kotlin.jvm.functions.Function0<kotlin.C12956q> r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.C12956q> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.q> r1 = f33326b
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            kotlin.jvm.functions.Function0<kotlin.q> r2 = f33327c
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.q> r3 = f33325a
        L_0x0012:
            io.reactivex.disposables.Disposable r0 = m33438a(r0, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p405m.C12779d.m33439a(io.reactivex.e, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):io.reactivex.disposables.Disposable");
    }

    /* renamed from: a */
    public static final <T> Disposable m33438a(C12279e<T> eVar, Function1<? super Throwable, C12956q> function1, Function0<C12956q> function0, Function1<? super T, C12956q> function12) {
        C12932j.m33818b(eVar, "$receiver");
        C12932j.m33818b(function1, "onError");
        C12932j.m33818b(function0, "onComplete");
        C12932j.m33818b(function12, "onNext");
        Disposable a = eVar.mo36413a(m33443a(function12), m33444b(function1), m33442a(function0));
        C12932j.m33815a((Object) a, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return a;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Object, kotlin.q>, for r2v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.q>, for r1v0, types: [kotlin.jvm.functions.Function1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* bridge */ /* synthetic */ p389io.reactivex.disposables.Disposable m33441a(p389io.reactivex.C12291g r0, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.C12956q> r1, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.C12956q> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.q> r1 = f33326b
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.q> r2 = f33325a
        L_0x000c:
            io.reactivex.disposables.Disposable r0 = m33440a(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p405m.C12779d.m33441a(io.reactivex.g, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):io.reactivex.disposables.Disposable");
    }

    /* renamed from: a */
    public static final <T> Disposable m33440a(C12291g<T> gVar, Function1<? super Throwable, C12956q> function1, Function1<? super T, C12956q> function12) {
        C12932j.m33818b(gVar, "$receiver");
        C12932j.m33818b(function1, "onError");
        C12932j.m33818b(function12, "onSuccess");
        Disposable a = gVar.mo36533a(m33443a(function12), m33444b(function1));
        C12932j.m33815a((Object) a, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return a;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function0, code=kotlin.jvm.functions.Function0<kotlin.q>, for r2v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.q>, for r1v0, types: [kotlin.jvm.functions.Function1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* bridge */ /* synthetic */ p389io.reactivex.disposables.Disposable m33437a(p389io.reactivex.C12271b r0, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.C12956q> r1, kotlin.jvm.functions.Function0<kotlin.C12956q> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.q> r1 = f33326b
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            kotlin.jvm.functions.Function0<kotlin.q> r2 = f33327c
        L_0x000c:
            io.reactivex.disposables.Disposable r0 = m33436a(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p405m.C12779d.m33437a(io.reactivex.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, java.lang.Object):io.reactivex.disposables.Disposable");
    }

    /* renamed from: a */
    public static final Disposable m33436a(C12271b bVar, Function1<? super Throwable, C12956q> function1, Function0<C12956q> function0) {
        C12932j.m33818b(bVar, "$receiver");
        C12932j.m33818b(function1, "onError");
        C12932j.m33818b(function0, "onComplete");
        if (function1 == f33326b && function0 == f33327c) {
            Disposable b = bVar.mo36351b();
            C12932j.m33815a((Object) b, "subscribe()");
            return b;
        } else if (function1 == f33326b) {
            Disposable a = bVar.mo36344a((Action) new C12783e(function0));
            C12932j.m33815a((Object) a, "subscribe(onComplete)");
            return a;
        } else {
            Disposable a2 = bVar.mo36345a(m33442a(function0), new C12784f(function1));
            C12932j.m33815a((Object) a2, "subscribe(onComplete.asO…ion(), Consumer(onError))");
            return a2;
        }
    }
}
