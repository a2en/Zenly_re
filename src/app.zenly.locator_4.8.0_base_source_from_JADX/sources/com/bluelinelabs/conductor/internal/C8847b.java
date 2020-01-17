package com.bluelinelabs.conductor.internal;

import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeCompletedListener;

/* renamed from: com.bluelinelabs.conductor.internal.b */
public class C8847b extends ControllerChangeHandler {
    /* renamed from: a */
    public void mo23848a(ViewGroup viewGroup, View view, View view2, boolean z, ControllerChangeCompletedListener controllerChangeCompletedListener) {
        controllerChangeCompletedListener.onChangeCompleted();
    }

    /* renamed from: b */
    public ControllerChangeHandler mo12522b() {
        return new C8847b();
    }

    /* renamed from: c */
    public boolean mo23852c() {
        return true;
    }
}
