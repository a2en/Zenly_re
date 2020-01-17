package app.zenly.locator.report.base;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;
import com.android.volley.toolbox.C8733j;
import com.bluelinelabs.conductor.C8819d;

public abstract class ReportFeedbackController extends C5341j {

    /* renamed from: U */
    protected ScreenBar f13738U;

    /* renamed from: V */
    protected EditText f13739V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public View f13740W;

    /* renamed from: X */
    private View f13741X;

    /* renamed from: Y */
    private View f13742Y;

    protected interface OnReasonListener {
        void onReasonSelected(String str);
    }

    /* renamed from: app.zenly.locator.report.base.ReportFeedbackController$a */
    class C5329a extends C2509b {
        C5329a() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo12773a() {
            ReportFeedbackController.this.mo7192B();
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            ReportFeedbackController.this.m15120a((Runnable) new C5336f(this));
        }
    }

    /* renamed from: app.zenly.locator.report.base.ReportFeedbackController$b */
    class C5330b extends C2509b {

        /* renamed from: g */
        final /* synthetic */ OnReasonListener f13744g;

        C5330b(OnReasonListener onReasonListener) {
            this.f13744g = onReasonListener;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            String trim = ReportFeedbackController.this.f13739V.getText().toString().trim();
            if (trim.length() >= 8) {
                C1297b.m6237a((View) ReportFeedbackController.this.f13739V);
                this.f13744g.onReasonSelected(trim);
                return;
            }
            ReportFeedbackController.this.f13740W.setVisibility(0);
        }
    }

    protected ReportFeedbackController(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: G */
    private void m15117G() {
        C1297b.m6238a((View) this.f13739V, 200);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public /* bridge */ /* synthetic */ Bundle mo12756D() {
        return super.mo12756D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public /* bridge */ /* synthetic */ Bundle mo12757E() {
        return super.mo12757E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo7052b(View view) {
        super.mo7052b(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo12767c(C8819d dVar) {
        super.mo12767c(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo7053d(View view) {
        super.mo7053d(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo12771e(boolean z) {
        int i = 8;
        this.f13741X.setVisibility(z ? 8 : 0);
        View view = this.f13742Y;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.findViewById(R.id.feedback_container).setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_feedback, viewGroup, false);
        this.f13738U = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        this.f13739V = (EditText) inflate.findViewById(R.id.report_feedback_feedback);
        this.f13740W = inflate.findViewById(R.id.report_feedback_error);
        this.f13741X = inflate.findViewById(R.id.report_feedback_next);
        this.f13742Y = inflate.findViewById(R.id.report_feedback_next_progress_bar);
        inflate.findViewById(R.id.report_feedback_previous).setOnClickListener(new C5329a());
        this.f13739V.setFilters(new InputFilter[]{new LengthFilter(C8733j.DEFAULT_IMAGE_TIMEOUT_MS)});
        this.f13739V.requestFocus();
        m15117G();
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12770a(OnReasonListener onReasonListener) {
        this.f13741X.setOnClickListener(new C5330b(onReasonListener));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15120a(Runnable runnable) {
        C1297b.m6237a((View) this.f13739V);
        this.f13739V.postDelayed(runnable, 200);
    }
}
