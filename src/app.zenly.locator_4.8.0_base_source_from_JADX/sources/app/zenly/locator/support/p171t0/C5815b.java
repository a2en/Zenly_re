package app.zenly.locator.support.p171t0;

import android.content.Context;
import app.zenly.locator.core.models.C2916z;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.support.C5724n0.C5738f;
import app.zenly.locator.support.p171t0.p173g.p175i.p177d.C5854a;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p180e.C5868a;
import app.zenly.locator.support.p171t0.p190h.C5890a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6978c2;
import p213co.znly.models.services.C8294t3;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.support.t0.b */
public final class C5815b {

    /* renamed from: app.zenly.locator.support.t0.b$a */
    static final class C5816a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5816a f14714e = new C5816a();

        /* renamed from: app.zenly.locator.support.t0.b$a$a */
        public static final class C5817a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C12998b.m33940a(Long.valueOf(((C5890a) t2).mo13586b()), Long.valueOf(((C5890a) t).mo13586b()));
            }
        }

        C5816a() {
        }

        /* renamed from: a */
        public final List<C5890a> apply(C8294t3 t3Var) {
            Object obj;
            C12932j.m33818b(t3Var, "it");
            List<C6978c2> placesList = t3Var.getPlacesList();
            C12932j.m33815a((Object) placesList, "it.placesList");
            ArrayList arrayList = new ArrayList();
            for (C6978c2 c2Var : placesList) {
                if (!c2Var.hasLastVisitedAt()) {
                    obj = null;
                } else {
                    C2916z a = C2916z.f8286g.mo9023a(c2Var);
                    C12279e geoReverseGeocode = C5448c.m15478a().geoReverseGeocode(c2Var.getLatitude(), c2Var.getLongitude());
                    C12932j.m33815a((Object) geoReverseGeocode, "ZenlyCoreProvider.get()\n…de, protoPlace.longitude)");
                    ZenlyCore a2 = C5448c.m15478a();
                    Timestamp lastVisitedAt = c2Var.getLastVisitedAt();
                    C12932j.m33815a((Object) lastVisitedAt, "protoPlace.lastVisitedAt");
                    obj = new C5890a(a, C5447b.m15473a(a2, C3245z.m10288g(lastVisitedAt)), geoReverseGeocode);
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return C12857w.m33665a((Iterable) arrayList, (Comparator) new C5817a());
        }
    }

    /* renamed from: app.zenly.locator.support.t0.b$b */
    static final class C5818b<TResult> implements OnSuccessListener<FindAutocompletePredictionsResponse> {

        /* renamed from: a */
        final /* synthetic */ C12785a f14715a;

        C5818b(C12785a aVar) {
            this.f14715a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccess(com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse r6) {
            /*
                r5 = this;
                io.reactivex.n.a r0 = r5.f14715a
                java.lang.String r1 = "it"
                kotlin.jvm.internal.C12932j.m33815a(r6, r1)
                java.util.List r6 = r6.getAutocompletePredictions()
                java.lang.String r1 = "it.autocompletePredictions"
                kotlin.jvm.internal.C12932j.m33815a(r6, r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.C12850p.m33647a(r6, r2)
                r1.<init>(r2)
                java.util.Iterator r6 = r6.iterator()
            L_0x001f:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0055
                java.lang.Object r2 = r6.next()
                com.google.android.libraries.places.api.model.AutocompletePrediction r2 = (com.google.android.libraries.places.api.model.AutocompletePrediction) r2
                r3 = 0
                if (r2 == 0) goto L_0x0039
                android.text.SpannableString r4 = r2.getPrimaryText(r3)
                if (r4 == 0) goto L_0x0039
                java.lang.String r4 = r4.toString()
                goto L_0x003a
            L_0x0039:
                r4 = r3
            L_0x003a:
                if (r2 == 0) goto L_0x0047
                android.text.SpannableString r2 = r2.getSecondaryText(r3)
                if (r2 == 0) goto L_0x0047
                java.lang.String r2 = r2.toString()
                goto L_0x0048
            L_0x0047:
                r2 = r3
            L_0x0048:
                if (r4 == 0) goto L_0x0051
                if (r2 == 0) goto L_0x0051
                app.zenly.locator.support.t0.g.i.e.e.a r3 = new app.zenly.locator.support.t0.g.i.e.e.a
                r3.<init>(r4, r2)
            L_0x0051:
                r1.add(r3)
                goto L_0x001f
            L_0x0055:
                java.util.List r6 = kotlin.collections.C12857w.m33674c(r1)
                r0.onNext(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.p171t0.C5815b.C5818b.onSuccess(com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse):void");
        }
    }

    /* renamed from: app.zenly.locator.support.t0.b$c */
    static final class C5819c implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ C12785a f14716a;

        C5819c(C12785a aVar) {
            this.f14716a = aVar;
        }

        public final void onFailure(Exception exc) {
            C12932j.m33818b(exc, "it");
            this.f14716a.onNext(C12848o.m33640a());
        }
    }

    /* renamed from: a */
    public final C12279e<List<C5868a>> mo13495a(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "query");
        PlacesClient createClient = Places.createClient(context);
        C12932j.m33815a((Object) createClient, "Places.createClient(context)");
        C10693c findAutocompletePredictions = createClient.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setQuery(str).setTypeFilter(TypeFilter.ADDRESS).build());
        C12932j.m33815a((Object) findAutocompletePredictions, "placesClient.findAutocom…       .build()\n        )");
        C12785a u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<List<SuggestedPlace>>()");
        findAutocompletePredictions.mo29301a((OnSuccessListener<? super TResult>) new C5818b<Object>(u));
        findAutocompletePredictions.mo29300a((OnFailureListener) new C5819c(u));
        return u;
    }

    /* renamed from: b */
    public final C12279e<List<C5890a>> mo13496b() {
        C12279e<List<C5890a>> e = C5448c.m15478a().personalPlaces().mo36552d((Function<? super T, ? extends R>) C5816a.f14714e).mo36553e();
        C12932j.m33815a((Object) e, "ZenlyCoreProvider.get().…          .toObservable()");
        return e;
    }

    /* renamed from: a */
    public final C12279e<List<C5854a>> mo13493a() {
        C12279e<List<C5854a>> e = C12279e.m32626e(C12848o.m33643b((Object[]) new C5854a[]{new C5854a(1, C5738f.MISSING_PLACE_HOME), new C5854a(3, C5738f.MISSING_PLACE_SCHOOL), new C5854a(2, C5738f.MISSING_PLACE_WORK)}));
        C12932j.m33815a((Object) e, "Observable.just(\n       …)\n            )\n        )");
        return e;
    }

    /* renamed from: a */
    public final C12279e<List<C5738f>> mo13494a(int i) {
        List list;
        if (i == 1) {
            list = C12848o.m33643b((Object[]) new C5738f[]{C5738f.HOME_REMOVE, C5738f.HOME_SWAP1, C5738f.HOME_SWAP2, C5738f.HOME_HIDE, C5738f.HOME_OTHER});
        } else if (i == 2) {
            list = C12848o.m33643b((Object[]) new C5738f[]{C5738f.WORK_REMOVE, C5738f.WORK_SWAP1, C5738f.WORK_SWAP2, C5738f.WORK_HIDE, C5738f.WORK_OTHER});
        } else if (i != 3) {
            list = C12848o.m33640a();
        } else {
            list = C12848o.m33643b((Object[]) new C5738f[]{C5738f.SCHOOL_REMOVE, C5738f.SCHOOL_SWAP1, C5738f.SCHOOL_SWAP2, C5738f.SCHOOL_HIDE, C5738f.SCHOOL_OTHER});
        }
        C12279e<List<C5738f>> e = C12279e.m32626e(list);
        C12932j.m33815a((Object) e, "Observable.just(\n       …)\n            }\n        )");
        return e;
    }
}
