package app.zenly.locator.map.view.animator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import app.zenly.locator.p143s.p146j.C5432b;
import java.util.ArrayList;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

public final class CapsuleViewAnimator {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f11839a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f11840b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f11841c;

    /* renamed from: d */
    private final ObjectAnimator f11842d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ArrayList<OnCompleteListener> f11843e = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View f11844f;

    public interface OnCompleteListener {
        void onComplete(boolean z);
    }

    /* renamed from: app.zenly.locator.map.view.animator.CapsuleViewAnimator$a */
    public static final class C4383a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ CapsuleViewAnimator f11845b;

        C4383a(CapsuleViewAnimator capsuleViewAnimator) {
            this.f11845b = capsuleViewAnimator;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            this.f11845b.f11840b = false;
            this.f11845b.f11841c = false;
            for (OnCompleteListener onComplete : this.f11845b.f11843e) {
                onComplete.onComplete(z);
            }
            this.f11845b.f11843e.clear();
            if (!this.f11845b.f11839a) {
                this.f11845b.f11844f.setVisibility(8);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.animator.CapsuleViewAnimator$b */
    public static final class C4384b {
        private C4384b() {
        }

        public /* synthetic */ C4384b(C12928f fVar) {
            this();
        }
    }

    static {
        new C4384b(null);
    }

    public CapsuleViewAnimator(View view) {
        C12932j.m33818b(view, "view");
        this.f11844f = view;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f11844f, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.0f, 1.0f})});
        C12932j.m33815a((Object) ofPropertyValuesHolder, "ObjectAnimator.ofPropert…ew.SCALE_Y, 0f, 1f)\n    )");
        this.f11842d = ofPropertyValuesHolder;
        this.f11842d.setInterpolator(C7657c.m18650f());
        this.f11842d.addListener(new C4383a(this));
    }

    /* renamed from: a */
    public static /* synthetic */ void m13045a(CapsuleViewAnimator capsuleViewAnimator, long j, OnCompleteListener onCompleteListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 50;
        }
        if ((i & 2) != 0) {
            onCompleteListener = null;
        }
        capsuleViewAnimator.mo11514a(j, onCompleteListener);
    }

    /* renamed from: b */
    public static /* synthetic */ void m13048b(CapsuleViewAnimator capsuleViewAnimator, long j, OnCompleteListener onCompleteListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            onCompleteListener = null;
        }
        capsuleViewAnimator.mo11515b(j, onCompleteListener);
    }

    /* renamed from: a */
    public final void mo11514a(long j, OnCompleteListener onCompleteListener) {
        if (!this.f11839a) {
            if (onCompleteListener != null) {
                if (this.f11841c) {
                    this.f11843e.add(onCompleteListener);
                } else {
                    onCompleteListener.onComplete(false);
                }
            }
            return;
        }
        this.f11842d.cancel();
        if (onCompleteListener != null) {
            this.f11843e.add(onCompleteListener);
        }
        this.f11839a = false;
        this.f11841c = true;
        this.f11842d.setDuration(j);
        this.f11842d.reverse();
    }

    /* renamed from: b */
    public final void mo11515b(long j, OnCompleteListener onCompleteListener) {
        if (this.f11839a) {
            if (onCompleteListener != null) {
                if (this.f11840b) {
                    this.f11843e.add(onCompleteListener);
                } else {
                    onCompleteListener.onComplete(false);
                }
            }
            return;
        }
        this.f11842d.cancel();
        if (onCompleteListener != null) {
            this.f11843e.add(onCompleteListener);
        }
        this.f11839a = true;
        this.f11840b = true;
        this.f11844f.setVisibility(0);
        this.f11842d.setDuration(j);
        this.f11842d.start();
    }
}
