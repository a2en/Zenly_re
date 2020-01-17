package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import app.zenly.locator.modals.p119m2.C4597a;

/* renamed from: app.zenly.locator.modals.v1 */
public class C4689v1 implements ModalProvider {

    /* renamed from: a */
    private final String f12453a;

    /* renamed from: b */
    private final String f12454b;

    C4689v1(String str, String str2) {
        this.f12453a = str;
        this.f12454b = str2;
    }

    public ModalController createController() {
        return C4597a.m13443b(this.f12453a, this.f12454b);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.FRIEND_REQUEST_OR_BUMP, this.f12454b);
    }
}
