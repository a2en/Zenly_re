package app.zenly.locator.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import app.zenly.locator.C3892m;

public class CircleProgressView extends View {

    /* renamed from: e */
    private final Paint f9028e;

    /* renamed from: f */
    private final Paint f9029f;

    /* renamed from: g */
    private final Paint f9030g;

    /* renamed from: h */
    private final PointF f9031h;

    /* renamed from: i */
    private final RectF f9032i;

    /* renamed from: j */
    private final int f9033j;

    /* renamed from: k */
    private final int f9034k;

    /* renamed from: l */
    private final boolean f9035l;

    /* renamed from: m */
    private float f9036m;

    /* renamed from: n */
    private float f9037n;

    /* renamed from: o */
    private float f9038o;

    /* renamed from: p */
    private float f9039p;

    public CircleProgressView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo9658a(float f, float f2) {
        if (f != this.f9037n || f2 != this.f9038o) {
            this.f9037n = f;
            this.f9038o = f2;
            float f3 = 360.0f;
            if (f != f2) {
                f3 = ((this.f9037n / this.f9038o) * 360.0f) % 360.0f;
            }
            if (f3 != this.f9039p) {
                this.f9039p = f3;
                postInvalidateOnAnimation();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9028e.getColor() != 0) {
            PointF pointF = this.f9031h;
            canvas.drawCircle(pointF.x, pointF.y, this.f9036m, this.f9028e);
        }
        if (this.f9033j == 0 && this.f9029f.getColor() != 0) {
            PointF pointF2 = this.f9031h;
            canvas.drawCircle(pointF2.x, pointF2.y, this.f9036m, this.f9029f);
        }
        if (this.f9039p >= 0.0f && this.f9030g.getColor() != 0) {
            canvas.drawArc(this.f9032i, this.f9035l ? -90.0f + this.f9039p : -90.0f, this.f9035l ? 360.0f - this.f9039p : this.f9039p, this.f9033j == 1, this.f9030g);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) this.f9034k) / 2.0f;
        this.f9031h.x = ((float) getWidth()) / 2.0f;
        this.f9031h.y = ((float) getHeight()) / 2.0f;
        PointF pointF = this.f9031h;
        this.f9036m = Math.min(pointF.x, pointF.y) - f;
        float floor = (float) Math.floor((double) f);
        this.f9032i.set(floor, floor, ((float) getWidth()) - floor, ((float) getHeight()) - floor);
    }

    public void setCircleBackgroundColor(int i) {
        if (this.f9028e.getColor() != i) {
            this.f9028e.setColor(i);
            postInvalidateOnAnimation();
        }
    }

    public void setCircleBorderColor(int i) {
        if (this.f9029f.getColor() != i) {
            this.f9029f.setColor(i);
            postInvalidateOnAnimation();
        }
    }

    public void setCircleProgressColor(int i) {
        if (this.f9030g.getColor() != i) {
            this.f9030g.setColor(i);
            postInvalidateOnAnimation();
        }
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9028e = new Paint();
        this.f9029f = new Paint();
        this.f9030g = new Paint();
        this.f9031h = new PointF();
        this.f9032i = new RectF();
        this.f9038o = 100.0f;
        this.f9028e.setAntiAlias(true);
        this.f9028e.setStyle(Style.FILL_AND_STROKE);
        this.f9029f.setAntiAlias(true);
        this.f9029f.setStyle(Style.STROKE);
        this.f9030g.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.CircleProgressView, i, 0);
        this.f9033j = obtainStyledAttributes.getInt(3, 0);
        this.f9030g.setStyle(this.f9033j == 0 ? Style.STROKE : Style.FILL);
        this.f9034k = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f9028e.setStrokeWidth((float) this.f9034k);
        this.f9029f.setStrokeWidth((float) this.f9034k);
        this.f9030g.setStrokeWidth((float) this.f9034k);
        this.f9035l = obtainStyledAttributes.getBoolean(5, false);
        setCircleBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        setCircleBorderColor(obtainStyledAttributes.getColor(1, 0));
        setCircleProgressColor(obtainStyledAttributes.getColor(2, -16777216));
        mo9658a((float) obtainStyledAttributes.getInt(7, 0), (float) obtainStyledAttributes.getInt(6, 100));
        obtainStyledAttributes.recycle();
    }
}
