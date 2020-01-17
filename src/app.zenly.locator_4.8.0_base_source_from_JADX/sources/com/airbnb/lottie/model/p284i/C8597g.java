package com.airbnb.lottie.model.p284i;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.p283m.C8540a;
import com.airbnb.lottie.value.C8661c;

/* renamed from: com.airbnb.lottie.model.i.g */
public class C8597g extends C8586a {

    /* renamed from: A */
    private final C8592d f22092A;

    /* renamed from: B */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f22093B;

    /* renamed from: w */
    private final RectF f22094w = new RectF();

    /* renamed from: x */
    private final Paint f22095x = new C8540a();

    /* renamed from: y */
    private final float[] f22096y = new float[8];

    /* renamed from: z */
    private final Path f22097z = new Path();

    C8597g(C8515e eVar, C8592d dVar) {
        super(eVar, dVar);
        this.f22092A = dVar;
        this.f22095x.setAlpha(0);
        this.f22095x.setStyle(Style.FILL);
        this.f22095x.setColor(dVar.mo23202m());
    }

    /* renamed from: a */
    public void mo23181a(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f22092A.mo23202m());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f22040u.mo22922c() == null ? 100 : ((Integer) this.f22040u.mo22922c().mo22903f()).intValue()))) / 100.0f) * 255.0f);
            this.f22095x.setAlpha(intValue);
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f22093B;
            if (baseKeyframeAnimation != null) {
                this.f22095x.setColorFilter((ColorFilter) baseKeyframeAnimation.mo22903f());
            }
            if (intValue > 0) {
                float[] fArr = this.f22096y;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f22092A.mo23204o();
                float[] fArr2 = this.f22096y;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f22092A.mo23204o();
                this.f22096y[5] = (float) this.f22092A.mo23203n();
                float[] fArr3 = this.f22096y;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f22092A.mo23203n();
                matrix.mapPoints(this.f22096y);
                this.f22097z.reset();
                Path path = this.f22097z;
                float[] fArr4 = this.f22096y;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f22097z;
                float[] fArr5 = this.f22096y;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f22097z;
                float[] fArr6 = this.f22096y;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f22097z;
                float[] fArr7 = this.f22096y;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f22097z;
                float[] fArr8 = this.f22096y;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f22097z.close();
                canvas.drawPath(this.f22097z, this.f22095x);
            }
        }
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        super.addValueCallback(t, cVar);
        if (t != LottieProperty.f21541B) {
            return;
        }
        if (cVar == null) {
            this.f22093B = null;
        } else {
            this.f22093B = new C8504o(cVar);
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f22094w.set(0.0f, 0.0f, (float) this.f22092A.mo23204o(), (float) this.f22092A.mo23203n());
        this.f22032m.mapRect(this.f22094w);
        rectF.set(this.f22094w);
    }
}
