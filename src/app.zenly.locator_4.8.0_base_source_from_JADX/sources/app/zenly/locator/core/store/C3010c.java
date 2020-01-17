package app.zenly.locator.core.store;

import app.zenly.locator.core.store.api.C2949h;
import app.zenly.locator.core.store.api.C2951i;
import app.zenly.locator.core.store.api.C2955k;
import app.zenly.locator.core.store.api.C2960m;
import app.zenly.locator.core.store.api.C2962n;
import app.zenly.locator.core.store.api.ContactSoonOnZenlyDataSource;
import app.zenly.locator.core.store.api.ContactSoonOnZenlyStore;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.core.store.c */
public final class C3010c implements ContactSoonOnZenlyStore {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12785a<Map<String, C2949h>> f8401a;

    /* renamed from: b */
    private final ContactSoonOnZenlyDataSource f8402b;

    /* renamed from: app.zenly.locator.core.store.c$a */
    static final class C3011a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3011a f8403e = new C3011a();

        C3011a() {
        }

        /* renamed from: a */
        public final List<C2949h> apply(Map<String, C2949h> map) {
            C12932j.m33818b(map, "it");
            return C12857w.m33689j(map.values());
        }
    }

    /* renamed from: app.zenly.locator.core.store.c$b */
    static final /* synthetic */ class C3012b extends C12931i implements Function2<Map<String, ? extends C2949h>, C2951i, Map<String, ? extends C2949h>> {
        C3012b(C3010c cVar) {
            super(2, cVar);
        }

        /* renamed from: a */
        public final Map<String, C2949h> invoke(Map<String, C2949h> map, C2951i iVar) {
            C12932j.m33818b(map, "p1");
            C12932j.m33818b(iVar, "p2");
            return ((C3010c) this.f33505f).m9519a(map, iVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3010c.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "reduceState(Ljava/util/Map;Lapp/zenly/locator/core/store/api/ContactSoonOnZenlyAction;)Ljava/util/Map;";
        }

        public final String getName() {
            return "reduceState";
        }
    }

    /* renamed from: app.zenly.locator.core.store.c$c */
    static final class C3013c<T> implements Consumer<Map<String, ? extends C2949h>> {

        /* renamed from: e */
        final /* synthetic */ C3010c f8404e;

        C3013c(C3010c cVar) {
            this.f8404e = cVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, C2949h> map) {
            this.f8404e.f8401a.onNext(map);
        }
    }

    public C3010c(ContactSoonOnZenlyDataSource contactSoonOnZenlyDataSource) {
        C12932j.m33818b(contactSoonOnZenlyDataSource, "dataSource");
        this.f8402b = contactSoonOnZenlyDataSource;
        C12785a<Map<String, C2949h>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<M…g, ContactSoonOnZenly>>()");
        this.f8401a = u;
    }

    public C12279e<List<C2949h>> contactsSoonOnZenly() {
        C12279e<List<C2949h>> i = this.f8401a.mo36501i(C3011a.f8403e);
        C12932j.m33815a((Object) i, "subject.map { it.values.toList() }");
        return i;
    }

    /* renamed from: a */
    public final Disposable mo9198a() {
        C12275b bVar = new C12275b();
        Disposable d = this.f8402b.contactsSoonOnZenlyEvents().mo36441a(C12835h0.m33545a(), (BiFunction<R, ? super T, R>) new C3014d<R,Object,R>(new C3012b(this))).mo36479d(1).mo36476d((Consumer<? super T>) new C3013c<Object>(this));
        C12932j.m33815a((Object) d, "dataSource.contactsSoonO….onNext(it)\n            }");
        C12773a.m33432a(d, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C2949h> m9519a(Map<String, C2949h> map, C2951i iVar) {
        if (iVar instanceof C2962n) {
            List a = ((C2962n) iVar).mo9143a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(a, 10)), 16));
            for (Object next : a) {
                linkedHashMap.put(((C2949h) next).mo9104a().getDeviceContactId(), next);
            }
            return linkedHashMap;
        } else if (iVar instanceof C2960m) {
            Map<String, C2949h> c = C12835h0.m33555c(map);
            C2960m mVar = (C2960m) iVar;
            String deviceContactId = mVar.mo9135a().mo9104a().getDeviceContactId();
            C12932j.m33815a((Object) deviceContactId, "action.item.contact.deviceContactId");
            c.put(deviceContactId, mVar.mo9135a());
            return c;
        } else if (!(iVar instanceof C2955k)) {
            return map;
        } else {
            Map<String, C2949h> c2 = C12835h0.m33555c(map);
            c2.remove(((C2955k) iVar).mo9117a().mo9104a().getDeviceContactId());
            return c2;
        }
    }
}
