package app.zenly.locator.meet;

import android.util.Pair;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.C7492v2;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7105g2;
import p213co.znly.models.reversegeocoder.C7921g;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.ObservableTransformer;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.meet.k0 */
final class C4504k0 {

    /* renamed from: a */
    private final C12279e<C7105g2> f12111a = C5448c.m15478a().userLocationStream().mo36506l();

    /* renamed from: b */
    private final C12279e<TrackingContextProto$TrackingContext> f12112b;

    /* renamed from: c */
    private final C12279e<UserProto$User> f12113c;

    /* renamed from: d */
    private AtomicReference<Double> f12114d = new AtomicReference<>();

    /* renamed from: e */
    private AtomicReference<Double> f12115e = new AtomicReference<>();

    /* renamed from: f */
    private AtomicReference<UserProto$User> f12116f = new AtomicReference<>();

    /* renamed from: app.zenly.locator.meet.k0$a */
    static class C4505a {

        /* renamed from: a */
        float f12117a;

        /* renamed from: b */
        long f12118b;

        /* renamed from: c */
        long f12119c;

        C4505a(float f, long j, long j2) {
            this.f12117a = f;
            this.f12118b = j;
            this.f12119c = j2;
        }
    }

    /* renamed from: app.zenly.locator.meet.k0$b */
    private static class C4506b<Upstream, Downstream> implements ObservableTransformer<Upstream, Downstream> {

        /* renamed from: a */
        final AtomicBoolean f12120a = new AtomicBoolean(true);

        /* renamed from: b */
        final Function<Upstream, C12279e<Downstream>> f12121b;

        C4506b(Function<Upstream, C12279e<Downstream>> function) {
            this.f12121b = function;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo11692a(Object obj) throws Exception {
            return this.f12120a.get();
        }

        public ObservableSource<Downstream> apply(C12279e<Upstream> eVar) {
            return eVar.mo36459b((Predicate<? super T>) new C4518w<Object>(this)).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C4516u<Object,Object>(this));
        }

        /* renamed from: b */
        public /* synthetic */ ObservableSource mo11693b(Object obj) throws Exception {
            this.f12120a.set(false);
            return ((C12279e) this.f12121b.apply(obj)).mo36483d((Action) new C4517v(this));
        }

        /* renamed from: a */
        public /* synthetic */ void mo11691a() throws Exception {
            this.f12120a.set(true);
        }
    }

    C4504k0(FriendStore friendStore, String str) {
        this.f12112b = C5448c.m15478a().trackingContextStream().mo36459b((Predicate<? super T>) new C4487d0<Object>(str)).mo36455b((Consumer<? super T>) new C4513r<Object>(this)).mo36475c(1).mo36947s();
        this.f12113c = friendStore.friend(str).mo36501i(C4482b.f12061e).mo36455b((Consumer<? super T>) new C4483b0<Object>(this));
    }

    /* renamed from: a */
    static /* synthetic */ TrackingContextProto$TrackingContext m13301a(UserProto$User userProto$User, TrackingContextProto$TrackingContext trackingContextProto$TrackingContext) throws Exception {
        return trackingContextProto$TrackingContext;
    }

    /* renamed from: a */
    static /* synthetic */ String m13307a(Throwable th) throws Exception {
        return "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public UserProto$User mo11686b() {
        return (UserProto$User) this.f12116f.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Double mo11687c() {
        return (Double) this.f12114d.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Double mo11688d() {
        return (Double) this.f12115e.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C12279e<C4505a> mo11689e() {
        return mo11683a().mo36509m(new C4515t(C12279e.m32610a((ObservableSource<? extends T1>) this.f12111a, (ObservableSource<? extends T2>) this.f12112b, (BiFunction<? super T1, ? super T2, ? extends R>) C4493g0.f12072a), m13304a(this.f12112b, this.f12111a, C7921g.TRAVEL_MODE_WALKING), m13304a(this.f12112b, this.f12111a, C7921g.TRAVEL_MODE_DRIVING)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C12279e<String> mo11690f() {
        return mo11683a().mo36509m(new C4481a0(this));
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m13309b(TrackingContextProto$TrackingContext trackingContextProto$TrackingContext) throws Exception {
        return Boolean.valueOf(trackingContextProto$TrackingContext.getGhostType() == C7492v2.city);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m13310c(TrackingContextProto$TrackingContext trackingContextProto$TrackingContext) throws Exception {
        return trackingContextProto$TrackingContext.getGhostType() == C7492v2.noghost;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11684a(TrackingContextProto$TrackingContext trackingContextProto$TrackingContext) throws Exception {
        this.f12114d.set(Double.valueOf(trackingContextProto$TrackingContext.getLatitude()));
        this.f12115e.set(Double.valueOf(trackingContextProto$TrackingContext.getLongitude()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11685a(UserProto$User userProto$User) throws Exception {
        this.f12116f.set(userProto$User);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C12279e<Boolean> mo11683a() {
        return C12279e.m32610a((ObservableSource<? extends T1>) this.f12113c, (ObservableSource<? extends T2>) this.f12112b, (BiFunction<? super T1, ? super T2, ? extends R>) C4514s.f12129a).mo36501i(C4489e0.f12068e).mo36477d().mo36475c(1).mo36947s();
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo11682a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return C12279e.m32633q();
        }
        return this.f12112b.mo36459b((Predicate<? super T>) C4520y.f12137e).mo36427a((ObservableTransformer<? super T, ? extends R>) new C4506b<Object,Object>(C4521z.f12138e));
    }

    /* renamed from: a */
    static /* synthetic */ ObservableSource m13302a(C12279e eVar, C12279e eVar2, C12279e eVar3, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return C12279e.m32633q();
        }
        return C12279e.m32609a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) eVar2.mo36485d(Long.valueOf(0)), (ObservableSource<? extends T3>) eVar3.mo36485d(Long.valueOf(0)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) C4480a.f12059a);
    }

    /* renamed from: a */
    private C12279e<Long> m13304a(C12279e<TrackingContextProto$TrackingContext> eVar, C12279e<C7105g2> eVar2, C7921g gVar) {
        return C12279e.m32610a((ObservableSource<? extends T1>) eVar2, (ObservableSource<? extends T2>) eVar, (BiFunction<? super T1, ? super T2, ? extends R>) C4484c.f12063a).mo36427a((ObservableTransformer<? super T, ? extends R>) new C4506b<Object,Object>(new C4485c0(gVar))).mo36501i(C4519x.f12136e);
    }

    /* renamed from: a */
    static /* synthetic */ C12279e m13303a(C7921g gVar, Pair pair) throws Exception {
        C6951a newBuilder = C6950b0.newBuilder();
        newBuilder.setLatitude(((C7105g2) pair.first).getLatitude());
        newBuilder.setLongitude(((C7105g2) pair.first).getLongitude());
        C6951a newBuilder2 = C6950b0.newBuilder();
        newBuilder2.setLatitude(((TrackingContextProto$TrackingContext) pair.second).getLatitude());
        newBuilder2.setLongitude(((TrackingContextProto$TrackingContext) pair.second).getLongitude());
        return C5448c.m15478a().geoRouteETA((C6950b0) newBuilder.build(), (C6950b0) newBuilder2.build(), gVar.getNumber()).mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
    }
}
