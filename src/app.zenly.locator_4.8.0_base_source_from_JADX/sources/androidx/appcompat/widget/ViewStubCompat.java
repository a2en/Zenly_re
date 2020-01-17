package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p214e.p215a.C7530j;

public final class ViewStubCompat extends View {

    /* renamed from: e */
    private int f1074e;

    /* renamed from: f */
    private int f1075f;

    /* renamed from: g */
    private WeakReference<View> f1076g;

    /* renamed from: h */
    private LayoutInflater f1077h;

    /* renamed from: i */
    private OnInflateListener f1078i;

    public interface OnInflateListener {
        void onInflate(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo1838a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1074e != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1077h;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1074e, viewGroup, false);
            int i = this.f1075f;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1076g = new WeakReference<>(inflate);
            OnInflateListener onInflateListener = this.f1078i;
            if (onInflateListener != null) {
                onInflateListener.onInflate(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1075f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1077h;
    }

    public int getLayoutResource() {
        return this.f1074e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1075f = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1077h = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1074e = i;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.f1078i = onInflateListener;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1076g;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1838a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1074e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7530j.ViewStubCompat, i, 0);
        this.f1075f = obtainStyledAttributes.getResourceId(C7530j.ViewStubCompat_android_inflatedId, -1);
        this.f1074e = obtainStyledAttributes.getResourceId(C7530j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C7530j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
