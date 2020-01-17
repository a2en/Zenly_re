package app.zenly.android.feature.descendants;

import app.zenly.android.feature.descendants.Contract.Presenter;
import app.zenly.android.feature.descendants.Contract.View;
import app.zenly.android.feature.descendants.model.C1391b;
import app.zenly.android.feature.descendants.model.Descendant;
import app.zenly.android.feature.descendants.recycler.C1406a;
import app.zenly.android.feature.descendants.repository.DescendantsRepository;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.android.feature.descendants.e */
public final class C1372e implements Presenter {

    /* renamed from: a */
    private final C1406a<C1391b> f5021a = new C1406a<>("invite", 2, C1391b.f5042a);

    /* renamed from: b */
    private Disposable f5022b;

    /* renamed from: c */
    private final DescendantsRepository f5023c;

    /* renamed from: d */
    private final View f5024d;

    /* renamed from: e */
    private final int f5025e;

    /* renamed from: f */
    private final long f5026f;

    /* renamed from: app.zenly.android.feature.descendants.e$a */
    static final class C1373a<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C1373a f5027e = new C1373a();

        C1373a() {
        }

        /* renamed from: a */
        public final List<Descendant> mo6624a(List<? extends Descendant> list) {
            C12932j.m33818b(list, "x");
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo6624a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.e$b */
    static final class C1374b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1374b f5028e = new C1374b();

        C1374b() {
        }

        /* renamed from: a */
        public final C1406a<Object> apply(Descendant descendant) {
            C12932j.m33818b(descendant, "it");
            return new C1406a<>(descendant.getId(), 1, descendant);
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.e$c */
    static final /* synthetic */ class C1375c extends C12931i implements Function1<List<C1406a<? extends Object>>, List<C1406a<? extends Object>>> {
        C1375c(C1372e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final List<C1406a<Object>> mo6626a(List<C1406a<Object>> list) {
            C12932j.m33818b(list, "p1");
            ((C1372e) this.f33505f).m6407a(list);
            return list;
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1372e.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "addExtraItemModels(Ljava/util/List;)Ljava/util/List;";
        }

        public final String getName() {
            return "addExtraItemModels";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            mo6626a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.e$d */
    static final /* synthetic */ class C1376d extends C12931i implements Function1<List<? extends C1406a<? extends Object>>, C12956q> {
        C1376d(View view) {
            super(1, view);
        }

        /* renamed from: a */
        public final void mo6628a(List<? extends C1406a<? extends Object>> list) {
            C12932j.m33818b(list, "p1");
            ((View) this.f33505f).onSuccessShowDataScreen(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(View.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onSuccessShowDataScreen(Ljava/util/List;)V";
        }

        public final String getName() {
            return "onSuccessShowDataScreen";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo6628a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.e$e */
    static final /* synthetic */ class C1377e extends C12931i implements Function1<Throwable, C12956q> {
        C1377e(View view) {
            super(1, view);
        }

        /* renamed from: a */
        public final void mo6629a(Throwable th) {
            C12932j.m33818b(th, "p1");
            ((View) this.f33505f).onErrorShowErrorScreen(th);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(View.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onErrorShowErrorScreen(Ljava/lang/Throwable;)V";
        }

        public final String getName() {
            return "onErrorShowErrorScreen";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo6629a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    public C1372e(DescendantsRepository descendantsRepository, View view, int i, long j) {
        C12932j.m33818b(descendantsRepository, "descendantsRepository");
        C12932j.m33818b(view, "view");
        this.f5023c = descendantsRepository;
        this.f5024d = view;
        this.f5025e = i;
        this.f5026f = j;
    }

    public void start() {
        this.f5022b = this.f5023c.getCurrentUserDescendants(this.f5026f).mo36553e().mo36456b((Function<? super T, ? extends Iterable<? extends U>>) C1373a.f5027e).mo36501i(C1374b.f5028e).mo36511n().mo36552d((Function<? super T, ? extends R>) new C1371d<Object,Object>(new C1375c(this))).mo36535a(C12295a.m32802a()).mo36533a((Consumer<? super T>) new C1370c<Object>(new C1376d(this.f5024d)), (Consumer<? super Throwable>) new C1370c<Object>(new C1377e(this.f5024d)));
    }

    public void stop() {
        Disposable disposable = this.f5022b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C1406a<Object>> m6407a(List<C1406a<Object>> list) {
        int a = m6405a(list.size());
        if (a > 0) {
            list.add(new C1406a("oldPops", 3, Integer.valueOf(a)));
        }
        list.add(this.f5021a);
        return list;
    }

    /* renamed from: a */
    private final int m6405a(int i) {
        return this.f5025e - i;
    }
}
