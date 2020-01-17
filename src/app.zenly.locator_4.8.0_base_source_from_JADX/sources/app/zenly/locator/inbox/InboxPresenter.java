package app.zenly.locator.inbox;

import android.content.Context;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0875o;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.C1101f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.C3572e;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.store.C3027g;
import app.zenly.locator.core.store.SuggestedStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.inbox.C3689b;
import app.zenly.locator.experimental.inbox.C3695c;
import app.zenly.locator.experimental.inbox.C3697d;
import app.zenly.locator.experimental.inbox.C3699e;
import app.zenly.locator.experimental.inbox.C3701f;
import app.zenly.locator.experimental.inbox.C3707h;
import app.zenly.locator.inbox.p101m.C3855a;
import app.zenly.locator.inbox.p101m.C3867c;
import app.zenly.locator.inbox.p103o.C3884a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.recycling.prefetch.C11731a;
import com.snap.p327ui.recycling.prefetch.ViewHolderPrefetcher;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.services.C8078g3;
import p250f.p251a.p252a.p253a.p260i.C7689e;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7715b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7716c;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.p406n.C12789c;

public final class InboxPresenter extends C3572e<InboxTarget> implements LifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ZenlySchedulers f10182f = C1351e.m6372a(C3844i.f10228b.mo19916a("presenter"));
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12275b f10183g = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12275b f10184h = new C12275b();

    /* renamed from: i */
    private OnFocusChangeListener f10185i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C11705b f10186j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11705b f10187k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3699e f10188l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C3697d f10189m = new C3697d();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C12789c<Boolean> f10190n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C12785a<Integer> f10191o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C12789c<String> f10192p;

    /* renamed from: q */
    private C12271b f10193q;

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$a */
    public final class C3821a {

        /* renamed from: app.zenly.locator.inbox.InboxPresenter$a$a */
        static final class C3822a<T> implements Consumer<C8078g3> {

            /* renamed from: e */
            public static final C3822a f10195e = new C3822a();

            C3822a() {
            }

            /* renamed from: a */
            public final void accept(C8078g3 g3Var) {
            }
        }

        /* renamed from: app.zenly.locator.inbox.InboxPresenter$a$b */
        static final class C3823b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C3823b f10196e = new C3823b();

            C3823b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
            }
        }

        public C3821a() {
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onInboxAddFriendsClickEvent(C3835d dVar) {
            C12932j.m33818b(dVar, "event");
            ((InboxTarget) InboxPresenter.this.mo10039b()).getSearch().clearFocus();
            NavigationContract navigation = ((InboxTarget) InboxPresenter.this.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onInboxAddFriends();
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onInboxConversationClickEvent(C3842g gVar) {
            C12932j.m33818b(gVar, "event");
            C3884a a = gVar.mo10439a();
            C5343a.m15160U().mo12853a(a.mo10481i(), a.mo10478f().getIsGroup());
            ((InboxTarget) InboxPresenter.this.mo10039b()).getSearch().clearFocus();
            NavigationContract navigation = ((InboxTarget) InboxPresenter.this.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onInboxConversationSelected(a.mo10478f());
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onInboxConversationHideEvent(C3843h hVar) {
            C12932j.m33818b(hVar, "event");
            Disposable a = C5448c.m15478a().inboxHide(hVar.mo10440a().mo10478f().getInboxUuid()).mo36412a((Consumer<? super T>) C3822a.f10195e, (Consumer<? super Throwable>) C3823b.f10196e);
            C12932j.m33815a((Object) a, "ZenlyCoreProvider.get()\n…       .subscribe({}, {})");
            C12773a.m33432a(a, InboxPresenter.this.f10184h);
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onInboxSearchResultClickEvent(C3845j jVar) {
            C12932j.m33818b(jVar, "event");
            ((InboxTarget) InboxPresenter.this.mo10039b()).getSearch().clearFocus();
            if (jVar.mo10441a().mo10489i() != null) {
                NavigationContract navigation = ((InboxTarget) InboxPresenter.this.mo10039b()).getNavigation();
                if (navigation != null) {
                    navigation.onInboxUserSelected(jVar.mo10441a().mo10489i());
                    return;
                }
                return;
            }
            NavigationContract navigation2 = ((InboxTarget) InboxPresenter.this.mo10039b()).getNavigation();
            if (navigation2 != null) {
                navigation2.onInboxContactSelected(jVar.mo10441a().mo10487g());
            }
        }
    }

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$b */
    static final class C3824b implements Action {

        /* renamed from: a */
        final /* synthetic */ InboxPresenter f10197a;

        /* renamed from: b */
        final /* synthetic */ Context f10198b;

        /* renamed from: app.zenly.locator.inbox.InboxPresenter$b$a */
        static final class C3825a extends C12933k implements Function0<InboxTarget> {

            /* renamed from: f */
            final /* synthetic */ C3824b f10199f;

            C3825a(C3824b bVar) {
                this.f10199f = bVar;
                super(0);
            }

            public final InboxTarget invoke() {
                return (InboxTarget) this.f10199f.f10197a.mo10039b();
            }
        }

        C3824b(InboxPresenter inboxPresenter, Context context) {
            this.f10197a = inboxPresenter;
            this.f10198b = context;
        }

        public final void run() {
            String str = "bus.eventDispatcher";
            C7707a.m18761b("inbox:prepareAsync");
            try {
                C11727c cVar = new C11727c(C12848o.m33643b((Object[]) new Class[]{C7716c.class, C3854l.class, C3707h.class}));
                C11700c cVar2 = new C11700c();
                Disposable b = cVar2.mo34449b(new C3821a());
                C12932j.m33815a((Object) b, "bus.subscribe(EventDispatcherProxy())");
                C12773a.m33432a(b, this.f10197a.f10183g);
                this.f10197a.f10188l = new C3699e(C3015a.m9526a(this.f10198b).provideAlreadyOnZenlyStore(), SuggestedStore.f8303i, new C3695c(C5407g.f13966d.mo12991a(this.f10198b).mo12986h()));
                Disposable b2 = cVar2.mo34449b(new C3689b(InboxPresenter.m11341j(this.f10197a), this.f10197a.f10189m, C12896f.m33751a(new C3825a(this))));
                C12932j.m33815a((Object) b2, "bus.subscribe(SuggestedE…sitory, lazy { target }))");
                C12773a.m33432a(b2, this.f10197a.f10183g);
                InboxPresenter inboxPresenter = this.f10197a;
                Context context = this.f10198b;
                C12271b h = this.f10197a.f10191o.mo36487e(1).mo36498h();
                C12932j.m33815a((Object) h, "itemCountSubject.take(1).ignoreElements()");
                C12271b a = inboxPresenter.m11322a(context, cVar, h).mo36338a();
                Disposable b3 = a.mo36351b();
                C12932j.m33815a((Object) b3, "prefetchDoneCompletable.subscribe()");
                C12773a.m33432a(b3, this.f10197a.f10183g);
                C12279e e = this.f10197a.f10190n.mo36428a((C12286f) this.f10197a.f10182f.getUserInteractive()).mo36488e(200, TimeUnit.MILLISECONDS);
                InboxPresenter inboxPresenter2 = this.f10197a;
                ZenlySchedulers a2 = C1351e.m6372a(C3844i.f10228b.mo19916a("adapter"));
                EventDispatcher a3 = cVar2.mo34447a();
                C12932j.m33815a((Object) a3, str);
                C1342b computation = a2.getComputation();
                C1342b mainThread = a2.getMainThread();
                Object[] objArr = new ObservableSectionController[3];
                objArr[0] = new C7715b();
                C12932j.m33815a((Object) a, "prefetchDoneCompletable");
                C12785a e2 = this.f10197a.f10191o;
                InboxManager b4 = InboxManager.m11316b();
                C12932j.m33815a((Object) b4, "InboxManager.get()");
                C12932j.m33815a((Object) e, "loadMoreEvents");
                objArr[1] = new C3855a(a, e2, b4, e);
                Context context2 = this.f10198b;
                C1322a a4 = C3444a.m10686a(this.f10198b);
                ZenlyCore a5 = C5448c.m15478a();
                C3699e j = InboxPresenter.m11341j(this.f10197a);
                C3697d i = this.f10197a.f10189m;
                C3027g provideFriendRequestStore = C3015a.m9526a(this.f10198b).provideFriendRequestStore();
                EventDispatcher a6 = cVar2.mo34447a();
                C12932j.m33815a((Object) a6, str);
                Object[] objArr2 = objArr;
                C3697d dVar = i;
                EventDispatcher eventDispatcher = a3;
                InboxPresenter inboxPresenter3 = inboxPresenter2;
                C3701f fVar = new C3701f(context2, a4, a5, j, dVar, provideFriendRequestStore, cVar, a6);
                objArr2[2] = fVar;
                C11705b bVar = new C11705b(cVar, eventDispatcher, computation, mainThread, C12848o.m33643b(objArr2), null, 32, null);
                inboxPresenter3.f10186j = bVar;
                InboxPresenter inboxPresenter4 = this.f10197a;
                ZenlySchedulers a7 = C1351e.m6372a(C3844i.f10228b.mo19916a("searchAdapter"));
                EventDispatcher a8 = cVar2.mo34447a();
                C12932j.m33815a((Object) a8, str);
                C11727c cVar3 = cVar;
                C11705b bVar2 = new C11705b(cVar3, a8, a7.getComputation(), a7.getMainThread(), C12848o.m33643b((Object[]) new ObservableSectionController[]{new C7715b(), new C3867c(this.f10197a.f10192p, new C3846k())}), null, 32, null);
                inboxPresenter4.f10187k = bVar2;
                C12956q qVar = C12956q.f33541a;
            } finally {
                C7707a.m18759a();
            }
        }
    }

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$c */
    public static final class C3826c extends C7689e {

        /* renamed from: e */
        final /* synthetic */ InboxPresenter f10200e;

        C3826c(InboxPresenter inboxPresenter) {
            this.f10200e = inboxPresenter;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            this.f10200e.f10192p.onNext(charSequence.toString());
        }
    }

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$d */
    public static final class C3827d extends C1076n {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f10201a;

        /* renamed from: b */
        final /* synthetic */ InboxPresenter f10202b;

        C3827d(RecyclerView recyclerView, InboxPresenter inboxPresenter) {
            this.f10201a = recyclerView;
            this.f10202b = inboxPresenter;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C12932j.m33818b(recyclerView, "recyclerView");
            if (i != 0 || i2 != 0) {
                LayoutManager layoutManager = this.f10201a.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager.mo5293j() - linearLayoutManager.mo4977K() < 15) {
                        this.f10202b.f10190n.onNext(Boolean.valueOf(true));
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        }
    }

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$e */
    static final class C3828e implements OnFocusChangeListener {

        /* renamed from: e */
        final /* synthetic */ InboxPresenter f10203e;

        C3828e(InboxPresenter inboxPresenter) {
            this.f10203e = inboxPresenter;
        }

        public final void onFocusChange(View view, boolean z) {
            NavigationContract navigation = ((InboxTarget) this.f10203e.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.setNavigationEnabled(!z);
            }
            if (z) {
                ((InboxTarget) this.f10203e.mo10039b()).getBottomSheetBehavior().mo30690c(3);
            }
        }
    }

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$f */
    public static final class C3829f extends C10744c {

        /* renamed from: a */
        final /* synthetic */ InboxPresenter f10204a;

        C3829f(InboxPresenter inboxPresenter) {
            this.f10204a = inboxPresenter;
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            C12932j.m33818b(view, "bottomSheet");
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            C12932j.m33818b(view, "bottomSheet");
            if (i == 4) {
                ((InboxTarget) this.f10204a.mo10039b()).getSearch().clearFocus();
            }
        }
    }

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$g */
    static final class C3830g<T> implements Consumer<String> {

        /* renamed from: e */
        final /* synthetic */ InboxPresenter f10205e;

        C3830g(InboxPresenter inboxPresenter) {
            this.f10205e = inboxPresenter;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C12932j.m33815a((Object) str, "it");
            if (str.length() == 0) {
                if (((InboxTarget) this.f10205e.mo10039b()).getRecyclerView().getAdapter() != InboxPresenter.m11321a(this.f10205e)) {
                    ((InboxTarget) this.f10205e.mo10039b()).getRecyclerView().setItemAnimator(new C1101f());
                    ((InboxTarget) this.f10205e.mo10039b()).getRecyclerView().mo5044a((C1069g) InboxPresenter.m11321a(this.f10205e), false);
                }
            } else if (((InboxTarget) this.f10205e.mo10039b()).getRecyclerView().getAdapter() != InboxPresenter.m11339h(this.f10205e)) {
                ((InboxTarget) this.f10205e.mo10039b()).getRecyclerView().setItemAnimator(null);
                ((InboxTarget) this.f10205e.mo10039b()).getRecyclerView().mo5044a((C1069g) InboxPresenter.m11339h(this.f10205e), false);
            }
        }
    }

    /* renamed from: app.zenly.locator.inbox.InboxPresenter$h */
    static final class C3831h implements Action {

        /* renamed from: a */
        final /* synthetic */ InboxPresenter f10206a;

        /* renamed from: b */
        final /* synthetic */ InboxTarget f10207b;

        C3831h(InboxPresenter inboxPresenter, Context context, InboxTarget inboxTarget) {
            this.f10206a = inboxPresenter;
            this.f10207b = inboxTarget;
        }

        public final void run() {
            this.f10207b.getLifecycle().mo4446a(this.f10206a);
        }
    }

    public InboxPresenter() {
        C12789c<Boolean> s = C12789c.m33462s();
        C12932j.m33815a((Object) s, "PublishSubject.create<Boolean>()");
        this.f10190n = s;
        C12785a<Integer> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<Int>()");
        this.f10191o = u;
        C12789c<String> s2 = C12789c.m33462s();
        C12932j.m33815a((Object) s2, "PublishSubject.create<String>()");
        this.f10192p = s2;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11705b m11321a(InboxPresenter inboxPresenter) {
        C11705b bVar = inboxPresenter.f10186j;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("conversationsAdapter");
        throw null;
    }

    /* renamed from: h */
    public static final /* synthetic */ C11705b m11339h(InboxPresenter inboxPresenter) {
        C11705b bVar = inboxPresenter.f10187k;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("searchAdapter");
        throw null;
    }

    /* renamed from: j */
    public static final /* synthetic */ C3699e m11341j(InboxPresenter inboxPresenter) {
        C3699e eVar = inboxPresenter.f10188l;
        if (eVar != null) {
            return eVar;
        }
        C12932j.m33820c("suggestedRepository");
        throw null;
    }

    @C0875o(C0863a.ON_PAUSE)
    public final void onPause() {
        this.f10184h.mo36401a();
    }

    @C0875o(C0863a.ON_RESUME)
    public final void onResume() {
        C11705b bVar = this.f10186j;
        if (bVar != null) {
            C12773a.m33432a(bVar.mo34464b(), this.f10184h);
            C11705b bVar2 = this.f10187k;
            if (bVar2 != null) {
                C12773a.m33432a(bVar2.mo34464b(), this.f10184h);
            } else {
                C12932j.m33820c("searchAdapter");
                throw null;
            }
        } else {
            C12932j.m33820c("conversationsAdapter");
            throw null;
        }
    }

    @C0875o(C0863a.ON_START)
    public final void onStart() {
        this.f10185i = new C3828e(this);
        SearchBar search = ((InboxTarget) mo10039b()).getSearch();
        OnFocusChangeListener onFocusChangeListener = this.f10185i;
        if (onFocusChangeListener != null) {
            search.mo6899a(onFocusChangeListener);
            search.mo6898a((TextWatcher) new C3826c(this));
            ((InboxTarget) mo10039b()).getBottomSheetBehavior().mo14019a((C10744c) new C3829f(this));
            Disposable d = this.f10192p.mo36428a((C12286f) this.f10182f.getMainThread()).mo36476d((Consumer<? super T>) new C3830g<Object>(this));
            C12932j.m33815a((Object) d, "enterSearch.observeOn(sc…}\n            }\n        }");
            C12773a.m33432a(d, this.f10183g);
            RecyclerView recyclerView = ((InboxTarget) mo10039b()).getRecyclerView();
            C11705b bVar = this.f10186j;
            if (bVar != null) {
                recyclerView.setAdapter(bVar);
                recyclerView.mo5047a((C1076n) new C3827d(recyclerView, this));
                return;
            }
            C12932j.m33820c("conversationsAdapter");
            throw null;
        }
        C12932j.m33820c("onFocusChangeListener");
        throw null;
    }

    @C0875o(C0863a.ON_STOP)
    public final void onStop() {
        SearchBar search = ((InboxTarget) mo10039b()).getSearch();
        OnFocusChangeListener onFocusChangeListener = this.f10185i;
        if (onFocusChangeListener != null) {
            search.mo6901b(onFocusChangeListener);
            ((InboxTarget) mo10039b()).getRecyclerView().setAdapter(null);
            this.f10183g.mo36401a();
            return;
        }
        C12932j.m33820c("onFocusChangeListener");
        throw null;
    }

    /* renamed from: d */
    private final boolean m11333d() {
        LayoutManager layoutManager = ((InboxTarget) mo10039b()).getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            return ((LinearLayoutManager) layoutManager).mo4976J() == 0;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* renamed from: e */
    private final void m11335e() {
        boolean z;
        C11705b bVar = this.f10186j;
        String str = "conversationsAdapter";
        Object obj = null;
        if (bVar != null) {
            Iterator it = C12973l.m33894d(0, bVar.getItemCount()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int intValue = ((Number) next).intValue();
                C11705b bVar2 = this.f10186j;
                if (bVar2 != null) {
                    C11722a itemViewModel = bVar2.getItemViewModel(intValue);
                    if (!(itemViewModel instanceof C3884a) || !((C3884a) itemViewModel).mo10481i()) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        obj = next;
                        break;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                m11325a(num.intValue());
                return;
            }
            return;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* renamed from: f */
    private final void m11337f() {
        ((InboxTarget) mo10039b()).getRecyclerView().mo5120h(0);
    }

    /* renamed from: c */
    public final void mo10412c() {
        if (m11333d()) {
            m11335e();
        } else {
            m11337f();
        }
    }

    /* renamed from: b */
    private final C12271b m11328b(Context context) {
        C12271b b = C12271b.m32506b((Action) new C3824b(this, context));
        C12932j.m33815a((Object) b, "Completable.fromAction {…        }\n        }\n    }");
        return b;
    }

    /* renamed from: a */
    public final C12271b mo10410a(Context context) {
        C12932j.m33818b(context, "context");
        C12271b bVar = this.f10193q;
        if (bVar != null) {
            return bVar;
        }
        C12271b a = m11328b(context).mo36350b((C12286f) this.f10182f.getUserInteractive()).mo36338a();
        this.f10193q = a;
        C12932j.m33815a((Object) a, "onPrepareAsync(context)\n…epareCompletable = this }");
        return a;
    }

    /* renamed from: a */
    public void mo10037a() {
        ((InboxTarget) mo10039b()).getLifecycle().mo4447b(this);
        super.mo10037a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12271b m11322a(Context context, C11727c cVar, C12271b bVar) {
        C1342b inflations = this.f10182f.getInflations();
        LayoutInflater from = LayoutInflater.from(context);
        C12932j.m33815a((Object) from, "LayoutInflater.from(context)");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        C11731a aVar = new C11731a(cVar, inflations, from, recyclerView);
        cVar.mo34543a((ViewHolderPrefetcher) aVar);
        Disposable b = m11324a(bVar, (AdapterViewType) C3854l.CONVERSATION, aVar).mo36351b();
        C12932j.m33815a((Object) b, "preloadMoreViewsForScrol…her\n        ).subscribe()");
        C12773a.m33432a(b, this.f10183g);
        return aVar.mo34549a(C12833g0.m33543a(C12954o.m33853a(C3854l.CONVERSATION, Integer.valueOf(8))));
    }

    /* renamed from: a */
    private final C12271b m11324a(C12271b bVar, AdapterViewType adapterViewType, C11731a aVar) {
        C12271b a = bVar.mo36339a(1000, TimeUnit.MILLISECONDS, this.f10182f.getMainThread()).mo36341a((CompletableSource) aVar.mo34549a(C12833g0.m33543a(C12954o.m33853a(adapterViewType, Integer.valueOf(6)))));
        C12932j.m33815a((Object) a, "delayPrefetch\n          … SCROLL_PRELOADS_COUNT)))");
        return a;
    }

    /* renamed from: a */
    private final void m11325a(int i) {
        ((InboxTarget) mo10039b()).getRecyclerView().mo5120h(i);
    }

    /* renamed from: a */
    public void mo10411a(Context context, InboxTarget inboxTarget) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(inboxTarget, "target");
        C7707a.m18761b("profile:takeTarget");
        try {
            super.mo10038a(context, inboxTarget);
            Disposable a = mo10410a(context).mo36342a((C12286f) this.f10182f.getMainThread()).mo36344a((Action) new C3831h(this, context, inboxTarget));
            C12932j.m33815a((Object) a, "prepareAsync(context)\n  …erver(this)\n            }");
            C12773a.m33432a(a, this.f10183g);
            C12956q qVar = C12956q.f33541a;
        } finally {
            C7707a.m18759a();
        }
    }
}
