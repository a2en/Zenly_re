package app.zenly.locator.map;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p150n.C5459d;
import com.bluelinelabs.conductor.C8819d;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.map.c1 */
public class C3906c1 extends ZenlyController {

    /* renamed from: P */
    private final C12275b f10354P = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C5459d f10355Q;

    /* renamed from: R */
    private final int f10356R;

    /* renamed from: S */
    private final long f10357S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f10358T;

    /* renamed from: U */
    private ImageView f10359U;

    /* renamed from: V */
    private ImageView f10360V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f10361W;

    /* renamed from: X */
    private AnimatorSet f10362X;

    /* renamed from: Y */
    private final OnLayoutChangeListener f10363Y = new C3907a();

    /* renamed from: Z */
    private final C5432b f10364Z = new C3908b();

    /* renamed from: a0 */
    private final C5432b f10365a0 = new C3909c();

    /* renamed from: app.zenly.locator.map.c1$a */
    class C3907a implements OnLayoutChangeListener {
        C3907a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C3906c1.this.f10358T.removeOnLayoutChangeListener(this);
            C3906c1.this.f10361W = true;
            if (C3896a1.m11470r().mo10520j() && C3906c1.this.mo23949n()) {
                C3906c1.this.m11507B();
            }
        }
    }

    /* renamed from: app.zenly.locator.map.c1$b */
    class C3908b extends C5432b {
        C3908b() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C3896a1.m11470r().mo10501a(C3906c1.this.f10355Q, 18.0f, 500);
        }
    }

    /* renamed from: app.zenly.locator.map.c1$c */
    class C3909c extends C5432b {
        C3909c() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (!z) {
                C3906c1.this.mo23946k().mo23997a((C8819d) C3906c1.this);
            }
        }
    }

    public C3906c1(Bundle bundle) {
        super(bundle);
        this.f10355Q = new C5459d(bundle.getDouble("key:lat"), bundle.getDouble("key:lng"));
        this.f10356R = bundle.getInt("key:drawableResId");
        this.f10357S = bundle.getLong("key:startDelay");
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m11507B() {
        if (this.f10362X == null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f10360V, View.ALPHA, new float[]{0.0f, 1.0f}).setDuration(200);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f10360V, View.TRANSLATION_Y, new float[]{((float) (-this.f10358T.getHeight())) / 2.0f, 0.0f}).setDuration(500);
            duration2.setInterpolator(C7657c.m18650f());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{duration, duration2});
            animatorSet.addListener(this.f10364Z);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f10359U, View.SCALE_X, new float[]{0.0f, 2.0f}).setDuration(500);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f10359U, View.SCALE_Y, new float[]{0.0f, 2.0f}).setDuration(500);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.f10359U, View.ALPHA, new float[]{1.0f, 0.0f}).setDuration(500);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{duration3, duration4, duration5});
            ObjectAnimator duration6 = ObjectAnimator.ofFloat(this.f10360V, View.SCALE_X, new float[]{1.0f, 2.0f}).setDuration(300);
            ObjectAnimator duration7 = ObjectAnimator.ofFloat(this.f10360V, View.SCALE_Y, new float[]{1.0f, 2.0f}).setDuration(300);
            ObjectAnimator duration8 = ObjectAnimator.ofFloat(this.f10360V, View.ALPHA, new float[]{1.0f, 0.0f}).setDuration(300);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(new Animator[]{duration6, duration7, duration8});
            this.f10362X = new AnimatorSet();
            this.f10362X.playSequentially(new Animator[]{animatorSet, animatorSet2, animatorSet3});
            this.f10362X.addListener(this.f10365a0);
            this.f10362X.setStartDelay(this.f10357S);
        }
        this.f10362X.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        AnimatorSet animatorSet = this.f10362X;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f10362X.cancel();
        }
        this.f10354P.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f10354P.add(C3896a1.m11470r().mo10516f().mo36476d((Consumer<? super T>) new C4286q0<Object>(this)));
    }

    /* renamed from: a */
    public static C3906c1 m11509a(C5459d dVar, int i, long j) {
        C3197d dVar2 = new C3197d(new Bundle());
        dVar2.mo9606a("key:lat", dVar.mo13060b());
        dVar2.mo9606a("key:lng", dVar.mo13062c());
        dVar2.mo9607a("key:drawableResId", i);
        dVar2.mo9608a("key:startDelay", j);
        return new C3906c1(dVar2.mo9605a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f10358T = layoutInflater.inflate(R.layout.controller_showcase, viewGroup, false);
        this.f10359U = (ImageView) this.f10358T.findViewById(R.id.pulse);
        this.f10360V = (ImageView) this.f10358T.findViewById(R.id.image);
        this.f10360V.setImageResource(this.f10356R);
        this.f10358T.addOnLayoutChangeListener(this.f10363Y);
        return this.f10358T;
    }

    /* renamed from: a */
    public /* synthetic */ void mo10575a(Boolean bool) throws Exception {
        if (bool.booleanValue() && this.f10361W) {
            m11507B();
        }
    }
}
