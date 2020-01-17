package app.zenly.locator.report.base;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.Map.Entry;

/* renamed from: app.zenly.locator.report.base.g */
/* compiled from: lambda */
public final /* synthetic */ class C5337g implements OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ OnReasonListener f13756a;

    /* renamed from: b */
    private final /* synthetic */ Entry f13757b;

    public /* synthetic */ C5337g(OnReasonListener onReasonListener, Entry entry) {
        this.f13756a = onReasonListener;
        this.f13757b = entry;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ReportReasonController.m15132a(this.f13756a, this.f13757b, compoundButton, z);
    }
}
