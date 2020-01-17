package com.bluelinelabs.conductor.changehandler;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeCompletedListener;

/* renamed from: com.bluelinelabs.conductor.changehandler.a */
public abstract class C8812a extends ControllerChangeHandler {

    /* renamed from: h */
    private long f22842h;

    /* renamed from: i */
    boolean f22843i;

    /* renamed from: j */
    boolean f22844j;

    /* renamed from: k */
    boolean f22845k;

    /* renamed from: l */
    private boolean f22846l;

    /* renamed from: m */
    Animator f22847m;

    /* renamed from: n */
    private C8814b f22848n;

    /* renamed from: com.bluelinelabs.conductor.changehandler.a$a */
    class C8813a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f22849a;

        /* renamed from: b */
        final /* synthetic */ View f22850b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f22851c;

        /* renamed from: d */
        final /* synthetic */ ControllerChangeCompletedListener f22852d;

        /* renamed from: e */
        final /* synthetic */ boolean f22853e;

        C8813a(View view, View view2, ViewGroup viewGroup, ControllerChangeCompletedListener controllerChangeCompletedListener, boolean z) {
            this.f22849a = view;
            this.f22850b = view2;
            this.f22851c = viewGroup;
            this.f22852d = controllerChangeCompletedListener;
            this.f22853e = z;
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f22849a;
            if (view != null) {
                C8812a.this.mo9252a(view);
            }
            View view2 = this.f22850b;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                ViewGroup viewGroup = this.f22851c;
                if (parent == viewGroup) {
                    viewGroup.removeView(this.f22850b);
                }
            }
            C8812a.this.mo23888a(this.f22852d, (AnimatorListener) this);
        }

        public void onAnimationEnd(Animator animator) {
            C8812a aVar = C8812a.this;
            if (!aVar.f22844j && aVar.f22847m != null) {
                if (this.f22849a != null && (!this.f22853e || aVar.f22843i)) {
                    this.f22851c.removeView(this.f22849a);
                }
                C8812a.this.mo23888a(this.f22852d, (AnimatorListener) this);
                if (this.f22853e) {
                    View view = this.f22849a;
                    if (view != null) {
                        C8812a.this.mo9252a(view);
                    }
                }
            }
        }
    }

    /* renamed from: com.bluelinelabs.conductor.changehandler.a$b */
    private class C8814b implements OnPreDrawListener {

        /* renamed from: e */
        final ViewGroup f22855e;

        /* renamed from: f */
        final View f22856f;

        /* renamed from: g */
        final View f22857g;

        /* renamed from: h */
        final boolean f22858h;

        /* renamed from: i */
        final boolean f22859i;

        /* renamed from: j */
        final ControllerChangeCompletedListener f22860j;

        /* renamed from: k */
        private boolean f22861k;

        C8814b(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2, ControllerChangeCompletedListener controllerChangeCompletedListener) {
            this.f22855e = viewGroup;
            this.f22856f = view;
            this.f22857g = view2;
            this.f22858h = z;
            this.f22859i = z2;
            this.f22860j = controllerChangeCompletedListener;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo23892a() {
            if (!this.f22861k) {
                this.f22861k = true;
                View view = this.f22857g;
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    }
                }
                C8812a.this.mo23887a(this.f22855e, this.f22856f, this.f22857g, this.f22858h, this.f22859i, this.f22860j);
            }
        }

        public boolean onPreDraw() {
            mo23892a();
            return true;
        }
    }

    public C8812a() {
        this(-1, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Animator mo9251a(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2);

    /* renamed from: a */
    public void mo23847a(Bundle bundle) {
        super.mo23847a(bundle);
        this.f22842h = bundle.getLong("AnimatorChangeHandler.duration");
        this.f22843i = bundle.getBoolean("AnimatorChangeHandler.removesFromViewOnPush");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9252a(View view);

    /* renamed from: b */
    public void mo23851b(Bundle bundle) {
        super.mo23851b(bundle);
        bundle.putLong("AnimatorChangeHandler.duration", this.f22842h);
        bundle.putBoolean("AnimatorChangeHandler.removesFromViewOnPush", this.f22843i);
    }

    /* renamed from: d */
    public boolean mo23853d() {
        return this.f22843i;
    }

    /* renamed from: f */
    public long mo23889f() {
        return this.f22842h;
    }

    public C8812a(boolean z) {
        this(-1, z);
    }

    public C8812a(long j) {
        this(j, true);
    }

    public C8812a(long j, boolean z) {
        this.f22842h = j;
        this.f22843i = z;
    }

    /* renamed from: a */
    public void mo23849a(ControllerChangeHandler controllerChangeHandler, C8819d dVar) {
        super.mo23849a(controllerChangeHandler, dVar);
        this.f22844j = true;
        Animator animator = this.f22847m;
        if (animator != null) {
            animator.cancel();
            return;
        }
        C8814b bVar = this.f22848n;
        if (bVar != null) {
            bVar.mo23892a();
        }
    }

    /* renamed from: a */
    public void mo23846a() {
        super.mo23846a();
        this.f22845k = true;
        Animator animator = this.f22847m;
        if (animator != null) {
            animator.end();
            return;
        }
        C8814b bVar = this.f22848n;
        if (bVar != null) {
            bVar.mo23892a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23848a(android.view.ViewGroup r15, android.view.View r16, android.view.View r17, boolean r18, com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeCompletedListener r19) {
        /*
            r14 = this;
            r8 = r14
            r9 = r15
            r10 = r17
            r11 = 0
            r0 = 1
            if (r10 == 0) goto L_0x0010
            android.view.ViewParent r1 = r17.getParent()
            if (r1 != 0) goto L_0x0010
            r12 = 1
            goto L_0x0011
        L_0x0010:
            r12 = 0
        L_0x0011:
            if (r12 == 0) goto L_0x0052
            if (r18 != 0) goto L_0x0026
            if (r16 != 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            android.view.ViewParent r1 = r17.getParent()
            if (r1 != 0) goto L_0x0029
            int r1 = r15.indexOfChild(r16)
            r15.addView(r10, r1)
            goto L_0x0029
        L_0x0026:
            r15.addView(r10)
        L_0x0029:
            int r1 = r17.getWidth()
            if (r1 > 0) goto L_0x0052
            int r1 = r17.getHeight()
            if (r1 > 0) goto L_0x0052
            com.bluelinelabs.conductor.changehandler.a$b r13 = new com.bluelinelabs.conductor.changehandler.a$b
            r6 = 1
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r8.f22848n = r13
            android.view.ViewTreeObserver r0 = r17.getViewTreeObserver()
            com.bluelinelabs.conductor.changehandler.a$b r1 = r8.f22848n
            r0.addOnPreDrawListener(r1)
            goto L_0x0053
        L_0x0052:
            r11 = 1
        L_0x0053:
            if (r11 == 0) goto L_0x0063
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r12
            r6 = r19
            r0.mo23887a(r1, r2, r3, r4, r5, r6)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bluelinelabs.conductor.changehandler.C8812a.mo23848a(android.view.ViewGroup, android.view.View, android.view.View, boolean, com.bluelinelabs.conductor.ControllerChangeHandler$ControllerChangeCompletedListener):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23888a(ControllerChangeCompletedListener controllerChangeCompletedListener, AnimatorListener animatorListener) {
        if (!this.f22846l) {
            this.f22846l = true;
            controllerChangeCompletedListener.onChangeCompleted();
        }
        Animator animator = this.f22847m;
        if (animator != null) {
            if (animatorListener != null) {
                animator.removeListener(animatorListener);
            }
            this.f22847m.cancel();
            this.f22847m = null;
        }
        this.f22848n = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23887a(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2, ControllerChangeCompletedListener controllerChangeCompletedListener) {
        if (this.f22844j) {
            mo23888a(controllerChangeCompletedListener, (AnimatorListener) null);
        } else if (this.f22845k) {
            if (view != null && (!z || this.f22843i)) {
                viewGroup.removeView(view);
            }
            mo23888a(controllerChangeCompletedListener, (AnimatorListener) null);
            if (z && view != null) {
                mo9252a(view);
            }
        } else {
            this.f22847m = mo9251a(viewGroup, view, view2, z, z2);
            long j = this.f22842h;
            if (j > 0) {
                this.f22847m.setDuration(j);
            }
            Animator animator = this.f22847m;
            C8813a aVar = new C8813a(view, view2, viewGroup, controllerChangeCompletedListener, z);
            animator.addListener(aVar);
            this.f22847m.start();
        }
    }
}
