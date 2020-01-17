package app.zenly.locator.report.base;

import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;

/* renamed from: app.zenly.locator.report.base.h */
class C5338h extends C2509b {

    /* renamed from: g */
    final /* synthetic */ Callback f13758g;

    /* renamed from: h */
    final /* synthetic */ int f13759h;

    C5338h(ReportBlockController reportBlockController, Callback callback, int i) {
        this.f13758g = callback;
        this.f13759h = i;
    }

    /* renamed from: a */
    public void mo7322a(View view) {
        this.f13758g.onBlockChanged(this.f13759h == R.id.report_block_do_block);
    }
}
