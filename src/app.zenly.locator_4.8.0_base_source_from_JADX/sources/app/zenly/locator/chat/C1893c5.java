package app.zenly.locator.chat;

import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.privacy.model.C5082d;
import java.util.Map;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C6947a3;
import p213co.znly.models.C7492v2;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function3;

/* renamed from: app.zenly.locator.chat.c5 */
public final class C1893c5 {

    /* renamed from: a */
    private final ZenlyCore f6182a = C5448c.m15478a();

    /* renamed from: b */
    private final String f6183b;

    /* renamed from: c */
    private final ContactAlreadyOnZenlyStore f6184c;

    /* renamed from: d */
    private final FriendStore f6185d;

    /* renamed from: e */
    private final FriendshipStore f6186e;

    /* renamed from: f */
    private final C2002h5 f6187f;

    /* renamed from: app.zenly.locator.chat.c5$a */
    public final class C1894a {

        /* renamed from: a */
        boolean f6188a;

        /* renamed from: b */
        boolean f6189b;

        /* renamed from: c */
        boolean f6190c;

        /* renamed from: d */
        boolean f6191d;

        C1894a(C1893c5 c5Var, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f6188a = z;
            this.f6189b = z2;
            this.f6190c = z3;
            this.f6191d = z4;
        }

        /* renamed from: a */
        public boolean mo7627a() {
            return !this.f6188a && !this.f6189b && !this.f6190c && !this.f6191d;
        }
    }

    C1893c5(String str, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, FriendStore friendStore, FriendshipStore friendshipStore, C2002h5 h5Var) {
        this.f6183b = str;
        this.f6184c = contactAlreadyOnZenlyStore;
        this.f6185d = friendStore;
        this.f6186e = friendshipStore;
        this.f6187f = h5Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C12279e<UserProto$User> mo7623a(String str) {
        return this.f6187f.mo7813a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C12279e<C5082d> mo7625b() {
        return this.f6186e.friendship(this.f6183b).mo36501i(C1876a2.f6156e).mo36477d();
    }

    /* renamed from: c */
    public C12279e<C1894a> mo7626c() {
        return C12279e.m32609a((ObservableSource<? extends T1>) this.f6182a.userPublicStream(this.f6183b), (ObservableSource<? extends T2>) this.f6182a.userMeStream().mo36509m(new C1883b2(this)), (ObservableSource<? extends T3>) this.f6185d.friendsMap().mo36501i(new C2385y1(this)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C2393z1<Object,Object,Object,Object>(this));
    }

    /* renamed from: a */
    public C12279e<UserProto$User> mo7622a() {
        return mo7623a(this.f6183b);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo7624a(Map map) throws Exception {
        return Boolean.valueOf(map.containsKey(this.f6183b));
    }

    /* renamed from: b */
    private C12279e<Boolean> m7480b(String str) {
        return this.f6184c.contactsAlreadyOnZenly().mo36501i(new C1890c2(str));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo7621a(UserProto$User userProto$User) throws Exception {
        return userProto$User.getPrivateMode() ? m7480b(this.f6183b) : C12279e.m32626e(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public /* synthetic */ C1894a mo7620a(UserProto$User userProto$User, Boolean bool, Boolean bool2) throws Exception {
        C1894a aVar = new C1894a(this, userProto$User.getBlockRelationship() == C6947a3.f17116h, userProto$User.getBlockRelationship() == C6947a3.f17115g, userProto$User.getPrivateMode() && !bool2.booleanValue(), !bool.booleanValue() && !bool2.booleanValue());
        return aVar;
    }

    /* renamed from: a */
    static /* synthetic */ C5082d m7478a(C2991u0 u0Var) throws Exception {
        if (!u0Var.mo9175a().hasGhostedUntil() || C5447b.m15475b(C5448c.m15478a()) > C3245z.m10288g(u0Var.mo9175a().getGhostedUntil())) {
            return C5082d.Precise;
        }
        if (u0Var.mo9175a().getGhostedType() == C7492v2.city) {
            return C5082d.Blurred;
        }
        return C5082d.Frozen;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<app.zenly.locator.core.store.api.a>, for r2v0, types: [java.util.List, java.util.List<app.zenly.locator.core.store.api.a>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Boolean m7479a(java.lang.String r1, java.util.List<app.zenly.locator.core.store.api.C2935a> r2) throws java.lang.Exception {
        /*
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r2.next()
            app.zenly.locator.core.store.api.a r0 = (app.zenly.locator.core.store.api.C2935a) r0
            co.znly.models.UserProto$User r0 = r0.mo9070b()
            java.lang.String r0 = r0.getUuid()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0004
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L_0x0024:
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.C1893c5.m7479a(java.lang.String, java.util.List):java.lang.Boolean");
    }
}
