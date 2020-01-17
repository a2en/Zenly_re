package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.g */
public class C9615g extends C9614f {

    /* renamed from: h */
    final Matrix f24985h = new Matrix();

    /* renamed from: i */
    private int f24986i;

    /* renamed from: j */
    private int f24987j;

    /* renamed from: k */
    private final Matrix f24988k = new Matrix();

    /* renamed from: l */
    private final RectF f24989l = new RectF();

    public C9615g(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f24986i = i - (i % 90);
        if (i2 < 0 || i2 > 8) {
            i2 = 0;
        }
        this.f24987j = i2;
    }

    public void draw(Canvas canvas) {
        if (this.f24986i <= 0) {
            int i = this.f24987j;
            if (i == 0 || i == 1) {
                super.draw(canvas);
                return;
            }
        }
        int save = canvas.save();
        canvas.concat(this.f24985h);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public int getIntrinsicHeight() {
        int i = this.f24987j;
        if (i == 5 || i == 7 || this.f24986i % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        int i = this.f24987j;
        if (i == 5 || i == 7 || this.f24986i % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    public void getTransform(Matrix matrix) {
        mo25980a(matrix);
        if (!this.f24985h.isIdentity()) {
            matrix.preConcat(this.f24985h);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.f24986i <= 0) {
            int i = this.f24987j;
            if (i == 0 || i == 1) {
                current.setBounds(rect);
                return;
            }
        }
        int i2 = this.f24987j;
        if (i2 == 2) {
            this.f24985h.setScale(-1.0f, 1.0f);
        } else if (i2 == 7) {
            this.f24985h.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
            this.f24985h.postScale(-1.0f, 1.0f);
        } else if (i2 == 4) {
            this.f24985h.setScale(1.0f, -1.0f);
        } else if (i2 != 5) {
            this.f24985h.setRotate((float) this.f24986i, (float) rect.centerX(), (float) rect.centerY());
        } else {
            this.f24985h.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
            this.f24985h.postScale(1.0f, -1.0f);
        }
        this.f24988k.reset();
        this.f24985h.invert(this.f24988k);
        this.f24989l.set(rect);
        this.f24988k.mapRect(this.f24989l);
        RectF rectF = this.f24989l;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
