package app.zenly.locator.p210z.p212c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.report.base.ReportFeedbackController;

/* renamed from: app.zenly.locator.z.c.h */
public final class C6331h extends ReportFeedbackController {
    public C6331h(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.mo7054a(layoutInflater, viewGroup);
        this.f13738U.setTitle((CharSequence) a.getContext().getString(R.string.report_common_feedback_title));
        mo12770a((OnReasonListener) new C6327d(this));
        return a;
    }

    /* renamed from: d */
    public /* synthetic */ void mo14173d(String str) {
        this.f13764R.mo22228c(str);
        mo12767c(new C6329f(mo12757E()));
    }
}
