package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: e */
    private int f28124e;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo31205a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f28124e = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f28124e;
    }

    public void setVisibility(int i) {
        mo31205a(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28124e = getVisibility();
    }
}
