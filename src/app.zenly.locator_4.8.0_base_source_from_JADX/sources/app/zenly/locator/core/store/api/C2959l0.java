package app.zenly.locator.core.store.api;

import app.zenly.locator.core.store.api.C2956k0.C2957a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C6943a0;
import p213co.znly.models.C6950b0;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser.C7947a;

/* renamed from: app.zenly.locator.core.store.api.l0 */
public final class C2959l0 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2956k0 m9479b(ZenlyProto$FriendRequestWithUser zenlyProto$FriendRequestWithUser) {
        C6950b0 b0Var;
        boolean z = true;
        boolean z2 = zenlyProto$FriendRequestWithUser.hasAuthorInformations() && zenlyProto$FriendRequestWithUser.getAuthorInformations().hasSharedSchool();
        if (!zenlyProto$FriendRequestWithUser.hasAuthorInformations() || !zenlyProto$FriendRequestWithUser.getAuthorInformations().hasSharedWork()) {
            z = false;
        }
        C6950b0 b0Var2 = null;
        if (!zenlyProto$FriendRequestWithUser.hasAuthorInformations() || !zenlyProto$FriendRequestWithUser.getAuthorInformations().hasHometown()) {
            b0Var = null;
        } else {
            C7947a authorInformations = zenlyProto$FriendRequestWithUser.getAuthorInformations();
            C12932j.m33815a((Object) authorInformations, "authorInformations");
            PlaceProto$Place hometown = authorInformations.getHometown();
            C12932j.m33815a((Object) hometown, "authorInformations.hometown");
            C6943a0 circle = hometown.getCircle();
            C12932j.m33815a((Object) circle, "authorInformations.hometown.circle");
            b0Var = circle.getCenter();
        }
        String str = "friendRequest";
        if (zenlyProto$FriendRequestWithUser.getFriendRequest().hasOriginatedFrom()) {
            FriendRequestProto$FriendRequest friendRequest = zenlyProto$FriendRequestWithUser.getFriendRequest();
            C12932j.m33815a((Object) friendRequest, str);
            b0Var2 = friendRequest.getOriginatedFrom();
        }
        C2957a aVar = new C2957a(z2, z, b0Var, b0Var2);
        FriendRequestProto$FriendRequest friendRequest2 = zenlyProto$FriendRequestWithUser.getFriendRequest();
        C12932j.m33815a((Object) friendRequest2, str);
        UserProto$User user = zenlyProto$FriendRequestWithUser.getUser();
        C12932j.m33815a((Object) user, "user");
        return new C2956k0(friendRequest2, user, aVar);
    }
}
