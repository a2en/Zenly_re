package app.zenly.locator.cards.p045l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.descendants.C1385j;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.DescendantsCard;
import app.zenly.locator.core.util.C3242w;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5350g;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

/* renamed from: app.zenly.locator.cards.l.f */
public final class C1833f extends CardFragment {

    /* renamed from: m */
    public static final C1834a f6050m = new C1834a(null);

    /* renamed from: l */
    private HashMap f6051l;

    /* renamed from: app.zenly.locator.cards.l.f$a */
    public static final class C1834a {
        private C1834a() {
        }

        /* renamed from: a */
        public final C1833f mo7486a(DescendantsCard descendantsCard) {
            C12932j.m33818b(descendantsCard, "model");
            C1833f fVar = new C1833f();
            fVar.setArguments(fVar.mo7406a((Card) descendantsCard));
            return fVar;
        }

        public /* synthetic */ C1834a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public View mo7485a(int i) {
        if (this.f6051l == null) {
            this.f6051l = new HashMap();
        }
        View view = (View) this.f6051l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6051l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6051l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_descendants_empty_card, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        Card c = mo7417c();
        if (c != null) {
            DescendantsCard descendantsCard = (DescendantsCard) c;
            TextView textView = (TextView) mo7485a(C3891l.text_babies_count);
            C12932j.m33815a((Object) textView, "text_babies_count");
            Context requireContext = requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            textView.setText(C7706a.m18754a(requireContext, descendantsCard.mo7552e(), 0, 4, (Object) null));
            TextView textView2 = (TextView) mo7485a(C3891l.text_babies_times);
            C12932j.m33815a((Object) textView2, "text_babies_times");
            textView2.setText(C3242w.m10278a((CharSequence) getResources().getQuantityString(R.plurals.cards_descendants_title, descendantsCard.mo7552e())));
            TextView textView3 = (TextView) mo7485a(C3891l.text_subtitle);
            C12932j.m33815a((Object) textView3, "text_subtitle");
            textView3.setText(descendantsCard.mo7554g());
            ((ImageView) mo7485a(C3891l.card_icon)).setImageResource(descendantsCard.mo7555h() ? 2131231632 : C1385j.ic_card_descendant_0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.DescendantsCard");
    }

    /* renamed from: a */
    public void mo7408a(TextView textView) {
        C12932j.m33818b(textView, "title");
        textView.setVisibility(0);
        textView.setText(R.string.cards_descendants_title_empty);
        textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.white_o30));
    }

    /* renamed from: a */
    public void mo7409a(TextView textView, TextView textView2) {
        C12932j.m33818b(textView, "actionButton");
        C12932j.m33818b(textView2, "actionButtonBadge");
        textView2.setVisibility(4);
        textView.setText(R.string.cards_descendants_button_invite);
        textView.setBackgroundResource(R.drawable.button_pink);
        textView.setBackgroundTintList(null);
        textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.white));
        textView.setMinHeight(getResources().getDimensionPixelSize(R.dimen.grid_size_300));
        textView.setVisibility(0);
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C12932j.m33818b(hVar, "sharingOption");
        Card c = mo7417c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.DescendantsCard");
        } else if (((DescendantsCard) c).mo7555h()) {
            C5343a.m15160U().mo12821a(C5350g.COUNT_EMPTY, hVar.mo7468a());
        } else {
            C5343a.m15160U().mo12860b(C5350g.COUNT_EMPTY, hVar.mo7468a());
        }
    }
}
