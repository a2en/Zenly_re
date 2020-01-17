package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.f */
class C11869f implements OnPreDrawListener {

    /* renamed from: e */
    final C11892t f30743e;

    /* renamed from: f */
    final WeakReference<ImageView> f30744f;

    /* renamed from: g */
    Callback f30745g;

    C11869f(C11892t tVar, ImageView imageView, Callback callback) {
        this.f30743e = tVar;
        this.f30744f = new WeakReference<>(imageView);
        this.f30745g = callback;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35094a() {
        this.f30745g = null;
        ImageView imageView = (ImageView) this.f30744f.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f30744f.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            C11892t tVar = this.f30743e;
            tVar.mo35164e();
            tVar.mo35156a(width, height);
            tVar.mo35159a(imageView, this.f30745g);
        }
        return true;
    }
}
