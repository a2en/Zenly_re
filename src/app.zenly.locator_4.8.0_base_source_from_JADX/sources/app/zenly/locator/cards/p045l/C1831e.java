package app.zenly.locator.cards.p045l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.descendants.C1382g;
import app.zenly.android.feature.descendants.DescendantsModule;
import app.zenly.android.feature.descendants.model.C1389a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.DescendantsCard;
import app.zenly.locator.core.p072ui.view.particles.C3160b;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3242w;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5350g;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;

/* renamed from: app.zenly.locator.cards.l.e */
public final class C1831e extends CardFragment {

    /* renamed from: n */
    public static final C1832a f6047n = new C1832a(null);

    /* renamed from: l */
    private C3160b f6048l;

    /* renamed from: m */
    private HashMap f6049m;

    /* renamed from: app.zenly.locator.cards.l.e$a */
    public static final class C1832a {
        private C1832a() {
        }

        /* renamed from: a */
        public final C1831e mo7484a(DescendantsCard descendantsCard) {
            C12932j.m33818b(descendantsCard, "model");
            C1831e eVar = new C1831e();
            eVar.setArguments(eVar.mo7406a((Card) descendantsCard));
            return eVar;
        }

        public /* synthetic */ C1832a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: c */
    private final void m7313c(boolean z) {
        C3160b bVar = this.f6048l;
        if (bVar == null) {
            return;
        }
        if (z) {
            if (bVar.mo9501i()) {
                bVar.mo9507o();
            } else {
                bVar.mo9509q();
            }
        } else if (bVar.mo9503k()) {
            bVar.mo9505m();
        }
    }

    /* renamed from: a */
    public View mo7483a(int i) {
        if (this.f6049m == null) {
            this.f6049m = new HashMap();
        }
        View view = (View) this.f6049m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6049m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6049m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_descendants_card, viewGroup, false);
    }

    public void onDestroyView() {
        C3160b bVar = this.f6048l;
        if (bVar != null) {
            bVar.mo9493a(true);
        }
        this.f6048l = null;
        super.onDestroyView();
        mo6508a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "view.context");
        DescendantsModule a = C1382g.m6431a(context);
        a.provideDescendantsActionInterceptor().mo6646a(a.provideDescendantsPrefs().getAllPreferences(), 6);
        Card c = mo7417c();
        if (c != null) {
            DescendantsCard descendantsCard = (DescendantsCard) c;
            Context context2 = getContext();
            if (context2 != null) {
                C12932j.m33815a((Object) context2, "context!!");
                TextView textView = (TextView) mo7483a(C3891l.text_babies_count);
                C12932j.m33815a((Object) textView, "text_babies_count");
                textView.setText(C7706a.m18754a(context2, descendantsCard.mo7552e(), 0, 4, (Object) null));
                TextView textView2 = (TextView) mo7483a(C3891l.text_babies_times);
                C12932j.m33815a((Object) textView2, "text_babies_times");
                textView2.setText(C3242w.m10278a((CharSequence) getResources().getQuantityString(R.plurals.cards_descendants_title, descendantsCard.mo7552e())));
                TextView textView3 = (TextView) mo7483a(C3891l.text_subtitle);
                C12932j.m33815a((Object) textView3, "text_subtitle");
                textView3.setText(descendantsCard.mo7554g());
                ((ImageView) mo7483a(C3891l.card_icon)).setImageResource(C1389a.m6432a(descendantsCard.mo7552e()).mo6654a());
                C3160b bVar = new C3160b();
                bVar.mo9578c(true);
                bVar.mo9575b(true);
                bVar.mo9571a(new int[]{C0540a.m2536a(context2, (int) R.color.pink), C0540a.m2536a(context2, (int) R.color.pink_light), C0540a.m2536a(context2, (int) R.color.yellow), C0540a.m2536a(context2, (int) R.color.yellow_light)});
                bVar.mo9577c(15);
                bVar.mo9573b(C3200e0.m10183a(context2, 170));
                bVar.mo9576c(0.2f, 1.0f);
                bVar.mo9564a(0.6f);
                bVar.mo9568a(1200);
                bVar.mo9579d(180.0f, 260.0f);
                bVar.mo9489a(BitmapFactory.decodeResource(getResources(), 2131231361), 1);
                this.f6048l = bVar;
                ((ParticleView) mo7483a(C3891l.particle_view)).mo9542a((ParticleAnimation) this.f6048l);
                if (mo7418d()) {
                    C3160b bVar2 = this.f6048l;
                    if (bVar2 != null) {
                        bVar2.mo9509q();
                        return;
                    }
                    return;
                }
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.DescendantsCard");
    }

    /* renamed from: a */
    public void mo7408a(TextView textView) {
        C12932j.m33818b(textView, "title");
        textView.setVisibility(4);
    }

    /* renamed from: a */
    public void mo7409a(TextView textView, TextView textView2) {
        C12932j.m33818b(textView, "actionButton");
        C12932j.m33818b(textView2, "actionButtonBadge");
        textView.setMinHeight(getResources().getDimensionPixelSize(R.dimen.grid_size_250));
        Card c = mo7417c();
        String str = "null cannot be cast to non-null type app.zenly.locator.cards.models.DescendantsCard";
        if (c == null) {
            throw new TypeCastException(str);
        } else if (!((DescendantsCard) c).mo7555h()) {
            textView.setVisibility(4);
            textView2.setVisibility(4);
        } else {
            textView.setVisibility(0);
            Context requireContext = requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            if (C7710c.m18767b(C1382g.m6431a(requireContext).provideDescendantsPrefs().getAllPreferences().mo6640b(), 8)) {
                textView.setBackgroundResource(R.drawable.button_blue_black);
                textView.setBackgroundTintList(null);
                textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.blue_light));
                Card c2 = mo7417c();
                if (c2 != null) {
                    DescendantsCard descendantsCard = (DescendantsCard) c2;
                    textView.setText(textView.getResources().getQuantityString(R.plurals.cards_descendants_button_seeNew, descendantsCard.mo7553f(), new Object[]{Integer.valueOf(descendantsCard.mo7553f())}));
                    Context context = textView2.getContext();
                    C12932j.m33815a((Object) context, "actionButtonBadge.context");
                    textView2.setText(C7706a.m18752a(context, descendantsCard.mo7553f(), 9));
                    textView2.setVisibility(0);
                    return;
                }
                throw new TypeCastException(str);
            }
            textView.setBackgroundResource(R.drawable.button_blue_medium);
            textView.setBackgroundTintList(ColorStateList.valueOf(C0540a.m2536a(requireContext(), (int) R.color.cerulean_blue_dark)));
            textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.cerulean_blue_light));
            textView.setText(R.string.cards_descendants_button_list);
            textView2.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7415a(boolean z) {
        super.mo7415a(z);
        m7313c(z);
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C12932j.m33818b(hVar, "sharingOption");
        Card c = mo7417c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.DescendantsCard");
        } else if (((DescendantsCard) c).mo7555h()) {
            C5343a.m15160U().mo12821a(C5350g.COUNT, hVar.mo7468a());
        } else {
            C5343a.m15160U().mo12860b(C5350g.COUNT, hVar.mo7468a());
        }
    }
}
