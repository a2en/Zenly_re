package app.zenly.locator.p042b0;

import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.FriendRequestProto$FriendRequest;

/* renamed from: app.zenly.locator.b0.f */
public final class C1709f {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final long m7053b(FriendRequestProto$FriendRequest friendRequestProto$FriendRequest, ZenlyCore zenlyCore) {
        long b = C5447b.m15475b(zenlyCore);
        Timestamp updatedAt = friendRequestProto$FriendRequest.getUpdatedAt();
        C12932j.m33815a((Object) updatedAt, "updatedAt");
        return b - C3245z.m10288g(updatedAt);
    }
}
