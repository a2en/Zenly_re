package app.zenly.locator.p017a0.p035r;

import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.models.C7302f3;
import p213co.znly.models.UserProto$DisabledNotifications;
import p213co.znly.models.UserProto$DisabledNotifications.C6922a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;

/* renamed from: app.zenly.locator.a0.r.b */
public final class C1651b {
    /* renamed from: a */
    public static final boolean m6951a(UserProto$DisabledNotifications userProto$DisabledNotifications, C7302f3 f3Var) {
        C12932j.m33818b(userProto$DisabledNotifications, "$this$isGloballyEnabled");
        C12932j.m33818b(f3Var, "notificationType");
        return !C7710c.m18768c(userProto$DisabledNotifications.getGlobally(), f3Var.getNumber());
    }

    /* renamed from: a */
    public static final UserProto$DisabledNotifications m6949a(UserProto$DisabledNotifications userProto$DisabledNotifications, C7302f3 f3Var, boolean z) {
        int i;
        C12932j.m33818b(userProto$DisabledNotifications, "$this$withGloballyEnabled");
        C12932j.m33818b(f3Var, "notificationType");
        if (z) {
            i = C7710c.m18769d(userProto$DisabledNotifications.getGlobally(), f3Var.getNumber());
        } else {
            i = C7710c.m18765a(userProto$DisabledNotifications.getGlobally(), f3Var.getNumber());
        }
        C6922a aVar = (C6922a) userProto$DisabledNotifications.toBuilder();
        aVar.mo17883a(i);
        GeneratedMessageLite build = aVar.build();
        C12932j.m33815a((Object) build, "toBuilder()\n        .set…lobally)\n        .build()");
        return (UserProto$DisabledNotifications) build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p213co.znly.models.UserProto$DisabledNotifications m6950a(p213co.znly.models.UserProto$DisabledNotifications r8, java.lang.String r9, p213co.znly.models.C7302f3 r10, boolean r11) {
        /*
            java.lang.String r0 = "$this$withPerUserEnabled"
            kotlin.jvm.internal.C12932j.m33818b(r8, r0)
            java.lang.String r0 = "userUuid"
            kotlin.jvm.internal.C12932j.m33818b(r9, r0)
            java.lang.String r0 = "notificationType"
            kotlin.jvm.internal.C12932j.m33818b(r10, r0)
            java.util.List r0 = r8.getPerUserList()
            java.lang.String r1 = "perUserList"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            java.lang.String r4 = "it"
            r5 = 1
            if (r2 == 0) goto L_0x0028
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0046
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r0.next()
            co.znly.models.UserProto$DisabledNotifications$b r2 = (p213co.znly.models.UserProto$DisabledNotifications.C6923b) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r4)
            java.lang.String r2 = r2.getUserUuid()
            boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r2, r9)
            if (r2 == 0) goto L_0x002c
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x005a
            co.znly.models.UserProto$DisabledNotifications$b$a r0 = p213co.znly.models.UserProto$DisabledNotifications.C6923b.newBuilder()
            r0.mo17886a(r9)
            co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            co.znly.models.UserProto$DisabledNotifications$b r0 = (p213co.znly.models.UserProto$DisabledNotifications.C6923b) r0
            java.util.List r0 = kotlin.collections.C12846n.m33635a(r0)
            goto L_0x005e
        L_0x005a:
            java.util.List r0 = kotlin.collections.C12848o.m33640a()
        L_0x005e:
            java.util.List r2 = r8.getPerUserList()
            kotlin.jvm.internal.C12932j.m33815a(r2, r1)
            java.util.List r0 = kotlin.collections.C12857w.m33670b(r2, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0077:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0095
            java.lang.Object r6 = r0.next()
            r7 = r6
            co.znly.models.UserProto$DisabledNotifications$b r7 = (p213co.znly.models.UserProto$DisabledNotifications.C6923b) r7
            kotlin.jvm.internal.C12932j.m33815a(r7, r4)
            java.lang.String r7 = r7.getUserUuid()
            boolean r7 = r1.add(r7)
            if (r7 == 0) goto L_0x0077
            r2.add(r6)
            goto L_0x0077
        L_0x0095:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C12850p.m33647a(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x00a4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ed
            java.lang.Object r2 = r1.next()
            co.znly.models.UserProto$DisabledNotifications$b r2 = (p213co.znly.models.UserProto$DisabledNotifications.C6923b) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r4)
            java.lang.String r6 = r2.getUserUuid()
            boolean r6 = kotlin.jvm.internal.C12932j.m33817a(r6, r9)
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x00bf
            goto L_0x00e9
        L_0x00bf:
            if (r11 == 0) goto L_0x00ce
            int r6 = r2.getBitfield()
            int r7 = r10.getNumber()
            int r6 = p250f.p251a.p252a.p263b.p264a.p272j.C7710c.m18769d(r6, r7)
            goto L_0x00da
        L_0x00ce:
            int r6 = r2.getBitfield()
            int r7 = r10.getNumber()
            int r6 = p250f.p251a.p252a.p263b.p264a.p272j.C7710c.m18765a(r6, r7)
        L_0x00da:
            co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$Builder r2 = r2.toBuilder()
            co.znly.models.UserProto$DisabledNotifications$b$a r2 = (p213co.znly.models.UserProto$DisabledNotifications.C6923b.C6924a) r2
            r2.mo17885a(r6)
            co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite r2 = r2.build()
            co.znly.models.UserProto$DisabledNotifications$b r2 = (p213co.znly.models.UserProto$DisabledNotifications.C6923b) r2
        L_0x00e9:
            r0.add(r2)
            goto L_0x00a4
        L_0x00ed:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x00f6:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0115
            java.lang.Object r11 = r10.next()
            r0 = r11
            co.znly.models.UserProto$DisabledNotifications$b r0 = (p213co.znly.models.UserProto$DisabledNotifications.C6923b) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r4)
            int r0 = r0.getBitfield()
            if (r0 == 0) goto L_0x010e
            r0 = 1
            goto L_0x010f
        L_0x010e:
            r0 = 0
        L_0x010f:
            if (r0 == 0) goto L_0x00f6
            r9.add(r11)
            goto L_0x00f6
        L_0x0115:
            co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$Builder r8 = r8.toBuilder()
            co.znly.models.UserProto$DisabledNotifications$a r8 = (p213co.znly.models.UserProto$DisabledNotifications.C6922a) r8
            r8.mo17882a()
            r8.mo17884a(r9)
            co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite r8 = r8.build()
            java.lang.String r9 = "toBuilder()\n        .cle…erUsers)\n        .build()"
            kotlin.jvm.internal.C12932j.m33815a(r8, r9)
            co.znly.models.UserProto$DisabledNotifications r8 = (p213co.znly.models.UserProto$DisabledNotifications) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p017a0.p035r.C1651b.m6950a(co.znly.models.UserProto$DisabledNotifications, java.lang.String, co.znly.models.f3, boolean):co.znly.models.UserProto$DisabledNotifications");
    }
}
