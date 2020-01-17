package app.zenly.locator.p017a0.p035r;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.R;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.p017a0.C1526m;
import app.zenly.locator.p017a0.p035r.p036f.C1659a;
import app.zenly.locator.p017a0.p035r.p036f.C1660b;
import app.zenly.locator.p017a0.p035r.p037g.C1661a;
import app.zenly.locator.p017a0.p041t.C1684a;
import app.zenly.locator.p143s.p148l.C5448c;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.models.C7302f3;
import p213co.znly.models.UserProto$DisabledNotifications;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7715b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7716c;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.a0.r.c */
public final class C1652c extends C1650a {

    /* renamed from: R */
    private final C12275b f5672R = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C12275b f5673S = new C12275b();

    /* renamed from: T */
    private FriendStore f5674T;

    /* renamed from: U */
    private RecyclerView f5675U;

    /* renamed from: V */
    private C11705b f5676V;

    /* renamed from: W */
    private UserProto$User f5677W;

    /* renamed from: app.zenly.locator.a0.r.c$a */
    private final class C1653a {
        public C1653a() {
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onGlobalNotificationSwitchEvent(C1659a aVar) {
            C12932j.m33818b(aVar, "event");
            C1652c.this.mo7254a(aVar.mo7261b().mo7279f(), aVar.mo7260a());
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onPerUserNotificationSwitchEvent(C1660b bVar) {
            C12932j.m33818b(bVar, "event");
            C1652c.this.m6954a(bVar.mo7263b().mo7285f().mo9074a(), bVar.mo7263b().mo7286g(), bVar.mo7262a());
        }
    }

    /* renamed from: app.zenly.locator.a0.r.c$b */
    static final class C1654b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1654b f5679e = new C1654b();

        C1654b() {
        }

        /* renamed from: a */
        public final String apply(CharSequence charSequence) {
            C12932j.m33818b(charSequence, "query");
            return charSequence.toString();
        }
    }

    /* renamed from: app.zenly.locator.a0.r.c$c */
    static final class C1655c<T> implements Consumer<Disposable> {

        /* renamed from: e */
        final /* synthetic */ C1652c f5680e;

        C1655c(C1652c cVar) {
            this.f5680e = cVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f5680e.f5673S.add(disposable);
        }
    }

    /* renamed from: e */
    private final void m6955e(View view) {
        View findViewById = view.findViewById(R.id.search_bar);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.search_bar)");
        C12279e a = C1684a.m7016a((SearchBar) findViewById).mo36501i(C1654b.f5679e).mo36477d().mo36475c(1).mo36944a(1, new C1655c(this));
        C12932j.m33815a((Object) a, "RxSearchBar.textChanges(…seOnDestroyView.add(it) }");
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        C3201f c = C3205g.m10194c(C7713f.m18776a(A));
        C12279e userMeStream = C5448c.m15478a().userMeStream();
        C12932j.m33815a((Object) userMeStream, "ZenlyCoreProvider.get().userMeStream()");
        FriendStore friendStore = this.f5674T;
        if (friendStore != null) {
            C1661a aVar = new C1661a(c, userMeStream, a, friendStore, C5448c.m15478a());
            C11727c cVar = new C11727c(C12848o.m33643b((Object[]) new Class[]{C7716c.class, C1656d.class}));
            C11700c cVar2 = new C11700c();
            cVar2.mo34449b(new C1653a());
            this.f5673S.add(cVar2);
            EventDispatcher a2 = cVar2.mo34447a();
            C12932j.m33815a((Object) a2, "bus.eventDispatcher");
            C12286f a3 = C12802a.m33490a();
            C12932j.m33815a((Object) a3, "Schedulers.computation()");
            C12286f a4 = C12295a.m32802a();
            C12932j.m33815a((Object) a4, "AndroidSchedulers.mainThread()");
            C11705b bVar = new C11705b(cVar, a2, a3, a4, C12848o.m33643b((Object[]) new ObservableSectionController[]{new C7715b(), aVar}), null, 32, null);
            this.f5676V = bVar;
            return;
        }
        C12932j.m33820c("friendStore");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C12275b bVar = this.f5672R;
        C11705b bVar2 = this.f5676V;
        if (bVar2 != null) {
            bVar.add(bVar2.mo34464b());
        } else {
            C12932j.m33820c("adapter");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f5673S.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f5672R.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        View findViewById = view.findViewById(R.id.toolbar);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        C12932j.m33815a((Object) findViewById, "toolbar");
        findViewById.setPadding(i, i2, i3, findViewById.getPaddingBottom());
        RecyclerView recyclerView = this.f5675U;
        String str = "recyclerView";
        if (recyclerView != null) {
            int i4 = rect.left;
            if (recyclerView != null) {
                recyclerView.setPadding(i4, recyclerView.getPaddingTop(), rect.right, rect.bottom);
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
        this.f5674T = C3015a.m9526a(context).provideFriendStore();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_friends_abroad_notifications, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.friends_abroad_recycler_view);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.f…nds_abroad_recycler_view)");
        this.f5675U = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f5675U;
        String str = "recyclerView";
        if (recyclerView == null) {
            C12932j.m33820c(str);
            throw null;
        } else if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            C12932j.m33815a((Object) inflate, "view");
            m6955e(inflate);
            RecyclerView recyclerView2 = this.f5675U;
            if (recyclerView2 != null) {
                C11705b bVar = this.f5676V;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                    RecyclerView recyclerView3 = this.f5675U;
                    if (recyclerView3 != null) {
                        recyclerView3.setItemAnimator(null);
                        return inflate;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c("adapter");
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7050a(Context context, UserProto$User userProto$User) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(userProto$User, "newUser");
        super.mo7050a(context, userProto$User);
        this.f5677W = userProto$User;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6954a(UserProto$User userProto$User, C7302f3 f3Var, boolean z) {
        UserProto$User userProto$User2 = this.f5677W;
        if (userProto$User2 != null) {
            UserProto$DisabledNotifications disabledNotifications = userProto$User2.getDisabledNotifications();
            C12932j.m33815a((Object) disabledNotifications, "currentUser.disabledNotifications");
            String uuid = userProto$User.getUuid();
            C12932j.m33815a((Object) uuid, "friend.uuid");
            UserProto$DisabledNotifications a = C1651b.m6950a(disabledNotifications, uuid, f3Var, z);
            C6925a aVar = (C6925a) userProto$User2.toBuilder();
            aVar.mo18017a(a);
            UserProto$User userProto$User3 = (UserProto$User) aVar.build();
            C12932j.m33815a((Object) userProto$User3, "updatedUser");
            Activity A = mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C1526m.m6700b(userProto$User3, A);
        }
    }
}
