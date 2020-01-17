package app.zenly.locator.brump;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.particles.C3169d;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.p143s.p146j.C5432b;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8507d;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p260i.C7687c;

public final class BumpHintView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final int[] f5789p = {R.color.blue_light, R.color.pink, R.color.yellow, R.color.blue_black};

    /* renamed from: e */
    private final ImageView f5790e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ParticleView f5791f;

    /* renamed from: g */
    private final FrameLayout f5792g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final LottieAnimationView f5793h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final TextView f5794i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f5795j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f5796k;

    /* renamed from: l */
    private ParticleAnimation<?> f5797l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final AnimatorSet f5798m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f5799n;

    /* renamed from: o */
    private String[] f5800o;

    /* renamed from: app.zenly.locator.brump.BumpHintView$a */
    static final class C1727a<T> implements LottieListener<C8506c> {

        /* renamed from: a */
        final /* synthetic */ BumpHintView f5801a;

        C1727a(BumpHintView bumpHintView) {
            this.f5801a = bumpHintView;
        }

        /* renamed from: a */
        public final void onResult(C8506c cVar) {
            this.f5801a.f5795j = true;
            BumpHintView bumpHintView = this.f5801a;
            C12932j.m33815a((Object) cVar, "it");
            bumpHintView.f5796k = ((float) cVar.mo22924a().height()) / ((float) cVar.mo22924a().width());
            this.f5801a.m7089d();
            this.f5801a.f5793h.setComposition(cVar);
            if (this.f5801a.f5799n) {
                this.f5801a.m7087c();
            }
        }
    }

    /* renamed from: app.zenly.locator.brump.BumpHintView$b */
    public static final class C1728b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ BumpHintView f5802b;

        /* renamed from: c */
        final /* synthetic */ Context f5803c;

        C1728b(BumpHintView bumpHintView, Context context) {
            this.f5802b = bumpHintView;
            this.f5803c = context;
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animation");
            super.onAnimationStart(animator);
            int b = C12973l.m33890b(this.f5802b.getFriends().length, 3);
            ArrayList arrayList = new ArrayList(b);
            for (int i = 0; i < b; i++) {
                arrayList.add(this.f5802b.getFriends()[i]);
            }
            String a = C7687c.m18719a(this.f5803c, arrayList);
            this.f5802b.f5794i.setText(this.f5802b.getResources().getString(R.string.bump_hint_explain_first_message, new Object[]{a}));
            this.f5802b.f5793h.mo22807d();
        }
    }

    /* renamed from: app.zenly.locator.brump.BumpHintView$c */
    public static final class C1729c extends C5432b {

        /* renamed from: b */
        final /* synthetic */ BumpHintView f5804b;

        /* renamed from: c */
        final /* synthetic */ Context f5805c;

        C1729c(BumpHintView bumpHintView, Context context) {
            this.f5804b = bumpHintView;
            this.f5805c = context;
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animation");
            super.onAnimationStart(animator);
            this.f5804b.f5794i.setText(this.f5804b.getResources().getString(R.string.bump_hint_explain_second_message));
            int[] b = BumpHintView.f5789p;
            ArrayList arrayList = new ArrayList(b.length);
            for (int a : b) {
                arrayList.add(Integer.valueOf(C0540a.m2536a(this.f5805c, a)));
            }
            C3169d dVar = new C3169d(this.f5805c, C12857w.m33672b((Collection) arrayList));
            this.f5804b.f5791f.mo9542a((ParticleAnimation) dVar);
            dVar.mo9509q();
        }
    }

    /* renamed from: app.zenly.locator.brump.BumpHintView$d */
    public static final class C1730d {
        private C1730d() {
        }

        public /* synthetic */ C1730d(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.brump.BumpHintView$e */
    static final class C1731e implements Runnable {

        /* renamed from: e */
        final /* synthetic */ BumpHintView f5806e;

        C1731e(BumpHintView bumpHintView) {
            this.f5806e = bumpHintView;
        }

        public final void run() {
            this.f5806e.m7089d();
        }
    }

    /* renamed from: app.zenly.locator.brump.BumpHintView$f */
    public static final class C1732f extends C5432b {

        /* renamed from: b */
        final /* synthetic */ BumpHintView f5807b;

        /* renamed from: c */
        final /* synthetic */ Function1 f5808c;

        C1732f(BumpHintView bumpHintView, Function1 function1) {
            this.f5807b = bumpHintView;
            this.f5808c = function1;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            this.f5807b.f5798m.removeListener(this);
            if (!z) {
                this.f5807b.f5793h.mo22797a();
            }
            this.f5808c.invoke(Boolean.valueOf(z));
        }
    }

    static {
        new C1730d(null);
    }

    public BumpHintView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BumpHintView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final String[] getFriends() {
        return this.f5800o;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C1731e(this));
    }

    public final void setFriends(String[] strArr) {
        C12932j.m33818b(strArr, "<set-?>");
        this.f5800o = strArr;
    }

    public BumpHintView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(new ContextThemeWrapper(context, 2132083207), attributeSet, i);
        this.f5798m = new AnimatorSet();
        this.f5800o = new String[0];
        View.inflate(context, R.layout.view_bump_hint, this);
        View findViewById = findViewById(R.id.background);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.background)");
        this.f5790e = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.particles);
        C12932j.m33815a((Object) findViewById2, "findViewById(R.id.particles)");
        this.f5791f = (ParticleView) findViewById2;
        View findViewById3 = findViewById(R.id.lottie_container);
        C12932j.m33815a((Object) findViewById3, "findViewById(R.id.lottie_container)");
        this.f5792g = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(R.id.lottie);
        C12932j.m33815a((Object) findViewById4, "findViewById(R.id.lottie)");
        this.f5793h = (LottieAnimationView) findViewById4;
        View findViewById5 = findViewById(R.id.text);
        C12932j.m33815a((Object) findViewById5, "findViewById(R.id.text)");
        this.f5794i = (TextView) findViewById5;
        C8507d.m19679a(context, (int) R.raw.lottie_bump_tuto).mo23032b(new C1727a(this));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5790e, View.ALPHA, new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5794i, View.ALPHA, new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C1728b(this, context));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f5794i, View.ALPHA, new float[]{1.0f, 0.0f});
        C12932j.m33815a((Object) ofFloat3, "firstTextDisappear");
        ofFloat3.setStartDelay(4000);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f5794i, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat4.addListener(new C1729c(this, context));
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f5790e, View.ALPHA, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f5794i, View.ALPHA, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f5792g, View.ALPHA, new float[]{1.0f, 0.0f});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ofFloat5, ofFloat6, ofFloat7});
        animatorSet2.setStartDelay(2500);
        this.f5798m.playSequentially(new Animator[]{animatorSet, ofFloat3, ofFloat4, animatorSet2});
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m7087c() {
        if (this.f5795j) {
            this.f5798m.start();
        } else {
            this.f5799n = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m7089d() {
        this.f5792g.getLayoutParams().height = (int) (((float) this.f5793h.getWidth()) * this.f5796k);
        this.f5792g.requestLayout();
    }

    /* renamed from: a */
    public final void mo7328a(Function1<? super Boolean, C12956q> function1) {
        C12932j.m33818b(function1, "completeListener");
        this.f5798m.addListener(new C1732f(this, function1));
        m7087c();
    }

    /* renamed from: a */
    public final void mo7327a() {
        this.f5799n = false;
        this.f5798m.cancel();
        ParticleAnimation<?> particleAnimation = this.f5797l;
        if (particleAnimation != null) {
            particleAnimation.mo9493a(true);
        }
        this.f5797l = null;
    }
}
