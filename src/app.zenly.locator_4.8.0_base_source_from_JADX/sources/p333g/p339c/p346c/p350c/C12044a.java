package p333g.p339c.p346c.p350c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.debug.listener.ImageLoadingTimeListener;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: g.c.c.c.a */
public class C12044a extends Drawable implements ImageLoadingTimeListener {

    /* renamed from: e */
    private String f31378e;

    /* renamed from: f */
    private String f31379f;

    /* renamed from: g */
    private int f31380g;

    /* renamed from: h */
    private int f31381h;

    /* renamed from: i */
    private int f31382i;

    /* renamed from: j */
    private String f31383j;

    /* renamed from: k */
    private ScaleType f31384k;

    /* renamed from: l */
    private HashMap<String, String> f31385l = new HashMap<>();

    /* renamed from: m */
    private int f31386m;

    /* renamed from: n */
    private int f31387n;

    /* renamed from: o */
    private int f31388o = 80;

    /* renamed from: p */
    private final Paint f31389p = new Paint(1);

    /* renamed from: q */
    private final Matrix f31390q = new Matrix();

    /* renamed from: r */
    private final Rect f31391r = new Rect();

    /* renamed from: s */
    private final RectF f31392s = new RectF();

    /* renamed from: t */
    private int f31393t;

    /* renamed from: u */
    private int f31394u;

    /* renamed from: v */
    private int f31395v;

    /* renamed from: w */
    private int f31396w;

    /* renamed from: x */
    private int f31397x;

    /* renamed from: y */
    private long f31398y;

    /* renamed from: z */
    private String f31399z;

    public C12044a() {
        mo35702a();
    }

    /* renamed from: a */
    public void mo35702a() {
        this.f31380g = -1;
        this.f31381h = -1;
        this.f31382i = -1;
        this.f31385l = new HashMap<>();
        this.f31386m = -1;
        this.f31387n = -1;
        this.f31383j = null;
        mo35706a((String) null);
        this.f31398y = -1;
        this.f31399z = null;
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo35707b(String str) {
        this.f31399z = str;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f31389p.setStyle(Style.STROKE);
        this.f31389p.setStrokeWidth(2.0f);
        this.f31389p.setColor(-26624);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f31389p);
        this.f31389p.setStyle(Style.FILL);
        this.f31389p.setColor(mo35701a(this.f31380g, this.f31381h, this.f31384k));
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f31389p);
        this.f31389p.setStyle(Style.FILL);
        this.f31389p.setStrokeWidth(0.0f);
        this.f31389p.setColor(-1);
        this.f31396w = this.f31393t;
        this.f31397x = this.f31394u;
        String str = this.f31379f;
        if (str != null) {
            m31757a(canvas, "IDs: %s, %s", this.f31378e, str);
        } else {
            m31757a(canvas, "ID: %s", this.f31378e);
        }
        m31757a(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        m31757a(canvas, "I: %dx%d", Integer.valueOf(this.f31380g), Integer.valueOf(this.f31381h));
        m31757a(canvas, "I: %d KiB", Integer.valueOf(this.f31382i / 1024));
        String str2 = this.f31383j;
        if (str2 != null) {
            m31757a(canvas, "i format: %s", str2);
        }
        int i = this.f31386m;
        if (i > 0) {
            m31757a(canvas, "anim: f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.f31387n));
        }
        ScaleType scaleType = this.f31384k;
        if (scaleType != null) {
            m31757a(canvas, "scale: %s", scaleType);
        }
        long j = this.f31398y;
        if (j >= 0) {
            m31757a(canvas, "t: %d ms", Long.valueOf(j));
        }
        String str3 = this.f31399z;
        if (str3 != null) {
            m31757a(canvas, "origin: %s", str3);
        }
        for (Entry entry : this.f31385l.entrySet()) {
            m31757a(canvas, "%s: %s", entry.getKey(), entry.getValue());
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m31758a(rect, 9, 8);
    }

    public void onFinalImageSet(long j) {
        this.f31398y = j;
        invalidateSelf();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public void mo35706a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f31378e = str;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo35704a(int i, int i2) {
        this.f31380g = i;
        this.f31381h = i2;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo35703a(int i) {
        this.f31382i = i;
    }

    /* renamed from: a */
    public void mo35705a(ScaleType scaleType) {
        this.f31384k = scaleType;
    }

    /* renamed from: a */
    private void m31758a(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f31389p.setTextSize((float) min);
        this.f31395v = min + 8;
        if (this.f31388o == 80) {
            this.f31395v *= -1;
        }
        this.f31393t = rect.left + 10;
        this.f31394u = this.f31388o == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    /* renamed from: a */
    private void m31757a(Canvas canvas, String str, Object... objArr) {
        if (objArr == null) {
            canvas.drawText(str, (float) this.f31396w, (float) this.f31397x, this.f31389p);
        } else {
            canvas.drawText(String.format(str, objArr), (float) this.f31396w, (float) this.f31397x, this.f31389p);
        }
        this.f31397x += this.f31395v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo35701a(int i, int i2, ScaleType scaleType) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (scaleType != null) {
                Rect rect = this.f31391r;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f31390q.reset();
                scaleType.getTransform(this.f31390q, this.f31391r, i, i2, 0.0f, 0.0f);
                RectF rectF = this.f31392s;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                this.f31390q.mapRect(rectF);
                int height2 = (int) this.f31392s.height();
                width = Math.min(width, (int) this.f31392s.width());
                height = Math.min(height, height2);
            }
            float f = (float) width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = (float) abs;
            if (f7 < f2 && ((float) abs2) < f5) {
                return 1716301648;
            }
            if (f7 < f3 && ((float) abs2) < f6) {
                return 1728026624;
            }
        }
        return 1727284022;
    }
}
