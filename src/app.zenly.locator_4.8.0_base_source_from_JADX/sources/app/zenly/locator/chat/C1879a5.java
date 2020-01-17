package app.zenly.locator.chat;

import android.util.Pair;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C1893c5.C1894a;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.chat.p047i5.C2009a;
import app.zenly.locator.chat.p048j5.C2017b;
import app.zenly.locator.chat.p053m5.C2098b;
import app.zenly.locator.chat.p059r5.C2303a;
import app.zenly.locator.chat.p060s5.C2321a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.privacy.model.C5082d;
import java.util.List;
import java.util.Map;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.services.C8042e1;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.chat.a5 */
final class C1879a5 implements ChatPresenter {

    /* renamed from: a */
    private final C2316s4 f6159a;

    /* renamed from: b */
    private final C1956d5 f6160b;

    /* renamed from: c */
    private final C2321a f6161c;

    /* renamed from: d */
    private final C2009a f6162d;

    /* renamed from: e */
    private final C7117i f6163e;

    /* renamed from: f */
    private final C1893c5 f6164f;

    /* renamed from: g */
    private final boolean f6165g;

    /* renamed from: h */
    private final ZenlySchedulers f6166h = C1351e.m6372a(C2382x4.f7181b.mo19916a("presenter"));

    /* renamed from: i */
    private final C12275b f6167i = new C12275b();

    C1879a5(C2316s4 s4Var, C2321a aVar, C2009a aVar2, C7117i iVar, C1956d5 d5Var, C1893c5 c5Var, boolean z) {
        this.f6159a = s4Var;
        this.f6161c = aVar;
        this.f6162d = aVar2;
        this.f6163e = iVar;
        this.f6160b = d5Var;
        this.f6164f = c5Var;
        this.f6165g = z;
    }

    /* renamed from: a */
    static /* synthetic */ void m7436a(String str) throws Exception {
    }

    /* renamed from: b */
    private void m7440b() {
        Disposable disposable;
        Disposable d = this.f6160b.mo7767g().mo36428a((C12286f) this.f6166h.getMainThread()).mo36476d((Consumer<? super T>) new C1998h1<Object>(this));
        Disposable a = this.f6160b.mo7773m().mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C2012j1<Object>(this), (Consumer<? super Throwable>) C2005i1.f6414e);
        Disposable d2 = this.f6160b.mo7763e().mo36428a((C12286f) this.f6166h.getMainThread()).mo36476d((Consumer<? super T>) new C2392z0<Object>(this));
        Disposable a2 = this.f6160b.mo7768h().mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C2081l1<Object>(this), (Consumer<? super Throwable>) C2379x1.f7178e);
        Disposable a3 = this.f6159a.mo8171K().mo36455b((Consumer<? super T>) C1960e1.f6335e).mo36427a(this.f6160b.mo7776p()).mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C1991g1<Object>(this), (Consumer<? super Throwable>) C2341v0.f7099e);
        C12279e l = this.f6159a.mo8173M().mo36506l();
        Disposable m = l.mo36428a((C12286f) this.f6166h.getMainThread()).mo36455b((Consumer<? super T>) C2342v1.f7100e).mo36427a(this.f6160b.mo7777q()).mo36508m();
        Disposable d3 = l.mo36459b((Predicate<? super T>) C2093m1.f6579e).mo36459b((Predicate<? super T>) new C2299r1<Object>(this)).mo36428a((C12286f) this.f6166h.getMainThread()).mo36476d((Consumer<? super T>) new C1952d1<Object>(this));
        Disposable a4 = this.f6160b.mo7778r().mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) C2332u1.f7047e, (Consumer<? super Throwable>) C2384y0.f7183e);
        Disposable a5 = this.f6159a.mo8176P().mo36427a(this.f6160b.mo7781u()).mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C2282q1<Object>(this), (Consumer<? super Throwable>) C2331u0.f7046e);
        Disposable a6 = this.f6159a.mo8179S().mo36427a(this.f6160b.mo7780t()).mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) C2029k1.f6447e, (Consumer<? super Throwable>) C2101n1.f6595e);
        Disposable a7 = this.f6159a.mo8163C().mo36427a(this.f6160b.mo7766f()).mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C2371w0<Object>(this), (Consumer<? super Throwable>) C2372w1.f7168e);
        Disposable a8 = this.f6159a.mo8175O().mo36427a(this.f6160b.mo7779s()).mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C1889c1<Object>(this), (Consumer<? super Throwable>) C2326t1.f7041e);
        if (this.f6165g) {
            this.f6167i.add(this.f6160b.mo7745b().mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C1882b1<Object>(this), (Consumer<? super Throwable>) C2313s1.f6978e));
            this.f6167i.add(this.f6160b.mo7754c().mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C1875a1<Object>(this), (Consumer<? super Throwable>) C2378x0.f7177e));
            disposable = a5;
        } else {
            C12279e s = this.f6164f.mo7626c().mo36475c(1).mo36947s();
            C12279e s2 = this.f6160b.mo7760d().mo36475c(1).mo36947s();
            disposable = a5;
            this.f6167i.add(C12279e.m32610a((ObservableSource<? extends T1>) s2, (ObservableSource<? extends T2>) s, (BiFunction<? super T1, ? super T2, ? extends R>) C2104n4.f6598a).mo36428a((C12286f) this.f6166h.getMainThread()).mo36412a((Consumer<? super T>) new C2115o1<Object>(this), (Consumer<? super Throwable>) C2193p1.f6734e));
            this.f6167i.add(C12279e.m32610a((ObservableSource<? extends T1>) s2, (ObservableSource<? extends T2>) this.f6164f.mo7625b(), (BiFunction<? super T1, ? super T2, ? extends R>) C2001h4.f6410a).mo36428a((C12286f) this.f6166h.getMainThread()).mo36476d((Consumer<? super T>) new C1984f1<Object>(this)));
        }
        this.f6167i.add(a3);
        this.f6167i.add(m);
        this.f6167i.add(d3);
        this.f6167i.add(a2);
        this.f6167i.add(d);
        this.f6167i.add(a);
        this.f6167i.add(a4);
        this.f6167i.add(d2);
        this.f6167i.add(a8);
        this.f6167i.add(a7);
        this.f6167i.add(a6);
        this.f6167i.add(disposable);
    }

    /* renamed from: c */
    static /* synthetic */ void m7443c(Boolean bool) throws Exception {
    }

    /* renamed from: a */
    public /* synthetic */ void mo7599a(Boolean bool) throws Exception {
        this.f6159a.mo8172L();
    }

    /* renamed from: c */
    public /* synthetic */ void mo7608c(List list) throws Exception {
        this.f6159a.mo8196a(list, false);
    }

    public void init() {
        List n = this.f6160b.mo7774n();
        this.f6159a.mo8210f(this.f6163e.getInboxUuid());
        if (!n.isEmpty()) {
            this.f6159a.mo8196a(n, false);
        }
        if (!this.f6165g && this.f6159a.mo8168H()) {
            this.f6159a.mo8164D();
        }
        m7438a(this.f6163e.getName(), this.f6163e.getHasLeft());
    }

    public void setChatState(boolean z) {
        if (z) {
            List b = this.f6159a.mo8166F().mo8243b(this.f6160b.mo7770j());
            if (b.size() > 0) {
                this.f6159a.mo8207e((C1949d) b.get(0));
                m7435a();
                return;
            }
            return;
        }
        this.f6159a.mo7192B();
    }

    public void subscribe() {
        m7440b();
    }

    public void unsubscribe() {
        this.f6167i.mo36401a();
    }

    /* renamed from: c */
    static /* synthetic */ boolean m7445c(C1949d dVar) throws Exception {
        return !dVar.mo7715f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7600a(List list) throws Exception {
        C12143a.m32033c("Loaded first messages", new Object[0]);
        C2316s4 s4Var = this.f6159a;
        s4Var.mo8196a(list, s4Var.mo8170J());
        if (!this.f6165g) {
            this.f6159a.mo8167G();
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo7609d(List list) throws Exception {
        this.f6159a.mo8196a(list, false);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7601a(Map map) throws Exception {
        this.f6159a.mo8180T();
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo7602a(C1949d dVar) throws Exception {
        return dVar.f6310c.getUuid().compareTo(this.f6160b.mo7770j()) > 0;
    }

    /* renamed from: a */
    public /* synthetic */ void mo7597a(C2098b bVar) throws Exception {
        if (!this.f6165g) {
            this.f6159a.mo8169I();
        }
        if (bVar.mo7900b()) {
            this.f6159a.mo8178R();
        }
        if (bVar.mo7901c() && this.f6163e.getIsGroup()) {
            this.f6159a.mo8174N();
        }
        this.f6159a.mo8187a(bVar.mo7899a(), !bVar.mo7899a().mo7711c());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7598a(C8042e1 e1Var) throws Exception {
        this.f6159a.mo8177Q();
        this.f6159a.mo8167G();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7596a(Pair pair) throws Exception {
        m7437a((String) pair.first, (C1894a) pair.second);
    }

    /* renamed from: a */
    private void m7438a(String str, boolean z) {
        if (z) {
            this.f6162d.mo7814a();
        } else if (this.f6165g) {
            this.f6162d.mo7817b();
        } else {
            this.f6162d.mo7815a(str);
        }
        this.f6159a.mo8209e(!z);
        this.f6162d.mo7816a(!z);
    }

    /* renamed from: a */
    private void m7437a(String str, C1894a aVar) {
        if (aVar.f6191d) {
            this.f6162d.mo7819c();
            this.f6159a.mo8201b(2131231503);
        } else if (aVar.f6190c) {
            this.f6162d.mo7820c(str);
            this.f6159a.mo8201b(2131231503);
        } else if (aVar.f6189b) {
            this.f6162d.mo7821d(str);
            this.f6159a.mo8201b(2131231392);
        } else if (aVar.f6188a) {
            this.f6162d.mo7818b(str);
            this.f6159a.mo8201b(2131231392);
        } else {
            this.f6162d.mo7815a(str);
            this.f6159a.mo8201b(2131231484);
        }
        boolean a = aVar.mo7627a();
        this.f6159a.mo8209e(a);
        this.f6162d.mo7816a(a);
    }

    /* renamed from: a */
    private void m7435a() {
        int E = this.f6159a.mo8165E();
        if (E != -1) {
            C1949d a = this.f6159a.mo8166F().mo8235a(E);
            if (a.f6310c.getUuid().compareTo(this.f6160b.mo7770j()) > 0) {
                this.f6160b.mo7771k().onNext(a.f6310c.getUuid());
                C5448c.m15478a().chatUpdateCursor(C2303a.m8207a(a, this.f6163e.getInboxUuid())).mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36508m();
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7604b(C1949d dVar) throws Exception {
        C2017b a = C2017b.m7730a(dVar.f6310c.getContent(0).getText());
        if (a != null) {
            this.f6159a.mo8188a(a);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7605b(C2098b bVar) throws Exception {
        if (bVar.mo7900b()) {
            this.f6159a.mo8178R();
        }
        this.f6159a.mo8187a(bVar.mo7899a(), true);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7606b(Boolean bool) throws Exception {
        m7438a("", bool.booleanValue());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<co.znly.models.PingProto$Conversation$b>, for r3v0, types: [java.util.List, java.util.List<co.znly.models.PingProto$Conversation$b>] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo7607b(java.util.List<p213co.znly.models.PingProto$Conversation.C6818b> r3) throws java.lang.Exception {
        /*
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r3.next()
            co.znly.models.PingProto$Conversation$b r1 = (p213co.znly.models.PingProto$Conversation.C6818b) r1
            java.lang.String r1 = r1.getUserUuid()
            r0.add(r1)
            goto L_0x0009
        L_0x001d:
            co.znly.models.core.i r3 = r2.f6163e
            co.znly.models.PingProto$Conversation$b r3 = r3.getMe()
            java.lang.String r3 = r3.getUserUuid()
            r0.add(r3)
            app.zenly.locator.chat.s4 r3 = r2.f6159a
            r3.mo8195a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.C1879a5.mo7607b(java.util.List):void");
    }

    /* renamed from: b */
    public /* synthetic */ void mo7603b(Pair pair) throws Exception {
        String str = (String) pair.first;
        C5082d dVar = (C5082d) pair.second;
        if (dVar == C5082d.Precise) {
            this.f6161c.mo8223a();
        } else {
            this.f6161c.mo8224a(str, dVar);
        }
    }
}
