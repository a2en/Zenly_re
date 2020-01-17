package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;

/* renamed from: app.zenly.locator.modals.c2 */
public class C4533c2 implements ModalProvider {
    public ModalController createController() {
        return new C4573k2("https://zen.ly/service-down", true);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.WEBVIEW, "https://zen.ly/service-down");
    }
}
