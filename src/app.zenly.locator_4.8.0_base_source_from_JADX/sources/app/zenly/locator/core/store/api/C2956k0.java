package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C6950b0;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.store.api.k0 */
public final class C2956k0 {

    /* renamed from: a */
    private final FriendRequestProto$FriendRequest f8340a;

    /* renamed from: b */
    private final UserProto$User f8341b;

    /* renamed from: c */
    private final C2957a f8342c;

    /* renamed from: app.zenly.locator.core.store.api.k0$a */
    public static final class C2957a {

        /* renamed from: a */
        private final boolean f8343a;

        /* renamed from: b */
        private final boolean f8344b;

        /* renamed from: c */
        private final C6950b0 f8345c;

        /* renamed from: d */
        private final C6950b0 f8346d;

        public C2957a(boolean z, boolean z2, C6950b0 b0Var, C6950b0 b0Var2) {
            this.f8343a = z;
            this.f8344b = z2;
            this.f8345c = b0Var;
            this.f8346d = b0Var2;
        }

        /* renamed from: a */
        public final C6950b0 mo9128a() {
            return this.f8346d;
        }

        /* renamed from: b */
        public final boolean mo9129b() {
            return this.f8343a;
        }

        /* renamed from: c */
        public final boolean mo9130c() {
            return this.f8344b;
        }

        /* renamed from: d */
        public final C6950b0 mo9131d() {
            return this.f8345c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2957a) {
                    C2957a aVar = (C2957a) obj;
                    if (this.f8343a == aVar.f8343a) {
                        if (!(this.f8344b == aVar.f8344b) || !C12932j.m33817a((Object) this.f8345c, (Object) aVar.f8345c) || !C12932j.m33817a((Object) this.f8346d, (Object) aVar.f8346d)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f8343a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f8344b;
            if (!z2) {
                i = z2;
            }
            int i3 = (i2 + i) * 31;
            C6950b0 b0Var = this.f8345c;
            int i4 = 0;
            int hashCode = (i3 + (b0Var != null ? b0Var.hashCode() : 0)) * 31;
            C6950b0 b0Var2 = this.f8346d;
            if (b0Var2 != null) {
                i4 = b0Var2.hashCode();
            }
            return hashCode + i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Info(userHasSameSchool=");
            sb.append(this.f8343a);
            sb.append(", userHasSameWork=");
            sb.append(this.f8344b);
            sb.append(", userHomeTown=");
            sb.append(this.f8345c);
            sb.append(", requestOriginatedFrom=");
            sb.append(this.f8346d);
            sb.append(")");
            return sb.toString();
        }
    }

    public C2956k0(FriendRequestProto$FriendRequest friendRequestProto$FriendRequest, UserProto$User userProto$User, C2957a aVar) {
        C12932j.m33818b(friendRequestProto$FriendRequest, "request");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(aVar, "info");
        this.f8340a = friendRequestProto$FriendRequest;
        this.f8341b = userProto$User;
        this.f8342c = aVar;
    }

    /* renamed from: a */
    public final C2957a mo9121a() {
        return this.f8342c;
    }

    /* renamed from: b */
    public final FriendRequestProto$FriendRequest mo9122b() {
        return this.f8340a;
    }

    /* renamed from: c */
    public final UserProto$User mo9123c() {
        return this.f8341b;
    }

    /* renamed from: d */
    public final String mo9124d() {
        String uuid = this.f8340a.getUuid();
        C12932j.m33815a((Object) uuid, "request.uuid");
        return uuid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f8342c, (java.lang.Object) r3.f8342c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof app.zenly.locator.core.store.api.C2956k0
            if (r0 == 0) goto L_0x0027
            app.zenly.locator.core.store.api.k0 r3 = (app.zenly.locator.core.store.api.C2956k0) r3
            co.znly.models.FriendRequestProto$FriendRequest r0 = r2.f8340a
            co.znly.models.FriendRequestProto$FriendRequest r1 = r3.f8340a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            co.znly.models.UserProto$User r0 = r2.f8341b
            co.znly.models.UserProto$User r1 = r3.f8341b
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            app.zenly.locator.core.store.api.k0$a r0 = r2.f8342c
            app.zenly.locator.core.store.api.k0$a r3 = r3.f8342c
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2956k0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        FriendRequestProto$FriendRequest friendRequestProto$FriendRequest = this.f8340a;
        int i = 0;
        int hashCode = (friendRequestProto$FriendRequest != null ? friendRequestProto$FriendRequest.hashCode() : 0) * 31;
        UserProto$User userProto$User = this.f8341b;
        int hashCode2 = (hashCode + (userProto$User != null ? userProto$User.hashCode() : 0)) * 31;
        C2957a aVar = this.f8342c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendRequest(request=");
        sb.append(this.f8340a);
        sb.append(", user=");
        sb.append(this.f8341b);
        sb.append(", info=");
        sb.append(this.f8342c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2956k0(FriendRequestProto$FriendRequest friendRequestProto$FriendRequest, UserProto$User userProto$User, C2957a aVar, int i, C12928f fVar) {
        if ((i & 4) != 0) {
            aVar = new C2957a(false, false, null, null);
        }
        this(friendRequestProto$FriendRequest, userProto$User, aVar);
    }
}
