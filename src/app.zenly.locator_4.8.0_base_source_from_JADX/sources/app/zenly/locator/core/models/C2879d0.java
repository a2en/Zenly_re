package app.zenly.locator.core.models;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.models.d0 */
public final class C2879d0 {

    /* renamed from: h */
    public static final C2880a f8143h = new C2880a(null);

    /* renamed from: a */
    private final String f8144a;

    /* renamed from: b */
    private final String f8145b;

    /* renamed from: c */
    private final String f8146c;

    /* renamed from: d */
    private final int f8147d;

    /* renamed from: e */
    private final int f8148e;

    /* renamed from: f */
    private final String f8149f;

    /* renamed from: g */
    private final int f8150g;

    /* renamed from: app.zenly.locator.core.models.d0$a */
    public static final class C2880a {
        private C2880a() {
        }

        /* renamed from: a */
        public final C2879d0 mo8948a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "userProto");
            String uuid = userProto$User.getUuid();
            C12932j.m33815a((Object) uuid, "userProto.uuid");
            String name = userProto$User.getName();
            C12932j.m33815a((Object) name, "userProto.name");
            String avatarUrlPrefix = userProto$User.getAvatarUrlPrefix();
            C12932j.m33815a((Object) avatarUrlPrefix, "userProto.avatarUrlPrefix");
            int avatarVersion = userProto$User.getAvatarVersion();
            int friendsCount = userProto$User.getFriendsCount();
            String username = userProto$User.getUsername();
            C12932j.m33815a((Object) username, "userProto.username");
            C2879d0 d0Var = new C2879d0(uuid, name, avatarUrlPrefix, avatarVersion, friendsCount, username, userProto$User.getIdCardStyleValue());
            return d0Var;
        }

        public /* synthetic */ C2880a(C12928f fVar) {
            this();
        }
    }

    public C2879d0(String str, String str2, String str3, int i, int i2, String str4, int i3) {
        C12932j.m33818b(str, "uuid");
        C12932j.m33818b(str2, "name");
        C12932j.m33818b(str3, "avatarUrlPrefix");
        C12932j.m33818b(str4, "username");
        this.f8144a = str;
        this.f8145b = str2;
        this.f8146c = str3;
        this.f8147d = i;
        this.f8148e = i2;
        this.f8149f = str4;
        this.f8150g = i3;
    }

    /* renamed from: a */
    public static final C2879d0 m9332a(UserProto$User userProto$User) {
        return f8143h.mo8948a(userProto$User);
    }

    /* renamed from: a */
    public final String mo8938a() {
        return this.f8146c;
    }

    /* renamed from: b */
    public final int mo8939b() {
        return this.f8147d;
    }

    /* renamed from: c */
    public final int mo8940c() {
        return this.f8148e;
    }

    /* renamed from: d */
    public final int mo8941d() {
        return this.f8150g;
    }

    /* renamed from: e */
    public final String mo8942e() {
        return this.f8145b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2879d0) {
                C2879d0 d0Var = (C2879d0) obj;
                if (C12932j.m33817a((Object) this.f8144a, (Object) d0Var.f8144a) && C12932j.m33817a((Object) this.f8145b, (Object) d0Var.f8145b) && C12932j.m33817a((Object) this.f8146c, (Object) d0Var.f8146c)) {
                    if (this.f8147d == d0Var.f8147d) {
                        if ((this.f8148e == d0Var.f8148e) && C12932j.m33817a((Object) this.f8149f, (Object) d0Var.f8149f)) {
                            if (this.f8150g == d0Var.f8150g) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo8944f() {
        return this.f8149f;
    }

    /* renamed from: g */
    public final String mo8945g() {
        return this.f8144a;
    }

    public int hashCode() {
        String str = this.f8144a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8145b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8146c;
        int hashCode3 = (((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.valueOf(this.f8147d).hashCode()) * 31) + Integer.valueOf(this.f8148e).hashCode()) * 31;
        String str4 = this.f8149f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + Integer.valueOf(this.f8150g).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User(uuid=");
        sb.append(this.f8144a);
        sb.append(", name=");
        sb.append(this.f8145b);
        sb.append(", avatarUrlPrefix=");
        sb.append(this.f8146c);
        sb.append(", avatarVersion=");
        sb.append(this.f8147d);
        sb.append(", friendsCount=");
        sb.append(this.f8148e);
        sb.append(", username=");
        sb.append(this.f8149f);
        sb.append(", idCardStyle=");
        sb.append(this.f8150g);
        sb.append(")");
        return sb.toString();
    }
}
