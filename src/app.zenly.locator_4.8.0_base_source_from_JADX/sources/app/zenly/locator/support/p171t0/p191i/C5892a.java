package app.zenly.locator.support.p171t0.p191i;

import android.view.View;
import app.zenly.locator.support.p171t0.C5815b;
import app.zenly.locator.support.p171t0.p190h.C5890a;
import app.zenly.locator.support.p171t0.p193k.C5903a;
import app.zenly.locator.support.p171t0.p193k.C5904b;
import app.zenly.locator.support.p171t0.p193k.C5905c;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.support.t0.i.a */
public final class C5892a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f14883f = new C12119a();

    /* renamed from: g */
    private final C5815b f14884g;

    /* renamed from: h */
    private final C12279e<Boolean> f14885h;

    /* renamed from: app.zenly.locator.support.t0.i.a$a */
    public static final class C5893a<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C5892a f14886a;

        public C5893a(C5892a aVar) {
            this.f14886a = aVar;
        }

        public final R apply(T1 t1, T2 t2) {
            boolean booleanValue = ((Boolean) t2).booleanValue();
            List list = (List) t1;
            ArrayList<C5890a> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((C5890a) next).mo13588d() || booleanValue) {
                    arrayList.add(next);
                }
            }
            List arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
            for (C5890a aVar : arrayList) {
                arrayList2.add(new C5905c(this.f14886a.f14883f.mo35844a(String.valueOf(aVar.mo13587c().mo9014a())), aVar));
            }
            int size = list.size() - arrayList2.size();
            if (size > 0) {
                arrayList2 = C12857w.m33666a((Collection) arrayList2, (Object) new C5904b(1, size));
            }
            return C11751f.m30860a(C11751f.m30861a(new C5903a(1)), C11751f.m30863b(arrayList2));
        }
    }

    public C5892a(C5815b bVar, C12279e<Boolean> eVar) {
        C12932j.m33818b(bVar, "repository");
        C12932j.m33818b(eVar, "moreButtonObservable");
        this.f14884g = bVar;
        this.f14885h = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) this.f14884g.mo13496b(), (ObservableSource<? extends T2>) this.f14885h, (BiFunction<? super T1, ? super T2, ? extends R>) new C5893a<Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…s\n            )\n        }");
        return a;
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
