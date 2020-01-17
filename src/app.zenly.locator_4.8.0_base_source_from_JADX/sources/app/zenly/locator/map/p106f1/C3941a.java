package app.zenly.locator.map.p106f1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import app.zenly.locator.core.util.C3200e0;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.f1.a */
public final class C3941a extends Drawable {

    /* renamed from: a */
    private final float f10411a;

    /* renamed from: b */
    private final Paint f10412b;

    /* renamed from: c */
    private final Paint f10413c;

    /* renamed from: d */
    private PointF f10414d;

    /* renamed from: e */
    private float f10415e;

    /* renamed from: app.zenly.locator.map.f1.a$a */
    public static final class C3942a {
        private C3942a() {
        }

        public /* synthetic */ C3942a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3942a(null);
    }

    public C3941a(Context context) {
        C12932j.m33818b(context, "context");
        this.f10411a = (float) C3200e0.m10183a(context, 5);
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        this.f10412b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.argb(20, 255, 0, 0));
        paint2.setAntiAlias(true);
        paint2.setStyle(Style.FILL);
        this.f10413c = paint2;
    }

    /* renamed from: a */
    public final void mo10588a(PointF pointF) {
        this.f10414d = pointF;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        PointF pointF = this.f10414d;
        if (pointF != null) {
            canvas.drawCircle(pointF.x, pointF.y, this.f10411a, this.f10412b);
            float f = this.f10415e;
            if (f > 0.0f) {
                canvas.drawCircle(pointF.x, pointF.y, f, this.f10413c);
            }
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public final void mo10587a(float f) {
        this.f10415e = f;
        invalidateSelf();
    }
}
