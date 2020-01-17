package app.zenly.locator.chat;

import app.zenly.locator.chat.contract.ChatContract;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.core.C7117i;

/* renamed from: app.zenly.locator.chat.y4 */
public final class C2388y4 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Lazy f7187b = C12896f.m33751a(C2389a.f7190f);

    /* renamed from: c */
    public static final C2390b f7188c = new C2390b(null);

    /* renamed from: a */
    private ChatContract f7189a;

    /* renamed from: app.zenly.locator.chat.y4$a */
    static final class C2389a extends C12933k implements Function0<C2388y4> {

        /* renamed from: f */
        public static final C2389a f7190f = new C2389a();

        C2389a() {
            super(0);
        }

        public final C2388y4 invoke() {
            return new C2388y4();
        }
    }

    /* renamed from: app.zenly.locator.chat.y4$b */
    public static final class C2390b {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f7191a;

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C2390b.class), "instance", "getInstance()Lapp/zenly/locator/chat/ChatManager;");
            C12946x.m33839a((C12940r) sVar);
            f7191a = new KProperty[]{sVar};
        }

        private C2390b() {
        }

        /* renamed from: b */
        private final C2388y4 m8433b() {
            Lazy c = C2388y4.f7187b;
            C2390b bVar = C2388y4.f7188c;
            KProperty kProperty = f7191a[0];
            return (C2388y4) c.getValue();
        }

        /* renamed from: a */
        public final C2388y4 mo8322a() {
            return m8433b();
        }

        public /* synthetic */ C2390b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: d */
    public static final C2388y4 m8429d() {
        return f7188c.mo8322a();
    }

    /* renamed from: a */
    public final ChatContract mo8319a() {
        return this.f7189a;
    }

    /* renamed from: b */
    public final String mo8321b() {
        ChatContract chatContract = this.f7189a;
        if (chatContract != null) {
            C7117i conversation = chatContract.getConversation();
            if (conversation != null) {
                return conversation.getInboxUuid();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo8320a(ChatContract chatContract) {
        this.f7189a = chatContract;
    }
}
