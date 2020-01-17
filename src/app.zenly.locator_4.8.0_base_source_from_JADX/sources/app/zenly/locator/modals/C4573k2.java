package app.zenly.locator.modals;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.core.p072ui.view.ZenWebView;
import app.zenly.locator.core.p072ui.view.ZenWebView.C3135c;
import app.zenly.locator.core.p072ui.view.ZenWebView.ZenWebViewListener;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.modals.p121o2.C4644c;

/* renamed from: app.zenly.locator.modals.k2 */
public class C4573k2 extends ModalController {

    /* renamed from: Q */
    private String f12203Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f12204R;

    /* renamed from: S */
    private ZenWebView f12205S;

    /* renamed from: T */
    private final ZenWebViewListener f12206T;

    /* renamed from: app.zenly.locator.modals.k2$a */
    class C4574a extends C3135c {
        C4574a() {
        }

        public void askClose(ZenWebView zenWebView) {
            try {
                C4573k2.this.mo7192B();
            } catch (Exception unused) {
            }
        }

        public void onPageStarted(ZenWebView zenWebView, String str, Bitmap bitmap) {
            if (C4573k2.this.f12204R) {
                try {
                    C4573k2.this.mo7192B();
                } catch (Exception unused) {
                }
            }
        }
    }

    public C4573k2(String str, boolean z) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("url_key", str);
        dVar.mo9612a("close_on_url_change", z);
        this(dVar.mo9605a());
    }

    /* renamed from: b */
    public C4644c m13410b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean handleBack() {
        return this.f12205S.mo9448a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f12205S = new ZenWebView(layoutInflater.getContext());
        this.f12205S.mo9447a(this.f12203Q);
        this.f12205S.setZenWebViewListener(this.f12206T);
        return this.f12205S;
    }

    public C4573k2(Bundle bundle) {
        super(bundle);
        this.f12206T = new C4574a();
        this.f12203Q = bundle.getString("url_key", "");
        this.f12204R = bundle.getBoolean("close_on_url_change", false);
    }
}
