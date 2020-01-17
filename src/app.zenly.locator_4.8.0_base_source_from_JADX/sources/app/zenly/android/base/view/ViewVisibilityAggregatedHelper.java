package app.zenly.android.base.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import kotlin.jvm.internal.C12932j;

public final class ViewVisibilityAggregatedHelper<T extends View & Callback> {

    /* renamed from: a */
    private final C1307c f4886a;

    public interface Callback {
        void onVisibilityAggregatedChanged(boolean z);
    }

    /* renamed from: app.zenly.android.base.view.ViewVisibilityAggregatedHelper$a */
    private static final class C1304a<T extends View & Callback> implements C1307c {

        /* renamed from: a */
        private boolean f4887a;

        /* renamed from: b */
        private final T f4888b;

        public C1304a(T t) {
            C12932j.m33818b(t, "view");
            this.f4888b = t;
        }

        /* renamed from: a */
        public void mo6430a(View view, int i) {
            C12932j.m33818b(view, "changedView");
            C1308a.m6272a(this, view, i);
        }

        /* renamed from: b */
        public void mo6433b(boolean z) {
            this.f4887a = z;
        }

        public void onAttachedToWindow() {
            C1308a.m6270a(this);
        }

        public void onDetachedFromWindow() {
            C1308a.m6274b(this);
        }

        public void onWindowVisibilityChanged(int i) {
            C1308a.m6271a((C1307c) this, i);
        }

        /* renamed from: a */
        public boolean mo6432a() {
            return this.f4887a;
        }

        /* renamed from: a */
        public void mo6431a(boolean z) {
            if (z != mo6432a()) {
                mo6433b(z);
                ((Callback) this.f4888b).onVisibilityAggregatedChanged(z);
            }
        }
    }

    /* renamed from: app.zenly.android.base.view.ViewVisibilityAggregatedHelper$b */
    private static final class C1305b<T extends View & Callback> implements C1307c {

        /* renamed from: a */
        private boolean f4889a;

        /* renamed from: b */
        private boolean f4890b;

        /* renamed from: c */
        private boolean f4891c;

        /* renamed from: d */
        private boolean f4892d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final T f4893e;

        /* renamed from: app.zenly.android.base.view.ViewVisibilityAggregatedHelper$b$a */
        public static final class C1306a implements OnLayoutChangeListener {

            /* renamed from: e */
            final /* synthetic */ C1305b f4894e;

            C1306a(C1305b bVar) {
                this.f4894e = bVar;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C12932j.m33818b(view, "v");
                this.f4894e.f4893e.removeOnLayoutChangeListener(this);
                C1305b bVar = this.f4894e;
                bVar.mo6430a(bVar.f4893e, this.f4894e.f4893e.getVisibility());
            }
        }

        public C1305b(T t) {
            C12932j.m33818b(t, "view");
            this.f4893e = t;
            this.f4893e.addOnLayoutChangeListener(new C1306a(this));
        }

        /* renamed from: b */
        public void mo6437b(boolean z) {
            this.f4892d = z;
        }

        public void onAttachedToWindow() {
            this.f4889a = true;
            m6262b();
        }

        public void onDetachedFromWindow() {
            this.f4889a = false;
            m6262b();
        }

        public void onWindowVisibilityChanged(int i) {
            this.f4890b = i == 0;
            m6262b();
        }

        /* renamed from: b */
        private final void m6262b() {
            boolean z = this.f4889a && this.f4890b && this.f4891c;
            if (z != mo6432a()) {
                mo6437b(z);
                ((Callback) this.f4893e).onVisibilityAggregatedChanged(z);
            }
        }

        /* renamed from: a */
        public void mo6431a(boolean z) {
            C1308a.m6273a((C1307c) this, z);
        }

        /* renamed from: a */
        public boolean mo6432a() {
            return this.f4892d;
        }

        /* renamed from: a */
        public void mo6430a(View view, int i) {
            C12932j.m33818b(view, "changedView");
            this.f4891c = i == 0;
            m6262b();
        }
    }

    /* renamed from: app.zenly.android.base.view.ViewVisibilityAggregatedHelper$c */
    private interface C1307c {

        /* renamed from: app.zenly.android.base.view.ViewVisibilityAggregatedHelper$c$a */
        public static final class C1308a {
            /* renamed from: a */
            public static void m6270a(C1307c cVar) {
            }

            /* renamed from: a */
            public static void m6271a(C1307c cVar, int i) {
            }

            /* renamed from: a */
            public static void m6272a(C1307c cVar, View view, int i) {
                C12932j.m33818b(view, "changedView");
            }

            /* renamed from: a */
            public static void m6273a(C1307c cVar, boolean z) {
            }

            /* renamed from: b */
            public static void m6274b(C1307c cVar) {
            }
        }

        /* renamed from: a */
        void mo6430a(View view, int i);

        /* renamed from: a */
        void mo6431a(boolean z);

        /* renamed from: a */
        boolean mo6432a();

        void onAttachedToWindow();

        void onDetachedFromWindow();

        void onWindowVisibilityChanged(int i);
    }

    public ViewVisibilityAggregatedHelper(T t) {
        C1307c cVar;
        C12932j.m33818b(t, "view");
        if (VERSION.SDK_INT >= 24) {
            cVar = new C1304a(t);
        } else {
            cVar = new C1305b(t);
        }
        this.f4886a = cVar;
    }

    /* renamed from: a */
    public final boolean mo6426a() {
        return this.f4886a.mo6432a();
    }

    /* renamed from: b */
    public final void mo6427b() {
        this.f4886a.onAttachedToWindow();
    }

    /* renamed from: c */
    public final void mo6428c() {
        this.f4886a.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo6423a(int i) {
        this.f4886a.onWindowVisibilityChanged(i);
    }

    /* renamed from: a */
    public final void mo6424a(View view, int i) {
        C12932j.m33818b(view, "changedView");
        this.f4886a.mo6430a(view, i);
    }

    /* renamed from: a */
    public final void mo6425a(boolean z) {
        this.f4886a.mo6431a(z);
    }
}
