package app.zenly.locator.dashboard.p074a0;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.android.feature.polenta.widget.SearchBar.OnCloseListener;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.p017a0.p041t.C1684a;
import app.zenly.locator.p143s.C5343a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12774b;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.dashboard.a0.a */
public final class C3294a {

    /* renamed from: a */
    private final C12785a<Boolean> f9172a;

    /* renamed from: b */
    private final OnFocusChangeListener f9173b = new C3296b(this);

    /* renamed from: c */
    private final SearchBar f9174c;

    /* renamed from: d */
    private final BottomSheetBehavior<View> f9175d;

    /* renamed from: app.zenly.locator.dashboard.a0.a$a */
    public static final class C3295a implements OnCloseListener {

        /* renamed from: a */
        final /* synthetic */ C3294a f9176a;

        C3295a(C3294a aVar) {
            this.f9176a = aVar;
        }

        public void onClose() {
            this.f9176a.mo9785d();
            C5343a.m15160U().mo12904p();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.a0.a$b */
    static final class C3296b implements OnFocusChangeListener {

        /* renamed from: e */
        final /* synthetic */ C3294a f9177e;

        C3296b(C3294a aVar) {
            this.f9177e = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f9177e.m10432e();
            } else {
                this.f9177e.mo9785d();
            }
        }
    }

    /* renamed from: app.zenly.locator.dashboard.a0.a$c */
    public static final class C3297c<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            Boolean bool = (Boolean) t2;
            String str = (String) t1;
            C12932j.m33815a((Object) bool, "activated");
            boolean booleanValue = bool.booleanValue();
            C12932j.m33815a((Object) str, "query");
            return new C3318o(booleanValue, str);
        }
    }

    /* renamed from: app.zenly.locator.dashboard.a0.a$d */
    static final class C3298d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3298d f9178e = new C3298d();

        C3298d() {
        }

        /* renamed from: a */
        public final String apply(CharSequence charSequence) {
            C12932j.m33818b(charSequence, "it");
            return charSequence.toString();
        }
    }

    public C3294a(SearchBar searchBar, BottomSheetBehavior<View> bottomSheetBehavior) {
        C12932j.m33818b(searchBar, "searchBar");
        C12932j.m33818b(bottomSheetBehavior, "bottomSheetBehavior");
        this.f9174c = searchBar;
        this.f9175d = bottomSheetBehavior;
        C12785a<Boolean> h = C12785a.m33446h(Boolean.valueOf(false));
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(false)");
        this.f9172a = h;
        this.f9174c.setCloseListener(new C3295a(this));
        this.f9174c.mo6899a(this.f9173b);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m10432e() {
        this.f9172a.onNext(Boolean.valueOf(true));
        C5343a.m15160U().mo12905q();
        if (this.f9175d.mo30689c() != 5) {
            this.f9175d.mo30690c(3);
        }
    }

    /* renamed from: b */
    public final void mo9783b() {
        this.f9174c.mo6901b(this.f9173b);
    }

    /* renamed from: c */
    public final C12279e<C3318o> mo9784c() {
        C12279e i = C1684a.m7016a(this.f9174c).mo36501i(C3298d.f9178e);
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) i, "queryObservable");
        C12279e<C3318o> a = C12279e.m32610a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) this.f9172a, (BiFunction<? super T1, ? super T2, ? extends R>) new C3297c<Object,Object,Object>());
        C12932j.m33815a((Object) a, "Observables.combineLates…tivated, query)\n        }");
        return a;
    }

    /* renamed from: d */
    public final void mo9785d() {
        this.f9172a.onNext(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo9782a() {
        this.f9174c.clearFocus();
    }
}
