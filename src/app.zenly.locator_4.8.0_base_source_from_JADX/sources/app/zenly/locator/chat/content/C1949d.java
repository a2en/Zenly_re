package app.zenly.locator.chat.content;

import app.zenly.locator.chat.p059r5.C2305c;
import app.zenly.locator.core.util.C3219h;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;

/* renamed from: app.zenly.locator.chat.content.d */
public class C1949d {

    /* renamed from: a */
    private boolean f6308a;

    /* renamed from: b */
    public boolean f6309b = false;

    /* renamed from: c */
    public C6823a f6310c;

    /* renamed from: d */
    public C6818b f6311d;

    /* renamed from: e */
    public final boolean f6312e;

    public C1949d(PingProto$Ping2 pingProto$Ping2, boolean z) {
        boolean z2 = false;
        this.f6308a = z;
        this.f6310c = (C6823a) pingProto$Ping2.toBuilder();
        if (pingProto$Ping2.getContentCount() > 0 && pingProto$Ping2.getContent(0).getType() == C6826b.TEXT && C2305c.m8213a(this.f6310c.getContent(0).getText())) {
            z2 = true;
        }
        this.f6312e = z2;
    }

    /* renamed from: a */
    public C1949d mo7707a(C6818b bVar) {
        this.f6311d = bVar;
        return this;
    }

    /* renamed from: b */
    public boolean mo7709b() {
        return (this.f6310c.getStatus() & 2) == 2;
    }

    /* renamed from: c */
    public boolean mo7711c() {
        return (this.f6310c.getClientStatus() & 3) == 0;
    }

    /* renamed from: d */
    public boolean mo7713d() {
        return (this.f6310c.getClientStatus() & 2) == 2;
    }

    /* renamed from: e */
    public boolean mo7714e() {
        return this.f6310c.getContent(0).getType() == C6826b.MEDIA;
    }

    /* renamed from: f */
    public boolean mo7715f() {
        return this.f6308a;
    }

    /* renamed from: g */
    public boolean mo7716g() {
        return (this.f6310c.getClientStatus() & 1) == 1;
    }

    /* renamed from: h */
    public boolean mo7717h() {
        return this.f6310c.getSystemState() != 0;
    }

    /* renamed from: i */
    public void mo7718i() {
        C6823a aVar = this.f6310c;
        aVar.mo17338a(aVar.getStatus() | 2);
        aVar.build();
    }

    /* renamed from: a */
    public boolean mo7708a() {
        return (this.f6310c.getStatus() & 1) == 1;
    }

    /* renamed from: b */
    public boolean mo7710b(C1949d dVar) {
        C6818b bVar = this.f6311d;
        if (bVar != null) {
            return bVar.getUserUuid().equals(dVar.f6311d.getUserUuid());
        }
        return dVar.f6311d == null;
    }

    /* renamed from: c */
    public boolean mo7712c(C1949d dVar) {
        if (this.f6309b == dVar.f6309b) {
            C6823a aVar = this.f6310c;
            if (aVar == null ? dVar.f6310c == null : aVar.getStatus() == dVar.f6310c.getStatus()) {
                C6823a aVar2 = this.f6310c;
                if (aVar2 != null && aVar2.getClientStatus() == dVar.f6310c.getClientStatus()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public int mo7706a(C1949d dVar) {
        return C3219h.m10210a(this.f6310c.getCreatedAt(), dVar.f6310c.getCreatedAt());
    }
}
