package p389io.reactivex.disposables;

import p389io.reactivex.functions.Action;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.disposables.c */
public final class C12276c {
    /* renamed from: a */
    public static Disposable m32594a(Runnable runnable) {
        C12324b.m32836a(runnable, "run is null");
        return new C12278e(runnable);
    }

    /* renamed from: b */
    public static Disposable m32595b() {
        return m32594a(C12301a.f31980b);
    }

    /* renamed from: a */
    public static Disposable m32593a(Action action) {
        C12324b.m32836a(action, "run is null");
        return new C12274a(action);
    }

    /* renamed from: a */
    public static Disposable m32592a() {
        return C12459c.INSTANCE;
    }
}
