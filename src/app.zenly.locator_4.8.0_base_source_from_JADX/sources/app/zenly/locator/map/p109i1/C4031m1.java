package app.zenly.locator.map.p109i1;

import android.text.TextUtils;
import android.util.Pair;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.contracts.MapControllerContract.C2459c;
import app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.PlaceManager;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2872b0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.map.C4409z0;
import app.zenly.locator.map.p111j1.C4079a;
import app.zenly.locator.map.text.ContextualLabelingFormatterVariant;
import app.zenly.locator.p143s.C5404e;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5458c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p213co.znly.models.reversegeocoder.C7915d;
import p213co.znly.models.services.C8268s1;
import p213co.znly.models.services.C8290t1;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.map.i1.m1 */
public final class C4031m1 {

    /* renamed from: o */
    private static final C2890k f10590o = new C2890k(null, null);

    /* renamed from: a */
    private final ZenlySchedulers f10591a = C1351e.m6372a(C4409z0.f11896b.mo19916a("CLManager"));

    /* renamed from: b */
    private final Provider<C2718k5> f10592b;

    /* renamed from: c */
    private final Provider<PlaceManager> f10593c;

    /* renamed from: d */
    private final Provider<ContextualLabelingFormatterVariant> f10594d;

    /* renamed from: e */
    private final Provider<C4037n1> f10595e;

    /* renamed from: f */
    private final C12785a<String> f10596f;

    /* renamed from: g */
    private final C12785a<String> f10597g;

    /* renamed from: h */
    private final C12785a<Double> f10598h;

    /* renamed from: i */
    private final C12785a<C2458b> f10599i;

    /* renamed from: j */
    private final C12785a<Boolean> f10600j;

    /* renamed from: k */
    private final C12785a<C4034c> f10601k;

    /* renamed from: l */
    private final C12785a<C4034c> f10602l;

    /* renamed from: m */
    private final C12279e<C4079a> f10603m;

    /* renamed from: n */
    private final AtomicBoolean f10604n;

    /* renamed from: app.zenly.locator.map.i1.m1$a */
    static /* synthetic */ class C4032a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10605a = new int[C2466a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f10606b = new int[C4033b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        static {
            /*
                app.zenly.locator.map.i1.m1$b[] r0 = app.zenly.locator.map.p109i1.C4031m1.C4033b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10606b = r0
                r0 = 1
                int[] r1 = f10606b     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.map.i1.m1$b r2 = app.zenly.locator.map.p109i1.C4031m1.C4033b.POINT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f10606b     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.map.i1.m1$b r3 = app.zenly.locator.map.p109i1.C4031m1.C4033b.ZONE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                app.zenly.locator.core.contracts.MapControllerContract$h$a[] r2 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10605a = r2
                int[] r2 = f10605a     // Catch:{ NoSuchFieldError -> 0x0032 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r3 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SELECT     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f10605a     // Catch:{ NoSuchFieldError -> 0x003c }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SWITCH     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = f10605a     // Catch:{ NoSuchFieldError -> 0x0047 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r1 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.FOCUS     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f10605a     // Catch:{ NoSuchFieldError -> 0x0052 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r1 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.UNSELECT     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p109i1.C4031m1.C4032a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.map.i1.m1$b */
    private enum C4033b {
        NONE,
        POINT,
        ZONE
    }

    /* renamed from: app.zenly.locator.map.i1.m1$c */
    private static final class C4034c {
        /* access modifiers changed from: 0000 */

        /* renamed from: a */
        public final C5458c f10611a;

        /* renamed from: b */
        double f10612b;

        /* renamed from: c */
        double f10613c;

        /* synthetic */ C4034c(C4032a aVar) {
            this();
        }

        /* renamed from: a */
        public C4034c mo10689a(C5458c cVar, double d, double d2) {
            this.f10611a.mo13051a(cVar);
            this.f10612b = d;
            this.f10613c = d2;
            return this;
        }

        /* renamed from: b */
        public boolean mo10691b() {
            return Double.isNaN(this.f10611a.f14041b) || Double.isNaN(this.f10611a.f14042c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4034c.class != obj.getClass()) {
                return false;
            }
            C4034c cVar = (C4034c) obj;
            if (Double.compare(cVar.f10612b, this.f10612b) == 0 && Double.compare(cVar.f10613c, this.f10613c) == 0) {
                return this.f10611a.equals(cVar.f10611a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f10611a.hashCode();
            long doubleToLongBits = Double.doubleToLongBits(this.f10612b);
            int i = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
            long doubleToLongBits2 = Double.doubleToLongBits(this.f10613c);
            return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        }

        private C4034c() {
            this.f10611a = new C5458c();
        }

        /* renamed from: a */
        public C4034c mo10688a(C4034c cVar) {
            mo10689a(cVar.f10611a, cVar.f10612b, cVar.f10613c);
            return this;
        }

        /* renamed from: a */
        public void mo10690a() {
            this.f10611a.mo13050a();
            this.f10612b = 0.0d;
            this.f10613c = 0.0d;
        }
    }

    public C4031m1(Provider<C2718k5> provider, Provider<PlaceManager> provider2, Provider<C4037n1> provider3, Provider<ContextualLabelingFormatterVariant> provider4) {
        String str = "";
        this.f10596f = C12785a.m33446h(str);
        this.f10597g = C12785a.m33446h(str);
        this.f10598h = C12785a.m33446h(Double.valueOf(0.0d));
        this.f10599i = C12785a.m33446h(C2458b.NORMAL);
        this.f10600j = C12785a.m33446h(Boolean.valueOf(false));
        this.f10601k = C12785a.m33447u();
        this.f10602l = C12785a.m33447u();
        this.f10604n = new AtomicBoolean(false);
        this.f10593c = provider2;
        this.f10592b = provider;
        this.f10594d = provider4;
        this.f10595e = provider3;
        this.f10601k.mo36492f(500, TimeUnit.MILLISECONDS).mo36477d().subscribe(this.f10602l);
        C12279e f = m11683f();
        C12279e c = m11672c();
        C12279e b = m11666b();
        C12279e a = m11651a((C12279e<C4034c>) this.f10602l);
        C12279e a2 = m11654a(m11653a(f, c, m11673c(this.f10602l, m11679d(this.f10602l, a))), f, c, m11679d(this.f10602l, C12279e.m32626e(new C4079a())));
        this.f10603m = m11667b(m11652a(m11655a((C12279e<String>) this.f10596f, (C12279e<String>) this.f10597g, (C12279e<C2458b>) this.f10599i, b, a, a2), m11678d()), m11681e());
    }

    /* renamed from: a */
    private C12279e<C4079a> m11651a(C12279e<C4034c> eVar) {
        C12279e e = C12279e.m32626e(C8290t1.getDefaultInstance());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return eVar.mo36459b((Predicate<? super T>) new C4002d<Object>(this, atomicBoolean)).mo36509m(new C4009f0(atomicBoolean, e)).mo36501i(new C3994a0(this)).mo36468c((Consumer<? super Disposable>) C4026l.f10584e).mo36455b((Consumer<? super T>) C4046p0.f10633e);
    }

    /* renamed from: a */
    static /* synthetic */ void m11658a(C4079a aVar) throws Exception {
    }

    /* renamed from: a */
    static /* synthetic */ void m11659a(Disposable disposable) throws Exception {
    }

    /* renamed from: a */
    static /* synthetic */ void m11660a(Throwable th) throws Exception {
    }

    /* renamed from: b */
    static /* synthetic */ void m11670b(C4079a aVar) throws Exception {
    }

    /* renamed from: b */
    static /* synthetic */ void m11671b(Throwable th) throws Exception {
    }

    /* renamed from: c */
    private C12279e<C4079a> m11673c(C12279e<C4034c> eVar, C12279e<C4079a> eVar2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C4034c cVar = new C4034c(null);
        return eVar.mo36468c((Consumer<? super Disposable>) new C4012g0<Object>(cVar)).mo36459b((Predicate<? super T>) new C4058r0<Object>(atomicBoolean, cVar)).mo36501i(C4071x.f10681e).mo36509m(new C4067v(this, atomicBoolean, eVar2));
    }

    /* renamed from: c */
    static /* synthetic */ void m11674c(C4079a aVar) throws Exception {
    }

    /* renamed from: c */
    static /* synthetic */ void m11675c(Throwable th) throws Exception {
    }

    /* renamed from: d */
    private C12279e<C4079a> m11679d(C12279e<C4034c> eVar, C12279e<C4079a> eVar2) {
        C4034c cVar = new C4034c(null);
        return eVar.mo36468c((Consumer<? super Disposable>) new C4024k0<Object>(cVar)).mo36459b((Predicate<? super T>) new C4023k<Object>(this, cVar)).mo36501i(C4060s.f10666e).mo36509m(new C4075z(this, eVar2));
    }

    /* renamed from: d */
    static /* synthetic */ void m11680d(C4079a aVar) throws Exception {
    }

    /* renamed from: f */
    private C12279e<C2918b> m11683f() {
        return this.f10597g.mo36509m(new C4005e(this));
    }

    /* renamed from: h */
    static /* synthetic */ boolean m11689h(String str) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: e */
    public /* synthetic */ C4079a mo10687e(String str) throws Exception {
        return new C4079a(((ContextualLabelingFormatterVariant) this.f10594d.get()).format(str), 260);
    }

    /* renamed from: e */
    private C12279e<Boolean> m11681e() {
        return this.f10597g.mo36509m(new C4029m(this)).mo36477d();
    }

    /* renamed from: b */
    public /* synthetic */ ObservableSource mo10684b(String str) throws Exception {
        if (str.isEmpty()) {
            return C12279e.m32626e(f10590o);
        }
        return ((C2718k5) this.f10592b.get()).mo8789b(str).mo36459b((Predicate<? super T>) C4006e0.f10559e).mo36501i(C4049q0.f10640e);
    }

    /* renamed from: d */
    public /* synthetic */ ObservableSource mo10686d(String str) throws Exception {
        if (str.isEmpty()) {
            return C12279e.m32626e(C2918b.NONE);
        }
        return ((C2718k5) this.f10592b.get()).mo8789b(str).mo36459b((Predicate<? super T>) C4021j0.f10578e).mo36501i(C4074y0.f10688e);
    }

    /* renamed from: c */
    private C12279e<C2890k> m11672c() {
        return this.f10597g.mo36509m(new C4048q(this));
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo10683a(AtomicBoolean atomicBoolean, C4034c cVar) throws Exception {
        return !atomicBoolean.get() && !this.f10604n.get();
    }

    /* renamed from: a */
    static /* synthetic */ ObservableSource m11650a(AtomicBoolean atomicBoolean, C12279e eVar, C4034c cVar) throws Exception {
        C8268s1 a = C5404e.m15382a(cVar.f10611a, (int) cVar.f10612b, (int) cVar.f10613c);
        atomicBoolean.set(true);
        return C5448c.m15478a().reverseGeoCodeViewports(a).mo36432a((Consumer<? super Throwable>) C4065u.f10673e).mo36430a((Action) new C4063t(System.currentTimeMillis(), atomicBoolean)).mo36419a(500, TimeUnit.MILLISECONDS, (ObservableSource<? extends T>) eVar).mo36466c((ObservableSource<? extends T>) eVar);
    }

    /* renamed from: b */
    private C12279e<Boolean> m11666b() {
        return this.f10597g.mo36509m(new C4030m0(this)).mo36477d();
    }

    /* renamed from: d */
    static /* synthetic */ C2890k m11677d(C2831a aVar) throws Exception {
        C2890k kVar = aVar.mo8858c().f8210n;
        if (kVar != null) {
            return kVar;
        }
        return f10590o;
    }

    /* renamed from: c */
    public /* synthetic */ ObservableSource mo10685c(String str) throws Exception {
        if (str.isEmpty()) {
            return C12279e.m32626e(Boolean.valueOf(false));
        }
        return ((C2718k5) this.f10592b.get()).mo8789b(str).mo36459b((Predicate<? super T>) C4042o.f10627e).mo36501i(C4027l0.f10585e);
    }

    /* renamed from: b */
    static /* synthetic */ ObservableSource m11665b(C12279e eVar, C2918b bVar) throws Exception {
        return bVar == C2918b.HOME ? C12279e.m32626e(f10590o) : eVar;
    }

    /* renamed from: d */
    private C12279e<String> m11678d() {
        return ((C4037n1) this.f10595e.get()).mo10694a((C12279e<String>) this.f10597g);
    }

    /* renamed from: b */
    private C12279e<C4079a> m11667b(C12279e<C4079a> eVar, C12279e<Boolean> eVar2) {
        return C12279e.m32610a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) eVar2, (BiFunction<? super T1, ? super T2, ? extends R>) C4068v0.f10678a).mo36477d();
    }

    /* renamed from: a */
    public /* synthetic */ C4079a mo10667a(C8290t1 t1Var) throws Exception {
        if (t1Var.getViewportsInformationCount() <= 0) {
            return new C4079a();
        }
        C7915d viewportsInformation = t1Var.getViewportsInformation(0);
        return new C4079a(((ContextualLabelingFormatterVariant) this.f10594d.get()).format(viewportsInformation.getLabel()), viewportsInformation.getType().getNumber());
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo10682a(C4034c cVar, C4034c cVar2) throws Exception {
        if (this.f10604n.get()) {
            return false;
        }
        if (!cVar.mo10691b()) {
            C5458c cVar3 = cVar.f10611a;
            double d = cVar3.f14041b;
            double d2 = cVar3.f14042c;
            C5458c cVar4 = cVar2.f10611a;
            if (C5457b.m15510b(d, d2, cVar4.f14041b, cVar4.f14042c)) {
                return false;
            }
        }
        cVar.mo10688a(cVar2);
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10670a(C12279e eVar, C5458c cVar) throws Exception {
        this.f10604n.set(true);
        return C5448c.m15478a().geoReverseGeocodeStreet(cVar.f14041b, cVar.f14042c).mo36432a((Consumer<? super Throwable>) C4070w0.f10680e).mo36459b((Predicate<? super T>) C4043o0.f10628e).mo36501i(new C4017i(this)).mo36455b((Consumer<? super T>) C4011g.f10566e).mo36430a((Action) new C4020j(this, System.currentTimeMillis())).mo36489e((ObservableSource<? extends T>) eVar).mo36419a(500, TimeUnit.MILLISECONDS, (ObservableSource<? extends T>) eVar).mo36466c((ObservableSource<? extends T>) eVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo10677a(long j) throws Exception {
        this.f10604n.set(false);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m11662a(AtomicBoolean atomicBoolean, C4034c cVar, C4034c cVar2) throws Exception {
        if (atomicBoolean.get()) {
            return false;
        }
        if (cVar.mo10691b()) {
            cVar.mo10688a(cVar2);
            return true;
        }
        C5458c cVar3 = cVar.f10611a;
        double d = cVar3.f14041b;
        double d2 = cVar3.f14042c;
        C5458c cVar4 = cVar2.f10611a;
        if (C3225m.m10225a(d, d2, cVar4.f14041b, cVar4.f14042c) < 10.0f) {
            return false;
        }
        cVar.mo10688a(cVar2);
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10673a(AtomicBoolean atomicBoolean, C12279e eVar, C5458c cVar) throws Exception {
        atomicBoolean.set(true);
        return this.f10597g.mo36509m(new C4073y(this, atomicBoolean, eVar));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10674a(AtomicBoolean atomicBoolean, C12279e eVar, String str) throws Exception {
        return ((PlaceManager) this.f10593c.get()).getBestPlace(str).mo36396b().mo36501i(new C4018i0(this)).mo36455b((Consumer<? super T>) C4066u0.f10674e).mo36430a((Action) new C4003d0(System.currentTimeMillis(), atomicBoolean)).mo36432a((Consumer<? super Throwable>) C4064t0.f10672e).mo36419a(500, TimeUnit.MILLISECONDS, (ObservableSource<? extends T>) eVar).mo36466c((ObservableSource<? extends T>) eVar).mo36489e((ObservableSource<? extends T>) eVar);
    }

    /* renamed from: a */
    public /* synthetic */ C4079a mo10665a(C2872b0 b0Var) throws Exception {
        return new C4079a(((ContextualLabelingFormatterVariant) this.f10594d.get()).format(b0Var), 90200);
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10672a(String str) throws Exception {
        if (str.isEmpty()) {
            return C12279e.m32626e(Boolean.valueOf(false));
        }
        return ((C2718k5) this.f10592b.get()).mo8789b(str).mo36459b((Predicate<? super T>) C4069w.f10679e).mo36501i(C4057r.f10655e);
    }

    /* renamed from: a */
    private C12279e<C4079a> m11653a(C12279e<C2918b> eVar, C12279e<C2890k> eVar2, C12279e<C4079a> eVar3) {
        return eVar.mo36477d().mo36509m(new C4014h(this, eVar2.mo36477d().mo36509m(new C4008f(this, eVar3))));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10668a(C12279e eVar, C2890k kVar) throws Exception {
        return kVar != f10590o ? C12279e.m32626e(new C4079a(((ContextualLabelingFormatterVariant) this.f10594d.get()).format(kVar), 90200)) : eVar;
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10669a(C12279e eVar, C2918b bVar) throws Exception {
        return bVar != C2918b.NONE ? C12279e.m32626e(new C4079a(((ContextualLabelingFormatterVariant) this.f10594d.get()).formatSignificantPlace(bVar), 90100)) : eVar;
    }

    /* renamed from: a */
    private C12279e<C4079a> m11652a(C12279e<C4079a> eVar, C12279e<String> eVar2) {
        return C12279e.m32610a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) eVar2, (BiFunction<? super T1, ? super T2, ? extends R>) C3997b0.f10548a).mo36477d();
    }

    /* renamed from: a */
    static /* synthetic */ C4079a m11647a(C4079a aVar, String str) throws Exception {
        if (str.equals(aVar.f10695b)) {
            return aVar;
        }
        C4079a aVar2 = new C4079a();
        aVar2.mo10734a(aVar);
        aVar2.f10695b = str;
        return aVar2;
    }

    /* renamed from: a */
    private C12279e<C4079a> m11654a(C12279e<C4079a> eVar, C12279e<C2918b> eVar2, C12279e<C2890k> eVar3, C12279e<C4079a> eVar4) {
        return eVar.mo36509m(new C4035n(this, eVar2, eVar3, eVar4));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10671a(C12279e eVar, C12279e eVar2, C12279e eVar3, C4079a aVar) throws Exception {
        C12279e eVar4;
        int i = aVar.f10697d;
        if (i == 260) {
            return C12279e.m32626e(aVar);
        }
        if (i == 90200) {
            eVar4 = C12279e.m32626e(f10590o);
        } else {
            eVar4 = eVar.mo36477d().mo36509m(new C4061s0(eVar2));
        }
        return C12279e.m32610a((ObservableSource<? extends T1>) eVar4, (ObservableSource<? extends T2>) eVar3, (BiFunction<? super T1, ? super T2, ? extends R>) C3999c.f10550a).mo36501i(new C4036n0(this, aVar)).mo36485d(aVar).mo36477d();
    }

    /* renamed from: a */
    public /* synthetic */ C4079a mo10666a(C4079a aVar, Pair pair) throws Exception {
        String str;
        C2890k kVar = (C2890k) pair.first;
        C4079a aVar2 = (C4079a) pair.second;
        if (kVar != f10590o && !aVar2.f10694a.isEmpty()) {
            str = ((ContextualLabelingFormatterVariant) this.f10594d.get()).format(kVar, aVar2.f10694a);
        } else if (kVar != f10590o) {
            str = ((ContextualLabelingFormatterVariant) this.f10594d.get()).format(kVar);
        } else {
            str = aVar2.f10694a;
        }
        if (str.equals(aVar.f10696c)) {
            return aVar;
        }
        C4079a aVar3 = new C4079a();
        aVar3.mo10734a(aVar);
        aVar3.f10696c = str;
        return aVar3;
    }

    /* renamed from: a */
    static /* synthetic */ C4079a m11646a(C4079a aVar, Boolean bool) throws Exception {
        if (bool.booleanValue() == aVar.f10698e) {
            return aVar;
        }
        C4079a aVar2 = new C4079a();
        aVar2.mo10734a(aVar);
        aVar2.f10698e = bool.booleanValue();
        return aVar2;
    }

    /* renamed from: a */
    private C12279e<C4079a> m11655a(C12279e<String> eVar, C12279e<String> eVar2, C12279e<C2458b> eVar3, C12279e<Boolean> eVar4, C12279e<C4079a> eVar5, C12279e<C4079a> eVar6) {
        return C12279e.m32606a(eVar.mo36501i(C4045p.f10632e), eVar2.mo36501i(C4000c0.f10551e), eVar3, eVar4, this.f10600j, this.f10598h, C4015h0.f10571a).mo36452b((C12286f) this.f10591a.getMainThread()).mo36477d().mo36509m(new C4072x0(eVar6, eVar5, C12279e.m32626e(new C4079a()))).mo36455b((Consumer<? super T>) C4076z0.f10691e);
    }

    /* renamed from: a */
    static /* synthetic */ C4033b m11645a(Boolean bool, Boolean bool2, C2458b bVar, Boolean bool3, Boolean bool4, Double d) throws Exception {
        if (bool.booleanValue() && !bool2.booleanValue()) {
            return C4033b.NONE;
        }
        boolean z = d.doubleValue() >= 14.0d;
        if (!bool2.booleanValue() || bool4.booleanValue() || bool3.booleanValue() || !z) {
            return C4033b.ZONE;
        }
        return C4033b.POINT;
    }

    /* renamed from: a */
    static /* synthetic */ ObservableSource m11649a(C12279e eVar, C12279e eVar2, C12279e eVar3, C4033b bVar) throws Exception {
        int i = C4032a.f10606b[bVar.ordinal()];
        if (i != 1) {
            return i != 2 ? eVar3 : eVar2;
        }
        return eVar;
    }

    /* renamed from: a */
    public void mo10679a(C2459c cVar) {
        int i = C4032a.f10605a[cVar.f7400a.ordinal()];
        String str = "";
        if (i == 1 || i == 2) {
            this.f10596f.onNext(cVar.f7380c.f8198b.mo8945g());
            this.f10597g.onNext(str);
        } else if (i == 3) {
            this.f10597g.onNext(cVar.f7380c.f8198b.mo8945g());
        } else if (i == 4) {
            this.f10596f.onNext(str);
            this.f10597g.onNext(str);
        }
    }

    /* renamed from: a */
    public void mo10681a(boolean z) {
        this.f10600j.onNext(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo10676a(double d) {
        this.f10598h.onNext(Double.valueOf(d));
    }

    /* renamed from: a */
    public void mo10678a(C2458b bVar) {
        this.f10599i.onNext(bVar);
    }

    /* renamed from: a */
    public void mo10680a(C5458c cVar, double d, double d2) {
        C12785a<C4034c> aVar = this.f10601k;
        C4034c cVar2 = new C4034c(null);
        cVar2.mo10689a(cVar, d, d2);
        aVar.onNext(cVar2);
    }

    /* renamed from: a */
    public C12279e<C4079a> mo10675a() {
        return this.f10603m;
    }
}
