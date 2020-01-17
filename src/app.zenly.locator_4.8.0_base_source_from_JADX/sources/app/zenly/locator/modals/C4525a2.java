package app.zenly.locator.modals;

import app.zenly.locator.experimental.referrer.C3751c;
import app.zenly.locator.modals.C4545f2.C4546a;

/* renamed from: app.zenly.locator.modals.a2 */
public class C4525a2 implements ModalProvider {

    /* renamed from: a */
    private final String f12143a;

    C4525a2(String str) {
        this.f12143a = str;
    }

    public ModalController createController() {
        return C3751c.m11194d(this.f12143a);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.INSTALL_REFERRER, this.f12143a);
    }
}
