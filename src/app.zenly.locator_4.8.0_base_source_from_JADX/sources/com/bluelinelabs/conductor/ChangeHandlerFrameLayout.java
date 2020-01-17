package com.bluelinelabs.conductor;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeListener;

public class ChangeHandlerFrameLayout extends FrameLayout implements ControllerChangeListener {

    /* renamed from: e */
    private int f22818e;

    public ChangeHandlerFrameLayout(Context context) {
        super(context);
    }

    public void onChangeCompleted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler) {
        this.f22818e--;
    }

    public void onChangeStarted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler) {
        this.f22818e++;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f22818e > 0 || super.onInterceptTouchEvent(motionEvent);
    }

    public ChangeHandlerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChangeHandlerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public ChangeHandlerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
