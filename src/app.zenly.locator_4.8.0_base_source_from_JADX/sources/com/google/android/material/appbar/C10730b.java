package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C10793g;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12072g;

/* renamed from: com.google.android.material.appbar.b */
class C10730b {

    /* renamed from: a */
    private static final int[] f27882a = {16843848};

    /* renamed from: a */
    static void m27349a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m27351a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray c = C10793g.m27778c(context, attributeSet, f27882a, i, i2, new int[0]);
        try {
            if (c.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, c.getResourceId(0, 0)));
            }
        } finally {
            c.recycle();
        }
    }

    /* renamed from: a */
    static void m27350a(View view, float f) {
        int integer = view.getResources().getInteger(C12072g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String str = "elevation";
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C12067b.state_liftable, -C12067b.state_lifted}, ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, str, new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
