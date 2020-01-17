package app.zenly.locator.modals;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.modals.f2 */
public final class C4545f2 {

    /* renamed from: a */
    private final C4546a f12164a;

    /* renamed from: b */
    private final String f12165b;

    /* renamed from: app.zenly.locator.modals.f2$a */
    public enum C4546a {
        CONTACT_JOIN("contact_join"),
        EMOJI_PACK_UNLOCKED("emoji_pack_unlocked"),
        FRIEND_REQUEST_OR_BUMP("friend_request_or_bump"),
        PHONE_SETTINGS("phone_settings"),
        PRECISE_LOCATION("precise_location_request"),
        RECOMMENDATION("recommendation"),
        WEBVIEW("webview"),
        WIFI_REQUEST("wifi_request"),
        INSTALL_REFERRER("install_referrer");

        private C4546a(String str) {
        }
    }

    public C4545f2(C4546a aVar, String str) {
        C12932j.m33818b(aVar, "type");
        C12932j.m33818b(str, "uuid");
        this.f12164a = aVar;
        this.f12165b = str;
    }

    /* renamed from: a */
    public final C4546a mo11703a() {
        return this.f12164a;
    }

    /* renamed from: b */
    public final String mo11704b() {
        return this.f12165b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f12165b, (java.lang.Object) r3.f12165b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof app.zenly.locator.modals.C4545f2
            if (r0 == 0) goto L_0x001d
            app.zenly.locator.modals.f2 r3 = (app.zenly.locator.modals.C4545f2) r3
            app.zenly.locator.modals.f2$a r0 = r2.f12164a
            app.zenly.locator.modals.f2$a r1 = r3.f12164a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f12165b
            java.lang.String r3 = r3.f12165b
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.modals.C4545f2.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C4546a aVar = this.f12164a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.f12165b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModalUuid(type=");
        sb.append(this.f12164a);
        sb.append(", uuid=");
        sb.append(this.f12165b);
        sb.append(")");
        return sb.toString();
    }
}
