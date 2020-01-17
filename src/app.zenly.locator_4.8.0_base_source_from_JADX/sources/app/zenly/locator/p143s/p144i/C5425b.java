package app.zenly.locator.p143s.p144i;

import android.content.Context;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.AppLifecycleObserver;
import com.appsflyer.AppsFlyerLib;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;

/* renamed from: app.zenly.locator.s.i.b */
public final class C5425b implements AppLifecycleObserver {

    /* renamed from: a */
    private final ZenlySchedulers f13976a = C1351e.m6372a(C5424a.f13975b.mo19916a("appsflyer"));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f13977b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ZenlyCore f13978c;

    /* renamed from: app.zenly.locator.s.i.b$a */
    static final class C5426a<V> implements Callable<Object> {

        /* renamed from: e */
        final /* synthetic */ C5425b f13979e;

        C5426a(C5425b bVar) {
            this.f13979e = bVar;
        }

        public final void call() {
            this.f13979e.f13978c.deviceSetAppsflyerId(AppsFlyerLib.getInstance().getAppsFlyerUID(this.f13979e.f13977b));
        }
    }

    public C5425b(Context context, ZenlyCore zenlyCore) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlyCore, "zenlyCore");
        this.f13977b = context;
        this.f13978c = zenlyCore;
    }

    public Disposable onForeground() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    public Disposable onInitialize() {
        Disposable b = C12271b.m32507b((Callable<?>) new C5426a<Object>(this)).mo36350b((C12286f) this.f13976a.getComputation()).mo36351b();
        C12932j.m33815a((Object) b, "Completable.fromCallable…\n            .subscribe()");
        return b;
    }
}
