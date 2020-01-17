package app.zenly.locator.userprofile.p198me.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3200e0;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12968h;

/* renamed from: app.zenly.locator.userprofile.me.view.LineGraphView */
public final class LineGraphView extends View {

    /* renamed from: e */
    private final Paint f15430e;

    /* renamed from: f */
    private final Paint f15431f;

    /* renamed from: g */
    private C12968h f15432g;

    /* renamed from: h */
    private long[] f15433h;

    /* renamed from: app.zenly.locator.userprofile.me.view.LineGraphView$a */
    public static final class C6145a {
        private C6145a() {
        }

        public /* synthetic */ C6145a(C12928f fVar) {
            this();
        }
    }

    static {
        new C6145a(null);
    }

    public LineGraphView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public LineGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public LineGraphView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ LineGraphView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C12928f fVar) {
        if ((i3 & 2) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        this(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private final float m17000a(int i) {
        return ((float) (i * getWidth())) / (((float) this.f15433h.length) - 1.0f);
    }

    public final long[] getPoints() {
        return this.f15433h;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        super.onDraw(canvas);
        int length = this.f15433h.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            canvas.drawLine(m17000a(i), m17001a(this.f15433h[i]), m17000a(i2), m17001a(this.f15433h[i2]), i == this.f15433h.length + -2 ? this.f15431f : this.f15430e);
            i = i2;
        }
    }

    public final void setPoints(long[] jArr) {
        C12932j.m33818b(jArr, "value");
        boolean z = true;
        if (jArr.length <= 1) {
            z = false;
        }
        if (z) {
            this.f15433h = jArr;
            Long c = C12840k.m33576c(this.f15433h);
            long j = 0;
            long longValue = c != null ? c.longValue() : 0;
            Long b = C12840k.m33573b(this.f15433h);
            if (b != null) {
                j = b.longValue();
            }
            this.f15432g = new C12968h(longValue, j);
            invalidate();
            return;
        }
        throw new IllegalArgumentException("value must contains at least 2 points".toString());
    }

    public LineGraphView(Context context, AttributeSet attributeSet, int i, int i2) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i, i2);
        Paint paint = new Paint(1);
        paint.setStrokeWidth((float) C3200e0.m10183a(context, 3));
        paint.setStrokeJoin(Join.ROUND);
        paint.setStrokeCap(Cap.ROUND);
        paint.setColor(C0540a.m2536a(context, (int) R.color.gray_medium));
        paint.setStyle(Style.STROKE);
        this.f15430e = paint;
        Paint paint2 = new Paint(this.f15430e);
        paint2.setPathEffect(new DashPathEffect(new float[]{(float) C3200e0.m10183a(context, 2), (float) C3200e0.m10183a(context, 4)}, 0.0f));
        this.f15431f = paint2;
        this.f15432g = C12968h.f33566i.mo37356a();
        this.f15433h = new long[0];
    }

    /* renamed from: a */
    private final float m17001a(long j) {
        long last = this.f15432g.getLast() - this.f15432g.getFirst();
        if (last == 0) {
            return 0.0f;
        }
        return ((float) getHeight()) * (1.0f - ((((float) j) - ((float) this.f15432g.getFirst())) / ((float) last)));
    }
}
