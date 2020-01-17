package app.zenly.locator.p042b0.p043g;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.spam.prevention.model.SpammedUser;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.store.api.C2956k0;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7370k;
import p213co.znly.models.C7370k.C7371a;

/* renamed from: app.zenly.locator.b0.g.a */
public final class C1710a implements SpammedUser {

    /* renamed from: a */
    private final Avatar f5759a;

    /* renamed from: b */
    private final C2956k0 f5760b;

    public C1710a(C2956k0 k0Var, C7339i iVar) {
        Avatar avatar;
        C12932j.m33818b(k0Var, "friendRequest");
        this.f5760b = k0Var;
        if (iVar == null) {
            avatar = C2884f.m9355a(this.f5760b.mo9123c());
        } else {
            C7371a newBuilder = C7370k.newBuilder();
            newBuilder.mo19261a(iVar);
            newBuilder.mo19260a(this.f5760b.mo9123c());
            GeneratedMessageLite build = newBuilder.build();
            C12932j.m33815a((Object) build, "ContactProto.ContactWith…\n                .build()");
            avatar = C2884f.m9358a((C7370k) build);
        }
        this.f5759a = avatar;
    }

    public Avatar getAvatar() {
        return this.f5759a;
    }

    public String getFriendRequestId() {
        return this.f5760b.mo9124d();
    }

    public String getId() {
        String targetUuid = this.f5760b.mo9122b().getTargetUuid();
        C12932j.m33815a((Object) targetUuid, "friendRequest.request.targetUuid");
        return targetUuid;
    }

    public String getName() {
        String targetName = this.f5760b.mo9122b().getTargetName();
        C12932j.m33815a((Object) targetName, "friendRequest.request.targetName");
        return targetName;
    }
}
