package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7351j;

/* renamed from: app.zenly.locator.core.store.api.j */
public final class C2953j {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2949h m9467b(C7351j jVar) {
        C7339i contact = jVar.getContact();
        C12932j.m33815a((Object) contact, "this.contact");
        return new C2949h(contact, jVar.getPotentialFriendsCount());
    }
}
