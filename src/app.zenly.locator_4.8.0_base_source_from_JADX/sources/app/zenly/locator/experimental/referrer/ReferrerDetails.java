package app.zenly.locator.experimental.referrer;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import app.zenly.locator.core.invitations.C2545e0.C2561h0;
import app.zenly.locator.core.invitations.C2545e0.C2564j;
import app.zenly.locator.core.invitations.C2545e0.C2569l0;
import app.zenly.locator.core.invitations.C2545e0.C2582w;
import app.zenly.locator.core.invitations.C2545e0.C2583x;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.share.Constants;
import kotlin.jvm.internal.C12932j;

public final class ReferrerDetails {

    /* renamed from: e */
    public static final C3741b f9994e = new C3741b(null);

    /* renamed from: a */
    private final String f9995a;

    /* renamed from: b */
    private final C3739a f9996b;

    /* renamed from: c */
    private final C3744d f9997c;

    /* renamed from: d */
    private final C3742c f9998d;

    public static final class InvalidReferrerException extends Exception {
    }

    /* renamed from: app.zenly.locator.experimental.referrer.ReferrerDetails$a */
    public enum C3739a {
        Other(0, "", "Other");
        

        /* renamed from: k */
        public static final C3740a f10002k = null;

        /* renamed from: e */
        private final int f10003e;

        /* renamed from: f */
        private final String f10004f;

        /* renamed from: g */
        private final String f10005g;

        /* renamed from: app.zenly.locator.experimental.referrer.ReferrerDetails$a$a */
        public static final class C3740a {
            private C3740a() {
            }

            /* renamed from: a */
            public final C3739a mo10287a(String str) {
                C3739a aVar;
                int a = ReferrerDetails.f9994e.m11172b(str);
                C3739a[] values = C3739a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i];
                    if (aVar.mo10284b() == a) {
                        break;
                    }
                    i++;
                }
                return aVar != null ? aVar : C3739a.Other;
            }

            public /* synthetic */ C3740a(C12928f fVar) {
                this();
            }

            /* renamed from: a */
            public final C3739a mo10286a(Context context, String str) {
                C3739a aVar;
                C12932j.m33818b(context, "context");
                if (C12932j.m33817a((Object) new C2583x(context).mo8688c(), (Object) str)) {
                    return C3739a.f10000i;
                }
                C3739a[] values = C3739a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    C3739a aVar2 = values[i];
                    if (C12932j.m33817a((Object) aVar2.mo10285c(), (Object) str)) {
                        aVar = aVar2;
                        break;
                    }
                    i++;
                }
                return aVar != null ? aVar : C3739a.Other;
            }
        }

        static {
            C3739a[] aVarArr = new C3739a[7];
            C3739a aVar = new C3739a("Other", 0, 0, "", "Other");
            Other = aVar;
            aVarArr[0] = aVar;
            String c = C2549b0.f7613e.mo8688c();
            if (c != null) {
                C3739a aVar2 = new C3739a("Snapchat", 1, 1, c, "Snapchat");
                aVarArr[1] = aVar2;
                String c2 = C2569l0.f7631e.mo8688c();
                if (c2 != null) {
                    C3739a aVar3 = new C3739a("WhatsApp", 2, 2, c2, "Whatsapp");
                    aVarArr[2] = aVar3;
                    String c3 = C2564j.f7626e.mo8688c();
                    if (c3 != null) {
                        C3739a aVar4 = new C3739a("Messenger", 3, 3, c3, "Messenger");
                        aVarArr[3] = aVar4;
                        String c4 = C2582w.f7644e.mo8688c();
                        if (c4 != null) {
                            C3739a aVar5 = new C3739a("Line", 4, 4, c4, "Line");
                            aVarArr[4] = aVar5;
                            String c5 = C2561h0.f7623e.mo8688c();
                            if (c5 != null) {
                                C3739a aVar6 = new C3739a("Vkontakte", 5, 5, c5, "Vkontakte");
                                aVarArr[5] = aVar6;
                                C3739a aVar7 = new C3739a("Message", 6, 6, "message", "SMS");
                                f10000i = aVar7;
                                aVarArr[6] = aVar7;
                                f10001j = aVarArr;
                                f10002k = new C3740a(null);
                                return;
                            }
                            C12932j.m33814a();
                            throw null;
                        }
                        C12932j.m33814a();
                        throw null;
                    }
                    C12932j.m33814a();
                    throw null;
                }
                C12932j.m33814a();
                throw null;
            }
            C12932j.m33814a();
            throw null;
        }

        private C3739a(int i, String str, String str2) {
            this.f10003e = i;
            this.f10004f = str;
            this.f10005g = str2;
        }

        /* renamed from: a */
        public final String mo10283a() {
            return this.f10005g;
        }

        /* renamed from: b */
        public final int mo10284b() {
            return this.f10003e;
        }

        /* renamed from: c */
        public final String mo10285c() {
            return this.f10004f;
        }
    }

    /* renamed from: app.zenly.locator.experimental.referrer.ReferrerDetails$b */
    public static final class C3741b {
        private C3741b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m11172b(String str) {
            if (str != null) {
                Integer a = C13027p.m33994a(str);
                if (a != null) {
                    return a.intValue();
                }
            }
            return 0;
        }

        public /* synthetic */ C3741b(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final ReferrerDetails mo10288a(String str) {
            C12932j.m33818b(str, "referrer");
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("u");
            if (!(queryParameter == null || C13028q.m34000a(queryParameter))) {
                return new ReferrerDetails(queryParameter, C3739a.f10002k.mo10287a(parse.getQueryParameter(Constants.URL_CAMPAIGN)), C3744d.f10023r.mo10295a(parse.getQueryParameter("s")), C3742c.f10009j.mo10291a(parse.getQueryParameter("p")));
            }
            throw new InvalidReferrerException();
        }
    }

    /* renamed from: app.zenly.locator.experimental.referrer.ReferrerDetails$c */
    public enum C3742c {
        Other(0, "other"),
        f10007h(1, r2);
        

        /* renamed from: j */
        public static final C3743a f10009j = null;

        /* renamed from: e */
        private final int f10010e;

        /* renamed from: f */
        private final String f10011f;

        /* renamed from: app.zenly.locator.experimental.referrer.ReferrerDetails$c$a */
        public static final class C3743a {
            private C3743a() {
            }

            /* renamed from: a */
            public final C3742c mo10291a(String str) {
                C3742c cVar;
                int a = ReferrerDetails.f9994e.m11172b(str);
                C3742c[] values = C3742c.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = values[i];
                    if (cVar.mo10290b() == a) {
                        break;
                    }
                    i++;
                }
                return cVar != null ? cVar : C3742c.Other;
            }

            public /* synthetic */ C3743a(C12928f fVar) {
                this();
            }
        }

        static {
            f10009j = new C3743a(null);
        }

        private C3742c(int i, String str) {
            this.f10010e = i;
            this.f10011f = str;
        }

        /* renamed from: a */
        public final String mo10289a() {
            return this.f10011f;
        }

        /* renamed from: b */
        public final int mo10290b() {
            return this.f10010e;
        }
    }

    /* renamed from: app.zenly.locator.experimental.referrer.ReferrerDetails$d */
    public enum C3744d {
        Other(0, "z_track5expvar1_other"),
        OnboardingContact(1, "z_track5expvar1_onboarding_contact"),
        AddFriendContact(2, "z_track5expvar1_add_friend_contact"),
        SuggestedContact(3, "z_track5expvar1_suggested_contact"),
        OnboardingSocialNetwork(4, "z_track5expvar1_onboarding_social_network"),
        BroadcastInviteOnboarding(5, "z_track5expvar1_broadcast_invite_onboarding"),
        BroadcastInviteBanner(6, "z_track5expvar1_broadcast_invite_banner"),
        BroadcastInviteAddFriend(7, "z_track5expvar1_broadcast_invite_add_friend"),
        Descendants(8, "z_track5expvar1_descendants"),
        BroadcastInviteDashboard(9, "z_track5expvar1_broadcast_invite_dashboard");
        

        /* renamed from: r */
        public static final C3745a f10023r = null;

        /* renamed from: e */
        private final int f10024e;

        /* renamed from: f */
        private final String f10025f;

        /* renamed from: app.zenly.locator.experimental.referrer.ReferrerDetails$d$a */
        public static final class C3745a {
            private C3745a() {
            }

            /* renamed from: a */
            public final C3744d mo10295a(String str) {
                return mo10294a(ReferrerDetails.f9994e.m11172b(str));
            }

            public /* synthetic */ C3745a(C12928f fVar) {
                this();
            }

            /* renamed from: a */
            public final C3744d mo10294a(int i) {
                C3744d dVar;
                C3744d[] values = C3744d.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = values[i2];
                    if (dVar.mo10293b() == i) {
                        break;
                    }
                    i2++;
                }
                return dVar != null ? dVar : C3744d.Other;
            }
        }

        static {
            f10023r = new C3745a(null);
        }

        private C3744d(int i, String str) {
            this.f10024e = i;
            this.f10025f = str;
        }

        /* renamed from: a */
        public final String mo10292a() {
            return this.f10025f;
        }

        /* renamed from: b */
        public final int mo10293b() {
            return this.f10024e;
        }
    }

    public ReferrerDetails(String str, C3739a aVar, C3744d dVar, C3742c cVar) {
        C12932j.m33818b(str, "userId");
        C12932j.m33818b(aVar, AppsFlyerProperties.CHANNEL);
        C12932j.m33818b(dVar, "source");
        C12932j.m33818b(cVar, "platform");
        this.f9995a = str;
        this.f9996b = aVar;
        this.f9997c = dVar;
        this.f9998d = cVar;
    }

    /* renamed from: a */
    public final C3739a mo10275a() {
        return this.f9996b;
    }

    /* renamed from: b */
    public final C3742c mo10276b() {
        return this.f9998d;
    }

    /* renamed from: c */
    public final C3744d mo10277c() {
        return this.f9997c;
    }

    /* renamed from: d */
    public final String mo10278d() {
        return this.f9995a;
    }

    /* renamed from: e */
    public final Uri mo10279e() {
        String str = "p";
        String str2 = "s";
        Uri build = new Builder().appendQueryParameter("u", this.f9995a).appendQueryParameter(str, String.valueOf(this.f9998d.mo10290b())).appendQueryParameter(Constants.URL_CAMPAIGN, String.valueOf(this.f9996b.mo10284b())).appendQueryParameter(str2, String.valueOf(this.f9997c.mo10293b())).build();
        C12932j.m33815a((Object) build, "Uri.Builder()\n          …g())\n            .build()");
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f9998d, (java.lang.Object) r3.f9998d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof app.zenly.locator.experimental.referrer.ReferrerDetails
            if (r0 == 0) goto L_0x0031
            app.zenly.locator.experimental.referrer.ReferrerDetails r3 = (app.zenly.locator.experimental.referrer.ReferrerDetails) r3
            java.lang.String r0 = r2.f9995a
            java.lang.String r1 = r3.f9995a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0031
            app.zenly.locator.experimental.referrer.ReferrerDetails$a r0 = r2.f9996b
            app.zenly.locator.experimental.referrer.ReferrerDetails$a r1 = r3.f9996b
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0031
            app.zenly.locator.experimental.referrer.ReferrerDetails$d r0 = r2.f9997c
            app.zenly.locator.experimental.referrer.ReferrerDetails$d r1 = r3.f9997c
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0031
            app.zenly.locator.experimental.referrer.ReferrerDetails$c r0 = r2.f9998d
            app.zenly.locator.experimental.referrer.ReferrerDetails$c r3 = r3.f9998d
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.experimental.referrer.ReferrerDetails.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9995a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3739a aVar = this.f9996b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C3744d dVar = this.f9997c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C3742c cVar = this.f9998d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReferrerDetails(userId=");
        sb.append(this.f9995a);
        sb.append(", channel=");
        sb.append(this.f9996b);
        sb.append(", source=");
        sb.append(this.f9997c);
        sb.append(", platform=");
        sb.append(this.f9998d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ReferrerDetails(String str, C3739a aVar, C3744d dVar, C3742c cVar, int i, C12928f fVar) {
        if ((i & 2) != 0) {
            aVar = C3739a.Other;
        }
        if ((i & 4) != 0) {
            dVar = C3744d.Other;
        }
        if ((i & 8) != 0) {
            cVar = C3742c.f10007h;
        }
        this(str, aVar, dVar, cVar);
    }
}
