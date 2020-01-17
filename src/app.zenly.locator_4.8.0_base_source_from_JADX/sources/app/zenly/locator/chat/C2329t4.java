package app.zenly.locator.chat;

import android.os.Bundle;
import app.zenly.locator.chat.contract.ChatContract;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.models.C7339i;
import p213co.znly.models.core.C7117i;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.chat.t4 */
public final class C2329t4 {
    /* renamed from: a */
    public static ChatContract m8308a(String str, boolean z, boolean z2) {
        C12143a.m32033c("Creating conversation from user uuid -> %s", str);
        return m8306a(C5448c.m15478a().chatGetConversationCache(str), z, z2);
    }

    /* renamed from: a */
    public static ChatContract m8306a(C7117i iVar, boolean z, boolean z2) {
        C12143a.m32033c("Creating conversation from conversation with conversation uuid -> %s", iVar.getInboxUuid());
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9613a("KEY_CONVERSATION", iVar.toByteArray());
        dVar.mo9612a("KEY_START_IN_FULL_SCREEN", z);
        dVar.mo9612a("KEY_DELAY_EMOJIS_RECEPTION", z2);
        return new C2316s4(dVar.mo9605a());
    }

    /* renamed from: a */
    public static ChatContract m8307a(C7339i iVar) {
        C12143a.m32033c("Creating conversation from contact with contact uuid -> %s", iVar.getUuid());
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9613a("KEY_CONTACT", iVar.toByteArray());
        return new C2316s4(dVar.mo9605a());
    }
}
