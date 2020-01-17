package app.zenly.locator.modals.p121o2;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C1236k;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.transition.C3066d;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.modals.o2.e */
public final class C4647e extends C4655h {

    /* renamed from: e */
    private final ConstraintLayout f12364e;

    /* renamed from: f */
    private final C0473c f12365f = new C0473c();

    /* renamed from: g */
    private final ParticleView f12366g;

    /* renamed from: h */
    private final TextView f12367h;

    /* renamed from: i */
    private final TextView f12368i;

    /* renamed from: j */
    private final View f12369j;

    /* renamed from: k */
    private final View f12370k;

    /* renamed from: l */
    private final TransitionSet f12371l;

    public C4647e(Context context) {
        C12932j.m33818b(context, "context");
        super(context);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6054a(C3066d.m9601a());
        transitionSet.mo6054a((Transition) C3066d.m9602b());
        C12932j.m33815a((Object) transitionSet, "TransitionSet()\n        …ion(Transitions.bounceIn)");
        this.f12371l = transitionSet;
        setBackgroundColor(C7678c.m18702a(context, (int) R.attr.zenlyColorBackground));
        View.inflate(context, R.layout.modal_view_emoji_pack_unlocked, this);
        View findViewById = findViewById(R.id.modal_layout);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.modal_layout)");
        this.f12364e = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.modal_particles);
        C12932j.m33815a((Object) findViewById2, "findViewById(R.id.modal_particles)");
        this.f12366g = (ParticleView) findViewById2;
        View findViewById3 = findViewById(R.id.modal_title);
        C12932j.m33815a((Object) findViewById3, "findViewById(R.id.modal_title)");
        this.f12367h = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.modal_details);
        C12932j.m33815a((Object) findViewById4, "findViewById(R.id.modal_details)");
        this.f12368i = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.modal_close_layout);
        C12932j.m33815a((Object) findViewById5, "findViewById(R.id.modal_close_layout)");
        this.f12369j = findViewById5;
        View findViewById6 = findViewById(R.id.modal_close);
        C12932j.m33815a((Object) findViewById6, "findViewById(R.id.modal_close)");
        this.f12370k = findViewById6;
    }

    /* renamed from: a */
    public final void mo11832a() {
        CharSequence text = this.f12367h.getText();
        C12932j.m33815a((Object) text, "title.text");
        boolean z = true;
        int i = 0;
        boolean z2 = text.length() > 0;
        CharSequence text2 = this.f12368i.getText();
        C12932j.m33815a((Object) text2, "subtitle.text");
        if (text2.length() <= 0) {
            z = false;
        }
        C0473c cVar = this.f12365f;
        cVar.mo2783c(this.f12364e);
        cVar.mo2785d(this.f12367h.getId(), z2 ? 0 : 8);
        int id = this.f12368i.getId();
        if (!z) {
            i = 8;
        }
        cVar.mo2785d(id, i);
        C1236k.m5968a((ViewGroup) this.f12364e, (Transition) this.f12371l);
        cVar.mo2779b(this.f12364e);
    }

    public final ParticleView getParticles() {
        return this.f12366g;
    }

    public void setCloseButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
        this.f12370k.setOnClickListener(onClickListener);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        TextView textView = this.f12367h;
        textView.setPadding(i, i2, i3, textView.getPaddingBottom());
        TextView textView2 = this.f12368i;
        textView2.setPadding(i, textView2.getPaddingTop(), i3, textView2.getPaddingBottom());
        View view = this.f12369j;
        view.setPadding(i, view.getPaddingTop(), i3, i4);
    }

    public void setPrimaryActionButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
    }

    public void setSecondaryActionButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
    }

    public final void setSubtitle(String str) {
        this.f12368i.setText(str);
    }

    public final void setTitle(String str) {
        C12932j.m33818b(str, "text");
        this.f12367h.setText(str);
    }
}
