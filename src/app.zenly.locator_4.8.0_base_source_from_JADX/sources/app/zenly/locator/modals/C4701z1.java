package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.notifications.C7839o;
import p213co.znly.models.notifications.C7857w;

/* renamed from: app.zenly.locator.modals.z1 */
public class C4701z1 implements ModalProvider {

    /* renamed from: a */
    private final C7839o f12469a;

    C4701z1(C7857w wVar) {
        this.f12469a = wVar.getEnableWifi();
    }

    public ModalController createController() throws InvalidProtocolBufferException {
        return new C4680s1(this.f12469a);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.WIFI_REQUEST, this.f12469a.getAuthor().getUuid());
    }
}
