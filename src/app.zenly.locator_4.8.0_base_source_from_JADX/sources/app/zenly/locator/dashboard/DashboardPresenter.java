package app.zenly.locator.dashboard;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import androidx.core.app.C0535j.C0536a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0875o;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.C3572e;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.Callback;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import app.zenly.locator.core.invitations.C2545e0.C2554e;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2620u;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.C2625y.C2626a;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.invitations.MessageShareContent;
import app.zenly.locator.core.invitations.ShareResult;
import app.zenly.locator.core.invitations.p068g0.C2590a;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.invitations.p068g0.C2597f;
import app.zenly.locator.core.store.C3052n;
import app.zenly.locator.core.store.SuggestedStore;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.ContactSoonOnZenlyStore;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.dashboard.p075w.C3327b;
import app.zenly.locator.dashboard.p075w.C3327b.C3328a;
import app.zenly.locator.dashboard.p075w.C3330d;
import app.zenly.locator.dashboard.p075w.C3331e;
import app.zenly.locator.dashboard.p075w.C3333f;
import app.zenly.locator.dashboard.p075w.C3337h;
import app.zenly.locator.dashboard.p075w.C3341i;
import app.zenly.locator.dashboard.p076x.C3348a;
import app.zenly.locator.dashboard.p076x.C3352b;
import app.zenly.locator.dashboard.p081z.C3435m;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5355l;
import app.zenly.locator.p143s.C5343a.C5357n;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.prefetch.C11731a;
import com.snap.p327ui.recycling.prefetch.ViewHolderPrefetcher;
import java.util.List;
import java.util.Locale;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7715b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7716c;
import p387h.p388a.C12143a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

public final class DashboardPresenter extends C3572e<DashboardTarget> implements LifecycleObserver {

    /* renamed from: f */
    private final ZenlySchedulers f9146f = C1351e.m6372a(C3316m.f9221b.mo19916a("presenter"));
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12275b f9147g = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12275b f9148h = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3331e f9149i = new C3331e(C5448c.m15478a());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3333f f9150j = new C3333f(C5448c.m15478a());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C3330d f9151k = new C3330d();

    /* renamed from: l */
    private C3352b f9152l;

    /* renamed from: m */
    private C11705b f9153m;

    /* renamed from: n */
    private C11727c f9154n;

    /* renamed from: o */
    private C12271b f9155o;

    /* renamed from: p */
    private C3327b f9156p;

    /* renamed from: q */
    private final FriendStore f9157q;

    /* renamed from: r */
    private final ContactAlreadyOnZenlyStore f9158r;

    /* renamed from: s */
    private final ContactSoonOnZenlyStore f9159s;

    /* renamed from: t */
    private final FriendRequestStore f9160t;

    /* renamed from: app.zenly.locator.dashboard.DashboardPresenter$a */
    public final class C3286a {

        /* renamed from: a */
        private final Context f9161a;

        /* renamed from: b */
        final /* synthetic */ DashboardPresenter f9162b;

        /* renamed from: app.zenly.locator.dashboard.DashboardPresenter$a$a */
        public static final class C3287a implements Callback {

            /* renamed from: a */
            final /* synthetic */ C2594d f9163a;

            C3287a(C2594d dVar) {
                this.f9163a = dVar;
            }

            public void onShareSheetClosed(ShareResult shareResult) {
                C12932j.m33818b(shareResult, "shareResult");
                if (shareResult.mo8633c()) {
                    this.f9163a.mo8704d(true);
                }
            }
        }

        /* renamed from: app.zenly.locator.dashboard.DashboardPresenter$a$b */
        public static final class C3288b implements Callback {

            /* renamed from: a */
            final /* synthetic */ C2594d f9164a;

            C3288b(C2594d dVar) {
                this.f9164a = dVar;
            }

            public void onShareSheetClosed(ShareResult shareResult) {
                C12932j.m33818b(shareResult, "shareResult");
                if (shareResult.mo8633c()) {
                    this.f9164a.mo8704d(true);
                }
            }
        }

        /* renamed from: app.zenly.locator.dashboard.DashboardPresenter$a$c */
        public static final class C3289c extends C2623w {

            /* renamed from: c */
            final /* synthetic */ C3286a f9165c;

            /* renamed from: d */
            final /* synthetic */ C3306h f9166d;

            C3289c(C3286a aVar, C3306h hVar, Context context, boolean z) {
                this.f9165c = aVar;
                this.f9166d = hVar;
                super(context, z);
            }

            public void onCancel() {
                this.f9165c.f9162b.f9151k.mo9836a(this.f9166d.mo9801a(), C3341i.NOT_INVITED);
            }

            public boolean onError(C2624x xVar) {
                C12932j.m33818b(xVar, "error");
                boolean onError = super.onError(xVar);
                if (onError) {
                    this.f9165c.f9162b.f9151k.mo9836a(this.f9166d.mo9801a(), C3341i.NOT_INVITED);
                }
                return onError;
            }

            public void onSuccess() {
                this.f9165c.f9162b.f9151k.mo9836a(this.f9166d.mo9801a(), C3341i.INVITED);
            }
        }

        public C3286a(DashboardPresenter dashboardPresenter, Context context) {
            C12932j.m33818b(context, "context");
            this.f9162b = dashboardPresenter;
            this.f9161a = context;
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onBestFriendClick(C3293a aVar) {
            C12932j.m33818b(aVar, "event");
            C5343a.m15160U().mo12827a(C5357n.BEST_FRIENDS);
            ((DashboardTarget) this.f9162b.mo10039b()).getDashboardState().mo9792d();
            NavigationContract navigation = ((DashboardTarget) this.f9162b.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onDashboardUserClick(aVar.mo9781a().mo9927b());
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onBroadcastInviteEvent(C3302d dVar) {
            C12932j.m33818b(dVar, "event");
            Activity currentActivity = ((DashboardTarget) this.f9162b.mo10039b()).getCurrentActivity();
            if (currentActivity != null) {
                C2594d dVar2 = new C2594d(C5407g.f13966d.mo12991a(currentActivity).mo12986h());
                int b = C3744d.BroadcastInviteDashboard.mo10293b();
                if (currentActivity != null) {
                    C2620u uVar = new C2620u((FragmentActivity) currentActivity);
                    String string = this.f9161a.getString(R.string.sharesheet_broadcastedInvite_title);
                    C12932j.m33815a((Object) string, "context.getString(R.stri…_broadcastedInvite_title)");
                    C2620u.m8944a(uVar, null, string, new MessageShareContent(null, b), C2591a.DASHBOARD_SECOND_SECTION, null, new C3287a(dVar2), 17, null);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onContactClick(C3303e eVar) {
            C12932j.m33818b(eVar, "event");
            ((DashboardTarget) this.f9162b.mo10039b()).setResetDashboardOnClose(false);
            ((DashboardTarget) this.f9162b.mo10039b()).getDashboardState().mo9792d();
            int i = C3317n.f9225d[eVar.mo9797b().ordinal()];
            if (i == 1) {
                C5343a.m15160U().mo12827a(C5357n.RECENTLY_SEARCHED);
            } else if (i != 2) {
                C5343a.m15160U().mo12827a(C5357n.CONTACTS);
            } else {
                C5343a.m15160U().mo12827a(C5357n.RECENTLY_VIEWED);
            }
            if (eVar.mo9797b() == C3435m.SEARCH_RESULT) {
                this.f9162b.f9149i.mo9838a(eVar.mo9796a());
            }
            NavigationContract navigation = ((DashboardTarget) this.f9162b.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onDashboardContactClick(eVar.mo9796a());
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onContactInvite(C3306h hVar) {
            C12932j.m33818b(hVar, "event");
            if (hVar.mo9802b() == C3435m.SUGGESTED) {
                C5343a.m15160U().mo12794I();
                C5343a.m15160U().mo12827a(C5357n.SUGGESTED_INVITE_CONTACT_BUTTON);
            }
            if (!hVar.mo9803c()) {
                this.f9162b.f9151k.mo9836a(hVar.mo9801a(), C3341i.INVITING);
            }
            C2625y a = C2625y.f7738e.mo8731a(C2587f0.DASHBOARD_CONTACT, hVar.mo9801a(), hVar.mo9803c());
            Activity currentActivity = ((DashboardTarget) this.f9162b.mo10039b()).getCurrentActivity();
            if (currentActivity != null) {
                C2538c0.m8837a(currentActivity).mo8670a(a, (InvitationCallback) new C3289c(this, hVar, this.f9161a, false));
            } else {
                C12932j.m33814a();
                throw null;
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onContactSuggestionDismiss(C3304f fVar) {
            C12932j.m33818b(fVar, "event");
            int i = C3317n.f9227f[fVar.mo9799b().ordinal()];
            if (i == 1) {
                C5343a.m15160U().mo12883f(false);
                SuggestedStore.m9428a(C3052n.f8449a.mo9237a(fVar.mo9798a()));
            } else if (i == 2) {
                this.f9162b.f9149i.mo9840b(fVar.mo9798a());
            } else if (i == 3) {
                this.f9162b.f9150j.mo9846b(fVar.mo9798a());
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onContactSuggestionDismissRequest(C3305g gVar) {
            C12932j.m33818b(gVar, "event");
            if (C3317n.f9226e[gVar.mo9800a().ordinal()] == 1) {
                C5343a.m15160U().mo12827a(C5357n.SUGGESTED_DISMISS_BUTTON);
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onEmptyBestFriendClick(C3315l lVar) {
            C12932j.m33818b(lVar, "event");
            C5343a.m15160U().mo12827a(C5357n.EMPTY_BEST_FRIEND);
            NavigationContract navigation = ((DashboardTarget) this.f9162b.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onInboxAddFriends();
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onSectionCloseEvent(C3300b bVar) {
            C12932j.m33818b(bVar, "event");
            C3328a a = bVar.mo9793a();
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a2 = U.mo12806a();
            C12932j.m33815a((Object) a2, "Analytics.get().tracker");
            new C2590a(a2).mo8696a(a);
            DashboardPresenter.m10416a(this.f9162b).mo9834a(a);
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onTellYourFriendsClick(C3319p pVar) {
            C12932j.m33818b(pVar, "event");
            C5343a.m15160U().mo12826a(C5355l.DASHBOARD_EMPTY);
            C5343a.m15160U().mo12795J();
            C5343a.m15160U().mo12827a(C5357n.TELL_YOUR_FRIENDS_BUTTON);
            Activity currentActivity = ((DashboardTarget) this.f9162b.mo10039b()).getCurrentActivity();
            if (currentActivity != null) {
                C0536a a = C0536a.m2510a(currentActivity);
                a.mo3056a("text/plain");
                a.mo3058b(this.f9161a.getString(R.string.contactpicker_suggested_empty_messageSent));
                a.mo3059c();
                return;
            }
            C12932j.m33814a();
            throw null;
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onToggleEditMode(C3314k kVar) {
            C12932j.m33818b(kVar, "event");
            DashboardPresenter.m10423g(this.f9162b).mo9868a(kVar.mo9816a());
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onUserClick(C3320q qVar) {
            C12932j.m33818b(qVar, "event");
            ((DashboardTarget) this.f9162b.mo10039b()).setResetDashboardOnClose(false);
            ((DashboardTarget) this.f9162b.mo10039b()).getDashboardState().mo9792d();
            int i = C3317n.f9222a[qVar.mo9824a().ordinal()];
            if (i == 1) {
                C5343a.m15160U().mo12827a(C5357n.SUGGESTED);
                C5343a.m15160U().mo12793H();
            } else if (i == 2) {
                C5343a.m15160U().mo12827a(C5357n.RECENTLY_SEARCHED);
            } else if (i == 3) {
                C5343a.m15160U().mo12827a(C5357n.RECENTLY_VIEWED);
            } else if (qVar.mo9826c()) {
                C5343a.m15160U().mo12827a(C5357n.FRIENDS);
            } else {
                C5343a.m15160U().mo12827a(C5357n.ALREADY_ON_ZENLY);
            }
            if (qVar.mo9824a() == C3435m.SEARCH_RESULT) {
                C3331e e = this.f9162b.f9149i;
                String uuid = qVar.mo9825b().getUuid();
                C12932j.m33815a((Object) uuid, "event.user.uuid");
                e.mo9839a(uuid);
            }
            NavigationContract navigation = ((DashboardTarget) this.f9162b.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onDashboardUserClick(qVar.mo9825b().getUuid());
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onUserInvite(C3323t tVar) {
            C2587f0 f0Var;
            C12932j.m33818b(tVar, "event");
            if (tVar.mo9830a().mo9958j() == C3435m.SUGGESTED) {
                C5343a.m15160U().mo12792G();
                C5343a.m15160U().mo12827a(C5357n.SUGGESTED_ADD_FRIEND_BUTTON);
                f0Var = C2587f0.DASHBOARD_SUGGESTED;
            } else {
                f0Var = C2587f0.DASHBOARD_AOZ;
            }
            C2625y a = C2626a.m8955a(C2625y.f7738e, f0Var, tVar.mo9830a().mo9959k(), tVar.mo9830a().mo9963o(), null, false, 16, null);
            Activity currentActivity = ((DashboardTarget) this.f9162b.mo10039b()).getCurrentActivity();
            if (currentActivity != null) {
                C2538c0.m8837a(currentActivity).mo8670a(a, (InvitationCallback) new C2623w(this.f9161a, false));
            } else {
                C12932j.m33814a();
                throw null;
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onUserSuggestionDismiss(C3321r rVar) {
            C12932j.m33818b(rVar, "event");
            int i = C3317n.f9224c[rVar.mo9827a().ordinal()];
            if (i != 1) {
                String str = "event.user.uuid";
                if (i == 2) {
                    C3331e e = this.f9162b.f9149i;
                    String uuid = rVar.mo9828b().getUuid();
                    C12932j.m33815a((Object) uuid, str);
                    e.mo9841b(uuid);
                } else if (i == 3) {
                    C3333f f = this.f9162b.f9150j;
                    String uuid2 = rVar.mo9828b().getUuid();
                    C12932j.m33815a((Object) uuid2, str);
                    f.mo9847b(uuid2);
                }
            } else {
                C5343a.m15160U().mo12883f(true);
                SuggestedStore.m9428a(C3052n.f8449a.mo9236a(rVar.mo9828b()));
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onUserSuggestionDismissRequest(C3322s sVar) {
            C12932j.m33818b(sVar, "event");
            if (C3317n.f9223b[sVar.mo9829a().ordinal()] == 1) {
                C5343a.m15160U().mo12827a(C5357n.SUGGESTED_DISMISS_BUTTON);
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onBroadcastInviteEvent(C3301c cVar) {
            C2591a aVar;
            C12932j.m33818b(cVar, "event");
            Activity currentActivity = ((DashboardTarget) this.f9162b.mo10039b()).getCurrentActivity();
            if (currentActivity != null) {
                C2594d dVar = new C2594d(C5407g.f13966d.mo12991a(currentActivity).mo12986h());
                if (dVar.mo8701b()) {
                    aVar = C2591a.DASHBOARD_SECOND_SECTION;
                } else {
                    aVar = C2591a.DASHBOARD_FIRST_SECTION;
                }
                C5343a U = C5343a.m15160U();
                C12932j.m33815a((Object) U, "Analytics.get()");
                AnalyticsTracker a = U.mo12806a();
                C12932j.m33815a((Object) a, "Analytics.get().tracker");
                C2590a.m8901a(new C2590a(a), aVar, cVar.mo9795b().mo8688c(), cVar.mo9794a(), false, 8, null);
                int b = C3744d.BroadcastInviteDashboard.mo10293b();
                if (C12932j.m33817a((Object) cVar.mo9795b(), (Object) C2549b0.f7613e)) {
                    C12773a.m33432a(new C2597f(currentActivity, b).mo8714a(), this.f9162b.f9148h);
                    dVar.mo8704d(true);
                } else if (currentActivity != null) {
                    C2620u uVar = new C2620u((FragmentActivity) currentActivity);
                    String string = this.f9161a.getString(R.string.sharesheet_broadcastedInvite_title);
                    C12932j.m33815a((Object) string, "context.getString(R.stri…_broadcastedInvite_title)");
                    C2620u.m8944a(uVar, null, string, new MessageShareContent(null, b), aVar, cVar.mo9795b(), new C3288b(dVar), 1, null);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.dashboard.DashboardPresenter$b */
    static final class C3290b<T> implements Consumer<List<? extends C2936a0>> {

        /* renamed from: e */
        final /* synthetic */ DashboardTarget f9167e;

        /* renamed from: app.zenly.locator.dashboard.DashboardPresenter$b$a */
        static final class C3291a extends C12933k implements Function1<ScreenBar, C12956q> {

            /* renamed from: f */
            final /* synthetic */ C3290b f9168f;

            C3291a(C3290b bVar) {
                this.f9168f = bVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo9769a(ScreenBar screenBar) {
                C12932j.m33818b(screenBar, "it");
                NavigationContract navigation = this.f9168f.f9167e.getNavigation();
                if (navigation != null) {
                    navigation.onDashboardManageFriendsClick();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9769a((ScreenBar) obj);
                return C12956q.f33541a;
            }
        }

        C3290b(DashboardTarget dashboardTarget) {
            this.f9167e = dashboardTarget;
        }

        /* renamed from: a */
        public final void accept(List<C2936a0> list) {
            if (list.size() > 0) {
                this.f9167e.getScreenBar().setSecondaryActionIcon(2131231574);
                this.f9167e.getScreenBar().mo6848b(new C3291a(this));
                return;
            }
            this.f9167e.getScreenBar().setSecondaryActionIcon((Drawable) null);
        }
    }

    /* renamed from: app.zenly.locator.dashboard.DashboardPresenter$c */
    static final class C3292c<T> implements Consumer<Disposable> {

        /* renamed from: e */
        final /* synthetic */ DashboardPresenter f9169e;

        C3292c(DashboardPresenter dashboardPresenter) {
            this.f9169e = dashboardPresenter;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            C12932j.m33815a((Object) disposable, "it");
            C12773a.m33432a(disposable, this.f9169e.f9147g);
        }
    }

    public DashboardPresenter(FriendStore friendStore, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, ContactSoonOnZenlyStore contactSoonOnZenlyStore, FriendRequestStore friendRequestStore) {
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(contactAlreadyOnZenlyStore, "aozStore");
        C12932j.m33818b(contactSoonOnZenlyStore, "soonStore");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        this.f9157q = friendStore;
        this.f9158r = contactAlreadyOnZenlyStore;
        this.f9159s = contactSoonOnZenlyStore;
        this.f9160t = friendRequestStore;
    }

    /* renamed from: a */
    public static final /* synthetic */ C3327b m10416a(DashboardPresenter dashboardPresenter) {
        C3327b bVar = dashboardPresenter.f9156p;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("broadcastInviteRepository");
        throw null;
    }

    /* renamed from: g */
    public static final /* synthetic */ C3352b m10423g(DashboardPresenter dashboardPresenter) {
        C3352b bVar = dashboardPresenter.f9152l;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("sectionsProvider");
        throw null;
    }

    @C0875o(C0863a.ON_PAUSE)
    public final void onTargetPause() {
        this.f9148h.mo36401a();
    }

    @C0875o(C0863a.ON_RESUME)
    public final void onTargetResume() {
        C11705b bVar = this.f9153m;
        if (bVar != null) {
            C12773a.m33432a(bVar.mo34464b(), this.f9148h);
            C3352b bVar2 = this.f9152l;
            if (bVar2 != null) {
                C12773a.m33432a(bVar2.mo9869b(), this.f9148h);
            } else {
                C12932j.m33820c("sectionsProvider");
                throw null;
            }
        } else {
            C12932j.m33820c("dashboardAdapter");
            throw null;
        }
    }

    @C0875o(C0863a.ON_START)
    public final void onTargetStart() {
        RecyclerView recyclerView = ((DashboardTarget) mo10039b()).getRecyclerView();
        if (recyclerView.getAdapter() == null) {
            C12143a.m32027a("Attaching adapter", new Object[0]);
            C11705b bVar = this.f9153m;
            if (bVar != null) {
                recyclerView.setAdapter(bVar);
                recyclerView.setItemAnimator(null);
                recyclerView.setHasFixedSize(true);
                return;
            }
            C12932j.m33820c("dashboardAdapter");
            throw null;
        }
    }

    @C0875o(C0863a.ON_STOP)
    public final void onTargetStop() {
        this.f9147g.mo36401a();
    }

    /* renamed from: a */
    public final void mo9746a(Context context) {
        C12932j.m33818b(context, "context");
        this.f9154n = new C11727c(C12848o.m33643b((Object[]) new Class[]{C7716c.class, C3324u.class}));
        C11727c cVar = this.f9154n;
        if (cVar != null) {
            C12271b a = m10417a(context, cVar).mo36338a();
            C12932j.m33815a((Object) a, "preloadViews(\n          …Factory\n        ).cache()");
            this.f9155o = a;
            C12271b bVar = this.f9155o;
            if (bVar != null) {
                Disposable b = bVar.mo36351b();
                C12932j.m33815a((Object) b, "prefetchDoneCompletable.subscribe()");
                C12773a.m33432a(b, this.f9147g);
                return;
            }
            C12932j.m33820c("prefetchDoneCompletable");
            throw null;
        }
        C12932j.m33820c("viewFactory");
        throw null;
    }

    /* renamed from: c */
    public final void mo9748c() {
        C3352b bVar = this.f9152l;
        if (bVar != null) {
            bVar.mo9868a(false);
        } else {
            C12932j.m33820c("sectionsProvider");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo9747a(Context context, DashboardTarget dashboardTarget) {
        Context context2 = context;
        DashboardTarget dashboardTarget2 = dashboardTarget;
        C12932j.m33818b(context2, "context");
        C12932j.m33818b(dashboardTarget2, "target");
        super.mo10038a(context, dashboardTarget);
        C11700c cVar = new C11700c();
        cVar.mo34449b(new C3286a(this, context2));
        this.f9147g.add(cVar);
        C12279e a = dashboardTarget.getSearchBarController().mo9784c().mo36477d().mo36475c(1).mo36944a(1, new C3292c(this));
        C12932j.m33815a((Object) a, "target.searchBarControll…estroyView)\n            }");
        this.f9156p = new C3327b(C3444a.m10686a(context), new C2594d(C5407g.f13966d.mo12991a(context2).mo12986h()));
        ZenlySchedulers zenlySchedulers = this.f9146f;
        C3337h hVar = new C3337h(zenlySchedulers, this.f9157q, this.f9151k, this.f9160t, this.f9158r, this.f9159s);
        C3327b bVar = this.f9156p;
        if (bVar != null) {
            C12279e a2 = bVar.mo9833a();
            C2554e eVar = C2545e0.f7606d;
            Locale locale = Locale.getDefault();
            C12932j.m33815a((Object) locale, "Locale.getDefault()");
            List a3 = eVar.mo8689a(context2, locale, true);
            C3331e eVar2 = this.f9149i;
            C3333f fVar = this.f9150j;
            FriendStore friendStore = this.f9157q;
            C11727c cVar2 = this.f9154n;
            String str = "viewFactory";
            if (cVar2 != null) {
                C3352b bVar2 = r1;
                C3352b bVar3 = new C3352b(context, zenlySchedulers, hVar, a, a2, a3, eVar2, fVar, friendStore, cVar, cVar2);
                this.f9152l = bVar2;
                C12271b bVar4 = this.f9155o;
                if (bVar4 != null) {
                    C7715b bVar5 = new C7715b();
                    C3352b bVar6 = this.f9152l;
                    if (bVar6 != null) {
                        C3348a aVar = new C3348a(bVar4, a, bVar5, bVar6.mo9867a());
                        ZenlySchedulers a4 = C1351e.m6372a(C3316m.f9221b.mo19916a("adapter"));
                        C11727c cVar3 = this.f9154n;
                        if (cVar3 != null) {
                            EventDispatcher a5 = cVar.mo34447a();
                            C12932j.m33815a((Object) a5, "bus.eventDispatcher");
                            C11705b bVar7 = new C11705b(cVar3, a5, a4.getUserInteractive(), a4.getMainThread(), C12846n.m33635a(aVar), null, 32, null);
                            this.f9153m = bVar7;
                            Disposable d = this.f9157q.bestFriends().mo36428a((C12286f) C1351e.m6372a(C3316m.f9221b.mo19916a("screenBar")).getMainThread()).mo36476d((Consumer<? super T>) new C3290b<Object>(dashboardTarget));
                            C12932j.m33815a((Object) d, "friendStore.bestFriends(…          }\n            }");
                            C12773a.m33432a(d, this.f9147g);
                            dashboardTarget.getLifecycle().mo4446a(this);
                            return;
                        }
                        C12932j.m33820c(str);
                        throw null;
                    }
                    C12932j.m33820c("sectionsProvider");
                    throw null;
                }
                C12932j.m33820c("prefetchDoneCompletable");
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c("broadcastInviteRepository");
        throw null;
    }

    /* renamed from: a */
    private final C12271b m10417a(Context context, C11727c cVar) {
        C1342b inflations = this.f9146f.getInflations();
        LayoutInflater from = LayoutInflater.from(context);
        C12932j.m33815a((Object) from, "LayoutInflater.from(context)");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        C11731a aVar = new C11731a(cVar, inflations, from, recyclerView);
        cVar.mo34543a((ViewHolderPrefetcher) aVar);
        C7716c cVar2 = C7716c.ANCHOR;
        Integer valueOf = Integer.valueOf(1);
        return aVar.mo34549a(C12835h0.m33548a(C12954o.m33853a(cVar2, valueOf), C12954o.m33853a(C3324u.HEADER, Integer.valueOf(2)), C12954o.m33853a(C3324u.BEST_FRIEND_CONTENT, valueOf), C12954o.m33853a(C3324u.USER, Integer.valueOf(5))));
    }
}
