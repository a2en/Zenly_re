package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.n */
public final class C0661n {

    /* renamed from: a */
    private WeakReference<View> f2831a;

    /* renamed from: b */
    Runnable f2832b = null;

    /* renamed from: c */
    Runnable f2833c = null;

    /* renamed from: d */
    int f2834d = -1;

    /* renamed from: androidx.core.view.n$a */
    class C0662a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewPropertyAnimatorListener f2835a;

        /* renamed from: b */
        final /* synthetic */ View f2836b;

        C0662a(C0661n nVar, ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            this.f2835a = viewPropertyAnimatorListener;
            this.f2836b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2835a.onAnimationCancel(this.f2836b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2835a.onAnimationEnd(this.f2836b);
        }

        public void onAnimationStart(Animator animator) {
            this.f2835a.onAnimationStart(this.f2836b);
        }
    }

    /* renamed from: androidx.core.view.n$b */
    class C0663b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ViewPropertyAnimatorUpdateListener f2837a;

        /* renamed from: b */
        final /* synthetic */ View f2838b;

        C0663b(C0661n nVar, ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
            this.f2837a = viewPropertyAnimatorUpdateListener;
            this.f2838b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2837a.onAnimationUpdate(this.f2838b);
        }
    }

    /* renamed from: androidx.core.view.n$c */
    static class C0664c implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        C0661n f2839a;

        /* renamed from: b */
        boolean f2840b;

        C0664c(C0661n nVar) {
            this.f2839a = nVar;
        }

        public void onAnimationCancel(View view) {
            Object tag = view.getTag(2113929216);
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof ViewPropertyAnimatorListener ? (ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationCancel(view);
            }
        }

        @SuppressLint({"WrongConstant"})
        public void onAnimationEnd(View view) {
            int i = this.f2839a.f2834d;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f2839a.f2834d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f2840b) {
                C0661n nVar = this.f2839a;
                Runnable runnable = nVar.f2833c;
                if (runnable != null) {
                    nVar.f2833c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof ViewPropertyAnimatorListener) {
                    viewPropertyAnimatorListener = (ViewPropertyAnimatorListener) tag;
                }
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }
                this.f2840b = true;
            }
        }

        public void onAnimationStart(View view) {
            this.f2840b = false;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = null;
            if (this.f2839a.f2834d > -1) {
                view.setLayerType(2, null);
            }
            C0661n nVar = this.f2839a;
            Runnable runnable = nVar.f2832b;
            if (runnable != null) {
                nVar.f2832b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof ViewPropertyAnimatorListener) {
                viewPropertyAnimatorListener = (ViewPropertyAnimatorListener) tag;
            }
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(view);
            }
        }
    }

    C0661n(View view) {
        this.f2831a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C0661n mo3428a(long j) {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: b */
    public long mo3433b() {
        View view = (View) this.f2831a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: c */
    public C0661n mo3436c(float f) {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0661n mo3427a(float f) {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0661n mo3435b(long j) {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void mo3437c() {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public C0661n mo3429a(Interpolator interpolator) {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0661n mo3434b(float f) {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    /* renamed from: a */
    public void mo3432a() {
        View view = (View) this.f2831a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public C0661n mo3430a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.f2831a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m3069a(view, viewPropertyAnimatorListener);
            } else {
                view.setTag(2113929216, viewPropertyAnimatorListener);
                m3069a(view, new C0664c(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m3069a(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new C0662a(this, viewPropertyAnimatorListener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0661n mo3431a(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        View view = (View) this.f2831a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C0663b bVar = null;
            if (viewPropertyAnimatorUpdateListener != null) {
                bVar = new C0663b(this, viewPropertyAnimatorUpdateListener, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }
}
