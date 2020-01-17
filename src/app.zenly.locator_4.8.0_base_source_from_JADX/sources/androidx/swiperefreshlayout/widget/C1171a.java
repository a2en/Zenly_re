package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.swiperefreshlayout.widget.a */
class C1171a extends ImageView {

    /* renamed from: e */
    private AnimationListener f4450e;

    /* renamed from: f */
    int f4451f;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    private class C1172a extends OvalShape {

        /* renamed from: e */
        private RadialGradient f4452e;

        /* renamed from: f */
        private Paint f4453f = new Paint();

        C1172a(int i) {
            C1171a.this.f4451f = i;
            m5709a((int) rect().width());
        }

        /* renamed from: a */
        private void m5709a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1171a.this.f4451f, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f4452e = radialGradient;
            this.f4453f.setShader(this.f4452e);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C1171a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1171a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f4453f);
            canvas.drawCircle(f, height, (float) (width - C1171a.this.f4451f), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m5709a((int) f);
        }
    }

    C1171a(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f4451f = (int) (3.5f * f);
        if (m5707a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.m2835b((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1172a(this.f4451f));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f4451f, (float) i3, (float) i2, 503316480);
            int i4 = this.f4451f;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        ViewCompat.m2822a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m5707a() {
        return VERSION.SDK_INT >= 21;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.f4450e;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.f4450e;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m5707a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f4451f * 2), getMeasuredHeight() + (this.f4451f * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: a */
    public void mo5884a(AnimationListener animationListener) {
        this.f4450e = animationListener;
    }
}
