package app.zenly.locator.dashboard.p075w;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.dashboard.w.k */
public abstract class C3345k {

    /* renamed from: app.zenly.locator.dashboard.w.k$a */
    public static final class C3346a extends C3345k {

        /* renamed from: a */
        private final C7339i f9290a;

        public C3346a(C7339i iVar) {
            C12932j.m33818b(iVar, "contact");
            super(null);
            this.f9290a = iVar;
        }

        /* renamed from: a */
        public final C7339i mo9862a() {
            return this.f9290a;
        }
    }

    /* renamed from: app.zenly.locator.dashboard.w.k$b */
    public static final class C3347b extends C3345k {

        /* renamed from: a */
        private final UserProto$User f9291a;

        public C3347b(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "user");
            super(null);
            this.f9291a = userProto$User;
        }

        /* renamed from: a */
        public final UserProto$User mo9863a() {
            return this.f9291a;
        }
    }

    private C3345k() {
    }

    public /* synthetic */ C3345k(C12928f fVar) {
        this();
    }
}
