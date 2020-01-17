package app.zenly.android.feature.descendants;

import app.zenly.android.feature.descendants.Contract.Presenter;
import app.zenly.android.feature.descendants.Contract.View;
import app.zenly.android.feature.descendants.model.C1391b;
import app.zenly.android.feature.descendants.model.RankedDescendant;
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

/* renamed from: app.zenly.android.feature.descendants.q */
public final class C1395q implements Presenter {

    /* renamed from: a */
    private final C1406a<C1391b> f5045a = new C1406a<>("invite", 2, C1391b.f5042a);

    /* renamed from: b */
    private Disposable f5046b;

    /* renamed from: c */
    private final DescendantsRepository f5047c;

    /* renamed from: d */
    private final View f5048d;

    /* renamed from: e */
    private final String f5049e;

    /* renamed from: app.zenly.android.feature.descendants.q$a */
    static final class C1396a<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C1396a f5050e = new C1396a();

        C1396a() {
        }

        /* renamed from: a */
        public final List<RankedDescendant> mo6656a(List<? extends RankedDescendant> list) {
            C12932j.m33818b(list, "x");
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo6656a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.q$b */
    static final /* synthetic */ class C1397b extends C12931i implements Function1<RankedDescendant, C1406a<? extends Object>> {
        C1397b(C1395q qVar) {
            super(1, qVar);
        }

        /* renamed from: a */
        public final C1406a<Object> invoke(RankedDescendant rankedDescendant) {
            C12932j.m33818b(rankedDescendant, "p1");
            return ((C1395q) this.f33505f).m6437a(rankedDescendant);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1395q.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "buildItemModel(Lapp/zenly/android/feature/descendants/model/RankedDescendant;)Lapp/zenly/android/feature/descendants/recycler/ItemModel;";
        }

        public final String getName() {
            return "buildItemModel";
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.q$c */
    static final /* synthetic */ class C1398c extends C12931i implements Function1<List<C1406a<? extends Object>>, List<C1406a<? extends Object>>> {
        C1398c(C1395q qVar) {
            super(1, qVar);
        }

        /* renamed from: a */
        public final List<C1406a<Object>> mo6658a(List<C1406a<Object>> list) {
            C12932j.m33818b(list, "p1");
            ((C1395q) this.f33505f).m6440a(list);
            return list;
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1395q.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "addInviteItemModel(Ljava/util/List;)Ljava/util/List;";
        }

        public final String getName() {
            return "addInviteItemModel";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            mo6658a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.q$d */
    static final /* synthetic */ class C1399d extends C12931i implements Function1<List<? extends C1406a<? extends Object>>, C12956q> {
        C1399d(View view) {
            super(1, view);
        }

        /* renamed from: a */
        public final void mo6659a(List<? extends C1406a<? extends Object>> list) {
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
            mo6659a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.android.feature.descendants.q$e */
    static final /* synthetic */ class C1400e extends C12931i implements Function1<Throwable, C12956q> {
        C1400e(View view) {
            super(1, view);
        }

        /* renamed from: a */
        public final void mo6660a(Throwable th) {
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
            mo6660a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    public C1395q(DescendantsRepository descendantsRepository, View view, String str) {
        C12932j.m33818b(descendantsRepository, "descendantsRepository");
        C12932j.m33818b(view, "view");
        C12932j.m33818b(str, "targetUuid");
        this.f5047c = descendantsRepository;
        this.f5048d = view;
        this.f5049e = str;
    }

    public void start() {
        this.f5046b = this.f5047c.getFullLeaderBoard().mo36553e().mo36456b((Function<? super T, ? extends Iterable<? extends U>>) C1396a.f5050e).mo36501i(new C1394p(new C1397b(this))).mo36511n().mo36552d((Function<? super T, ? extends R>) new C1394p<Object,Object>(new C1398c(this))).mo36535a(C12295a.m32802a()).mo36533a((Consumer<? super T>) new C1393o<Object>(new C1399d(this.f5048d)), (Consumer<? super Throwable>) new C1393o<Object>(new C1400e(this.f5048d)));
    }

    public void stop() {
        Disposable disposable = this.f5046b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C1406a<Object>> m6440a(List<C1406a<Object>> list) {
        list.add(this.f5045a);
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1406a<Object> m6437a(RankedDescendant rankedDescendant) {
        if (C12932j.m33817a((Object) rankedDescendant.getId(), (Object) this.f5049e)) {
            return new C1406a<>(rankedDescendant.getId(), 5, rankedDescendant);
        }
        return new C1406a<>(rankedDescendant.getId(), 4, rankedDescendant);
    }
}
