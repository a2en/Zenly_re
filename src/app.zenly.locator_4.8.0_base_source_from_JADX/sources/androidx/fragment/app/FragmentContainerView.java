package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p214e.p243k.C7641c;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: e */
    private ArrayList<View> f3172e;

    /* renamed from: f */
    private ArrayList<View> f3173f;

    /* renamed from: g */
    private boolean f3174g = true;

    public FragmentContainerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m3583a(View view) {
        if (view.getAnimation() == null) {
            ArrayList<View> arrayList = this.f3173f;
            if (arrayList == null || !arrayList.contains(view)) {
                return;
            }
        }
        if (this.f3172e == null) {
            this.f3172e = new ArrayList<>();
        }
        this.f3172e.add(view);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (FragmentManager.m3594a(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m3594a(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f3174g && this.f3172e != null) {
            for (int i = 0; i < this.f3172e.size(); i++) {
                super.drawChild(canvas, (View) this.f3172e.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f3174g) {
            ArrayList<View> arrayList = this.f3172e;
            if (arrayList != null && arrayList.size() > 0 && this.f3172e.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3173f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3172e;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3174g = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m3583a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m3583a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m3583a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m3583a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m3583a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m3583a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m3583a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3174g = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3173f == null) {
                this.f3173f = new ArrayList<>();
            }
            this.f3173f.add(view);
        }
        super.startViewTransition(view);
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7641c.FragmentContainerView);
        if (classAttribute == null) {
            classAttribute = obtainStyledAttributes.getString(C7641c.FragmentContainerView_android_name);
        }
        String string = obtainStyledAttributes.getString(C7641c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment a = fragmentManager.mo4058a(id);
        if (classAttribute != null && a == null) {
            if (id <= 0) {
                if (string != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(classAttribute);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            Fragment a2 = fragmentManager.mo4120p().mo4142a(context.getClassLoader(), classAttribute);
            a2.onInflate(context, attributeSet, (Bundle) null);
            C0819o b = fragmentManager.mo4084b();
            b.mo4318a(true);
            b.mo4314a((ViewGroup) this, a2, string);
            b.mo4194d();
        }
    }
}
