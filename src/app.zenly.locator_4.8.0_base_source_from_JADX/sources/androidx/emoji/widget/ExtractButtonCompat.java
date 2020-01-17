package androidx.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.C0680h;

public class ExtractButtonCompat extends Button {
    public ExtractButtonCompat(Context context) {
        super(context, null);
    }

    public boolean hasWindowFocus() {
        return isEnabled() && getVisibility() == 0;
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
