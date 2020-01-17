package app.zenly.locator.report.base;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8819d.C8828i;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ReportReasonController extends C5341j {

    /* renamed from: U */
    protected ScreenBar f13746U;

    /* renamed from: V */
    private RadioGroup f13747V;

    /* renamed from: W */
    protected View f13748W;

    protected interface OnReasonListener {
        void onReasonSelected(String str);
    }

    public ReportReasonController(Bundle bundle) {
        super(bundle);
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
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_report_reason, viewGroup, false);
        mo23912a(C8828i.RETAIN_DETACH);
        this.f13746U = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        this.f13747V = (RadioGroup) inflate.findViewById(R.id.reason_radio_group);
        this.f13748W = inflate.findViewById(R.id.reason_next_button);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo12767c(C8819d dVar) {
        super.mo12767c(dVar);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12774a(Context context, Map<String, Integer> map, OnReasonListener onReasonListener) {
        LayoutInflater from = LayoutInflater.from(context);
        for (Entry entry : map.entrySet()) {
            RadioButton radioButton = (RadioButton) from.inflate(R.layout.list_item_report_reason, this.f13747V, false);
            radioButton.setText(((Integer) entry.getValue()).intValue());
            radioButton.setOnCheckedChangeListener(new C5337g(onReasonListener, entry));
            this.f13747V.addView(radioButton);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m15132a(OnReasonListener onReasonListener, Entry entry, CompoundButton compoundButton, boolean z) {
        if (z) {
            onReasonListener.onReasonSelected((String) entry.getKey());
        }
    }
}
