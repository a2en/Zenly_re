package app.zenly.locator.cards.p045l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.descendants.C1382g;
import app.zenly.android.feature.descendants.repository.DescendantsRepository;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.WorldRankingCard;
import app.zenly.locator.cards.p046m.C1852b;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.store.C3034i;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3242w;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5350g;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.cards.l.l */
public final class C1845l extends CardFragment {

    /* renamed from: o */
    public static final C1846a f6062o = new C1846a(null);

    /* renamed from: l */
    private Animator f6063l;

    /* renamed from: m */
    private C1852b f6064m;

    /* renamed from: n */
    private HashMap f6065n;

    /* renamed from: app.zenly.locator.cards.l.l$a */
    public static final class C1846a {
        private C1846a() {
        }

        /* renamed from: a */
        public final C1845l mo7498a(WorldRankingCard worldRankingCard) {
            C12932j.m33818b(worldRankingCard, "model");
            C1845l lVar = new C1845l();
            lVar.setArguments(lVar.mo7406a((Card) worldRankingCard));
            return lVar;
        }

        public /* synthetic */ C1846a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public View mo7495a(int i) {
        if (this.f6065n == null) {
            this.f6065n = new HashMap();
        }
        View view = (View) this.f6065n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6065n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6065n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final void mo7497b(int i) {
        Animator animator = this.f6063l;
        if (animator != null) {
            animator.end();
        }
        View a = mo7495a(C3891l.progress);
        C12932j.m33815a((Object) a, "progress");
        a.setVisibility(8);
        TextView textView = (TextView) mo7495a(C3891l.text_subtitle);
        String str = "text_subtitle";
        C12932j.m33815a((Object) textView, str);
        textView.setText(getString(R.string.cards_descendantsWorldwideRanking_rank, Integer.valueOf(i)));
        TextView textView2 = (TextView) mo7495a(C3891l.text_subtitle);
        C12932j.m33815a((Object) textView2, str);
        textView2.setVisibility(0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_descendants_world_ranking, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onStart() {
        super.onStart();
        View a = mo7495a(C3891l.progress);
        C12932j.m33815a((Object) a, "progress");
        if (a.getVisibility() == 0) {
            Animator animator = this.f6063l;
            if (animator != null) {
                animator.start();
            }
        }
        C1852b bVar = this.f6064m;
        if (bVar != null) {
            bVar.mo7505a();
        } else {
            C12932j.m33820c("worldRankingCardPresenter");
            throw null;
        }
    }

    public void onStop() {
        Animator animator = this.f6063l;
        if (animator != null) {
            animator.end();
        }
        C1852b bVar = this.f6064m;
        if (bVar != null) {
            bVar.mo7506b();
            super.onStop();
            return;
        }
        C12932j.m33820c("worldRankingCardPresenter");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        String a = C3242w.m10278a((CharSequence) getString(R.string.cards_descendantsWorldwideRanking_title));
        TextView textView = (TextView) mo7495a(C3891l.text_title);
        C12932j.m33815a((Object) textView, "text_title");
        textView.setText(a);
        Card c = mo7417c();
        String str = "null cannot be cast to non-null type app.zenly.locator.cards.models.WorldRankingCard";
        if (c != null) {
            WorldRankingCard worldRankingCard = (WorldRankingCard) c;
            TextView textView2 = (TextView) view.findViewById(C3891l.text_pop_count);
            C12932j.m33815a((Object) textView2, "view.text_pop_count");
            textView2.setText(getResources().getQuantityString(R.plurals.cards_descendantsWorldwideRanking_count, worldRankingCard.mo7577e(), new Object[]{Integer.valueOf(worldRankingCard.mo7577e())}));
            this.f6063l = AnimatorInflater.loadAnimator(requireContext(), R.animator.card_progress_bar_bounce);
            Animator animator = this.f6063l;
            if (animator != null) {
                animator.setTarget(mo7495a(C3891l.progress));
            }
            Context requireContext = requireContext();
            String str2 = "requireContext()";
            C12932j.m33815a((Object) requireContext, str2);
            DescendantsRepository provideDescendantsRepository = C1382g.m6431a(requireContext).provideDescendantsRepository();
            Context requireContext2 = requireContext();
            C12932j.m33815a((Object) requireContext2, str2);
            C3034i provideFriendStore = C3015a.m9526a(requireContext2).provideFriendStore();
            ZenlyCore a2 = C5448c.m15478a();
            Card c2 = mo7417c();
            if (c2 != null) {
                C1852b bVar = new C1852b(a2, provideFriendStore, provideDescendantsRepository, (WorldRankingCard) c2, this);
                this.f6064m = bVar;
                return;
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }

    /* renamed from: a */
    public final void mo7496a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        Request withPlaceholderStrategy = new C2477e(requireContext).load(C2884f.m9355a(userProto$User)).withPlaceholderStrategy(C1333c.DisplayName);
        ImageView imageView = (ImageView) mo7495a(C3891l.avatar);
        C12932j.m33815a((Object) imageView, "avatar");
        withPlaceholderStrategy.into(imageView);
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C12932j.m33818b(hVar, "sharingOption");
        Card c = mo7417c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.WorldRankingCard");
        } else if (C12932j.m33817a((Object) ((WorldRankingCard) c).mo7578f(), (Object) C5447b.m15477d(C5448c.m15478a()))) {
            C5343a.m15160U().mo12821a(C5350g.INTERNATIONAL_RANK, hVar.mo7468a());
        } else {
            C5343a.m15160U().mo12860b(C5350g.INTERNATIONAL_RANK, hVar.mo7468a());
        }
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
        textView2.setVisibility(4);
        textView.setMinHeight(getResources().getDimensionPixelSize(R.dimen.grid_size_250));
        textView.setBackgroundResource(R.drawable.button_pink);
        textView.setBackgroundTintList(null);
        textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.white));
        textView.setText(R.string.cards_descendantsWorldwideRanking_notRanked_button);
        textView.setVisibility(0);
    }
}
