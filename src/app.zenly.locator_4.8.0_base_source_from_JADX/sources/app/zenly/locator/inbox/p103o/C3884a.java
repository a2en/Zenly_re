package app.zenly.locator.inbox.p103o;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.inbox.C3854l;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C12899i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7117i.C7119b;

/* renamed from: app.zenly.locator.inbox.o.a */
public final class C3884a extends C11722a {

    /* renamed from: f */
    private final C6818b f10292f;

    /* renamed from: g */
    private final C1949d f10293g;

    /* renamed from: h */
    private final C7117i f10294h;

    public C3884a(C7117i iVar, long j) {
        C6818b bVar;
        Object obj;
        C12932j.m33818b(iVar, "conversation");
        super(C3854l.CONVERSATION, j);
        this.f10294h = iVar;
        C1949d dVar = null;
        if (this.f10294h.hasLastMessage()) {
            PingProto$Ping2 lastMessage = this.f10294h.getLastMessage();
            String str = "conversation.lastMessage";
            C12932j.m33815a((Object) lastMessage, str);
            String authorUuid = lastMessage.getAuthorUuid();
            C6818b me = this.f10294h.getMe();
            C12932j.m33815a((Object) me, "conversation.me");
            if (C12932j.m33817a((Object) authorUuid, (Object) me.getUserUuid())) {
                bVar = this.f10294h.getMe();
            } else {
                List othersList = this.f10294h.getOthersList();
                C12932j.m33815a((Object) othersList, "conversation.othersList");
                Iterator it = othersList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C6818b bVar2 = (C6818b) obj;
                    C12932j.m33815a((Object) bVar2, "it");
                    String userUuid = bVar2.getUserUuid();
                    PingProto$Ping2 lastMessage2 = this.f10294h.getLastMessage();
                    C12932j.m33815a((Object) lastMessage2, str);
                    if (C12932j.m33817a((Object) userUuid, (Object) lastMessage2.getAuthorUuid())) {
                        break;
                    }
                }
                bVar = (C6818b) obj;
            }
        } else {
            bVar = null;
        }
        this.f10292f = bVar;
        if (this.f10294h.hasLastMessage()) {
            dVar = new C1949d(this.f10294h.getLastMessage(), mo10485m());
        }
        this.f10293g = dVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3884a aVar2 = (C3884a) aVar;
            PingProto$Ping2 lastMessage = this.f10294h.getLastMessage();
            String str = "conversation.lastMessage";
            C12932j.m33815a((Object) lastMessage, str);
            String authorUuid = lastMessage.getAuthorUuid();
            PingProto$Ping2 lastMessage2 = aVar2.f10294h.getLastMessage();
            String str2 = "viewModel.conversation.lastMessage";
            C12932j.m33815a((Object) lastMessage2, str2);
            if (C12932j.m33817a((Object) authorUuid, (Object) lastMessage2.getAuthorUuid())) {
                PingProto$Ping2 lastMessage3 = this.f10294h.getLastMessage();
                C12932j.m33815a((Object) lastMessage3, str);
                long status = lastMessage3.getStatus();
                PingProto$Ping2 lastMessage4 = aVar2.f10294h.getLastMessage();
                C12932j.m33815a((Object) lastMessage4, str2);
                if (status == lastMessage4.getStatus()) {
                    PingProto$Ping2 lastMessage5 = this.f10294h.getLastMessage();
                    C12932j.m33815a((Object) lastMessage5, str);
                    String uuid = lastMessage5.getUuid();
                    PingProto$Ping2 lastMessage6 = aVar2.f10294h.getLastMessage();
                    C12932j.m33815a((Object) lastMessage6, str2);
                    if (C12932j.m33817a((Object) uuid, (Object) lastMessage6.getUuid()) && this.f10294h.getLastMsgState() == aVar2.f10294h.getLastMsgState() && this.f10294h.getIsGroup() == aVar2.f10294h.getIsGroup()) {
                        Timestamp modifiedAt = this.f10294h.getModifiedAt();
                        C12932j.m33815a((Object) modifiedAt, "conversation.modifiedAt");
                        long seconds = modifiedAt.getSeconds();
                        Timestamp modifiedAt2 = aVar2.f10294h.getModifiedAt();
                        C12932j.m33815a((Object) modifiedAt2, "viewModel.conversation.modifiedAt");
                        if (seconds == modifiedAt2.getSeconds() && this.f10294h.getNbChat() == aVar2.f10294h.getNbChat() && this.f10294h.getNbPing() == aVar2.f10294h.getNbPing() && C12932j.m33817a((Object) mo10479g(), (Object) aVar2.mo10479g())) {
                            C6818b bVar = this.f10292f;
                            String str3 = null;
                            Object nickname = bVar != null ? bVar.getNickname() : null;
                            C6818b bVar2 = aVar2.f10292f;
                            if (bVar2 != null) {
                                str3 = bVar2.getNickname();
                            }
                            if (C12932j.m33817a(nickname, (Object) str3) && mo10480h() == aVar2.mo10480h() && mo10481i() == aVar2.mo10481i() && m11427a(aVar2)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.inbox.viewmodel.InboxConversationModel");
    }

    /* renamed from: f */
    public final C7117i mo10478f() {
        return this.f10294h;
    }

    /* renamed from: g */
    public final String mo10479g() {
        String str;
        String str2;
        if (this.f10294h.getIsGroup()) {
            str2 = this.f10294h.getName();
            str = "conversation.name";
        } else {
            C6818b others = this.f10294h.getOthers(0);
            C12932j.m33815a((Object) others, "conversation.getOthers(0)");
            str2 = others.getNickname();
            str = "conversation.getOthers(0).nickname";
        }
        C12932j.m33815a((Object) str2, str);
        return str2;
    }

    /* renamed from: h */
    public final boolean mo10480h() {
        return mo10485m() && this.f10294h.getLastMsgState() == C7119b.LAST_MSG_STATE_FAILED;
    }

    /* renamed from: i */
    public final boolean mo10481i() {
        return !mo10485m() && (this.f10294h.getNbPing() > 0 || this.f10294h.getNbChat() > 0);
    }

    /* renamed from: j */
    public final C1949d mo10482j() {
        return this.f10293g;
    }

    /* renamed from: k */
    public final C6818b mo10483k() {
        return this.f10292f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0026 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo10484l() {
        /*
            r6 = this;
            co.znly.models.core.i r0 = r6.f10294h
            boolean r0 = r0.getHasLeft()
            if (r0 != 0) goto L_0x008b
            app.zenly.locator.chat.content.d r0 = r6.f10293g
            if (r0 == 0) goto L_0x008b
            boolean r0 = r0.mo7717h()
            if (r0 != 0) goto L_0x008b
            co.znly.models.core.i r0 = r6.f10294h
            java.util.List r0 = r0.getOthersList()
            java.lang.String r1 = "conversation.othersList"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "it"
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r0.next()
            r4 = r2
            co.znly.models.PingProto$Conversation$b r4 = (p213co.znly.models.PingProto$Conversation.C6818b) r4
            kotlin.jvm.internal.C12932j.m33815a(r4, r3)
            boolean r3 = app.zenly.locator.chat.p059r5.C2309e.m8217a(r4)
            if (r3 != 0) goto L_0x005e
            java.lang.String r3 = r4.getChatCursor()
            co.znly.models.core.i r4 = r6.f10294h
            co.znly.models.PingProto$Ping2 r4 = r4.getLastMessage()
            java.lang.String r5 = "conversation.lastMessage"
            kotlin.jvm.internal.C12932j.m33815a(r4, r5)
            java.lang.String r4 = r4.getUuid()
            java.lang.String r5 = "conversation.lastMessage.uuid"
            kotlin.jvm.internal.C12932j.m33815a(r4, r5)
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L_0x005e
            r3 = 1
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r3 == 0) goto L_0x0026
            r1.add(r2)
            goto L_0x0026
        L_0x0065:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C12850p.m33647a(r1, r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0074:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008f
            java.lang.Object r2 = r1.next()
            co.znly.models.PingProto$Conversation$b r2 = (p213co.znly.models.PingProto$Conversation.C6818b) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            java.lang.String r2 = r2.getUserUuid()
            r0.add(r2)
            goto L_0x0074
        L_0x008b:
            java.util.List r0 = kotlin.collections.C12848o.m33640a()
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.inbox.p103o.C3884a.mo10484l():java.util.List");
    }

    /* renamed from: m */
    public final boolean mo10485m() {
        return C12932j.m33817a((Object) this.f10292f, (Object) this.f10294h.getMe());
    }

    /* renamed from: a */
    private final boolean m11427a(C3884a aVar) {
        if (this.f10294h.getAvatarsList().size() != aVar.f10294h.getAvatarsList().size()) {
            return false;
        }
        List avatarsList = this.f10294h.getAvatarsList();
        List avatarsList2 = aVar.f10294h.getAvatarsList();
        C12932j.m33815a((Object) avatarsList, "avatarsList");
        C12932j.m33815a((Object) avatarsList2, "modelAvatarsList");
        List a = C12857w.m33664a((Iterable) avatarsList, (Iterable) avatarsList2);
        boolean z = true;
        if (!(a instanceof Collection) || !a.isEmpty()) {
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C12899i iVar = (C12899i) it.next();
                Object c = iVar.mo37204c();
                C12932j.m33815a(c, "it.first");
                Avatar a2 = C2884f.m9355a((UserProto$User) c);
                Object d = iVar.mo37205d();
                C12932j.m33815a(d, "it.second");
                if (!a2.areAvatarTheSame(C2884f.m9355a((UserProto$User) d))) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }
}
