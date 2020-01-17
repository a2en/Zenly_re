package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7337h3;

/* renamed from: app.zenly.locator.core.store.api.d0 */
public final class C2942d0 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2946f0 m9456b(C7337h3 h3Var) {
        String friendUserUuid = h3Var.getFriendUserUuid();
        C12932j.m33815a((Object) friendUserUuid, "this.friendUserUuid");
        C2946f0 f0Var = new C2946f0(friendUserUuid, h3Var.getRank(), h3Var.getScore(), h3Var.getStableScore());
        return f0Var;
    }
}
