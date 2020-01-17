package androidx.core.view;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: androidx.core.view.i */
public final class C0647i implements OnPreDrawListener, OnAttachStateChangeListener {

    /* renamed from: e */
    private final View f2818e;

    /* renamed from: f */
    private ViewTreeObserver f2819f;

    /* renamed from: g */
    private final Runnable f2820g;

    private C0647i(View view, Runnable runnable) {
        this.f2818e = view;
        this.f2819f = view.getViewTreeObserver();
        this.f2820g = runnable;
    }

    /* renamed from: a */
    public static C0647i m3033a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C0647i iVar = new C0647i(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(iVar);
            view.addOnAttachStateChangeListener(iVar);
            return iVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        mo3410a();
        this.f2820g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2819f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo3410a();
    }

    /* renamed from: a */
    public void mo3410a() {
        if (this.f2819f.isAlive()) {
            this.f2819f.removeOnPreDrawListener(this);
        } else {
            this.f2818e.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2818e.removeOnAttachStateChangeListener(this);
    }
}
