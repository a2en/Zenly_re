package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.notifications.C7799c0;

/* renamed from: app.zenly.locator.modals.x1 */
public class C4695x1 implements ModalProvider {

    /* renamed from: a */
    private final UserProto$User f12461a;

    /* renamed from: b */
    private final UserProto$User f12462b;

    public C4695x1(C7799c0 c0Var) {
        this.f12461a = c0Var.getPotentialMatch();
        this.f12462b = c0Var.getMatchMaker();
    }

    public ModalController createController() throws InvalidProtocolBufferException {
        return C4664q1.m13626a(this.f12461a, this.f12462b);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.RECOMMENDATION, this.f12461a.getUuid());
    }
}
