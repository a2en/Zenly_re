package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;

/* renamed from: app.zenly.locator.modals.d2 */
public class C4537d2 implements ModalProvider {

    /* renamed from: a */
    private final String f12155a;

    C4537d2(String str) {
        this.f12155a = str;
    }

    public ModalController createController() {
        return new C4569j2(this.f12155a);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.WEBVIEW, "ToS_update");
    }
}
