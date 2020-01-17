package com.bluelinelabs.conductor.changehandler;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeCompletedListener;

/* renamed from: com.bluelinelabs.conductor.changehandler.d */
public class C8817d extends ControllerChangeHandler implements OnAttachStateChangeListener {

    /* renamed from: h */
    private boolean f22863h;

    /* renamed from: i */
    private boolean f22864i;

    /* renamed from: j */
    private ViewGroup f22865j;

    /* renamed from: k */
    private ControllerChangeCompletedListener f22866k;

    public C8817d() {
        this(true);
    }

    /* renamed from: a */
    public void mo23847a(Bundle bundle) {
        super.mo23847a(bundle);
        this.f22863h = bundle.getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }

    /* renamed from: b */
    public void mo23851b(Bundle bundle) {
        super.mo23851b(bundle);
        bundle.putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.f22863h);
    }

    /* renamed from: c */
    public boolean mo23852c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo23853d() {
        return this.f22863h;
    }

    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        ControllerChangeCompletedListener controllerChangeCompletedListener = this.f22866k;
        if (controllerChangeCompletedListener != null) {
            controllerChangeCompletedListener.onChangeCompleted();
            this.f22866k = null;
            this.f22865j = null;
        }
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public C8817d(boolean z) {
        this.f22863h = z;
    }

    /* renamed from: a */
    public void mo23849a(ControllerChangeHandler controllerChangeHandler, C8819d dVar) {
        super.mo23849a(controllerChangeHandler, dVar);
        this.f22864i = true;
    }

    /* renamed from: b */
    public ControllerChangeHandler mo12522b() {
        return new C8817d(mo23853d());
    }

    /* renamed from: a */
    public void mo23846a() {
        ControllerChangeCompletedListener controllerChangeCompletedListener = this.f22866k;
        if (controllerChangeCompletedListener != null) {
            controllerChangeCompletedListener.onChangeCompleted();
            this.f22866k = null;
            this.f22865j.removeOnAttachStateChangeListener(this);
            this.f22865j = null;
        }
    }

    /* renamed from: a */
    public void mo23848a(ViewGroup viewGroup, View view, View view2, boolean z, ControllerChangeCompletedListener controllerChangeCompletedListener) {
        if (!this.f22864i) {
            if (view != null && (!z || this.f22863h)) {
                viewGroup.removeView(view);
            }
            if (view2 != null && view2.getParent() == null) {
                viewGroup.addView(view2);
            }
        }
        if (viewGroup.getWindowToken() != null) {
            controllerChangeCompletedListener.onChangeCompleted();
            return;
        }
        this.f22866k = controllerChangeCompletedListener;
        this.f22865j = viewGroup;
        viewGroup.addOnAttachStateChangeListener(this);
    }
}
