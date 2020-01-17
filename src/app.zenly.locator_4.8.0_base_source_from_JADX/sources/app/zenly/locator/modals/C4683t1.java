package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.notifications.C7819h;
import p213co.znly.models.notifications.C7857w;

/* renamed from: app.zenly.locator.modals.t1 */
public class C4683t1 implements ModalProvider {

    /* renamed from: a */
    private final String f12444a;

    /* renamed from: b */
    private final C7819h f12445b;

    C4683t1(C7857w wVar) {
        this.f12444a = wVar.getUuid();
        this.f12445b = wVar.getContactJoined();
    }

    public ModalController createController() throws InvalidProtocolBufferException {
        return new C4627n1(this.f12444a, this.f12445b);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.CONTACT_JOIN, this.f12445b.getUser().getUuid());
    }
}
