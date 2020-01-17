package app.zenly.locator.powermoves.p133ui.feed;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.C0890v;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.navigation.fragment.C0957a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.powermoves.p126a.C4965a;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p129d.C4995a;
import app.zenly.locator.powermoves.p129d.p130d.C5013a;
import app.zenly.locator.powermoves.p129d.p130d.C5014b;
import app.zenly.locator.powermoves.p129d.p131e.C5017a;
import app.zenly.locator.powermoves.p133ui.feed.PowerMoveFeedAdapter.ItemClickListener;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedFragment */
public final class PowerMoveFeedFragment extends C1321b implements ItemClickListener {

    /* renamed from: f */
    private C4995a f13078f;

    /* renamed from: g */
    private final PowerMoveFeedAdapter f13079g = new PowerMoveFeedAdapter(this);

    /* renamed from: h */
    private HashMap f13080h;

    /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedFragment$a */
    static final class C5028a<T> implements Observer<C5014b> {

        /* renamed from: a */
        final /* synthetic */ PowerMoveFeedFragment f13081a;

        C5028a(PowerMoveFeedFragment powerMoveFeedFragment) {
            this.f13081a = powerMoveFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(C5014b bVar) {
            if (bVar != null) {
                int i = C5032b.f13085a[bVar.ordinal()];
                if (i == 1) {
                    this.f13081a.m14409b();
                } else if (i == 2) {
                    this.f13081a.m14411c();
                }
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedFragment$b */
    static final class C5029b<T> implements Observer<C5013a> {

        /* renamed from: a */
        final /* synthetic */ PowerMoveFeedFragment f13082a;

        C5029b(PowerMoveFeedFragment powerMoveFeedFragment) {
            this.f13082a = powerMoveFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(C5013a aVar) {
            if (aVar == null) {
                C12932j.m33814a();
                throw null;
            } else if (C5032b.f13086b[aVar.ordinal()] == 1) {
                this.f13082a.m14413d();
            }
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedFragment$c */
    static final class C5030c extends C12933k implements Function1<ScreenBar, C12956q> {

        /* renamed from: f */
        final /* synthetic */ PowerMoveFeedFragment f13083f;

        C5030c(PowerMoveFeedFragment powerMoveFeedFragment) {
            this.f13083f = powerMoveFeedFragment;
            super(1);
        }

        /* renamed from: a */
        public final void mo12282a(ScreenBar screenBar) {
            C12932j.m33818b(screenBar, "it");
            C4965a.m14325a(C0957a.m4290a(this.f13083f), C5033c.f13087a.mo12289b(), null, 2, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12282a((ScreenBar) obj);
            return C12956q.f33541a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m14413d() {
        C4995a aVar = this.f13078f;
        List list = null;
        if (aVar != null) {
            C5017a e = aVar.mo12238e();
            Object e2 = e.mo12263e();
            if (e2 != null ? e2 instanceof List : true) {
                list = (List) e.mo12263e();
            }
            if (list != null) {
                this.f13079g.mo12271a(list);
                return;
            }
            return;
        }
        C12932j.m33820c("vm");
        throw null;
    }

    /* renamed from: a */
    public View mo12279a(int i) {
        if (this.f13080h == null) {
            this.f13080h = new HashMap();
        }
        View view = (View) this.f13080h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13080h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f13080h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0889u a = C0890v.m4098a(requireActivity()).mo4415a(C4995a.class);
        C12932j.m33815a((Object) a, "ViewModelProviders.of(re…eedViewModel::class.java)");
        this.f13078f = (C4995a) a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_power_move_feed, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onItemClick(C4984a aVar) {
        C12932j.m33818b(aVar, "item");
        C4965a.m14325a(C0957a.m4290a(this), C5033c.f13087a.mo12288a(aVar.mo12216e()), null, 2, null);
    }

    public void onResume() {
        super.onResume();
        C4995a aVar = this.f13078f;
        if (aVar != null) {
            aVar.mo12240g();
        } else {
            C12932j.m33820c("vm");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        ScreenBar screenBar = (ScreenBar) mo12279a(C3891l.screen_bar);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        screenBar.setTitle((CharSequence) C7709b.m18762a(requireContext, R.string.powerMoves_title));
        C4995a aVar = this.f13078f;
        String str = "vm";
        if (aVar != null) {
            aVar.mo12239f().mo12261b((LifecycleOwner) this, (Observer<? super A>) new C5028a<Object>(this));
            RecyclerView recyclerView = (RecyclerView) mo12279a(C3891l.feed_recycler_view);
            String str2 = "feed_recycler_view";
            C12932j.m33815a((Object) recyclerView, str2);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
            RecyclerView recyclerView2 = (RecyclerView) mo12279a(C3891l.feed_recycler_view);
            C12932j.m33815a((Object) recyclerView2, str2);
            recyclerView2.setItemAnimator(null);
            ((RecyclerView) mo12279a(C3891l.feed_recycler_view)).setHasFixedSize(true);
            RecyclerView recyclerView3 = (RecyclerView) mo12279a(C3891l.feed_recycler_view);
            C12932j.m33815a((Object) recyclerView3, str2);
            recyclerView3.setAdapter(this.f13079g);
            C4995a aVar2 = this.f13078f;
            if (aVar2 != null) {
                aVar2.mo12238e().mo12261b((LifecycleOwner) this, (Observer<? super A>) new C5029b<Object>(this));
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m14409b() {
        C4965a.m14325a(C0957a.m4290a(this), C5033c.f13087a.mo12287a(), null, 2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m14411c() {
        ScreenBar screenBar = (ScreenBar) mo12279a(C3891l.screen_bar);
        screenBar.setActionIcon(2131231465);
        screenBar.mo6846a();
        screenBar.mo6847a(new C5030c(this));
    }
}
