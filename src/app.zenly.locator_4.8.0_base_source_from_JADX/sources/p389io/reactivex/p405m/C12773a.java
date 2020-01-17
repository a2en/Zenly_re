package p389io.reactivex.p405m;

import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.m.a */
public final class C12773a {
    /* renamed from: a */
    public static final Disposable m33432a(Disposable disposable, C12275b bVar) {
        C12932j.m33818b(disposable, "$receiver");
        C12932j.m33818b(bVar, "compositeDisposable");
        bVar.add(disposable);
        return disposable;
    }
}
