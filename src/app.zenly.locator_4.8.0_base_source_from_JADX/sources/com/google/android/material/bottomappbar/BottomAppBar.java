package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p333g.p357d.p358a.p361b.p362l.C12077a;
import p333g.p357d.p358a.p361b.p366p.C12092b;

public class BottomAppBar extends Toolbar implements AttachedBehavior {

    /* renamed from: T */
    private final int f27903T;

    /* renamed from: U */
    private final C12092b f27904U;

    /* renamed from: V */
    private final C10738a f27905V;

    /* renamed from: W */
    private Animator f27906W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Animator f27907a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public Animator f27908b0;

    /* renamed from: c0 */
    private int f27909c0;

    /* renamed from: d0 */
    private boolean f27910d0;

    /* renamed from: e0 */
    private boolean f27911e0;

    /* renamed from: f0 */
    AnimatorListenerAdapter f27912f0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d */
        private final Rect f27913d = new Rect();

        public Behavior() {
        }

        /* renamed from: a */
        private boolean m27397a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((C0489d) floatingActionButton.getLayoutParams()).f2364d = 17;
            bottomAppBar.m27383a(floatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo30628b(BottomAppBar bottomAppBar) {
            super.mo30628b(bottomAppBar);
            FloatingActionButton a = bottomAppBar.m27393n();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C12077a.f31463d).setDuration(225);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton a = bottomAppBar.m27393n();
            if (a != null) {
                m27397a(a, bottomAppBar);
                a.mo31055b(this.f27913d);
                bottomAppBar.setFabDiameter(this.f27913d.height());
            }
            if (bottomAppBar.m27394o()) {
                coordinatorLayout.mo2818b((View) bottomAppBar, i);
                return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
            }
            BottomAppBar.m27390c(bottomAppBar);
            throw null;
        }

        /* renamed from: a */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo30627a(BottomAppBar bottomAppBar) {
            super.mo30627a(bottomAppBar);
            FloatingActionButton a = bottomAppBar.m27393n();
            if (a != null) {
                a.mo31053a(this.f27913d);
                float measuredHeight = (float) (a.getMeasuredHeight() - this.f27913d.height());
                a.clearAnimation();
                a.animate().translationY(((float) (-a.getPaddingBottom())) + measuredHeight).setInterpolator(C12077a.f31462c).setDuration(175);
            }
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C10734a();

        /* renamed from: g */
        int f27914g;

        /* renamed from: h */
        boolean f27915h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        static class C10734a implements ClassLoaderCreator<SavedState> {
            C10734a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f27914g);
            parcel.writeInt(this.f27915h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27914g = parcel.readInt();
            this.f27915h = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C10735a extends AnimatorListenerAdapter {
        C10735a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f27907a0 = null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C10736b extends AnimatorListenerAdapter {
        C10736b() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f27908b0 = null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C10737c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f27918a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f27919b;

        /* renamed from: c */
        final /* synthetic */ int f27920c;

        /* renamed from: d */
        final /* synthetic */ boolean f27921d;

        C10737c(ActionMenuView actionMenuView, int i, boolean z) {
            this.f27919b = actionMenuView;
            this.f27920c = i;
            this.f27921d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f27918a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f27918a) {
                BottomAppBar.this.m27380a(this.f27919b, this.f27920c, this.f27921d);
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m27390c(BottomAppBar bottomAppBar) {
        bottomAppBar.m27396q();
        throw null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) m27384b(this.f27909c0);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return m27374a(this.f27911e0);
    }

    /* renamed from: m */
    private void m27392m() {
        Animator animator = this.f27906W;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f27908b0;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f27907a0;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public FloatingActionButton m27393n() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo2820c((View) this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m27394o() {
        Animator animator = this.f27906W;
        if (animator == null || !animator.isRunning()) {
            Animator animator2 = this.f27908b0;
            if (animator2 == null || !animator2.isRunning()) {
                Animator animator3 = this.f27907a0;
                if (animator3 == null || !animator3.isRunning()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: p */
    private boolean m27395p() {
        FloatingActionButton n = m27393n();
        return n != null && n.mo31058b();
    }

    /* renamed from: q */
    private void m27396q() {
        this.f27905V.mo30669d(getFabTranslationX());
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        this.f27904U.mo35811a();
        throw null;
    }

    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        this.f27905V.mo30662a();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.f27909c0;
    }

    public float getFabCradleMargin() {
        this.f27905V.mo30664b();
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        this.f27905V.mo30666c();
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.f27910d0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m27392m();
        m27396q();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3548a());
        this.f27909c0 = savedState.f27914g;
        this.f27911e0 = savedState.f27915h;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f27914g = this.f27909c0;
        savedState.f27915h = this.f27911e0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0559a.m2642a((Drawable) this.f27904U, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f27905V.mo30663a(f);
            throw null;
        }
    }

    public void setFabAlignmentMode(int i) {
        m27389c(i);
        m27378a(i, this.f27911e0);
        this.f27909c0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f27905V.mo30665b(f);
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f27905V.mo30667c(f);
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setFabDiameter(int i) {
        this.f27905V.mo30668d();
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f27910d0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: c */
    private void m27389c(int i) {
        if (this.f27909c0 != i && ViewCompat.m2804D(this)) {
            Animator animator = this.f27907a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            m27377a(i, (List<Animator>) arrayList);
            m27386b(i, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f27907a0 = animatorSet;
            this.f27907a0.addListener(new C10735a());
            this.f27907a0.start();
        }
    }

    /* renamed from: b */
    private void m27386b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m27393n(), "translationX", new float[]{(float) m27384b(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: a */
    private void m27377a(int i, List<Animator> list) {
        if (this.f27911e0) {
            this.f27905V.mo30670e();
            throw null;
        }
    }

    /* renamed from: b */
    private int m27384b(int i) {
        int i2 = 1;
        boolean z = ViewCompat.m2862o(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f27903T;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    /* renamed from: a */
    private void m27378a(int i, boolean z) {
        if (ViewCompat.m2804D(this)) {
            Animator animator = this.f27908b0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m27395p()) {
                i = 0;
                z = false;
            }
            m27379a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f27908b0 = animatorSet;
            this.f27908b0.addListener(new C10736b());
            this.f27908b0.start();
        }
    }

    /* renamed from: b */
    private void m27387b(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo31060c((AnimatorListener) this.f27912f0);
        floatingActionButton.mo31061d(this.f27912f0);
    }

    /* renamed from: a */
    private void m27379a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if ((this.f27911e0 || (z && m27395p())) && (this.f27909c0 == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                ofFloat2.addListener(new C10737c(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: a */
    private float m27374a(boolean z) {
        FloatingActionButton n = m27393n();
        if (n == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        n.mo31053a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) n.getMeasuredHeight();
        }
        float height2 = (float) (n.getHeight() - rect.bottom);
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float height3 = ((float) (n.getHeight() - rect.height())) - ((float) n.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            height3 = f;
        }
        return f2 + height3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27380a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = ViewCompat.m2862o(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof LayoutParams) && (((LayoutParams) childAt.getLayoutParams()).f147a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27383a(FloatingActionButton floatingActionButton) {
        m27387b(floatingActionButton);
        floatingActionButton.mo31050a((AnimatorListener) this.f27912f0);
        floatingActionButton.mo31054b((AnimatorListener) this.f27912f0);
    }
}
