package app.zenly.locator.p017a0.p018n;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.p017a0.C1525l;
import app.zenly.locator.p017a0.p018n.p019f.C1540b;
import app.zenly.locator.p017a0.p018n.p020g.C1544a;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import java.util.Comparator;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.p406n.C12789c;

/* renamed from: app.zenly.locator.a0.n.b */
public final class C1530b extends ZenlyController {

    /* renamed from: P */
    private final C12275b f5421P = new C12275b();

    /* renamed from: Q */
    private final C12275b f5422Q = new C12275b();

    /* renamed from: R */
    private final C1534c f5423R = new C1534c();

    /* renamed from: S */
    private Comparator<UserProto$User> f5424S;

    /* renamed from: T */
    private C11705b f5425T;

    /* renamed from: U */
    private ScreenBarLayout f5426U;

    /* renamed from: V */
    private RecyclerView f5427V;

    /* renamed from: W */
    private EmptyView f5428W;

    /* renamed from: X */
    private EmptyView f5429X;

    /* renamed from: app.zenly.locator.a0.n.b$a */
    static final class C1531a<T> implements Consumer<C1538e> {

        /* renamed from: e */
        final /* synthetic */ C1530b f5430e;

        C1531a(C1530b bVar) {
            this.f5430e = bVar;
        }

        /* renamed from: a */
        public final void accept(C1538e eVar) {
            C1530b bVar = this.f5430e;
            C12932j.m33815a((Object) eVar, "state");
            bVar.m6708a(eVar);
        }
    }

    /* renamed from: app.zenly.locator.a0.n.b$b */
    static final class C1532b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1532b f5431e = new C1532b();

        C1532b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32031b(th);
        }
    }

    /* renamed from: app.zenly.locator.a0.n.b$c */
    static final class C1533c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C12789c f5432e;

        C1533c(C12789c cVar) {
            this.f5432e = cVar;
        }

        public final void onClick(View view) {
            this.f5432e.onNext(Boolean.valueOf(true));
        }
    }

    /* renamed from: b */
    private final C11705b m6709b(Context context) {
        C11727c cVar = new C11727c(C12846n.m33635a(C1537d.class));
        ZenlySchedulers a = C1351e.m6372a(C1525l.f5415b.mo19916a("blockedUsers"));
        C11700c cVar2 = new C11700c();
        Disposable b = cVar2.mo34449b(new C1540b(context, this.f5423R, a.getMainThread()));
        C12932j.m33815a((Object) b, "bus.subscribe(EventDispa…l, scheduler.mainThread))");
        C12773a.m33432a(b, this.f5422Q);
        C12785a u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<State>()");
        Disposable a2 = u.mo36428a((C12286f) a.getMainThread()).mo36412a((Consumer<? super T>) new C1531a<Object>(this), (Consumer<? super Throwable>) C1532b.f5431e);
        C12932j.m33815a((Object) a2, "stateObservable\n        …mber.w(e) }\n            )");
        C12773a.m33432a(a2, this.f5422Q);
        C12789c s = C12789c.m33462s();
        C12932j.m33815a((Object) s, "PublishSubject.create<Boolean>()");
        EmptyView emptyView = this.f5429X;
        if (emptyView != null) {
            emptyView.setOnActionClickListener(new C1533c(s));
            Comparator<UserProto$User> comparator = this.f5424S;
            if (comparator != null) {
                C1544a aVar = new C1544a(comparator, this.f5423R, u, s);
                EventDispatcher a3 = cVar2.mo34447a();
                C12932j.m33815a((Object) a3, "bus.eventDispatcher");
                C11705b bVar = new C11705b(cVar, a3, a.getComputation(), a.getMainThread(), C12846n.m33635a(aVar), null, 32, null);
                return bVar;
            }
            C12932j.m33820c("userComparator");
            throw null;
        }
        C12932j.m33820c("failedView");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f5422Q.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f5421P.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ScreenBarLayout screenBarLayout = this.f5426U;
        if (screenBarLayout != null) {
            screenBarLayout.setPadding(rect.left, rect.top, rect.right, screenBarLayout.getPaddingBottom());
            ViewGroup[] viewGroupArr = new ViewGroup[3];
            RecyclerView recyclerView = this.f5427V;
            if (recyclerView != null) {
                viewGroupArr[0] = recyclerView;
                EmptyView emptyView = this.f5428W;
                if (emptyView != null) {
                    viewGroupArr[1] = emptyView;
                    EmptyView emptyView2 = this.f5429X;
                    if (emptyView2 != null) {
                        viewGroupArr[2] = emptyView2;
                        for (ViewGroup viewGroup : viewGroupArr) {
                            viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, rect.bottom);
                        }
                        return;
                    }
                    C12932j.m33820c("failedView");
                    throw null;
                }
                C12932j.m33820c("emptyView");
                throw null;
            }
            C12932j.m33820c("recyclerView");
            throw null;
        }
        C12932j.m33820c("screenBarLayout");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        this.f5424S = C3205g.m10196e(C7713f.m18776a(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.controller_blocked_users, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.screen_bar_layout);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.screen_bar_layout)");
        this.f5426U = (ScreenBarLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.screen_bar);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.screen_bar)");
        ScreenBar screenBar = (ScreenBar) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.blocked_users_empty);
        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.blocked_users_empty)");
        this.f5428W = (EmptyView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.blocked_users_failed);
        C12932j.m33815a((Object) findViewById4, "view.findViewById(R.id.blocked_users_failed)");
        this.f5429X = (EmptyView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.list);
        C12932j.m33815a((Object) findViewById5, "view.findViewById(R.id.list)");
        this.f5427V = (RecyclerView) findViewById5;
        RecyclerView recyclerView = this.f5427V;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            C12932j.m33815a((Object) inflate, "view");
            Context context = inflate.getContext();
            C12932j.m33815a((Object) context, "view.context");
            this.f5425T = m6709b(context);
            RecyclerView recyclerView2 = this.f5427V;
            if (recyclerView2 != null) {
                C11705b bVar = this.f5425T;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                    return inflate;
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6708a(C1538e eVar) {
        int i = C1529a.f5420a[eVar.ordinal()];
        String str = "recyclerView";
        String str2 = "failedView";
        String str3 = "emptyView";
        if (i == 1) {
            EmptyView emptyView = this.f5428W;
            if (emptyView != null) {
                emptyView.setVisibility(8);
                EmptyView emptyView2 = this.f5429X;
                if (emptyView2 != null) {
                    emptyView2.setVisibility(8);
                    RecyclerView recyclerView = this.f5427V;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            } else {
                C12932j.m33820c(str3);
                throw null;
            }
        } else if (i == 2) {
            EmptyView emptyView3 = this.f5428W;
            if (emptyView3 != null) {
                emptyView3.setVisibility(0);
                EmptyView emptyView4 = this.f5429X;
                if (emptyView4 != null) {
                    emptyView4.setVisibility(8);
                    RecyclerView recyclerView2 = this.f5427V;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(4);
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            } else {
                C12932j.m33820c(str3);
                throw null;
            }
        } else if (i == 3) {
            EmptyView emptyView5 = this.f5428W;
            if (emptyView5 != null) {
                emptyView5.setVisibility(8);
                EmptyView emptyView6 = this.f5429X;
                if (emptyView6 != null) {
                    emptyView6.setVisibility(0);
                    RecyclerView recyclerView3 = this.f5427V;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(8);
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            } else {
                C12932j.m33820c(str3);
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C11705b bVar = this.f5425T;
        if (bVar != null) {
            C12773a.m33432a(bVar.mo34464b(), this.f5421P);
        } else {
            C12932j.m33820c("adapter");
            throw null;
        }
    }
}
