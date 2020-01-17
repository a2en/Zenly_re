package app.zenly.locator.p210z.p211b;

import app.zenly.locator.chat.content.C1949d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.PingProto$Ping2.C6824b;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;

/* renamed from: app.zenly.locator.z.b.k */
public final class C6320k {
    static {
        new C6320k();
    }

    private C6320k() {
    }

    /* renamed from: a */
    public static final String m17388a(C1949d dVar, List<? extends C1949d> list) {
        String str;
        C12932j.m33818b(dVar, "message");
        C12932j.m33818b(list, "messageWindow");
        ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
        for (C1949d dVar2 : list) {
            boolean z = false;
            C6824b content = dVar2.f6310c.getContent(0);
            C12932j.m33815a((Object) content, "content");
            if (content.getType() == C6826b.MEDIA) {
                z = true;
            }
            String str2 = "";
            C6823a aVar = dVar2.f6310c;
            C12932j.m33815a((Object) aVar, "it.message");
            String uuid = aVar.getUuid();
            C6823a aVar2 = dVar.f6310c;
            C12932j.m33815a((Object) aVar2, "message.message");
            if (C12932j.m33817a((Object) uuid, (Object) aVar2.getUuid())) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("## Reported Message ##\n");
                str2 = sb.toString();
            }
            if (dVar2.mo7715f()) {
                str = "Me";
            } else {
                C6818b bVar = dVar2.f6311d;
                String str3 = "it.author";
                C12932j.m33815a((Object) bVar, str3);
                String nickname = bVar.getNickname();
                if (nickname != null) {
                    str = nickname;
                } else {
                    C6818b bVar2 = dVar2.f6311d;
                    C12932j.m33815a((Object) bVar2, str3);
                    str = bVar2.getUserUuid();
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(": ");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(z ? "<media>" : content.getText());
            arrayList.add(sb4.toString());
        }
        return C12857w.m33662a(arrayList, "\n----\n", null, null, 0, null, null, 62, null);
    }
}
