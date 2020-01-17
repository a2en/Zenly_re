package app.zenly.locator.chat;

import app.zenly.locator.chat.C2335u4.C2337b;
import app.zenly.locator.core.models.C2884f;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.i0 */
/* compiled from: lambda */
public final /* synthetic */ class C2004i0 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ C2337b f6413e;

    public /* synthetic */ C2004i0(C2337b bVar) {
        this.f6413e = bVar;
    }

    public final void accept(Object obj) {
        this.f6413e.f7088u.load(C2884f.m9355a((UserProto$User) obj)).into(this.f6413e.f7075h);
    }
}
