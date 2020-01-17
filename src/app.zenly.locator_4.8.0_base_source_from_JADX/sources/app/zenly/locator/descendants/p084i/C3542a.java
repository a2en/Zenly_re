package app.zenly.locator.descendants.p084i;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs;
import app.zenly.locator.AppLifecycleObserver;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;

/* renamed from: app.zenly.locator.descendants.i.a */
public final class C3542a implements AppLifecycleObserver {

    /* renamed from: a */
    private final Provider<DescendantsPrefs> f9528a;

    public C3542a(Provider<DescendantsPrefs> provider) {
        C12932j.m33818b(provider, "descendantsPrefs");
        this.f9528a = provider;
    }

    public Disposable onForeground() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    public Disposable onInitialize() {
        return ((DescendantsPrefs) this.f9528a.get()).bind();
    }
}
