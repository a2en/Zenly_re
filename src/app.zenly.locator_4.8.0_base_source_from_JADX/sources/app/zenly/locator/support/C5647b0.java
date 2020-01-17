package app.zenly.locator.support;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.p072ui.view.ZenWebView;
import app.zenly.locator.core.p072ui.view.ZenWebView.ZenWebViewListener;
import kotlin.jvm.internal.C12932j;
import kotlin.text.C13013g;

/* renamed from: app.zenly.locator.support.b0 */
public final class C5647b0 extends ZenlyController {
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final C13013g f14400R = new C13013g("https://community\\.zen\\.ly/hc/.*/articles/([^-]*)(-.*)?$");

    /* renamed from: S */
    public static final C5648a f14401S = new C5648a(null);

    /* renamed from: P */
    private ZenWebView f14402P;

    /* renamed from: Q */
    private final C5649b f14403Q = new C5649b(this);

    /* renamed from: app.zenly.locator.support.b0$a */
    public static final class C5648a {
        private C5648a() {
        }

        /* renamed from: a */
        public final C5647b0 mo13282a(String str) {
            C12932j.m33818b(str, "url");
            Bundle bundle = new Bundle();
            bundle.putString("key:url", str);
            return new C5647b0(bundle);
        }

        public /* synthetic */ C5648a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.b0$b */
    public static final class C5649b implements ZenWebViewListener {

        /* renamed from: a */
        final /* synthetic */ C5647b0 f14404a;

        C5649b(C5647b0 b0Var) {
            this.f14404a = b0Var;
        }

        public void askClose(ZenWebView zenWebView) {
            C12932j.m33818b(zenWebView, "zenWebView");
            this.f14404a.mo23946k().mo24014n();
        }

        public void onPageStarted(ZenWebView zenWebView, String str, Bitmap bitmap) {
            C12932j.m33818b(zenWebView, "zenWebView");
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(app.zenly.locator.core.p072ui.view.ZenWebView r5, android.net.Uri r6) {
            /*
                r4 = this;
                java.lang.String r0 = "zenWebView"
                kotlin.jvm.internal.C12932j.m33818b(r5, r0)
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.C12932j.m33818b(r6, r0)
                java.lang.String r6 = r6.getPath()
                java.lang.String r0 = "/hc/share"
                boolean r6 = kotlin.jvm.internal.C12932j.m33817a(r0, r6)
                r0 = 0
                if (r6 == 0) goto L_0x005a
                kotlin.text.g r6 = app.zenly.locator.support.C5647b0.f14400R
                java.lang.String r1 = r5.getUrl()
                java.lang.String r2 = "zenWebView.url"
                kotlin.jvm.internal.C12932j.m33815a(r1, r2)
                r2 = 2
                r3 = 0
                kotlin.text.MatchResult r6 = kotlin.text.C13013g.m33960a(r6, r1, r0, r2, r3)
                r1 = 1
                if (r6 == 0) goto L_0x003a
                java.util.List r6 = r6.getGroupValues()
                if (r6 == 0) goto L_0x003a
                java.lang.Object r6 = r6.get(r1)
                java.lang.String r6 = (java.lang.String) r6
                goto L_0x003b
            L_0x003a:
                r6 = r3
            L_0x003b:
                if (r6 == 0) goto L_0x0044
                app.zenly.locator.s.a r2 = app.zenly.locator.p143s.C5343a.m15160U()
                r2.mo12874d(r6)
            L_0x0044:
                java.lang.String r5 = r5.getUrl()
                android.content.Intent r5 = app.zenly.locator.core.util.C3236s.m10262b(r5)
                app.zenly.locator.support.b0 r6 = r4.f14404a
                android.app.Activity r6 = r6.mo23920b()
                android.content.Intent[] r2 = new android.content.Intent[r1]
                r2[r0] = r5
                app.zenly.locator.core.util.C3236s.m10261a(r6, r3, r2)
                return r1
            L_0x005a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5647b0.C5649b.shouldOverrideUrlLoading(app.zenly.locator.core.ui.view.ZenWebView, android.net.Uri):boolean");
        }
    }

    public C5647b0(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        ZenWebView zenWebView = new ZenWebView(layoutInflater.getContext());
        zenWebView.setClipToPadding(false);
        zenWebView.setZenWebViewListener(this.f14403Q);
        zenWebView.mo9447a(mo23933c().getString("key:url"));
        WebSettings settings = zenWebView.getSettings();
        C12932j.m33815a((Object) settings, "settings");
        String userAgentString = settings.getUserAgentString();
        StringBuilder sb = new StringBuilder();
        sb.append(userAgentString);
        sb.append(" Zenly/4.8.0");
        settings.setUserAgentString(sb.toString());
        this.f14402P = zenWebView;
        ZenWebView zenWebView2 = this.f14402P;
        if (zenWebView2 != null) {
            return zenWebView2;
        }
        C12932j.m33820c("webView");
        throw null;
    }

    public boolean handleBack() {
        ZenWebView zenWebView = this.f14402P;
        if (zenWebView != null) {
            return zenWebView.mo9448a();
        }
        C12932j.m33820c("webView");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
