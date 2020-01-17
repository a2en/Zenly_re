package app.zenly.locator.report.base;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;

/* renamed from: app.zenly.locator.report.base.i */
public abstract class C5339i extends C5341j {

    /* renamed from: U */
    private EmptyView f13760U;

    /* renamed from: app.zenly.locator.report.base.i$a */
    class C5340a extends C2509b {
        C5340a() {
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C5339i.this.mo12781C();
        }
    }

    public C5339i(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract String mo12780G();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_report_completed, viewGroup, false);
        this.f13760U = (EmptyView) inflate.findViewById(R.id.empty_view);
        this.f13760U.setTitle((CharSequence) mo12780G());
        this.f13760U.setOnActionClickListener(new C5340a());
        return inflate;
    }

    public boolean handleBack() {
        mo12781C();
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
