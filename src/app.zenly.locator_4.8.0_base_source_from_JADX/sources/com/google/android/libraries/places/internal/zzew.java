package com.google.android.libraries.places.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.C1101f;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.google.android.libraries.places.C10720R;
import java.util.ArrayList;
import p214e.p244l.p245a.p246a.C7643b;

@TargetApi(14)
public final class zzew extends C1101f {
    final ArrayList<C1085v> zza = new ArrayList<>();
    private final ArrayList<C1085v> zzb = new ArrayList<>();
    private final ArrayList<C1085v> zzc = new ArrayList<>();
    private final int zzd;

    public zzew(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(C10720R.dimen.places_autocomplete_vertical_dropdown);
    }

    /* access modifiers changed from: private */
    public final void zza() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public final boolean animateAdd(C1085v vVar) {
        try {
            endAnimation(vVar);
            ViewCompat.m2815a(vVar.itemView, 0.0f);
            if (!(vVar instanceof zzex) || !((zzex) vVar).zzb()) {
                this.zzc.add(vVar);
                return true;
            }
            this.zzb.add(vVar);
            return true;
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void endAnimation(C1085v vVar) {
        try {
            super.endAnimation(vVar);
            View view = vVar.itemView;
            if (this.zzb.remove(vVar)) {
                zza(view);
                dispatchAddFinished(vVar);
            }
            zza();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void endAnimations() {
        try {
            for (int size = this.zzb.size() - 1; size >= 0; size--) {
                C1085v vVar = (C1085v) this.zzb.get(size);
                zza(vVar.itemView);
                dispatchAddFinished(vVar);
                this.zzb.remove(size);
            }
            ArrayList<C1085v> arrayList = this.zza;
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((C1085v) arrayList.get(size2)).itemView.animate().cancel();
            }
            super.endAnimations();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final boolean isRunning() {
        try {
            return super.isRunning() || !this.zzb.isEmpty() || !this.zza.isEmpty();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void runPendingAnimations() {
        try {
            ArrayList<C1085v> arrayList = this.zzc;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                super.animateAdd((C1085v) obj);
            }
            this.zzc.clear();
            super.runPendingAnimations();
            if (!this.zzb.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(this.zzb);
                this.zzb.clear();
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    C1085v vVar = (C1085v) obj2;
                    View view = vVar.itemView;
                    this.zza.add(vVar);
                    long moveDuration = getMoveDuration();
                    if (vVar instanceof zzex) {
                        moveDuration += (long) (((zzex) vVar).zza() * 67);
                    }
                    view.setTranslationY((float) (-this.zzd));
                    view.setAlpha(0.0f);
                    ViewPropertyAnimator animate = view.animate();
                    animate.cancel();
                    animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new C7643b()).setStartDelay(moveDuration);
                    animate.setListener(new zzev(this, view, vVar, animate)).start();
                }
            }
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public static void zza(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }
}
