package com.airbnb.lottie.model.p284i;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.p283m.C8540a;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8661c;

/* renamed from: com.airbnb.lottie.model.i.c */
public class C8591c extends C8586a {

    /* renamed from: w */
    private final Paint f22052w = new C8540a(3);

    /* renamed from: x */
    private final Rect f22053x = new Rect();

    /* renamed from: y */
    private final Rect f22054y = new Rect();

    /* renamed from: z */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f22055z;

    C8591c(C8515e eVar, C8592d dVar) {
        super(eVar, dVar);
    }

    /* renamed from: d */
    private Bitmap m19949d() {
        return this.f22033n.mo22953a(this.f22034o.mo23200k());
    }

    /* renamed from: a */
    public void mo23181a(Canvas canvas, Matrix matrix, int i) {
        Bitmap d = m19949d();
        if (d != null && !d.isRecycled()) {
            float a = C8658h.m20192a();
            this.f22052w.setAlpha(i);
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f22055z;
            if (baseKeyframeAnimation != null) {
                this.f22052w.setColorFilter((ColorFilter) baseKeyframeAnimation.mo22903f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f22053x.set(0, 0, d.getWidth(), d.getHeight());
            this.f22054y.set(0, 0, (int) (((float) d.getWidth()) * a), (int) (((float) d.getHeight()) * a));
            canvas.drawBitmap(d, this.f22053x, this.f22054y, this.f22052w);
            canvas.restore();
        }
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        super.addValueCallback(t, cVar);
        if (t != LottieProperty.f21541B) {
            return;
        }
        if (cVar == null) {
            this.f22055z = null;
        } else {
            this.f22055z = new C8504o(cVar);
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        Bitmap d = m19949d();
        if (d != null) {
            rectF.set(0.0f, 0.0f, ((float) d.getWidth()) * C8658h.m20192a(), ((float) d.getHeight()) * C8658h.m20192a());
            this.f22032m.mapRect(rectF);
        }
    }
}
