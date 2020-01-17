package app.zenly.locator.p143s;

import app.zenly.android.feature.base.scheduling.C1352f;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;
import p389io.reactivex.exceptions.UndeliverableException;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p403k.C12768a;

/* renamed from: app.zenly.locator.s.f */
public final class C5405f {

    /* renamed from: app.zenly.locator.s.f$a */
    static final class C5406a<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5406a f13964e = new C5406a();

        C5406a() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12932j.m33815a((Object) th, "throwable");
            Throwable a = C1352f.m6373a(th);
            if (th instanceof UndeliverableException) {
                C12143a.m32028a(a);
                return;
            }
            throw a;
        }
    }

    static {
        new C5405f();
    }

    private C5405f() {
    }

    /* renamed from: a */
    public static final void m15384a() {
        C12768a.m33407a((Consumer<? super Throwable>) C5406a.f13964e);
    }
}
