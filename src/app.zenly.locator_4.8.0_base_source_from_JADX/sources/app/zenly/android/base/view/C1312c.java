package app.zenly.android.base.view;

import android.util.Property;
import android.view.Window;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7656b;

/* renamed from: app.zenly.android.base.view.c */
public final class C1312c {

    /* renamed from: a */
    public static final Property<Window, Integer> f4898a = new C1314b("statusBarColor");

    /* renamed from: b */
    public static final Property<Window, Integer> f4899b = new C1313a("navigationBarColor");

    /* renamed from: app.zenly.android.base.view.c$a */
    public static final class C1313a extends C7656b<Window> {
        C1313a(String str) {
            super(str);
        }

        /* renamed from: a */
        public Integer get(Window window) {
            C12932j.m33818b(window, "target");
            return Integer.valueOf(window.getNavigationBarColor());
        }

        /* renamed from: a */
        public void mo6445b(Window window, int i) {
            C12932j.m33818b(window, "target");
            window.setNavigationBarColor(i);
        }
    }

    /* renamed from: app.zenly.android.base.view.c$b */
    public static final class C1314b extends C7656b<Window> {
        C1314b(String str) {
            super(str);
        }

        /* renamed from: a */
        public Integer get(Window window) {
            C12932j.m33818b(window, "target");
            return Integer.valueOf(window.getStatusBarColor());
        }

        /* renamed from: a */
        public void mo6445b(Window window, int i) {
            C12932j.m33818b(window, "target");
            window.setStatusBarColor(i);
        }
    }

    static {
        new C1312c();
    }

    private C1312c() {
    }
}
