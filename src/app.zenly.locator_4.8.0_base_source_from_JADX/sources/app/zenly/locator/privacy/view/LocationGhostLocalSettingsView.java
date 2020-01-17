package app.zenly.locator.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.privacy.ICallBackGhostLocalSettings;
import app.zenly.locator.privacy.model.C5082d;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

public class LocationGhostLocalSettingsView extends CustomGhostLocalSettingsView {

    /* renamed from: h */
    private View f13227h;

    /* renamed from: i */
    private View f13228i;

    /* renamed from: j */
    private View f13229j;

    /* renamed from: k */
    private C5082d f13230k = null;

    /* renamed from: app.zenly.locator.privacy.view.LocationGhostLocalSettingsView$a */
    static /* synthetic */ class C5105a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13231a = new int[C5082d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.privacy.model.d[] r0 = app.zenly.locator.privacy.model.C5082d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13231a = r0
                int[] r0 = f13231a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Precise     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13231a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Blurred     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13231a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Frozen     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.privacy.view.LocationGhostLocalSettingsView.C5105a.<clinit>():void");
        }
    }

    public LocationGhostLocalSettingsView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12363a(AttributeSet attributeSet) {
        this.f13203e = RelativeLayout.inflate(getContext(), R.layout.view_privacy_local_location, this);
        this.f13205g = (ScreenBar) this.f13203e.findViewById(R.id.gls_screen_bar);
        this.f13227h = this.f13203e.findViewById(R.id.gls_area_precise);
        this.f13228i = this.f13203e.findViewById(R.id.gls_area_blurred);
        this.f13229j = this.f13203e.findViewById(R.id.gls_area_frozen);
        this.f13227h.setOnClickListener(new C5114g(this));
        this.f13228i.setOnClickListener(new C5115h(this));
        this.f13229j.setOnClickListener(new C5116i(this));
        m14540a(this.f13227h, C5082d.Precise);
        m14540a(this.f13228i, C5082d.Blurred);
        m14540a(this.f13229j, C5082d.Frozen);
    }

    /* renamed from: b */
    public /* synthetic */ void mo12389b(View view) {
        m14542b(C5082d.Blurred);
    }

    /* renamed from: c */
    public /* synthetic */ void mo12390c(View view) {
        m14542b(C5082d.Frozen);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        View view = this.f13227h;
        if (view != null) {
            view.setEnabled(z);
            this.f13227h.setClickable(z);
        }
        View view2 = this.f13228i;
        if (view2 != null) {
            view2.setEnabled(z);
            this.f13228i.setClickable(z);
        }
        View view3 = this.f13229j;
        if (view3 != null) {
            view3.setEnabled(z);
            this.f13229j.setClickable(z);
        }
    }

    public void setPrivacyPrecision(C5082d dVar) {
        mo12388a(dVar, false);
    }

    public void setTitleWithUserName(String str) {
        setTitle((CharSequence) getContext().getString(R.string.ghostMode_changeWhatXCanSee, new Object[]{str}));
    }

    /* renamed from: b */
    private void m14542b(C5082d dVar) {
        mo12388a(dVar, true);
    }

    public LocationGhostLocalSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocationGhostLocalSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12386a(View view) {
        m14542b(C5082d.Precise);
    }

    /* renamed from: a */
    private void m14540a(View view, C5082d dVar) {
        ((TextView) view.findViewById(R.id.title)).setText(dVar.f13159f);
        ((TextView) view.findViewById(R.id.subtitle)).setText(dVar.f13160g);
        ((ImageView) view.findViewById(R.id.image)).setImageResource(dVar.f13158e);
        TextView textView = (TextView) view.findViewById(R.id.description);
        if (C7674a.m18692a(dVar.f13161h)) {
            textView.setVisibility(0);
            textView.setText(dVar.f13161h);
            return;
        }
        textView.setVisibility(8);
        textView.setText(null);
    }

    /* renamed from: a */
    private void m14541a(View view, boolean z) {
        ((CheckBox) view.findViewById(R.id.check_box)).setChecked(z);
    }

    /* renamed from: a */
    public void mo12388a(C5082d dVar, boolean z) {
        int i = C5105a.f13231a[dVar.ordinal()];
        if (i == 1) {
            m14541a(this.f13227h, true);
            m14541a(this.f13228i, false);
            m14541a(this.f13229j, false);
        } else if (i == 2) {
            m14541a(this.f13227h, false);
            m14541a(this.f13228i, true);
            m14541a(this.f13229j, false);
        } else if (i == 3 && this.f13230k == null) {
            m14541a(this.f13227h, false);
            m14541a(this.f13228i, false);
            m14541a(this.f13229j, true);
        }
        this.f13230k = dVar;
        ICallBackGhostLocalSettings iCallBackGhostLocalSettings = this.f13204f;
        if (iCallBackGhostLocalSettings != null && z) {
            iCallBackGhostLocalSettings.updateChoice(dVar);
        }
    }

    /* renamed from: a */
    public void mo12387a(C5082d dVar) {
        if (this.f13230k == null) {
            mo12388a(dVar, false);
        }
    }
}
