package app.zenly.locator.chat.p056p5;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import app.zenly.android.base.view.C1309a;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.p143s.p146j.C5432b;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.chat.p5.b */
public final class C2205b {

    /* renamed from: a */
    private Function1<? super String, C12956q> f6751a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final View f6752b;

    /* renamed from: c */
    private final TextView f6753c = ((TextView) this.f6752b.findViewById(R.id.tv_title));

    /* renamed from: d */
    private final TextView f6754d = ((TextView) this.f6752b.findViewById(R.id.tv_text));

    /* renamed from: e */
    private final TextView f6755e;

    /* renamed from: f */
    private final TextView f6756f;

    /* renamed from: g */
    private final TextView f6757g;

    /* renamed from: h */
    private final LottieAnimationView f6758h;

    /* renamed from: i */
    private final AnimatorSet f6759i;

    /* renamed from: j */
    private final ObjectAnimator f6760j;

    /* renamed from: k */
    private final AnimatorSet f6761k;

    /* renamed from: l */
    private final AnimatorSet f6762l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2879d0 f6763m;

    /* renamed from: app.zenly.locator.chat.p5.b$a */
    static final class C2206a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2205b f6764e;

        C2206a(C2205b bVar) {
            this.f6764e = bVar;
        }

        public final void onClick(View view) {
            C2879d0 b = this.f6764e.f6763m;
            if (b != null) {
                Function1 a = this.f6764e.mo8030a();
                if (a != null) {
                    C12956q qVar = (C12956q) a.invoke(b.mo8945g());
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.p5.b$b */
    public static final class C2207b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ C2205b f6765b;

        C2207b(C2205b bVar) {
            this.f6765b = bVar;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            super.mo7336a(animator, z);
            if (!z) {
                this.f6765b.mo8033b();
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.p5.b$c */
    public static final class C2208c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C2205b f6766a;

        public C2208c(C2205b bVar) {
            this.f6766a = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            View a = this.f6766a.f6752b;
            C12932j.m33815a((Object) a, "dialogView");
            a.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    public C2205b(View view) {
        C12932j.m33818b(view, "containerView");
        this.f6752b = view.findViewById(R.id.chat_location_disabled);
        TextView textView = (TextView) this.f6752b.findViewById(R.id.btn_cta);
        textView.setOnClickListener(new C2206a(this));
        this.f6755e = textView;
        this.f6756f = (TextView) this.f6752b.findViewById(R.id.tv_ask_success_title);
        this.f6757g = (TextView) this.f6752b.findViewById(R.id.tv_ask_success_text);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f6752b.findViewById(R.id.lottie_ask_success_checked);
        lottieAnimationView.mo22798a((AnimatorListener) new C2207b(this));
        this.f6758h = lottieAnimationView;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f6752b, C1309a.f4895a, new float[]{0.5f, 1.0f}), ObjectAnimator.ofFloat(this.f6752b, View.ALPHA, new float[]{0.0f, 1.0f})});
        animatorSet.setDuration(300);
        animatorSet.setInterpolator(C7657c.m18650f());
        this.f6759i = animatorSet;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6752b, C1309a.f4895a, new float[]{1.0f, 1.1f, 1.0f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(C7657c.m18641a());
        this.f6760j = ofFloat;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f6752b, C1309a.f4895a, new float[]{1.0f, 0.5f}), ObjectAnimator.ofFloat(this.f6752b, View.ALPHA, new float[]{1.0f, 0.0f})});
        animatorSet2.setDuration(100);
        animatorSet2.setInterpolator(C7657c.m18641a());
        animatorSet2.addListener(new C2208c(this));
        this.f6761k = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f6753c, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f6754d, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f6755e, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f6756f, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f6757g, View.ALPHA, new float[]{0.0f, 1.0f})});
        animatorSet3.setDuration(300);
        animatorSet3.setInterpolator(C7657c.m18643b());
        this.f6762l = animatorSet3;
    }

    /* renamed from: c */
    public final C12956q mo8034c() {
        C2879d0 d0Var = this.f6763m;
        if (d0Var == null) {
            return null;
        }
        mo8031a(d0Var);
        return C12956q.f33541a;
    }

    /* renamed from: d */
    public final void mo8035d() {
        LottieAnimationView lottieAnimationView = this.f6758h;
        String str = "lottieAskSuccessChecked";
        C12932j.m33815a((Object) lottieAnimationView, str);
        if (lottieAnimationView.getVisibility() != 0) {
            LottieAnimationView lottieAnimationView2 = this.f6758h;
            C12932j.m33815a((Object) lottieAnimationView2, str);
            lottieAnimationView2.setVisibility(0);
            this.f6762l.start();
            this.f6758h.mo22807d();
        }
    }

    /* renamed from: a */
    public final Function1<String, C12956q> mo8030a() {
        return this.f6751a;
    }

    /* renamed from: b */
    public final void mo8033b() {
        View view = this.f6752b;
        C12932j.m33815a((Object) view, "dialogView");
        if (view.getVisibility() == 0 && !this.f6761k.isRunning()) {
            this.f6762l.cancel();
            this.f6759i.cancel();
            this.f6760j.cancel();
            this.f6761k.start();
        }
    }

    /* renamed from: a */
    public final void mo8032a(Function1<? super String, C12956q> function1) {
        this.f6751a = function1;
    }

    /* renamed from: a */
    public final void mo8031a(C2879d0 d0Var) {
        C12932j.m33818b(d0Var, "user");
        this.f6763m = d0Var;
        View view = this.f6752b;
        String str = "dialogView";
        C12932j.m33815a((Object) view, str);
        Context context = view.getContext();
        TextView textView = this.f6753c;
        String str2 = "tvTitle";
        C12932j.m33815a((Object) textView, str2);
        textView.setText(context.getString(R.string.location_requestAlways_modale_title, new Object[]{d0Var.mo8942e()}));
        TextView textView2 = this.f6754d;
        String str3 = "tvText";
        C12932j.m33815a((Object) textView2, str3);
        textView2.setText(context.getString(R.string.location_requestAlways_modale_message, new Object[]{d0Var.mo8942e()}));
        TextView textView3 = this.f6757g;
        String str4 = "tvAskSuccessText";
        C12932j.m33815a((Object) textView3, str4);
        textView3.setText(context.getString(R.string.location_requestAlways_modaleSuccess_message, new Object[]{d0Var.mo8942e()}));
        this.f6762l.cancel();
        TextView textView4 = this.f6753c;
        C12932j.m33815a((Object) textView4, str2);
        textView4.setAlpha(1.0f);
        TextView textView5 = this.f6754d;
        C12932j.m33815a((Object) textView5, str3);
        textView5.setAlpha(1.0f);
        TextView textView6 = this.f6755e;
        C12932j.m33815a((Object) textView6, "btnCta");
        textView6.setAlpha(1.0f);
        this.f6758h.mo22797a();
        TextView textView7 = this.f6756f;
        C12932j.m33815a((Object) textView7, "tvAskSuccessTitle");
        textView7.setAlpha(0.0f);
        TextView textView8 = this.f6757g;
        C12932j.m33815a((Object) textView8, str4);
        textView8.setAlpha(0.0f);
        LottieAnimationView lottieAnimationView = this.f6758h;
        C12932j.m33815a((Object) lottieAnimationView, "lottieAskSuccessChecked");
        lottieAnimationView.setVisibility(4);
        View view2 = this.f6752b;
        C12932j.m33815a((Object) view2, str);
        if (view2.getVisibility() != 0 || this.f6761k.isRunning()) {
            this.f6761k.cancel();
            View view3 = this.f6752b;
            C12932j.m33815a((Object) view3, str);
            view3.setVisibility(0);
            this.f6759i.start();
        } else if (!this.f6759i.isRunning()) {
            this.f6760j.start();
        }
    }
}
