package app.zenly.locator.friendshipfacts.p099l;

import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.util.C3245z;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;

/* renamed from: app.zenly.locator.friendshipfacts.l.a */
public final class C3806a {

    /* renamed from: h */
    static final /* synthetic */ KProperty[] f10138h;

    /* renamed from: a */
    private final long f10139a = TimeUnit.SECONDS.toMillis(this.f10144f.getTimeTogetherCurrentWeek());

    /* renamed from: b */
    private final long f10140b = TimeUnit.SECONDS.toMillis(this.f10144f.getTimeTogetherAllTime());

    /* renamed from: c */
    private final int f10141c = this.f10144f.getStreak();

    /* renamed from: d */
    private final Lazy f10142d = C12896f.m33751a(new C3807a(this));

    /* renamed from: e */
    private final UserProto$User f10143e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TimeTogetherProto$Tst f10144f;

    /* renamed from: g */
    private final C2991u0 f10145g;

    /* renamed from: app.zenly.locator.friendshipfacts.l.a$a */
    static final class C3807a extends C12933k implements Function0<Long> {

        /* renamed from: f */
        final /* synthetic */ C3806a f10146f;

        C3807a(C3806a aVar) {
            this.f10146f = aVar;
            super(0);
        }

        public final long invoke() {
            if (!this.f10146f.f10144f.getOngoing()) {
                return 0;
            }
            Timestamp ts = this.f10146f.f10144f.getTs();
            C12932j.m33815a((Object) ts, "state.ts");
            return (long) C3245z.m10284c(ts);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3806a.class), "ongoingHours", "getOngoingHours()J");
        C12946x.m33839a((C12940r) sVar);
        f10138h = new KProperty[]{sVar};
    }

    public C3806a(UserProto$User userProto$User, TimeTogetherProto$Tst timeTogetherProto$Tst, C2991u0 u0Var) {
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(timeTogetherProto$Tst, "state");
        this.f10143e = userProto$User;
        this.f10144f = timeTogetherProto$Tst;
        this.f10145g = u0Var;
    }

    /* renamed from: a */
    public final long mo10378a() {
        Lazy lazy = this.f10142d;
        KProperty kProperty = f10138h[0];
        return ((Number) lazy.getValue()).longValue();
    }

    /* renamed from: b */
    public final int mo10379b() {
        return this.f10141c;
    }

    /* renamed from: c */
    public final long mo10380c() {
        return this.f10140b;
    }

    /* renamed from: d */
    public final long mo10381d() {
        return this.f10139a;
    }

    /* renamed from: e */
    public final UserProto$User mo10382e() {
        return this.f10143e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f10145g, (java.lang.Object) r3.f10145g) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof app.zenly.locator.friendshipfacts.p099l.C3806a
            if (r0 == 0) goto L_0x0027
            app.zenly.locator.friendshipfacts.l.a r3 = (app.zenly.locator.friendshipfacts.p099l.C3806a) r3
            co.znly.models.UserProto$User r0 = r2.f10143e
            co.znly.models.UserProto$User r1 = r3.f10143e
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            co.znly.models.timetogether.TimeTogetherProto$Tst r0 = r2.f10144f
            co.znly.models.timetogether.TimeTogetherProto$Tst r1 = r3.f10144f
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            app.zenly.locator.core.store.api.u0 r0 = r2.f10145g
            app.zenly.locator.core.store.api.u0 r3 = r3.f10145g
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.friendshipfacts.p099l.C3806a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo10384f() {
        if (this.f10144f.getOngoing()) {
            Timestamp ts = this.f10144f.getTs();
            C12932j.m33815a((Object) ts, "state.ts");
            if (C3245z.m10280a(ts) <= C3810d.m11296a()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        UserProto$User userProto$User = this.f10143e;
        int i = 0;
        int hashCode = (userProto$User != null ? userProto$User.hashCode() : 0) * 31;
        TimeTogetherProto$Tst timeTogetherProto$Tst = this.f10144f;
        int hashCode2 = (hashCode + (timeTogetherProto$Tst != null ? timeTogetherProto$Tst.hashCode() : 0)) * 31;
        C2991u0 u0Var = this.f10145g;
        if (u0Var != null) {
            i = u0Var.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BestFriend(user=");
        sb.append(this.f10143e);
        sb.append(", state=");
        sb.append(this.f10144f);
        sb.append(", friendship=");
        sb.append(this.f10145g);
        sb.append(")");
        return sb.toString();
    }
}
