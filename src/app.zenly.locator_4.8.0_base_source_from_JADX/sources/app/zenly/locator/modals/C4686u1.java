package app.zenly.locator.modals;

import app.zenly.locator.modals.C4545f2.C4546a;
import app.zenly.locator.modals.p118l2.C4578a;

/* renamed from: app.zenly.locator.modals.u1 */
public class C4686u1 implements ModalProvider {

    /* renamed from: a */
    private final String f12448a;

    public C4686u1(String str) {
        this.f12448a = str;
    }

    public ModalController createController() {
        return C4578a.m13411d(this.f12448a);
    }

    public C4545f2 getModalUuid() {
        return new C4545f2(C4546a.EMOJI_PACK_UNLOCKED, this.f12448a);
    }
}
