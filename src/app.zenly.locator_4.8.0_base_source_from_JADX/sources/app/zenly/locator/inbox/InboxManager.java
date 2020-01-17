package app.zenly.locator.inbox;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0875o;
import androidx.lifecycle.LifecycleObserver;
import app.zenly.locator.core.helper.AuthenticatedSessionLifecycleOwner;
import app.zenly.locator.media.C4473v0;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.models.core.C7192q;
import p213co.znly.models.core.C7192q.C7194b;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p406n.C12791d;

public final class InboxManager implements LifecycleObserver {

    /* renamed from: g */
    private static InboxManager f10178g;

    /* renamed from: e */
    private final C12275b f10179e = new C12275b();

    /* renamed from: f */
    private C12791d<C7192q> f10180f = C12791d.m33471s();

    private InboxManager() {
        AuthenticatedSessionLifecycleOwner.m8733b().getLifecycle().mo4446a(this);
    }

    /* renamed from: b */
    public static InboxManager m11316b() {
        if (f10178g == null) {
            f10178g = new InboxManager();
        }
        return f10178g;
    }

    /* renamed from: a */
    public /* synthetic */ void mo10406a(C7192q qVar) throws Exception {
        C4473v0.m13259a(qVar);
        this.f10180f.onNext(qVar);
    }

    @C0875o(C0863a.ON_STOP)
    public void onBackground() {
        this.f10180f = C12791d.m33471s();
        this.f10179e.mo36401a();
    }

    @C0875o(C0863a.ON_START)
    public void onForeground() {
        C7707a.m18761b("manager:inbox:start");
        this.f10179e.add(C5448c.m15478a().inboxStream().mo36459b((Predicate<? super T>) C3832a.f10209e).mo36412a((Consumer<? super T>) new C3833b<Object>(this), (Consumer<? super Throwable>) C3834c.f10211e));
        C7707a.m18759a();
    }

    /* renamed from: a */
    public C12279e<C7192q> mo10405a() {
        return this.f10180f;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m11317b(C7192q qVar) throws Exception {
        return qVar.getType() == C7194b.INBOX_EVENT_CONVERSATIONS;
    }

    /* renamed from: a */
    public boolean mo10407a(String str) {
        return C4473v0.m13260a(str);
    }
}
