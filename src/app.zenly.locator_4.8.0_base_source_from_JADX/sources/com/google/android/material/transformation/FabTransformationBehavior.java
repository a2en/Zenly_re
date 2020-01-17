package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.view.ViewCompat;
import com.google.android.material.circularreveal.C10760a;
import com.google.android.material.circularreveal.C10762b;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.circularreveal.CircularRevealWidget.C10758d;
import com.google.android.material.circularreveal.CircularRevealWidget.C10759e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p333g.p357d.p358a.p361b.C12071f;
import p333g.p357d.p358a.p361b.p362l.C12077a;
import p333g.p357d.p358a.p361b.p362l.C12078b;
import p333g.p357d.p358a.p361b.p362l.C12079c;
import p333g.p357d.p358a.p361b.p362l.C12080d;
import p333g.p357d.p358a.p361b.p362l.C12081e;
import p333g.p357d.p358a.p361b.p362l.C12084h;
import p333g.p357d.p358a.p361b.p362l.C12085i;
import p333g.p357d.p358a.p361b.p362l.C12086j;
import p333g.p357d.p358a.p361b.p363m.C12087a;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f28363c = new Rect();

    /* renamed from: d */
    private final RectF f28364d = new RectF();

    /* renamed from: e */
    private final RectF f28365e = new RectF();

    /* renamed from: f */
    private final int[] f28366f = new int[2];

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C10830a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f28367a;

        /* renamed from: b */
        final /* synthetic */ View f28368b;

        /* renamed from: c */
        final /* synthetic */ View f28369c;

        C10830a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f28367a = z;
            this.f28368b = view;
            this.f28369c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f28367a) {
                this.f28368b.setVisibility(4);
                this.f28369c.setAlpha(1.0f);
                this.f28369c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f28367a) {
                this.f28368b.setVisibility(0);
                this.f28369c.setAlpha(0.0f);
                this.f28369c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C10831b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f28370a;

        C10831b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f28370a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f28370a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C10832c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CircularRevealWidget f28371a;

        /* renamed from: b */
        final /* synthetic */ Drawable f28372b;

        C10832c(FabTransformationBehavior fabTransformationBehavior, CircularRevealWidget circularRevealWidget, Drawable drawable) {
            this.f28371a = circularRevealWidget;
            this.f28372b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f28371a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.f28371a.setCircularRevealOverlayDrawable(this.f28372b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C10833d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CircularRevealWidget f28373a;

        C10833d(FabTransformationBehavior fabTransformationBehavior, CircularRevealWidget circularRevealWidget) {
            this.f28373a = circularRevealWidget;
        }

        public void onAnimationEnd(Animator animator) {
            C10759e revealInfo = this.f28373a.getRevealInfo();
            revealInfo.f28020c = Float.MAX_VALUE;
            this.f28373a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C10834e {

        /* renamed from: a */
        public C12084h f28374a;

        /* renamed from: b */
        public C12086j f28375b;

        protected C10834e() {
        }
    }

    public FabTransformationBehavior() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27951a(android.view.View r17, android.view.View r18, boolean r19, boolean r20, com.google.android.material.transformation.FabTransformationBehavior.C10834e r21, java.util.List<android.animation.Animator> r22, java.util.List<android.animation.Animator.AnimatorListener> r23, android.graphics.RectF r24) {
        /*
            r16 = this;
            r10 = r16
            r0 = r17
            r1 = r18
            r2 = r21
            r11 = r22
            g.d.a.b.l.j r3 = r2.f28375b
            float r3 = r10.m27956c(r0, r1, r3)
            g.d.a.b.l.j r4 = r2.f28375b
            float r0 = r10.m27959d(r0, r1, r4)
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x004c
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0020
            goto L_0x004c
        L_0x0020:
            if (r19 == 0) goto L_0x0026
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x002a
        L_0x0026:
            if (r19 != 0) goto L_0x003b
            if (r5 <= 0) goto L_0x003b
        L_0x002a:
            g.d.a.b.l.h r5 = r2.f28374a
            java.lang.String r6 = "translationXCurveUpwards"
            g.d.a.b.l.i r5 = r5.mo35795a(r6)
            g.d.a.b.l.h r6 = r2.f28374a
            java.lang.String r7 = "translationYCurveUpwards"
            g.d.a.b.l.i r6 = r6.mo35795a(r7)
            goto L_0x005c
        L_0x003b:
            g.d.a.b.l.h r5 = r2.f28374a
            java.lang.String r6 = "translationXCurveDownwards"
            g.d.a.b.l.i r5 = r5.mo35795a(r6)
            g.d.a.b.l.h r6 = r2.f28374a
            java.lang.String r7 = "translationYCurveDownwards"
            g.d.a.b.l.i r6 = r6.mo35795a(r7)
            goto L_0x005c
        L_0x004c:
            g.d.a.b.l.h r5 = r2.f28374a
            java.lang.String r6 = "translationXLinear"
            g.d.a.b.l.i r5 = r5.mo35795a(r6)
            g.d.a.b.l.h r6 = r2.f28374a
            java.lang.String r7 = "translationYLinear"
            g.d.a.b.l.i r6 = r6.mo35795a(r7)
        L_0x005c:
            r12 = r5
            r13 = r6
            r5 = 0
            r6 = 1
            if (r19 == 0) goto L_0x0092
            if (r20 != 0) goto L_0x006c
            float r7 = -r3
            r1.setTranslationX(r7)
            float r7 = -r0
            r1.setTranslationY(r7)
        L_0x006c:
            android.util.Property r7 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r6]
            r8[r5] = r4
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r7, r8)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r6 = new float[r6]
            r6[r5] = r4
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r7, r6)
            float r5 = -r3
            float r6 = -r0
            r7 = 0
            r8 = 0
            r0 = r16
            r1 = r18
            r2 = r21
            r3 = r12
            r4 = r13
            r9 = r24
            r0.m27952a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00a8
        L_0x0092:
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float[] r4 = new float[r6]
            float r3 = -r3
            r4[r5] = r3
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r6]
            float r0 = -r0
            r3[r5] = r0
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
        L_0x00a8:
            r12.mo35802a(r14)
            r13.mo35802a(r15)
            r11.add(r14)
            r11.add(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.m27951a(android.view.View, android.view.View, boolean, boolean, com.google.android.material.transformation.FabTransformationBehavior$e, java.util.List, java.util.List, android.graphics.RectF):void");
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m27958c(View view, View view2, boolean z, boolean z2, C10834e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float k = ViewCompat.m2858k(view2) - ViewCompat.m2858k(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-k);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-k});
        }
        eVar.f28374a.mo35795a("elevation").mo35802a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private void m27960d(View view, View view2, boolean z, boolean z2, C10834e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof CircularRevealWidget) && (view instanceof ImageView)) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C12081e.f31467b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C12081e.f31467b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C10831b(this, view2));
                eVar.f28374a.mo35795a("iconFade").mo35802a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C10832c(this, circularRevealWidget, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C10834e mo31443a(Context context, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo31441b(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C10834e a = mo31443a(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            m27958c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f28364d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        C10834e eVar = a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m27951a(view3, view4, z4, z5, eVar, (List<Animator>) arrayList3, (List<AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m27960d(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m27949a(view3, view4, z4, z5, eVar, width, height, (List<Animator>) arrayList, (List<AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m27955b(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m27950a(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C12078b.m31873a(animatorSet, arrayList);
        animatorSet.addListener(new C10830a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public void onAttachedToLayoutParams(C0489d dVar) {
        if (dVar.f2368h == 0) {
            dVar.f2368h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private float m27956c(View view, View view2, C12086j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f28364d;
        RectF rectF2 = this.f28365e;
        m27948a(view, rectF);
        m27948a(view2, rectF2);
        int i = jVar.f31479a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f31480b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f31480b;
    }

    /* renamed from: d */
    private float m27959d(View view, View view2, C12086j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f28364d;
        RectF rectF2 = this.f28365e;
        m27948a(view, rectF);
        m27948a(view2, rectF2);
        int i = jVar.f31479a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f31481c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f31481c;
    }

    /* renamed from: c */
    private ViewGroup m27957c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: b */
    private void m27955b(View view, View view2, boolean z, boolean z2, C10834e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof CircularRevealWidget) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            int b = m27954b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    circularRevealWidget.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(circularRevealWidget, C10758d.f28017a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(circularRevealWidget, C10758d.f28017a, new int[]{b});
            }
            objectAnimator.setEvaluator(C12079c.m31874a());
            eVar.f28374a.mo35795a("color").mo35802a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: a */
    private void m27949a(View view, View view2, boolean z, boolean z2, C10834e eVar, float f, float f2, List<Animator> list, List<AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C10834e eVar2 = eVar;
        if (view4 instanceof CircularRevealWidget) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view4;
            float a = m27943a(view3, view4, eVar2.f28375b);
            float b = m27953b(view3, view4, eVar2.f28375b);
            ((FloatingActionButton) view3).mo31053a(this.f28363c);
            float width = ((float) this.f28363c.width()) / 2.0f;
            C12085i a2 = eVar2.f28374a.mo35795a("expansion");
            if (z) {
                if (!z2) {
                    circularRevealWidget.setRevealInfo(new C10759e(a, b, width));
                }
                if (z2) {
                    width = circularRevealWidget.getRevealInfo().f28020c;
                }
                animator = C10760a.m27587a(circularRevealWidget, a, b, C12087a.m31901a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C10833d(this, circularRevealWidget));
                m27946a(view2, a2.mo35801a(), (int) a, (int) b, width, list);
            } else {
                float f3 = circularRevealWidget.getRevealInfo().f28020c;
                Animator a3 = C10760a.m27587a(circularRevealWidget, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                View view5 = view2;
                int i3 = i;
                m27946a(view5, a2.mo35801a(), i, i2, f3, list);
                m27947a(view5, a2.mo35801a(), a2.mo35803b(), eVar2.f28374a.mo35794a(), i3, i2, width, list);
                animator = a3;
            }
            a2.mo35802a(animator);
            list.add(animator);
            list2.add(C10760a.m27586a(circularRevealWidget));
        }
    }

    /* renamed from: b */
    private float m27953b(View view, View view2, C12086j jVar) {
        RectF rectF = this.f28364d;
        RectF rectF2 = this.f28365e;
        m27948a(view, rectF);
        m27948a(view2, rectF2);
        rectF2.offset(0.0f, -m27959d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m27954b(View view) {
        ColorStateList g = ViewCompat.m2851g(view);
        if (g != null) {
            return g.getColorForState(view.getDrawableState(), g.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private void m27950a(View view, View view2, boolean z, boolean z2, C10834e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof CircularRevealWidget) || C10762b.f28022a != 0) {
                ViewGroup a = m27945a(view2);
                if (a != null) {
                    if (z) {
                        if (!z2) {
                            C12080d.f31466a.set(a, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(a, C12080d.f31466a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(a, C12080d.f31466a, new float[]{0.0f});
                    }
                    eVar.f28374a.mo35795a("contentFade").mo35802a((Animator) objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    /* renamed from: a */
    private void m27948a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f28366f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a */
    private float m27943a(View view, View view2, C12086j jVar) {
        RectF rectF = this.f28364d;
        RectF rectF2 = this.f28365e;
        m27948a(view, rectF);
        m27948a(view2, rectF2);
        rectF2.offset(-m27956c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private void m27952a(View view, C10834e eVar, C12085i iVar, C12085i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m27944a(eVar, iVar, f, f3);
        float a2 = m27944a(eVar, iVar2, f2, f4);
        Rect rect = this.f28363c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f28364d;
        rectF2.set(rect);
        RectF rectF3 = this.f28365e;
        m27948a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: a */
    private float m27944a(C10834e eVar, C12085i iVar, float f, float f2) {
        long a = iVar.mo35801a();
        long b = iVar.mo35803b();
        C12085i a2 = eVar.f28374a.mo35795a("expansion");
        return C12077a.m31872a(f, f2, iVar.mo35804c().getInterpolation(((float) (((a2.mo35801a() + a2.mo35803b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private ViewGroup m27945a(View view) {
        View findViewById = view.findViewById(C12071f.mtrl_child_content_container);
        if (findViewById != null) {
            return m27957c(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return m27957c(((ViewGroup) view).getChildAt(0));
        }
        return m27957c(view);
    }

    /* renamed from: a */
    private void m27946a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m27947a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }
}
