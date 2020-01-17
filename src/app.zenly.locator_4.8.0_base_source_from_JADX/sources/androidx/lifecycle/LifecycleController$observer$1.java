package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job.C13048a;

final class LifecycleController$observer$1 implements LifecycleEventObserver {

    /* renamed from: e */
    final /* synthetic */ C0865h f3405e;

    /* renamed from: f */
    final /* synthetic */ Job f3406f;

    public final void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        C12932j.m33818b(lifecycleOwner, "source");
        C12932j.m33818b(aVar, "<anonymous parameter 1>");
        C0862g lifecycle = lifecycleOwner.getLifecycle();
        String str = "source.lifecycle";
        C12932j.m33815a((Object) lifecycle, str);
        if (lifecycle.mo4445a() != C0864b.DESTROYED) {
            C0862g lifecycle2 = lifecycleOwner.getLifecycle();
            C12932j.m33815a((Object) lifecycle2, str);
            if (lifecycle2.mo4445a().compareTo(this.f3405e.f3463a) < 0) {
                this.f3405e.f3464b.mo4430a();
                throw null;
            } else {
                this.f3405e.f3464b.mo4431b();
                throw null;
            }
        } else {
            C0865h hVar = this.f3405e;
            C13048a.m34064a(this.f3406f, null, 1, null);
            hVar.mo4449a();
            throw null;
        }
    }
}
