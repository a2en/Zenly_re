package app.zenly.locator.friendshipfacts.p098k;

/* renamed from: app.zenly.locator.friendshipfacts.k.c */
public final class C3802c {

    /* renamed from: a */
    public static final C3802c f10132a = new C3802c();

    private C3802c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x001c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final app.zenly.locator.friendshipfacts.p098k.C3803d mo10366a(p213co.znly.models.services.C8001b5 r7, java.util.List<app.zenly.locator.core.store.api.C2936a0> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "tst"
            kotlin.jvm.internal.C12932j.m33818b(r7, r0)
            java.lang.String r0 = "friends"
            kotlin.jvm.internal.C12932j.m33818b(r8, r0)
            java.util.List r7 = r7.getTstsList()
            java.lang.String r0 = "tst.tstsList"
            kotlin.jvm.internal.C12932j.m33815a(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x001c:
            boolean r1 = r7.hasNext()
            java.lang.String r2 = "it"
            if (r1 == 0) goto L_0x0055
            java.lang.Object r1 = r7.next()
            r3 = r1
            co.znly.models.timetogether.TimeTogetherProto$Tst r3 = (p213co.znly.models.timetogether.TimeTogetherProto$Tst) r3
            kotlin.jvm.internal.C12932j.m33815a(r3, r2)
            co.znly.core.vendor.com.google.protobuf.Timestamp r2 = r3.getTs()
            java.lang.String r4 = "it.ts"
            kotlin.jvm.internal.C12932j.m33815a(r2, r4)
            boolean r2 = app.zenly.locator.core.util.C3245z.m10286e(r2)
            if (r2 != 0) goto L_0x004e
            java.lang.String r2 = r3.getUserId()
            java.lang.String r3 = "it.userId"
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            app.zenly.locator.core.store.api.a0 r2 = app.zenly.locator.friendshipfacts.p098k.C3800a.m11273a(r8, r2)
            if (r2 == 0) goto L_0x004e
            r2 = 1
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            if (r2 == 0) goto L_0x001c
            r0.add(r1)
            goto L_0x001c
        L_0x0055:
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x0062
            r0 = r1
            goto L_0x008f
        L_0x0062:
            java.lang.Object r0 = r7.next()
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L_0x006d
            goto L_0x008f
        L_0x006d:
            r3 = r0
            co.znly.models.timetogether.TimeTogetherProto$Tst r3 = (p213co.znly.models.timetogether.TimeTogetherProto$Tst) r3
            kotlin.jvm.internal.C12932j.m33815a(r3, r2)
            int r3 = r3.getBestStreak()
        L_0x0077:
            java.lang.Object r4 = r7.next()
            r5 = r4
            co.znly.models.timetogether.TimeTogetherProto$Tst r5 = (p213co.znly.models.timetogether.TimeTogetherProto$Tst) r5
            kotlin.jvm.internal.C12932j.m33815a(r5, r2)
            int r5 = r5.getBestStreak()
            if (r3 >= r5) goto L_0x0089
            r0 = r4
            r3 = r5
        L_0x0089:
            boolean r4 = r7.hasNext()
            if (r4 != 0) goto L_0x0077
        L_0x008f:
            co.znly.models.timetogether.TimeTogetherProto$Tst r0 = (p213co.znly.models.timetogether.TimeTogetherProto$Tst) r0
            if (r0 == 0) goto L_0x00b4
            app.zenly.locator.friendshipfacts.k.d r7 = new app.zenly.locator.friendshipfacts.k.d
            java.lang.String r2 = r0.getUserId()
            java.lang.String r3 = "streakUser.userId"
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            app.zenly.locator.core.store.api.a0 r8 = app.zenly.locator.friendshipfacts.p098k.C3800a.m11273a(r8, r2)
            if (r8 == 0) goto L_0x00b0
            co.znly.models.UserProto$User r8 = r8.mo9074a()
            int r0 = r0.getBestStreak()
            r7.<init>(r8, r0)
            return r7
        L_0x00b0:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r1
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.friendshipfacts.p098k.C3802c.mo10366a(co.znly.models.services.b5, java.util.List):app.zenly.locator.friendshipfacts.k.d");
    }
}
