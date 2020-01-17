package app.zenly.locator.cards.p045l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.WatcherMedalCard;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5366w;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

/* renamed from: app.zenly.locator.cards.l.i */
public final class C1840i extends CardFragment {

    /* renamed from: m */
    public static final C1841a f6057m = new C1841a(null);

    /* renamed from: l */
    private HashMap f6058l;

    /* renamed from: app.zenly.locator.cards.l.i$a */
    public static final class C1841a {
        private C1841a() {
        }

        /* renamed from: a */
        public final C1840i mo7492a(WatcherMedalCard watcherMedalCard) {
            C12932j.m33818b(watcherMedalCard, "model");
            C1840i iVar = new C1840i();
            iVar.setArguments(iVar.mo7406a((Card) watcherMedalCard));
            return iVar;
        }

        public /* synthetic */ C1841a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public View mo7491a(int i) {
        if (this.f6058l == null) {
            this.f6058l = new HashMap();
        }
        View view = (View) this.f6058l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6058l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6058l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_watcher_medal_card, viewGroup, false);
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
            WatcherMedalCard watcherMedalCard = (WatcherMedalCard) c;
            ((TextView) mo7491a(C3891l.text_watch_count)).setTextColor(watcherMedalCard.mo7570e().mo7584a());
            ((TextView) mo7491a(C3891l.text_friends_count)).setTextColor(watcherMedalCard.mo7570e().mo7584a());
            Context context = getContext();
            if (context != null) {
                C12932j.m33815a((Object) context, "context!!");
                float integer = (float) context.getResources().getInteger(R.integer.shadow_radius_large);
                ((TextView) mo7491a(C3891l.text_watch_count)).setShadowLayer(integer, 0.0f, 0.0f, watcherMedalCard.mo7570e().mo7584a());
                ((TextView) mo7491a(C3891l.text_friends_count)).setShadowLayer(integer, 0.0f, 0.0f, watcherMedalCard.mo7570e().mo7584a());
                TextView textView = (TextView) mo7491a(C3891l.text_watch_count);
                C12932j.m33815a((Object) textView, "text_watch_count");
                Context requireContext = requireContext();
                String str = "requireContext()";
                C12932j.m33815a((Object) requireContext, str);
                textView.setText(C7706a.m18754a(requireContext, watcherMedalCard.mo7572g(), 0, 4, (Object) null));
                TextView textView2 = (TextView) mo7491a(C3891l.text_watch_times);
                C12932j.m33815a((Object) textView2, "text_watch_times");
                textView2.setText(getResources().getQuantityString(R.plurals.cards_watchers_watched_nb, watcherMedalCard.mo7572g()));
                TextView textView3 = (TextView) mo7491a(C3891l.text_friends_count);
                C12932j.m33815a((Object) textView3, "text_friends_count");
                Context requireContext2 = requireContext();
                C12932j.m33815a((Object) requireContext2, str);
                textView3.setText(C7706a.m18754a(requireContext2, watcherMedalCard.mo7571f(), 0, 4, (Object) null));
                TextView textView4 = (TextView) mo7491a(C3891l.text_friends);
                C12932j.m33815a((Object) textView4, "text_friends");
                textView4.setText(getResources().getQuantityText(R.plurals.cards_watchers_friends_nb, watcherMedalCard.mo7571f()));
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.WatcherMedalCard");
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C5366w wVar;
        C12932j.m33818b(hVar, "sharingOption");
        Card c = mo7417c();
        if (c != null) {
            int i = C1842j.f6059a[((WatcherMedalCard) c).mo7570e().ordinal()];
            if (i == 1) {
                wVar = C5366w.WOOD;
            } else if (i == 2) {
                wVar = C5366w.BRONZE;
            } else if (i == 3) {
                wVar = C5366w.SILVER;
            } else if (i == 4) {
                wVar = C5366w.GOLD;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C5343a.m15160U().mo12831a(wVar, hVar.mo7468a());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.WatcherMedalCard");
    }
}
