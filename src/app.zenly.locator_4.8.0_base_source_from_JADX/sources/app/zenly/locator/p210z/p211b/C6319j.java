package app.zenly.locator.p210z.p211b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.report.base.ReportFeedbackController;

/* renamed from: app.zenly.locator.z.b.j */
public final class C6319j extends ReportFeedbackController {
    public C6319j(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.mo7054a(layoutInflater, viewGroup);
        this.f13738U.setTitle((CharSequence) a.getContext().getString(R.string.report_common_feedback_title));
        mo12770a((OnReasonListener) new C6315f(this));
        return a;
    }

    /* renamed from: d */
    public /* synthetic */ void mo14168d(String str) {
        this.f13765S.mo22155e(str);
        mo12767c(new C6317h(mo12756D()));
    }
}
