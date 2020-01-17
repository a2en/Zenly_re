package app.zenly.locator.dashboard.p075w;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.dashboard.w.j */
public abstract class C3342j {

    /* renamed from: app.zenly.locator.dashboard.w.j$a */
    public static final class C3343a extends C3342j {

        /* renamed from: a */
        private final C7339i f9288a;

        public C3343a(C7339i iVar) {
            C12932j.m33818b(iVar, "contact");
            super(null);
            this.f9288a = iVar;
        }

        /* renamed from: a */
        public final C7339i mo9860a() {
            return this.f9288a;
        }
    }

    /* renamed from: app.zenly.locator.dashboard.w.j$b */
    public static final class C3344b extends C3342j {

        /* renamed from: a */
        private final UserProto$User f9289a;

        public C3344b(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "user");
            super(null);
            this.f9289a = userProto$User;
        }

        /* renamed from: a */
        public final UserProto$User mo9861a() {
            return this.f9289a;
        }
    }

    private C3342j() {
    }

    public /* synthetic */ C3342j(C12928f fVar) {
        this();
    }
}
