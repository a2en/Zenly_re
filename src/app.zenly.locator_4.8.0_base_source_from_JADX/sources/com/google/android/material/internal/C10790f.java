package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
public final class C10790f {

    /* renamed from: a */
    private final ArrayList<C10792b> f28190a = new ArrayList<>();

    /* renamed from: b */
    private C10792b f28191b = null;

    /* renamed from: c */
    ValueAnimator f28192c = null;

    /* renamed from: d */
    private final AnimatorListener f28193d = new C10791a();

    /* renamed from: com.google.android.material.internal.f$a */
    class C10791a extends AnimatorListenerAdapter {
        C10791a() {
        }

        public void onAnimationEnd(Animator animator) {
            C10790f fVar = C10790f.this;
            if (fVar.f28192c == animator) {
                fVar.f28192c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    static class C10792b {

        /* renamed from: a */
        final int[] f28195a;

        /* renamed from: b */
        final ValueAnimator f28196b;

        C10792b(int[] iArr, ValueAnimator valueAnimator) {
            this.f28195a = iArr;
            this.f28196b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m27767b() {
        ValueAnimator valueAnimator = this.f28192c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28192c = null;
        }
    }

    /* renamed from: a */
    public void mo31250a(int[] iArr, ValueAnimator valueAnimator) {
        C10792b bVar = new C10792b(iArr, valueAnimator);
        valueAnimator.addListener(this.f28193d);
        this.f28190a.add(bVar);
    }

    /* renamed from: a */
    public void mo31249a(int[] iArr) {
        C10792b bVar;
        int size = this.f28190a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = (C10792b) this.f28190a.get(i);
            if (StateSet.stateSetMatches(bVar.f28195a, iArr)) {
                break;
            }
            i++;
        }
        C10792b bVar2 = this.f28191b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m27767b();
            }
            this.f28191b = bVar;
            if (bVar != null) {
                m27766a(bVar);
            }
        }
    }

    /* renamed from: a */
    private void m27766a(C10792b bVar) {
        this.f28192c = bVar.f28196b;
        this.f28192c.start();
    }

    /* renamed from: a */
    public void mo31248a() {
        ValueAnimator valueAnimator = this.f28192c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f28192c = null;
        }
    }
}
