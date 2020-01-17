package app.zenly.android.feature.map.widget.p013a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.map.widget.a.a */
public final class C1421a extends Drawable {

    /* renamed from: a */
    private Integer[] f5115a = {Integer.valueOf(-1)};

    /* renamed from: b */
    private float f5116b;

    /* renamed from: c */
    private int f5117c;

    /* renamed from: d */
    private final Path f5118d = new Path();

    /* renamed from: e */
    private final Path f5119e = new Path();

    /* renamed from: f */
    private final Paint f5120f = new Paint();

    /* renamed from: g */
    private final Paint f5121g = new Paint();

    public C1421a() {
        this.f5120f.setAntiAlias(true);
        this.f5120f.setStyle(Style.FILL_AND_STROKE);
        mo6716a(-1);
        this.f5121g.setAntiAlias(true);
        this.f5121g.setStyle(Style.FILL_AND_STROKE);
        m6484e();
    }

    /* renamed from: d */
    private final void m6483d() {
        float width = (float) getBounds().width();
        float height = (float) getBounds().height();
        Path path = this.f5118d;
        path.reset();
        float f = (float) this.f5117c;
        path.addRoundRect(0.0f, 0.0f, width, height, f, f, Direction.CW);
        m6485f();
    }

    /* renamed from: e */
    private final void m6484e() {
        int length = this.f5115a.length;
        int intValue = this.f5115a[C12973l.m33890b((int) (((float) length) * this.f5116b), length - 1)].intValue();
        if (intValue != this.f5121g.getColor()) {
            this.f5121g.setColor(intValue);
            invalidateSelf();
        }
    }

    /* renamed from: f */
    private final void m6485f() {
        this.f5119e.reset();
        this.f5119e.addRect(0.0f, 0.0f, ((float) getBounds().width()) * this.f5116b, (float) getBounds().height(), Direction.CW);
        this.f5119e.op(this.f5118d, Op.INTERSECT);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo6716a(int i) {
        if (i != this.f5120f.getColor()) {
            this.f5120f.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public final Integer[] mo6719b() {
        return this.f5115a;
    }

    /* renamed from: c */
    public final int mo6720c() {
        return this.f5117c;
    }

    public void draw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        canvas.drawPath(this.f5118d, this.f5120f);
        canvas.drawPath(this.f5119e, this.f5121g);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        C12932j.m33818b(outline, "outline");
        outline.setConvexPath(this.f5118d);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        C12932j.m33818b(rect, "bounds");
        m6483d();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: b */
    public final void mo6718b(int i) {
        this.f5117c = i;
        m6483d();
    }

    /* renamed from: a */
    public final int mo6714a() {
        return this.f5120f.getColor();
    }

    /* renamed from: a */
    public final void mo6717a(Integer[] numArr) {
        C12932j.m33818b(numArr, "value");
        this.f5115a = numArr;
        m6484e();
    }

    /* renamed from: a */
    public final void mo6715a(float f) {
        if (f != this.f5116b) {
            this.f5116b = C12973l.m33892c(C12973l.m33889b(f, 0.0f), 1.0f);
            m6484e();
            m6485f();
        }
    }
}
