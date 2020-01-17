package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.core.graphics.drawable.C0559a;
import com.google.android.material.internal.C10783a;
import com.google.android.material.internal.C10786b;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shadow.C10796a;
import com.google.android.material.shadow.ShadowViewDelegate;
import java.util.ArrayList;
import p333g.p357d.p358a.p361b.p365o.C12090a;

/* renamed from: com.google.android.material.floatingactionbutton.b */
class C10778b extends C10768a {

    /* renamed from: I */
    private InsetDrawable f28098I;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    static class C10779a extends GradientDrawable {
        C10779a() {
        }

        public boolean isStateful() {
            return true;
        }
    }

    C10778b(VisibilityAwareImageButton visibilityAwareImageButton, ShadowViewDelegate shadowViewDelegate) {
        super(visibilityAwareImageButton, shadowViewDelegate);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31124a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.f28066j = C0559a.m2657i(mo31117a());
        C0559a.m2642a(this.f28066j, colorStateList);
        if (mode != null) {
            C0559a.m2645a(this.f28066j, mode);
        }
        if (i > 0) {
            this.f28068l = mo31118a(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.f28068l, this.f28066j});
        } else {
            this.f28068l = null;
            drawable = this.f28066j;
        }
        this.f28067k = new RippleDrawable(C12090a.m31908a(colorStateList2), drawable, null);
        Drawable drawable2 = this.f28067k;
        this.f28069m = drawable2;
        this.f28078v.setBackgroundDrawable(drawable2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31133b(ColorStateList colorStateList) {
        Drawable drawable = this.f28067k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C12090a.m31908a(colorStateList));
        } else {
            super.mo31133b(colorStateList);
        }
    }

    /* renamed from: c */
    public float mo31137c() {
        return this.f28077u.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo31148j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C10783a mo31149k() {
        return new C10786b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public GradientDrawable mo31150l() {
        return new C10779a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo31152n() {
        mo31157s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo31155q() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31134b(Rect rect) {
        if (this.f28078v.isCompatPaddingEnabled()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f28067k, rect.left, rect.top, rect.right, rect.bottom);
            this.f28098I = insetDrawable;
            this.f28078v.setBackgroundDrawable(this.f28098I);
            return;
        }
        this.f28078v.setBackgroundDrawable(this.f28067k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31120a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.f28077u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C10768a.f28050C, m27694a(f, f3));
            stateListAnimator.addState(C10768a.f28051D, m27694a(f, f2));
            stateListAnimator.addState(C10768a.f28052E, m27694a(f, f2));
            stateListAnimator.addState(C10768a.f28053F, m27694a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f28077u, "elevation", new float[]{f}).setDuration(0));
            int i = VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                VisibilityAwareImageButton visibilityAwareImageButton = this.f28077u;
                arrayList.add(ObjectAnimator.ofFloat(visibilityAwareImageButton, View.TRANSLATION_Z, new float[]{visibilityAwareImageButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f28077u, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C10768a.f28049B);
            stateListAnimator.addState(C10768a.f28054G, animatorSet);
            stateListAnimator.addState(C10768a.f28055H, m27694a(0.0f, 0.0f));
            this.f28077u.setStateListAnimator(stateListAnimator);
        }
        if (this.f28078v.isCompatPaddingEnabled()) {
            mo31157s();
        }
    }

    /* renamed from: a */
    private Animator m27694a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f28077u, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f28077u, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C10768a.f28049B);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31129a(int[] iArr) {
        if (VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f28077u.isEnabled()) {
            this.f28077u.setElevation(this.f28070n);
            if (this.f28077u.isPressed()) {
                this.f28077u.setTranslationZ(this.f28072p);
            } else if (this.f28077u.isFocused() || this.f28077u.isHovered()) {
                this.f28077u.setTranslationZ(this.f28071o);
            } else {
                this.f28077u.setTranslationZ(0.0f);
            }
        } else {
            this.f28077u.setElevation(0.0f);
            this.f28077u.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31126a(Rect rect) {
        if (this.f28078v.isCompatPaddingEnabled()) {
            float radius = this.f28078v.getRadius();
            float c = mo31137c() + this.f28072p;
            int ceil = (int) Math.ceil((double) C10796a.m27782a(c, radius, false));
            int ceil2 = (int) Math.ceil((double) C10796a.m27785b(c, radius, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
