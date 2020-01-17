package app.zenly.locator.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.privacy.ICallBackGhostLocalSettings;

public abstract class CustomGhostLocalSettingsView extends RelativeLayout {

    /* renamed from: e */
    protected View f13203e;

    /* renamed from: f */
    protected ICallBackGhostLocalSettings f13204f;

    /* renamed from: g */
    protected ScreenBar f13205g;

    public CustomGhostLocalSettingsView(Context context) {
        super(context);
        mo12363a(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12363a(AttributeSet attributeSet);

    public void setCallback(ICallBackGhostLocalSettings iCallBackGhostLocalSettings) {
        this.f13204f = iCallBackGhostLocalSettings;
    }

    /* access modifiers changed from: protected */
    public void setTitle(CharSequence charSequence) {
        ScreenBar screenBar = this.f13205g;
        if (screenBar != null) {
            screenBar.setTitle(charSequence);
        }
    }

    public CustomGhostLocalSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo12363a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void setTitle(int i) {
        ScreenBar screenBar = this.f13205g;
        if (screenBar != null) {
            screenBar.setTitle(i);
        }
    }

    public CustomGhostLocalSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo12363a(attributeSet);
    }
}
