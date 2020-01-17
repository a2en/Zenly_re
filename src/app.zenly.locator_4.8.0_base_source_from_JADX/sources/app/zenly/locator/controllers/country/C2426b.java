package app.zenly.locator.controllers.country;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.controllers.country.p064e.C2432a;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3221j;
import app.zenly.locator.p017a0.p041t.C1684a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.models.core.C7123i2;
import p213co.znly.models.core.C7123i2.C7124a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7715b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7716c;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.controllers.country.b */
public final class C2426b extends ZenlyController {

    /* renamed from: W */
    private static final String f7295W = f7295W;

    /* renamed from: X */
    private static final String f7296X = f7296X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static final String f7297Y = f7297Y;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public OnCountryPickedListener f7298P;

    /* renamed from: Q */
    private ScreenBarLayout f7299Q;

    /* renamed from: R */
    private SearchBar f7300R;

    /* renamed from: S */
    private RecyclerView f7301S;

    /* renamed from: T */
    private C11705b f7302T;

    /* renamed from: U */
    private final C12275b f7303U;

    /* renamed from: V */
    private final C12275b f7304V;

    /* renamed from: app.zenly.locator.controllers.country.b$a */
    public static final class C2427a {
        private C2427a() {
        }

        public /* synthetic */ C2427a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.controllers.country.b$b */
    public final class C2428b {

        /* renamed from: a */
        private final Context f7305a;

        /* renamed from: b */
        final /* synthetic */ C2426b f7306b;

        public C2428b(C2426b bVar, Context context) {
            C12932j.m33818b(context, "context");
            this.f7306b = bVar;
            this.f7305a = context;
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onCountryClicked(C2425a aVar) {
            C12932j.m33818b(aVar, "event");
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f7305a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C7124a newBuilder = C7123i2.newBuilder();
            newBuilder.mo19123a(aVar.mo8390a().mo8406h());
            newBuilder.mo19122a(aVar.mo8390a().mo8404f());
            OnCountryPickedListener a = this.f7306b.f7298P;
            if (a != null) {
                GeneratedMessageLite build = newBuilder.build();
                C12932j.m33815a((Object) build, "phoneRegion.build()");
                a.onPhoneRegionSelected((C7123i2) build, this.f7306b.mo23933c().getInt(C2426b.f7297Y));
            }
            this.f7306b.mo23946k().mo23997a((C8819d) this.f7306b);
        }
    }

    /* renamed from: app.zenly.locator.controllers.country.b$c */
    static final class C2429c<T> implements Predicate<List<C7123i2>> {

        /* renamed from: e */
        public static final C2429c f7307e = new C2429c();

        C2429c() {
        }

        /* renamed from: a */
        public final boolean test(List<C7123i2> list) {
            C12932j.m33818b(list, "regions");
            return list.size() > 0;
        }
    }

    static {
        new C2427a(null);
    }

    public C2426b(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        this.f7303U = new C12275b();
        this.f7304V = new C12275b();
    }

    public C2426b(String str) {
        this(str, 0, 0, 6, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C8819d l = mo23947l();
        if (!(l instanceof OnCountryPickedListener)) {
            l = null;
        }
        this.f7298P = (OnCountryPickedListener) l;
        C11705b bVar = this.f7302T;
        if (bVar != null) {
            C12773a.m33432a(bVar.mo34464b(), this.f7303U);
        } else {
            C12932j.m33820c("adapter");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f7303U.mo36401a();
        SearchBar searchBar = this.f7300R;
        if (searchBar != null) {
            C1297b.m6240a(searchBar, false, 2, null);
            this.f7298P = null;
            super.mo7053d(view);
            return;
        }
        C12932j.m33820c("searchBar");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ScreenBarLayout screenBarLayout = this.f7299Q;
        String str = "screenBarLayout";
        if (screenBarLayout != null) {
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            if (screenBarLayout != null) {
                screenBarLayout.setPadding(i, i2, i3, screenBarLayout.getPaddingBottom());
                RecyclerView recyclerView = this.f7301S;
                String str2 = "recyclerView";
                if (recyclerView != null) {
                    int i4 = rect.left;
                    if (recyclerView != null) {
                        recyclerView.setPadding(i4, recyclerView.getPaddingTop(), rect.right, rect.bottom);
                    } else {
                        C12932j.m33820c(str2);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str2);
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
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        int i = mo23933c().getInt(f7296X);
        if (C7674a.m18692a(i)) {
            layoutInflater = layoutInflater.cloneInContext(new ContextThemeWrapper(mo23920b(), i));
        }
        View inflate = layoutInflater.inflate(R.layout.controller_country, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        ScreenBarLayout screenBarLayout = (ScreenBarLayout) inflate.findViewById(C3891l.screen_bar_layout);
        C12932j.m33815a((Object) screenBarLayout, "view.screen_bar_layout");
        this.f7299Q = screenBarLayout;
        SearchBar searchBar = (SearchBar) inflate.findViewById(C3891l.search_bar);
        C12932j.m33815a((Object) searchBar, "view.search_bar");
        this.f7300R = searchBar;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C3891l.recycler_view);
        C12932j.m33815a((Object) recyclerView, "view.recycler_view");
        this.f7301S = recyclerView;
        Context context = inflate.getContext();
        C12932j.m33815a((Object) context, "view.context");
        this.f7302T = m8506b(context);
        RecyclerView recyclerView2 = this.f7301S;
        String str = "recyclerView";
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator(null);
            RecyclerView recyclerView3 = this.f7301S;
            if (recyclerView3 != null) {
                C11705b bVar = this.f7302T;
                if (bVar != null) {
                    recyclerView3.setAdapter(bVar);
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

    public /* synthetic */ C2426b(String str, int i, int i2, int i3, C12928f fVar) {
        if ((i3 & 2) != 0) {
            i = C7674a.f19294a;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        this(str, i, i2);
    }

    /* renamed from: b */
    private final C11705b m8506b(Context context) {
        String str;
        if (mo23933c().containsKey(f7295W)) {
            str = mo23933c().getString(f7295W);
        } else {
            str = C3221j.m10213a(context);
        }
        C12279e b = C5448c.m15478a().phoneNumberSupportedRegions().mo36418a(100, TimeUnit.MILLISECONDS).mo36459b((Predicate<? super T>) C2429c.f7307e);
        C12932j.m33815a((Object) b, "ZenlyCoreProvider.get().…ons -> regions.size > 0 }");
        C12279e e = C12279e.m32626e(str);
        C12932j.m33815a((Object) e, "Observable.just(selectedCountry)");
        SearchBar searchBar = this.f7300R;
        if (searchBar != null) {
            C2432a aVar = new C2432a(context, b, e, C1684a.m7016a(searchBar));
            C11727c cVar = new C11727c(C12848o.m33643b((Object[]) new Class[]{C7716c.class, C2431d.class}));
            ZenlySchedulers a = C1351e.m6372a(C2430c.f7308b.mo19916a("adapter"));
            C11700c cVar2 = new C11700c();
            Disposable b2 = cVar2.mo34449b(new C2428b(this, context));
            C12932j.m33815a((Object) b2, "bus.subscribe(eventDispatcher)");
            C12773a.m33432a(b2, this.f7304V);
            EventDispatcher a2 = cVar2.mo34447a();
            C12932j.m33815a((Object) a2, "bus.eventDispatcher");
            EventDispatcher eventDispatcher = a2;
            C11705b bVar = new C11705b(cVar, eventDispatcher, a.getComputation(), a.getMainThread(), C12848o.m33643b((Object[]) new ObservableSectionController[]{new C7715b(), aVar}), null, 32, null);
            return bVar;
        }
        C12932j.m33820c("searchBar");
        throw null;
    }

    public C2426b(String str, int i, int i2) {
        C12932j.m33818b(str, "defaultCountryCode");
        Bundle bundle = new Bundle();
        bundle.putString(f7295W, str);
        bundle.putInt(f7296X, i);
        bundle.putInt(f7297Y, i2);
        this(bundle);
    }
}
