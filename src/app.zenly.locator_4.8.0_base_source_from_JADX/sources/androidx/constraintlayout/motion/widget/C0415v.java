package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0481f;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import com.android.volley.toolbox.C8733j;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.v */
class C0415v {

    /* renamed from: s */
    private static final float[][] f1743s = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}};

    /* renamed from: t */
    private static final float[][] f1744t = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: a */
    private int f1745a = 0;

    /* renamed from: b */
    private int f1746b = 0;

    /* renamed from: c */
    private int f1747c = 0;

    /* renamed from: d */
    private int f1748d = -1;

    /* renamed from: e */
    private int f1749e = -1;

    /* renamed from: f */
    private float f1750f = 0.5f;

    /* renamed from: g */
    private float f1751g = 0.5f;

    /* renamed from: h */
    private float f1752h = 0.0f;

    /* renamed from: i */
    private float f1753i = 1.0f;

    /* renamed from: j */
    private boolean f1754j = false;

    /* renamed from: k */
    private float[] f1755k = new float[2];

    /* renamed from: l */
    private float f1756l;

    /* renamed from: m */
    private float f1757m;

    /* renamed from: n */
    private final MotionLayout f1758n;

    /* renamed from: o */
    private float f1759o = 4.0f;

    /* renamed from: p */
    private float f1760p = 1.2f;

    /* renamed from: q */
    private boolean f1761q = true;

    /* renamed from: r */
    private float f1762r = 1.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.v$a */
    class C0416a implements OnTouchListener {
        C0416a(C0415v vVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.v$b */
    class C0417b implements OnScrollChangeListener {
        C0417b(C0415v vVar) {
        }

        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    C0415v(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f1758n = motionLayout;
        m1819a(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: a */
    private void m1819a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.OnSwipe);
        m1820a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2443b(float f, float f2) {
        float f3;
        float progress = this.f1758n.getProgress();
        if (!this.f1754j) {
            this.f1754j = true;
            this.f1758n.setProgress(progress);
        }
        this.f1758n.mo2251a(this.f1748d, progress, this.f1751g, this.f1750f, this.f1755k);
        float f4 = this.f1752h;
        float[] fArr = this.f1755k;
        if (((double) Math.abs((f4 * fArr[0]) + (this.f1753i * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f1755k;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f1752h;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f1755k[0];
        } else {
            f3 = (f2 * this.f1753i) / this.f1755k[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.f1758n.getProgress()) {
            this.f1758n.setProgress(max);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2444c(float f, float f2) {
        float f3;
        boolean z = false;
        this.f1754j = false;
        float progress = this.f1758n.getProgress();
        this.f1758n.mo2251a(this.f1748d, progress, this.f1751g, this.f1750f, this.f1755k);
        float f4 = this.f1752h;
        float[] fArr = this.f1755k;
        float f5 = fArr[0];
        float f6 = this.f1753i;
        float f7 = fArr[1];
        if (f4 != 0.0f) {
            f3 = (f * f4) / fArr[0];
        } else {
            f3 = (f2 * f6) / fArr[1];
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            float f8 = 1.0f;
            boolean z2 = progress != 1.0f;
            if (this.f1747c != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.f1758n;
                int i = this.f1747c;
                if (((double) progress) < 0.5d) {
                    f8 = 0.0f;
                }
                motionLayout.mo2250a(i, f8, f3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2447d(float f, float f2) {
        this.f1756l = f;
        this.f1757m = f2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2448e(float f, float f2) {
        this.f1756l = f;
        this.f1757m = f2;
        this.f1754j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1752h);
        sb.append(" , ");
        sb.append(this.f1753i);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2446d() {
        View findViewById = this.f1758n.findViewById(this.f1748d);
        if (findViewById == null) {
            Log.w("TouchResponse", " cannot find view to handle touch");
        }
        if (findViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) findViewById;
            nestedScrollView.setOnTouchListener(new C0416a(this));
            nestedScrollView.setOnScrollChangeListener(new C0417b(this));
        }
    }

    /* renamed from: a */
    private void m1820a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C0481f.OnSwipe_touchAnchorId) {
                this.f1748d = typedArray.getResourceId(index, this.f1748d);
            } else if (index == C0481f.OnSwipe_touchAnchorSide) {
                this.f1745a = typedArray.getInt(index, this.f1745a);
                float[][] fArr = f1743s;
                int i2 = this.f1745a;
                this.f1751g = fArr[i2][0];
                this.f1750f = fArr[i2][1];
            } else if (index == C0481f.OnSwipe_dragDirection) {
                this.f1746b = typedArray.getInt(index, this.f1746b);
                float[][] fArr2 = f1744t;
                int i3 = this.f1746b;
                this.f1752h = fArr2[i3][0];
                this.f1753i = fArr2[i3][1];
            } else if (index == C0481f.OnSwipe_maxVelocity) {
                this.f1759o = typedArray.getFloat(index, this.f1759o);
            } else if (index == C0481f.OnSwipe_maxAcceleration) {
                this.f1760p = typedArray.getFloat(index, this.f1760p);
            } else if (index == C0481f.OnSwipe_moveWhenScrollAtTop) {
                this.f1761q = typedArray.getBoolean(index, this.f1761q);
            } else if (index == C0481f.OnSwipe_dragScale) {
                this.f1762r = typedArray.getFloat(index, this.f1762r);
            } else if (index == C0481f.OnSwipe_touchRegionId) {
                this.f1749e = typedArray.getResourceId(index, this.f1749e);
            } else if (index == C0481f.OnSwipe_onTouchUp) {
                this.f1747c = typedArray.getInt(index, this.f1747c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo2445c() {
        return this.f1761q;
    }

    /* renamed from: b */
    public float mo2442b() {
        return this.f1759o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2441a(MotionEvent motionEvent, VelocityTracker velocityTracker, int i, C0364q qVar) {
        float f;
        float f2;
        velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            float f3 = 1.0f;
            if (action == 1) {
                this.f1754j = false;
                velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
                float xVelocity = velocityTracker.getXVelocity();
                float yVelocity = velocityTracker.getYVelocity();
                float progress = this.f1758n.getProgress();
                int i2 = this.f1748d;
                if (i2 != -1) {
                    this.f1758n.mo2251a(i2, progress, this.f1751g, this.f1750f, this.f1755k);
                } else {
                    float min = (float) Math.min(this.f1758n.getWidth(), this.f1758n.getHeight());
                    float[] fArr = this.f1755k;
                    fArr[0] = min;
                    fArr[1] = min;
                }
                float f4 = this.f1752h;
                float[] fArr2 = this.f1755k;
                float f5 = fArr2[0];
                float f6 = fArr2[1];
                if (f4 != 0.0f) {
                    f = xVelocity / fArr2[0];
                } else {
                    f = yVelocity / fArr2[1];
                }
                if (!Float.isNaN(f)) {
                    progress += f / 3.0f;
                }
                if (progress != 0.0f && progress != 1.0f) {
                    int i3 = this.f1747c;
                    if (i3 != 3) {
                        MotionLayout motionLayout = this.f1758n;
                        if (((double) progress) < 0.5d) {
                            f3 = 0.0f;
                        }
                        motionLayout.mo2250a(i3, f3, f);
                    }
                }
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f1757m;
                float rawX = motionEvent.getRawX() - this.f1756l;
                if (Math.abs((this.f1752h * rawX) + (this.f1753i * rawY)) > 10.0f || this.f1754j) {
                    float progress2 = this.f1758n.getProgress();
                    if (!this.f1754j) {
                        this.f1754j = true;
                        this.f1758n.setProgress(progress2);
                    }
                    int i4 = this.f1748d;
                    if (i4 != -1) {
                        this.f1758n.mo2251a(i4, progress2, this.f1751g, this.f1750f, this.f1755k);
                    } else {
                        float min2 = (float) Math.min(this.f1758n.getWidth(), this.f1758n.getHeight());
                        float[] fArr3 = this.f1755k;
                        fArr3[0] = min2;
                        fArr3[1] = min2;
                    }
                    float f7 = this.f1752h;
                    float[] fArr4 = this.f1755k;
                    if (((double) Math.abs(((f7 * fArr4[0]) + (this.f1753i * fArr4[1])) * this.f1762r)) < 0.01d) {
                        float[] fArr5 = this.f1755k;
                        fArr5[0] = 0.01f;
                        fArr5[1] = 0.01f;
                    }
                    if (this.f1752h != 0.0f) {
                        f2 = rawX / this.f1755k[0];
                    } else {
                        f2 = rawY / this.f1755k[1];
                    }
                    float max = Math.max(Math.min(progress2 + f2, 1.0f), 0.0f);
                    if (max != this.f1758n.getProgress()) {
                        this.f1758n.setProgress(max);
                    }
                    this.f1756l = motionEvent.getRawX();
                    this.f1757m = motionEvent.getRawY();
                }
            }
        } else {
            this.f1756l = motionEvent.getRawX();
            this.f1757m = motionEvent.getRawY();
            this.f1754j = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo2438a() {
        return this.f1760p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public RectF mo2440a(ViewGroup viewGroup, RectF rectF) {
        int i = this.f1749e;
        if (i == -1) {
            return null;
        }
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo2439a(float f, float f2) {
        return (f * this.f1752h) + (f2 * this.f1753i);
    }
}
