package app.zenly.locator.core.util;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.core.util.i */
public final class C3220i {
    /* renamed from: a */
    public static final String m10211a(C7339i iVar) {
        C12932j.m33818b(iVar, "$this$displayName");
        String full = iVar.getFull();
        String str = "full";
        C12932j.m33815a((Object) full, str);
        if (!C13028q.m34000a(full)) {
            String full2 = iVar.getFull();
            C12932j.m33815a((Object) full2, str);
            return full2;
        } else if (iVar.getPhoneNumbersCount() <= 0) {
            return "";
        } else {
            String phoneNumbers = iVar.getPhoneNumbers(0);
            C12932j.m33815a((Object) phoneNumbers, "getPhoneNumbers(0)");
            return phoneNumbers;
        }
    }
}
