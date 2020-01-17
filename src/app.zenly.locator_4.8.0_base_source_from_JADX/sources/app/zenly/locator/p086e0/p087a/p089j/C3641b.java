package app.zenly.locator.p086e0.p087a.p089j;

import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.util.C3245z;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.e0.a.j.b */
public final class C3641b {

    /* renamed from: a */
    private final C2718k5 f9773a;

    /* renamed from: b */
    private final C2879d0 f9774b;

    /* renamed from: c */
    private final C1322a f9775c;

    /* renamed from: d */
    private final UserProto$User f9776d;

    /* renamed from: app.zenly.locator.e0.a.j.b$a */
    public static final class C3642a {
        private C3642a() {
        }

        public /* synthetic */ C3642a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3642a(null);
    }

    public C3641b(C2718k5 k5Var, C2879d0 d0Var, C1322a aVar, UserProto$User userProto$User) {
        C12932j.m33818b(k5Var, "friendsManager");
        C12932j.m33818b(d0Var, "meUser");
        C12932j.m33818b(aVar, "decisionApi");
        C12932j.m33818b(userProto$User, "user");
        this.f9773a = k5Var;
        this.f9774b = d0Var;
        this.f9775c = aVar;
        this.f9776d = userProto$User;
    }

    /* renamed from: a */
    public final UserProto$User mo10126a() {
        return this.f9776d;
    }

    /* renamed from: a */
    public final boolean mo10127a(int i) {
        int c = this.f9774b.mo8940c() - 1;
        if (this.f9775c.mo6511a("feature:recommendation") && this.f9773a.mo8779a(this.f9776d.getUuid()) != null && this.f9776d.getFriendsCount() < 8) {
            Timestamp createdAt = this.f9776d.getCreatedAt();
            C12932j.m33815a((Object) createdAt, "user.createdAt");
            if (C3245z.m10280a(createdAt) < 30 && c - i > 1) {
                return true;
            }
        }
        return false;
    }
}
