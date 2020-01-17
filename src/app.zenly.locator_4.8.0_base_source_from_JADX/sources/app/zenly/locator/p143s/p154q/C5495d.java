package app.zenly.locator.p143s.p154q;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.ActivityLifecycleObserver;
import app.zenly.locator.C3819h;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.p072ui.activity.MajorUpdateActivity;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.s.q.d */
public final class C5495d implements ActivityLifecycleObserver {

    /* renamed from: a */
    private final ZenlySchedulers f14115a = C1351e.m6372a(C3819h.f10169b.mo19916a("serverState"));

    /* renamed from: b */
    private final BaseActivity f14116b;

    /* renamed from: app.zenly.locator.s.q.d$a */
    static final /* synthetic */ class C5496a extends C12931i implements Function1<String, C12956q> {
        C5496a(C5495d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo13122a(String str) {
            C12932j.m33818b(str, "p1");
            ((C5495d) this.f33505f).m15595a(str);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C5495d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onMustUpgrade(Ljava/lang/String;)V";
        }

        public final String getName() {
            return "onMustUpgrade";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13122a((String) obj);
            return C12956q.f33541a;
        }
    }

    public C5495d(BaseActivity baseActivity) {
        C12932j.m33818b(baseActivity, "activity");
        this.f14116b = baseActivity;
    }

    public Disposable onCreate() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    public Disposable onForeground() {
        C12275b bVar = new C12275b();
        Disposable d = C5448c.m15478a().mustUpgradeStream().mo36428a((C12286f) this.f14115a.getMainThread()).mo36476d((Consumer<? super T>) new C5497e<Object>(new C5496a(this)));
        C12932j.m33815a((Object) d, "ZenlyCoreProvider.get()\n…ubscribe(::onMustUpgrade)");
        C12773a.m33432a(d, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15595a(String str) {
        BaseActivity baseActivity = this.f14116b;
        baseActivity.startActivity(MajorUpdateActivity.m9610a(baseActivity, str));
        this.f14116b.finish();
    }
}
