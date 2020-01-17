package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: e */
    private final C0259k f901e;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f901e = new C0259k(this);
        this.f901e.mo1928a(attributeSet, i);
    }
}
