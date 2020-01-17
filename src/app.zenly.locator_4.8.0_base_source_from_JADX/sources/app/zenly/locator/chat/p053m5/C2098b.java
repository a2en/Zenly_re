package app.zenly.locator.chat.p053m5;

import app.zenly.locator.chat.content.C1949d;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8181n1;
import p213co.znly.models.services.C8347w1.C8349b;

/* renamed from: app.zenly.locator.chat.m5.b */
public final class C2098b {

    /* renamed from: a */
    private final C1949d f6588a;

    /* renamed from: b */
    private final C8181n1 f6589b;

    /* renamed from: c */
    private final C8349b f6590c;

    /* renamed from: d */
    private final boolean f6591d;

    public C2098b(C1949d dVar, C8181n1 n1Var, C8349b bVar, boolean z) {
        C12932j.m33818b(dVar, "message");
        C12932j.m33818b(n1Var, "messageError");
        C12932j.m33818b(bVar, "conversationError");
        this.f6588a = dVar;
        this.f6589b = n1Var;
        this.f6590c = bVar;
        this.f6591d = z;
    }

    /* renamed from: a */
    public final C1949d mo7899a() {
        return this.f6588a;
    }

    /* renamed from: b */
    public final boolean mo7900b() {
        return this.f6589b == C8181n1.REASON_TALK_TO_STRANGER_QUARANTINE || this.f6590c == C8349b.TALK_TO_STRANGER_QUARANTINE;
    }

    /* renamed from: c */
    public final boolean mo7901c() {
        return this.f6591d;
    }
}
