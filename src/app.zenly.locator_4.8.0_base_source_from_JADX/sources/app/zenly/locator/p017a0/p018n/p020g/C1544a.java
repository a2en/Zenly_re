package app.zenly.locator.p017a0.p018n.p020g;

import android.view.View;
import app.zenly.locator.p017a0.p018n.C1534c;
import app.zenly.locator.p017a0.p018n.C1538e;
import app.zenly.locator.p017a0.p018n.p022i.C1551a;
import app.zenly.locator.p017a0.p018n.p022i.C1552b;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.a0.n.g.a */
public final class C1544a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f5455f = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Comparator<UserProto$User> f5456g;

    /* renamed from: h */
    private final C1534c f5457h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C12785a<C1538e> f5458i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12279e<Boolean> f5459j;

    /* renamed from: app.zenly.locator.a0.n.g.a$a */
    static final class C1545a<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1544a f5460e;

        C1545a(C1544a aVar) {
            this.f5460e = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f5460e.f5458i.onNext(C1538e.ERROR);
        }
    }

    /* renamed from: app.zenly.locator.a0.n.g.a$b */
    static final class C1546b<T, R> implements Function<C12279e<Throwable>, ObservableSource<?>> {

        /* renamed from: e */
        final /* synthetic */ C1544a f5461e;

        C1546b(C1544a aVar) {
            this.f5461e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Boolean> apply(C12279e<Throwable> eVar) {
            C12932j.m33818b(eVar, "it");
            return this.f5461e.f5459j;
        }
    }

    /* renamed from: app.zenly.locator.a0.n.g.a$c */
    static final class C1547c<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C1544a f5462e;

        C1547c(C1544a aVar) {
            this.f5462e = aVar;
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(List<UserProto$User> list) {
            C12932j.m33818b(list, "users");
            this.f5462e.f5458i.onNext(list.isEmpty() ? C1538e.EMPTY : C1538e.DATA);
            C7712e eVar = C7712e.f19340a;
            List<UserProto$User> a = C12857w.m33665a((Iterable) list, this.f5462e.f5456g);
            ArrayList arrayList = new ArrayList(C12850p.m33647a(a, 10));
            for (UserProto$User userProto$User : a) {
                arrayList.add(new C1552b(this.f5462e.f5455f.mo35844a(userProto$User.getUuid()), userProto$User));
            }
            return eVar.mo19922a((List<? extends C11722a>) arrayList, (C11722a) new C1551a(list.size()));
        }
    }

    public C1544a(Comparator<UserProto$User> comparator, C1534c cVar, C12785a<C1538e> aVar, C12279e<Boolean> eVar) {
        C12932j.m33818b(comparator, "userComparator");
        C12932j.m33818b(cVar, "viewModel");
        C12932j.m33818b(aVar, "stateObservable");
        C12932j.m33818b(eVar, "retryObservable");
        this.f5456g = comparator;
        this.f5457h = cVar;
        this.f5458i = aVar;
        this.f5459j = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> i = this.f5457h.mo7070a().mo36432a((Consumer<? super Throwable>) new C1545a<Object>(this)).mo36507l(new C1546b(this)).mo36501i(new C1547c(this));
        C12932j.m33815a((Object) i, "viewModel.blockedUsers()…          )\n            }");
        return i;
    }

    public void onViewBound(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "model");
    }

    public void onViewRecycled(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "viewModel");
    }
}
