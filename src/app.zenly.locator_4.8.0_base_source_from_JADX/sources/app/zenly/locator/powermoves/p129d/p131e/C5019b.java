package app.zenly.locator.powermoves.p129d.p131e;

import android.app.Application;
import androidx.lifecycle.C0851a;
import app.zenly.locator.ZenlyApplication;
import app.zenly.locator.powermoves.api.PowerMovesService;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;

/* renamed from: app.zenly.locator.powermoves.d.e.b */
public class C5019b extends C0851a {

    /* renamed from: c */
    private final C12275b f13059c = new C12275b();

    /* renamed from: d */
    private final PowerMovesService f13060d;

    public C5019b(Application application) {
        C12932j.m33818b(application, "application");
        super(application);
        this.f13060d = ((ZenlyApplication) application).providePowerMovesModule().mo12268a();
    }

    /* renamed from: a */
    public final void mo12264a(Throwable th) {
        C12932j.m33818b(th, "throwable");
        mo12265b(th);
    }

    /* renamed from: b */
    public final void mo12265b(Throwable th) {
        C12932j.m33818b(th, "throwable");
        C12143a.m32025a(getClass().getSimpleName()).mo35940b(th);
    }

    /* renamed from: c */
    public final C12275b mo12266c() {
        return this.f13059c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final PowerMovesService mo12267d() {
        return this.f13060d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4269b() {
        super.mo4269b();
        this.f13059c.mo36401a();
    }
}
