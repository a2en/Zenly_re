package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.drawee.drawable.h */
public class C9616h extends C9621k {

    /* renamed from: H */
    private final Paint f24990H = new Paint();

    /* renamed from: I */
    private final Paint f24991I = new Paint(1);

    /* renamed from: J */
    private final Bitmap f24992J;

    /* renamed from: K */
    private WeakReference<Bitmap> f24993K;

    public C9616h(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.f24992J = bitmap;
        if (paint != null) {
            this.f24990H.set(paint);
        }
        this.f24990H.setFlags(1);
        this.f24991I.setStyle(Style.STROKE);
    }

    /* renamed from: d */
    private void m23610d() {
        WeakReference<Bitmap> weakReference = this.f24993K;
        if (weakReference == null || weakReference.get() != this.f24992J) {
            this.f24993K = new WeakReference<>(this.f24992J);
            Paint paint = this.f24990H;
            Bitmap bitmap = this.f24992J;
            TileMode tileMode = TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f25042j = true;
        }
        if (this.f25042j) {
            this.f24990H.getShader().setLocalMatrix(this.f25031B);
            this.f25042j = false;
        }
        this.f24990H.setFilterBitmap(getPaintFilterBitmap());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26002a() {
        return super.mo26002a() && this.f24992J != null;
    }

    public void draw(Canvas canvas) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("RoundedBitmapDrawable#draw");
        }
        if (!mo26002a()) {
            super.draw(canvas);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            return;
        }
        mo26015c();
        mo26014b();
        m23610d();
        int save = canvas.save();
        canvas.concat(this.f25057y);
        canvas.drawPath(this.f25041i, this.f24990H);
        float f = this.f25040h;
        if (f > 0.0f) {
            this.f24991I.setStrokeWidth(f);
            this.f24991I.setColor(C9612d.m23591a(this.f25043k, this.f24990H.getAlpha()));
            canvas.drawPath(this.f25044l, this.f24991I);
        }
        canvas.restoreToCount(save);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f24990H.getAlpha()) {
            this.f24990H.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f24990H.setColorFilter(colorFilter);
    }
}
