package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition.TransitionListener;

public class ChangeBounds extends Transition {

    /* renamed from: Q */
    private static final String[] f4491Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: R */
    private static final Property<Drawable, PointF> f4492R = new C1183b(PointF.class, "boundsOrigin");

    /* renamed from: S */
    private static final Property<C1192k, PointF> f4493S;

    /* renamed from: T */
    private static final Property<C1192k, PointF> f4494T;

    /* renamed from: U */
    private static final Property<View, PointF> f4495U;

    /* renamed from: V */
    private static final Property<View, PointF> f4496V;

    /* renamed from: W */
    private static final Property<View, PointF> f4497W = new C1188g(PointF.class, "position");

    /* renamed from: X */
    private static C1231g f4498X = new C1231g();

    /* renamed from: N */
    private int[] f4499N = new int[2];

    /* renamed from: O */
    private boolean f4500O = false;

    /* renamed from: P */
    private boolean f4501P = false;

    /* renamed from: androidx.transition.ChangeBounds$a */
    class C1182a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4502a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f4503b;

        /* renamed from: c */
        final /* synthetic */ View f4504c;

        /* renamed from: d */
        final /* synthetic */ float f4505d;

        C1182a(ChangeBounds changeBounds, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f4502a = viewGroup;
            this.f4503b = bitmapDrawable;
            this.f4504c = view;
            this.f4505d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1254y.m6015b(this.f4502a).mo6103b(this.f4503b);
            C1254y.m6011a(this.f4504c, this.f4505d);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    static class C1183b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f4506a = new Rect();

        C1183b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f4506a);
            this.f4506a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4506a);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f4506a);
            Rect rect = this.f4506a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    static class C1184c extends Property<C1192k, PointF> {
        C1184c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1192k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1192k kVar, PointF pointF) {
            kVar.mo5997b(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    static class C1185d extends Property<C1192k, PointF> {
        C1185d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1192k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1192k kVar, PointF pointF) {
            kVar.mo5996a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    static class C1186e extends Property<View, PointF> {
        C1186e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C1254y.m6013a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    static class C1187f extends Property<View, PointF> {
        C1187f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C1254y.m6013a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    static class C1188g extends Property<View, PointF> {
        C1188g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1254y.m6013a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    class C1189h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1192k f4507a;
        private C1192k mViewBounds = this.f4507a;

        C1189h(ChangeBounds changeBounds, C1192k kVar) {
            this.f4507a = kVar;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    class C1190i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4508a;

        /* renamed from: b */
        final /* synthetic */ View f4509b;

        /* renamed from: c */
        final /* synthetic */ Rect f4510c;

        /* renamed from: d */
        final /* synthetic */ int f4511d;

        /* renamed from: e */
        final /* synthetic */ int f4512e;

        /* renamed from: f */
        final /* synthetic */ int f4513f;

        /* renamed from: g */
        final /* synthetic */ int f4514g;

        C1190i(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f4509b = view;
            this.f4510c = rect;
            this.f4511d = i;
            this.f4512e = i2;
            this.f4513f = i3;
            this.f4514g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4508a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4508a) {
                ViewCompat.m2821a(this.f4509b, this.f4510c);
                C1254y.m6013a(this.f4509b, this.f4511d, this.f4512e, this.f4513f, this.f4514g);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    class C1191j extends C1235j {

        /* renamed from: a */
        boolean f4515a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4516b;

        C1191j(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f4516b = viewGroup;
        }

        public void onTransitionCancel(Transition transition) {
            C1246s.m5990a(this.f4516b, false);
            this.f4515a = true;
        }

        public void onTransitionEnd(Transition transition) {
            if (!this.f4515a) {
                C1246s.m5990a(this.f4516b, false);
            }
            transition.mo6023b((TransitionListener) this);
        }

        public void onTransitionPause(Transition transition) {
            C1246s.m5990a(this.f4516b, false);
        }

        public void onTransitionResume(Transition transition) {
            C1246s.m5990a(this.f4516b, true);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    private static class C1192k {

        /* renamed from: a */
        private int f4517a;

        /* renamed from: b */
        private int f4518b;

        /* renamed from: c */
        private int f4519c;

        /* renamed from: d */
        private int f4520d;

        /* renamed from: e */
        private View f4521e;

        /* renamed from: f */
        private int f4522f;

        /* renamed from: g */
        private int f4523g;

        C1192k(View view) {
            this.f4521e = view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5996a(PointF pointF) {
            this.f4519c = Math.round(pointF.x);
            this.f4520d = Math.round(pointF.y);
            this.f4523g++;
            if (this.f4522f == this.f4523g) {
                m5790a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5997b(PointF pointF) {
            this.f4517a = Math.round(pointF.x);
            this.f4518b = Math.round(pointF.y);
            this.f4522f++;
            if (this.f4522f == this.f4523g) {
                m5790a();
            }
        }

        /* renamed from: a */
        private void m5790a() {
            C1254y.m6013a(this.f4521e, this.f4517a, this.f4518b, this.f4519c, this.f4520d);
            this.f4522f = 0;
            this.f4523g = 0;
        }
    }

    static {
        String str = "topLeft";
        f4493S = new C1184c(PointF.class, str);
        String str2 = "bottomRight";
        f4494T = new C1185d(PointF.class, str2);
        f4495U = new C1186e(PointF.class, str2);
        f4496V = new C1187f(PointF.class, str);
    }

    /* renamed from: d */
    private void m5773d(C1241n nVar) {
        View view = nVar.f4646b;
        if (ViewCompat.m2804D(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            nVar.f4645a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            nVar.f4645a.put("android:changeBounds:parent", nVar.f4646b.getParent());
            if (this.f4501P) {
                nVar.f4646b.getLocationInWindow(this.f4499N);
                nVar.f4645a.put("android:changeBounds:windowX", Integer.valueOf(this.f4499N[0]));
                nVar.f4645a.put("android:changeBounds:windowY", Integer.valueOf(this.f4499N[1]));
            }
            if (this.f4500O) {
                nVar.f4645a.put("android:changeBounds:clip", ViewCompat.m2855i(view));
            }
        }
    }

    /* renamed from: a */
    public void mo5962a(C1241n nVar) {
        m5773d(nVar);
    }

    /* renamed from: c */
    public void mo5963c(C1241n nVar) {
        m5773d(nVar);
    }

    /* renamed from: n */
    public String[] mo5964n() {
        return f4491Q;
    }

    /* renamed from: a */
    private boolean m5772a(View view, View view2) {
        if (!this.f4501P) {
            return true;
        }
        C1241n a = mo6009a(view, true);
        if (a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a.f4646b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Animator mo5961a(ViewGroup viewGroup, C1241n nVar, C1241n nVar2) {
        int i;
        View view;
        Animator animator;
        Animator animator2;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        C1241n nVar3 = nVar;
        C1241n nVar4 = nVar2;
        if (nVar3 == null || nVar4 == null) {
            return null;
        }
        String str = "android:changeBounds:parent";
        ViewGroup viewGroup2 = (ViewGroup) nVar3.f4645a.get(str);
        ViewGroup viewGroup3 = (ViewGroup) nVar4.f4645a.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = nVar4.f4646b;
        if (m5772a(viewGroup2, viewGroup3)) {
            String str2 = "android:changeBounds:bounds";
            Rect rect2 = (Rect) nVar3.f4645a.get(str2);
            Rect rect3 = (Rect) nVar4.f4645a.get(str2);
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            String str3 = "android:changeBounds:clip";
            Rect rect4 = (Rect) nVar3.f4645a.get(str3);
            Rect rect5 = (Rect) nVar4.f4645a.get(str3);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect6 = rect5;
                Rect rect7 = rect4;
                if (!this.f4500O) {
                    view = view3;
                    C1254y.m6013a(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            animator = C1223c.m5938a(view, f4497W, mo6038g().mo6002a((float) i3, (float) i5, (float) i4, (float) i6));
                        } else {
                            C1192k kVar = new C1192k(view);
                            ObjectAnimator a = C1223c.m5938a(kVar, f4493S, mo6038g().mo6002a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a2 = C1223c.m5938a(kVar, f4494T, mo6038g().mo6002a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a, a2});
                            animatorSet.addListener(new C1189h(this, kVar));
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        animator = C1223c.m5938a(view, f4495U, mo6038g().mo6002a((float) i7, (float) i9, (float) i8, (float) i10));
                    } else {
                        animator = C1223c.m5938a(view, f4496V, mo6038g().mo6002a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else {
                    view = view3;
                    C1254y.m6013a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        animator2 = null;
                    } else {
                        animator2 = C1223c.m5938a(view, f4497W, mo6038g().mo6002a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                    if (rect7 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect7;
                    }
                    Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                    if (!rect.equals(rect8)) {
                        ViewCompat.m2821a(view, rect);
                        C1231g gVar = f4498X;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect8;
                        objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", gVar, objArr);
                        C1190i iVar = new C1190i(this, view, rect6, i4, i6, i8, i10);
                        objectAnimator.addListener(iVar);
                    } else {
                        objectAnimator = null;
                    }
                    animator = C1240m.m5977a(animator2, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C1246s.m5990a(viewGroup4, true);
                    mo6008a((TransitionListener) new C1191j(this, viewGroup4));
                }
                return animator;
            }
        } else {
            String str4 = "android:changeBounds:windowX";
            int intValue = ((Integer) nVar3.f4645a.get(str4)).intValue();
            String str5 = "android:changeBounds:windowY";
            int intValue2 = ((Integer) nVar3.f4645a.get(str5)).intValue();
            int intValue3 = ((Integer) nVar4.f4645a.get(str4)).intValue();
            int intValue4 = ((Integer) nVar4.f4645a.get(str5)).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f4499N);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = C1254y.m6017c(view2);
                C1254y.m6011a(view2, 0.0f);
                C1254y.m6015b(viewGroup).mo6102a(bitmapDrawable);
                PathMotion g = mo6038g();
                int[] iArr = this.f4499N;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C1227e.m5953a(f4492R, g.mo6002a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
                C1182a aVar = new C1182a(this, viewGroup, bitmapDrawable, view2, c);
                ofPropertyValuesHolder.addListener(aVar);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }
}
