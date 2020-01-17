package app.zenly.locator.cards.p045l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.WorldRankingCard;
import app.zenly.locator.core.util.C3242w;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5350g;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.cards.l.k */
public final class C1843k extends CardFragment {

    /* renamed from: m */
    public static final C1844a f6060m = new C1844a(null);

    /* renamed from: l */
    private HashMap f6061l;

    /* renamed from: app.zenly.locator.cards.l.k$a */
    public static final class C1844a {
        private C1844a() {
        }

        /* renamed from: a */
        public final C1843k mo7494a(WorldRankingCard worldRankingCard) {
            C12932j.m33818b(worldRankingCard, "model");
            C1843k kVar = new C1843k();
            kVar.setArguments(kVar.mo7406a((Card) worldRankingCard));
            return kVar;
        }

        public /* synthetic */ C1844a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public View mo7493a(int i) {
        if (this.f6061l == null) {
            this.f6061l = new HashMap();
        }
        View view = (View) this.f6061l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6061l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6061l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_descendants_locked_world_ranking, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        String a = C3242w.m10278a((CharSequence) getString(R.string.cards_descendantsWorldwideRanking_title));
        TextView textView = (TextView) mo7493a(C3891l.text_title);
        C12932j.m33815a((Object) textView, "text_title");
        textView.setText(a);
        Card c = mo7417c();
        if (c != null) {
            WorldRankingCard worldRankingCard = (WorldRankingCard) c;
            TextView textView2 = (TextView) view.findViewById(C3891l.text_required_pop_count);
            C12932j.m33815a((Object) textView2, "view.text_required_pop_count");
            textView2.setText(getString(R.string.cards_descendantsWorldwideRanking_notRanked_count, Integer.valueOf(worldRankingCard.mo7577e()), Integer.valueOf(10)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.WorldRankingCard");
    }

    /* renamed from: a */
    public void mo7408a(TextView textView) {
        C12932j.m33818b(textView, "title");
        Card c = mo7417c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.WorldRankingCard");
        } else if (((WorldRankingCard) c).mo7577e() < 10) {
            textView.setVisibility(0);
            textView.setText(getResources().getQuantityString(R.plurals.cards_descendantsWorldwideRanking_notRanked_trivia, 10, new Object[]{Integer.valueOf(10)}));
            textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.white_o30));
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo7409a(TextView textView, TextView textView2) {
        C12932j.m33818b(textView, "actionButton");
        C12932j.m33818b(textView2, "actionButtonBadge");
        textView2.setVisibility(4);
        textView.setMinHeight(getResources().getDimensionPixelSize(R.dimen.grid_size_250));
        textView.setBackgroundResource(R.drawable.button_pink);
        textView.setBackgroundTintList(null);
        textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.white));
        textView.setText(R.string.cards_descendantsWorldwideRanking_notRanked_button);
        textView.setVisibility(0);
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C12932j.m33818b(hVar, "sharingOption");
        Card c = mo7417c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.WorldRankingCard");
        } else if (C12932j.m33817a((Object) ((WorldRankingCard) c).mo7578f(), (Object) C5447b.m15477d(C5448c.m15478a()))) {
            C5343a.m15160U().mo12821a(C5350g.INTERNATIONAL_RANK_EMPTY, hVar.mo7468a());
        } else {
            C5343a.m15160U().mo12860b(C5350g.INTERNATIONAL_RANK_EMPTY, hVar.mo7468a());
        }
    }
}
