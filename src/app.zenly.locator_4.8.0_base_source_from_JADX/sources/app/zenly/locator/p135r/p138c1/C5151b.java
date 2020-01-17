package app.zenly.locator.p135r.p138c1;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.contactpicker.adapter.ContactAdapter.OnCellInteraction;
import app.zenly.locator.contactpicker.adapter.p061m.C2418a;
import app.zenly.locator.p135r.p137b1.C5139b;
import app.zenly.locator.p143s.p146j.C5432b;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.C12956q;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;

/* renamed from: app.zenly.locator.r.c1.b */
public class C5151b {

    /* renamed from: app.zenly.locator.r.c1.b$a */
    static class C5152a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ C5139b f13363b;

        /* renamed from: c */
        final /* synthetic */ OnCellInteraction f13364c;

        /* renamed from: d */
        final /* synthetic */ C2418a f13365d;

        C5152a(C5139b bVar, OnCellInteraction onCellInteraction, C2418a aVar) {
            this.f13363b = bVar;
            this.f13364c = onCellInteraction;
            this.f13365d = aVar;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (this.f13363b != null && this.f13364c != null) {
                this.f13365d.f7270l.setVisibility(8);
                this.f13364c.onCellUpdated(this.f13363b);
            }
        }
    }

    /* renamed from: app.zenly.locator.r.c1.b$b */
    static class C5153b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ TextView f13366b;

        /* renamed from: c */
        final /* synthetic */ int f13367c;

        C5153b(TextView textView, int i) {
            this.f13366b = textView;
            this.f13367c = i;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            super.mo7336a(animator, z);
            this.f13366b.setText(this.f13367c);
        }
    }

    /* renamed from: a */
    public static void m14709a(C2418a aVar, C5139b bVar, OnCellInteraction onCellInteraction) {
        aVar.f7270l.setVisibility(0);
        aVar.f7270l.mo22798a((AnimatorListener) new C5152a(bVar, onCellInteraction, aVar));
        aVar.f7270l.mo22807d();
    }

    /* renamed from: a */
    public static void m14708a(TextView textView, int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.addListener(new C5153b(textView, i));
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.setDuration(200);
        animatorSet.start();
    }

    /* renamed from: a */
    public static void m14710a(LottieAnimationView lottieAnimationView, View view, C5432b bVar) {
        view.setAlpha(0.0f);
        C7697b.m18739c(view, 200, new C5150a(lottieAnimationView, bVar));
    }

    /* renamed from: a */
    static /* synthetic */ C12956q m14707a(LottieAnimationView lottieAnimationView, C5432b bVar) {
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.mo22798a((AnimatorListener) bVar);
        lottieAnimationView.mo22807d();
        return C12956q.f33541a;
    }
}
