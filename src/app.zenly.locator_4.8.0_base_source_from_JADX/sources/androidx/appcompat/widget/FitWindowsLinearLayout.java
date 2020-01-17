package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;

public class FitWindowsLinearLayout extends LinearLayout implements FitWindowsViewGroup {

    /* renamed from: e */
    private OnFitSystemWindowsListener f914e;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        OnFitSystemWindowsListener onFitSystemWindowsListener = this.f914e;
        if (onFitSystemWindowsListener != null) {
            onFitSystemWindowsListener.onFitSystemWindows(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.f914e = onFitSystemWindowsListener;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
