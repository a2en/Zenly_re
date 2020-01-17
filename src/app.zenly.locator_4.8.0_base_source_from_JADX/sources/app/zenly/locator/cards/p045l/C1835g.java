package app.zenly.locator.cards.p045l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.descendants.C1382g;
import app.zenly.android.feature.descendants.model.RankedDescendant;
import app.zenly.android.feature.descendants.p011r.C1405d;
import app.zenly.android.feature.descendants.repository.DescendantsRepository;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.TopPopsCard;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.core.util.C3242w;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5350g;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.cards.l.g */
public final class C1835g extends CardFragment {

    /* renamed from: o */
    public static final C1836a f6052o = new C1836a(null);

    /* renamed from: l */
    private C12275b f6053l;

    /* renamed from: m */
    private DescendantsRepository f6054m;

    /* renamed from: n */
    private HashMap f6055n;

    /* renamed from: app.zenly.locator.cards.l.g$a */
    public static final class C1836a {
        private C1836a() {
        }

        /* renamed from: a */
        public final C1835g mo7488a(TopPopsCard topPopsCard) {
            C12932j.m33818b(topPopsCard, "model");
            C1835g gVar = new C1835g();
            gVar.setArguments(gVar.mo7406a((Card) topPopsCard));
            return gVar;
        }

        public /* synthetic */ C1836a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.l.g$b */
    static final /* synthetic */ class C1837b extends C12931i implements Function1<List<? extends RankedDescendant>, C12956q> {
        C1837b(C1835g gVar) {
            super(1, gVar);
        }

        /* renamed from: a */
        public final void mo7489a(List<? extends RankedDescendant> list) {
            C12932j.m33818b(list, "p1");
            ((C1835g) this.f33505f).m7332a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1835g.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "buildLeaderBoard(Ljava/util/List;)V";
        }

        public final String getName() {
            return "buildLeaderBoard";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7489a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.cards.l.g$c */
    static final /* synthetic */ class C1838c extends C12931i implements Function1<Throwable, C12956q> {
        C1838c(C1835g gVar) {
            super(1, gVar);
        }

        /* renamed from: a */
        public final void mo7490a(Throwable th) {
            C12932j.m33818b(th, "p1");
            ((C1835g) this.f33505f).m7331a(th);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1835g.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "logError(Ljava/lang/Throwable;)V";
        }

        public final String getName() {
            return "logError";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7490a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: a */
    public View mo7487a(int i) {
        if (this.f6055n == null) {
            this.f6055n = new HashMap();
        }
        View view = (View) this.f6055n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6055n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6055n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        this.f6054m = C1382g.m6431a(requireContext).provideDescendantsRepository();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_top_descendants, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onStart() {
        super.onStart();
        C12275b bVar = this.f6053l;
        if (bVar != null) {
            bVar.mo36401a();
        }
        this.f6053l = new C12275b();
        Card c = mo7417c();
        if (c != null) {
            TopPopsCard topPopsCard = (TopPopsCard) c;
            DescendantsRepository descendantsRepository = this.f6054m;
            if (descendantsRepository != null) {
                Disposable a = descendantsRepository.getLeaderBoard(topPopsCard.mo7565f()).mo36535a(C12295a.m32802a()).mo36533a((Consumer<? super T>) new C1839h<Object>(new C1837b(this)), (Consumer<? super Throwable>) new C1839h<Object>(new C1838c(this)));
                C12932j.m33815a((Object) a, "descendantsRepository.ge…dLeaderBoard, ::logError)");
                C12275b bVar2 = this.f6053l;
                if (bVar2 != null) {
                    C12773a.m33432a(a, bVar2);
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            } else {
                C12932j.m33820c("descendantsRepository");
                throw null;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.TopPopsCard");
        }
    }

    public void onStop() {
        C12275b bVar = this.f6053l;
        if (bVar != null) {
            bVar.mo36401a();
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        String a = C3242w.m10278a((CharSequence) getString(R.string.cards_descendantsLeaderboard_title));
        TextView textView = (TextView) mo7487a(C3891l.text_top_pops);
        C12932j.m33815a((Object) textView, "text_top_pops");
        textView.setText(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7332a(List<? extends RankedDescendant> list) {
        Card c = mo7417c();
        if (c != null) {
            TopPopsCard topPopsCard = (TopPopsCard) c;
            LayoutInflater from = LayoutInflater.from(requireContext());
            ((LinearLayout) mo7487a(C3891l.leaderboard_list)).removeAllViews();
            for (RankedDescendant rankedDescendant : list) {
                View inflate = from.inflate(C12932j.m33817a((Object) rankedDescendant.getId(), (Object) topPopsCard.mo7565f()) ? R.layout.list_item_top_pops_target : R.layout.list_item_top_pops, (LinearLayout) mo7487a(C3891l.leaderboard_list), false);
                Context requireContext = requireContext();
                C12932j.m33815a((Object) requireContext, "requireContext()");
                C2477e eVar = new C2477e(requireContext);
                C2485i a = C2476d.m8582a(requireContext());
                C12932j.m33815a((Object) a, "GlideApp.with(requireContext())");
                C12932j.m33815a((Object) inflate, "leaderBoardRow");
                C1405d dVar = new C1405d(eVar, a, inflate, false, 8, null);
                dVar.mo6664a(rankedDescendant);
                ((LinearLayout) mo7487a(C3891l.leaderboard_list)).addView(inflate);
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.TopPopsCard");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7331a(Throwable th) {
        C12143a.m32032b(th, "Oh no! couldn't load pops leaderboard", new Object[0]);
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
        textView.setVisibility(0);
        textView.setBackgroundResource(R.drawable.button_candy_dark);
        textView.setBackgroundTintList(null);
        textView.setTextColor(C0540a.m2536a(requireContext(), (int) R.color.candy_light));
        textView.setText(R.string.cards_descendantsLeaderboard_button);
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C12932j.m33818b(hVar, "sharingOption");
        Card c = mo7417c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.TopPopsCard");
        } else if (((TopPopsCard) c).mo7564e()) {
            C5343a.m15160U().mo12821a(C5350g.LEADERBOARD, hVar.mo7468a());
        } else {
            C5343a.m15160U().mo12860b(C5350g.LEADERBOARD, hVar.mo7468a());
        }
    }
}
