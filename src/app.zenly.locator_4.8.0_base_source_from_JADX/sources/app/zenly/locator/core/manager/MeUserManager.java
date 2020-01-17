package app.zenly.locator.core.manager;

import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.app.C2453d;
import app.zenly.locator.core.contracts.MapControllerContract.C2459c;
import app.zenly.locator.core.contracts.MapControllerContract.C2460d;
import app.zenly.locator.core.contracts.MapControllerContract.C2460d.C2461a;
import app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a;
import app.zenly.locator.core.helper.C2511d;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2892m;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2907v;
import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2912x;
import app.zenly.locator.core.models.C2916z;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.models.UserLocationWrapper;
import app.zenly.locator.core.models.VisitPointWrapper;
import app.zenly.locator.core.util.C3192a0;
import app.zenly.locator.core.util.C3228o;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import app.zenly.locator.p143s.p150n.C5464h;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7286e2;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.UserAnnotationProto$UserAnnotation;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest.C7961a;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest.C7962b;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest.C7962b.C7963a;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest.C7964c;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.C12270a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.p406n.C12789c;

public class MeUserManager {

    /* renamed from: a */
    private final ZenlySchedulers f7746a = C1351e.m6372a(C2703i5.f7877b.mo19916a("meUserManager"));

    /* renamed from: b */
    private final ZenlyCore f7747b;

    /* renamed from: c */
    private final C2694h5 f7748c;

    /* renamed from: d */
    private final C1322a f7749d;

    /* renamed from: e */
    private final C12286f f7750e = this.f7746a.getMainThread();

    /* renamed from: f */
    private final C12286f f7751f = this.f7746a.getSingle();

    /* renamed from: g */
    private final C12785a<C5464h> f7752g = C12785a.m33447u();

    /* renamed from: h */
    private final C12785a<String> f7753h = C12785a.m33446h("");

    /* renamed from: i */
    private final C12785a<String[]> f7754i;

    /* renamed from: j */
    private final C12785a<Boolean> f7755j;

    /* renamed from: k */
    private final C12785a<Boolean> f7756k;

    /* renamed from: l */
    private final C12785a<Boolean> f7757l;

    /* renamed from: m */
    private final C12789c<C2630c> f7758m;

    /* renamed from: n */
    private final C12785a<C2879d0> f7759n;

    /* renamed from: o */
    private final C12785a<C5459d> f7760o;

    /* renamed from: p */
    private C3228o<Listener> f7761p;

    /* renamed from: q */
    private UserLocationWrapper f7762q;

    /* renamed from: r */
    private final C2907v f7763r;

    /* renamed from: s */
    private final C2907v f7764s;

    /* renamed from: t */
    private UserAnnotationProto$UserAnnotation f7765t;

    /* renamed from: u */
    private C2890k f7766u;

    /* renamed from: v */
    private boolean f7767v;

    /* renamed from: w */
    private final boolean f7768w;

    public interface Listener {
        void onMeUserUpdate(C2629b bVar, C2907v vVar);
    }

    /* renamed from: app.zenly.locator.core.manager.MeUserManager$a */
    static /* synthetic */ class C2628a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7769a = new int[C2466a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f7770b = new int[C2461a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        static {
            /*
                app.zenly.locator.core.contracts.MapControllerContract$d$a[] r0 = app.zenly.locator.core.contracts.MapControllerContract.C2460d.C2461a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7770b = r0
                r0 = 1
                int[] r1 = f7770b     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.contracts.MapControllerContract$d$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2460d.C2461a.FOLLOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f7770b     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.contracts.MapControllerContract$d$a r3 = app.zenly.locator.core.contracts.MapControllerContract.C2460d.C2461a.UNFOLLOW     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                app.zenly.locator.core.contracts.MapControllerContract$h$a[] r2 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7769a = r2
                int[] r2 = f7769a     // Catch:{ NoSuchFieldError -> 0x0032 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r3 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SELECT     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f7769a     // Catch:{ NoSuchFieldError -> 0x003c }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SWITCH     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = f7769a     // Catch:{ NoSuchFieldError -> 0x0047 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r1 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.UNSELECT     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f7769a     // Catch:{ NoSuchFieldError -> 0x0052 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r1 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.LOST_POSITION     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.manager.MeUserManager.C2628a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.core.manager.MeUserManager$b */
    public enum C2629b {
        BUBBLE_CHANGE,
        CONFIGURATION_CHANGE,
        HAS_BRUMP_CHANGE,
        HEADING_CHANGE,
        LOCATION_CHANGE,
        MOVING_STATE_CHANGE,
        PLACES_CHANGE,
        SIGNIFICANT_PLACE_CHANGE,
        SIGNIFICANT_PLACE_HEADING_CHANGE,
        SPEED_CHANGE,
        USER_UPDATE,
        VIEWPORT_CHANGE
    }

    /* renamed from: app.zenly.locator.core.manager.MeUserManager$c */
    private static class C2630c {

        /* renamed from: a */
        final C2629b f7784a;

        /* renamed from: b */
        final C2907v f7785b;

        /* synthetic */ C2630c(C2629b bVar, C2907v vVar, C2628a aVar) {
            this(bVar, vVar);
        }

        private C2630c(C2629b bVar, C2907v vVar) {
            this.f7784a = bVar;
            this.f7785b = vVar;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.MeUserManager$d */
    private static class C2631d {

        /* renamed from: a */
        final C5464h f7786a;

        /* renamed from: b */
        final String f7787b;

        /* renamed from: c */
        final String[] f7788c;

        /* renamed from: d */
        final boolean f7789d;

        /* renamed from: e */
        final boolean f7790e;

        /* renamed from: f */
        final boolean f7791f;

        /* synthetic */ C2631d(C5464h hVar, String str, String[] strArr, boolean z, boolean z2, boolean z3, C2628a aVar) {
            this(hVar, str, strArr, z, z2, z3);
        }

        private C2631d(C5464h hVar, String str, String[] strArr, boolean z, boolean z2, boolean z3) {
            this.f7786a = hVar;
            this.f7787b = str;
            this.f7788c = strArr;
            this.f7789d = z;
            this.f7790e = z2;
            this.f7791f = z3;
        }
    }

    public MeUserManager(C2694h5 h5Var, C1322a aVar) {
        Boolean valueOf = Boolean.valueOf(false);
        this.f7754i = C12785a.m33446h(new String[0]);
        this.f7755j = C12785a.m33446h(valueOf);
        this.f7756k = C12785a.m33446h(valueOf);
        this.f7757l = C12785a.m33446h(valueOf);
        this.f7758m = C12789c.m33462s();
        this.f7759n = C12785a.m33447u();
        this.f7760o = C12785a.m33447u();
        this.f7761p = new C3228o<>();
        this.f7763r = new C2907v();
        this.f7764s = new C2907v();
        this.f7748c = h5Var;
        this.f7747b = C5448c.m15478a();
        this.f7749d = aVar;
        this.f7768w = this.f7749d.mo6511a("feature:contextualizer");
    }

    /* renamed from: a */
    static /* synthetic */ void m8992a(ZenlyProto$TrackingContextSubscribeStreamRequest zenlyProto$TrackingContextSubscribeStreamRequest) throws Exception {
    }

    /* renamed from: a */
    public void mo8752a(Listener listener) {
        if (!this.f7761p.contains(listener)) {
            this.f7761p.add(listener);
        }
    }

    /* renamed from: b */
    public void mo8757b(Listener listener) {
        this.f7761p.remove((Object) listener);
    }

    /* renamed from: c */
    public C12279e<C2879d0> mo8759c() {
        return this.f7759n;
    }

    /* renamed from: d */
    public Disposable mo8761d() {
        C7707a.m18761b("manager:me:start");
        if (!this.f7767v) {
            this.f7767v = true;
            this.f7747b.mapSetViewport(C12279e.m32606a(this.f7752g.mo36431a((BiPredicate<? super T, ? super T>) C2671e3.f7835a), this.f7753h.mo36477d(), this.f7754i.mo36431a((BiPredicate<? super T, ? super T>) C2860y2.f8103a), this.f7755j.mo36477d(), this.f7757l.mo36477d(), this.f7756k.mo36477d(), C2788p3.f8018a).mo36409a(C12270a.LATEST).mo36352a().mo36354a(this.f7751f).mo36369c(C2643b3.f7803e).mo36356a((Consumer<? super T>) C2739m3.f7956e).mo36373f());
        }
        C12275b bVar = new C12275b();
        bVar.add(this.f7758m.mo36428a(this.f7750e).mo36413a((Consumer<? super T>) new C2809r3<Object>(this), (Consumer<? super Throwable>) C2636a3.f7796e, (Action) C2819s3.f8057a));
        bVar.add(C12279e.m32628g(1000, TimeUnit.MILLISECONDS).mo36428a(this.f7751f).mo36413a((Consumer<? super T>) new C2767n3<Object>(this), (Consumer<? super Throwable>) C2692h3.f7863e, (Action) C2685g3.f7849a));
        if (this.f7768w) {
            bVar.add(C2776o5.m9258c().mo8832b().mo36428a(this.f7751f).mo36413a((Consumer<? super T>) new C2693h4<Object>(this), (Consumer<? super Throwable>) C2637a4.f7797e, (Action) C2861y3.f8104a));
        } else {
            bVar.add(this.f7747b.userMeStream().mo36428a(this.f7751f).mo36413a((Consumer<? super T>) new C2717k4<Object>(this), (Consumer<? super Throwable>) C2650c3.f7810e, (Action) C2731l3.f7948a));
            bVar.add(this.f7747b.userLocationStream().mo36409a(C12270a.LATEST).mo36354a(this.f7751f).mo36369c(C2673e5.f7837e).mo36362a((Consumer<? super T>) new C2837u3<Object>(this), (Consumer<? super Throwable>) C2702i4.f7876e, (Action) C2644b4.f7804a));
            bVar.add(C2821s5.m9296c().mo8852b().mo36428a(this.f7751f).mo36501i(C2848w2.f8091e).mo36413a((Consumer<? super T>) new C2774o3<Object>(this), (Consumer<? super Throwable>) C2716k3.f7891e, (Action) C2855x3.f8098a));
        }
        bVar.add(this.f7747b.userHeadingStream().mo36480d(100, TimeUnit.MILLISECONDS).mo36501i(C2798q3.f8029e).mo36477d().mo36428a(this.f7751f).mo36413a((Consumer<? super T>) new C2651c4<Object>(this), (Consumer<? super Throwable>) C2686g4.f7850e, (Action) C2658d4.f7818a));
        bVar.add(this.f7747b.mapViewportStream().mo36468c((Consumer<? super Disposable>) C2867z3.f8110e).mo36409a(C12270a.LATEST).mo36354a(this.f7751f).mo36369c(C2740m4.f7957e).mo36359a((Predicate<? super T>) new C2866z2<Object>(this)).mo36362a((Consumer<? super T>) new C2657d3<Object>(this), (Consumer<? super Throwable>) C2672e4.f7836e, (Action) C2829t3.f8068a));
        bVar.add(C2811r5.m9286c().mo8849b().mo36428a(this.f7751f).mo36413a((Consumer<? super T>) new C2678f3<Object>(this), (Consumer<? super Throwable>) C2701i3.f7875e, (Action) C2708j3.f7882a));
        bVar.add(C2790p5.m9272c().mo8841b().mo36428a(this.f7751f).mo36413a((Consumer<? super T>) new C2849w3<Object>(this), (Consumer<? super Throwable>) C2679f4.f7843e, (Action) C2709j4.f7883a));
        bVar.add(this.f7748c.mo8773b().mo36428a(this.f7751f).mo36413a((Consumer<? super T>) new C2843v3<Object>(this), (Consumer<? super Throwable>) C2854x2.f8097e, (Action) C2732l4.f7949a));
        C7707a.m18759a();
        return bVar;
    }

    /* renamed from: e */
    private void m9001e() {
        C2907v vVar = this.f7763r;
        C2890k kVar = (vVar.f8252c == null || vVar.f8253d > 100.0d) ? null : this.f7766u;
        if (!Objects.equals(kVar, this.f7763r.f8259j)) {
            this.f7763r.f8259j = kVar;
            m8972a(C2629b.BUBBLE_CHANGE);
        }
    }

    /* renamed from: f */
    private void m9003f() {
        if (this.f7749d.mo6511a("feature:heading")) {
            C2907v vVar = this.f7763r;
            C5459d dVar = vVar.f8252c;
            if (dVar != null && vVar.f8260k.mo8992a(dVar)) {
                m8972a(C2629b.SIGNIFICANT_PLACE_HEADING_CHANGE);
            }
        }
    }

    /* renamed from: g */
    private void m9005g() {
        boolean z;
        UserLocationWrapper userLocationWrapper = this.f7762q;
        if (userLocationWrapper == null || !userLocationWrapper.isLive()) {
            C2911c f = this.f7763r.f8260k.mo8997f();
            C2911c cVar = C2911c.UNKNOWN;
            if (f != cVar) {
                this.f7763r.f8260k.mo8990a(cVar);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = this.f7763r.f8260k.mo8993b();
        }
        if (z) {
            m8972a(C2629b.MOVING_STATE_CHANGE);
        }
    }

    /* renamed from: h */
    private void m9007h() {
        C2918b bVar;
        if (this.f7768w) {
            VisitPointWrapper g = this.f7763r.f8260k.mo8998g();
            if (g != null) {
                bVar = g.getPlace();
            } else {
                bVar = C2918b.NONE;
            }
        } else {
            C2907v vVar = this.f7763r;
            C5459d dVar = vVar.f8252c;
            if (dVar == null || vVar.f8253d > 100.0d) {
                bVar = C2918b.NONE;
            } else {
                C2916z a = C2511d.m8765a(vVar.f8256g, dVar.mo13060b(), this.f7763r.f8252c.mo13062c(), this.f7763r.f8253d);
                if (a != null) {
                    bVar = a.mo9017d();
                } else {
                    bVar = C2918b.NONE;
                }
            }
        }
        C2907v vVar2 = this.f7763r;
        if (bVar != vVar2.f8257h) {
            vVar2.f8257h = bVar;
            m8972a(C2629b.SIGNIFICANT_PLACE_CHANGE);
        }
    }

    /* renamed from: i */
    private void m9009i() {
        if (this.f7763r.f8252c != null) {
            UserLocationWrapper userLocationWrapper = this.f7762q;
            double speed = userLocationWrapper != null ? userLocationWrapper.getSpeed() : 0.0d;
            boolean z = System.currentTimeMillis() - (this.f7762q != null ? C5447b.m15473a(C5448c.m15478a(), C3245z.m10288g(this.f7762q.getCreatedAt())) : 0) > 5;
            C2907v vVar = this.f7763r;
            if (speed != vVar.f8261l || z != vVar.f8262m) {
                C2907v vVar2 = this.f7763r;
                vVar2.f8261l = speed;
                vVar2.f8262m = z;
                m8972a(C2629b.SPEED_CHANGE);
            }
        }
    }

    /* renamed from: j */
    private void m9011j() {
        UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation = this.f7765t;
        boolean z = userAnnotationProto$UserAnnotation != null && C3192a0.m10161a(userAnnotationProto$UserAnnotation, this.f7747b);
        C2907v vVar = this.f7763r;
        if (z != vVar.f8258i) {
            vVar.f8258i = z;
            m8972a(C2629b.HAS_BRUMP_CHANGE);
        }
    }

    /* renamed from: b */
    public C2907v mo8756b() {
        C2907v vVar = this.f7764s;
        if (vVar.f8250a != null) {
            return vVar;
        }
        C2907v vVar2 = new C2907v();
        this.f7764s.mo8987a(vVar2);
        UserProto$User userMeCache = C5448c.m15478a().userMeCache();
        vVar2.f8250a = C2879d0.m9332a(userMeCache);
        vVar2.f8251b = C2892m.m9374a(userMeCache);
        return vVar2;
    }

    /* renamed from: c */
    public void mo8760c(boolean z) {
        this.f7757l.onNext(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public C12279e<C5459d> mo8749a() {
        return this.f7760o;
    }

    /* renamed from: a */
    public void mo8754a(boolean z) {
        this.f7755j.onNext(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo8753a(C5464h hVar) {
        C12785a<C5464h> aVar = this.f7752g;
        C5464h hVar2 = new C5464h();
        hVar2.mo13081a(hVar);
        aVar.onNext(hVar2);
    }

    /* renamed from: a */
    public void mo8750a(C2459c cVar) {
        int i = C2628a.f7769a[cVar.f7400a.ordinal()];
        String str = (i == 1 || i == 2) ? cVar.f7380c.f8198b.mo8945g() : (i == 3 || i == 4) ? "" : null;
        if (str != null) {
            this.f7753h.onNext(str);
        }
    }

    /* renamed from: b */
    public void mo8758b(boolean z) {
        this.f7756k.onNext(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo8751a(C2460d dVar) {
        String[] strArr;
        int i = C2628a.f7770b[dVar.f7381a.ordinal()];
        if (i != 1) {
            strArr = i != 2 ? null : new String[0];
        } else {
            String[] strArr2 = new String[dVar.f7382b.size()];
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                strArr2[i2] = ((C2896p) dVar.f7382b.get(i2)).f8198b.mo8945g();
            }
            strArr = strArr2;
        }
        if (strArr != null) {
            this.f7754i.onNext(strArr);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8997b(C5460e eVar) {
        if (this.f7763r.f8255f == null) {
            C2453d.m8561g();
        }
        this.f7763r.f8255f = eVar;
        m8972a(C2629b.VIEWPORT_CHANGE);
    }

    /* renamed from: a */
    static /* synthetic */ C2631d m8966a(C5464h hVar, String str, String[] strArr, boolean z, boolean z2, boolean z3) throws Exception {
        C2631d dVar = new C2631d(hVar, str, strArr, z, z2, z3, null);
        return dVar;
    }

    /* renamed from: a */
    static /* synthetic */ ZenlyProto$TrackingContextSubscribeStreamRequest m8968a(C2631d dVar) throws Exception {
        C7961a newBuilder = ZenlyProto$TrackingContextSubscribeStreamRequest.newBuilder();
        newBuilder.mo21821a(C5457b.m15501a(dVar.f7786a.mo13080a()));
        if (dVar.f7791f && dVar.f7788c.length == 0) {
            newBuilder.mo21823a(C7964c.STANDARD);
            newBuilder.mo21824a(dVar.f7787b);
        } else if (dVar.f7790e) {
            newBuilder.mo21823a(C7964c.HIDDEN);
            newBuilder.mo21824a(dVar.f7787b);
        } else if (dVar.f7789d) {
            newBuilder.mo21823a(C7964c.DISCOVER);
            newBuilder.mo21824a(dVar.f7787b);
        } else if (dVar.f7788c.length > 0) {
            newBuilder.mo21823a(C7964c.GROUP);
            C7963a newBuilder2 = C7962b.newBuilder();
            newBuilder2.mo21825a(Arrays.asList(dVar.f7788c));
            newBuilder.mo21822a(newBuilder2);
        } else {
            newBuilder.mo21823a(C7964c.STANDARD);
            newBuilder.mo21824a(dVar.f7787b);
        }
        return (ZenlyProto$TrackingContextSubscribeStreamRequest) newBuilder.build();
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo8755a(C5460e eVar) throws Exception {
        return !C5457b.m15505a(eVar, this.f7763r.f8255f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8971a(long j) {
        m9011j();
        m9005g();
        m9009i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8988a(C2912x xVar) {
        m8990a(xVar.mo9012a());
        m8985a((UserLocationWrapper) xVar);
        m8986a((VisitPointWrapper) xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8990a(UserProto$User userProto$User) {
        C2879d0 a = C2879d0.m9332a(userProto$User);
        if (a != this.f7763r.f8250a) {
            this.f7759n.onNext(a);
            this.f7763r.f8250a = a;
            m8972a(C2629b.USER_UPDATE);
        }
        C2892m a2 = C2892m.m9374a(userProto$User);
        C2907v vVar = this.f7763r;
        if (a2 != vVar.f8251b) {
            vVar.f8251b = a2;
            m8972a(C2629b.CONFIGURATION_CHANGE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8985a(UserLocationWrapper userLocationWrapper) {
        this.f7762q = userLocationWrapper;
        C5459d dVar = new C5459d(userLocationWrapper.getRawLatitude(), userLocationWrapper.getRawLongitude());
        C2907v vVar = this.f7763r;
        boolean z = true;
        if (vVar.f8252c == null) {
            vVar.f8252c = dVar;
        } else if (!C5457b.m15510b(dVar.mo13060b(), dVar.mo13062c(), this.f7763r.f8252c.mo13060b(), this.f7763r.f8252c.mo13062c())) {
            this.f7763r.f8252c.mo13059a(dVar);
        } else {
            z = false;
        }
        this.f7763r.f8253d = userLocationWrapper.getRawHorizontalPrecision();
        if (z) {
            this.f7760o.onNext(dVar);
            m8972a(C2629b.LOCATION_CHANGE);
            m9001e();
            m9005g();
            m9009i();
            m9003f();
            if (!this.f7768w) {
                m9007h();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8970a(int i) {
        this.f7763r.f8254e = Integer.valueOf(i);
        m8972a(C2629b.HEADING_CHANGE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8989a(UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation) {
        this.f7765t = userAnnotationProto$UserAnnotation;
        m9011j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8991a(C7286e2 e2Var) {
        this.f7763r.f8256g.clear();
        for (PlaceProto$Place a : e2Var.getPlaceList()) {
            this.f7763r.f8256g.add(C2916z.m9413a(a));
        }
        m8972a(C2629b.PLACES_CHANGE);
        if (!this.f7768w) {
            m9007h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8987a(C2890k kVar) {
        this.f7766u = kVar;
        m9001e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8986a(VisitPointWrapper visitPointWrapper) {
        this.f7763r.f8260k.mo8989a(visitPointWrapper);
        if (this.f7768w) {
            m9007h();
        }
        m9005g();
    }

    /* renamed from: a */
    private void m8972a(C2629b bVar) {
        C2630c cVar = new C2630c(bVar, new C2907v(), null);
        this.f7763r.mo8987a(cVar.f7785b);
        this.f7758m.onNext(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8973a(C2630c cVar) {
        cVar.f7785b.mo8987a(this.f7764s);
        this.f7761p.mo9642b();
        for (int size = this.f7761p.size() - 1; size >= 0; size--) {
            ((Listener) this.f7761p.get(size)).onMeUserUpdate(cVar.f7784a, this.f7764s);
        }
        this.f7761p.mo9643c();
    }
}
