package app.zenly.locator.core.invitations.p068g0;

import app.zenly.android.feature.base.decision.C1322a;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p266e.C7702b;

/* renamed from: app.zenly.locator.core.invitations.g0.c */
public final class C2593c extends C7702b {

    /* renamed from: b */
    public static final C2593c f7686b = new C2593c();

    private C2593c() {
        super("broadcastInvite");
    }

    /* renamed from: a */
    public static final boolean m8906a(C1322a aVar, C2594d dVar) {
        C12932j.m33818b(aVar, "decisionApi");
        C12932j.m33818b(dVar, "broadcastInvitePrefs");
        return aVar.mo6511a("feature:broadcastInvite") && dVar.mo8713h();
    }
}
