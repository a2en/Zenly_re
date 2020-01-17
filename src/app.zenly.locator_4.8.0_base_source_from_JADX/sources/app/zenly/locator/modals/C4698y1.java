package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.modals.y1 */
public class C4698y1 implements ModalProvider {

    /* renamed from: a */
    private final String f12465a;

    /* renamed from: b */
    private final UserProto$User f12466b;

    C4698y1(String str, UserProto$User userProto$User) {
        this.f12465a = str;
        this.f12466b = userProto$User;
    }

    public ModalController createController() throws InvalidProtocolBufferException {
        return C4639o1.m13552a(this.f12465a, this.f12466b);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.FRIEND_REQUEST_OR_BUMP, this.f12466b.getUuid());
    }
}
