package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.C9536j;

/* renamed from: com.facebook.drawee.drawable.b */
public class C9610b extends C9614f implements Runnable, CloneableDrawable {

    /* renamed from: h */
    private int f24962h;

    /* renamed from: i */
    private boolean f24963i;

    /* renamed from: j */
    float f24964j;

    /* renamed from: k */
    private boolean f24965k;

    public C9610b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    /* renamed from: a */
    private int m23583a() {
        return (int) ((20.0f / ((float) this.f24962h)) * 360.0f);
    }

    /* renamed from: b */
    private void m23584b() {
        if (!this.f24965k) {
            this.f24965k = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f24964j;
        if (!this.f24963i) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) (bounds.left + (i / 2)), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        m23584b();
    }

    public void run() {
        this.f24965k = false;
        this.f24964j += (float) m23583a();
        invalidateSelf();
    }

    public C9610b(Drawable drawable, int i, boolean z) {
        C9536j.m23271a(drawable);
        super(drawable);
        this.f24964j = 0.0f;
        this.f24965k = false;
        this.f24962h = i;
        this.f24963i = z;
    }

    public C9610b cloneDrawable() {
        return new C9610b(C9612d.m23592a(getDrawable()), this.f24962h, this.f24963i);
    }
}
