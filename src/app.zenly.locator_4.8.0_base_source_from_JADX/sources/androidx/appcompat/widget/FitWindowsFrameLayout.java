package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;

public class FitWindowsFrameLayout extends FrameLayout implements FitWindowsViewGroup {

    /* renamed from: e */
    private OnFitSystemWindowsListener f913e;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        OnFitSystemWindowsListener onFitSystemWindowsListener = this.f913e;
        if (onFitSystemWindowsListener != null) {
            onFitSystemWindowsListener.onFitSystemWindows(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.f913e = onFitSystemWindowsListener;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
