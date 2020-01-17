package app.zenly.locator.support.p171t0.p173g.p175i.p178e.p181f;

import android.content.Context;
import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.support.p171t0.C5815b;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p180e.C5868a;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p183h.C5876a;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p183h.C5877b;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p183h.C5878c;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;

/* renamed from: app.zenly.locator.support.t0.g.i.e.f.a */
public final class C5869a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f14847f = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f14848g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5815b f14849h;

    /* renamed from: i */
    private final C12279e<String> f14850i;

    /* renamed from: app.zenly.locator.support.t0.g.i.e.f.a$a */
    static final class C5870a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5869a f14851e;

        /* renamed from: app.zenly.locator.support.t0.g.i.e.f.a$a$a */
        static final class C5871a<T, R> implements Function<T, R> {

            /* renamed from: e */
            final /* synthetic */ C5870a f14852e;

            C5871a(C5870a aVar) {
                this.f14852e = aVar;
            }

            /* renamed from: a */
            public final Seekable<C11722a> apply(List<C5868a> list) {
                C12932j.m33818b(list, "it");
                if (list.isEmpty()) {
                    return C11751f.m30861a(new C5876a(R.string.support_places_picker_empty));
                }
                Seekable a = C11751f.m30861a(new C5877b(1, R.string.support_places_picker_subtitle));
                ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
                for (C5868a aVar : list) {
                    arrayList.add(new C5878c(this.f14852e.f14851e.f14847f.mo35844a(aVar.toString()), aVar));
                }
                return C11751f.m30860a(a, C11751f.m30863b(arrayList));
            }
        }

        C5870a(C5869a aVar) {
            this.f14851e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(String str) {
            C12932j.m33818b(str, "query");
            if (str.length() == 0) {
                return C12279e.m32626e(C11751f.m30859a());
            }
            return this.f14851e.f14849h.mo13495a(this.f14851e.f14848g, str).mo36477d().mo36501i(new C5871a(this));
        }
    }

    public C5869a(Context context, C5815b bVar, C12279e<String> eVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(bVar, "repository");
        C12932j.m33818b(eVar, "queryObservable");
        this.f14848g = context;
        this.f14849h = bVar;
        this.f14850i = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> m = this.f14850i.mo36492f(500, TimeUnit.MILLISECONDS).mo36509m(new C5870a(this));
        C12932j.m33815a((Object) m, "queryObservable\n        …          }\n            }");
        return m;
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
