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
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.C5724n0.C5730c;
import app.zenly.locator.support.C5724n0.C5730c.C5731a;
import app.zenly.locator.support.C5906u.C5907a;
import app.zenly.locator.support.model.C5706d;
import app.zenly.locator.support.model.C5706d.C5707a;
import app.zenly.locator.support.model.C5710g;
import app.zenly.locator.support.model.C5710g.C5711a;
import app.zenly.locator.support.model.HelpCenterModel;
import app.zenly.locator.support.p168di.C5665b;
import app.zenly.locator.support.p194u0.C5917a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.io.Serializable;
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
import zendesk.support.Article;
import zendesk.support.Section;

/* renamed from: app.zenly.locator.support.z */
public final class C5932z extends ZenlyController {

    /* renamed from: U */
    public static final C5937b f14946U = new C5937b(null);

    /* renamed from: P */
    private final Section f14947P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C5730c f14948Q;

    /* renamed from: R */
    private ProgressBar f14949R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C5933a f14950S;

    /* renamed from: T */
    private final C12275b f14951T;

    /* renamed from: app.zenly.locator.support.z$a */
    private final class C5933a extends C1069g<C1085v> {

        /* renamed from: a */
        private List<? extends HelpCenterModel> f14952a = C12848o.m33640a();

        /* renamed from: app.zenly.locator.support.z$a$a */
        static final class C5934a<T> implements Consumer<C5710g> {

            /* renamed from: e */
            final /* synthetic */ C5933a f14954e;

            C5934a(C5933a aVar) {
                this.f14954e = aVar;
            }

            /* renamed from: a */
            public final void accept(C5710g gVar) {
                C5932z.this.m16455B();
            }
        }

        /* renamed from: app.zenly.locator.support.z$a$b */
        static final /* synthetic */ class C5935b extends C12931i implements Function1<C5706d, C12956q> {
            C5935b(C5932z zVar) {
                super(1, zVar);
            }

            /* renamed from: a */
            public final void mo13632a(C5706d dVar) {
                C12932j.m33818b(dVar, "p1");
                ((C5932z) this.f33505f).m16457a(dVar);
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C5932z.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "showArticle(Lapp/zenly/locator/support/model/HelpCenterArticleModel;)V";
            }

            public final String getName() {
                return "showArticle";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo13632a((C5706d) obj);
                return C12956q.f33541a;
            }
        }

        /* renamed from: app.zenly.locator.support.z$a$c */
        static final class C5936c<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C5936c f14955e = new C5936c();

            C5936c() {
            }

            /* renamed from: a */
            public final HelpCenterModel apply(Article article) {
                C12932j.m33818b(article, "article");
                return new C5706d(article);
            }
        }

        public C5933a() {
        }

        /* renamed from: a */
        public final void mo13630a(List<? extends Article> list) {
            C12932j.m33818b(list, "articles");
            Object a = C12279e.m32623b((Iterable<? extends T>) list).mo36501i(C5936c.f14955e).mo36511n().mo36540a();
            List<? extends HelpCenterModel> list2 = (List) a;
            list2.add(new C5710g(C5932z.this.f14948Q));
            C12932j.m33815a(a, "Observable.fromIterable(…egory))\n                }");
            this.f14952a = list2;
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f14952a.size();
        }

        public int getItemViewType(int i) {
            return ((HelpCenterModel) this.f14952a.get(i)) instanceof C5710g ? R.layout.item_support_option_submittable : R.layout.item_support_option_clickable;
        }

        public void onBindViewHolder(C1085v vVar, int i) {
            C12932j.m33818b(vVar, "holder");
            HelpCenterModel helpCenterModel = (HelpCenterModel) this.f14952a.get(i);
            if (helpCenterModel instanceof C5710g) {
                ((C5711a) vVar).mo13376a((C5710g) helpCenterModel);
            } else if (helpCenterModel instanceof C5706d) {
                ((C5707a) vVar).mo13374a((C5706d) helpCenterModel);
            } else {
                throw new IllegalArgumentException("viewType is unknown");
            }
        }

        public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12932j.m33818b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
            String str = "view";
            if (i != R.layout.item_support_option_submittable) {
                C12932j.m33815a((Object) inflate, str);
                return new C5707a(inflate, new C5645a0(new C5935b(C5932z.this)));
            }
            C12932j.m33815a((Object) inflate, str);
            return new C5711a(inflate, new C5934a(this));
        }
    }

    /* renamed from: app.zenly.locator.support.z$b */
    public static final class C5937b {
        private C5937b() {
        }

        /* renamed from: a */
        public final C5932z mo13634a(Section section) {
            C12932j.m33818b(section, "section");
            Bundle bundle = new Bundle();
            bundle.putSerializable("key:section", section);
            return new C5932z(bundle);
        }

        public /* synthetic */ C5937b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.z$c */
    static final class C5938c<T, R> implements Function<C12279e<Throwable>, ObservableSource<?>> {

        /* renamed from: e */
        public static final C5938c f14956e = new C5938c();

        /* renamed from: app.zenly.locator.support.z$c$a */
        static final class C5939a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            public static final C5939a f14957e = new C5939a();

            C5939a() {
            }

            /* renamed from: a */
            public final C12279e<Long> apply(Throwable th) {
                C12932j.m33818b(th, "it");
                return C12279e.m32630h(2, TimeUnit.SECONDS);
            }
        }

        C5938c() {
        }

        /* renamed from: a */
        public final C12279e<Long> apply(C12279e<Throwable> eVar) {
            C12932j.m33818b(eVar, "errors");
            return eVar.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C5939a.f14957e);
        }
    }

    /* renamed from: app.zenly.locator.support.z$d */
    static final class C5940d<T> implements Consumer<List<? extends Article>> {

        /* renamed from: e */
        final /* synthetic */ C5932z f14958e;

        C5940d(C5932z zVar) {
            this.f14958e = zVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends Article> list) {
            C5932z.m16460c(this.f14958e).setVisibility(8);
            C5933a a = this.f14958e.f14950S;
            C12932j.m33815a((Object) list, "articles");
            a.mo13630a(list);
        }
    }

    public C5932z(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        Serializable serializable = bundle.getSerializable("key:section");
        if (serializable != null) {
            this.f14947P = (Section) serializable;
            C5731a aVar = C5730c.f14549m;
            Long categoryId = this.f14947P.getCategoryId();
            if (categoryId != null) {
                C12932j.m33815a((Object) categoryId, "section.categoryId!!");
                this.f14948Q = aVar.mo13421a(categoryId.longValue());
                this.f14950S = new C5933a();
                this.f14951T = new C12275b();
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type zendesk.support.Section");
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m16455B() {
        C5499a aVar = C5498a.f14119e;
        ProgressBar progressBar = this.f14949R;
        if (progressBar != null) {
            Context context = progressBar.getContext();
            C12932j.m33815a((Object) context, "progressBar.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C5690k0 k0Var = new C5690k0();
            k0Var.mo23929b(mo23947l());
            C8831g k = mo23946k();
            C8836h a = C8836h.m21058a((C8819d) k0Var);
            a.mo24026b(new C8816c());
            a.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo23991a(a);
            return;
        }
        C12932j.m33820c("progressBar");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ ProgressBar m16460c(C5932z zVar) {
        ProgressBar progressBar = zVar.f14949R;
        if (progressBar != null) {
            return progressBar;
        }
        C12932j.m33820c("progressBar");
        throw null;
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
        if (!(l instanceof C5659d0)) {
            l = null;
        }
        C5659d0 d0Var = (C5659d0) l;
        if (d0Var != null) {
            C5688j0 B = d0Var.mo7192B();
            if (B != null) {
                B.mo13353a(this.f14947P);
            }
        }
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "view.context");
        C5724n0 a = C5665b.m15987a(context).mo13329a();
        Long id = this.f14947P.getId();
        if (id != null) {
            C12932j.m33815a((Object) id, "section.id!!");
            Disposable d = a.mo13405e(id.longValue()).mo36507l(C5938c.f14956e).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5940d<Object>(this));
            C12932j.m33815a((Object) d, "zendeskSdk.helpCenterSec…s(articles)\n            }");
            C12773a.m33432a(d, this.f14951T);
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f14951T.mo36401a();
        super.mo7053d(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_helpcenter_section, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.progress);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.progress)");
        this.f14949R = (ProgressBar) findViewById;
        if (this.f14950S.getItemCount() == 0) {
            ProgressBar progressBar = this.f14949R;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            } else {
                C12932j.m33820c("progressBar");
                throw null;
            }
        }
        ((ScreenBar) inflate.findViewById(R.id.screen_bar)).setTitle((CharSequence) this.f14947P.getName());
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.options);
        Resources resources = recyclerView.getResources();
        if (resources != null) {
            recyclerView.mo5045a((C1074l) new C5917a(resources.getDimensionPixelOffset(R.dimen.spacing_200)));
            recyclerView.setAdapter(this.f14950S);
            C12932j.m33815a((Object) inflate, "inflater.inflate(R.layou…r\n            }\n        }");
            return inflate;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16457a(C5706d dVar) {
        C5499a aVar = C5498a.f14119e;
        ProgressBar progressBar = this.f14949R;
        if (progressBar != null) {
            Context context = progressBar.getContext();
            C12932j.m33815a((Object) context, "progressBar.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C5907a aVar2 = C5906u.f14910Y;
            Article a = dVar.mo13373a();
            Long categoryId = this.f14947P.getCategoryId();
            if (categoryId != null) {
                C12932j.m33815a((Object) categoryId, "section.categoryId!!");
                C5906u a2 = aVar2.mo13611a(a, categoryId.longValue());
                a2.mo23929b(mo23947l());
                C8831g k = mo23946k();
                C8836h a3 = C8836h.m21058a((C8819d) a2);
                a3.mo24026b(new C8816c());
                a3.mo24023a((ControllerChangeHandler) new C8816c());
                k.mo23991a(a3);
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33820c("progressBar");
        throw null;
    }
}
