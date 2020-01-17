package app.zenly.locator.chat;

import android.text.TextUtils;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.chat.p053m5.C2097a;
import app.zenly.locator.chat.p053m5.C2098b;
import app.zenly.locator.chat.p059r5.C2303a;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7391m1;
import p213co.znly.models.C7464s1;
import p213co.znly.models.C7464s1.C7466b;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.core.C7073d;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7224u;
import p213co.znly.models.core.ChatProto$ChatActivities;
import p213co.znly.models.core.ChatProto$ChatActivities.C6982a;
import p213co.znly.models.services.C7993b1;
import p213co.znly.models.services.C8008c1;
import p213co.znly.models.services.C8024d1;
import p213co.znly.models.services.C8024d1.C8025a;
import p213co.znly.models.services.C8042e1;
import p213co.znly.models.services.C8301u0;
import p213co.znly.models.services.C8301u0.C8302a;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest.C7943a;
import p214e.p228e.C7571a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.ObservableTransformer;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.chat.d5 */
public final class C1956d5 {

    /* renamed from: m */
    private static final Map<String, String> f6319m = new C7571a();

    /* renamed from: a */
    private final ZenlyCore f6320a = C5448c.m15478a();

    /* renamed from: b */
    private final C3201f<C6818b> f6321b;

    /* renamed from: c */
    private final C1886b5 f6322c;

    /* renamed from: d */
    private C7117i f6323d;

    /* renamed from: e */
    private final C12785a<String> f6324e;

    /* renamed from: f */
    private final C12767a<C7073d> f6325f;

    /* renamed from: g */
    private final C12279e<List<C1949d>> f6326g;

    /* renamed from: h */
    private final C12767a<C7117i> f6327h;

    /* renamed from: i */
    private final C12279e<C7993b1> f6328i;

    /* renamed from: j */
    private final C12767a<List<C6818b>> f6329j;

    /* renamed from: k */
    private final C12275b f6330k = new C12275b();

    /* renamed from: l */
    private Map<String, List<String>> f6331l;

    /* renamed from: app.zenly.locator.chat.d5$a */
    static /* synthetic */ class C1957a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6332a = new int[C7466b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                co.znly.models.s1$b[] r0 = p213co.znly.models.C7464s1.C7466b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6332a = r0
                int[] r0 = f6332a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.s1$b r1 = p213co.znly.models.C7464s1.C7466b.ADD_MEMBERS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6332a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.s1$b r1 = p213co.znly.models.C7464s1.C7466b.DEL_MEMBERS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.C1956d5.C1957a.<clinit>():void");
        }
    }

    C1956d5(C7117i iVar, C3201f<C6818b> fVar) {
        this.f6323d = iVar;
        this.f6321b = fVar;
        this.f6322c = new C1886b5();
        this.f6322c.mo7614a(this.f6323d.getMe().getUserUuid(), this.f6323d.getMe().getChatCursor());
        this.f6322c.mo7613a(this.f6323d.getMe());
        for (C6818b bVar : this.f6323d.getOthersList()) {
            this.f6322c.mo7613a(bVar);
            if (!bVar.getChatCursor().isEmpty()) {
                this.f6322c.mo7614a(bVar.getUserUuid(), bVar.getChatCursor());
            }
        }
        this.f6331l = m7610b(this.f6322c.mo7612a());
        this.f6324e = C12785a.m33446h(this.f6323d.getMe().getChatCursor());
        this.f6327h = this.f6320a.chatConversationSync(this.f6323d.getInboxUuid()).mo36455b((Consumer<? super T>) new C2283q2<Object>(this)).mo36475c(1);
        this.f6325f = this.f6320a.chatMessagesStream(this.f6323d.getInboxUuid()).mo36503j();
        this.f6326g = this.f6325f.mo36501i(new C1891c3(this)).mo36506l();
        this.f6328i = this.f6320a.chatConversationUpdatesStream(this.f6323d.getInboxUuid()).mo36455b((Consumer<? super T>) new C2095m3<Object>(this)).mo36506l();
        this.f6329j = m7606a((C12279e<C7117i>) this.f6327h, this.f6328i).mo36475c(1);
    }

    /* renamed from: h */
    static /* synthetic */ boolean m7631h(C1949d dVar) throws Exception {
        return !dVar.mo7713d();
    }

    /* renamed from: a */
    public /* synthetic */ List mo7734a(C7073d dVar) throws Exception {
        return m7608a(dVar.getMsgsList());
    }

    /* renamed from: b */
    public /* synthetic */ void mo7748b(C7993b1 b1Var) throws Exception {
        C7464s1 conversationUpdate = b1Var.getConversationUpdate();
        int i = C1957a.f6332a[conversationUpdate.getWhat().ordinal()];
        if (i == 1) {
            this.f6322c.mo7615a(conversationUpdate.getMembersList());
        } else if (i == 2) {
            this.f6322c.mo7618b(conversationUpdate.getMembersList());
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo7757c(C7117i iVar) throws Exception {
        for (C6818b a : iVar.getOthersList()) {
            this.f6322c.mo7613a(a);
        }
        this.f6322c.mo7613a(iVar.getMe());
    }

    /* renamed from: i */
    public C1886b5 mo7769i() {
        return this.f6322c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo7770j() {
        return (String) this.f6324e.mo36963s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C12785a<String> mo7771k() {
        return this.f6324e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Map<String, List<String>> mo7772l() {
        return this.f6331l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public C12279e<List<C1949d>> mo7773m() {
        return this.f6326g.mo36469c((Function<? super T, ? extends SingleSource<? extends R>>) C1986f3.f6386e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public List<C1949d> mo7774n() {
        C7073d chatMessagesCache = this.f6320a.chatMessagesCache(this.f6323d.getInboxUuid());
        if (chatMessagesCache == null || chatMessagesCache.getEmptyCache() || chatMessagesCache.getZero()) {
            return Collections.emptyList();
        }
        C12143a.m32033c("Got %d messages from cache", Integer.valueOf(chatMessagesCache.getMsgsCount()));
        return m7608a(chatMessagesCache.getMsgsList());
    }

    /* renamed from: o */
    public /* synthetic */ Boolean mo7775o() throws Exception {
        C8302a newBuilder = C8301u0.newBuilder();
        newBuilder.mo22264a(this.f6323d.getInboxUuid());
        newBuilder.mo22263a(C7391m1.TYPING);
        this.f6320a.chatSendActivity((C8301u0) newBuilder.build());
        return Boolean.valueOf(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public ObservableTransformer<String, List<C1949d>> mo7776p() {
        return new C1992g2(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public ObservableTransformer<C1949d, Boolean> mo7777q() {
        return new C2374w3(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C12279e<String> mo7778r() {
        C12279e b = this.f6327h.mo36501i(C1953d2.f6316e).mo36459b((Predicate<? super T>) new C1878a4<Object>(this));
        C12785a<String> aVar = this.f6324e;
        aVar.getClass();
        return b.mo36455b((Consumer<? super T>) new C2096m4<Object>(aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public ObservableTransformer<C1949d, C2098b> mo7779s() {
        return new C2006i2(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public ObservableTransformer<Boolean, Boolean> mo7780t() {
        return new C2381x3(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public ObservableTransformer<C2097a, C2098b> mo7781u() {
        return new C2314s2(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo7782v() {
        this.f6330k.mo36403a(this.f6329j.mo36946r(), this.f6327h.mo36946r(), this.f6325f.mo36946r());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo7783w() {
        this.f6330k.mo36401a();
    }

    /* renamed from: i */
    static /* synthetic */ boolean m7632i(C1949d dVar) throws Exception {
        return !dVar.mo7709b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7739a(C1949d dVar) {
        for (Entry entry : this.f6322c.mo7612a().entrySet()) {
            if (((String) entry.getValue()).compareTo(dVar.f6310c.getUuid()) >= 0 && !TextUtils.equals(this.f6323d.getMe().getUserUuid(), (CharSequence) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C12279e<String> mo7760d() {
        return this.f6327h.mo36485d(this.f6323d).mo36459b((Predicate<? super T>) C2007i3.f6416e).mo36501i(C2395z3.f7196e).mo36477d().mo36451b((ObservableSource<? extends T>) this.f6328i.mo36459b((Predicate<? super T>) C2394z2.f7195e).mo36501i(C2031k3.f6449e));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C12279e<Map<String, List<String>>> mo7763e() {
        return C12279e.m32621b((ObservableSource<? extends T>) this.f6327h.mo36455b((Consumer<? super T>) new C2343v2<Object>(this)).mo36501i(new C2013j2(this)), (ObservableSource<? extends T>) this.f6320a.chatCursorRealtimeStream(this.f6323d.getInboxUuid()).mo36459b((Predicate<? super T>) new C2083l3<Object>(this)).mo36455b((Consumer<? super T>) new C2327t2<Object>(this)).mo36501i(new C2386y2(this))).mo36501i(new C2014j3(this)).mo36455b((Consumer<? super T>) new C2301r3<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C12279e<Boolean> mo7767g() {
        return this.f6325f.mo36459b((Predicate<? super T>) C2118o4.f6616e).mo36501i(C2084l4.f6561e).mo36459b((Predicate<? super T>) C1987f4.f6387e).mo36484d((Function<? super T, K>) C2328t3.f7043e).mo36501i(C1961e2.f6336e);
    }

    /* renamed from: f */
    public /* synthetic */ ObservableSource mo7765f(C12279e eVar) {
        return eVar.mo36455b((Consumer<? super T>) C2315s3.f6980e).mo36501i(new C2094m2(this)).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C1999h2<Object,Object>(this)).mo36501i(new C2116o2(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C12279e<List<C1949d>> mo7768h() {
        return this.f6326g.mo36469c((Function<? super T, ? extends SingleSource<? extends R>>) C2194p2.f6735e);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m7616c(List list) throws Exception {
        return !list.isEmpty();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7736a(C7117i iVar) throws Exception {
        for (C6818b bVar : iVar.getOthersList()) {
            if (!bVar.getChatCursor().isEmpty()) {
                this.f6322c.mo7614a(bVar.getUserUuid(), bVar.getChatCursor());
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ boolean mo7751b(String str) throws Exception {
        return str.compareTo((String) this.f6324e.mo36963s()) > 0;
    }

    /* renamed from: c */
    public /* synthetic */ Map mo7755c(C8008c1 c1Var) throws Exception {
        return this.f6322c.mo7612a();
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m7613c(C7993b1 b1Var) throws Exception {
        return Boolean.valueOf(b1Var.getConversationUpdate().getWhat() == C7466b.DEL_MEMBERS);
    }

    /* renamed from: b */
    public /* synthetic */ Map mo7747b(C7117i iVar) throws Exception {
        return this.f6322c.mo7612a();
    }

    /* renamed from: b */
    public /* synthetic */ void mo7749b(C8008c1 c1Var) throws Exception {
        if (!c1Var.getCursor().isEmpty()) {
            this.f6322c.mo7614a(c1Var.getUserUuid(), c1Var.getCursor());
        }
    }

    /* renamed from: c */
    public C12279e<List<C6818b>> mo7754c() {
        return this.f6329j;
    }

    /* renamed from: g */
    static /* synthetic */ boolean m7629g(C1949d dVar) throws Exception {
        return !dVar.f6310c.getUuid().isEmpty();
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo7741a(C8008c1 c1Var) throws Exception {
        return !TextUtils.equals(this.f6323d.getMe().getUserUuid(), c1Var.getUserUuid());
    }

    /* renamed from: c */
    public /* synthetic */ ObservableSource mo7753c(String str) throws Exception {
        return C5448c.m15478a().chatOldMessagesServer(this.f6323d.getInboxUuid(), str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ObservableTransformer<C1949d, C8042e1> mo7766f() {
        return new C2195p3(this);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7738a(Map map) throws Exception {
        this.f6331l = map;
    }

    /* renamed from: b */
    public C12279e<Boolean> mo7745b() {
        return this.f6327h.mo36485d(this.f6323d).mo36501i(C2000h3.f6409e).mo36451b((ObservableSource<? extends T>) this.f6328i.mo36459b((Predicate<? super T>) new C2300r2<Object>(this)).mo36501i(C2284q3.f6941e)).mo36477d();
    }

    /* renamed from: f */
    public /* synthetic */ ObservableSource mo7764f(C1949d dVar) throws Exception {
        return this.f6320a.chatSendMessage(C2303a.m8205a(dVar)).mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36501i(new C2333u2(this));
    }

    /* renamed from: d */
    static /* synthetic */ boolean m7619d(C7993b1 b1Var) throws Exception {
        return b1Var.getConversationUpdate().getWhat() == C7466b.RENAME;
    }

    /* renamed from: a */
    public C12279e<C7391m1> mo7732a() {
        return this.f6320a.chatActivityStream(this.f6323d.getInboxUuid()).mo36501i(new C1962e3(this)).mo36485d(C7391m1.UNKNOWN);
    }

    /* renamed from: c */
    public /* synthetic */ ObservableSource mo7752c(C12279e eVar) {
        return eVar.mo36459b((Predicate<? super T>) C2102n2.f6596e).mo36459b((Predicate<? super T>) new C1892c4<Object>(this)).mo36455b((Consumer<? super T>) new C2373w2<Object>(this)).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C1993g3<Object,Object>(this));
    }

    /* renamed from: d */
    public /* synthetic */ ObservableSource mo7758d(C1949d dVar) throws Exception {
        return C5448c.m15478a().chatUpdateCursor(C2303a.m8207a(dVar, this.f6323d.getInboxUuid())).mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36501i(C1963e4.f6338e);
    }

    /* renamed from: e */
    static /* synthetic */ boolean m7622e(C7117i iVar) throws Exception {
        return !iVar.getHasLeft();
    }

    /* renamed from: f */
    static /* synthetic */ boolean m7625f(C7993b1 b1Var) throws Exception {
        C7464s1 conversationUpdate = b1Var.getConversationUpdate();
        return conversationUpdate.getWhat() == C7466b.ADD_MEMBERS || conversationUpdate.getWhat() == C7466b.DEL_MEMBERS;
    }

    /* renamed from: a */
    public /* synthetic */ C7391m1 mo7728a(ChatProto$ChatActivities chatProto$ChatActivities) throws Exception {
        C6982a aVar;
        C12143a.m32033c("Got raw activity %s", chatProto$ChatActivities.toString());
        Iterator it = chatProto$ChatActivities.getActivitiesList().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (C6982a) it.next();
            if (!aVar.getUserUuid().equals(C5447b.m15477d(this.f6320a))) {
                break;
            }
        }
        if (aVar == null) {
            return C7391m1.UNKNOWN;
        }
        if ((aVar.getActivity() & 8) != 0) {
            return C7391m1.TYPING;
        }
        if ((aVar.getActivity() & 1) != 0) {
            return C7391m1.READING;
        }
        if ((aVar.getActivity() & 32) != 0) {
            return C7391m1.INAPP;
        }
        C12143a.m32033c("Got unknown activity %d", Long.valueOf(aVar.getActivity()));
        return C7391m1.UNKNOWN;
    }

    /* renamed from: c */
    public /* synthetic */ void mo7756c(C1949d dVar) throws Exception {
        this.f6324e.onNext(dVar.f6310c.getUuid());
    }

    /* renamed from: e */
    public /* synthetic */ ObservableSource mo7761e(C1949d dVar) throws Exception {
        C8025a newBuilder = C8024d1.newBuilder();
        newBuilder.mo22058b(this.f6323d.getInboxUuid());
        if (!TextUtils.isEmpty(dVar.f6310c.getUuid()) || TextUtils.isEmpty(dVar.f6310c.getClientUuid())) {
            newBuilder.mo22057a(dVar.f6310c.getUuid());
            return this.f6320a.chatDeleteMessage((C8024d1) newBuilder.build()).mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
        }
        newBuilder.mo22057a(dVar.f6310c.getClientUuid());
        return this.f6320a.chatDeleteFailedMessage((C8024d1) newBuilder.build()).mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
    }

    /* renamed from: b */
    public /* synthetic */ ObservableSource mo7743b(C12279e eVar) {
        return eVar.mo36477d().mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) new C2117o3<Object,Object>(this)).mo36501i(new C2082l2(this));
    }

    /* renamed from: d */
    public /* synthetic */ ObservableSource mo7759d(C12279e eVar) {
        return eVar.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C2103n3<Object,Object>(this));
    }

    /* renamed from: b */
    public /* synthetic */ List mo7746b(C7073d dVar) throws Exception {
        return m7608a(dVar.getMsgsList());
    }

    /* renamed from: b */
    public /* synthetic */ boolean mo7750b(C1949d dVar) throws Exception {
        return dVar.f6310c.getUuid().compareTo((String) this.f6324e.mo36963s()) > 0;
    }

    /* renamed from: b */
    public /* synthetic */ C2098b mo7742b(C7224u uVar) throws Exception {
        C1949d dVar = new C1949d(uVar.getMsg(), true);
        dVar.mo7707a(this.f6323d.getMe());
        if (dVar.mo7711c()) {
            this.f6324e.onNext(dVar.f6310c.getUuid());
        }
        return new C2098b(dVar, uVar.getMessageSentError(), uVar.getConversationCreateError().getConversationError().getCode(), uVar.getConversationCreated());
    }

    /* renamed from: e */
    public /* synthetic */ ObservableSource mo7762e(C12279e eVar) {
        return eVar.mo36455b((Consumer<? super T>) C1954d3.f6317e).mo36509m(new C2380x2(this));
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo7740a(C7993b1 b1Var) throws Exception {
        if (b1Var.getConversationUpdate().getWhat() == C7466b.ADD_MEMBERS || b1Var.getConversationUpdate().getWhat() == C7466b.DEL_MEMBERS) {
            for (C6818b userUuid : b1Var.getConversationUpdate().getMembersList()) {
                if (TextUtils.equals(userUuid.getUserUuid(), C5447b.m15477d(this.f6320a))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ C7943a mo7729a(C2097a aVar) throws Exception {
        return C2303a.m8210b(aVar, this.f6323d.getInboxUuid());
    }

    /* renamed from: b */
    public /* synthetic */ ObservableSource mo7744b(Boolean bool) throws Exception {
        return C12279e.m32616a((Callable<? extends T>) new C1877a3<Object>(this));
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo7730a(C7943a aVar) throws Exception {
        return this.f6320a.chatSendMessage((ZenlyProto$ChatSendMessageMultiRequest) aVar.build()).mo36455b((Consumer<? super T>) C1985f2.f6385e);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Map<String, List<String>> m7610b(Map<String, String> map) {
        String d = C5447b.m15477d(this.f6320a);
        C7571a aVar = new C7571a();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!TextUtils.equals(str, d)) {
                List list = (List) aVar.get(str2);
                if (list == null) {
                    list = new ArrayList();
                    aVar.put(str2, list);
                }
                list.add(str);
            }
        }
        return Collections.unmodifiableMap(aVar);
    }

    /* renamed from: a */
    public /* synthetic */ C2098b mo7727a(C7224u uVar) throws Exception {
        C1949d dVar = new C1949d(uVar.getMsg(), true);
        dVar.mo7707a(this.f6322c.mo7611a(this.f6323d.getMe().getUserUuid()));
        if (dVar.mo7711c()) {
            this.f6324e.onNext(dVar.f6310c.getUuid());
        }
        return new C2098b(dVar, uVar.getMessageSentError(), uVar.getConversationCreateError().getConversationError().getCode(), uVar.getConversationCreated());
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo7731a(C12279e eVar) {
        return eVar.mo36459b((Predicate<? super T>) C1885b4.f6173e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C2030k2<Object,Object>(this));
    }

    /* renamed from: a */
    private C12279e<List<C6818b>> m7606a(C12279e<C7117i> eVar, C12279e<C7993b1> eVar2) {
        return C12279e.m32621b((ObservableSource<? extends T>) eVar.mo36501i(C1994g4.f6396e), (ObservableSource<? extends T>) eVar2.mo36459b((Predicate<? super T>) C2344v3.f7102e).mo36501i(C1955d4.f6318e)).mo36485d(Boolean.valueOf(true)).mo36501i(new C2387y3(this)).mo36455b((Consumer<? super T>) C2334u3.f7049e);
    }

    /* renamed from: a */
    public /* synthetic */ List mo7735a(Boolean bool) throws Exception {
        ArrayList arrayList = new ArrayList(this.f6322c.mo7616b());
        Collections.sort(arrayList, this.f6321b);
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7733a(String str) {
        return (String) f6319m.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7737a(String str, String str2) {
        f6319m.put(str, str2);
    }

    /* renamed from: a */
    private List<C1949d> m7608a(List<PingProto$Ping2> list) {
        ArrayList arrayList = new ArrayList();
        for (PingProto$Ping2 pingProto$Ping2 : list) {
            C6818b a = this.f6322c.mo7611a(pingProto$Ping2.getAuthorUuid());
            if (a != null) {
                C1949d dVar = new C1949d(pingProto$Ping2, TextUtils.equals(pingProto$Ping2.getAuthorUuid(), this.f6323d.getMe().getUserUuid()));
                dVar.mo7707a(a);
                arrayList.add(dVar);
                C12143a.m32033c("got raw message -> %s", pingProto$Ping2.getContent(0).getText());
            }
        }
        return arrayList;
    }
}
