package app.zenly.locator.modals;

import app.zenly.locator.core.store.api.C2956k0;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.modals.f1 */
/* compiled from: lambda */
public final /* synthetic */ class C4544f1 implements Predicate {

    /* renamed from: e */
    private final /* synthetic */ UserProto$User f12163e;

    public /* synthetic */ C4544f1(UserProto$User userProto$User) {
        this.f12163e = userProto$User;
    }

    public final boolean test(Object obj) {
        return ((C2956k0) obj).mo9122b().getTargetUuid().equals(this.f12163e.getUuid());
    }
}
