package app.zenly.locator.core.manager;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.contracts.MapControllerContract.C2459c;
import app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a;
import app.zenly.locator.core.helper.C2511d;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.manager.p070t5.C2832b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2896p.C2897a;
import app.zenly.locator.core.models.C2898q;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.models.C2908w.C2910b;
import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2912x;
import app.zenly.locator.core.models.C2916z;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.models.TrackingContextWrapper;
import app.zenly.locator.core.models.VisitPointWrapper;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2938b0;
import app.zenly.locator.core.store.api.C2946f0;
import app.zenly.locator.core.store.api.C2950h0;
import app.zenly.locator.core.store.api.C2952i0;
import app.zenly.locator.core.store.api.C2954j0;
import app.zenly.locator.core.store.api.C2983r0;
import app.zenly.locator.core.store.api.C2985s0;
import app.zenly.locator.core.store.api.C2986t;
import app.zenly.locator.core.store.api.C2989t0;
import app.zenly.locator.core.store.api.C2992v;
import app.zenly.locator.core.util.C3192a0;
import app.zenly.locator.core.util.C3243x;
import app.zenly.locator.core.util.C3244y;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5464h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7286e2;
import p213co.znly.models.C7450r;
import p213co.znly.models.C7458s;
import p213co.znly.models.C7478u;
import p213co.znly.models.C7492v2;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserAnnotationProto$UserAnnotation;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7133k;
import p213co.znly.models.core.C7140l;
import p213co.znly.models.core.C7190p2;
import p213co.znly.models.core.C7255y;
import p213co.znly.models.core.TypesProto$Gatherings.C7044b;
import p213co.znly.models.services.C8010c2;
import p213co.znly.models.sleepdetection.C8408b;
import p250f.p251a.p252a.p253a.p259h.C7680a;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.core.manager.k5 */
public class C2718k5 {

    /* renamed from: H */
    private static final long f7893H = TimeUnit.MINUTES.toSeconds(1);

    /* renamed from: I */
    private static final long f7894I = TimeUnit.DAYS.toSeconds(2);

    /* renamed from: J */
    private static final long f7895J = TimeUnit.DAYS.toSeconds(90);

    /* renamed from: K */
    private static final long f7896K = TimeUnit.HOURS.toMillis(1);

    /* renamed from: L */
    private static final C2831a f7897L = new C2831a();

    /* renamed from: M */
    private static final C2832b<C2900b> f7898M = new C2832b<>();

    /* renamed from: A */
    private final SparseArray<C2900b> f7899A;

    /* renamed from: B */
    private final C12785a<Boolean> f7900B;

    /* renamed from: C */
    private final C12279e<Map<String, C2831a>> f7901C;

    /* renamed from: D */
    private final C12279e<SparseArray<C2832b<C2900b>>> f7902D;

    /* renamed from: E */
    private boolean f7903E;

    /* renamed from: F */
    private final C12279e<C5459d> f7904F;

    /* renamed from: G */
    private boolean f7905G;

    /* renamed from: a */
    private final ZenlyCore f7906a;

    /* renamed from: b */
    private final C2694h5 f7907b;

    /* renamed from: c */
    private final C1322a f7908c;

    /* renamed from: d */
    private final ZenlySchedulers f7909d = C1351e.m6372a(C2703i5.f7877b.mo19916a("friendsManager"));

    /* renamed from: e */
    private final C12275b f7910e = new C12275b();

    /* renamed from: f */
    private final C12286f f7911f = this.f7909d.getSingle();

    /* renamed from: g */
    private final C12785a<C7272d0> f7912g = C12785a.m33447u();

    /* renamed from: h */
    private final C12279e<Long> f7913h = C12279e.m32625e(1000, TimeUnit.MILLISECONDS, this.f7911f);

    /* renamed from: i */
    private final C2720b f7914i = new C2720b(this, 20);

    /* renamed from: j */
    private final C2722d f7915j = new C2722d(this, 20);

    /* renamed from: k */
    private final Map<String, C2725g> f7916k = new HashMap();

    /* renamed from: l */
    private final Map<String, C2831a> f7917l = new HashMap();

    /* renamed from: m */
    private final SparseArray<C2726h> f7918m = new SparseArray<>();

    /* renamed from: n */
    private final SparseArray<C2832b<C2898q>> f7919n = new SparseArray<>();

    /* renamed from: o */
    private int f7920o = -1;

    /* renamed from: p */
    private final SparseIntArray f7921p;

    /* renamed from: q */
    private final Set<Integer> f7922q;

    /* renamed from: r */
    private final Set<C2725g> f7923r;

    /* renamed from: s */
    private final Set<C2725g> f7924s;

    /* renamed from: t */
    private final List<Integer> f7925t;

    /* renamed from: u */
    private final Map<C2918b, Integer> f7926u;

    /* renamed from: v */
    private final Map<String, Integer> f7927v;

    /* renamed from: w */
    private final ConcurrentHashMap<String, Long> f7928w;

    /* renamed from: x */
    private final boolean f7929x;

    /* renamed from: y */
    private final boolean f7930y;

    /* renamed from: z */
    private final Map<String, C2896p> f7931z;

    /* renamed from: app.zenly.locator.core.manager.k5$a */
    static /* synthetic */ class C2719a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7932a = new int[C2466a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.core.contracts.MapControllerContract$h$a[] r0 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7932a = r0
                int[] r0 = f7932a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r1 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SELECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7932a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r1 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SWITCH     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f7932a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r1 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.UNSELECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.manager.C2718k5.C2719a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.core.manager.k5$b */
    private class C2720b extends C3243x<C2896p> {
        public C2720b(C2718k5 k5Var, int i) {
            super(i);
        }

        /* renamed from: a */
        public C2896p m9219a() {
            return new C2896p();
        }

        /* renamed from: a */
        public C2896p mo8798a(C2725g gVar) {
            C2896p pVar = (C2896p) super.acquire();
            gVar.mo8975a(pVar);
            return pVar;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.k5$c */
    public static class C2721c {

        /* renamed from: a */
        public final Map<String, C2896p> f7933a;

        /* renamed from: b */
        public final Map<String, C2831a> f7934b;

        /* synthetic */ C2721c(Map map, Map map2, C2719a aVar) {
            this(map, map2);
        }

        /* renamed from: a */
        public boolean mo8799a() {
            return this.f7934b.size() == 0;
        }

        private C2721c(Map<String, C2896p> map, Map<String, C2831a> map2) {
            this.f7933a = map;
            this.f7934b = map2;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.k5$d */
    private class C2722d extends C3243x<C2898q> {
        public C2722d(C2718k5 k5Var, int i) {
            super(i);
        }

        /* renamed from: a */
        public C2898q m9223a() {
            return new C2898q();
        }

        /* renamed from: a */
        public C2898q mo8800a(C2726h hVar) {
            C2898q qVar = (C2898q) acquire();
            hVar.mo8983a(qVar);
            return qVar;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.k5$e */
    public static class C2723e {

        /* renamed from: a */
        public final SparseArray<C2900b> f7935a;

        /* renamed from: b */
        public final SparseArray<C2832b<C2900b>> f7936b;

        public C2723e(SparseArray<C2900b> sparseArray, SparseArray<C2832b<C2900b>> sparseArray2) {
            this.f7935a = sparseArray;
            this.f7936b = sparseArray2;
        }

        /* renamed from: a */
        public boolean mo8801a() {
            return this.f7936b.size() == 0;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.k5$f */
    private class C2724f {

        /* renamed from: a */
        public final List<C7044b> f7937a;

        /* renamed from: b */
        public final C5459d f7938b;

        /* synthetic */ C2724f(C2718k5 k5Var, List list, C5459d dVar, C2719a aVar) {
            this(k5Var, list, dVar);
        }

        private C2724f(C2718k5 k5Var, List<C7044b> list, C5459d dVar) {
            this.f7937a = list;
            this.f7938b = dVar;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.k5$g */
    private class C2725g extends C2896p {

        /* renamed from: F */
        TrackingContextWrapper f7939F;

        /* renamed from: G */
        C7458s f7940G;

        /* renamed from: H */
        C2890k f7941H;

        /* renamed from: I */
        UserAnnotationProto$UserAnnotation f7942I;

        C2725g(C2718k5 k5Var, String str) {
            this.f8197a = str;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.k5$h */
    private class C2726h extends C2898q {

        /* renamed from: l */
        public final List<C2725g> f7943l;

        private C2726h(C2718k5 k5Var) {
            this.f7943l = new ArrayList();
        }

        /* synthetic */ C2726h(C2718k5 k5Var, C2719a aVar) {
            this(k5Var);
        }
    }

    public C2718k5(MeUserManager meUserManager, C2694h5 h5Var, C1322a aVar) {
        new C3244y();
        this.f7921p = new SparseIntArray();
        this.f7922q = new HashSet();
        this.f7923r = new HashSet();
        this.f7924s = new HashSet();
        this.f7925t = new ArrayList();
        this.f7926u = new ArrayMap();
        this.f7927v = new HashMap();
        this.f7928w = new ConcurrentHashMap<>();
        this.f7931z = new HashMap();
        this.f7899A = new SparseArray<>();
        this.f7900B = C12785a.m33446h(Boolean.valueOf(false));
        this.f7903E = false;
        this.f7907b = h5Var;
        this.f7906a = C5448c.m15478a();
        this.f7908c = aVar;
        this.f7904F = meUserManager.mo8749a();
        this.f7929x = this.f7908c.mo6511a("feature:contextualizer");
        this.f7930y = this.f7908c.mo6511a("feature:displayRawPosition");
        this.f7901C = this.f7900B.mo36509m(new C2700i2(this)).mo36501i(new C2684g2(this)).mo36459b((Predicate<? super T>) C2648c1.f7808e).mo36428a((C12286f) this.f7909d.getMainThread()).mo36501i(new C2677f2(this)).mo36506l();
        this.f7902D = this.f7900B.mo36509m(new C2765n1(this)).mo36501i(new C2796q1(this)).mo36459b((Predicate<? super T>) C2655d1.f7815e).mo36428a((C12286f) this.f7909d.getMainThread()).mo36501i(new C2807r1(this)).mo36459b((Predicate<? super T>) C2736m0.f7953e).mo36506l();
        this.f7901C.mo36508m();
        this.f7902D.mo36508m();
    }

    /* renamed from: b */
    static /* synthetic */ boolean m9146b(Map map) throws Exception {
        return map.size() > 0;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m9150c(SparseArray sparseArray) throws Exception {
        return sparseArray.size() > 0;
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo8781a(Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return C12279e.m32633q();
        }
        return C12272c.m32526a(50, TimeUnit.MILLISECONDS, this.f7911f).mo36372e().mo36373f();
    }

    /* renamed from: d */
    public boolean mo8794d(String str) {
        C2896p a = mo8779a(str);
        if (a != null) {
            return a.mo8979d();
        }
        return false;
    }

    /* renamed from: e */
    public /* synthetic */ void mo8795e() throws Exception {
        this.f7910e.mo36401a();
        this.f7900B.onNext(Boolean.valueOf(false));
        this.f7903E = false;
    }

    /* renamed from: f */
    public Disposable mo8796f() {
        C7707a.m18761b("manager:friends:start");
        this.f7900B.onNext(Boolean.valueOf(true));
        if (!this.f7905G) {
            this.f7905G = true;
            this.f7906a.mapSpinnersStream(this.f7912g).mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2841v1<Object>(this), (Consumer<? super Throwable>) C2772o1.f8000e, (Action) C2764n0.f7992a);
        }
        if (this.f7929x) {
            this.f7910e.add(C2776o5.m9258c().mo8831a().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2795q0<Object>(this), (Consumer<? super Throwable>) C2635a2.f7795e, (Action) C2669e1.f7833a));
        } else {
            this.f7910e.add(C2986t.m9500a().friendEvents().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2634a1<Object>(this), (Consumer<? super Throwable>) C2738m2.f7955e, (Action) C2817s1.f8055a));
            this.f7910e.add(this.f7906a.trackingContextStream().mo36428a(this.f7911f).mo36459b((Predicate<? super T>) C2797q2.f8028e).mo36501i(C2680f5.f7844e).mo36413a((Consumer<? super T>) new C2858y0<Object>(this), (Consumer<? super Throwable>) C2691h2.f7862e, (Action) C2835u1.f8078a));
            this.f7910e.add(C2821s5.m9296c().mo8851a().mo36428a(this.f7911f).mo36501i(C2848w2.f8091e).mo36413a((Consumer<? super T>) new C2707j2<Object>(this), (Consumer<? super Throwable>) C2846w0.f8089e, (Action) C2730l2.f7947a));
        }
        this.f7910e.add(C2992v.m9505a().bestFriendEvents().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2806r0<Object>(this), (Consumer<? super Throwable>) C2865z1.f8108e, (Action) C2715k2.f7890a));
        this.f7910e.add(C2811r5.m9286c().mo8848a().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2818s2<Object>(this), (Consumer<? super Throwable>) C2827t1.f8066e, (Action) C2852x0.f8095a));
        C7707a.m18759a();
        return C12276c.m32593a((Action) new C2786p1(this));
    }

    /* renamed from: o */
    private boolean m9186o(C2725g gVar) {
        if (!this.f7908c.mo6511a("feature:sleeping")) {
            return false;
        }
        return gVar.f8192A.mo8927a();
    }

    /* renamed from: p */
    private boolean m9188p(C2725g gVar) {
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper != null) {
            double d = 0.0d;
            if (gVar.f8214r && !gVar.f8208l) {
                d = Math.max(0.0d, trackingContextWrapper.getSpeed());
            }
            boolean z = ((long) ((int) (C5447b.m15475b(C5448c.m15478a()) / 1000))) - trackingContextWrapper.getCreatedAt().getSeconds() > 5;
            if (!C7680a.m18706a(d, gVar.f8195D, 0.01d) || z != gVar.f8196E) {
                gVar.f8195D = d;
                gVar.f8196E = z;
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private boolean m9190q(C2725g gVar) {
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper != null) {
            String timeZoneAtLocation = this.f7906a.timeZoneAtLocation(trackingContextWrapper.getLatitude(), trackingContextWrapper.getLongitude());
            if (!TextUtils.equals(timeZoneAtLocation, gVar.f8218v)) {
                gVar.f8218v = timeZoneAtLocation;
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private boolean m9192r(C2725g gVar) {
        UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation = gVar.f7942I;
        boolean z = userAnnotationProto$UserAnnotation != null && C3192a0.m10161a(userAnnotationProto$UserAnnotation, this.f7906a);
        C2897a aVar = gVar.f8220x;
        if (z == aVar.f8223a) {
            return false;
        }
        aVar.f8223a = z;
        return true;
    }

    /* renamed from: s */
    private boolean m9194s(C2725g gVar) {
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper != null) {
            float b = (float) (((long) ((int) (C5447b.m15475b(C5448c.m15478a()) / 1000))) - trackingContextWrapper.getCreatedAt().getSeconds());
            long j = gVar.f8193B ? f7894I : f7895J;
            long j2 = f7893H;
            float min = 1.0f - Math.min((b - ((float) j2)) / ((float) (j - j2)), 1.0f);
            if (Math.abs(gVar.f8215s - min) > 0.01f) {
                gVar.f8215s = min;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public /* synthetic */ ObservableSource mo8787b(Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return C12279e.m32633q();
        }
        return C12272c.m32526a(50, TimeUnit.MILLISECONDS, this.f7911f).mo36372e().mo36373f();
    }

    /* renamed from: c */
    public long mo8791c(String str) {
        Long l = (Long) this.f7928w.get(str);
        long longValue = l != null ? l.longValue() : 0;
        if (longValue > 0) {
            return C5447b.m15473a(C5448c.m15478a(), longValue);
        }
        return 0;
    }

    /* renamed from: g */
    private boolean m9163g(C2725g gVar) {
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper != null) {
            boolean isInApp = trackingContextWrapper.isInApp();
            if (isInApp != gVar.f8213q) {
                gVar.f8213q = isInApp;
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m9166h(C2725g gVar) {
        if (!this.f7908c.mo6511a("feature:subway")) {
            return false;
        }
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper == null || trackingContextWrapper.isInSubway() == gVar.f8194C) {
            return false;
        }
        gVar.f8194C = gVar.f7939F.isInSubway();
        return true;
    }

    /* renamed from: i */
    private boolean m9169i(C2725g gVar) {
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper != null) {
            boolean isLive = trackingContextWrapper.isLive();
            if (isLive != gVar.f8214r) {
                if (isLive) {
                    C12143a.m32033c("[QA] onLiveStateChange: uuid -> %s, ltc -> %d", gVar.f8197a, Long.valueOf(trackingContextWrapper.getCreatedAt().getSeconds()));
                }
                gVar.f8214r = isLive;
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private boolean m9172j(C2725g gVar) {
        C7458s sVar = gVar.f7940G;
        boolean z = sVar == null || sVar.getLocationAuthorizationStatus() != C7450r.f18641i;
        if (z == gVar.f8193B) {
            return false;
        }
        gVar.f8193B = z;
        return true;
    }

    /* renamed from: k */
    private boolean m9175k(C2725g gVar) {
        boolean z = gVar.f8202f > 100.0d;
        if (z == gVar.f8204h) {
            return false;
        }
        gVar.f8204h = z;
        return true;
    }

    /* renamed from: l */
    private boolean m9178l(C2725g gVar) {
        if (gVar.f7939F != null && gVar.f8214r && !gVar.f8208l) {
            return gVar.f8222z.mo8993b();
        }
        C2911c f = gVar.f8222z.mo8997f();
        C2911c cVar = C2911c.UNKNOWN;
        if (f == cVar) {
            return false;
        }
        gVar.f8222z.mo8990a(cVar);
        return true;
    }

    /* renamed from: m */
    private boolean m9181m(C2725g gVar) {
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper != null) {
            boolean hasWifiEnabled = trackingContextWrapper.getHasWifiEnabled();
            double horizontalPrecision = trackingContextWrapper.getHorizontalPrecision() / 2.0d;
            if (Math.abs(horizontalPrecision - gVar.f8202f) >= 1.0d || hasWifiEnabled != gVar.f8205i) {
                gVar.f8202f = horizontalPrecision;
                gVar.f8205i = hasWifiEnabled;
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m9184n(C2725g gVar) {
        C2918b bVar = C2918b.NONE;
        if (this.f7929x) {
            VisitPointWrapper g = gVar.f8222z.mo8998g();
            if (g != null) {
                bVar = g.getPlace();
            }
        } else {
            TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
            if (trackingContextWrapper != null && !gVar.f8208l && !gVar.f8204h) {
                C2916z a = C2511d.m8765a(gVar.f8221y, trackingContextWrapper.getLatitude(), trackingContextWrapper.getLongitude(), trackingContextWrapper.getHorizontalPrecision());
                if (a != null) {
                    bVar = a.mo9017d();
                }
            }
        }
        if (bVar == gVar.f8219w) {
            return false;
        }
        gVar.f8219w = bVar;
        return true;
    }

    /* renamed from: d */
    public C12279e<C2723e> mo8793d() {
        return this.f7902D.mo36485d(new SparseArray()).mo36501i(new C2649c2(this));
    }

    /* renamed from: e */
    private void m9155e(String str) {
        C2725g gVar = (C2725g) this.f7916k.get(str);
        if (gVar != null) {
            boolean d = gVar.mo8979d();
            gVar.f8201e = true;
            if (gVar.mo8979d() != d) {
                m9105a(1, gVar);
            }
        }
    }

    /* renamed from: c */
    public C12279e<C2721c> mo8792c() {
        return this.f7901C.mo36485d(new HashMap()).mo36501i(new C2808r2(this));
    }

    /* renamed from: a */
    public /* synthetic */ Map mo8782a(Long l) throws Exception {
        HashMap hashMap = new HashMap(this.f7917l);
        this.f7917l.clear();
        return hashMap;
    }

    /* renamed from: d */
    private boolean m9154d(C2725g gVar) {
        if (!this.f7908c.mo6511a("feature:heading")) {
            return false;
        }
        return gVar.f8222z.mo8991a();
    }

    /* renamed from: b */
    public /* synthetic */ SparseArray mo8786b(Long l) throws Exception {
        SparseArray clone = this.f7919n.clone();
        this.f7919n.clear();
        return clone;
    }

    /* renamed from: a */
    public void mo8784a(C2459c cVar) {
        int i = C2719a.f7932a[cVar.f7400a.ordinal()];
        if (i == 1 || i == 2) {
            cVar.f7380c.f8198b.mo8945g();
        }
    }

    /* renamed from: b */
    static /* synthetic */ boolean m9144b(SparseArray sparseArray) throws Exception {
        return sparseArray.size() > 0;
    }

    /* renamed from: c */
    private C2832b<C2898q> m9147c(int i) {
        C2832b<C2898q> bVar = (C2832b) this.f7919n.get(i);
        if (bVar != null) {
            return bVar;
        }
        C2832b<C2898q> bVar2 = new C2832b<>();
        this.f7919n.put(i, bVar2);
        return bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public SparseArray<C2832b<C2900b>> m9152d(SparseArray<C2832b<C2898q>> sparseArray) {
        SparseArray<C2832b<C2900b>> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            C2832b b = m9142b((C2832b) sparseArray.get(keyAt));
            if (b != null) {
                sparseArray2.put(keyAt, b);
            }
        }
        return sparseArray2;
    }

    /* renamed from: e */
    private boolean m9157e(C2725g gVar) {
        boolean z = gVar.f7939F == null || C5447b.m15475b(C5448c.m15478a()) - C3245z.m10288g(gVar.f7939F.getCreatedAt()) > f7896K;
        C2910b d = gVar.f8222z.mo8995d();
        if (z == d.mo9011i()) {
            return false;
        }
        d.mo9001a(z);
        return true;
    }

    /* renamed from: a */
    public void mo8785a(C5464h hVar) {
        this.f7912g.onNext(C5457b.m15501a(hVar.mo13080a()));
    }

    /* renamed from: b */
    public Collection<C2900b> mo8790b() {
        ArrayList arrayList = new ArrayList(this.f7899A.size());
        for (int i = 0; i < this.f7899A.size(); i++) {
            arrayList.add(this.f7899A.valueAt(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C2896p mo8779a(String str) {
        return (C2896p) this.f7931z.get(str);
    }

    /* renamed from: c */
    private boolean m9151c(C2725g gVar) {
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        if (trackingContextWrapper != null) {
            boolean z = trackingContextWrapper.getGhostType() == C7492v2.city;
            if (z != gVar.f8208l) {
                gVar.f8208l = z;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C2900b mo8780a(int i) {
        return (C2900b) this.f7899A.get(i);
    }

    /* renamed from: a */
    public /* synthetic */ C2721c mo8776a(Map map) throws Exception {
        return new C2721c(this.f7931z, map, null);
    }

    /* renamed from: b */
    public C12279e<C2831a> mo8789b(String str) {
        return this.f7901C.mo36501i(new C2676f1(str)).mo36485d(new C2831a(Integer.MAX_VALUE, (C2896p) this.f7931z.get(str))).mo36459b((Predicate<? super T>) C2853x1.f8096e);
    }

    /* renamed from: a */
    static /* synthetic */ C2831a m9101a(String str, Map map) throws Exception {
        C2831a aVar = (C2831a) map.get(str);
        return aVar == null ? f7897L : aVar;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m9138a(C2831a aVar) throws Exception {
        return aVar.mo8858c() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Map<String, C2831a> m9148c(Map<String, C2831a> map) {
        for (C2831a aVar : map.values()) {
            aVar.mo8856a(m9103a(aVar.mo8858c()));
        }
        return map;
    }

    /* renamed from: a */
    public /* synthetic */ C2723e mo8777a(SparseArray sparseArray) throws Exception {
        return new C2723e(this.f7899A, sparseArray);
    }

    /* renamed from: b */
    public C12279e<C2832b<C2900b>> mo8788b(int i) {
        return this.f7902D.mo36501i(new C2641b1(i)).mo36485d(new C2832b(Integer.MAX_VALUE, (C2898q) this.f7899A.get(i))).mo36459b((Predicate<? super T>) C2828t2.f8067e);
    }

    /* renamed from: a */
    static /* synthetic */ C2832b m9102a(int i, SparseArray sparseArray) throws Exception {
        C2832b bVar = (C2832b) sparseArray.get(i);
        return bVar == null ? f7898M : bVar;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m9139a(C2832b bVar) throws Exception {
        return bVar.mo8866c() != null;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m9140a(TrackingContextProto$TrackingContext trackingContextProto$TrackingContext) throws Exception {
        return trackingContextProto$TrackingContext != null && trackingContextProto$TrackingContext.hasCreatedAt();
    }

    /* renamed from: b */
    private boolean m9145b(C2725g gVar) {
        C2890k kVar = (gVar.f7939F == null || gVar.f8208l || gVar.f8204h) ? null : gVar.f7941H;
        if (Objects.equals(kVar, gVar.f8210n)) {
            return false;
        }
        gVar.f8210n = kVar;
        return true;
    }

    /* renamed from: a */
    public void mo8783a() {
        if (!this.f7903E) {
            this.f7903E = true;
            this.f7910e.add(this.f7913h.mo36413a((Consumer<? super T>) new C2816s0<Object>(this), (Consumer<? super Throwable>) C2714k1.f7889e, (Action) C2737m1.f7954a));
            this.f7910e.add(this.f7906a.userFriendsDevicesStream().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2787p2<Object>(this), (Consumer<? super Throwable>) C2847w1.f8090e, (Action) C2706j1.f7880a));
            this.f7910e.add(this.f7906a.chatUnreadCounters().mo36459b((Predicate<? super T>) C2699i1.f7873e).mo36501i(C2632a.f7792e).mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2864z0<Object>(this), (Consumer<? super Throwable>) C2683g1.f7847e, (Action) C2773o2.f8001a));
            this.f7910e.add(this.f7907b.mo8772a().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2670e2<Object>(this), (Consumer<? super Throwable>) C2785p0.f8015e, (Action) C2826t0.f8065a));
            this.f7910e.add(this.f7906a.gatheringsStream().mo36501i(C2842v2.f8085e).mo36426a((ObservableSource<? extends U>) this.f7904F, (BiFunction<? super T, ? super U, ? extends R>) new C2729l1<Object,Object,Object>(this)).mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2840v0<Object>(this), (Consumer<? super Throwable>) C2766n2.f7994e, (Action) C2859y1.f8102a));
            this.f7910e.add(C2790p5.m9272c().mo8840a().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2642b2<Object>(this), (Consumer<? super Throwable>) C2834u0.f8077e, (Action) C2690h1.f7861a));
            if (this.f7908c.mo6511a("feature:sleeping")) {
                this.f7910e.add(this.f7906a.sleepingStateStream().mo36428a(this.f7911f).mo36413a((Consumer<? super T>) new C2836u2<Object>(this), (Consumer<? super Throwable>) C2656d2.f7816e, (Action) C2771o0.f7999a));
            }
        }
    }

    /* renamed from: b */
    private C2832b<C2900b> m9142b(C2832b<C2898q> bVar) {
        C2900b bVar2 = (C2900b) this.f7899A.get(bVar.mo8866c().f8224a);
        if (bVar2 != null || !C2832b.m9308a(bVar.mo8864b(), 2)) {
            if (bVar2 == null) {
                bVar2 = new C2900b();
                bVar.mo8866c().mo8983a(bVar2);
                this.f7899A.put(bVar.mo8866c().f8224a, bVar2);
            } else {
                bVar.mo8866c().mo8983a(bVar2);
            }
            this.f7915j.release(bVar.mo8866c());
            if (C2832b.m9308a(bVar.mo8864b(), 2)) {
                this.f7899A.remove(bVar2.f8224a);
            }
            C2832b<C2900b> bVar3 = new C2832b<>();
            bVar3.mo8863a(bVar2);
            bVar3.mo8861a(bVar.mo8864b());
            ArrayList d = bVar.mo8867d();
            for (int i = 0; i < d.size(); i++) {
                bVar3.mo8867d().add(m9103a((C2896p) d.get(i)));
            }
            bVar2.f8240l.removeAll(bVar3.mo8867d());
            ArrayList a = bVar.mo8860a();
            for (int i2 = 0; i2 < a.size(); i2++) {
                bVar3.mo8860a().add(m9103a((C2896p) a.get(i2)));
            }
            bVar2.f8240l.addAll(bVar3.mo8860a());
            return bVar3;
        }
        this.f7915j.release(bVar.mo8866c());
        return null;
    }

    /* renamed from: f */
    private C2725g m9158f(String str) {
        C2725g gVar = (C2725g) this.f7916k.get(str);
        if (gVar != null) {
            return gVar;
        }
        C2725g gVar2 = new C2725g(this, str);
        this.f7916k.put(str, gVar2);
        return gVar2;
    }

    /* renamed from: f */
    private boolean m9160f(C2725g gVar) {
        boolean z = false;
        if (!this.f7908c.mo6511a("feature:heading")) {
            return false;
        }
        C5459d dVar = gVar.f8199c;
        if (dVar != null && gVar.f8222z.mo8992a(dVar)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m9141a(C7255y yVar) throws Exception {
        return yVar.hasTriggeredBy() && yVar.getTriggeredBy().getType() == C7133k.f17667f;
    }

    /* renamed from: a */
    public /* synthetic */ C2724f mo8778a(List list, C5459d dVar) throws Exception {
        return new C2724f(this, list, dVar, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9106a(long j) {
        for (String str : this.f7916k.keySet()) {
            C2725g gVar = (C2725g) this.f7916k.get(str);
            int i = 0;
            if (!this.f7929x && m9163g(gVar)) {
                i = 16384;
            }
            if (!this.f7929x && m9169i(gVar)) {
                i |= 32768;
            }
            if (m9194s(gVar)) {
                i |= 65536;
            }
            if (m9188p(gVar)) {
                i |= 32;
            }
            if (C2831a.m9302a(i, 32768)) {
                if (m9178l(gVar)) {
                    m9105a(131072, gVar);
                }
                if (!this.f7929x && m9184n(gVar)) {
                    m9105a(262144, gVar);
                }
            }
            if (m9154d(gVar) || m9157e(gVar)) {
                m9105a(1048576, gVar);
            }
            if (m9192r(gVar)) {
                i |= 524288;
            }
            if (m9186o(gVar)) {
                m9105a(2097152, gVar);
            }
            if (i != 0) {
                m9105a(i, gVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9128a(C2985s0 s0Var) {
        if (s0Var instanceof C2989t0) {
            HashSet hashSet = new HashSet();
            for (C2936a0 a0Var : ((C2989t0) s0Var).mo9171a()) {
                hashSet.add(a0Var.mo9074a().getUuid());
                m9130a(a0Var.mo9074a());
            }
            for (String str : this.f7916k.keySet()) {
                if (!hashSet.contains(str)) {
                    m9155e(str);
                }
            }
        } else if (s0Var instanceof C2983r0) {
            m9130a(((C2983r0) s0Var).mo9165a().mo9074a());
        } else if (s0Var instanceof C2938b0) {
            m9155e(((C2938b0) s0Var).mo9078a().mo9074a().getUuid());
        }
    }

    /* renamed from: a */
    private void m9130a(UserProto$User userProto$User) {
        C2725g f = m9158f(userProto$User.getUuid());
        boolean d = f.mo8979d();
        C2879d0 a = C2879d0.m9332a(userProto$User);
        if (a != f.f8198b || f.f8201e) {
            if (f.f8198b == null) {
                C12143a.m32033c("[QA] onReceiveFriendUser: uuid -> %s, name -> %s", a.mo8945g(), a.mo8942e());
            }
            f.f8201e = false;
            f.f8198b = a;
            m9105a(2, f);
            if (f.mo8979d() != d) {
                m9105a(1, f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9125a(C2912x xVar) {
        m9122a((TrackingContextWrapper) xVar);
        m9123a((VisitPointWrapper) xVar);
        if (xVar.mo9013b()) {
            m9155e(xVar.getUserUuid());
        } else {
            m9130a(xVar.mo9012a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9122a(TrackingContextWrapper trackingContextWrapper) {
        C2725g f = m9158f(trackingContextWrapper.getUserUuid());
        boolean d = f.mo8979d();
        f.f7939F = trackingContextWrapper;
        long seconds = trackingContextWrapper.getCreatedAt().getSeconds();
        TrackingContextWrapper trackingContextWrapper2 = f.f7939F;
        if ((trackingContextWrapper2 != null ? trackingContextWrapper2.getCreatedAt().getSeconds() : 0) <= seconds) {
            this.f7928w.put(trackingContextWrapper.getUserUuid(), Long.valueOf(C3245z.m10288g(trackingContextWrapper.getCreatedAt())));
            int i = 0;
            if (this.f7930y) {
                C5459d dVar = f.f8200d;
                if (dVar == null || !C5457b.m15510b(dVar.mo13060b(), f.f8200d.mo13062c(), trackingContextWrapper.getRawLatitude(), trackingContextWrapper.getRawLongitude())) {
                    C5459d dVar2 = f.f8200d;
                    if (dVar2 == null) {
                        f.f8200d = new C5459d(trackingContextWrapper.getRawLatitude(), trackingContextWrapper.getRawLongitude());
                    } else {
                        dVar2.mo13061b(trackingContextWrapper.getRawLatitude());
                        f.f8200d.mo13063c(trackingContextWrapper.getRawLongitude());
                    }
                    i = 4;
                }
                if (Math.abs(trackingContextWrapper.getRawHorizontalPrecision() - f.f8203g) >= 1.0d) {
                    f.f8203g = trackingContextWrapper.getRawHorizontalPrecision();
                    i |= 8;
                }
            }
            C5459d dVar3 = f.f8199c;
            if (dVar3 == null || !C5457b.m15510b(dVar3.mo13060b(), f.f8199c.mo13062c(), trackingContextWrapper.getLatitude(), trackingContextWrapper.getLongitude())) {
                C5459d dVar4 = f.f8199c;
                if (dVar4 == null) {
                    f.f8199c = new C5459d(trackingContextWrapper.getLatitude(), trackingContextWrapper.getLongitude());
                } else {
                    dVar4.mo13061b(trackingContextWrapper.getLatitude());
                    f.f8199c.mo13063c(trackingContextWrapper.getLongitude());
                }
                if (trackingContextWrapper.getHeight() != -1.0d) {
                    f.f8199c.mo13058a(trackingContextWrapper.getHeight());
                } else {
                    f.f8199c.mo13057a();
                }
                i |= 4;
            }
            if (f.mo8979d() != d) {
                i |= 1;
            }
            if (m9181m(f)) {
                i |= 8;
            }
            if (m9175k(f)) {
                i |= 16;
            }
            if (m9137a(f)) {
                i |= 64;
            }
            if (m9151c(f)) {
                i |= 128;
            }
            if (m9163g(f)) {
                i |= 16384;
            }
            if (m9169i(f)) {
                i |= 32768;
            }
            if (m9194s(f)) {
                i |= 65536;
            }
            if (m9188p(f)) {
                i |= 32;
            }
            if (C2831a.m9302a(i, 32916) && !this.f7929x && m9184n(f)) {
                i |= 262144;
            }
            if (C2831a.m9302a(i, 144) && m9145b(f)) {
                i |= 8192;
            }
            if (C2831a.m9302a(i, 32896) && m9178l(f)) {
                i |= 131072;
            }
            if (C2831a.m9302a(i, 4)) {
                if (m9190q(f)) {
                    i |= ItemAnimator.FLAG_MOVED;
                }
                if (m9160f(f)) {
                    m9105a(1048576, f);
                }
            }
            if (m9157e(f)) {
                m9105a(1048576, f);
            }
            if (m9166h(f)) {
                m9105a(8388608, f);
            }
            if (i != 0) {
                m9105a(i, f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9127a(C2952i0 i0Var) {
        if (i0Var instanceof C2954j0) {
            for (C2946f0 a : ((C2954j0) i0Var).mo9113a()) {
                m9126a(a);
            }
        } else if (i0Var instanceof C2950h0) {
            m9126a(((C2950h0) i0Var).mo9109a());
        }
    }

    /* renamed from: a */
    private void m9126a(C2946f0 f0Var) {
        C2725g f = m9158f(f0Var.mo9096c());
        f.f8209m = f0Var.mo9095b();
        f.f8217u = f0Var.mo9094a() < 5;
        m9105a(256, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9133a(C7286e2 e2Var) {
        C2725g f = m9158f(e2Var.getUserUuid());
        f.f8221y.clear();
        for (PlaceProto$Place a : e2Var.getPlaceList()) {
            f.f8221y.add(C2916z.m9413a(a));
        }
        m9105a(512, f);
        if (!this.f7929x && m9184n(f)) {
            m9105a(262144, f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9134a(C8010c2 c2Var) {
        C2725g f = m9158f(c2Var.getDevice().getUserUuid());
        f.f7940G = c2Var.getDevice();
        if (m9137a(f)) {
            m9105a(64, f);
        }
        if (m9172j(f)) {
            m9105a(4194304, f);
            if (m9194s(f)) {
                m9105a(65536, f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9132a(C7190p2 p2Var) {
        C2725g f = m9158f(p2Var.getUuid());
        if (p2Var.getSpinner() != f.f8211o) {
            f.f8211o = p2Var.getSpinner();
            m9105a(1024, f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9131a(C7140l lVar) {
        long unreadMessages = lVar.getUnreadMessages() + lVar.getUnreadEmojis();
        C2725g f = m9158f(lVar.getUserUuid());
        if (unreadMessages != ((long) f.f8212p)) {
            f.f8212p = (int) unreadMessages;
            m9105a(4096, f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9124a(C2890k kVar) {
        C2725g f = m9158f(kVar.mo8962b().getUserUuid());
        if (TextUtils.isEmpty(kVar.mo8962b().getBubbleId())) {
            kVar = null;
        }
        if (!Objects.equals(kVar, f.f7941H)) {
            f.f7941H = kVar;
            if (m9145b(f)) {
                m9105a(8192, f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9123a(VisitPointWrapper visitPointWrapper) {
        C2725g f = m9158f(visitPointWrapper.getUserUuid());
        f.f8222z.mo8989a(visitPointWrapper);
        if (m9178l(f)) {
            m9105a(131072, f);
        }
        if (m9184n(f)) {
            m9105a(262144, f);
        }
        if (m9154d(f)) {
            m9105a(1048576, f);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x030b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m9107a(app.zenly.locator.core.manager.C2718k5.C2724f r48) {
        /*
            r47 = this;
            r0 = r47
            r1 = r48
            java.util.List<co.znly.models.core.TypesProto$Gatherings$b> r2 = r1.f7937a
            java.util.Iterator r2 = r2.iterator()
        L_0x000a:
            boolean r3 = r2.hasNext()
            r5 = -1
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x050a
            java.lang.Object r3 = r2.next()
            co.znly.models.core.TypesProto$Gatherings$b r3 = (p213co.znly.models.core.TypesProto$Gatherings.C7044b) r3
            co.znly.core.ZenlyCore r8 = r0.f7906a
            java.lang.String r8 = app.zenly.locator.p143s.p148l.C5447b.m15477d(r8)
            java.util.List r3 = r3.getUserUuidsList()
            java.util.Iterator r3 = r3.iterator()
            r9 = 0
        L_0x0028:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x006a
            java.lang.Object r10 = r3.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = android.text.TextUtils.equals(r10, r8)
            if (r11 == 0) goto L_0x003c
            r9 = 1
            goto L_0x0028
        L_0x003c:
            app.zenly.locator.core.manager.k5$g r10 = r0.m9158f(r10)
            boolean r11 = r10.f8208l
            if (r11 != 0) goto L_0x0028
            java.util.Set<app.zenly.locator.core.manager.k5$g> r11 = r0.f7924s
            r11.add(r10)
            int r11 = r10.f8216t
            if (r11 == r5) goto L_0x0028
            java.util.Set<java.lang.Integer> r12 = r0.f7922q
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r12.contains(r11)
            if (r11 != 0) goto L_0x0028
            android.util.SparseIntArray r11 = r0.f7921p
            int r12 = r10.f8216t
            int r11 = r11.get(r12, r6)
            int r11 = r11 + r7
            android.util.SparseIntArray r12 = r0.f7921p
            int r10 = r10.f8216t
            r12.put(r10, r11)
            goto L_0x0028
        L_0x006a:
            r3 = 0
            r8 = -1
            r10 = 0
        L_0x006d:
            android.util.SparseIntArray r11 = r0.f7921p
            int r11 = r11.size()
            if (r3 >= r11) goto L_0x0088
            android.util.SparseIntArray r11 = r0.f7921p
            int r11 = r11.keyAt(r3)
            android.util.SparseIntArray r12 = r0.f7921p
            int r12 = r12.get(r11)
            if (r12 <= r10) goto L_0x0085
            r8 = r11
            r10 = r12
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x006d
        L_0x0088:
            if (r8 != r5) goto L_0x009a
            int r3 = r0.f7920o
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r8) goto L_0x0096
            int r3 = r3 + 1
            r0.f7920o = r3
            goto L_0x0098
        L_0x0096:
            r0.f7920o = r6
        L_0x0098:
            int r8 = r0.f7920o
        L_0x009a:
            java.util.Set<java.lang.Integer> r3 = r0.f7922q
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r3.add(r10)
            android.util.SparseArray<app.zenly.locator.core.manager.k5$h> r3 = r0.f7918m
            java.lang.Object r3 = r3.get(r8)
            app.zenly.locator.core.manager.k5$h r3 = (app.zenly.locator.core.manager.C2718k5.C2726h) r3
            r10 = 0
            if (r3 != 0) goto L_0x00c1
            app.zenly.locator.core.manager.k5$h r3 = new app.zenly.locator.core.manager.k5$h
            r3.<init>(r0, r10)
            r3.f8224a = r8
            android.util.SparseArray<app.zenly.locator.core.manager.k5$h> r11 = r0.f7918m
            r11.put(r8, r3)
            app.zenly.locator.core.manager.t5.b r11 = r0.m9147c(r8)
            r11.mo8861a(r7)
        L_0x00c1:
            java.util.Set<app.zenly.locator.core.manager.k5$g> r11 = r0.f7923r
            java.util.List<app.zenly.locator.core.manager.k5$g> r12 = r3.f7943l
            r11.addAll(r12)
            java.util.Set<app.zenly.locator.core.manager.k5$g> r11 = r0.f7923r
            java.util.Iterator r11 = r11.iterator()
        L_0x00ce:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00fb
            java.lang.Object r12 = r11.next()
            app.zenly.locator.core.manager.k5$g r12 = (app.zenly.locator.core.manager.C2718k5.C2725g) r12
            java.util.Set<app.zenly.locator.core.manager.k5$g> r13 = r0.f7924s
            boolean r13 = r13.contains(r12)
            if (r13 != 0) goto L_0x00ce
            java.util.List<app.zenly.locator.core.manager.k5$g> r13 = r3.f7943l
            r13.remove(r12)
            int r13 = r12.f8216t
            if (r13 != r8) goto L_0x00ce
            r12.f8216t = r5
            app.zenly.locator.core.manager.t5.b r13 = r0.m9147c(r13)
            app.zenly.locator.core.manager.k5$b r14 = r0.f7914i
            app.zenly.locator.core.models.p r12 = r14.mo8798a(r12)
            r13.mo8865b(r12)
            goto L_0x00ce
        L_0x00fb:
            r11 = 4636033603912859648(0x4056800000000000, double:90.0)
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            app.zenly.locator.core.models.z$b r16 = app.zenly.locator.core.models.C2916z.C2918b.NONE
            r17 = 0
            if (r9 == 0) goto L_0x0156
            app.zenly.locator.s.n.d r10 = r1.f7938b
            double r4 = r10.mo13060b()
            double r11 = java.lang.Math.min(r11, r4)
            app.zenly.locator.s.n.d r4 = r1.f7938b
            double r4 = r4.mo13062c()
            double r13 = java.lang.Math.min(r13, r4)
            app.zenly.locator.s.n.d r4 = r1.f7938b
            double r4 = r4.mo13060b()
            double r6 = java.lang.Math.max(r6, r4)
            app.zenly.locator.s.n.d r4 = r1.f7938b
            double r4 = r4.mo13062c()
            r22 = r6
            r6 = -4582834833314545664(0xc066800000000000, double:-180.0)
            double r4 = java.lang.Math.max(r6, r4)
            app.zenly.locator.s.n.d r6 = r1.f7938b
            double r6 = r6.mo13060b()
            double r6 = r6 + r17
            app.zenly.locator.s.n.d r10 = r1.f7938b
            double r20 = r10.mo13062c()
            double r20 = r20 + r17
            r24 = r11
            r10 = r6
            r6 = r4
            r4 = 1
            r5 = 1
            goto L_0x0166
        L_0x0156:
            r4 = r6
            r6 = -4582834833314545664(0xc066800000000000, double:-180.0)
            r22 = r4
            r24 = r11
            r10 = r17
            r20 = r10
            r4 = 0
            r5 = 0
        L_0x0166:
            java.util.Set<app.zenly.locator.core.manager.k5$g> r12 = r0.f7924s
            java.util.Iterator r12 = r12.iterator()
            r32 = r5
            r28 = r17
            r15 = 0
            r26 = 0
            r27 = 0
            r30 = 1
            r31 = 0
            r5 = r4
            r4 = 0
            r44 = r16
            r16 = r2
            r1 = r24
            r25 = 0
            r24 = r9
            r9 = r44
            r45 = r6
            r6 = r22
            r21 = r20
            r19 = r10
            r10 = r45
        L_0x0191:
            boolean r33 = r12.hasNext()
            if (r33 == 0) goto L_0x0355
            java.lang.Object r33 = r12.next()
            r34 = r12
            r12 = r33
            app.zenly.locator.core.manager.k5$g r12 = (app.zenly.locator.core.manager.C2718k5.C2725g) r12
            r33 = r15
            java.util.Set<app.zenly.locator.core.manager.k5$g> r15 = r0.f7923r
            boolean r15 = r15.contains(r12)
            if (r15 != 0) goto L_0x01d8
            int r15 = r12.f8216t
            r35 = r4
            if (r15 == r8) goto L_0x01c3
            r4 = -1
            if (r15 == r4) goto L_0x01c3
            r12.f8216t = r4
            app.zenly.locator.core.manager.t5.b r4 = r0.m9147c(r15)
            app.zenly.locator.core.manager.k5$b r15 = r0.f7914i
            app.zenly.locator.core.models.p r15 = r15.mo8798a(r12)
            r4.mo8865b(r15)
        L_0x01c3:
            java.util.List<app.zenly.locator.core.manager.k5$g> r4 = r3.f7943l
            r4.add(r12)
            r12.f8216t = r8
            app.zenly.locator.core.manager.t5.b r4 = r0.m9147c(r8)
            app.zenly.locator.core.manager.k5$b r15 = r0.f7914i
            app.zenly.locator.core.models.p r15 = r15.mo8798a(r12)
            r4.mo8862a(r15)
            goto L_0x01da
        L_0x01d8:
            r35 = r4
        L_0x01da:
            boolean r4 = r12.mo8979d()
            if (r4 == 0) goto L_0x033f
            int r5 = r5 + 1
            app.zenly.locator.s.n.d r4 = r12.f8199c
            r15 = r5
            double r4 = r4.mo13060b()
            double r1 = java.lang.Math.min(r1, r4)
            app.zenly.locator.s.n.d r4 = r12.f8199c
            double r4 = r4.mo13062c()
            double r4 = java.lang.Math.min(r13, r4)
            app.zenly.locator.s.n.d r13 = r12.f8199c
            double r13 = r13.mo13060b()
            double r6 = java.lang.Math.max(r6, r13)
            app.zenly.locator.s.n.d r13 = r12.f8199c
            double r13 = r13.mo13062c()
            double r10 = java.lang.Math.max(r10, r13)
            app.zenly.locator.s.n.d r13 = r12.f8199c
            double r13 = r13.mo13060b()
            double r19 = r19 + r13
            app.zenly.locator.s.n.d r13 = r12.f8199c
            double r13 = r13.mo13062c()
            double r21 = r21 + r13
            app.zenly.locator.core.models.z$b r13 = r12.f8219w
            app.zenly.locator.core.models.z$b r14 = app.zenly.locator.core.models.C2916z.C2918b.NONE
            if (r13 == r14) goto L_0x0223
            r13 = 1
            goto L_0x0224
        L_0x0223:
            r13 = 0
        L_0x0224:
            if (r13 != 0) goto L_0x0231
            boolean r14 = r12.f8204h
            if (r14 != 0) goto L_0x0231
            app.zenly.locator.core.models.z$b r9 = app.zenly.locator.core.models.C2916z.C2918b.NONE
            r36 = r1
            r26 = 1
            goto L_0x0279
        L_0x0231:
            if (r26 != 0) goto L_0x0277
            if (r13 == 0) goto L_0x0277
            java.util.Map<app.zenly.locator.core.models.z$b, java.lang.Integer> r13 = r0.f7926u
            app.zenly.locator.core.models.z$b r14 = r12.f8219w
            java.lang.Object r13 = r13.get(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 != 0) goto L_0x0247
            r14 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            goto L_0x0251
        L_0x0247:
            r14 = 1
            int r13 = r13.intValue()
            int r13 = r13 + r14
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
        L_0x0251:
            java.util.Map<app.zenly.locator.core.models.z$b, java.lang.Integer> r14 = r0.f7926u
            r36 = r1
            app.zenly.locator.core.models.z$b r1 = r12.f8219w
            r14.put(r1, r13)
            app.zenly.locator.core.models.z$b r1 = r12.f8219w
            if (r1 == r9) goto L_0x0279
            app.zenly.locator.core.models.z$b r1 = app.zenly.locator.core.models.C2916z.C2918b.NONE
            if (r9 == r1) goto L_0x0274
            int r1 = r13.intValue()
            java.util.Map<app.zenly.locator.core.models.z$b, java.lang.Integer> r2 = r0.f7926u
            java.lang.Object r2 = r2.get(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x0279
        L_0x0274:
            app.zenly.locator.core.models.z$b r9 = r12.f8219w
            goto L_0x0279
        L_0x0277:
            r36 = r1
        L_0x0279:
            app.zenly.locator.core.models.k r1 = r12.f8210n
            if (r1 == 0) goto L_0x02d3
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r0.f7927v
            co.znly.models.bubble.b r1 = r1.mo8962b()
            java.lang.String r1 = r1.getBubbleId()
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0295
            r2 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x029f
        L_0x0295:
            r2 = 1
            int r1 = r1.intValue()
            int r1 = r1 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x029f:
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r0.f7927v
            app.zenly.locator.core.models.k r13 = r12.f8210n
            co.znly.models.bubble.b r13 = r13.mo8962b()
            java.lang.String r13 = r13.getBubbleId()
            r2.put(r13, r1)
            app.zenly.locator.core.models.k r2 = r12.f8210n
            r13 = r35
            if (r2 == r13) goto L_0x02d5
            if (r13 == 0) goto L_0x02d0
            int r1 = r1.intValue()
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r0.f7927v
            co.znly.models.bubble.b r14 = r13.mo8962b()
            java.lang.String r14 = r14.getBubbleId()
            java.lang.Object r2 = r2.get(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x02d5
        L_0x02d0:
            app.zenly.locator.core.models.k r1 = r12.f8210n
            goto L_0x02d6
        L_0x02d3:
            r13 = r35
        L_0x02d5:
            r1 = r13
        L_0x02d6:
            int r2 = r12.f8212p
            int r2 = r33 + r2
            r13 = r27
            if (r13 != 0) goto L_0x02e8
            boolean r13 = r12.f8217u
            if (r13 == 0) goto L_0x02e3
            goto L_0x02e8
        L_0x02e3:
            r14 = r1
            r27 = r2
            r13 = 0
            goto L_0x02ec
        L_0x02e8:
            r14 = r1
            r27 = r2
            r13 = 1
        L_0x02ec:
            double r1 = r12.f8209m
            r38 = r6
            r6 = r28
            double r1 = java.lang.Math.max(r6, r1)
            if (r25 != 0) goto L_0x0305
            boolean r6 = r12.f8208l
            if (r6 != 0) goto L_0x0303
            boolean r6 = r12.f8204h
            if (r6 != 0) goto L_0x0303
            r25 = 1
            goto L_0x0305
        L_0x0303:
            r25 = 0
        L_0x0305:
            app.zenly.locator.core.models.p$a r6 = r12.f8220x
            boolean r6 = r6.f8223a
            if (r6 == 0) goto L_0x030d
            int r31 = r31 + 1
        L_0x030d:
            app.zenly.locator.core.models.c0 r6 = r12.f8192A
            app.zenly.locator.core.models.c0$a r6 = r6.mo8930d()
            app.zenly.locator.core.models.c0$a r7 = app.zenly.locator.core.models.C2874c0.C2875a.ASLEEP
            if (r6 == r7) goto L_0x032a
            app.zenly.locator.core.models.c0 r6 = r12.f8192A
            app.zenly.locator.core.models.c0$a r6 = r6.mo8930d()
            app.zenly.locator.core.models.c0$a r7 = app.zenly.locator.core.models.C2874c0.C2875a.PROBABLY_ASLEEP
            if (r6 == r7) goto L_0x032a
            r28 = r1
            r1 = r36
            r6 = r38
            r30 = 0
            goto L_0x0330
        L_0x032a:
            r28 = r1
            r1 = r36
            r6 = r38
        L_0x0330:
            r32 = 1
            r44 = r27
            r27 = r13
            r45 = r4
            r4 = r14
            r13 = r45
            r5 = r15
            r15 = r44
            goto L_0x0351
        L_0x033f:
            r15 = r27
            r4 = r35
            r44 = r6
            r6 = r28
            r27 = r44
            r27 = r15
            r28 = r6
            r6 = r44
            r15 = r33
        L_0x0351:
            r12 = r34
            goto L_0x0191
        L_0x0355:
            r33 = r15
            r15 = r27
            r44 = r6
            r6 = r28
            r27 = r44
            if (r25 == 0) goto L_0x0368
            r12 = 2
            if (r5 < r12) goto L_0x0368
            r34 = r1
            r12 = 1
            goto L_0x036b
        L_0x0368:
            r34 = r1
            r12 = 0
        L_0x036b:
            boolean r1 = r3.f8226c
            if (r12 == r1) goto L_0x037a
            r3.f8226c = r12
            app.zenly.locator.core.manager.t5.b r1 = r0.m9147c(r8)
            r2 = 16
            r1.mo8861a(r2)
        L_0x037a:
            boolean r1 = r3.f8227d
            r2 = r24
            if (r2 == r1) goto L_0x038b
            r3.f8227d = r2
            app.zenly.locator.core.manager.t5.b r1 = r0.m9147c(r8)
            r2 = 32
            r1.mo8861a(r2)
        L_0x038b:
            int r1 = r3.f8232i
            r2 = r33
            if (r2 == r1) goto L_0x039c
            r3.f8232i = r2
            app.zenly.locator.core.manager.t5.b r1 = r0.m9147c(r8)
            r2 = 1024(0x400, float:1.435E-42)
            r1.mo8861a(r2)
        L_0x039c:
            app.zenly.locator.core.models.z$b r1 = r3.f8233j
            if (r9 == r1) goto L_0x03ab
            r3.f8233j = r9
            app.zenly.locator.core.manager.t5.b r1 = r0.m9147c(r8)
            r2 = 2048(0x800, float:2.87E-42)
            r1.mo8861a(r2)
        L_0x03ab:
            app.zenly.locator.core.models.k r1 = r3.f8234k
            boolean r1 = java.util.Objects.equals(r4, r1)
            if (r1 != 0) goto L_0x03be
            r3.f8234k = r4
            app.zenly.locator.core.manager.t5.b r1 = r0.m9147c(r8)
            r2 = 4096(0x1000, float:5.74E-42)
            r1.mo8861a(r2)
        L_0x03be:
            boolean r1 = r3.f8231h
            if (r15 != r1) goto L_0x03c8
            double r1 = r3.f8230g
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x03d5
        L_0x03c8:
            r3.f8230g = r6
            r3.f8231h = r15
            app.zenly.locator.core.manager.t5.b r1 = r0.m9147c(r8)
            r2 = 512(0x200, float:7.175E-43)
            r1.mo8861a(r2)
        L_0x03d5:
            if (r30 == 0) goto L_0x03da
            app.zenly.locator.core.models.q$a r1 = app.zenly.locator.core.models.C2898q.C2899a.SLEEPING
            goto L_0x03e6
        L_0x03da:
            if (r31 <= 0) goto L_0x03df
            app.zenly.locator.core.models.q$a r1 = app.zenly.locator.core.models.C2898q.C2899a.BUMP
            goto L_0x03e6
        L_0x03df:
            if (r26 == 0) goto L_0x03e4
            app.zenly.locator.core.models.q$a r1 = app.zenly.locator.core.models.C2898q.C2899a.INTERESTING
            goto L_0x03e6
        L_0x03e4:
            app.zenly.locator.core.models.q$a r1 = app.zenly.locator.core.models.C2898q.C2899a.NORMAL
        L_0x03e6:
            app.zenly.locator.core.models.q$a r2 = r3.f8229f
            if (r1 == r2) goto L_0x03f5
            r3.f8229f = r1
            app.zenly.locator.core.manager.t5.b r1 = r0.m9147c(r8)
            r2 = 256(0x100, float:3.59E-43)
            r1.mo8861a(r2)
        L_0x03f5:
            r1 = 128(0x80, float:1.794E-43)
            r2 = 64
            if (r32 == 0) goto L_0x048f
            double r4 = (double) r5
            double r6 = r19 / r4
            double r21 = r21 / r4
            r4 = -4583010755174989824(0xc065e00000000000, double:-175.0)
            int r9 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0424
            r4 = 4640361281679785984(0x4065e00000000000, double:175.0)
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0424
            int r4 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0424
            int r4 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x0424
            int r4 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x0421
            double r4 = r13 - r21
            goto L_0x0426
        L_0x0421:
            double r4 = r10 - r21
            goto L_0x0426
        L_0x0424:
            r4 = r21
        L_0x0426:
            app.zenly.locator.s.n.d r9 = r3.f8225b
            double r40 = r9.mo13060b()
            app.zenly.locator.s.n.d r9 = r3.f8225b
            double r42 = r9.mo13062c()
            r36 = r6
            r38 = r4
            boolean r9 = app.zenly.locator.p143s.p150n.C5457b.m15510b(r36, r38, r40, r42)
            if (r9 != 0) goto L_0x044d
            app.zenly.locator.s.n.d r9 = r3.f8225b
            r9.mo13061b(r6)
            app.zenly.locator.s.n.d r9 = r3.f8225b
            r9.mo13063c(r4)
            app.zenly.locator.core.manager.t5.b r9 = r0.m9147c(r8)
            r9.mo8861a(r2)
        L_0x044d:
            r19 = r34
            r21 = r13
            r23 = r6
            r25 = r4
            float r2 = app.zenly.locator.core.util.C3225m.m10225a(r19, r21, r23, r25)
            r21 = r10
            float r9 = app.zenly.locator.core.util.C3225m.m10225a(r19, r21, r23, r25)
            float r2 = java.lang.Math.max(r2, r9)
            r19 = r27
            float r9 = app.zenly.locator.core.util.C3225m.m10225a(r19, r21, r23, r25)
            float r2 = java.lang.Math.max(r2, r9)
            r21 = r13
            float r4 = app.zenly.locator.core.util.C3225m.m10225a(r19, r21, r23, r25)
            float r2 = java.lang.Math.max(r2, r4)
            float r4 = r3.f8228e
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x04ca
            r3.f8228e = r2
            app.zenly.locator.core.manager.t5.b r2 = r0.m9147c(r8)
            r2.mo8861a(r1)
            goto L_0x04ca
        L_0x048f:
            app.zenly.locator.s.n.d r4 = r3.f8225b
            double r4 = r4.mo13060b()
            boolean r4 = java.lang.Double.isNaN(r4)
            if (r4 == 0) goto L_0x04a7
            app.zenly.locator.s.n.d r4 = r3.f8225b
            double r4 = r4.mo13062c()
            boolean r4 = java.lang.Double.isNaN(r4)
            if (r4 != 0) goto L_0x04ba
        L_0x04a7:
            app.zenly.locator.s.n.d r4 = r3.f8225b
            r5 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4.mo13061b(r5)
            app.zenly.locator.s.n.d r4 = r3.f8225b
            r4.mo13063c(r5)
            app.zenly.locator.core.manager.t5.b r4 = r0.m9147c(r8)
            r4.mo8861a(r2)
        L_0x04ba:
            float r2 = r3.f8228e
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x04ca
            r3.f8228e = r4
            app.zenly.locator.core.manager.t5.b r2 = r0.m9147c(r8)
            r2.mo8861a(r1)
        L_0x04ca:
            android.util.SparseArray<app.zenly.locator.core.manager.t5.b<app.zenly.locator.core.models.q>> r1 = r0.f7919n
            java.lang.Object r1 = r1.get(r8)
            app.zenly.locator.core.manager.t5.b r1 = (app.zenly.locator.core.manager.p070t5.C2832b) r1
            if (r1 == 0) goto L_0x04eb
            app.zenly.locator.core.models.q r2 = r1.mo8866c()
            if (r2 != 0) goto L_0x04e4
            app.zenly.locator.core.manager.k5$d r2 = r0.f7915j
            app.zenly.locator.core.models.q r2 = r2.mo8800a(r3)
            r1.mo8863a(r2)
            goto L_0x04eb
        L_0x04e4:
            app.zenly.locator.core.models.q r1 = r1.mo8866c()
            r3.mo8983a(r1)
        L_0x04eb:
            android.util.SparseIntArray r1 = r0.f7921p
            r1.clear()
            java.util.Set<app.zenly.locator.core.manager.k5$g> r1 = r0.f7923r
            r1.clear()
            java.util.Set<app.zenly.locator.core.manager.k5$g> r1 = r0.f7924s
            r1.clear()
            java.util.Map<app.zenly.locator.core.models.z$b, java.lang.Integer> r1 = r0.f7926u
            r1.clear()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.f7927v
            r1.clear()
            r1 = r48
            r2 = r16
            goto L_0x000a
        L_0x050a:
            r1 = 0
        L_0x050b:
            android.util.SparseArray<app.zenly.locator.core.manager.k5$h> r2 = r0.f7918m
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0556
            android.util.SparseArray<app.zenly.locator.core.manager.k5$h> r2 = r0.f7918m
            java.lang.Object r2 = r2.valueAt(r1)
            app.zenly.locator.core.manager.k5$h r2 = (app.zenly.locator.core.manager.C2718k5.C2726h) r2
            java.util.Set<java.lang.Integer> r3 = r0.f7922q
            int r4 = r2.f8224a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0552
            java.util.List<java.lang.Integer> r3 = r0.f7925t
            int r4 = r2.f8224a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            java.util.List<app.zenly.locator.core.manager.k5$g> r3 = r2.f7943l
            java.util.Iterator r3 = r3.iterator()
        L_0x053a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0552
            java.lang.Object r4 = r3.next()
            app.zenly.locator.core.manager.k5$g r4 = (app.zenly.locator.core.manager.C2718k5.C2725g) r4
            int r5 = r4.f8216t
            int r6 = r2.f8224a
            if (r5 != r6) goto L_0x0550
            r5 = -1
            r4.f8216t = r5
            goto L_0x053a
        L_0x0550:
            r5 = -1
            goto L_0x053a
        L_0x0552:
            r5 = -1
            int r1 = r1 + 1
            goto L_0x050b
        L_0x0556:
            java.util.List<java.lang.Integer> r1 = r0.f7925t
            java.util.Iterator r1 = r1.iterator()
        L_0x055c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x05ab
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            app.zenly.locator.core.manager.t5.b r3 = r0.m9147c(r2)
            int r4 = r3.mo8864b()
            r5 = 1
            boolean r4 = app.zenly.locator.core.manager.p070t5.C2832b.m9308a(r4, r5)
            if (r4 == 0) goto L_0x0582
            android.util.SparseArray<app.zenly.locator.core.manager.t5.b<app.zenly.locator.core.models.q>> r3 = r0.f7919n
            r3.remove(r2)
            r4 = 2
            goto L_0x05a5
        L_0x0582:
            r4 = 2
            r3.mo8861a(r4)
            android.util.SparseArray<app.zenly.locator.core.manager.k5$h> r6 = r0.f7918m
            java.lang.Object r6 = r6.get(r2)
            app.zenly.locator.core.manager.k5$h r6 = (app.zenly.locator.core.manager.C2718k5.C2726h) r6
            app.zenly.locator.core.models.q r7 = r3.mo8866c()
            if (r7 != 0) goto L_0x059e
            app.zenly.locator.core.manager.k5$d r7 = r0.f7915j
            app.zenly.locator.core.models.q r6 = r7.mo8800a(r6)
            r3.mo8863a(r6)
            goto L_0x05a5
        L_0x059e:
            app.zenly.locator.core.models.q r3 = r3.mo8866c()
            r6.mo8983a(r3)
        L_0x05a5:
            android.util.SparseArray<app.zenly.locator.core.manager.k5$h> r3 = r0.f7918m
            r3.remove(r2)
            goto L_0x055c
        L_0x05ab:
            java.util.Set<java.lang.Integer> r1 = r0.f7922q
            r1.clear()
            java.util.List<java.lang.Integer> r1 = r0.f7925t
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.manager.C2718k5.m9107a(app.zenly.locator.core.manager.k5$f):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9129a(UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation) {
        C2725g f = m9158f(userAnnotationProto$UserAnnotation.getUserUuid());
        f.f7942I = userAnnotationProto$UserAnnotation;
        if (m9192r(f)) {
            m9105a(524288, f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9135a(C8408b bVar) {
        C2725g f = m9158f(bVar.getUserId());
        f.f8192A.mo8926a(bVar);
        if (m9186o(f)) {
            m9105a(2097152, f);
        }
    }

    /* renamed from: a */
    private boolean m9137a(C2725g gVar) {
        int i;
        TrackingContextWrapper trackingContextWrapper = gVar.f7939F;
        C7458s sVar = gVar.f7940G;
        if (trackingContextWrapper != null) {
            boolean z = sVar != null && sVar.getZenlyStatus() == C7478u.f18764m;
            if (z) {
                i = 0;
            } else {
                i = trackingContextWrapper.getBatteryLevel();
            }
            boolean z2 = !z && trackingContextWrapper.isCharging();
            if (!(i == gVar.f8206j && z2 == gVar.f8207k)) {
                gVar.f8206j = i;
                gVar.f8207k = z2;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m9105a(int i, C2725g gVar) {
        C2896p a = this.f7914i.mo8798a(gVar);
        C2831a aVar = (C2831a) this.f7917l.get(gVar.f8197a);
        if (aVar == null) {
            aVar = new C2831a();
            this.f7917l.put(gVar.f8197a, aVar);
        }
        aVar.mo8855a(i, a);
    }

    /* renamed from: a */
    private C2896p m9103a(C2896p pVar) {
        C2896p pVar2 = (C2896p) this.f7931z.get(pVar.f8197a);
        if (pVar2 == pVar) {
            return pVar;
        }
        if (pVar2 != null) {
            pVar.mo8975a(pVar2);
            this.f7914i.release(pVar);
            pVar = pVar2;
        } else {
            this.f7931z.put(pVar.f8197a, pVar);
        }
        return pVar;
    }
}
