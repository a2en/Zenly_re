package app.zenly.locator.brump;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1332b;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.models.C2887h;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.p072ui.view.particles.ParticleView.ParticleViewListener;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p156s.C5509a;
import app.zenly.locator.p143s.p162w.p164d.C5572a;
import app.zenly.locator.p143s.p162w.p164d.C5572a.C5574b;
import com.android.volley.toolbox.C8733j;
import com.bluelinelabs.conductor.C8819d;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.brump.d */
public class C1736d extends ZenlyController {
    /* access modifiers changed from: private */

    /* renamed from: P */
    public View f5812P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C1332b f5813Q = new C1737a();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C1332b f5814R = new C1738b();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public View f5815S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f5816T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ParticleView f5817U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public NavigationContract f5818V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f5819W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f5820X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C2879d0 f5821Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C2879d0 f5822Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public AnimatorSet f5823a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public C5574b f5824b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f5825c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public boolean f5826d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public boolean f5827e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public ImageView f5828f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public ImageView f5829g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2477e f5830h0;

    /* renamed from: i0 */
    private final OnLayoutChangeListener f5831i0 = new C1739c();
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final C5432b f5832j0 = new C1740d();
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public final C5432b f5833k0 = new C1741e();

    /* renamed from: l0 */
    private final ParticleViewListener f5834l0 = new C1742f();

    /* renamed from: app.zenly.locator.brump.d$a */
    class C1737a extends C1332b {
        C1737a() {
        }

        /* renamed from: a */
        public void mo6544a(Bitmap bitmap) {
            C1736d.this.f5819W = true;
            if (C1736d.this.f5820X && C1736d.this.mo23949n()) {
                C1736d.this.f5823a0.start();
            }
        }
    }

    /* renamed from: app.zenly.locator.brump.d$b */
    class C1738b extends C1332b {
        C1738b() {
        }

        /* renamed from: a */
        public void mo6544a(Bitmap bitmap) {
            C1736d.this.f5820X = true;
            if (C1736d.this.f5819W && C1736d.this.mo23949n()) {
                C1736d.this.f5823a0.start();
            }
        }
    }

    /* renamed from: app.zenly.locator.brump.d$c */
    class C1739c implements OnLayoutChangeListener {
        C1739c() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C1736d.this.f5812P.removeOnLayoutChangeListener(this);
            C1736d dVar = C1736d.this;
            Animator a = dVar.m7097a(dVar.f5815S, 15.0f);
            C1736d dVar2 = C1736d.this;
            Animator a2 = dVar2.m7097a(dVar2.f5816T, 15.0f);
            C1736d dVar3 = C1736d.this;
            Animator a3 = dVar3.m7097a((View) dVar3.f5828f0, -15.0f);
            C1736d dVar4 = C1736d.this;
            Animator a4 = dVar4.m7097a((View) dVar4.f5829g0, 15.0f);
            a2.setStartDelay(200);
            a3.setStartDelay(200);
            a4.setStartDelay(400);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{a, a2, a3, a4});
            ObjectAnimator duration = ObjectAnimator.ofFloat(C1736d.this.f5815S, View.ALPHA, new float[]{1.0f, 0.0f}).setDuration(600);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(C1736d.this.f5816T, View.ALPHA, new float[]{1.0f, 0.0f}).setDuration(600);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(C1736d.this.f5828f0, View.TRANSLATION_X, new float[]{0.0f, (float) (-C1736d.this.f5812P.getWidth())}).setDuration(600);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(C1736d.this.f5829g0, View.TRANSLATION_X, new float[]{0.0f, (float) C1736d.this.f5812P.getWidth()}).setDuration(600);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{duration, duration2, duration3, duration4});
            animatorSet2.addListener(C1736d.this.f5833k0);
            C1736d.this.f5823a0 = new AnimatorSet();
            C1736d.this.f5823a0.playSequentially(new Animator[]{animatorSet, animatorSet2});
            C1736d.this.f5823a0.addListener(C1736d.this.f5832j0);
            C1736d.this.f5823a0.setStartDelay(500);
            C1736d.this.f5830h0.load(C2884f.m9353a(C1736d.this.f5821Y)).withPlaceholderStrategy(C1333c.DisplayName).withBorder(R.dimen.stroke_150, R.color.blue).withFillColor(R.color.blue).into(C1736d.this.f5828f0, C1736d.this.f5813Q);
            C1736d.this.f5830h0.load(C2884f.m9353a(C1736d.this.f5822Z)).withPlaceholderStrategy(C1333c.DisplayName).withBorder(R.dimen.stroke_150, R.color.yellow).withFillColor(R.color.yellow).into(C1736d.this.f5829g0, C1736d.this.f5814R);
        }
    }

    /* renamed from: app.zenly.locator.brump.d$d */
    class C1740d extends C5432b {
        C1740d() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C1736d.this.f5826d0 = true;
            if (C1736d.this.f5827e0 && C1736d.this.mo23949n()) {
                C1736d.this.mo23946k().mo23997a((C8819d) C1736d.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C1736d.this.f5825c0 = true;
            C5509a.m15628b((Context) C1736d.this.mo23920b(), (int) R.raw.sound_bump);
            if (C1736d.this.f5818V != null) {
                C1736d.this.f5818V.moveMapOnUsers(new C2879d0[]{C1736d.this.f5821Y, C1736d.this.f5822Z}, 10.3f, 300);
            }
        }
    }

    /* renamed from: app.zenly.locator.brump.d$e */
    class C1741e extends C5432b {
        C1741e() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (C1736d.this.f5818V != null) {
                C1736d.this.f5818V.moveMapOnUsers(new C2879d0[]{C1736d.this.f5821Y, C1736d.this.f5822Z}, 13.6f, C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
            }
            C1736d dVar = C1736d.this;
            dVar.f5824b0 = C5572a.m15769a(dVar.f5817U);
        }
    }

    /* renamed from: app.zenly.locator.brump.d$f */
    class C1742f implements ParticleViewListener {
        C1742f() {
        }

        public void onParticlesAnimationFinish() {
            C1736d.this.f5824b0 = null;
            C1736d.this.f5827e0 = true;
            if (C1736d.this.f5826d0 && C1736d.this.mo23949n()) {
                C1736d.this.mo23946k().mo23997a((C8819d) C1736d.this);
            }
        }

        public void onParticlesAnimationStart() {
        }
    }

    public C1736d(Bundle bundle) {
        super(bundle);
        try {
            this.f5822Z = C2879d0.m9332a(UserProto$User.parseFrom(bundle.getByteArray("key:friendUser")));
        } catch (InvalidProtocolBufferException e) {
            C12143a.m32036d(e, "BrumpController: unable to parse user", new Object[0]);
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof NavigationContract) {
            this.f5818V = (NavigationContract) mo23947l();
        } else if (mo23920b() instanceof NavigationContract) {
            this.f5818V = (NavigationContract) mo23920b();
        }
        if (this.f5820X && this.f5819W) {
            AnimatorSet animatorSet = this.f5823a0;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f5818V = null;
        AnimatorSet animatorSet = this.f5823a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C5574b bVar = this.f5824b0;
        if (bVar != null) {
            bVar.mo13186b();
        }
        C5509a.m15625a(R.raw.sound_bump);
        this.f5830h0.clear(this.f5828f0);
        this.f5830h0.clear(this.f5829g0);
        super.mo7053d(view);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        if (this.f5825c0) {
            mo23946k().mo23997a((C8819d) this);
        }
    }

    /* renamed from: a */
    public static C1736d m7100a(C2887h hVar) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9613a("key:friendUser", hVar.f8174a.toByteArray());
        return new C1736d(dVar.mo9605a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f5812P = layoutInflater.inflate(R.layout.controller_brump, viewGroup, false);
        this.f5812P.setOnClickListener(new C1733a(this));
        this.f5828f0 = (ImageView) this.f5812P.findViewById(R.id.avatar_me);
        this.f5829g0 = (ImageView) this.f5812P.findViewById(R.id.avatar_friend);
        this.f5815S = this.f5812P.findViewById(R.id.bump_bg);
        this.f5816T = this.f5812P.findViewById(R.id.bump_lbl);
        this.f5817U = (ParticleView) this.f5812P.findViewById(R.id.particles);
        this.f5812P.addOnLayoutChangeListener(this.f5831i0);
        this.f5817U.mo9541a(this.f5834l0);
        return this.f5812P;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Animator m7097a(View view, float f) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f}).setDuration(100);
        duration.setInterpolator(C7657c.m18641a());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{0.0f, 1.3f}).setDuration(100);
        duration2.setInterpolator(C7657c.m18641a());
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{0.0f, 1.3f}).setDuration(100);
        duration3.setInterpolator(C7657c.m18641a());
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{f, 0.0f}).setDuration(100);
        duration4.setInterpolator(C7657c.m18641a());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2, duration3, duration4});
        TimeInterpolator c = C7657c.m18646c(0.2f);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.3f, 1.0f}).setDuration(1100);
        duration5.setInterpolator(c);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.3f, 1.0f}).setDuration(1100);
        duration6.setInterpolator(c);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{0.0f, f}).setDuration(1100);
        duration7.setInterpolator(c);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{duration5, duration6, duration7});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
        return animatorSet3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f5821Y = C2666b.m9049a(context).mo8764b().mo8756b().f8250a;
        this.f5830h0 = new C2477e(context);
    }
}
