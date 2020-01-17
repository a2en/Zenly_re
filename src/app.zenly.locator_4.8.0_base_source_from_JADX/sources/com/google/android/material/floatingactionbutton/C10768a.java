package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C10783a;
import com.google.android.material.internal.C10790f;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shadow.C10796a;
import com.google.android.material.shadow.ShadowViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import p333g.p357d.p358a.p361b.C12066a;
import p333g.p357d.p358a.p361b.C12068c;
import p333g.p357d.p358a.p361b.p362l.C12077a;
import p333g.p357d.p358a.p361b.p362l.C12078b;
import p333g.p357d.p358a.p361b.p362l.C12082f;
import p333g.p357d.p358a.p361b.p362l.C12083g;
import p333g.p357d.p358a.p361b.p362l.C12084h;
import p333g.p357d.p358a.p361b.p365o.C12090a;

/* renamed from: com.google.android.material.floatingactionbutton.a */
class C10768a {

    /* renamed from: B */
    static final TimeInterpolator f28049B = C12077a.f31462c;

    /* renamed from: C */
    static final int[] f28050C = {16842919, 16842910};

    /* renamed from: D */
    static final int[] f28051D = {16843623, 16842908, 16842910};

    /* renamed from: E */
    static final int[] f28052E = {16842908, 16842910};

    /* renamed from: F */
    static final int[] f28053F = {16843623, 16842910};

    /* renamed from: G */
    static final int[] f28054G = {16842910};

    /* renamed from: H */
    static final int[] f28055H = new int[0];

    /* renamed from: A */
    private OnPreDrawListener f28056A;

    /* renamed from: a */
    int f28057a = 0;

    /* renamed from: b */
    Animator f28058b;

    /* renamed from: c */
    C12084h f28059c;

    /* renamed from: d */
    C12084h f28060d;

    /* renamed from: e */
    private C12084h f28061e;

    /* renamed from: f */
    private C12084h f28062f;

    /* renamed from: g */
    private final C10790f f28063g;

    /* renamed from: h */
    C10796a f28064h;

    /* renamed from: i */
    private float f28065i;

    /* renamed from: j */
    Drawable f28066j;

    /* renamed from: k */
    Drawable f28067k;

    /* renamed from: l */
    C10783a f28068l;

    /* renamed from: m */
    Drawable f28069m;

    /* renamed from: n */
    float f28070n;

    /* renamed from: o */
    float f28071o;

    /* renamed from: p */
    float f28072p;

    /* renamed from: q */
    int f28073q;

    /* renamed from: r */
    float f28074r = 1.0f;

    /* renamed from: s */
    private ArrayList<AnimatorListener> f28075s;

    /* renamed from: t */
    private ArrayList<AnimatorListener> f28076t;

    /* renamed from: u */
    final VisibilityAwareImageButton f28077u;

    /* renamed from: v */
    final ShadowViewDelegate f28078v;

    /* renamed from: w */
    private final Rect f28079w = new Rect();

    /* renamed from: x */
    private final RectF f28080x = new RectF();

    /* renamed from: y */
    private final RectF f28081y = new RectF();

    /* renamed from: z */
    private final Matrix f28082z = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    class C10769a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f28083a;

        /* renamed from: b */
        final /* synthetic */ boolean f28084b;

        /* renamed from: c */
        final /* synthetic */ C10775g f28085c;

        C10769a(boolean z, C10775g gVar) {
            this.f28084b = z;
            this.f28085c = gVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f28083a = true;
        }

        public void onAnimationEnd(Animator animator) {
            C10768a aVar = C10768a.this;
            aVar.f28057a = 0;
            aVar.f28058b = null;
            if (!this.f28083a) {
                aVar.f28077u.mo31205a(this.f28084b ? 8 : 4, this.f28084b);
                C10775g gVar = this.f28085c;
                if (gVar != null) {
                    gVar.mo31110b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C10768a.this.f28077u.mo31205a(0, this.f28084b);
            C10768a aVar = C10768a.this;
            aVar.f28057a = 1;
            aVar.f28058b = animator;
            this.f28083a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    class C10770b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f28087a;

        /* renamed from: b */
        final /* synthetic */ C10775g f28088b;

        C10770b(boolean z, C10775g gVar) {
            this.f28087a = z;
            this.f28088b = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            C10768a aVar = C10768a.this;
            aVar.f28057a = 0;
            aVar.f28058b = null;
            C10775g gVar = this.f28088b;
            if (gVar != null) {
                gVar.mo31109a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C10768a.this.f28077u.mo31205a(0, this.f28087a);
            C10768a aVar = C10768a.this;
            aVar.f28057a = 2;
            aVar.f28058b = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    class C10771c implements OnPreDrawListener {
        C10771c() {
        }

        public boolean onPreDraw() {
            C10768a.this.mo31154p();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    private class C10772d extends C10777i {
        C10772d(C10768a aVar) {
            super(aVar, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31164a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    private class C10773e extends C10777i {
        C10773e() {
            super(C10768a.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31164a() {
            C10768a aVar = C10768a.this;
            return aVar.f28070n + aVar.f28071o;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    private class C10774f extends C10777i {
        C10774f() {
            super(C10768a.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31164a() {
            C10768a aVar = C10768a.this;
            return aVar.f28070n + aVar.f28072p;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    interface C10775g {
        /* renamed from: a */
        void mo31109a();

        /* renamed from: b */
        void mo31110b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    private class C10776h extends C10777i {
        C10776h() {
            super(C10768a.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31164a() {
            return C10768a.this.f28070n;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    private abstract class C10777i extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f28094a;

        /* renamed from: b */
        private float f28095b;

        /* renamed from: c */
        private float f28096c;

        private C10777i() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo31164a();

        public void onAnimationEnd(Animator animator) {
            C10768a.this.f28064h.mo31260b(this.f28096c);
            this.f28094a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f28094a) {
                this.f28095b = C10768a.this.f28064h.mo31259b();
                this.f28096c = mo31164a();
                this.f28094a = true;
            }
            C10796a aVar = C10768a.this.f28064h;
            float f = this.f28095b;
            aVar.mo31260b(f + ((this.f28096c - f) * valueAnimator.getAnimatedFraction()));
        }

        /* synthetic */ C10777i(C10768a aVar, C10769a aVar2) {
            this();
        }
    }

    C10768a(VisibilityAwareImageButton visibilityAwareImageButton, ShadowViewDelegate shadowViewDelegate) {
        this.f28077u = visibilityAwareImageButton;
        this.f28078v = shadowViewDelegate;
        this.f28063g = new C10790f();
        this.f28063g.mo31250a(f28050C, m27639a((C10777i) new C10774f()));
        this.f28063g.mo31250a(f28051D, m27639a((C10777i) new C10773e()));
        this.f28063g.mo31250a(f28052E, m27639a((C10777i) new C10773e()));
        this.f28063g.mo31250a(f28053F, m27639a((C10777i) new C10773e()));
        this.f28063g.mo31250a(f28054G, m27639a((C10777i) new C10776h()));
        this.f28063g.mo31250a(f28055H, m27639a((C10777i) new C10772d(this)));
        this.f28065i = this.f28077u.getRotation();
    }

    /* renamed from: t */
    private void m27641t() {
        if (this.f28056A == null) {
            this.f28056A = new C10771c();
        }
    }

    /* renamed from: u */
    private C12084h m27642u() {
        if (this.f28062f == null) {
            this.f28062f = C12084h.m31883a(this.f28077u.getContext(), C12066a.design_fab_hide_motion_spec);
        }
        return this.f28062f;
    }

    /* renamed from: v */
    private C12084h m27643v() {
        if (this.f28061e == null) {
            this.f28061e = C12084h.m31883a(this.f28077u.getContext(), C12066a.design_fab_show_motion_spec);
        }
        return this.f28061e;
    }

    /* renamed from: w */
    private boolean m27644w() {
        return ViewCompat.m2804D(this.f28077u) && !this.f28077u.isInEditMode();
    }

    /* renamed from: x */
    private void m27645x() {
        if (VERSION.SDK_INT == 19) {
            if (this.f28065i % 90.0f != 0.0f) {
                if (this.f28077u.getLayerType() != 1) {
                    this.f28077u.setLayerType(1, null);
                }
            } else if (this.f28077u.getLayerType() != 0) {
                this.f28077u.setLayerType(0, null);
            }
        }
        C10796a aVar = this.f28064h;
        if (aVar != null) {
            aVar.mo31256a(-this.f28065i);
        }
        C10783a aVar2 = this.f28068l;
        if (aVar2 != null) {
            aVar2.mo31211b(-this.f28065i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31124a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable[] drawableArr;
        this.f28066j = C0559a.m2657i(mo31117a());
        C0559a.m2642a(this.f28066j, colorStateList);
        if (mode != null) {
            C0559a.m2645a(this.f28066j, mode);
        }
        this.f28067k = C0559a.m2657i(mo31117a());
        C0559a.m2642a(this.f28067k, C12090a.m31908a(colorStateList2));
        if (i > 0) {
            this.f28068l = mo31118a(i, colorStateList);
            drawableArr = new Drawable[]{this.f28068l, this.f28066j, this.f28067k};
        } else {
            this.f28068l = null;
            drawableArr = new Drawable[]{this.f28066j, this.f28067k};
        }
        this.f28069m = new LayerDrawable(drawableArr);
        Context context = this.f28077u.getContext();
        Drawable drawable = this.f28069m;
        float radius = this.f28078v.getRadius();
        float f = this.f28070n;
        C10796a aVar = new C10796a(context, drawable, radius, f, f + this.f28072p);
        this.f28064h = aVar;
        this.f28064h.mo31258a(false);
        this.f28078v.setBackgroundDrawable(this.f28064h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31133b(ColorStateList colorStateList) {
        Drawable drawable = this.f28067k;
        if (drawable != null) {
            C0559a.m2642a(drawable, C12090a.m31908a(colorStateList));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31134b(Rect rect) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo31137c() {
        return this.f28070n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo31141d(float f) {
        if (this.f28072p != f) {
            this.f28072p = f;
            mo31120a(this.f28070n, this.f28071o, this.f28072p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo31143e() {
        return this.f28071o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo31144f() {
        return this.f28072p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C12084h mo31145g() {
        return this.f28059c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo31146h() {
        boolean z = false;
        if (this.f28077u.getVisibility() == 0) {
            if (this.f28057a == 1) {
                z = true;
            }
            return z;
        }
        if (this.f28057a != 2) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo31147i() {
        boolean z = false;
        if (this.f28077u.getVisibility() != 0) {
            if (this.f28057a == 2) {
                z = true;
            }
            return z;
        }
        if (this.f28057a != 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo31148j() {
        this.f28063g.mo31248a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C10783a mo31149k() {
        return new C10783a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public GradientDrawable mo31150l() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo31151m() {
        if (mo31155q()) {
            m27641t();
            this.f28077u.getViewTreeObserver().addOnPreDrawListener(this.f28056A);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo31152n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo31153o() {
        if (this.f28056A != null) {
            this.f28077u.getViewTreeObserver().removeOnPreDrawListener(this.f28056A);
            this.f28056A = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo31154p() {
        float rotation = this.f28077u.getRotation();
        if (this.f28065i != rotation) {
            this.f28065i = rotation;
            m27645x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo31155q() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final void mo31156r() {
        mo31138c(this.f28074r);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final void mo31157s() {
        Rect rect = this.f28079w;
        mo31126a(rect);
        mo31134b(rect);
        this.f28078v.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo31138c(float f) {
        this.f28074r = f;
        Matrix matrix = this.f28082z;
        m27640a(f, matrix);
        this.f28077u.setImageMatrix(matrix);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31131b(float f) {
        if (this.f28071o != f) {
            this.f28071o = f;
            mo31120a(this.f28070n, this.f28071o, this.f28072p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C12084h mo31140d() {
        return this.f28060d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo31142d(AnimatorListener animatorListener) {
        ArrayList<AnimatorListener> arrayList = this.f28075s;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: c */
    public void mo31139c(AnimatorListener animatorListener) {
        ArrayList<AnimatorListener> arrayList = this.f28076t;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31136b(C12084h hVar) {
        this.f28059c = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31132b(AnimatorListener animatorListener) {
        if (this.f28075s == null) {
            this.f28075s = new ArrayList<>();
        }
        this.f28075s.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31135b(C10775g gVar, boolean z) {
        if (!mo31147i()) {
            Animator animator = this.f28058b;
            if (animator != null) {
                animator.cancel();
            }
            if (m27644w()) {
                if (this.f28077u.getVisibility() != 0) {
                    this.f28077u.setAlpha(0.0f);
                    this.f28077u.setScaleY(0.0f);
                    this.f28077u.setScaleX(0.0f);
                    mo31138c(0.0f);
                }
                C12084h hVar = this.f28059c;
                if (hVar == null) {
                    hVar = m27643v();
                }
                AnimatorSet a = m27638a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C10770b(z, gVar));
                ArrayList<AnimatorListener> arrayList = this.f28075s;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f28077u.mo31205a(0, z);
                this.f28077u.setAlpha(1.0f);
                this.f28077u.setScaleY(1.0f);
                this.f28077u.setScaleX(1.0f);
                mo31138c(1.0f);
                if (gVar != null) {
                    gVar.mo31109a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31123a(ColorStateList colorStateList) {
        Drawable drawable = this.f28066j;
        if (drawable != null) {
            C0559a.m2642a(drawable, colorStateList);
        }
        C10783a aVar = this.f28068l;
        if (aVar != null) {
            aVar.mo31210a(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31125a(Mode mode) {
        Drawable drawable = this.f28066j;
        if (drawable != null) {
            C0559a.m2645a(drawable, mode);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31119a(float f) {
        if (this.f28070n != f) {
            this.f28070n = f;
            mo31120a(this.f28070n, this.f28071o, this.f28072p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31121a(int i) {
        if (this.f28073q != i) {
            this.f28073q = i;
            mo31156r();
        }
    }

    /* renamed from: a */
    private void m27640a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f28077u.getDrawable();
        if (drawable != null && this.f28073q != 0) {
            RectF rectF = this.f28080x;
            RectF rectF2 = this.f28081y;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f28073q;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            int i2 = this.f28073q;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Drawable mo31130b() {
        return this.f28069m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31128a(C12084h hVar) {
        this.f28060d = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31120a(float f, float f2, float f3) {
        C10796a aVar = this.f28064h;
        if (aVar != null) {
            aVar.mo31257a(f, this.f28072p + f);
            mo31157s();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31129a(int[] iArr) {
        this.f28063g.mo31249a(iArr);
    }

    /* renamed from: a */
    public void mo31122a(AnimatorListener animatorListener) {
        if (this.f28076t == null) {
            this.f28076t = new ArrayList<>();
        }
        this.f28076t.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31127a(C10775g gVar, boolean z) {
        if (!mo31146h()) {
            Animator animator = this.f28058b;
            if (animator != null) {
                animator.cancel();
            }
            if (m27644w()) {
                C12084h hVar = this.f28060d;
                if (hVar == null) {
                    hVar = m27642u();
                }
                AnimatorSet a = m27638a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C10769a(z, gVar));
                ArrayList<AnimatorListener> arrayList = this.f28076t;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f28077u.mo31205a(z ? 8 : 4, z);
                if (gVar != null) {
                    gVar.mo31110b();
                }
            }
        }
    }

    /* renamed from: a */
    private AnimatorSet m27638a(C12084h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f28077u, View.ALPHA, new float[]{f});
        hVar.mo35795a("opacity").mo35802a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f28077u, View.SCALE_X, new float[]{f2});
        String str = "scale";
        hVar.mo35795a(str).mo35802a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f28077u, View.SCALE_Y, new float[]{f2});
        hVar.mo35795a(str).mo35802a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m27640a(f3, this.f28082z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f28077u, new C12082f(), new C12083g(), new Matrix[]{new Matrix(this.f28082z)});
        hVar.mo35795a("iconScale").mo35802a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C12078b.m31873a(animatorSet, arrayList);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31126a(Rect rect) {
        this.f28064h.getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10783a mo31118a(int i, ColorStateList colorStateList) {
        Context context = this.f28077u.getContext();
        C10783a k = mo31149k();
        k.mo31209a(C0540a.m2536a(context, C12068c.design_fab_stroke_top_outer_color), C0540a.m2536a(context, C12068c.design_fab_stroke_top_inner_color), C0540a.m2536a(context, C12068c.design_fab_stroke_end_inner_color), C0540a.m2536a(context, C12068c.design_fab_stroke_end_outer_color));
        k.mo31208a((float) i);
        k.mo31210a(colorStateList);
        return k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public GradientDrawable mo31117a() {
        GradientDrawable l = mo31150l();
        l.setShape(1);
        l.setColor(-1);
        return l;
    }

    /* renamed from: a */
    private ValueAnimator m27639a(C10777i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f28049B);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }
}
