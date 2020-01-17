package app.zenly.locator.core.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import app.zenly.locator.C3892m;
import java.util.ArrayList;
import java.util.List;

public class ElasticDragDismissFrameLayout extends FrameLayout {

    /* renamed from: e */
    private float f9065e;

    /* renamed from: f */
    private float f9066f;

    /* renamed from: g */
    private float f9067g;

    /* renamed from: h */
    private boolean f9068h;

    /* renamed from: i */
    private float f9069i;

    /* renamed from: j */
    private float f9070j;

    /* renamed from: k */
    private boolean f9071k;

    /* renamed from: l */
    private boolean f9072l;

    /* renamed from: m */
    private int f9073m;

    /* renamed from: n */
    private List<C3253a> f9074n;

    /* renamed from: o */
    private TimeInterpolator f9075o;

    /* renamed from: app.zenly.locator.core.widget.ElasticDragDismissFrameLayout$a */
    public static abstract class C3253a {
        /* renamed from: a */
        public void mo9684a() {
        }

        /* renamed from: a */
        public void mo9685a(float f, float f2, float f3, float f4) {
        }
    }

    public ElasticDragDismissFrameLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public void mo9676a(C3253a aVar) {
        if (this.f9074n == null) {
            this.f9074n = new ArrayList();
        }
        this.f9074n.add(aVar);
    }

    /* renamed from: b */
    public void mo9677b(C3253a aVar) {
        List<C3253a> list = this.f9074n;
        if (list != null && list.size() > 0) {
            this.f9074n.remove(aVar);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f9073m = motionEvent.getAction();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if ((this.f9071k && i2 > 0) || (this.f9072l && i2 < 0)) {
            m10324a(i2);
            iArr[1] = i2;
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m10324a(i4);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.f9066f;
        if (f > 0.0f) {
            this.f9065e = ((float) i2) * f;
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        if (Math.abs(this.f9070j) >= this.f9065e) {
            m10322a();
            return;
        }
        if (this.f9073m == 0) {
            setTranslationY(0.0f);
            setScaleX(1.0f);
            setScaleY(1.0f);
        } else {
            animate().translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(this.f9075o).setListener(null).start();
        }
        this.f9070j = 0.0f;
        this.f9072l = false;
        this.f9071k = false;
        m10323a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public ElasticDragDismissFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ElasticDragDismissFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9065e = Float.MAX_VALUE;
        this.f9066f = -1.0f;
        this.f9067g = 1.0f;
        boolean z = false;
        this.f9068h = false;
        this.f9069i = 0.8f;
        this.f9071k = false;
        this.f9072l = false;
        this.f9075o = AnimationUtils.loadInterpolator(context, 17563661);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3892m.ElasticDragDismissFrameLayout, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f9065e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } else if (obtainStyledAttributes.hasValue(1)) {
            this.f9066f = obtainStyledAttributes.getFloat(1, this.f9066f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.f9067g = obtainStyledAttributes.getFloat(2, this.f9067g);
            if (this.f9067g != 1.0f) {
                z = true;
            }
            this.f9068h = z;
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.f9069i = obtainStyledAttributes.getFloat(3, this.f9069i);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m10324a(int i) {
        if (i != 0) {
            this.f9070j += (float) i;
            float f = 0.0f;
            if (i < 0 && !this.f9072l && !this.f9071k) {
                this.f9071k = true;
                if (this.f9068h) {
                    setPivotY((float) getHeight());
                }
            } else if (i > 0 && !this.f9071k && !this.f9072l) {
                this.f9072l = true;
                if (this.f9068h) {
                    setPivotY(0.0f);
                }
            }
            float log10 = (float) Math.log10((double) ((Math.abs(this.f9070j) / this.f9065e) + 1.0f));
            float f2 = this.f9065e * log10 * this.f9069i;
            if (this.f9072l) {
                f2 *= -1.0f;
            }
            setTranslationY(f2);
            if (this.f9068h) {
                float f3 = 1.0f - ((1.0f - this.f9067g) * log10);
                setScaleX(f3);
                setScaleY(f3);
            }
            if ((!this.f9071k || this.f9070j < 0.0f) && (!this.f9072l || this.f9070j > 0.0f)) {
                f = f2;
            } else {
                this.f9070j = 0.0f;
                this.f9072l = false;
                this.f9071k = false;
                setTranslationY(0.0f);
                setScaleX(1.0f);
                setScaleY(1.0f);
                log10 = 0.0f;
            }
            m10323a(log10, f, Math.min(1.0f, Math.abs(this.f9070j) / this.f9065e), this.f9070j);
        }
    }

    /* renamed from: a */
    private void m10323a(float f, float f2, float f3, float f4) {
        List<C3253a> list = this.f9074n;
        if (list != null && !list.isEmpty()) {
            for (C3253a a : this.f9074n) {
                a.mo9685a(f, f2, f3, f4);
            }
        }
    }

    /* renamed from: a */
    private void m10322a() {
        List<C3253a> list = this.f9074n;
        if (list != null && !list.isEmpty()) {
            for (C3253a a : this.f9074n) {
                a.mo9684a();
            }
        }
    }
}
