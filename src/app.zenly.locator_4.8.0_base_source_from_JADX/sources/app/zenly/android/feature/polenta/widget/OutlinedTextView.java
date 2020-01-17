package app.zenly.android.feature.polenta.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.C0554e;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7675b;
import p250f.p251a.p252a.p253a.p258g.C7679a;
import p250f.p251a.p252a.p263b.p279d.C7765a;
import p250f.p251a.p252a.p263b.p279d.C7767c;
import p250f.p251a.p252a.p263b.p279d.C7771g;

@SuppressLint({"CustomViewStyleable"})
public class OutlinedTextView extends AppCompatTextView {

    /* renamed from: p */
    private static final SparseIntArray f5189p;

    /* renamed from: e */
    private int f5190e;

    /* renamed from: f */
    private Typeface f5191f;

    /* renamed from: g */
    private final TextPaint f5192g;

    /* renamed from: h */
    private int f5193h;

    /* renamed from: i */
    private int f5194i;

    /* renamed from: j */
    private int f5195j;

    /* renamed from: k */
    private int f5196k;

    /* renamed from: l */
    private float f5197l;

    /* renamed from: m */
    private float f5198m;

    /* renamed from: n */
    private float f5199n;

    /* renamed from: o */
    private int f5200o;

    /* renamed from: app.zenly.android.feature.polenta.widget.OutlinedTextView$a */
    public static final class C1427a {
        private C1427a() {
        }

        public /* synthetic */ C1427a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.OutlinedTextView$b */
    private static final class C1428b extends C7679a {

        /* renamed from: b */
        private final TextPaint f5201b;

        public C1428b(Canvas canvas, TextPaint textPaint) {
            C12932j.m33818b(canvas, "canvas");
            C12932j.m33818b(textPaint, "textPaint");
            super(canvas);
            this.f5201b = textPaint;
        }

        public boolean clipOutPath(Path path) {
            C12932j.m33818b(path, "path");
            return true;
        }

        public boolean clipOutRect(float f, float f2, float f3, float f4) {
            return true;
        }

        public boolean clipOutRect(int i, int i2, int i3, int i4) {
            return true;
        }

        public boolean clipOutRect(Rect rect) {
            C12932j.m33818b(rect, "rect");
            return true;
        }

        public boolean clipOutRect(RectF rectF) {
            C12932j.m33818b(rectF, "rect");
            return true;
        }

        public boolean clipPath(Path path) {
            C12932j.m33818b(path, "path");
            return true;
        }

        public boolean clipPath(Path path, Op op) {
            C12932j.m33818b(path, "path");
            C12932j.m33818b(op, "op");
            return true;
        }

        public boolean clipRect(float f, float f2, float f3, float f4) {
            return true;
        }

        public boolean clipRect(float f, float f2, float f3, float f4, Op op) {
            C12932j.m33818b(op, "op");
            return true;
        }

        public boolean clipRect(int i, int i2, int i3, int i4) {
            return true;
        }

        public boolean clipRect(Rect rect) {
            C12932j.m33818b(rect, "rect");
            return true;
        }

        public boolean clipRect(Rect rect, Op op) {
            C12932j.m33818b(rect, "rect");
            C12932j.m33818b(op, "op");
            return true;
        }

        public boolean clipRect(RectF rectF) {
            C12932j.m33818b(rectF, "rect");
            return true;
        }

        public boolean clipRect(RectF rectF, Op op) {
            C12932j.m33818b(rectF, "rect");
            C12932j.m33818b(op, "op");
            return true;
        }

        public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
            C12932j.m33818b(cArr, "text");
            C12932j.m33818b(paint, "paint");
            super.drawText(cArr, i, i2, f, f2, (Paint) this.f5201b);
        }

        public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
            char[] cArr2 = cArr;
            C12932j.m33818b(cArr, "text");
            Path path2 = path;
            C12932j.m33818b(path, "path");
            C12932j.m33818b(paint, "paint");
            super.drawTextOnPath(cArr2, i, i2, path2, f, f2, this.f5201b);
        }

        public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
            char[] cArr2 = cArr;
            C12932j.m33818b(cArr, "text");
            C12932j.m33818b(paint, "paint");
            super.drawTextRun(cArr2, i, i2, i3, i4, f, f2, z, (Paint) this.f5201b);
        }

        public boolean isHardwareAccelerated() {
            return false;
        }

        public void drawText(String str, float f, float f2, Paint paint) {
            C12932j.m33818b(str, "text");
            C12932j.m33818b(paint, "paint");
            super.drawText(str, f, f2, this.f5201b);
        }

        public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
            C12932j.m33818b(str, "text");
            C12932j.m33818b(path, "path");
            C12932j.m33818b(paint, "paint");
            super.drawTextOnPath(str, path, f, f2, this.f5201b);
        }

        public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
            CharSequence charSequence2 = charSequence;
            C12932j.m33818b(charSequence, "text");
            C12932j.m33818b(paint, "paint");
            super.drawTextRun(charSequence2, i, i2, i3, i4, f, f2, z, (Paint) this.f5201b);
        }

        public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
            C12932j.m33818b(str, "text");
            C12932j.m33818b(paint, "paint");
            super.drawText(str, i, i2, f, f2, (Paint) this.f5201b);
        }

        public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
            C12932j.m33818b(charSequence, "text");
            C12932j.m33818b(paint, "paint");
            super.drawText(charSequence, i, i2, f, f2, (Paint) this.f5201b);
        }
    }

    static {
        new C1427a(null);
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(C7767c.gilroy_1000, C7767c.gilroy_outlined_1000);
        f5189p = sparseIntArray;
    }

    public OutlinedTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public OutlinedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OutlinedTextView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = C7765a.outlinedTextViewStyle;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m6511a(int i) {
        Context context = getContext();
        C12932j.m33815a((Object) context, "context");
        C7675b bVar = new C7675b(context, i);
        if (C7674a.m18692a(bVar.mo19817c())) {
            int indexOfKey = f5189p.indexOfKey(bVar.mo19817c());
            if (indexOfKey > -1) {
                this.f5191f = C0554e.m2605a(getContext(), f5189p.valueAt(indexOfKey));
            }
        }
    }

    private final float getStrokeSize() {
        TextPaint paint = getPaint();
        C12932j.m33815a((Object) paint, "paint");
        return paint.getTextSize() * 0.15f;
    }

    public final int getStrokeColor() {
        return this.f5190e;
    }

    public boolean hasOverlappingRendering() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        TextPaint textPaint = this.f5192g;
        textPaint.set(getPaint());
        textPaint.setColor(this.f5190e);
        textPaint.setStyle(Style.FILL_AND_STROKE);
        textPaint.setStrokeWidth(getStrokeSize() * ((float) 2));
        Typeface typeface = this.f5191f;
        if (typeface == null) {
            TextPaint paint = getPaint();
            C12932j.m33815a((Object) paint, "paint");
            typeface = paint.getTypeface();
        }
        textPaint.setTypeface(typeface);
        float f = this.f5199n;
        if (f > 0.0f) {
            int i = this.f5200o;
            if (i != 0) {
                textPaint.setShadowLayer(f, this.f5197l, this.f5198m, i);
            }
        }
        super.onDraw(new C1428b(canvas, this.f5192g));
        super.onDraw(canvas);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        this.f5193h = i;
        this.f5194i = i2;
        this.f5195j = i3;
        this.f5196k = i4;
        mo8277a();
    }

    public final void setStrokeColor(int i) {
        if (this.f5190e != i) {
            this.f5190e = i;
            invalidate();
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        m6511a(i);
        mo8277a();
    }

    public OutlinedTextView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f5190e = -1;
        this.f5192g = new TextPaint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7771g.OutlinedTextView, i, 0);
        setStrokeColor(obtainStyledAttributes.getColor(C7771g.OutlinedTextView_strokeColor, this.f5190e));
        this.f5200o = obtainStyledAttributes.getColor(C7771g.OutlinedTextView_shadowColor, this.f5200o);
        this.f5197l = obtainStyledAttributes.getFloat(C7771g.OutlinedTextView_shadowDx, this.f5197l);
        this.f5198m = obtainStyledAttributes.getFloat(C7771g.OutlinedTextView_shadowDy, this.f5198m);
        this.f5199n = obtainStyledAttributes.getFloat(C7771g.OutlinedTextView_shadowRadius, this.f5199n);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C7771g.TextView, i, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(C7771g.TextView_android_textAppearance, C7674a.f19294a);
        if (C7674a.m18692a(resourceId)) {
            m6511a(resourceId);
        }
        obtainStyledAttributes2.recycle();
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
    }

    /* renamed from: a */
    private final void mo8277a() {
        int strokeSize = (int) (getStrokeSize() + 0.5f);
        super.setPaddingRelative(this.f5193h + strokeSize, this.f5194i + strokeSize, this.f5195j + strokeSize, this.f5196k + strokeSize);
    }
}
