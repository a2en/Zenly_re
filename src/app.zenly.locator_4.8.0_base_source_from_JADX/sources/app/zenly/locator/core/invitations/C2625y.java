package app.zenly.locator.core.invitations;

import app.zenly.locator.core.invitations.C2530a0.C2531a;
import app.zenly.locator.core.invitations.C2530a0.C2532b;
import app.zenly.locator.core.invitations.C2530a0.C2533c;
import app.zenly.locator.core.invitations.C2530a0.C2534d;
import app.zenly.locator.core.util.C3220i;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.invitations.y */
public final class C2625y {

    /* renamed from: e */
    public static final C2626a f7738e = new C2626a(null);

    /* renamed from: a */
    private final C2587f0 f7739a;

    /* renamed from: b */
    private final String f7740b;

    /* renamed from: c */
    private final C2530a0 f7741c;

    /* renamed from: d */
    private final C2536b0 f7742d;

    /* renamed from: app.zenly.locator.core.invitations.y$a */
    public static final class C2626a {
        private C2626a() {
        }

        /* renamed from: a */
        public final C2625y mo8731a(C2587f0 f0Var, C7339i iVar, boolean z) {
            C12932j.m33818b(f0Var, "source");
            C12932j.m33818b(iVar, "contact");
            String a = C3220i.m10211a(iVar);
            List phoneNumbersList = iVar.getPhoneNumbersList();
            C12932j.m33815a((Object) phoneNumbersList, "contact.phoneNumbersList");
            C2532b bVar = new C2532b(phoneNumbersList);
            C2536b0 b0Var = new C2536b0(z, Boolean.valueOf(false), Integer.valueOf(0), false, 8, null);
            C2625y yVar = new C2625y(f0Var, a, bVar, b0Var, null);
            return yVar;
        }

        /* renamed from: b */
        public final C2625y mo8735b(String str) {
            C12932j.m33818b(str, "username");
            C2587f0 f0Var = C2587f0.USERNAME;
            C2534d dVar = new C2534d(str);
            C2536b0 b0Var = new C2536b0(false, Boolean.valueOf(true), null, false, 13, null);
            C2625y yVar = new C2625y(f0Var, str, dVar, b0Var, null);
            return yVar;
        }

        public /* synthetic */ C2626a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C2625y m8955a(C2626a aVar, C2587f0 f0Var, UserProto$User userProto$User, boolean z, Integer num, boolean z2, int i, Object obj) {
            boolean z3 = (i & 4) != 0 ? false : z;
            if ((i & 8) != 0) {
                num = null;
            }
            return aVar.mo8730a(f0Var, userProto$User, z3, num, (i & 16) != 0 ? false : z2);
        }

        /* renamed from: a */
        public final C2625y mo8730a(C2587f0 f0Var, UserProto$User userProto$User, boolean z, Integer num, boolean z2) {
            C12932j.m33818b(f0Var, "source");
            C12932j.m33818b(userProto$User, "user");
            String name = userProto$User.getName();
            C12932j.m33815a((Object) name, "user.name");
            String uuid = userProto$User.getUuid();
            C12932j.m33815a((Object) uuid, "user.uuid");
            C2625y yVar = new C2625y(f0Var, name, new C2533c(uuid), new C2536b0(z, Boolean.valueOf(true), num, z2), null);
            return yVar;
        }

        /* renamed from: a */
        public final C2625y mo8732a(C2587f0 f0Var, String str, String str2, boolean z) {
            String str3 = str;
            C2587f0 f0Var2 = f0Var;
            C12932j.m33818b(f0Var, "source");
            C12932j.m33818b(str, "uuid");
            String str4 = str2;
            C12932j.m33818b(str4, "name");
            C2533c cVar = new C2533c(str);
            C2536b0 b0Var = new C2536b0(z, Boolean.valueOf(true), null, false, 12, null);
            C2625y yVar = new C2625y(f0Var2, str4, cVar, b0Var, null);
            return yVar;
        }

        /* renamed from: a */
        public final C2625y mo8734a(String str, String str2, String str3) {
            C12932j.m33818b(str, "uuid");
            C12932j.m33818b(str2, "name");
            C12932j.m33818b(str3, "bumpId");
            C2587f0 f0Var = C2587f0.BUMP;
            C2531a aVar = new C2531a(str, str3);
            C2536b0 b0Var = new C2536b0(false, Boolean.valueOf(true), null, false, 13, null);
            C2625y yVar = new C2625y(f0Var, str2, aVar, b0Var, null);
            return yVar;
        }

        /* renamed from: a */
        public final C2625y mo8733a(String str) {
            C12932j.m33818b(str, "phoneNumber");
            C2587f0 f0Var = C2587f0.PHONE_NUMBER;
            C2532b bVar = new C2532b(C12846n.m33635a(str));
            C2536b0 b0Var = new C2536b0(false, null, null, false, 15, null);
            C2625y yVar = new C2625y(f0Var, str, bVar, b0Var, null);
            return yVar;
        }
    }

    private C2625y(C2587f0 f0Var, String str, C2530a0 a0Var, C2536b0 b0Var) {
        this.f7739a = f0Var;
        this.f7740b = str;
        this.f7741c = a0Var;
        this.f7742d = b0Var;
    }

    /* renamed from: a */
    public static final C2625y m8946a(C2587f0 f0Var, UserProto$User userProto$User, boolean z, Integer num, boolean z2) {
        return f7738e.mo8730a(f0Var, userProto$User, z, num, z2);
    }

    /* renamed from: a */
    public static final C2625y m8947a(C2587f0 f0Var, C7339i iVar, boolean z) {
        return f7738e.mo8731a(f0Var, iVar, z);
    }

    /* renamed from: a */
    public static final C2625y m8948a(C2587f0 f0Var, String str, String str2, boolean z) {
        return f7738e.mo8732a(f0Var, str, str2, z);
    }

    /* renamed from: a */
    public static final C2625y m8949a(String str) {
        return f7738e.mo8735b(str);
    }

    /* renamed from: a */
    public static final C2625y m8950a(String str, String str2, String str3) {
        return f7738e.mo8734a(str, str2, str3);
    }

    /* renamed from: a */
    public final String mo8726a() {
        return this.f7740b;
    }

    /* renamed from: b */
    public final C2587f0 mo8727b() {
        return this.f7739a;
    }

    /* renamed from: c */
    public final C2530a0 mo8728c() {
        return this.f7741c;
    }

    /* renamed from: d */
    public final C2536b0 mo8729d() {
        return this.f7742d;
    }

    public /* synthetic */ C2625y(C2587f0 f0Var, String str, C2530a0 a0Var, C2536b0 b0Var, C12928f fVar) {
        this(f0Var, str, a0Var, b0Var);
    }
}
