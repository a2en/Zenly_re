package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7526f;
import p214e.p215a.C7530j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: e */
    private boolean f744e;

    /* renamed from: f */
    private View f745f;

    /* renamed from: g */
    private View f746g;

    /* renamed from: h */
    private View f747h;

    /* renamed from: i */
    Drawable f748i;

    /* renamed from: j */
    Drawable f749j;

    /* renamed from: k */
    Drawable f750k;

    /* renamed from: l */
    boolean f751l;

    /* renamed from: m */
    boolean f752m;

    /* renamed from: n */
    private int f753n;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m729a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m730b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f748i;
        if (drawable != null && drawable.isStateful()) {
            this.f748i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f749j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f749j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f750k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f750k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f745f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f748i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f749j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f750k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f746g = findViewById(C7526f.action_bar);
        this.f747h = findViewById(C7526f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f744e || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f745f;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f751l) {
            Drawable drawable = this.f750k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f748i != null) {
                if (this.f746g.getVisibility() == 0) {
                    this.f748i.setBounds(this.f746g.getLeft(), this.f746g.getTop(), this.f746g.getRight(), this.f746g.getBottom());
                } else {
                    View view2 = this.f747h;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f748i.setBounds(0, 0, 0, 0);
                    } else {
                        this.f748i.setBounds(this.f747h.getLeft(), this.f747h.getTop(), this.f747h.getRight(), this.f747h.getBottom());
                    }
                }
                z3 = true;
            }
            this.f752m = z4;
            if (z4) {
                Drawable drawable2 = this.f749j;
                if (drawable2 != null) {
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f746g == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int i3 = this.f753n;
            if (i3 >= 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
        if (this.f746g != null) {
            int mode = MeasureSpec.getMode(i2);
            View view = this.f745f;
            if (!(view == null || view.getVisibility() == 8 || mode == 1073741824)) {
                int i4 = !m730b(this.f746g) ? m729a(this.f746g) : !m730b(this.f747h) ? m729a(this.f747h) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + m729a(this.f745f), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f748i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f748i);
        }
        this.f748i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f746g;
            if (view != null) {
                this.f748i.setBounds(view.getLeft(), this.f746g.getTop(), this.f746g.getRight(), this.f746g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f751l ? !(this.f748i == null && this.f749j == null) : this.f750k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f750k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f750k);
        }
        this.f750k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f751l) {
                Drawable drawable3 = this.f750k;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.f751l ? this.f748i == null && this.f749j == null : this.f750k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f749j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f749j);
        }
        this.f749j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f752m) {
                Drawable drawable3 = this.f749j;
                if (drawable3 != null) {
                    drawable3.setBounds(this.f745f.getLeft(), this.f745f.getTop(), this.f745f.getRight(), this.f745f.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.f751l ? !(this.f748i == null && this.f749j == null) : this.f750k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0280t tVar) {
        View view = this.f745f;
        if (view != null) {
            removeView(view);
        }
        this.f745f = tVar;
        if (tVar != null) {
            addView(tVar);
            ViewGroup.LayoutParams layoutParams = tVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            tVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f744e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f748i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f749j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f750k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f748i && !this.f751l) || (drawable == this.f749j && this.f752m) || ((drawable == this.f750k && this.f751l) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.m2822a((View) this, (Drawable) new C0242b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7530j.ActionBar);
        this.f748i = obtainStyledAttributes.getDrawable(C7530j.ActionBar_background);
        this.f749j = obtainStyledAttributes.getDrawable(C7530j.ActionBar_backgroundStacked);
        this.f753n = obtainStyledAttributes.getDimensionPixelSize(C7530j.ActionBar_height, -1);
        if (getId() == C7526f.split_action_bar) {
            this.f751l = true;
            this.f750k = obtainStyledAttributes.getDrawable(C7530j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f751l ? this.f748i == null && this.f749j == null : this.f750k == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
