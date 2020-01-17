package app.zenly.locator.chat;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.view.View;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.chat.e5 */
final class C1964e5 {

    /* renamed from: a */
    private static final int[] f6339a = {R.color.pink, R.color.blue_dark, R.color.blue_light};

    /* renamed from: app.zenly.locator.chat.e5$a */
    static class C1965a extends ShaderFactory {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f6340a;

        /* renamed from: b */
        final /* synthetic */ int[] f6341b;

        C1965a(ValueAnimator valueAnimator, int[] iArr) {
            this.f6340a = valueAnimator;
            this.f6341b = iArr;
        }

        public Shader resize(int i, int i2) {
            if (this.f6340a.isStarted()) {
                this.f6340a.end();
            }
            this.f6340a.setIntValues(new int[]{i, 0});
            this.f6340a.start();
            float f = (float) i2;
            LinearGradient linearGradient = new LinearGradient(0.0f, f, (float) i, f, this.f6341b, null, TileMode.REPEAT);
            return linearGradient;
        }
    }

    /* renamed from: app.zenly.locator.chat.e5$b */
    static class C1966b implements AnimatorUpdateListener {

        /* renamed from: a */
        private final Matrix f6342a = new Matrix();

        /* renamed from: b */
        final /* synthetic */ View f6343b;

        /* renamed from: c */
        final /* synthetic */ PaintDrawable f6344c;

        /* renamed from: d */
        final /* synthetic */ ValueAnimator f6345d;

        C1966b(View view, PaintDrawable paintDrawable, ValueAnimator valueAnimator) {
            this.f6343b = view;
            this.f6344c = paintDrawable;
            this.f6345d = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f6343b.getBackground() != this.f6344c) {
                this.f6345d.cancel();
                return;
            }
            this.f6342a.setTranslate((float) ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0.0f);
            this.f6344c.getPaint().getShader().setLocalMatrix(this.f6342a);
            this.f6344c.invalidateSelf();
        }
    }

    /* renamed from: a */
    public static void m7690a(View view) {
        Context context = view.getContext();
        int length = f6339a.length;
        int[] iArr = new int[(length + 1)];
        for (int i = 0; i < length; i++) {
            iArr[i] = C0540a.m2536a(context, f6339a[i]);
        }
        iArr[length] = iArr[0];
        ValueAnimator valueAnimator = new ValueAnimator();
        C1965a aVar = new C1965a(valueAnimator, iArr);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShaderFactory(aVar);
        paintDrawable.setCornerRadius((float) context.getResources().getDimensionPixelSize(R.dimen.corner_radius_125));
        view.setBackground(paintDrawable);
        valueAnimator.setDuration(4000);
        valueAnimator.setInterpolator(C7657c.m18649e());
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new C1966b(view, paintDrawable, valueAnimator));
    }
}
