package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.C11470l;

@Deprecated
public class BubbleLayout extends LinearLayout {

    /* renamed from: e */
    private C11424b f29541e;

    /* renamed from: f */
    private float f29542f;

    /* renamed from: g */
    private float f29543g;

    /* renamed from: h */
    private float f29544h;

    /* renamed from: i */
    private float f29545i;

    /* renamed from: j */
    private C11425c f29546j;

    /* renamed from: k */
    private int f29547k;

    /* renamed from: l */
    private float f29548l;

    /* renamed from: m */
    private int f29549m;

    public BubbleLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    static float m29406a(float f, Context context) {
        return f * ((float) (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    /* renamed from: b */
    private void m29409b() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int a = this.f29541e.mo33261a();
        if (a == 0) {
            paddingLeft = (int) (((float) paddingLeft) - this.f29542f);
        } else if (a == 1) {
            paddingRight = (int) (((float) paddingRight) - this.f29542f);
        } else if (a == 2) {
            paddingTop = (int) (((float) paddingTop) - this.f29543g);
        } else if (a == 3) {
            paddingBottom = (int) (((float) paddingBottom) - this.f29543g);
        }
        float f = this.f29548l;
        if (f > 0.0f) {
            paddingLeft = (int) (((float) paddingLeft) - f);
            paddingRight = (int) (((float) paddingRight) - f);
            paddingTop = (int) (((float) paddingTop) - f);
            paddingBottom = (int) (((float) paddingBottom) - f);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C11425c cVar = this.f29546j;
        if (cVar != null) {
            cVar.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public C11424b getArrowDirection() {
        return this.f29541e;
    }

    public float getArrowHeight() {
        return this.f29543g;
    }

    public float getArrowPosition() {
        return this.f29544h;
    }

    public float getArrowWidth() {
        return this.f29542f;
    }

    public int getBubbleColor() {
        return this.f29547k;
    }

    public float getCornersRadius() {
        return this.f29545i;
    }

    public int getStrokeColor() {
        return this.f29549m;
    }

    public float getStrokeWidth() {
        return this.f29548l;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m29408a(0, getWidth(), 0, getHeight());
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C11470l.mapbox_BubbleLayout);
        this.f29541e = new C11424b(obtainStyledAttributes.getInt(C11470l.mapbox_BubbleLayout_mapbox_bl_arrowDirection, 0));
        this.f29542f = obtainStyledAttributes.getDimension(C11470l.mapbox_BubbleLayout_mapbox_bl_arrowWidth, m29406a(8.0f, context));
        this.f29543g = obtainStyledAttributes.getDimension(C11470l.mapbox_BubbleLayout_mapbox_bl_arrowHeight, m29406a(8.0f, context));
        this.f29544h = obtainStyledAttributes.getDimension(C11470l.mapbox_BubbleLayout_mapbox_bl_arrowPosition, m29406a(12.0f, context));
        this.f29545i = obtainStyledAttributes.getDimension(C11470l.mapbox_BubbleLayout_mapbox_bl_cornersRadius, 0.0f);
        this.f29547k = obtainStyledAttributes.getColor(C11470l.mapbox_BubbleLayout_mapbox_bl_bubbleColor, -1);
        this.f29548l = obtainStyledAttributes.getDimension(C11470l.mapbox_BubbleLayout_mapbox_bl_strokeWidth, -1.0f);
        this.f29549m = obtainStyledAttributes.getColor(C11470l.mapbox_BubbleLayout_mapbox_bl_strokeColor, -7829368);
        obtainStyledAttributes.recycle();
        m29407a();
    }

    /* renamed from: a */
    public BubbleLayout mo33177a(float f) {
        m29409b();
        this.f29544h = f;
        m29407a();
        return this;
    }

    /* renamed from: a */
    private void m29407a() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int a = this.f29541e.mo33261a();
        if (a == 0) {
            paddingLeft = (int) (((float) paddingLeft) + this.f29542f);
        } else if (a == 1) {
            paddingRight = (int) (((float) paddingRight) + this.f29542f);
        } else if (a == 2) {
            paddingTop = (int) (((float) paddingTop) + this.f29543g);
        } else if (a == 3) {
            paddingBottom = (int) (((float) paddingBottom) + this.f29543g);
        }
        float f = this.f29548l;
        if (f > 0.0f) {
            paddingLeft = (int) (((float) paddingLeft) + f);
            paddingRight = (int) (((float) paddingRight) + f);
            paddingTop = (int) (((float) paddingTop) + f);
            paddingBottom = (int) (((float) paddingBottom) + f);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* renamed from: a */
    private void m29408a(int i, int i2, int i3, int i4) {
        if (i2 >= i && i4 >= i3) {
            C11425c cVar = new C11425c(new RectF((float) i, (float) i3, (float) i2, (float) i4), this.f29541e, this.f29542f, this.f29543g, this.f29544h, this.f29545i, this.f29547k, this.f29548l, this.f29549m);
            this.f29546j = cVar;
        }
    }
}
