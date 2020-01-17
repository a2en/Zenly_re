package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.TransitionListener;

public abstract class Visibility extends Transition {

    /* renamed from: O */
    private static final String[] f4584O = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: N */
    private int f4585N = 3;

    /* renamed from: androidx.transition.Visibility$a */
    class C1211a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1245r f4586a;

        /* renamed from: b */
        final /* synthetic */ View f4587b;

        C1211a(Visibility visibility, C1245r rVar, View view) {
            this.f4586a = rVar;
            this.f4587b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4586a.mo6101b(this.f4587b);
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    private static class C1212b extends AnimatorListenerAdapter implements TransitionListener, C1215a {

        /* renamed from: a */
        private final View f4588a;

        /* renamed from: b */
        private final int f4589b;

        /* renamed from: c */
        private final ViewGroup f4590c;

        /* renamed from: d */
        private final boolean f4591d;

        /* renamed from: e */
        private boolean f4592e;

        /* renamed from: f */
        boolean f4593f = false;

        C1212b(View view, int i, boolean z) {
            this.f4588a = view;
            this.f4589b = i;
            this.f4590c = (ViewGroup) view.getParent();
            this.f4591d = z;
            m5909a(true);
        }

        /* renamed from: a */
        private void m5908a() {
            if (!this.f4593f) {
                C1254y.m6012a(this.f4588a, this.f4589b);
                ViewGroup viewGroup = this.f4590c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m5909a(false);
        }

        public void onAnimationCancel(Animator animator) {
            this.f4593f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m5908a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f4593f) {
                C1254y.m6012a(this.f4588a, this.f4589b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f4593f) {
                C1254y.m6012a(this.f4588a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            m5908a();
            transition.mo6023b((TransitionListener) this);
        }

        public void onTransitionPause(Transition transition) {
            m5909a(false);
        }

        public void onTransitionResume(Transition transition) {
            m5909a(true);
        }

        public void onTransitionStart(Transition transition) {
        }

        /* renamed from: a */
        private void m5909a(boolean z) {
            if (this.f4591d && this.f4592e != z) {
                ViewGroup viewGroup = this.f4590c;
                if (viewGroup != null) {
                    this.f4592e = z;
                    C1246s.m5990a(viewGroup, z);
                }
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    private static class C1213c {

        /* renamed from: a */
        boolean f4594a;

        /* renamed from: b */
        boolean f4595b;

        /* renamed from: c */
        int f4596c;

        /* renamed from: d */
        int f4597d;

        /* renamed from: e */
        ViewGroup f4598e;

        /* renamed from: f */
        ViewGroup f4599f;

        C1213c() {
        }
    }

    /* renamed from: b */
    private C1213c m5896b(C1241n nVar, C1241n nVar2) {
        C1213c cVar = new C1213c();
        cVar.f4594a = false;
        cVar.f4595b = false;
        String str = "android:visibility:parent";
        String str2 = "android:visibility:visibility";
        if (nVar == null || !nVar.f4645a.containsKey(str2)) {
            cVar.f4596c = -1;
            cVar.f4598e = null;
        } else {
            cVar.f4596c = ((Integer) nVar.f4645a.get(str2)).intValue();
            cVar.f4598e = (ViewGroup) nVar.f4645a.get(str);
        }
        if (nVar2 == null || !nVar2.f4645a.containsKey(str2)) {
            cVar.f4597d = -1;
            cVar.f4599f = null;
        } else {
            cVar.f4597d = ((Integer) nVar2.f4645a.get(str2)).intValue();
            cVar.f4599f = (ViewGroup) nVar2.f4645a.get(str);
        }
        if (nVar == null || nVar2 == null) {
            if (nVar == null && cVar.f4597d == 0) {
                cVar.f4595b = true;
                cVar.f4594a = true;
            } else if (nVar2 == null && cVar.f4596c == 0) {
                cVar.f4595b = false;
                cVar.f4594a = true;
            }
        } else if (cVar.f4596c == cVar.f4597d && cVar.f4598e == cVar.f4599f) {
            return cVar;
        } else {
            int i = cVar.f4596c;
            int i2 = cVar.f4597d;
            if (i != i2) {
                if (i == 0) {
                    cVar.f4595b = false;
                    cVar.f4594a = true;
                } else if (i2 == 0) {
                    cVar.f4595b = true;
                    cVar.f4594a = true;
                }
            } else if (cVar.f4599f == null) {
                cVar.f4595b = false;
                cVar.f4594a = true;
            } else if (cVar.f4598e == null) {
                cVar.f4595b = true;
                cVar.f4594a = true;
            }
        }
        return cVar;
    }

    /* renamed from: d */
    private void m5897d(C1241n nVar) {
        String str = "android:visibility:visibility";
        nVar.f4645a.put(str, Integer.valueOf(nVar.f4646b.getVisibility()));
        nVar.f4645a.put("android:visibility:parent", nVar.f4646b.getParent());
        int[] iArr = new int[2];
        nVar.f4646b.getLocationOnScreen(iArr);
        nVar.f4645a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public abstract Animator mo5998a(ViewGroup viewGroup, View view, C1241n nVar, C1241n nVar2);

    /* renamed from: a */
    public void mo6057a(int i) {
        if ((i & -4) == 0) {
            this.f4585N = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: b */
    public abstract Animator mo5999b(ViewGroup viewGroup, View view, C1241n nVar, C1241n nVar2);

    /* renamed from: c */
    public void mo5963c(C1241n nVar) {
        m5897d(nVar);
    }

    /* renamed from: n */
    public String[] mo5964n() {
        return f4584O;
    }

    /* renamed from: a */
    public void mo5962a(C1241n nVar) {
        m5897d(nVar);
    }

    /* renamed from: a */
    public Animator mo5961a(ViewGroup viewGroup, C1241n nVar, C1241n nVar2) {
        C1213c b = m5896b(nVar, nVar2);
        if (!b.f4594a || (b.f4598e == null && b.f4599f == null)) {
            return null;
        }
        if (b.f4595b) {
            return mo6056a(viewGroup, nVar, b.f4596c, nVar2, b.f4597d);
        }
        return mo6058b(viewGroup, nVar, b.f4596c, nVar2, b.f4597d);
    }

    /* renamed from: a */
    public Animator mo6056a(ViewGroup viewGroup, C1241n nVar, int i, C1241n nVar2, int i2) {
        if ((this.f4585N & 1) != 1 || nVar2 == null) {
            return null;
        }
        if (nVar == null) {
            View view = (View) nVar2.f4646b.getParent();
            if (m5896b(mo6009a(view, false), mo6024b(view, false)).f4594a) {
                return null;
            }
        }
        return mo5998a(viewGroup, nVar2.f4646b, nVar, nVar2);
    }

    /* renamed from: a */
    public boolean mo6020a(C1241n nVar, C1241n nVar2) {
        boolean z = false;
        if (nVar == null && nVar2 == null) {
            return false;
        }
        if (!(nVar == null || nVar2 == null)) {
            String str = "android:visibility:visibility";
            if (nVar2.f4645a.containsKey(str) != nVar.f4645a.containsKey(str)) {
                return false;
            }
        }
        C1213c b = m5896b(nVar, nVar2);
        if (b.f4594a && (b.f4596c == 0 || b.f4597d == 0)) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r6.f4568z != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo6058b(android.view.ViewGroup r7, androidx.transition.C1241n r8, int r9, androidx.transition.C1241n r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.f4585N
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f4646b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f4646b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0037
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0027
        L_0x0024:
            r9 = r1
            goto L_0x0084
        L_0x0027:
            boolean r2 = r6.f4568z
            if (r2 == 0) goto L_0x002c
            goto L_0x0044
        L_0x002c:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.view.View r9 = androidx.transition.C1240m.m5979a(r7, r9, r2)
            goto L_0x003a
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r9 = r2
        L_0x003a:
            r2 = r1
            goto L_0x0084
        L_0x003c:
            if (r9 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0045
        L_0x0044:
            goto L_0x003a
        L_0x0045:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            androidx.transition.n r4 = r6.mo6024b(r2, r3)
            androidx.transition.n r5 = r6.mo6009a(r2, r3)
            androidx.transition.Visibility$c r4 = r6.m5896b(r4, r5)
            boolean r4 = r4.f4594a
            if (r4 != 0) goto L_0x0068
            android.view.View r9 = androidx.transition.C1240m.m5979a(r7, r9, r2)
            goto L_0x003a
        L_0x0068:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0080
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x0080
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x0080
            boolean r2 = r6.f4568z
            if (r2 == 0) goto L_0x0080
            goto L_0x003a
        L_0x0080:
            r9 = r1
            goto L_0x003a
        L_0x0082:
            r9 = r1
            r2 = r9
        L_0x0084:
            r4 = 0
            if (r9 == 0) goto L_0x00cc
            if (r8 == 0) goto L_0x00cc
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f4645a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            androidx.transition.r r11 = androidx.transition.C1246s.m5989a(r7)
            r11.mo6100a(r9)
            android.animation.Animator r7 = r6.mo5999b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00c3
            r11.mo6101b(r9)
            goto L_0x00cb
        L_0x00c3:
            androidx.transition.Visibility$a r8 = new androidx.transition.Visibility$a
            r8.<init>(r6, r11, r9)
            r7.addListener(r8)
        L_0x00cb:
            return r7
        L_0x00cc:
            if (r2 == 0) goto L_0x00ee
            int r9 = r2.getVisibility()
            androidx.transition.C1254y.m6012a(r2, r4)
            android.animation.Animator r7 = r6.mo5999b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00ea
            androidx.transition.Visibility$b r8 = new androidx.transition.Visibility$b
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            androidx.transition.C1214a.m5911a(r7, r8)
            r6.mo6008a(r8)
            goto L_0x00ed
        L_0x00ea:
            androidx.transition.C1254y.m6012a(r2, r9)
        L_0x00ed:
            return r7
        L_0x00ee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo6058b(android.view.ViewGroup, androidx.transition.n, int, androidx.transition.n, int):android.animation.Animator");
    }
}
