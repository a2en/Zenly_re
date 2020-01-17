package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.notifications.C7857w;

/* renamed from: app.zenly.locator.modals.w1 */
public class C4692w1 implements ModalProvider {

    /* renamed from: a */
    private final boolean f12457a;

    /* renamed from: b */
    private final C7857w f12458b;

    C4692w1(C7857w wVar, boolean z) {
        this.f12458b = wVar;
        this.f12457a = z;
    }

    public ModalController createController() throws InvalidProtocolBufferException, IllegalArgumentException {
        return new C4660p1(this.f12458b, this.f12457a);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.PRECISE_LOCATION, this.f12458b.getLocationRequest().getAuthor().getUuid());
    }
}
