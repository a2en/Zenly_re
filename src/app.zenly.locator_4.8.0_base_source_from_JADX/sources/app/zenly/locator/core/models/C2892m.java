package app.zenly.locator.core.models;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.models.m */
public final class C2892m {

    /* renamed from: b */
    public static final C2893a f8182b = new C2893a(null);

    /* renamed from: a */
    private final boolean f8183a;

    /* renamed from: app.zenly.locator.core.models.m$a */
    public static final class C2893a {
        private C2893a() {
        }

        /* renamed from: a */
        public final C2892m mo8970a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "userProto");
            return new C2892m(userProto$User.getShowSkiMaps());
        }

        public /* synthetic */ C2893a(C12928f fVar) {
            this();
        }
    }

    public C2892m(boolean z) {
        this.f8183a = z;
    }

    /* renamed from: a */
    public static final C2892m m9374a(UserProto$User userProto$User) {
        return f8182b.mo8970a(userProto$User);
    }

    /* renamed from: a */
    public final boolean mo8966a() {
        return this.f8183a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2892m) {
                if (this.f8183a == ((C2892m) obj).f8183a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f8183a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration(showSkiMaps=");
        sb.append(this.f8183a);
        sb.append(")");
        return sb.toString();
    }
}
