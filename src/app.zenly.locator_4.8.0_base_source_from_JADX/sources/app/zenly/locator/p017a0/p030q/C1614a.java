package app.zenly.locator.p017a0.p030q;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.p017a0.C1525l;
import app.zenly.locator.p017a0.p030q.p031c.C1619b;
import app.zenly.locator.p017a0.p030q.p032d.C1632a;
import app.zenly.locator.p017a0.p041t.C1684a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.userprofile.p198me.p199g.C6081a;
import com.airbnb.lottie.LottieAnimationView;
import com.bluelinelabs.conductor.C8819d;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.a0.q.a */
public final class C1614a extends ZenlyController {

    /* renamed from: P */
    private final C12275b f5594P = new C12275b();

    /* renamed from: Q */
    private final C12275b f5595Q = new C12275b();

    /* renamed from: R */
    private C11705b f5596R;

    /* renamed from: S */
    private C1619b f5597S;

    /* renamed from: T */
    private FriendStore f5598T;

    /* renamed from: U */
    private FriendshipStore f5599U;

    /* renamed from: V */
    private FriendRequestStore f5600V;

    /* renamed from: W */
    private SearchBar f5601W;

    /* renamed from: X */
    private RecyclerView f5602X;

    /* renamed from: Y */
    private ViewGroup f5603Y;

    /* renamed from: app.zenly.locator.a0.q.a$a */
    static final class C1615a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1615a f5604e = new C1615a();

        C1615a() {
        }

        /* renamed from: a */
        public final String apply(CharSequence charSequence) {
            C12932j.m33818b(charSequence, "it");
            return charSequence.toString();
        }
    }

    /* renamed from: app.zenly.locator.a0.q.a$b */
    public static final class C1616b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1614a f5605a;

        C1616b(C1614a aVar) {
            this.f5605a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animation");
            super.onAnimationCancel(animator);
            this.f5605a.mo7194D();
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f5605a.mo7194D();
        }
    }

    /* renamed from: b */
    private final C11705b m6863b(Context context) {
        SearchBar searchBar = this.f5601W;
        if (searchBar != null) {
            C12279e d = C1684a.m7016a(searchBar).mo36501i(C1615a.f5604e).mo36477d();
            C6081a aVar = new C6081a(C5448c.m15478a());
            String d2 = C5447b.m15477d(C5448c.m15478a());
            if (d2 != null) {
                FriendStore friendStore = this.f5598T;
                if (friendStore != null) {
                    FriendshipStore friendshipStore = this.f5599U;
                    if (friendshipStore != null) {
                        FriendRequestStore friendRequestStore = this.f5600V;
                        if (friendRequestStore != null) {
                            C3201f c = C3205g.m10194c(C7713f.m18776a(context));
                            C3201f b = C3205g.m10192b(C7713f.m18776a(context));
                            C12932j.m33815a((Object) d, "queryObservable");
                            C1632a aVar2 = new C1632a(d2, aVar, friendStore, friendshipStore, friendRequestStore, c, b, d, C5448c.m15478a());
                            C11727c cVar = new C11727c(C12846n.m33635a(C1617b.class));
                            ZenlySchedulers a = C1351e.m6372a(C1525l.f5415b.mo19916a("manageFriends"));
                            C11700c cVar2 = new C11700c();
                            ZenlyCore a2 = C5448c.m15478a();
                            C2538c0 a3 = C2538c0.m8837a(mo9304A());
                            C12932j.m33815a((Object) a3, "InviteManager.from(requireActivity())");
                            C1619b bVar = new C1619b(this, context, a2, aVar, a3, a.getMainThread());
                            this.f5597S = bVar;
                            C1619b bVar2 = this.f5597S;
                            if (bVar2 != null) {
                                Disposable b2 = cVar2.mo34449b(bVar2);
                                C12932j.m33815a((Object) b2, "bus.subscribe(eventDispatcher)");
                                C12773a.m33432a(b2, this.f5595Q);
                                EventDispatcher a4 = cVar2.mo34447a();
                                C12932j.m33815a((Object) a4, "bus.eventDispatcher");
                                C11705b bVar3 = new C11705b(cVar, a4, a.getComputation(), a.getMainThread(), C12846n.m33635a(aVar2), null, 32, null);
                                return bVar3;
                            }
                            C12932j.m33820c("eventDispatcher");
                            throw null;
                        }
                        C12932j.m33820c("friendRequestStore");
                        throw null;
                    }
                    C12932j.m33820c("friendshipStore");
                    throw null;
                }
                C12932j.m33820c("friendStore");
                throw null;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33820c("searchView");
        throw null;
    }

    /* renamed from: B */
    public final void mo7192B() {
        ViewGroup viewGroup = this.f5603Y;
        String str = "loadingLayout";
        if (viewGroup != null) {
            C7697b.m18740c(viewGroup, 0, null, 3, null);
            ViewGroup viewGroup2 = this.f5603Y;
            if (viewGroup2 != null) {
                C7697b.m18743d((ProgressBar) viewGroup2.findViewById(C3891l.manage_friends_progress), 0, null, 3, null);
                ViewGroup viewGroup3 = this.f5603Y;
                if (viewGroup3 != null) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) viewGroup3.findViewById(C3891l.manage_friends_success);
                    C7697b.m18740c(lottieAnimationView, 0, null, 3, null);
                    lottieAnimationView.mo22798a((AnimatorListener) new C1616b(this));
                    lottieAnimationView.mo22807d();
                    return;
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

    /* renamed from: C */
    public final void mo7193C() {
        ViewGroup viewGroup = this.f5603Y;
        String str = "loadingLayout";
        if (viewGroup != null) {
            C7697b.m18740c(viewGroup, 0, null, 3, null);
            ViewGroup viewGroup2 = this.f5603Y;
            if (viewGroup2 != null) {
                C7697b.m18743d((ProgressBar) viewGroup2.findViewById(C3891l.manage_friends_progress), 0, null, 2, null);
                ViewGroup viewGroup3 = this.f5603Y;
                if (viewGroup3 != null) {
                    C7697b.m18740c((ProgressBar) viewGroup3.findViewById(C3891l.manage_friends_progress), 0, null, 3, null);
                    ViewGroup viewGroup4 = this.f5603Y;
                    if (viewGroup4 != null) {
                        ((LottieAnimationView) viewGroup4.findViewById(C3891l.manage_friends_success)).mo22797a();
                        ViewGroup viewGroup5 = this.f5603Y;
                        if (viewGroup5 != null) {
                            C7697b.m18743d((LottieAnimationView) viewGroup5.findViewById(C3891l.manage_friends_success), 0, null, 2, null);
                        } else {
                            C12932j.m33820c(str);
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: D */
    public final void mo7194D() {
        ViewGroup viewGroup = this.f5603Y;
        String str = "loadingLayout";
        if (viewGroup != null) {
            C7697b.m18743d(viewGroup, 0, null, 3, null);
            ViewGroup viewGroup2 = this.f5603Y;
            if (viewGroup2 != null) {
                ProgressBar progressBar = (ProgressBar) viewGroup2.findViewById(C3891l.manage_friends_progress);
                C12932j.m33815a((Object) progressBar, "loadingLayout.manage_friends_progress");
                progressBar.setVisibility(8);
                ViewGroup viewGroup3 = this.f5603Y;
                if (viewGroup3 != null) {
                    C7697b.m18743d((LottieAnimationView) viewGroup3.findViewById(C3891l.manage_friends_success), 0, null, 3, null);
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        StoreModule a = C3015a.m9526a(context);
        this.f5598T = a.provideFriendStore();
        this.f5599U = a.provideFriendshipStore();
        this.f5600V = a.provideFriendRequestStore();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f5595Q.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        C1619b bVar = this.f5597S;
        if (bVar != null) {
            bVar.mo7198a((NavigationContract) null);
            this.f5594P.mo36401a();
            super.mo7053d(view);
            return;
        }
        C12932j.m33820c("eventDispatcher");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ScreenBarLayout screenBarLayout = (ScreenBarLayout) view.findViewById(C3891l.screen_bar_layout);
        C12932j.m33815a((Object) screenBarLayout, "view.screen_bar_layout");
        screenBarLayout.setPadding(rect.left, rect.top, rect.right, screenBarLayout.getPaddingBottom());
        RecyclerView recyclerView = this.f5602X;
        if (recyclerView != null) {
            recyclerView.setPadding(rect.left, recyclerView.getPaddingTop(), rect.right, rect.bottom);
            return;
        }
        C12932j.m33820c("recyclerView");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_manage_friends, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.search_bar);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.search_bar)");
        this.f5601W = (SearchBar) findViewById;
        View findViewById2 = inflate.findViewById(R.id.manage_friends_list);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.manage_friends_list)");
        this.f5602X = (RecyclerView) findViewById2;
        RecyclerView recyclerView = this.f5602X;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            C12932j.m33815a((Object) inflate, "view");
            Context context = inflate.getContext();
            C12932j.m33815a((Object) context, "view.context");
            this.f5596R = m6863b(context);
            RecyclerView recyclerView2 = this.f5602X;
            if (recyclerView2 != null) {
                C11705b bVar = this.f5596R;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                    FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C3891l.manage_friends_loading_layout);
                    C12932j.m33815a((Object) frameLayout, "view.manage_friends_loading_layout");
                    this.f5603Y = frameLayout;
                    ViewGroup viewGroup2 = this.f5603Y;
                    if (viewGroup2 != null) {
                        C7697b.m18743d(viewGroup2, 0, null, 3, null);
                        return inflate;
                    }
                    C12932j.m33820c("loadingLayout");
                    throw null;
                }
                C12932j.m33820c("adapter");
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C1619b bVar = this.f5597S;
        if (bVar != null) {
            C8819d l = mo23947l();
            if (!(l instanceof NavigationContract)) {
                l = null;
            }
            bVar.mo7198a((NavigationContract) l);
            C11705b bVar2 = this.f5596R;
            if (bVar2 != null) {
                C12773a.m33432a(bVar2.mo34464b(), this.f5594P);
            } else {
                C12932j.m33820c("adapter");
                throw null;
            }
        } else {
            C12932j.m33820c("eventDispatcher");
            throw null;
        }
    }
}
