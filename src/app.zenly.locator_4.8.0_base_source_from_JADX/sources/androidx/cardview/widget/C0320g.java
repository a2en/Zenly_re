package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import p214e.p227d.C7567b;
import p214e.p227d.C7568c;

/* renamed from: androidx.cardview.widget.g */
class C0320g extends Drawable {

    /* renamed from: q */
    private static final double f1379q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0321a f1380r;

    /* renamed from: a */
    private final int f1381a;

    /* renamed from: b */
    private Paint f1382b;

    /* renamed from: c */
    private Paint f1383c;

    /* renamed from: d */
    private Paint f1384d;

    /* renamed from: e */
    private final RectF f1385e;

    /* renamed from: f */
    private float f1386f;

    /* renamed from: g */
    private Path f1387g;

    /* renamed from: h */
    private float f1388h;

    /* renamed from: i */
    private float f1389i;

    /* renamed from: j */
    private float f1390j;

    /* renamed from: k */
    private ColorStateList f1391k;

    /* renamed from: l */
    private boolean f1392l = true;

    /* renamed from: m */
    private final int f1393m;

    /* renamed from: n */
    private final int f1394n;

    /* renamed from: o */
    private boolean f1395o = true;

    /* renamed from: p */
    private boolean f1396p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    interface C0321a {
        /* renamed from: a */
        void mo2186a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0320g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1393m = resources.getColor(C7567b.cardview_shadow_start_color);
        this.f1394n = resources.getColor(C7567b.cardview_shadow_end_color);
        this.f1381a = resources.getDimensionPixelSize(C7568c.cardview_compat_inset_shadow);
        this.f1382b = new Paint(5);
        m1328b(colorStateList);
        this.f1383c = new Paint(5);
        this.f1383c.setStyle(Style.FILL);
        this.f1386f = (float) ((int) (f + 0.5f));
        this.f1385e = new RectF();
        this.f1384d = new Paint(this.f1383c);
        this.f1384d.setAntiAlias(false);
        m1325a(f2, f3);
    }

    /* renamed from: b */
    private void m1328b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1391k = colorStateList;
        this.f1382b.setColor(this.f1391k.getColorForState(getState(), this.f1391k.getDefaultColor()));
    }

    /* renamed from: d */
    private int m1330d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m1331g() {
        float f = this.f1386f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1389i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1387g;
        if (path == null) {
            this.f1387g = new Path();
        } else {
            path.reset();
        }
        this.f1387g.setFillType(FillType.EVEN_ODD);
        this.f1387g.moveTo(-this.f1386f, 0.0f);
        this.f1387g.rLineTo(-this.f1389i, 0.0f);
        this.f1387g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1387g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1387g.close();
        float f3 = this.f1386f;
        float f4 = this.f1389i;
        float f5 = f3 / (f3 + f4);
        Paint paint = this.f1383c;
        float f6 = f3 + f4;
        int i = this.f1393m;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.f1394n}, new float[]{0.0f, f5, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f1384d;
        float f7 = this.f1386f;
        float f8 = -f7;
        float f9 = this.f1389i;
        float f10 = f8 + f9;
        float f11 = (-f7) - f9;
        int i2 = this.f1393m;
        LinearGradient linearGradient = new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i2, i2, this.f1394n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f1384d.setAntiAlias(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2222a(boolean z) {
        this.f1395o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2226c(float f) {
        m1325a(f, this.f1388h);
    }

    public void draw(Canvas canvas) {
        if (this.f1392l) {
            m1329b(getBounds());
            this.f1392l = false;
        }
        canvas.translate(0.0f, this.f1390j / 2.0f);
        m1326a(canvas);
        canvas.translate(0.0f, (-this.f1390j) / 2.0f);
        f1380r.mo2186a(canvas, this.f1385e, this.f1386f, this.f1382b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo2229e() {
        float f = this.f1388h;
        return (Math.max(f, this.f1386f + ((float) this.f1381a) + (f / 2.0f)) * 2.0f) + ((this.f1388h + ((float) this.f1381a)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo2230f() {
        return this.f1390j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1327b(this.f1388h, this.f1386f, this.f1395o));
        int ceil2 = (int) Math.ceil((double) m1324a(this.f1388h, this.f1386f, this.f1395o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1391k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1392l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1391k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1382b.getColor() == colorForState) {
            return false;
        }
        this.f1382b.setColor(colorForState);
        this.f1392l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f1382b.setAlpha(i);
        this.f1383c.setAlpha(i);
        this.f1384d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1382b.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo2225c() {
        return this.f1388h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo2227d() {
        float f = this.f1388h;
        return (Math.max(f, this.f1386f + ((float) this.f1381a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1388h * 1.5f) + ((float) this.f1381a)) * 2.0f);
    }

    /* renamed from: a */
    private void m1325a(float f, float f2) {
        String str = ". Must be >= 0";
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float d = (float) m1330d(f);
            float d2 = (float) m1330d(f2);
            if (d > d2) {
                if (!this.f1396p) {
                    this.f1396p = true;
                }
                d = d2;
            }
            if (this.f1390j != d || this.f1388h != d2) {
                this.f1390j = d;
                this.f1388h = d2;
                this.f1389i = (float) ((int) ((d * 1.5f) + ((float) this.f1381a) + 0.5f));
                this.f1392l = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    static float m1327b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f1379q) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: b */
    private void m1329b(Rect rect) {
        float f = this.f1388h;
        float f2 = 1.5f * f;
        this.f1385e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m1331g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo2223b() {
        return this.f1386f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2224b(float f) {
        m1325a(this.f1390j, f);
    }

    /* renamed from: a */
    static float m1324a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f1379q) * ((double) f2))) : f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2219a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f1386f != f2) {
                this.f1386f = f2;
                this.f1392l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m1326a(Canvas canvas) {
        float f = this.f1386f;
        float f2 = (-f) - this.f1389i;
        float f3 = f + ((float) this.f1381a) + (this.f1390j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1385e.width() - f4 > 0.0f;
        boolean z2 = this.f1385e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1385e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f1387g, this.f1383c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1385e.width() - f4, -this.f1386f, this.f1384d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1385e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1387g, this.f1383c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1385e.width() - f4, (-this.f1386f) + this.f1389i, this.f1384d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1385e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1387g, this.f1383c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1385e.height() - f4, -this.f1386f, this.f1384d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1385e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1387g, this.f1383c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1385e.height() - f4, -this.f1386f, this.f1384d);
        }
        canvas.restoreToCount(save4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2221a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2220a(ColorStateList colorStateList) {
        m1328b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo2218a() {
        return this.f1391k;
    }
}
