package app.zenly.locator.core.p072ui.view;

import android.view.View;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.ui.view.d */
public final class C3140d {

    /* renamed from: a */
    private final View f8695a;

    /* renamed from: b */
    private final boolean f8696b;

    /* renamed from: c */
    private final boolean f8697c;

    /* renamed from: d */
    private final Runnable f8698d;

    /* renamed from: e */
    private final Runnable f8699e;

    /* renamed from: app.zenly.locator.core.ui.view.d$a */
    static final class C3141a implements Runnable {

        /* renamed from: e */
        public static final C3141a f8700e = new C3141a();

        C3141a() {
        }

        public final void run() {
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.d$b */
    static final class C3142b implements Runnable {

        /* renamed from: e */
        public static final C3142b f8701e = new C3142b();

        C3142b() {
        }

        public final void run() {
        }
    }

    public C3140d(View view, boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(runnable, "onClick");
        C12932j.m33818b(runnable2, "onDismiss");
        this.f8695a = view;
        this.f8696b = z;
        this.f8697c = z2;
        this.f8698d = runnable;
        this.f8699e = runnable2;
    }

    /* renamed from: a */
    public final boolean mo9466a() {
        return this.f8697c;
    }

    /* renamed from: b */
    public final boolean mo9467b() {
        return this.f8696b;
    }

    /* renamed from: c */
    public final View mo9468c() {
        return this.f8695a;
    }

    /* renamed from: d */
    public final void mo9469d() {
        this.f8698d.run();
    }

    /* renamed from: e */
    public final void mo9470e() {
        this.f8699e.run();
    }

    public /* synthetic */ C3140d(View view, boolean z, boolean z2, Runnable runnable, Runnable runnable2, int i, C12928f fVar) {
        boolean z3 = (i & 2) != 0 ? false : z;
        boolean z4 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            runnable = C3141a.f8700e;
        }
        Runnable runnable3 = runnable;
        if ((i & 16) != 0) {
            runnable2 = C3142b.f8701e;
        }
        this(view, z3, z4, runnable3, runnable2);
    }
}
