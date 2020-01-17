package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* renamed from: com.theartofdev.edmodo.cropper.d */
final class C11937d extends Animation implements AnimationListener {

    /* renamed from: e */
    private final ImageView f31083e;

    /* renamed from: f */
    private final CropOverlayView f31084f;

    /* renamed from: g */
    private final float[] f31085g = new float[8];

    /* renamed from: h */
    private final float[] f31086h = new float[8];

    /* renamed from: i */
    private final RectF f31087i = new RectF();

    /* renamed from: j */
    private final RectF f31088j = new RectF();

    /* renamed from: k */
    private final float[] f31089k = new float[9];

    /* renamed from: l */
    private final float[] f31090l = new float[9];

    /* renamed from: m */
    private final RectF f31091m = new RectF();

    /* renamed from: n */
    private final float[] f31092n = new float[8];

    /* renamed from: o */
    private final float[] f31093o = new float[9];

    public C11937d(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f31083e = imageView;
        this.f31084f = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    /* renamed from: a */
    public void mo35431a(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f31086h, 0, 8);
        this.f31088j.set(this.f31084f.getCropWindowRect());
        matrix.getValues(this.f31090l);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f31091m;
        RectF rectF2 = this.f31087i;
        float f2 = rectF2.left;
        RectF rectF3 = this.f31088j;
        rectF.left = f2 + ((rectF3.left - f2) * f);
        float f3 = rectF2.top;
        rectF.top = f3 + ((rectF3.top - f3) * f);
        float f4 = rectF2.right;
        rectF.right = f4 + ((rectF3.right - f4) * f);
        float f5 = rectF2.bottom;
        rectF.bottom = f5 + ((rectF3.bottom - f5) * f);
        this.f31084f.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f31092n;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.f31085g;
            fArr[i2] = fArr2[i2] + ((this.f31086h[i2] - fArr2[i2]) * f);
            i2++;
        }
        this.f31084f.mo35399a(fArr, this.f31083e.getWidth(), this.f31083e.getHeight());
        while (true) {
            float[] fArr3 = this.f31093o;
            if (i < fArr3.length) {
                float[] fArr4 = this.f31089k;
                fArr3[i] = fArr4[i] + ((this.f31090l[i] - fArr4[i]) * f);
                i++;
            } else {
                Matrix imageMatrix = this.f31083e.getImageMatrix();
                imageMatrix.setValues(this.f31093o);
                this.f31083e.setImageMatrix(imageMatrix);
                this.f31083e.invalidate();
                this.f31084f.invalidate();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo35433b(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f31085g, 0, 8);
        this.f31087i.set(this.f31084f.getCropWindowRect());
        matrix.getValues(this.f31089k);
    }

    public void onAnimationEnd(Animation animation) {
        this.f31083e.clearAnimation();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
