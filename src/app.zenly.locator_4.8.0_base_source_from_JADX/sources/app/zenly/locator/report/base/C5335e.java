package app.zenly.locator.report.base;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: app.zenly.locator.report.base.e */
/* compiled from: lambda */
public final /* synthetic */ class C5335e implements OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ ReportBlockController f13753a;

    /* renamed from: b */
    private final /* synthetic */ Callback f13754b;

    public /* synthetic */ C5335e(ReportBlockController reportBlockController, Callback callback) {
        this.f13753a = reportBlockController;
        this.f13754b = callback;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f13753a.mo12766a(this.f13754b, radioGroup, i);
    }
}
