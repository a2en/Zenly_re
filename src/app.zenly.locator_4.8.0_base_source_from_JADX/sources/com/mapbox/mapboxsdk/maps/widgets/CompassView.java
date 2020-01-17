package com.mapbox.mapboxsdk.maps.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C0661n;
import androidx.core.view.C0665o;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCompassAnimationListener;

public final class CompassView extends AppCompatImageView implements Runnable {

    /* renamed from: g */
    private float f30024g = 0.0f;

    /* renamed from: h */
    private boolean f30025h = true;

    /* renamed from: i */
    private C0661n f30026i;

    /* renamed from: j */
    private OnCompassAnimationListener f30027j;

    /* renamed from: k */
    private boolean f30028k = false;

    /* renamed from: com.mapbox.mapboxsdk.maps.widgets.CompassView$a */
    class C11574a extends C0665o {
        C11574a() {
        }

        public void onAnimationEnd(View view) {
            CompassView.this.setLayerType(0, null);
            CompassView.this.setVisibility(4);
            CompassView.this.mo34027d();
        }
    }

    public CompassView(Context context) {
        super(context);
        m30295a(context);
    }

    /* renamed from: a */
    private void m30295a(Context context) {
        setEnabled(false);
        int i = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        setLayoutParams(new LayoutParams(i, i));
    }

    /* renamed from: e */
    private void m30296e() {
        if (this.f30028k) {
            this.f30027j.onCompassAnimation();
        }
    }

    /* renamed from: b */
    public void mo34024b(boolean z) {
        this.f30028k = z;
    }

    /* renamed from: c */
    public boolean mo34026c() {
        return this.f30025h && mo34023a();
    }

    /* renamed from: d */
    public void mo34027d() {
        C0661n nVar = this.f30026i;
        if (nVar != null) {
            nVar.mo3432a();
        }
        this.f30026i = null;
    }

    public Drawable getCompassImage() {
        return getDrawable();
    }

    public void run() {
        if (mo34026c()) {
            this.f30027j.onCompassAnimationFinished();
            mo34027d();
            setLayerType(2, null);
            C0661n a = ViewCompat.m2813a(this);
            a.mo3427a(0.0f);
            a.mo3428a(500);
            this.f30026i = a;
            this.f30026i.mo3430a((ViewPropertyAnimatorListener) new C11574a());
        }
    }

    public void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z || mo34026c()) {
            mo34027d();
            setAlpha(0.0f);
            setVisibility(4);
            return;
        }
        mo34027d();
        setAlpha(1.0f);
        setVisibility(0);
    }

    /* renamed from: b */
    public boolean mo34025b() {
        return this.f30025h;
    }

    /* renamed from: a */
    public void mo34021a(OnCompassAnimationListener onCompassAnimationListener) {
        this.f30027j = onCompassAnimationListener;
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30295a(context);
    }

    /* renamed from: a */
    public boolean mo34023a() {
        return ((double) Math.abs(this.f30024g)) >= 359.0d || ((double) Math.abs(this.f30024g)) <= 1.0d;
    }

    /* renamed from: a */
    public void mo34020a(double d) {
        this.f30024g = (float) d;
        if (isEnabled()) {
            if (mo34026c()) {
                if (getVisibility() != 4 && this.f30026i == null) {
                    postDelayed(this, 500);
                }
                return;
            }
            mo34027d();
            setAlpha(1.0f);
            setVisibility(0);
            m30296e();
            setRotation(this.f30024g);
        }
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30295a(context);
    }

    /* renamed from: a */
    public void mo34022a(boolean z) {
        this.f30025h = z;
    }
}
