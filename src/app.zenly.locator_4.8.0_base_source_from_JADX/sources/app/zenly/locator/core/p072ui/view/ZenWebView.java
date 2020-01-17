package app.zenly.locator.core.p072ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.zenly.locator.R;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.core.ui.view.ZenWebView */
public class ZenWebView extends FrameLayout implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WebView f8681e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f8682f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ProgressBar f8683g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f8684h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Handler f8685i = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ZenWebViewListener f8686j;

    /* renamed from: app.zenly.locator.core.ui.view.ZenWebView$ZenWebViewListener */
    public interface ZenWebViewListener {
        void askClose(ZenWebView zenWebView);

        void onPageStarted(ZenWebView zenWebView, String str, Bitmap bitmap);

        boolean shouldOverrideUrlLoading(ZenWebView zenWebView, Uri uri);
    }

    /* renamed from: app.zenly.locator.core.ui.view.ZenWebView$a */
    class C3133a extends WebViewClient {
        C3133a() {
        }

        /* renamed from: a */
        private void m9856a(WebView webView, int i, String str, String str2) {
            ZenWebView.this.f8684h = true;
            ZenWebView.this.f8681e.setVisibility(8);
            ZenWebView.this.f8682f.setText(ZenWebView.this.getResources().getString(R.string.settings_webview_error_pagenotloading));
            ZenWebView.this.f8682f.setVisibility(0);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ZenWebView.this.f8683g.setVisibility(8);
            if (!ZenWebView.this.f8684h) {
                ZenWebView.this.f8681e.setVisibility(0);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (ZenWebView.this.f8681e.canGoBack() && ZenWebView.this.f8686j != null) {
                ZenWebView.this.f8686j.onPageStarted(ZenWebView.this, str, bitmap);
            }
            ZenWebView.this.f8684h = false;
            ZenWebView.this.f8682f.setVisibility(8);
            ZenWebView.this.f8683g.setVisibility(0);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (VERSION.SDK_INT < 23) {
                m9856a(webView, i, str, str2);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return m9857a(webResourceRequest.getUrl());
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (VERSION.SDK_INT >= 23 && webResourceRequest.isForMainFrame()) {
                m9856a(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
        }

        /* renamed from: a */
        private boolean m9857a(Uri uri) {
            if (ZenWebView.this.f8686j != null) {
                return ZenWebView.this.f8686j.shouldOverrideUrlLoading(ZenWebView.this, uri);
            }
            return false;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.ZenWebView$b */
    public class C3134b {
        public C3134b() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo9460a() {
            if (ZenWebView.this.f8686j != null) {
                ZenWebView.this.f8686j.askClose(ZenWebView.this);
            }
        }

        @JavascriptInterface
        public void dismissWebView() {
            ZenWebView.this.f8685i.post(new C3136a(this));
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.ZenWebView$c */
    public static abstract class C3135c implements ZenWebViewListener {
        public void onPageStarted(ZenWebView zenWebView, String str, Bitmap bitmap) {
        }

        public boolean shouldOverrideUrlLoading(ZenWebView zenWebView, Uri uri) {
            return false;
        }
    }

    public ZenWebView(Context context) {
        super(context);
        mo9446a(context, null, 0, 0);
    }

    public WebSettings getSettings() {
        return this.f8681e.getSettings();
    }

    public String getUrl() {
        return this.f8681e.getUrl();
    }

    public void onClick(View view) {
        this.f8681e.reload();
    }

    public void setZenWebViewListener(ZenWebViewListener zenWebViewListener) {
        this.f8686j = zenWebViewListener;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public void mo9446a(Context context, AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(context).inflate(R.layout.view_zenwebview, this, true);
        setBackgroundColor(C7678c.m18702a(context, (int) R.attr.zenlyColorBackground));
        this.f8681e = (WebView) findViewById(R.id.webview);
        this.f8683g = (ProgressBar) findViewById(R.id.circularProgressView);
        this.f8682f = (TextView) findViewById(R.id.error_message);
        this.f8682f.setOnClickListener(this);
        this.f8681e.setWebViewClient(new C3133a());
        this.f8681e.getSettings().setDomStorageEnabled(true);
        this.f8681e.getSettings().setJavaScriptEnabled(true);
        this.f8681e.addJavascriptInterface(new C3134b(), "Zenly");
    }

    public ZenWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo9446a(context, attributeSet, 0, 0);
    }

    public ZenWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo9446a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    public void mo9447a(String str) {
        this.f8681e.loadUrl(str);
    }

    /* renamed from: a */
    public boolean mo9448a() {
        if (!this.f8681e.canGoBack()) {
            return false;
        }
        this.f8681e.goBack();
        return true;
    }
}
