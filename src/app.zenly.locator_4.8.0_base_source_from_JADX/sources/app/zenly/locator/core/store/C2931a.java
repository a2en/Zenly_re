package app.zenly.locator.core.store;

import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2937b;
import app.zenly.locator.core.store.api.C2941d;
import app.zenly.locator.core.store.api.C2945f;
import app.zenly.locator.core.store.api.C2947g;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyDataSource;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
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

/* renamed from: app.zenly.locator.core.store.a */
public final class C2931a implements ContactAlreadyOnZenlyStore {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12785a<Map<String, C2935a>> f8316a;

    /* renamed from: b */
    private final ContactAlreadyOnZenlyDataSource f8317b;

    /* renamed from: app.zenly.locator.core.store.a$a */
    static final class C2932a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2932a f8318e = new C2932a();

        C2932a() {
        }

        /* renamed from: a */
        public final List<C2935a> apply(Map<String, C2935a> map) {
            C12932j.m33818b(map, "it");
            return C12857w.m33689j(map.values());
        }
    }

    /* renamed from: app.zenly.locator.core.store.a$b */
    static final /* synthetic */ class C2933b extends C12931i implements Function2<Map<String, ? extends C2935a>, C2937b, Map<String, ? extends C2935a>> {
        C2933b(C2931a aVar) {
            super(2, aVar);
        }

        /* renamed from: a */
        public final Map<String, C2935a> invoke(Map<String, C2935a> map, C2937b bVar) {
            C12932j.m33818b(map, "p1");
            C12932j.m33818b(bVar, "p2");
            return ((C2931a) this.f33505f).m9442a(map, bVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2931a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "reduceState(Ljava/util/Map;Lapp/zenly/locator/core/store/api/ContactAlreadyOnZenlyAction;)Ljava/util/Map;";
        }

        public final String getName() {
            return "reduceState";
        }
    }

    /* renamed from: app.zenly.locator.core.store.a$c */
    static final class C2934c<T> implements Consumer<Map<String, ? extends C2935a>> {

        /* renamed from: e */
        final /* synthetic */ C2931a f8319e;

        C2934c(C2931a aVar) {
            this.f8319e = aVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, C2935a> map) {
            this.f8319e.f8316a.onNext(map);
        }
    }

    public C2931a(ContactAlreadyOnZenlyDataSource contactAlreadyOnZenlyDataSource) {
        C12932j.m33818b(contactAlreadyOnZenlyDataSource, "dataSource");
        this.f8317b = contactAlreadyOnZenlyDataSource;
        C12785a<Map<String, C2935a>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<M…ContactAlreadyOnZenly>>()");
        this.f8316a = u;
    }

    public C12279e<List<C2935a>> contactsAlreadyOnZenly() {
        C12279e<List<C2935a>> i = this.f8316a.mo36501i(C2932a.f8318e);
        C12932j.m33815a((Object) i, "subject.map { it.values.toList() }");
        return i;
    }

    /* renamed from: a */
    public final Disposable mo9040a() {
        C12275b bVar = new C12275b();
        Disposable d = this.f8317b.contactsAlreadyOnZenlyEvents().mo36441a(C12835h0.m33545a(), (BiFunction<R, ? super T, R>) new C3009b<R,Object,R>(new C2933b(this))).mo36479d(1).mo36476d((Consumer<? super T>) new C2934c<Object>(this));
        C12932j.m33815a((Object) d, "dataSource.contactsAlrea….onNext(it)\n            }");
        C12773a.m33432a(d, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C2935a> m9442a(Map<String, C2935a> map, C2937b bVar) {
        if (bVar instanceof C2947g) {
            List a = ((C2947g) bVar).mo9100a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(a, 10)), 16));
            for (Object next : a) {
                linkedHashMap.put(((C2935a) next).mo9070b().getUuid(), next);
            }
            return linkedHashMap;
        } else if (bVar instanceof C2945f) {
            Map<String, C2935a> c = C12835h0.m33555c(map);
            C2945f fVar = (C2945f) bVar;
            String uuid = fVar.mo9090a().mo9070b().getUuid();
            C12932j.m33815a((Object) uuid, "action.item.user.uuid");
            c.put(uuid, fVar.mo9090a());
            return c;
        } else if (!(bVar instanceof C2941d)) {
            return map;
        } else {
            Map<String, C2935a> c2 = C12835h0.m33555c(map);
            c2.remove(((C2941d) bVar).mo9082a().mo9070b().getUuid());
            return c2;
        }
    }
}
