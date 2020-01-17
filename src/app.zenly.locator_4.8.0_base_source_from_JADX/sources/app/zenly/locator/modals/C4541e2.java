package app.zenly.locator.modals;

import android.content.Context;
import android.util.Pair;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2889j;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendRequestDataSource;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3227n;
import app.zenly.locator.experimental.referrer.C3756e;
import app.zenly.locator.experimental.referrer.C3757f;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p162w.p163c.C5569a;
import app.zenly.locator.p208y.C6288c.C6291c;
import app.zenly.locator.p208y.C6302i;
import java.util.List;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7492v2;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin.C6807c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.notifications.C7857w;
import p213co.znly.models.notifications.C7857w.C7859b;
import p213co.znly.models.services.C8273s3;
import p213co.znly.models.services.C8298t5;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.modals.e2 */
public final class C4541e2 {

    /* renamed from: b */
    private static C4541e2 f12159b;

    /* renamed from: a */
    private final List<C12279e<ModalProvider>> f12160a;

    private C4541e2(C12279e<ModalProvider>... eVarArr) {
        this.f12160a = C3227n.m10229a((T[]) eVarArr);
    }

    /* renamed from: a */
    public static C4541e2 m13336a(Context context, ZenlyCore zenlyCore, FriendRequestDataSource friendRequestDataSource, FriendRequestStore friendRequestStore, FriendshipStore friendshipStore, C12279e<C2889j> eVar, C6302i iVar) {
        if (f12159b == null) {
            C12279e l = zenlyCore.userNotificationsStream().mo36506l();
            C12279e userMeStream = zenlyCore.userMeStream();
            f12159b = new C4541e2(m13370d(iVar.mo14159a(context)), m13347a(userMeStream, friendRequestDataSource.friendRequests(), friendRequestStore), m13363b(l), m13348a(userMeStream, eVar, friendRequestDataSource.friendRequests(), friendRequestStore), m13345a(l), m13365c(l), m13346a(l, friendshipStore), m13371e(zenlyCore.serverStateStream()), m13344a(context, l), m13374f(zenlyCore.userShouldValidateToS()), m13343a(context));
        }
        return f12159b;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m13366c(C2956k0 k0Var) throws Exception {
        return k0Var.mo9122b().getOrigin().getType() == C6807c.ORIGIN_NONE;
    }

    /* renamed from: d */
    static /* synthetic */ C4689v1 m13368d(C2956k0 k0Var) throws Exception {
        return new C4689v1(k0Var.mo9124d(), k0Var.mo9122b().getAuthorUuid());
    }

    /* renamed from: e */
    static /* synthetic */ boolean m13372e(C2956k0 k0Var) throws Exception {
        return k0Var.mo9122b().getStatus() == C6812c.pending;
    }

    /* renamed from: f */
    static /* synthetic */ boolean m13375f(C2956k0 k0Var) throws Exception {
        return k0Var.mo9122b().getOrigin().getType() == C6807c.ORIGIN_BRUMP;
    }

    /* renamed from: g */
    static /* synthetic */ boolean m13377g(C8273s3 s3Var) throws Exception {
        return s3Var.getNotification().getNotificationCase() == C7859b.RECOMMENDATION;
    }

    /* renamed from: h */
    static /* synthetic */ ModalProvider m13378h(C8273s3 s3Var) throws Exception {
        return new C4695x1(s3Var.getNotification().getRecommendation());
    }

    /* renamed from: i */
    static /* synthetic */ boolean m13379i(C8273s3 s3Var) throws Exception {
        return s3Var.getNotification().getNotificationCase() == C7859b.ENABLE_WIFI;
    }

    /* renamed from: j */
    static /* synthetic */ ModalProvider m13380j(C8273s3 s3Var) throws Exception {
        return new C4701z1(s3Var.getNotification());
    }

    /* renamed from: c */
    private static C12279e<ModalProvider> m13365c(C12279e<C8273s3> eVar) {
        return eVar.mo36459b((Predicate<? super T>) C4595m0.f12233e).mo36501i(C4691w0.f12456e);
    }

    /* renamed from: e */
    static /* synthetic */ boolean m13373e(C8273s3 s3Var) throws Exception {
        return s3Var.getNotification().getNotificationCase() == C7859b.DISABLE_GHOST && s3Var.getNotification().getDisableGhost().hasAuthor();
    }

    /* renamed from: f */
    static /* synthetic */ boolean m13376f(C8273s3 s3Var) throws Exception {
        return s3Var.getNotification().getNotificationCase() == C7859b.LOCATION_REQUEST && s3Var.getNotification().getLocationRequest().hasAuthor();
    }

    /* renamed from: b */
    static /* synthetic */ C4698y1 m13360b(C2956k0 k0Var) throws Exception {
        return new C4698y1(k0Var.mo9122b().getOrigin().getBrump().getBrumpMatchId(), k0Var.mo9123c());
    }

    /* renamed from: d */
    private static C12279e<ModalProvider> m13370d(C12279e<C6291c> eVar) {
        return eVar.mo36459b((Predicate<? super T>) C4576l0.f12209e).mo36501i(C4572k1.f12202e);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m13367c(C8273s3 s3Var) throws Exception {
        return s3Var.getNotification().getNotificationCase() == C7859b.PACK_UNLOCKED;
    }

    /* renamed from: e */
    private static C12279e<ModalProvider> m13371e(C12279e<Integer> eVar) {
        return eVar.mo36459b((Predicate<? super T>) C4699z.f12467e).mo36501i(C4694x0.f12460e);
    }

    /* renamed from: f */
    private static C12279e<ModalProvider> m13374f(C12279e<C8298t5> eVar) {
        return eVar.mo36459b((Predicate<? super T>) C4531c0.f12150e).mo36501i(C4558i0.f12187e);
    }

    /* renamed from: b */
    static /* synthetic */ ModalProvider m13357b(C8273s3 s3Var) throws Exception {
        return new C4683t1(s3Var.getNotification());
    }

    /* renamed from: b */
    private static C12279e<ModalProvider> m13363b(C12279e<C8273s3> eVar) {
        return eVar.mo36459b((Predicate<? super T>) C4697y0.f12464e).mo36501i(C4571k0.f12201e);
    }

    /* renamed from: b */
    static /* synthetic */ ModalProvider m13359b(Integer num) throws Exception {
        return new C4533c2();
    }

    /* renamed from: b */
    static /* synthetic */ ModalProvider m13358b(C8298t5 t5Var) throws Exception {
        return new C4537d2(t5Var.getTosUrl());
    }

    /* renamed from: a */
    public C12279e<ModalProvider> mo11702a() {
        return C12279e.m32624c((Iterable<? extends ObservableSource<? extends T>>) this.f12160a);
    }

    /* renamed from: a */
    private static C12279e<ModalProvider> m13343a(Context context) {
        C3757f fVar = new C3757f(C5407g.m15386a(context).mo12986h(), new C3756e(), C5448c.m15478a(), C3015a.m9526a(context).provideFriendRequestStore(), C2666b.m9049a(context).mo8763a());
        return fVar.mo10314a(false).mo36501i(C4559i1.f12188e).mo36501i(C4596m1.f12234e);
    }

    /* renamed from: a */
    private static C12279e<ModalProvider> m13347a(C12279e<UserProto$User> eVar, C12279e<C2956k0> eVar2, FriendRequestStore friendRequestStore) {
        return eVar.mo36487e(1).mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) new C4528b1<Object,Object>(eVar2, friendRequestStore));
    }

    /* renamed from: a */
    static /* synthetic */ boolean m13350a(C2956k0 k0Var) throws Exception {
        return k0Var.mo9122b().getStatus() == C6812c.pending;
    }

    /* renamed from: a */
    private static C12279e<ModalProvider> m13348a(C12279e<UserProto$User> eVar, C12279e<C2889j> eVar2, C12279e<C2956k0> eVar3, FriendRequestStore friendRequestStore) {
        return eVar.mo36487e(1).mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) new C4688v0<Object,Object>(eVar2, eVar3, friendRequestStore));
    }

    /* renamed from: a */
    static /* synthetic */ C4698y1 m13337a(C2889j jVar) throws Exception {
        return new C4698y1(jVar.f8175a, jVar.f8176b);
    }

    /* renamed from: a */
    private static C12279e<ModalProvider> m13345a(C12279e<C8273s3> eVar) {
        return eVar.mo36459b((Predicate<? super T>) C4682t0.f12443e).mo36501i(C4539e0.f12157e);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m13353a(C8273s3 s3Var) throws Exception {
        return s3Var.getNotification().getNotificationCase() == C7859b.CONTACT_JOINED;
    }

    /* renamed from: a */
    private static C12279e<ModalProvider> m13346a(C12279e<C8273s3> eVar, FriendshipStore friendshipStore) {
        return C12279e.m32621b((ObservableSource<? extends T>) eVar.mo36459b((Predicate<? super T>) C4540e1.f12158e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C4523a0<Object,Object>(friendshipStore)), (ObservableSource<? extends T>) eVar.mo36459b((Predicate<? super T>) C4700z0.f12468e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C4548g0<Object,Object>(friendshipStore))).mo36501i(C4659p0.f12408e);
    }

    /* renamed from: a */
    static /* synthetic */ ModalProvider m13335a(Pair pair) throws Exception {
        boolean z = true;
        C12143a.m32027a("incomingPreciseLocationRequestStream %s", ((C8273s3) pair.first).getNotification().getUuid());
        C7857w notification = ((C8273s3) pair.first).getNotification();
        if (((C2991u0) pair.second).mo9175a().getGhostedType() != C7492v2.city) {
            z = false;
        }
        return new C4692w1(notification, z);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m13355a(Integer num) throws Exception {
        return num.intValue() == 6;
    }

    /* renamed from: a */
    private static C12279e<ModalProvider> m13344a(Context context, C12279e<C8273s3> eVar) {
        return eVar.mo36459b((Predicate<? super T>) C4626n0.f12291e).mo36501i(C4536d1.f12154e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C4676r0<Object,Object>(new C5569a(context))).mo36501i(C4568j1.f12199e);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m13351a(C6291c cVar) throws Exception {
        return cVar != C6291c.NONE;
    }
}
