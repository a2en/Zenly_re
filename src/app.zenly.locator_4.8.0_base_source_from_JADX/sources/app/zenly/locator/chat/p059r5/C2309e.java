package app.zenly.locator.chat.p059r5;

import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Conversation.C6818b;

/* renamed from: app.zenly.locator.chat.r5.e */
public final class C2309e {
    /* renamed from: a */
    public static final boolean m8217a(C6818b bVar) {
        C12932j.m33818b(bVar, "$this$hasLeft");
        Timestamp leftAt = bVar.getLeftAt();
        C12932j.m33815a((Object) leftAt, "leftAt");
        return leftAt.getSeconds() > 0;
    }
}
