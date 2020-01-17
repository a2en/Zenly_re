package com.wonderkiln.camerakit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.wonderkiln.camerakit.p332t.C11996a;
import com.wonderkiln.camerakit.p332t.C11997b;

public class FocusMarkerLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public FrameLayout f31162e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f31163f;

    /* renamed from: com.wonderkiln.camerakit.FocusMarkerLayout$a */
    class C11954a extends AnimatorListenerAdapter {
        C11954a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FocusMarkerLayout.this.f31162e.animate().alpha(0.0f).setStartDelay(750).setDuration(800).setListener(null).start();
        }
    }

    /* renamed from: com.wonderkiln.camerakit.FocusMarkerLayout$b */
    class C11955b extends AnimatorListenerAdapter {
        C11955b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FocusMarkerLayout.this.f31163f.animate().alpha(0.0f).setDuration(800).setListener(null).start();
        }
    }

    public FocusMarkerLayout(Context context) {
        this(context, null);
    }

    public FocusMarkerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C11997b.layout_focus_marker, this);
        this.f31162e = (FrameLayout) findViewById(C11996a.focusMarkerContainer);
        this.f31163f = (ImageView) findViewById(C11996a.fill);
        this.f31162e.setAlpha(0.0f);
    }

    /* renamed from: a */
    public void mo35516a(float f, float f2) {
        int height = (int) ((f2 * ((float) getHeight())) - ((float) (this.f31162e.getWidth() / 2)));
        this.f31162e.setTranslationX((float) ((int) ((f * ((float) getWidth())) - ((float) (this.f31162e.getWidth() / 2)))));
        this.f31162e.setTranslationY((float) height);
        this.f31162e.animate().setListener(null).cancel();
        this.f31163f.animate().setListener(null).cancel();
        this.f31163f.setScaleX(0.0f);
        this.f31163f.setScaleY(0.0f);
        this.f31163f.setAlpha(1.0f);
        this.f31162e.setScaleX(1.36f);
        this.f31162e.setScaleY(1.36f);
        this.f31162e.setAlpha(1.0f);
        this.f31162e.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(0).setDuration(330).setListener(new C11954a()).start();
        this.f31163f.animate().scaleX(1.0f).scaleY(1.0f).setDuration(330).setListener(new C11955b()).start();
    }
}
