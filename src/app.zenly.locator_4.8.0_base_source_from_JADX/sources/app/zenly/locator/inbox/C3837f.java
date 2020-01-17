package app.zenly.locator.inbox;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.C3279d;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.sharesheet.ShareSheetController.OnTargetSelectedListener;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior.C6163b;
import com.bluelinelabs.conductor.C8819d;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7156m;
import p213co.znly.models.services.C8334v1;
import p213co.znly.models.services.C8347w1;
import p213co.znly.models.services.C8347w1.C8349b;
import p250f.p251a.p252a.p263b.p264a.p266e.C7702b;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.inbox.f */
public final class C3837f extends C3279d<InboxPresenter> implements InboxTarget, OnTargetSelectedListener {

    /* renamed from: V */
    private final C12275b f10214V = new C12275b();

    /* renamed from: W */
    private final C12275b f10215W = new C12275b();

    /* renamed from: X */
    private NavigationContract f10216X;

    /* renamed from: Y */
    public SearchBar f10217Y;

    /* renamed from: Z */
    public ScreenBarBottomSheetBehavior<View> f10218Z;

    /* renamed from: a0 */
    public RecyclerView f10219a0;

    /* renamed from: b0 */
    private final C7702b f10220b0 = C3844i.f10228b;

    /* renamed from: app.zenly.locator.inbox.f$a */
    static final class C3838a<V> implements Callable<SingleSource<? extends T>> {

        /* renamed from: e */
        final /* synthetic */ Context f10221e;

        C3838a(Context context) {
            this.f10221e = context;
        }

        public final C12291g<InboxPresenter> call() {
            InboxPresenter inboxPresenter = new InboxPresenter();
            return inboxPresenter.mo10410a(this.f10221e).mo36347a((SingleSource<T>) C12291g.m32767b(inboxPresenter));
        }
    }

    /* renamed from: app.zenly.locator.inbox.f$b */
    static final class C3839b<T> implements Consumer<C7156m> {

        /* renamed from: e */
        final /* synthetic */ C3837f f10222e;

        /* renamed from: f */
        final /* synthetic */ String[] f10223f;

        C3839b(C3837f fVar, String[] strArr) {
            this.f10222e = fVar;
            this.f10223f = strArr;
        }

        /* renamed from: a */
        public final void accept(C7156m mVar) {
            String str = "conversationWithError";
            if (mVar.hasError()) {
                C3837f fVar = this.f10222e;
                C12932j.m33815a((Object) mVar, str);
                C8334v1 error = mVar.getError();
                C12932j.m33815a((Object) error, "conversationWithError.error");
                C8347w1 conversationError = error.getConversationError();
                C12932j.m33815a((Object) conversationError, "conversationWithError.error.conversationError");
                C8349b code = conversationError.getCode();
                C12932j.m33815a((Object) code, "conversationWithError.error.conversationError.code");
                fVar.m11352a(code);
                return;
            }
            C5343a.m15160U().mo12811a(this.f10223f.length, false);
            Activity b = this.f10222e.mo23920b();
            if (b != null) {
                C12932j.m33815a((Object) b, "activity!!");
                C1297b.m6236a(b);
                NavigationContract navigation = this.f10222e.getNavigation();
                if (navigation != null) {
                    C12932j.m33815a((Object) mVar, str);
                    navigation.onConversationCreated(mVar.getConversation());
                    return;
                }
                return;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.inbox.f$c */
    static final class C3840c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C3837f f10224e;

        C3840c(C3837f fVar) {
            this.f10224e = fVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f10224e.m11352a(C8349b.UNKNOWN);
        }
    }

    /* renamed from: app.zenly.locator.inbox.f$d */
    public static final class C3841d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3837f f10225e;

        C3841d(C3837f fVar) {
            this.f10225e = fVar;
        }

        public void onClick(View view) {
            this.f10225e.getSearch().clearFocus();
            C5343a.m15160U().mo12908t();
            NavigationContract navigation = this.f10225e.getNavigation();
            if (navigation != null) {
                navigation.onInboxCreateGroup();
            }
        }
    }

    public C3837f(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
    }

    /* renamed from: B */
    public C7702b mo7192B() {
        return this.f10220b0;
    }

    /* renamed from: C */
    public int mo9733C() {
        return R.layout.controller_inbox;
    }

    /* renamed from: b */
    public C12291g<InboxPresenter> mo9740b(Context context) {
        C12932j.m33818b(context, "context");
        C12291g<InboxPresenter> a = C12291g.m32765a((Callable<? extends SingleSource<? extends T>>) new C3838a<Object>(context));
        C12932j.m33815a((Object) a, "Single.defer {\n        v…le.just(presenter))\n    }");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        if (mo9737G()) {
            InboxPresenter inboxPresenter = (InboxPresenter) mo9735E();
            if (inboxPresenter != null) {
                inboxPresenter.mo10037a();
            }
            this.f10214V.mo36401a();
            getBottomSheetBehavior().mo14020e();
        }
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        setNavigation(null);
        this.f10215W.mo36401a();
        super.mo7053d(view);
    }

    /* renamed from: e */
    public void mo7061e(View view) {
        C12932j.m33818b(view, "view");
        View findViewById = view.findViewById(R.id.search_bar);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.search_bar)");
        mo10432a((SearchBar) findViewById);
        C6163b bVar = ScreenBarBottomSheetBehavior.f15476b0;
        ScreenBarLayout screenBarLayout = (ScreenBarLayout) view.findViewById(C3891l.screen_bar_layout);
        C12932j.m33815a((Object) screenBarLayout, "view.screen_bar_layout");
        ScreenBar screenBar = (ScreenBar) view.findViewById(C3891l.screen_bar);
        SearchBar searchBar = (SearchBar) view.findViewById(C3891l.search_bar);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C3891l.inbox_bottom_sheet);
        C12932j.m33815a((Object) constraintLayout, "view.inbox_bottom_sheet");
        mo10433a(C6163b.m17095a(bVar, screenBarLayout, screenBar, searchBar, constraintLayout, false, 16, null));
        getBottomSheetBehavior().mo30687b(false);
        getBottomSheetBehavior().mo30690c(4);
        ((ScreenBar) view.findViewById(C3891l.screen_bar)).setActionClickListener(new C3841d(this));
        View findViewById2 = view.findViewById(R.id.items_list);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.items_list)");
        mo10431a((RecyclerView) findViewById2);
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(mo23920b(), 1, false));
        recyclerView.setHasFixedSize(true);
        view.requestApplyInsets();
    }

    public ScreenBarBottomSheetBehavior<View> getBottomSheetBehavior() {
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f10218Z;
        if (screenBarBottomSheetBehavior != null) {
            return screenBarBottomSheetBehavior;
        }
        C12932j.m33820c("bottomSheetBehavior");
        throw null;
    }

    public NavigationContract getNavigation() {
        return this.f10216X;
    }

    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f10219a0;
        if (recyclerView != null) {
            return recyclerView;
        }
        C12932j.m33820c("recyclerView");
        throw null;
    }

    public SearchBar getSearch() {
        SearchBar searchBar = this.f10217Y;
        if (searchBar != null) {
            return searchBar;
        }
        C12932j.m33820c("search");
        throw null;
    }

    public Activity getTargetActivity() {
        return mo23920b();
    }

    public void onTargetSelected(String[] strArr) {
        C12932j.m33818b(strArr, "userUuids");
        Disposable a = C5448c.m15478a().chatCreateGroup(strArr).mo36428a((C12286f) mo9736F().getMainThread()).mo36412a((Consumer<? super T>) new C3839b<Object>(this, strArr), (Consumer<? super Throwable>) new C3840c<Object>(this));
        C12932j.m33815a((Object) a, "ZenlyCoreProvider.get().….UNKNOWN) }\n            )");
        C12773a.m33432a(a, this.f10215W);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        if (mo9737G()) {
            int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.navigation_padding_bottom);
            ScreenBarBottomSheetBehavior bottomSheetBehavior = getBottomSheetBehavior();
            rect.bottom += dimensionPixelOffset;
            bottomSheetBehavior.mo14018a(rect);
        }
    }

    public void setNavigation(NavigationContract navigationContract) {
        this.f10216X = navigationContract;
    }

    /* renamed from: z */
    public void mo9315z() {
        InboxPresenter inboxPresenter = (InboxPresenter) mo9735E();
        if (inboxPresenter != null) {
            inboxPresenter.mo10412c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        if (mo23947l() instanceof NavigationContract) {
            C8819d l = mo23947l();
            if (l != null) {
                setNavigation((NavigationContract) l);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.contracts.NavigationContract");
        }
    }

    /* renamed from: a */
    public void mo10432a(SearchBar searchBar) {
        C12932j.m33818b(searchBar, "<set-?>");
        this.f10217Y = searchBar;
    }

    /* renamed from: a */
    public void mo10433a(ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior) {
        C12932j.m33818b(screenBarBottomSheetBehavior, "<set-?>");
        this.f10218Z = screenBarBottomSheetBehavior;
    }

    /* renamed from: a */
    public void mo10431a(RecyclerView recyclerView) {
        C12932j.m33818b(recyclerView, "<set-?>");
        this.f10219a0 = recyclerView;
    }

    /* renamed from: a */
    public void mo9738a(Context context, InboxPresenter inboxPresenter) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(inboxPresenter, "presenter");
        inboxPresenter.mo10411a(context, (InboxTarget) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11352a(C8349b bVar) {
        int i = C3836e.f10213a[bVar.ordinal()];
        int i2 = i != 1 ? i != 2 ? R.string.gchat_error_generic : R.string.gchat_error_ratelimit : R.string.gchat_error_version;
        Toast.makeText(mo9304A(), mo9304A().getString(i2), 0).show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        C7707a.m18761b("inbox:onCreateView");
        try {
            return super.mo7054a(layoutInflater, viewGroup);
        } finally {
            C7707a.m18759a();
        }
    }
}
