package app.zenly.locator.support;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.C5724n0.C5730c;
import app.zenly.locator.support.C5724n0.C5733d;
import app.zenly.locator.support.C5932z.C5937b;
import app.zenly.locator.support.model.C5708e;
import app.zenly.locator.support.model.C5712h;
import app.zenly.locator.support.model.C5712h.C5713a;
import app.zenly.locator.support.p168di.C5665b;
import app.zenly.locator.support.p171t0.C5812a;
import app.zenly.locator.support.p194u0.C5917a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import zendesk.support.Section;

/* renamed from: app.zenly.locator.support.w */
public final class C5919w extends ZenlyController {

    /* renamed from: W */
    public static final C5920a f14927W = new C5920a(null);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C5730c f14928P;

    /* renamed from: Q */
    private C5724n0 f14929Q;

    /* renamed from: R */
    private ProgressBar f14930R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C5921b f14931S = new C5921b();

    /* renamed from: T */
    private C5688j0 f14932T;

    /* renamed from: U */
    private final C12275b f14933U = new C12275b();

    /* renamed from: V */
    private final C12275b f14934V = new C12275b();

    /* renamed from: app.zenly.locator.support.w$a */
    public static final class C5920a {
        private C5920a() {
        }

        /* renamed from: a */
        public final C5919w mo13619a(C5730c cVar) {
            C12932j.m33818b(cVar, "category");
            Bundle bundle = new Bundle();
            bundle.putLong("key:categoryId", cVar.mo13415a());
            return new C5919w(bundle);
        }

        public /* synthetic */ C5920a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.w$b */
    private final class C5921b extends C1069g<C5713a> {

        /* renamed from: a */
        private List<? extends C5712h> f14935a = C12848o.m33640a();

        /* renamed from: app.zenly.locator.support.w$b$a */
        static final /* synthetic */ class C5922a extends C12931i implements Function1<C5712h, C12956q> {
            C5922a(C5919w wVar) {
                super(1, wVar);
            }

            /* renamed from: a */
            public final void mo13622a(C5712h hVar) {
                C12932j.m33818b(hVar, "p1");
                ((C5919w) this.f33505f).m16433a(hVar);
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C5919w.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "showSection(Lapp/zenly/locator/support/model/HelpCenterSectionModel;)V";
            }

            public final String getName() {
                return "showSection";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo13622a((C5712h) obj);
                return C12956q.f33541a;
            }
        }

        /* renamed from: app.zenly.locator.support.w$b$b */
        static final class C5923b<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C5923b f14937e = new C5923b();

            C5923b() {
            }

            /* renamed from: a */
            public final C5712h apply(Section section) {
                C12932j.m33818b(section, "section");
                return new C5712h(section);
            }
        }

        public C5921b() {
        }

        /* renamed from: a */
        public void onBindViewHolder(C5713a aVar, int i) {
            C12932j.m33818b(aVar, "holder");
            aVar.mo13378a((C5712h) this.f14935a.get(i));
        }

        public int getItemCount() {
            return this.f14935a.size();
        }

        /* renamed from: a */
        public final void mo13621a(List<? extends Section> list) {
            C12932j.m33818b(list, "sections");
            Object a = C12279e.m32623b((Iterable<? extends T>) list).mo36501i(C5923b.f14937e).mo36511n().mo36540a();
            List<? extends C5712h> list2 = (List) a;
            if (C5919w.this.f14928P == C5730c.TROUBLESHOOTING) {
                int i = 1;
                if (list2.size() <= 1) {
                    i = 0;
                }
                list2.add(i, new C5708e());
            }
            C12932j.m33815a(a, "Observable.fromIterable(…      }\n                }");
            this.f14935a = list2;
            notifyDataSetChanged();
        }

        public C5713a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12932j.m33818b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_support_option_clickable, viewGroup, false);
            C12932j.m33815a((Object) inflate, "view");
            return new C5713a(inflate, new C5930x(new C5922a(C5919w.this)));
        }
    }

    /* renamed from: app.zenly.locator.support.w$c */
    static final class C5924c<T, R> implements Function<C12279e<Throwable>, ObservableSource<?>> {

        /* renamed from: e */
        public static final C5924c f14938e = new C5924c();

        /* renamed from: app.zenly.locator.support.w$c$a */
        static final class C5925a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            public static final C5925a f14939e = new C5925a();

            C5925a() {
            }

            /* renamed from: a */
            public final C12279e<Long> apply(Throwable th) {
                C12932j.m33818b(th, "it");
                return C12279e.m32630h(2, TimeUnit.SECONDS);
            }
        }

        C5924c() {
        }

        /* renamed from: a */
        public final C12279e<Long> apply(C12279e<Throwable> eVar) {
            C12932j.m33818b(eVar, "errors");
            return eVar.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C5925a.f14939e);
        }
    }

    /* renamed from: app.zenly.locator.support.w$d */
    static final class C5926d<T> implements Consumer<List<? extends Section>> {

        /* renamed from: e */
        final /* synthetic */ C5919w f14940e;

        C5926d(C5919w wVar) {
            this.f14940e = wVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends Section> list) {
            C5919w.m16435b(this.f14940e).setVisibility(8);
            C5921b c = this.f14940e.f14931S;
            C12932j.m33815a((Object) list, "sections");
            c.mo13621a(list);
        }
    }

    /* renamed from: app.zenly.locator.support.w$e */
    static final class C5927e<T> implements Consumer<List<? extends C5730c>> {

        /* renamed from: e */
        final /* synthetic */ View f14941e;

        /* renamed from: f */
        final /* synthetic */ C5919w f14942f;

        C5927e(View view, C5919w wVar) {
            this.f14941e = view;
            this.f14942f = wVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends C5730c> list) {
            ((ScreenBar) this.f14941e.findViewById(R.id.screen_bar)).setTitle((CharSequence) this.f14942f.f14928P.mo13420d());
        }
    }

    /* renamed from: app.zenly.locator.support.w$f */
    static final class C5928f<T, R> implements Function<C12279e<Throwable>, ObservableSource<?>> {

        /* renamed from: e */
        public static final C5928f f14943e = new C5928f();

        /* renamed from: app.zenly.locator.support.w$f$a */
        static final class C5929a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            public static final C5929a f14944e = new C5929a();

            C5929a() {
            }

            /* renamed from: a */
            public final C12279e<Long> apply(Throwable th) {
                C12932j.m33818b(th, "it");
                return C12279e.m32630h(2, TimeUnit.SECONDS);
            }
        }

        C5928f() {
        }

        /* renamed from: a */
        public final C12279e<Long> apply(C12279e<Throwable> eVar) {
            C12932j.m33818b(eVar, "errors");
            return eVar.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C5929a.f14944e);
        }
    }

    public C5919w(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        this.f14928P = C5730c.f14549m.mo13421a(bundle.getLong("key:categoryId"));
    }

    /* renamed from: a */
    public static final C5919w m16432a(C5730c cVar) {
        return f14927W.mo13619a(cVar);
    }

    /* renamed from: b */
    public static final /* synthetic */ ProgressBar m16435b(C5919w wVar) {
        ProgressBar progressBar = wVar.f14930R;
        if (progressBar != null) {
            return progressBar;
        }
        C12932j.m33820c("progressBar");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f14934V.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C8819d l = mo23947l();
        if (l != null) {
            C5688j0 B = ((C5659d0) l).mo7192B();
            C12932j.m33815a((Object) B, "(targetController as Sup…Controller).ticketCreator");
            this.f14932T = B;
            C5688j0 j0Var = this.f14932T;
            if (j0Var != null) {
                j0Var.mo13348a(this.f14928P);
                C5724n0 n0Var = this.f14929Q;
                if (n0Var != null) {
                    Disposable d = n0Var.mo13393a(this.f14928P).mo36507l(C5924c.f14938e).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5926d<Object>(this));
                    C12932j.m33815a((Object) d, "zendeskSdk.helpCenterCat…s(sections)\n            }");
                    C12773a.m33432a(d, this.f14933U);
                    return;
                }
                C12932j.m33820c("zendeskSdk");
                throw null;
            }
            C12932j.m33820c("ticketCreator");
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.support.SupportController");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f14933U.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14929Q = C5665b.m15987a(context).mo13329a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_helpcenter_category, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.progress);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.progress)");
        this.f14930R = (ProgressBar) findViewById;
        if (this.f14931S.getItemCount() == 0) {
            ProgressBar progressBar = this.f14930R;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            } else {
                C12932j.m33820c("progressBar");
                throw null;
            }
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.options);
        Resources resources = recyclerView.getResources();
        if (resources != null) {
            recyclerView.mo5045a((C1074l) new C5917a(resources.getDimensionPixelOffset(R.dimen.spacing_200)));
            recyclerView.setAdapter(this.f14931S);
            C5724n0 n0Var = this.f14929Q;
            if (n0Var != null) {
                Disposable d = n0Var.mo13404e().mo36507l(C5928f.f14943e).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5927e<Object>(inflate, this));
                C12932j.m33815a((Object) d, "zendeskSdk.helpCenterCat….title = category.title }");
                C12773a.m33432a(d, this.f14933U);
                C12932j.m33815a((Object) inflate, "inflater.inflate(R.layou…OnDestroyView)\n\n        }");
                return inflate;
            }
            C12932j.m33820c("zendeskSdk");
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16433a(C5712h hVar) {
        C5499a aVar = C5498a.f14119e;
        ProgressBar progressBar = this.f14930R;
        if (progressBar != null) {
            Context context = progressBar.getContext();
            C12932j.m33815a((Object) context, "progressBar.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            if (hVar instanceof C5708e) {
                C5688j0 j0Var = this.f14932T;
                if (j0Var != null) {
                    j0Var.mo13349a(C5733d.PLACES);
                    C8831g k = mo23946k();
                    C5812a aVar2 = new C5812a();
                    aVar2.mo23929b(mo23947l());
                    C8836h a = C8836h.m21058a((C8819d) aVar2);
                    a.mo24024a("My Places");
                    a.mo24026b(new C8816c());
                    a.mo24023a((ControllerChangeHandler) new C8816c());
                    k.mo23991a(a);
                    return;
                }
                C12932j.m33820c("ticketCreator");
                throw null;
            }
            C8831g k2 = mo23946k();
            C5937b bVar = C5932z.f14946U;
            Section a2 = hVar.mo13377a();
            if (a2 != null) {
                C5932z a3 = bVar.mo13634a(a2);
                a3.mo23929b(mo23947l());
                C8836h a4 = C8836h.m21058a((C8819d) a3);
                a4.mo24026b(new C8816c());
                a4.mo24023a((ControllerChangeHandler) new C8816c());
                k2.mo23991a(a4);
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33820c("progressBar");
        throw null;
    }
}
