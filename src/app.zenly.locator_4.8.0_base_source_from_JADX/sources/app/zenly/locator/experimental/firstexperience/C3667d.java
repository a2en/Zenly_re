package app.zenly.locator.experimental.firstexperience;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C1139p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p196u.p197b.C5943a;
import app.zenly.locator.p196u.p197b.C5943a.C5944a;
import com.airbnb.lottie.LottieAnimationView;
import com.bluelinelabs.conductor.C8819d;
import java.util.List;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.experimental.firstexperience.d */
public final class C3667d extends ZenlyController {

    /* renamed from: P */
    public NavigationContract f9827P;

    /* renamed from: app.zenly.locator.experimental.firstexperience.d$a */
    private static final class C3668a extends C1069g<C3669b> {

        /* renamed from: a */
        private final List<C12899i<Integer, Integer>> f9828a = C12848o.m33643b((Object[]) new C12899i[]{C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_global), Integer.valueOf(R.string.z_track3exp3var1_dialog_title_realtime)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_gathering), Integer.valueOf(R.string.z_track3exp3var1_dialog_title_hangout)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_battery), Integer.valueOf(R.string.z_track3exp3var1_dialog_title_battery)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_tots), Integer.valueOf(R.string.z_track3exp3var1_dialog_title_tots)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_speed), Integer.valueOf(R.string.z_track3exp3var1_dialog_title_speed))});

        /* renamed from: a */
        public void onBindViewHolder(C3669b bVar, int i) {
            C12932j.m33818b(bVar, "holder");
            C12899i iVar = (C12899i) this.f9828a.get(i);
            bVar.mo10184a(((Number) iVar.mo37205d()).intValue(), ((Number) iVar.mo37204c()).intValue());
        }

        /* renamed from: b */
        public void onViewRecycled(C3669b bVar) {
            C12932j.m33818b(bVar, "holder");
            bVar.mo10185b();
        }

        public int getItemCount() {
            return this.f9828a.size();
        }

        public C3669b onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12932j.m33818b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.no_friend_item_view, viewGroup, false);
            C12932j.m33815a((Object) inflate, "LayoutInflater.from(pare…item_view, parent, false)");
            return new C3669b(inflate);
        }

        /* renamed from: a */
        public void onViewAttachedToWindow(C3669b bVar) {
            C12932j.m33818b(bVar, "holder");
            bVar.mo10183a();
        }
    }

    /* renamed from: app.zenly.locator.experimental.firstexperience.d$b */
    private static final class C3669b extends C1085v {
        public C3669b(View view) {
            C12932j.m33818b(view, "itemView");
            super(view);
        }

        /* renamed from: a */
        public final void mo10184a(int i, int i2) {
            View view = this.itemView;
            String str = "itemView";
            C12932j.m33815a((Object) view, str);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(C3891l.lottie_animation_view);
            lottieAnimationView.setAnimation(i2);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.mo22807d();
            View view2 = this.itemView;
            C12932j.m33815a((Object) view2, str);
            ((AppCompatTextView) view2.findViewById(C3891l.dialog_title)).setText(i);
        }

        /* renamed from: b */
        public final void mo10185b() {
            View view = this.itemView;
            C12932j.m33815a((Object) view, "itemView");
            ((LottieAnimationView) view.findViewById(C3891l.lottie_animation_view)).mo22797a();
        }

        /* renamed from: a */
        public final void mo10183a() {
            View view = this.itemView;
            C12932j.m33815a((Object) view, "itemView");
            ((LottieAnimationView) view.findViewById(C3891l.lottie_animation_view)).mo22810g();
        }
    }

    /* renamed from: app.zenly.locator.experimental.firstexperience.d$c */
    static final class C3670c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3667d f9829e;

        /* renamed from: f */
        final /* synthetic */ PagerLayoutManager f9830f;

        C3670c(C3667d dVar, PagerLayoutManager pagerLayoutManager) {
            this.f9829e = dVar;
            this.f9830f = pagerLayoutManager;
        }

        public final void onClick(View view) {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            new C5943a(a, C5448c.m15478a()).mo13641a(C5944a.f14965g, this.f9830f.mo4975I());
            this.f9829e.mo23946k().mo23997a((C8819d) this.f9829e);
            this.f9829e.getNavigation().onInboxAddFriends();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_no_friend_dialog, viewGroup, false);
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        PagerLayoutManager pagerLayoutManager = new PagerLayoutManager(A, viewGroup.getResources().getDimensionPixelSize(R.dimen.spacing_400));
        C12932j.m33815a((Object) inflate, "rootView");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C3891l.recycler_view);
        recyclerView.setLayoutManager(pagerLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new C3668a());
        new C1139p().mo5787a(recyclerView);
        ((AppCompatTextView) inflate.findViewById(C3891l.add_friends_button)).setOnClickListener(new C3670c(this, pagerLayoutManager));
        return inflate;
    }

    public final NavigationContract getNavigation() {
        NavigationContract navigationContract = this.f9827P;
        if (navigationContract != null) {
            return navigationContract;
        }
        C12932j.m33820c("navigation");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void setNavigation(NavigationContract navigationContract) {
        C12932j.m33818b(navigationContract, "<set-?>");
        this.f9827P = navigationContract;
    }
}
