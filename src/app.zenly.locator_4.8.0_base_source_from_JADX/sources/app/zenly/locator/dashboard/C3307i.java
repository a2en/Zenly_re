package app.zenly.locator.dashboard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.ContactSoonOnZenlyStore;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.dashboard.p074a0.C3294a;
import app.zenly.locator.dashboard.p074a0.C3299b;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5357n;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior.C6163b;
import com.bluelinelabs.conductor.C8819d;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.dashboard.i */
public final class C3307i extends C3325v implements DashboardTarget {

    /* renamed from: d0 */
    static final /* synthetic */ KProperty[] f9194d0;

    /* renamed from: P */
    private FriendStore f9195P;

    /* renamed from: Q */
    private ContactAlreadyOnZenlyStore f9196Q;

    /* renamed from: R */
    private ContactSoonOnZenlyStore f9197R;

    /* renamed from: S */
    private FriendRequestStore f9198S;

    /* renamed from: T */
    private CoordinatorLayout f9199T;

    /* renamed from: U */
    private ScreenBarBottomSheetBehavior<View> f9200U;

    /* renamed from: V */
    public ScreenBar f9201V;

    /* renamed from: W */
    public RecyclerView f9202W;

    /* renamed from: X */
    public C3294a f9203X;

    /* renamed from: Y */
    public C3299b f9204Y;

    /* renamed from: Z */
    private NavigationContract f9205Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public boolean f9206a0;

    /* renamed from: b0 */
    private boolean f9207b0;

    /* renamed from: c0 */
    private final Lazy f9208c0 = C12896f.m33751a(new C3312e(this));

    /* renamed from: app.zenly.locator.dashboard.i$a */
    public static final class C3308a {
        private C3308a() {
        }

        public /* synthetic */ C3308a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.i$b */
    static final class C3309b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ View f9209e;

        /* renamed from: f */
        final /* synthetic */ C3307i f9210f;

        C3309b(View view, C3307i iVar, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            this.f9209e = view;
            this.f9210f = iVar;
        }

        public final void onClick(View view) {
            C5343a.m15160U().mo12903o();
            this.f9209e.setClickable(false);
            C3307i.m10457b(this.f9210f).mo30690c(5);
        }
    }

    /* renamed from: app.zenly.locator.dashboard.i$c */
    public static final class C3310c extends C10744c {

        /* renamed from: a */
        final /* synthetic */ View f9211a;

        /* renamed from: b */
        final /* synthetic */ View f9212b;

        /* renamed from: c */
        final /* synthetic */ C3307i f9213c;

        C3310c(View view, View view2, C3307i iVar, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            this.f9211a = view;
            this.f9212b = view2;
            this.f9213c = iVar;
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            C12932j.m33818b(view, "bottomSheet");
            this.f9213c.getDashboardState().mo9788a(i);
            if (i == 4 || i == 5) {
                this.f9213c.getSearchBarController().mo9782a();
                this.f9211a.requestFocus();
            }
            int i2 = 0;
            if (i == 5) {
                this.f9212b.setClickable(true);
                if (this.f9213c.getResetDashboardOnClose()) {
                    this.f9213c.getSearchBarController().mo9785d();
                }
                this.f9213c.m10454H().mo9748c();
                this.f9213c.getRecyclerView().mo5096g(0);
                NavigationContract navigation = this.f9213c.getNavigation();
                if (navigation != null) {
                    navigation.onSearchClosed();
                }
            }
            if (!(i == 1 || i == 2)) {
                this.f9213c.f9206a0 = false;
            }
            View view2 = this.f9212b;
            if (i == 5) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            C12932j.m33818b(view, "bottomSheet");
            float c = C12973l.m33892c(C12973l.m33889b(f, -1.0f), 1.0f);
            this.f9212b.setAlpha(c <= ((float) 0) ? (((float) 1) + f) * 0.7f : (c * 0.3f) + 0.7f);
        }
    }

    /* renamed from: app.zenly.locator.dashboard.i$d */
    static final class C3311d extends C12933k implements Function1<ScreenBar, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3307i f9214f;

        C3311d(C3307i iVar, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            this.f9214f = iVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo9814a(ScreenBar screenBar) {
            C12932j.m33818b(screenBar, "it");
            C5343a.m15160U().mo12827a(C5357n.GLOBAL_ADD_FRIENDS_BUTTON);
            NavigationContract navigation = this.f9214f.getNavigation();
            if (navigation != null) {
                navigation.onInboxAddFriends();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9814a((ScreenBar) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.dashboard.i$e */
    static final class C3312e extends C12933k implements Function0<DashboardPresenter> {

        /* renamed from: f */
        final /* synthetic */ C3307i f9215f;

        C3312e(C3307i iVar) {
            this.f9215f = iVar;
            super(0);
        }

        public final DashboardPresenter invoke() {
            return new DashboardPresenter(C3307i.m10459d(this.f9215f), C3307i.m10455a(this.f9215f), C3307i.m10461f(this.f9215f), C3307i.m10458c(this.f9215f));
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3307i.class), "presenter", "getPresenter()Lapp/zenly/locator/dashboard/DashboardPresenter;");
        C12946x.m33839a((C12940r) sVar);
        f9194d0 = new KProperty[]{sVar};
        new C3308a(null);
    }

    public C3307i(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final DashboardPresenter m10454H() {
        Lazy lazy = this.f9208c0;
        KProperty kProperty = f9194d0[0];
        return (DashboardPresenter) lazy.getValue();
    }

    /* renamed from: a */
    public static final /* synthetic */ ContactAlreadyOnZenlyStore m10455a(C3307i iVar) {
        ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore = iVar.f9196Q;
        if (contactAlreadyOnZenlyStore != null) {
            return contactAlreadyOnZenlyStore;
        }
        C12932j.m33820c("aozStore");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ ScreenBarBottomSheetBehavior m10457b(C3307i iVar) {
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = iVar.f9200U;
        if (screenBarBottomSheetBehavior != null) {
            return screenBarBottomSheetBehavior;
        }
        C12932j.m33820c("bottomSheetBehavior");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ FriendRequestStore m10458c(C3307i iVar) {
        FriendRequestStore friendRequestStore = iVar.f9198S;
        if (friendRequestStore != null) {
            return friendRequestStore;
        }
        C12932j.m33820c("friendRequestStore");
        throw null;
    }

    /* renamed from: d */
    public static final /* synthetic */ FriendStore m10459d(C3307i iVar) {
        FriendStore friendStore = iVar.f9195P;
        if (friendStore != null) {
            return friendStore;
        }
        C12932j.m33820c("friendStore");
        throw null;
    }

    /* renamed from: f */
    public static final /* synthetic */ ContactSoonOnZenlyStore m10461f(C3307i iVar) {
        ContactSoonOnZenlyStore contactSoonOnZenlyStore = iVar.f9197R;
        if (contactSoonOnZenlyStore != null) {
            return contactSoonOnZenlyStore;
        }
        C12932j.m33820c("soonStore");
        throw null;
    }

    /* renamed from: B */
    public void mo7192B() {
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9200U;
        if (screenBarBottomSheetBehavior != null) {
            screenBarBottomSheetBehavior.mo30690c(5);
        } else {
            C12932j.m33820c("bottomSheetBehavior");
            throw null;
        }
    }

    /* renamed from: C */
    public boolean mo9804C() {
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9200U;
        if (screenBarBottomSheetBehavior != null) {
            return screenBarBottomSheetBehavior.mo30689c() != 5 && !this.f9206a0;
        }
        C12932j.m33820c("bottomSheetBehavior");
        throw null;
    }

    /* renamed from: D */
    public boolean mo9805D() {
        return this.f9206a0;
    }

    /* renamed from: E */
    public void mo9806E() {
        if (this.f9204Y != null) {
            setResetDashboardOnClose(true);
            getDashboardState().mo9790b();
            mo7192B();
        }
    }

    /* renamed from: F */
    public void mo9807F() {
        if (this.f9204Y != null && !getDashboardState().mo9789a()) {
            setResetDashboardOnClose(true);
            getDashboardState().mo9791c();
        }
    }

    /* renamed from: G */
    public void mo9808G() {
        setResetDashboardOnClose(true);
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9200U;
        if (screenBarBottomSheetBehavior != null) {
            screenBarBottomSheetBehavior.mo30690c(4);
        } else {
            C12932j.m33820c("bottomSheetBehavior");
            throw null;
        }
    }

    public Activity getCurrentActivity() {
        return mo23920b();
    }

    public C3299b getDashboardState() {
        C3299b bVar = this.f9204Y;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("dashboardState");
        throw null;
    }

    public NavigationContract getNavigation() {
        return this.f9205Z;
    }

    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f9202W;
        if (recyclerView != null) {
            return recyclerView;
        }
        C12932j.m33820c("recyclerView");
        throw null;
    }

    public boolean getResetDashboardOnClose() {
        return this.f9207b0;
    }

    public ScreenBar getScreenBar() {
        ScreenBar screenBar = this.f9201V;
        if (screenBar != null) {
            return screenBar;
        }
        C12932j.m33820c("screenBar");
        throw null;
    }

    public C3294a getSearchBarController() {
        C3294a aVar = this.f9203X;
        if (aVar != null) {
            return aVar;
        }
        C12932j.m33820c("searchBarController");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9200U;
        if (screenBarBottomSheetBehavior != null) {
            screenBarBottomSheetBehavior.mo14018a(rect);
        } else {
            C12932j.m33820c("bottomSheetBehavior");
            throw null;
        }
    }

    public void setDashboardState(C3299b bVar) {
        C12932j.m33818b(bVar, "<set-?>");
        this.f9204Y = bVar;
    }

    public void setNavigation(NavigationContract navigationContract) {
        this.f9205Z = navigationContract;
    }

    public void setResetDashboardOnClose(boolean z) {
        this.f9207b0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        NavigationContract navigationContract;
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        try {
            C8819d l = mo23947l();
            if (l != null) {
                navigationContract = (NavigationContract) l;
                setNavigation(navigationContract);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.contracts.NavigationContract");
        } catch (ClassCastException unused) {
            navigationContract = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        getSearchBarController().mo9783b();
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9200U;
        if (screenBarBottomSheetBehavior != null) {
            screenBarBottomSheetBehavior.mo14020e();
            super.mo7066c(view);
            return;
        }
        C12932j.m33820c("bottomSheetBehavior");
        throw null;
    }

    /* renamed from: a */
    public void mo9811a(ScreenBar screenBar) {
        C12932j.m33818b(screenBar, "<set-?>");
        this.f9201V = screenBar;
    }

    /* renamed from: a */
    public void mo9810a(RecyclerView recyclerView) {
        C12932j.m33818b(recyclerView, "<set-?>");
        this.f9202W = recyclerView;
    }

    /* renamed from: a */
    public void mo9812a(C3294a aVar) {
        C12932j.m33818b(aVar, "<set-?>");
        this.f9203X = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        super.mo7065a(context);
        this.f9195P = C3015a.m9526a(context).provideFriendStore();
        this.f9198S = C3015a.m9526a(context).provideFriendRequestStore();
        this.f9196Q = C3015a.m9526a(context).provideAlreadyOnZenlyStore();
        this.f9197R = C3015a.m9526a(context).provideSoonOnZenlyStore();
    }

    /* renamed from: a */
    public void mo9809a(MotionEvent motionEvent, boolean z) {
        C12932j.m33818b(motionEvent, "event");
        if (!this.f9206a0) {
            motionEvent.setAction(0);
            this.f9206a0 = true;
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f9206a0 = false;
        }
        try {
            CoordinatorLayout coordinatorLayout = this.f9199T;
            if (coordinatorLayout != null) {
                coordinatorLayout.onTouchEvent(motionEvent);
                if (z && motionEvent.getActionMasked() == 1) {
                    float y = motionEvent.getY();
                    ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9200U;
                    if (screenBarBottomSheetBehavior == null) {
                        C12932j.m33820c("bottomSheetBehavior");
                        throw null;
                    } else if (y > ((float) screenBarBottomSheetBehavior.mo30680a())) {
                        mo9808G();
                    }
                }
            } else {
                C12932j.m33820c("coordinatorLayout");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        C7707a.m18761b("dashboard:onCreateView");
        try {
            m10454H().mo9746a((Context) new ContextThemeWrapper(viewGroup.getContext(), 2132083208));
            View inflate = layoutInflater.inflate(R.layout.controller_dashboard, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.dashboard_coordinator);
            C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.dashboard_coordinator)");
            this.f9199T = (CoordinatorLayout) findViewById;
            C6163b bVar = ScreenBarBottomSheetBehavior.f15476b0;
            C12932j.m33815a((Object) inflate, "view");
            ScreenBarLayout screenBarLayout = (ScreenBarLayout) inflate.findViewById(C3891l.dashboard_screen_bar_layout);
            C12932j.m33815a((Object) screenBarLayout, "view.dashboard_screen_bar_layout");
            ScreenBar screenBar = (ScreenBar) inflate.findViewById(C3891l.dashboard_screen_bar);
            SearchBar searchBar = (SearchBar) inflate.findViewById(C3891l.dashboard_search_bar);
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C3891l.dashboard_bottom_sheet);
            C12932j.m33815a((Object) constraintLayout, "view.dashboard_bottom_sheet");
            this.f9200U = bVar.mo14021a(screenBarLayout, screenBar, searchBar, constraintLayout, true);
            ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9200U;
            String str = "bottomSheetBehavior";
            if (screenBarBottomSheetBehavior != null) {
                screenBarBottomSheetBehavior.mo30690c(5);
                View findViewById2 = inflate.findViewById(R.id.dashboard_overlay);
                C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.dashboard_overlay)");
                findViewById2.setOnClickListener(new C3309b(findViewById2, this, viewGroup, layoutInflater));
                ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior2 = this.f9200U;
                if (screenBarBottomSheetBehavior2 != null) {
                    setDashboardState(new C3299b(screenBarBottomSheetBehavior2));
                    View findViewById3 = inflate.findViewById(R.id.dashboard_search_bar);
                    C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.dashboard_search_bar)");
                    SearchBar searchBar2 = (SearchBar) findViewById3;
                    ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior3 = this.f9200U;
                    if (screenBarBottomSheetBehavior3 != null) {
                        mo9812a(new C3294a(searchBar2, screenBarBottomSheetBehavior3));
                        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior4 = this.f9200U;
                        if (screenBarBottomSheetBehavior4 != null) {
                            C3310c cVar = new C3310c(inflate, findViewById2, this, viewGroup, layoutInflater);
                            screenBarBottomSheetBehavior4.mo14019a((C10744c) cVar);
                            View findViewById4 = inflate.findViewById(R.id.dashboard_screen_bar);
                            C12932j.m33815a((Object) findViewById4, "view.findViewById(R.id.dashboard_screen_bar)");
                            mo9811a((ScreenBar) findViewById4);
                            getScreenBar().setActionIcon(2131231363);
                            getScreenBar().setActionText((int) R.string.inbox_contactpicker_title_addfriends);
                            getScreenBar().setActionStyle(C7770f.Button_Small_Primary);
                            getScreenBar().mo6847a(new C3311d(this, viewGroup, layoutInflater));
                            View findViewById5 = inflate.findViewById(R.id.search_results);
                            C12932j.m33815a((Object) findViewById5, "view.findViewById(R.id.search_results)");
                            mo9810a((RecyclerView) findViewById5);
                            DashboardPresenter H = m10454H();
                            Context context = inflate.getContext();
                            C12932j.m33815a((Object) context, "view.context");
                            H.mo9747a(context, (DashboardTarget) this);
                            return inflate;
                        }
                        C12932j.m33820c(str);
                        throw null;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        } finally {
            C7707a.m18759a();
        }
    }
}
