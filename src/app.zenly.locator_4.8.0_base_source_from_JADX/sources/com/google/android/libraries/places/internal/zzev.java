package com.google.android.libraries.places.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C1085v;

final class zzev extends AnimatorListenerAdapter {
    private final /* synthetic */ View zza;
    private final /* synthetic */ C1085v zzb;
    private final /* synthetic */ ViewPropertyAnimator zzc;
    private final /* synthetic */ zzew zzd;

    zzev(zzew zzew, View view, C1085v vVar, ViewPropertyAnimator viewPropertyAnimator) {
        this.zzd = zzew;
        this.zza = view;
        this.zzb = vVar;
        this.zzc = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        try {
            zzew.zza(this.zza);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        try {
            this.zzc.setListener(null);
            this.zzd.dispatchAddFinished(this.zzb);
            this.zzd.zza.remove(this.zzb);
            this.zzd.zza();
            this.zzc.setStartDelay(0);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void onAnimationStart(Animator animator) {
        try {
            this.zza.setAlpha(0.0f);
            this.zzd.dispatchAddStarting(this.zzb);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
