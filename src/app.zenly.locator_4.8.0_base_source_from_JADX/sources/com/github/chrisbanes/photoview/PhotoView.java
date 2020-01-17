package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;

public class PhotoView extends AppCompatImageView {

    /* renamed from: g */
    private C9958d f26101g;

    /* renamed from: h */
    private ScaleType f26102h;

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m24883a() {
        this.f26101g = new C9958d(this);
        super.setScaleType(ScaleType.MATRIX);
        ScaleType scaleType = this.f26102h;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f26102h = null;
        }
    }

    public C9958d getAttacher() {
        return this.f26101g;
    }

    public RectF getDisplayRect() {
        return this.f26101g.mo26865a();
    }

    public Matrix getImageMatrix() {
        return this.f26101g.mo26882b();
    }

    public float getMaximumScale() {
        return this.f26101g.mo26885c();
    }

    public float getMediumScale() {
        return this.f26101g.mo26887d();
    }

    public float getMinimumScale() {
        return this.f26101g.mo26889e();
    }

    public float getScale() {
        return this.f26101g.mo26891f();
    }

    public ScaleType getScaleType() {
        return this.f26101g.mo26893g();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f26101g.mo26881a(z);
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f26101g.mo26894h();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C9958d dVar = this.f26101g;
        if (dVar != null) {
            dVar.mo26894h();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        C9958d dVar = this.f26101g;
        if (dVar != null) {
            dVar.mo26894h();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C9958d dVar = this.f26101g;
        if (dVar != null) {
            dVar.mo26894h();
        }
    }

    public void setMaximumScale(float f) {
        this.f26101g.mo26866a(f);
    }

    public void setMediumScale(float f) {
        this.f26101g.mo26883b(f);
    }

    public void setMinimumScale(float f) {
        this.f26101g.mo26886c(f);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f26101g.mo26871a(onClickListener);
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.f26101g.mo26870a(onDoubleTapListener);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f26101g.mo26872a(onLongClickListener);
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.f26101g.mo26874a(onMatrixChangedListener);
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f26101g.mo26875a(onOutsidePhotoTapListener);
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.f26101g.mo26876a(onPhotoTapListener);
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.f26101g.mo26877a(onScaleChangedListener);
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.f26101g.mo26878a(onSingleFlingListener);
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.f26101g.mo26879a(onViewDragListener);
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.f26101g.mo26880a(onViewTapListener);
    }

    public void setRotationBy(float f) {
        this.f26101g.mo26888d(f);
    }

    public void setRotationTo(float f) {
        this.f26101g.mo26890e(f);
    }

    public void setScale(float f) {
        this.f26101g.mo26892f(f);
    }

    public void setScaleType(ScaleType scaleType) {
        C9958d dVar = this.f26101g;
        if (dVar == null) {
            this.f26102h = scaleType;
        } else {
            dVar.mo26873a(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f26101g.mo26869a(i);
    }

    public void setZoomable(boolean z) {
        this.f26101g.mo26884b(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24883a();
    }

    /* renamed from: a */
    public void mo26826a(float f, boolean z) {
        this.f26101g.mo26868a(f, z);
    }
}
