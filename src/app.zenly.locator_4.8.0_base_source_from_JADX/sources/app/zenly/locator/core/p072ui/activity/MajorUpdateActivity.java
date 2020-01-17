package app.zenly.locator.core.p072ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.p072ui.view.ZenWebView;
import app.zenly.locator.core.p072ui.view.ZenWebView.C3135c;
import app.zenly.locator.core.p072ui.view.ZenWebView.ZenWebViewListener;

/* renamed from: app.zenly.locator.core.ui.activity.MajorUpdateActivity */
public class MajorUpdateActivity extends BaseActivity {

    /* renamed from: n */
    private final ZenWebViewListener f8487n = new C3072a();

    /* renamed from: app.zenly.locator.core.ui.activity.MajorUpdateActivity$a */
    class C3072a extends C3135c {
        C3072a() {
        }

        public void askClose(ZenWebView zenWebView) {
            MajorUpdateActivity.this.finish();
        }

        public boolean shouldOverrideUrlLoading(ZenWebView zenWebView, Uri uri) {
            if (!uri.getScheme().equals("market")) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            MajorUpdateActivity.this.startActivity(intent);
            MajorUpdateActivity.this.finish();
            return true;
        }
    }

    /* renamed from: a */
    public static Intent m9610a(Context context, String str) {
        return new Intent(context, MajorUpdateActivity.class).setData(Uri.parse(str));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_major_update);
        Uri data = getIntent().getData();
        ZenWebView zenWebView = (ZenWebView) findViewById(R.id.web_view);
        zenWebView.mo9447a(data != null ? data.toString() : "https://zen.ly/update");
        zenWebView.setZenWebViewListener(this.f8487n);
    }
}
