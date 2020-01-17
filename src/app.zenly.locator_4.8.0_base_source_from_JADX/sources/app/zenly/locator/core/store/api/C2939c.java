package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7370k;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.store.api.c */
public final class C2939c {
    /* renamed from: a */
    public static final C2935a m9453a(C7370k kVar) {
        C12932j.m33818b(kVar, "$this$toContactAlreadyOnZenly");
        C7339i contact = kVar.getContact();
        C12932j.m33815a((Object) contact, "this.contact");
        UserProto$User user = kVar.getUser();
        C12932j.m33815a((Object) user, "this.user");
        return new C2935a(contact, user);
    }
}
