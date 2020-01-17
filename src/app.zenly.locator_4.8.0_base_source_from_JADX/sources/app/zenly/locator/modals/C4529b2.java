package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import app.zenly.locator.p208y.C6288c.C6291c;

/* renamed from: app.zenly.locator.modals.b2 */
public class C4529b2 implements ModalProvider {

    /* renamed from: a */
    private final C6291c f12148a;

    C4529b2(C6291c cVar) {
        this.f12148a = cVar;
    }

    public ModalController createController() {
        return C4554h2.m13384a(this.f12148a);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.PHONE_SETTINGS, this.f12148a.name());
    }
}
