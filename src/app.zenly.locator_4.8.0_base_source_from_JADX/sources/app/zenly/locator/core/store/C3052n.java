package app.zenly.locator.core.store;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.store.n */
public abstract class C3052n {

    /* renamed from: a */
    public static final C3053a f8449a = new C3053a(null);

    /* renamed from: app.zenly.locator.core.store.n$a */
    public static final class C3053a {
        private C3053a() {
        }

        /* renamed from: a */
        public final C3052n mo9236a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "user");
            String uuid = userProto$User.getUuid();
            C12932j.m33815a((Object) uuid, "user.uuid");
            return new C3055p(uuid);
        }

        public /* synthetic */ C3053a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C3052n mo9237a(C7339i iVar) {
            C12932j.m33818b(iVar, "contact");
            String deviceContactId = iVar.getDeviceContactId();
            C12932j.m33815a((Object) deviceContactId, "contact.deviceContactId");
            return new C3051m(deviceContactId);
        }
    }

    private C3052n() {
    }

    /* renamed from: a */
    public static final C3052n m9579a(UserProto$User userProto$User) {
        return f8449a.mo9236a(userProto$User);
    }

    /* renamed from: a */
    public static final C3052n m9580a(C7339i iVar) {
        return f8449a.mo9237a(iVar);
    }

    public /* synthetic */ C3052n(C12928f fVar) {
        this();
    }
}
