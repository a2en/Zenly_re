package app.zenly.locator.meet;

import android.text.TextUtils;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.meet.MeetContract.C4479a;
import app.zenly.locator.meet.MeetContract.Presenter;
import app.zenly.locator.meet.MeetContract.View;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.meet.j0 */
final class C4502j0 implements Presenter {

    /* renamed from: a */
    private final View f12104a;

    /* renamed from: b */
    private final ZenlySchedulers f12105b = C1351e.m6372a(C4500i0.f12102b.mo19916a("presenter"));

    /* renamed from: c */
    private final C12275b f12106c = new C12275b();

    /* renamed from: d */
    private final C4504k0 f12107d;

    /* renamed from: e */
    private String f12108e;

    /* renamed from: f */
    private boolean f12109f = false;

    C4502j0(C4504k0 k0Var, View view) {
        this.f12107d = k0Var;
        this.f12104a = view;
    }

    /* renamed from: a */
    static /* synthetic */ void m13294a(Throwable th) throws Exception {
    }

    /* renamed from: a */
    public /* synthetic */ void mo11680a(Boolean bool) throws Exception {
        UserProto$User b = this.f12107d.mo11686b();
        this.f12104a.showBlurredMode(b != null ? b.getName() : "");
    }

    public void callFriend() {
        UserProto$User b = this.f12107d.mo11686b();
        if (b != null) {
            this.f12104a.showCall(b.getPhoneNumber());
        }
    }

    public void getNavigation(C4479a aVar) {
        Double c = this.f12107d.mo11687c();
        Double d = this.f12107d.mo11688d();
        if (c != null && d != null) {
            this.f12104a.showNavigationChooser(c.doubleValue(), d.doubleValue(), aVar);
        }
    }

    public void resolveAddress() {
        if (!TextUtils.isEmpty(this.f12108e)) {
            Double c = this.f12107d.mo11687c();
            Double d = this.f12107d.mo11688d();
            UserProto$User b = this.f12107d.mo11686b();
            if (c != null && d != null && b != null) {
                this.f12104a.showShareLocationChooser(c.doubleValue(), d.doubleValue(), this.f12108e, b.getName());
            }
        }
    }

    public void subscribe() {
        this.f12106c.mo36403a(this.f12107d.mo11683a().mo36459b((Predicate<? super T>) C4511p.f12126e).mo36428a((C12286f) this.f12105b.getMainThread()).mo36412a((Consumer<? super T>) new C4503k<Object>(this), (Consumer<? super Throwable>) C4507l.f12122e), this.f12107d.mo11690f().mo36428a((C12286f) this.f12105b.getMainThread()).mo36412a((Consumer<? super T>) new C4510o<Object>(this), (Consumer<? super Throwable>) C4508m.f12123e), this.f12107d.mo11689e().mo36428a((C12286f) this.f12105b.getMainThread()).mo36412a((Consumer<? super T>) new C4512q<Object>(this), (Consumer<? super Throwable>) C4509n.f12124e));
    }

    public void switchNavigation(int i) {
        boolean z = true;
        this.f12109f = true;
        C3896a1.m11470r().mo10497a(i);
        View view = this.f12104a;
        if (i != 0) {
            z = false;
        }
        view.selectTransport(z);
    }

    public void unsubscribe() {
        this.f12106c.mo36401a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11681a(String str) throws Exception {
        this.f12108e = str;
        if (TextUtils.isEmpty(str)) {
            this.f12104a.showAddressNotFound();
        } else {
            this.f12104a.showAddress(str);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11679a(C4505a aVar) throws Exception {
        this.f12104a.hideFogViewMode();
        float f = aVar.f12117a;
        if (f < 150.0f) {
            this.f12104a.showIsNearby();
        } else if (f >= 2000000.0f) {
            this.f12104a.showLongDistance(f);
        } else if (aVar.f12119c != 0 || aVar.f12118b != 0) {
            this.f12104a.showETAs(aVar.f12118b, aVar.f12119c);
            this.f12104a.showDistance((int) aVar.f12117a);
            if (!this.f12109f) {
                this.f12104a.selectTransport(aVar.f12117a < 1500.0f);
            }
        }
    }
}
