package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import p214e.p226c.C7565a;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: e */
    private final int f1316e = getResources().getDimensionPixelOffset(C7565a.browser_actions_context_menu_min_padding);

    /* renamed from: f */
    private final int f1317f = getResources().getDimensionPixelOffset(C7565a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1316e * 2), this.f1317f), 1073741824), i2);
    }
}
