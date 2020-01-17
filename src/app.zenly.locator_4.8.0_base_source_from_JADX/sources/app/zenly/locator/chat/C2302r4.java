package app.zenly.locator.chat;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.p047i5.C2009a;
import app.zenly.locator.chat.p053m5.C2097a;
import app.zenly.locator.core.util.C3220i;
import p213co.znly.models.C7339i;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.r4 */
public class C2302r4 implements ChatPresenter {

    /* renamed from: a */
    private final ZenlySchedulers f6966a = C1351e.m6372a(C2382x4.f7181b.mo19916a("contactPresenter"));

    /* renamed from: b */
    private final C2316s4 f6967b;

    /* renamed from: c */
    private final C2009a f6968c;

    /* renamed from: d */
    private final C7339i f6969d;

    /* renamed from: e */
    private final C12275b f6970e = new C12275b();

    C2302r4(C2316s4 s4Var, C2009a aVar, C7339i iVar) {
        this.f6967b = s4Var;
        this.f6968c = aVar;
        this.f6969d = iVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8160a(C2097a aVar) throws Exception {
        this.f6967b.mo8194a(this.f6969d.getPhoneNumbers(0), aVar.f6584b);
    }

    public void init() {
        this.f6967b.mo8164D();
        this.f6968c.mo7815a(C3220i.m10211a(this.f6969d));
    }

    public void setChatState(boolean z) {
    }

    public void subscribe() {
        this.f6970e.add(this.f6967b.mo8176P().mo36428a((C12286f) this.f6966a.getMainThread()).mo36476d((Consumer<? super T>) new C1887c<Object>(this)));
    }

    public void unsubscribe() {
        this.f6970e.mo36401a();
    }
}
