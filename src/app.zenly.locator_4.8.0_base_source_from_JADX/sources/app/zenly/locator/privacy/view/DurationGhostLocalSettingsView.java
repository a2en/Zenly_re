package app.zenly.locator.privacy.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.privacy.ICallBackGhostLocalSettings;
import app.zenly.locator.privacy.model.C5081c;
import app.zenly.locator.privacy.model.C5082d;

public class DurationGhostLocalSettingsView extends CustomGhostLocalSettingsView {

    /* renamed from: h */
    private TextView f13206h;

    /* renamed from: i */
    private TextView f13207i;

    /* renamed from: j */
    private TextView f13208j;

    /* renamed from: k */
    private TextView f13209k;

    /* renamed from: l */
    private C5098a f13210l;

    /* renamed from: app.zenly.locator.privacy.view.DurationGhostLocalSettingsView$a */
    public class C5098a extends CountDownTimer {
        public C5098a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            DurationGhostLocalSettingsView.this.mo12367a();
        }

        public void onTick(long j) {
            if (j > 0) {
                DurationGhostLocalSettingsView.this.m14518a(j, false);
                return;
            }
            DurationGhostLocalSettingsView.this.setTitle((int) R.string.settings_ghost_title_frozenexpired);
            ICallBackGhostLocalSettings iCallBackGhostLocalSettings = DurationGhostLocalSettingsView.this.f13204f;
            if (iCallBackGhostLocalSettings != null) {
                iCallBackGhostLocalSettings.setChoice(C5082d.Precise);
            }
            DurationGhostLocalSettingsView.this.mo12367a();
        }
    }

    public DurationGhostLocalSettingsView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public /* synthetic */ void mo12369b(View view) {
        m14519a(view, 28800000);
    }

    /* renamed from: c */
    public /* synthetic */ void mo12370c(View view) {
        m14519a(view, 86400000);
    }

    /* renamed from: d */
    public /* synthetic */ void mo12371d(View view) {
        m14519a(view, 172800000000L);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        mo12367a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo12367a();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        TextView textView = this.f13209k;
        if (textView != null) {
            textView.setEnabled(z);
            this.f13209k.setClickable(z);
        }
        TextView textView2 = this.f13206h;
        if (textView2 != null) {
            textView2.setEnabled(z);
            this.f13206h.setClickable(z);
        }
        TextView textView3 = this.f13207i;
        if (textView3 != null) {
            textView3.setEnabled(z);
            this.f13207i.setClickable(z);
        }
        TextView textView4 = this.f13208j;
        if (textView4 != null) {
            textView4.setEnabled(z);
            this.f13208j.setClickable(z);
        }
    }

    public void setTitleWithTimeStamp(long j) {
        m14518a(j, true);
    }

    public DurationGhostLocalSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private void m14521b() {
        C5098a aVar = this.f13210l;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12363a(AttributeSet attributeSet) {
        this.f13203e = RelativeLayout.inflate(getContext(), R.layout.view_privacy_local_duration, this);
        this.f13205g = (ScreenBar) this.f13203e.findViewById(R.id.gls_screen_bar);
        this.f13206h = (TextView) this.f13203e.findViewById(R.id.gls_tv_two_hours);
        this.f13207i = (TextView) this.f13203e.findViewById(R.id.gls_tv_eight_hours);
        this.f13208j = (TextView) this.f13203e.findViewById(R.id.gls_tv_twenty_four_hours);
        this.f13209k = (TextView) this.f13203e.findViewById(R.id.gls_tv_forever);
        this.f13206h.setText(getContext().getResources().getQuantityString(R.plurals.settings_ghost_alert_label_hours_unif, 2, new Object[]{Integer.valueOf(2)}));
        this.f13207i.setText(getContext().getResources().getQuantityString(R.plurals.settings_ghost_alert_label_hours_unif, 8, new Object[]{Integer.valueOf(8)}));
        this.f13208j.setText(getContext().getResources().getQuantityString(R.plurals.settings_ghost_alert_label_hours_unif, 24, new Object[]{Integer.valueOf(24)}));
        this.f13206h.setOnClickListener(new C5113f(this));
        this.f13207i.setOnClickListener(new C5112e(this));
        this.f13208j.setOnClickListener(new C5111d(this));
        this.f13209k.setOnClickListener(new C5110c(this));
    }

    public DurationGhostLocalSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12368a(View view) {
        m14519a(view, 7200000);
    }

    /* renamed from: a */
    private void m14519a(View view, long j) {
        ICallBackGhostLocalSettings iCallBackGhostLocalSettings = this.f13204f;
        if (iCallBackGhostLocalSettings != null) {
            iCallBackGhostLocalSettings.updateChoice(j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14518a(long j, boolean z) {
        setTitle((CharSequence) getContext().getString(R.string.settings_ghost_title_frozen, new Object[]{C5081c.m14487a(j)}));
        if (z) {
            m14521b();
            m14517a(j);
        }
    }

    /* renamed from: a */
    private void m14517a(long j) {
        if (this.f13205g != null) {
            C5098a aVar = new C5098a(j, 1000);
            this.f13210l = aVar;
            this.f13210l.start();
        }
    }

    /* renamed from: a */
    public void mo12367a() {
        m14521b();
    }
}
