package app.zenly.locator.p143s.p162w;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.p072ui.view.ZenWebView;
import app.zenly.locator.core.p072ui.view.ZenWebView.C3135c;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.w.b */
public final class C5566b extends ZenlyController {

    /* renamed from: Q */
    public static final C5567a f14227Q = new C5567a(null);

    /* renamed from: P */
    private ZenWebView f14228P;

    /* renamed from: app.zenly.locator.s.w.b$a */
    public static final class C5567a {
        private C5567a() {
        }

        /* renamed from: a */
        public final C5566b mo13178a(String str) {
            C12932j.m33818b(str, "url");
            Bundle bundle = new Bundle();
            bundle.putString("url_key", str);
            return new C5566b(bundle);
        }

        public /* synthetic */ C5567a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.s.w.b$b */
    public static final class C5568b extends C3135c {

        /* renamed from: a */
        final /* synthetic */ C5566b f14229a;

        C5568b(C5566b bVar) {
            this.f14229a = bVar;
        }

        public void askClose(ZenWebView zenWebView) {
            C12932j.m33818b(zenWebView, "zenWebView");
            this.f14229a.mo23946k().mo24014n();
        }

        public boolean shouldOverrideUrlLoading(ZenWebView zenWebView, Uri uri) {
            C12932j.m33818b(zenWebView, "zenWebView");
            C12932j.m33818b(uri, "uri");
            if (!C12932j.m33817a((Object) uri.getScheme(), (Object) "market")) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            this.f14229a.mo23902a(intent);
            return true;
        }
    }

    public C5566b(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
    }

    /* renamed from: d */
    public static final C5566b m15759d(String str) {
        return f14227Q.mo13178a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        ZenWebView zenWebView = new ZenWebView(layoutInflater.getContext());
        zenWebView.setZenWebViewListener(new C5568b(this));
        zenWebView.mo9447a(mo23933c().getString("url_key", ""));
        this.f14228P = zenWebView;
        ZenWebView zenWebView2 = this.f14228P;
        if (zenWebView2 != null) {
            return zenWebView2;
        }
        C12932j.m33820c("webView");
        throw null;
    }

    public boolean handleBack() {
        ZenWebView zenWebView = this.f14228P;
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
        ZenWebView zenWebView = this.f14228P;
        if (zenWebView != null) {
            zenWebView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            C12932j.m33820c("webView");
            throw null;
        }
    }
}
