package app.zenly.locator.onboarding.p125y3;

import kotlin.jvm.internal.C12932j;
import kotlin.text.C13013g;

/* renamed from: app.zenly.locator.onboarding.y3.d */
public final class C4951d {

    /* renamed from: a */
    private static final C13013g f12943a = new C13013g("[^\\d+]");

    static {
        new C4951d();
    }

    private C4951d() {
    }

    /* renamed from: a */
    public static final int m14282a(String str) {
        C12932j.m33818b(str, "phoneNumber");
        String a = f12943a.mo37409a((CharSequence) str, "");
        if (a.length() == 0) {
            return -1;
        }
        if (!C13028q.m34003a(a, "+55", false, 2, null)) {
            return -2;
        }
        if (a.length() < 13) {
            return -3;
        }
        if (a.length() > 14) {
            return -4;
        }
        return 0;
    }
}
