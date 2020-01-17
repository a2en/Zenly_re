package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView.C11924c;
import com.theartofdev.edmodo.cropper.CropImageView.C11925d;
import java.util.Arrays;

public class CropOverlayView extends View {

    /* renamed from: A */
    private int f31009A;

    /* renamed from: B */
    private float f31010B;

    /* renamed from: C */
    private C11925d f31011C;

    /* renamed from: D */
    private C11924c f31012D;

    /* renamed from: E */
    private final Rect f31013E;

    /* renamed from: F */
    private boolean f31014F;

    /* renamed from: G */
    private Integer f31015G;

    /* renamed from: e */
    private ScaleGestureDetector f31016e;

    /* renamed from: f */
    private boolean f31017f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C11938e f31018g;

    /* renamed from: h */
    private CropWindowChangeListener f31019h;

    /* renamed from: i */
    private final RectF f31020i;

    /* renamed from: j */
    private Paint f31021j;

    /* renamed from: k */
    private Paint f31022k;

    /* renamed from: l */
    private Paint f31023l;

    /* renamed from: m */
    private Paint f31024m;

    /* renamed from: n */
    private Path f31025n;

    /* renamed from: o */
    private final float[] f31026o;

    /* renamed from: p */
    private final RectF f31027p;

    /* renamed from: q */
    private int f31028q;

    /* renamed from: r */
    private int f31029r;

    /* renamed from: s */
    private float f31030s;

    /* renamed from: t */
    private float f31031t;

    /* renamed from: u */
    private float f31032u;

    /* renamed from: v */
    private float f31033v;

    /* renamed from: w */
    private float f31034w;

    /* renamed from: x */
    private C11939f f31035x;

    /* renamed from: y */
    private boolean f31036y;

    /* renamed from: z */
    private int f31037z;

    public interface CropWindowChangeListener {
        void onCropWindowChanged(boolean z);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$b */
    private class C11929b extends SimpleOnScaleGestureListener {
        private C11929b() {
        }

        @TargetApi(11)
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF e = CropOverlayView.this.f31018g.mo35446e();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 < f3 && f <= f4 && f2 >= 0.0f && f3 <= CropOverlayView.this.f31018g.mo35443b() && f >= 0.0f && f4 <= CropOverlayView.this.f31018g.mo35437a()) {
                e.set(f2, f, f3, f4);
                CropOverlayView.this.f31018g.mo35441a(e);
                CropOverlayView.this.invalidate();
            }
            return true;
        }
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m31342d() {
        float max = Math.max(C11934c.m31384e(this.f31026o), 0.0f);
        float max2 = Math.max(C11934c.m31386g(this.f31026o), 0.0f);
        float min = Math.min(C11934c.m31385f(this.f31026o), (float) getWidth());
        float min2 = Math.min(C11934c.m31358a(this.f31026o), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f31014F = true;
            float f = this.f31032u;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.f31013E.width() > 0 && this.f31013E.height() > 0) {
                rectF.left = (((float) this.f31013E.left) / this.f31018g.mo35448g()) + max;
                rectF.top = (((float) this.f31013E.top) / this.f31018g.mo35447f()) + max2;
                rectF.right = rectF.left + (((float) this.f31013E.width()) / this.f31018g.mo35448g());
                rectF.bottom = rectF.top + (((float) this.f31013E.height()) / this.f31018g.mo35447f());
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.f31036y || min <= max || min2 <= max2) {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            } else if (f2 / f4 > this.f31010B) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = ((float) getWidth()) / 2.0f;
                this.f31010B = ((float) this.f31037z) / ((float) this.f31009A);
                float max3 = Math.max(this.f31018g.mo35445d(), rectF.height() * this.f31010B) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = ((float) getHeight()) / 2.0f;
                float max4 = Math.max(this.f31018g.mo35444c(), rectF.width() / this.f31010B) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            m31339b(rectF);
            this.f31018g.mo35441a(rectF);
        }
    }

    /* renamed from: e */
    private boolean m31344e() {
        float[] fArr = this.f31026o;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    /* renamed from: f */
    private void m31345f() {
        if (this.f31035x != null) {
            this.f31035x = null;
            m31340b(false);
            invalidate();
        }
    }

    /* renamed from: b */
    public boolean mo35401b() {
        return this.f31036y;
    }

    /* renamed from: c */
    public void mo35402c() {
        if (this.f31014F) {
            setCropWindowRect(C11934c.f31073b);
            m31342d();
            invalidate();
        }
    }

    public int getAspectRatioX() {
        return this.f31037z;
    }

    public int getAspectRatioY() {
        return this.f31009A;
    }

    public C11924c getCropShape() {
        return this.f31012D;
    }

    public RectF getCropWindowRect() {
        return this.f31018g.mo35446e();
    }

    public C11925d getGuidelines() {
        return this.f31011C;
    }

    public Rect getInitialCropWindowRect() {
        return this.f31013E;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m31335a(canvas);
        if (this.f31018g.mo35449h()) {
            C11925d dVar = this.f31011C;
            if (dVar == C11925d.ON) {
                m31343d(canvas);
            } else if (dVar == C11925d.ON_TOUCH && this.f31035x != null) {
                m31343d(canvas);
            }
        }
        m31338b(canvas);
        m31341c(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f31017f) {
            this.f31016e.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    m31337b(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            m31345f();
            return true;
        }
        m31334a(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f31037z != i) {
            this.f31037z = i;
            this.f31010B = ((float) this.f31037z) / ((float) this.f31009A);
            if (this.f31014F) {
                m31342d();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f31009A != i) {
            this.f31009A = i;
            this.f31010B = ((float) this.f31037z) / ((float) this.f31009A);
            if (this.f31014F) {
                m31342d();
                invalidate();
            }
        }
    }

    public void setCropShape(C11924c cVar) {
        if (this.f31012D != cVar) {
            this.f31012D = cVar;
            if (VERSION.SDK_INT <= 17) {
                if (this.f31012D == C11924c.OVAL) {
                    this.f31015G = Integer.valueOf(getLayerType());
                    if (this.f31015G.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.f31015G = null;
                    }
                } else {
                    Integer num = this.f31015G;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.f31015G = null;
                    }
                }
            }
            invalidate();
        }
    }

    public void setCropWindowChangeListener(CropWindowChangeListener cropWindowChangeListener) {
        this.f31019h = cropWindowChangeListener;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f31018g.mo35441a(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f31036y != z) {
            this.f31036y = z;
            if (this.f31014F) {
                m31342d();
                invalidate();
            }
        }
    }

    public void setGuidelines(C11925d dVar) {
        if (this.f31011C != dVar) {
            this.f31011C = dVar;
            if (this.f31014F) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f31018g.mo35442a(cropImageOptions);
        setCropShape(cropImageOptions.f30922e);
        setSnapRadius(cropImageOptions.f30923f);
        setGuidelines(cropImageOptions.f30925h);
        setFixedAspectRatio(cropImageOptions.f30933p);
        setAspectRatioX(cropImageOptions.f30934q);
        setAspectRatioY(cropImageOptions.f30935r);
        mo35400a(cropImageOptions.f30930m);
        this.f31033v = cropImageOptions.f30924g;
        this.f31032u = cropImageOptions.f30932o;
        this.f31021j = m31331a(cropImageOptions.f30936s, cropImageOptions.f30937t);
        this.f31030s = cropImageOptions.f30939v;
        this.f31031t = cropImageOptions.f30940w;
        this.f31022k = m31331a(cropImageOptions.f30938u, cropImageOptions.f30941x);
        this.f31023l = m31331a(cropImageOptions.f30942y, cropImageOptions.f30943z);
        this.f31024m = m31332a(cropImageOptions.f30896A);
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f31013E;
        if (rect == null) {
            rect = C11934c.f31072a;
        }
        rect2.set(rect);
        if (this.f31014F) {
            m31342d();
            invalidate();
            m31340b(false);
        }
    }

    public void setSnapRadius(float f) {
        this.f31034w = f;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31018g = new C11938e();
        this.f31020i = new RectF();
        this.f31025n = new Path();
        this.f31026o = new float[8];
        this.f31027p = new RectF();
        this.f31010B = ((float) this.f31037z) / ((float) this.f31009A);
        this.f31013E = new Rect();
    }

    /* renamed from: b */
    private void m31339b(RectF rectF) {
        if (rectF.width() < this.f31018g.mo35445d()) {
            float d = (this.f31018g.mo35445d() - rectF.width()) / 2.0f;
            rectF.left -= d;
            rectF.right += d;
        }
        if (rectF.height() < this.f31018g.mo35444c()) {
            float c = (this.f31018g.mo35444c() - rectF.height()) / 2.0f;
            rectF.top -= c;
            rectF.bottom += c;
        }
        if (rectF.width() > this.f31018g.mo35443b()) {
            float width = (rectF.width() - this.f31018g.mo35443b()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f31018g.mo35437a()) {
            float height = (rectF.height() - this.f31018g.mo35437a()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m31336a(rectF);
        if (this.f31027p.width() > 0.0f && this.f31027p.height() > 0.0f) {
            float max = Math.max(this.f31027p.left, 0.0f);
            float max2 = Math.max(this.f31027p.top, 0.0f);
            float min = Math.min(this.f31027p.right, (float) getWidth());
            float min2 = Math.min(this.f31027p.bottom, (float) getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f31036y && ((double) Math.abs(rectF.width() - (rectF.height() * this.f31010B))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f31010B) {
                float abs = Math.abs((rectF.height() * this.f31010B) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f31010B) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: a */
    public void mo35396a() {
        RectF cropWindowRect = getCropWindowRect();
        m31339b(cropWindowRect);
        this.f31018g.mo35441a(cropWindowRect);
    }

    /* renamed from: c */
    private void m31341c(Canvas canvas) {
        if (this.f31022k != null) {
            Paint paint = this.f31021j;
            float f = 0.0f;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.f31022k.getStrokeWidth();
            float f2 = strokeWidth2 / 2.0f;
            if (this.f31012D == C11924c.RECTANGLE) {
                f = this.f31030s;
            }
            float f3 = f + f2;
            RectF e = this.f31018g.mo35446e();
            e.inset(f3, f3);
            float f4 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f5 = f2 + f4;
            float f6 = e.left;
            float f7 = f6 - f4;
            float f8 = e.top;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f7, f8 - f5, f6 - f4, f8 + this.f31031t, this.f31022k);
            float f9 = e.left;
            float f10 = f9 - f5;
            float f11 = e.top;
            canvas2.drawLine(f10, f11 - f4, f9 + this.f31031t, f11 - f4, this.f31022k);
            float f12 = e.right;
            float f13 = f12 + f4;
            float f14 = e.top;
            canvas2.drawLine(f13, f14 - f5, f12 + f4, f14 + this.f31031t, this.f31022k);
            float f15 = e.right;
            float f16 = f15 + f5;
            float f17 = e.top;
            canvas2.drawLine(f16, f17 - f4, f15 - this.f31031t, f17 - f4, this.f31022k);
            float f18 = e.left;
            float f19 = f18 - f4;
            float f20 = e.bottom;
            canvas2.drawLine(f19, f20 + f5, f18 - f4, f20 - this.f31031t, this.f31022k);
            float f21 = e.left;
            float f22 = f21 - f5;
            float f23 = e.bottom;
            canvas2.drawLine(f22, f23 + f4, f21 + this.f31031t, f23 + f4, this.f31022k);
            float f24 = e.right;
            float f25 = f24 + f4;
            float f26 = e.bottom;
            canvas2.drawLine(f25, f26 + f5, f24 + f4, f26 - this.f31031t, this.f31022k);
            float f27 = e.right;
            float f28 = f27 + f5;
            float f29 = e.bottom;
            canvas2.drawLine(f28, f29 + f4, f27 - this.f31031t, f29 + f4, this.f31022k);
        }
    }

    /* renamed from: a */
    public void mo35399a(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f31026o, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f31026o, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f31026o, 0, fArr.length);
            }
            this.f31028q = i;
            this.f31029r = i2;
            RectF e = this.f31018g.mo35446e();
            if (e.width() == 0.0f || e.height() == 0.0f) {
                m31342d();
            }
        }
    }

    /* renamed from: a */
    public boolean mo35400a(boolean z) {
        if (this.f31017f == z) {
            return false;
        }
        this.f31017f = z;
        if (this.f31017f && this.f31016e == null) {
            this.f31016e = new ScaleGestureDetector(getContext(), new C11929b());
        }
        return true;
    }

    /* renamed from: a */
    public void mo35398a(int i, int i2) {
        this.f31018g.mo35440a(i, i2);
    }

    /* renamed from: a */
    public void mo35397a(float f, float f2, float f3, float f4) {
        this.f31018g.mo35439a(f, f2, f3, f4);
    }

    /* renamed from: a */
    private void m31335a(Canvas canvas) {
        RectF e = this.f31018g.mo35446e();
        float max = Math.max(C11934c.m31384e(this.f31026o), 0.0f);
        float max2 = Math.max(C11934c.m31386g(this.f31026o), 0.0f);
        float min = Math.min(C11934c.m31385f(this.f31026o), (float) getWidth());
        float min2 = Math.min(C11934c.m31358a(this.f31026o), (float) getHeight());
        if (this.f31012D != C11924c.RECTANGLE) {
            this.f31025n.reset();
            if (VERSION.SDK_INT > 17 || this.f31012D != C11924c.OVAL) {
                this.f31020i.set(e.left, e.top, e.right, e.bottom);
            } else {
                this.f31020i.set(e.left + 2.0f, e.top + 2.0f, e.right - 2.0f, e.bottom - 2.0f);
            }
            this.f31025n.addOval(this.f31020i, Direction.CW);
            canvas.save();
            if (VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f31025n);
            } else {
                canvas.clipPath(this.f31025n, Op.XOR);
            }
            canvas.drawRect(max, max2, min, min2, this.f31024m);
            canvas.restore();
        } else if (!m31344e() || VERSION.SDK_INT <= 17) {
            Canvas canvas2 = canvas;
            float f = max;
            float f2 = min;
            canvas2.drawRect(f, max2, f2, e.top, this.f31024m);
            canvas2.drawRect(f, e.bottom, f2, min2, this.f31024m);
            canvas2.drawRect(f, e.top, e.left, e.bottom, this.f31024m);
            canvas.drawRect(e.right, e.top, min, e.bottom, this.f31024m);
        } else {
            this.f31025n.reset();
            Path path = this.f31025n;
            float[] fArr = this.f31026o;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.f31025n;
            float[] fArr2 = this.f31026o;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.f31025n;
            float[] fArr3 = this.f31026o;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.f31025n;
            float[] fArr4 = this.f31026o;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.f31025n.close();
            canvas.save();
            if (VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f31025n);
            } else {
                canvas.clipPath(this.f31025n, Op.INTERSECT);
            }
            canvas.clipRect(e, Op.XOR);
            canvas.drawRect(max, max2, min, min2, this.f31024m);
            canvas.restore();
        }
    }

    /* renamed from: b */
    private void m31338b(Canvas canvas) {
        Paint paint = this.f31021j;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF e = this.f31018g.mo35446e();
            float f = strokeWidth / 2.0f;
            e.inset(f, f);
            if (this.f31012D == C11924c.RECTANGLE) {
                canvas.drawRect(e, this.f31021j);
            } else {
                canvas.drawOval(e, this.f31021j);
            }
        }
    }

    /* renamed from: d */
    private void m31343d(Canvas canvas) {
        if (this.f31023l != null) {
            Paint paint = this.f31021j;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF e = this.f31018g.mo35446e();
            e.inset(strokeWidth, strokeWidth);
            float width = e.width() / 3.0f;
            float height = e.height() / 3.0f;
            if (this.f31012D == C11924c.OVAL) {
                float width2 = (e.width() / 2.0f) - strokeWidth;
                float height2 = (e.height() / 2.0f) - strokeWidth;
                float f = e.left + width;
                float f2 = e.right - width;
                float sin = (float) (((double) height2) * Math.sin(Math.acos((double) ((width2 - width) / width2))));
                canvas.drawLine(f, (e.top + height2) - sin, f, (e.bottom - height2) + sin, this.f31023l);
                canvas.drawLine(f2, (e.top + height2) - sin, f2, (e.bottom - height2) + sin, this.f31023l);
                float f3 = e.top + height;
                float f4 = e.bottom - height;
                float cos = (float) (((double) width2) * Math.cos(Math.asin((double) ((height2 - height) / height2))));
                canvas.drawLine((e.left + width2) - cos, f3, (e.right - width2) + cos, f3, this.f31023l);
                canvas.drawLine((e.left + width2) - cos, f4, (e.right - width2) + cos, f4, this.f31023l);
                return;
            }
            float f5 = e.left + width;
            float f6 = e.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f5, e.top, f5, e.bottom, this.f31023l);
            canvas.drawLine(f6, e.top, f6, e.bottom, this.f31023l);
            float f7 = e.top + height;
            float f8 = e.bottom - height;
            canvas2.drawLine(e.left, f7, e.right, f7, this.f31023l);
            canvas.drawLine(e.left, f8, e.right, f8, this.f31023l);
        }
    }

    /* renamed from: b */
    private void m31337b(float f, float f2) {
        if (this.f31035x != null) {
            float f3 = this.f31034w;
            RectF e = this.f31018g.mo35446e();
            this.f31035x.mo35450a(e, f, f2, this.f31027p, this.f31028q, this.f31029r, m31336a(e) ? 0.0f : f3, this.f31036y, this.f31010B);
            this.f31018g.mo35441a(e);
            m31340b(true);
            invalidate();
        }
    }

    /* renamed from: a */
    private static Paint m31332a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    /* renamed from: b */
    private void m31340b(boolean z) {
        try {
            if (this.f31019h != null) {
                this.f31019h.onCropWindowChanged(z);
            }
        } catch (Exception e) {
            Log.e("AIC", "Exception in crop window changed", e);
        }
    }

    /* renamed from: a */
    private static Paint m31331a(float f, int i) {
        if (f <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: a */
    private void m31334a(float f, float f2) {
        this.f31035x = this.f31018g.mo35438a(f, f2, this.f31033v, this.f31012D);
        if (this.f31035x != null) {
            invalidate();
        }
    }

    /* renamed from: a */
    private boolean m31336a(RectF rectF) {
        RectF rectF2 = rectF;
        float e = C11934c.m31384e(this.f31026o);
        float g = C11934c.m31386g(this.f31026o);
        float f = C11934c.m31385f(this.f31026o);
        float a = C11934c.m31358a(this.f31026o);
        if (!m31344e()) {
            this.f31027p.set(e, g, f, a);
            return false;
        }
        float[] fArr = this.f31026o;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[6];
        float f7 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f2 = fArr[6];
                f3 = fArr[7];
                f4 = fArr[2];
                f5 = fArr[3];
                f6 = fArr[4];
                f7 = fArr[5];
            } else {
                f2 = fArr[4];
                f3 = fArr[5];
                f4 = fArr[0];
                f5 = fArr[1];
                f6 = fArr[2];
                f7 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f2 = fArr[2];
            f3 = fArr[3];
            f4 = fArr[6];
            f5 = fArr[7];
            f6 = fArr[0];
            f7 = fArr[1];
        }
        float f8 = (f7 - f3) / (f6 - f2);
        float f9 = -1.0f / f8;
        float f10 = f3 - (f8 * f2);
        float f11 = f3 - (f2 * f9);
        float f12 = f5 - (f8 * f4);
        float f13 = f5 - (f4 * f9);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f14 = rectF2.left;
        float f15 = centerY / (centerX - f14);
        float f16 = -f15;
        float f17 = rectF2.top;
        float f18 = f17 - (f14 * f15);
        float f19 = rectF2.right;
        float f20 = f17 - (f16 * f19);
        float f21 = f8 - f15;
        float f22 = (f18 - f10) / f21;
        float max = Math.max(e, f22 < f19 ? f22 : e);
        float f23 = (f18 - f11) / (f9 - f15);
        if (f23 >= rectF2.right) {
            f23 = max;
        }
        float max2 = Math.max(max, f23);
        float f24 = f9 - f16;
        float f25 = (f20 - f13) / f24;
        if (f25 >= rectF2.right) {
            f25 = max2;
        }
        float max3 = Math.max(max2, f25);
        float f26 = (f20 - f11) / f24;
        if (f26 <= rectF2.left) {
            f26 = f;
        }
        float min = Math.min(f, f26);
        float f27 = (f20 - f12) / (f8 - f16);
        if (f27 <= rectF2.left) {
            f27 = min;
        }
        float min2 = Math.min(min, f27);
        float f28 = (f18 - f12) / f21;
        if (f28 <= rectF2.left) {
            f28 = min2;
        }
        float min3 = Math.min(min2, f28);
        float max4 = Math.max(g, Math.max((f8 * max3) + f10, (f9 * min3) + f11));
        float min4 = Math.min(a, Math.min((f9 * max3) + f13, (f8 * min3) + f12));
        RectF rectF3 = this.f31027p;
        rectF3.left = max3;
        rectF3.top = max4;
        rectF3.right = min3;
        rectF3.bottom = min4;
        return true;
    }
}
