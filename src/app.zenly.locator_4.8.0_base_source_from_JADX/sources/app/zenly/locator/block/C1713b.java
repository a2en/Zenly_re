package app.zenly.locator.block;

import app.zenly.locator.p210z.p211b.C6321l.C6323b;
import app.zenly.locator.p210z.p212c.C6332i.C6334b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8189n5.C8191b;

/* renamed from: app.zenly.locator.block.b */
public final class C1713b {
    static {
        new C1713b();
    }

    private C1713b() {
    }

    /* renamed from: a */
    public static final C8191b m7058a(C6323b bVar) {
        C12932j.m33818b(bVar, "$this$blockedReason");
        int i = C1712a.f5765a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C8191b.REASON_INAPPROPRIATE_MESSAGE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final C8191b m7059a(C6334b bVar) {
        C12932j.m33818b(bVar, "$this$blockedReason");
        int i = C1712a.f5766b[bVar.ordinal()];
        if (i == 1) {
            return C8191b.REASON_SPAM;
        }
        if (i == 2) {
            return C8191b.REASON_REPEATED_INVITES;
        }
        if (i == 3) {
            return C8191b.REASON_INAPPROPRIATE_PICTURE;
        }
        if (i == 4) {
            return C8191b.REASON_OFFENSIVE_NAME;
        }
        if (i == 5) {
            return C8191b.REASON_OTHER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
