package com.airbnb.lottie.p289q;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.q.a */
public abstract class C8651a extends ValueAnimator {

    /* renamed from: e */
    private final Set<AnimatorUpdateListener> f22213e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private final Set<AnimatorListener> f22214f = new CopyOnWriteArraySet();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23245a(boolean z) {
        for (AnimatorListener animatorListener : this.f22214f) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void addListener(AnimatorListener animatorListener) {
        this.f22214f.add(animatorListener);
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f22213e.add(animatorUpdateListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23249b(boolean z) {
        for (AnimatorListener animatorListener : this.f22214f) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo23250c() {
        for (AnimatorUpdateListener onAnimationUpdate : this.f22213e) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f22214f.clear();
    }

    public void removeAllUpdateListeners() {
        this.f22213e.clear();
    }

    public void removeListener(AnimatorListener animatorListener) {
        this.f22214f.remove(animatorListener);
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f22213e.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23244a() {
        for (AnimatorListener onAnimationCancel : this.f22214f) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23248b() {
        for (AnimatorListener onAnimationRepeat : this.f22214f) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }
}
