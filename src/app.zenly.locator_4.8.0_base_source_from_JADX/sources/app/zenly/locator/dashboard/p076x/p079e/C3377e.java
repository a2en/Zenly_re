package app.zenly.locator.dashboard.p076x.p079e;

import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.store.SuggestedStore;
import app.zenly.locator.dashboard.C3313j;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p075w.C3335g;
import app.zenly.locator.dashboard.p081z.C3429h;
import app.zenly.locator.dashboard.p081z.C3431j;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.x.e.e */
public final class C3377e extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3313j f9354f;

    /* renamed from: g */
    private final C12279e<C3335g> f9355g;

    /* renamed from: h */
    private final C12279e<C3318o> f9356h;

    /* renamed from: i */
    private final SuggestedStore f9357i;

    /* renamed from: app.zenly.locator.dashboard.x.e.e$a */
    public static final class C3378a<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C3377e f9358a;

        public C3378a(C3377e eVar) {
            this.f9358a = eVar;
        }

        /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r16v0, types: [app.zenly.locator.dashboard.z.o] */
        /* JADX WARNING: type inference failed for: r6v6, types: [app.zenly.locator.dashboard.z.g] */
        /* JADX WARNING: type inference failed for: r16v1, types: [app.zenly.locator.dashboard.z.o] */
        /* JADX WARNING: type inference failed for: r6v9, types: [app.zenly.locator.dashboard.z.g] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r16v1, types: [app.zenly.locator.dashboard.z.o]
          assigns: [app.zenly.locator.dashboard.z.o, app.zenly.locator.dashboard.z.g]
          uses: [app.zenly.locator.dashboard.z.o, java.lang.Object, app.zenly.locator.dashboard.z.g]
          mth insns count: 84
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0013 A[SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r28, T2 r29) {
            /*
                r27 = this;
                r0 = r27
                r1 = r29
                java.util.List r1 = (java.util.List) r1
                r2 = r28
                app.zenly.locator.dashboard.w.g r2 = (app.zenly.locator.dashboard.p075w.C3335g) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0013:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x003e
                java.lang.Object r4 = r1.next()
                r5 = r4
                co.znly.models.p r5 = (p213co.znly.models.C7434p) r5
                boolean r6 = r5.hasUser()
                if (r6 == 0) goto L_0x0037
                co.znly.models.UserProto$User r5 = r5.getUser()
                java.lang.String r6 = "it.user"
                kotlin.jvm.internal.C12932j.m33815a(r5, r6)
                boolean r5 = r2.mo9851a(r5)
                if (r5 == 0) goto L_0x0037
                r5 = 1
                goto L_0x0038
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 != 0) goto L_0x0013
                r3.add(r4)
                goto L_0x0013
            L_0x003e:
                java.util.ArrayList r1 = new java.util.ArrayList
                r4 = 10
                int r4 = kotlin.collections.C12850p.m33647a(r3, r4)
                r1.<init>(r4)
                java.util.Iterator r3 = r3.iterator()
            L_0x004d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0105
                java.lang.Object r4 = r3.next()
                co.znly.models.p r4 = (p213co.znly.models.C7434p) r4
                boolean r5 = r4.hasContact()
                if (r5 == 0) goto L_0x00ab
                app.zenly.locator.dashboard.z.g r5 = new app.zenly.locator.dashboard.z.g
                app.zenly.locator.dashboard.x.e.e r6 = r0.f9358a
                app.zenly.locator.dashboard.j r6 = r6.f9354f
                app.zenly.locator.dashboard.x.e.e r7 = r0.f9358a
                co.znly.models.i r8 = r4.getContact()
                java.lang.String r9 = "suggested.contact"
                kotlin.jvm.internal.C12932j.m33815a(r8, r9)
                java.lang.String r8 = r8.getDeviceContactId()
                java.lang.String r10 = "suggested.contact.deviceContactId"
                kotlin.jvm.internal.C12932j.m33815a(r8, r10)
                long r7 = r6.mo9815a(r7, r8)
                app.zenly.locator.dashboard.z.m r10 = app.zenly.locator.dashboard.p081z.C3435m.SUGGESTED
                co.znly.models.i r11 = r4.getContact()
                kotlin.jvm.internal.C12932j.m33815a(r11, r9)
                co.znly.models.i r6 = r4.getContact()
                kotlin.jvm.internal.C12932j.m33815a(r6, r9)
                int r12 = r2.mo9852b(r6)
                co.znly.models.i r4 = r4.getContact()
                kotlin.jvm.internal.C12932j.m33815a(r4, r9)
                app.zenly.locator.dashboard.w.i r4 = r2.mo9849a(r4)
                r13 = 0
                r14 = 32
                r15 = 0
                r6 = r5
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r4
                r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0100
            L_0x00ab:
                app.zenly.locator.dashboard.z.o r5 = new app.zenly.locator.dashboard.z.o
                app.zenly.locator.dashboard.x.e.e r6 = r0.f9358a
                app.zenly.locator.dashboard.j r6 = r6.f9354f
                app.zenly.locator.dashboard.x.e.e r7 = r0.f9358a
                co.znly.models.UserProto$User r8 = r4.getUser()
                java.lang.String r9 = "suggested.user"
                kotlin.jvm.internal.C12932j.m33815a(r8, r9)
                java.lang.String r8 = r8.getUuid()
                java.lang.String r10 = "suggested.user.uuid"
                kotlin.jvm.internal.C12932j.m33815a(r8, r10)
                long r17 = r6.mo9815a(r7, r8)
                app.zenly.locator.dashboard.z.m r19 = app.zenly.locator.dashboard.p081z.C3435m.SUGGESTED
                co.znly.models.UserProto$User r6 = r4.getUser()
                kotlin.jvm.internal.C12932j.m33815a(r6, r9)
                co.znly.models.UserProto$User r7 = r4.getUser()
                kotlin.jvm.internal.C12932j.m33815a(r7, r9)
                java.lang.String r7 = r7.getName()
                java.lang.String r8 = "suggested.user.name"
                kotlin.jvm.internal.C12932j.m33815a(r7, r8)
                r22 = 0
                co.znly.models.UserProto$User r4 = r4.getUser()
                kotlin.jvm.internal.C12932j.m33815a(r4, r9)
                boolean r23 = r2.mo9853b(r4)
                r24 = 0
                r25 = 64
                r26 = 0
                r16 = r5
                r20 = r6
                r21 = r7
                r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26)
            L_0x0100:
                r1.add(r5)
                goto L_0x004d
            L_0x0105:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.dashboard.p076x.p079e.C3377e.C3378a.apply(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.e$b */
    public static final class C3379b<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            R r = (Seekable) t2;
            Boolean bool = (Boolean) t1;
            C12932j.m33815a((Object) bool, "isQueryEmpty");
            return bool.booleanValue() ? r : C11751f.m30859a();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.e$c */
    static final class C3380c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3380c f9359e = new C3380c();

        C3380c() {
        }

        /* renamed from: a */
        public final boolean mo9878a(C3318o oVar) {
            C12932j.m33818b(oVar, "it");
            return oVar.mo9818b();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo9878a((C3318o) obj));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.e$d */
    static final class C3381d<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C11722a f9360e;

        C3381d(C11722a aVar) {
            this.f9360e = aVar;
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(List<? extends C11722a> list) {
            C12932j.m33818b(list, "models");
            return C7712e.f19340a.mo19920a(this.f9360e, C3429h.f9431f, list);
        }
    }

    public C3377e(C3313j jVar, C12279e<C3335g> eVar, C12279e<C3318o> eVar2, SuggestedStore suggestedStore) {
        C12932j.m33818b(jVar, "dataIdMapper");
        C12932j.m33818b(eVar, "domainObservable");
        C12932j.m33818b(eVar2, "queryStateObservable");
        C12932j.m33818b(suggestedStore, "suggestedStore");
        this.f9354f = jVar;
        this.f9355g = eVar;
        this.f9356h = eVar2;
        this.f9357i = suggestedStore;
    }

    /* renamed from: b */
    private final C12279e<List<C11722a>> m10575b() {
        C12774b bVar = C12774b.f33320a;
        C12279e<List<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) this.f9355g, (ObservableSource<? extends T2>) SuggestedStore.m9424a(), (BiFunction<? super T1, ? super T2, ? extends R>) new C3378a<Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…              }\n        }");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C3431j jVar = new C3431j(R.string.signup_contactpicker_title_suggested, null, false, 6, null);
        C12279e i = this.f9356h.mo36501i(C3380c.f9359e);
        C12279e i2 = m10575b().mo36501i(new C3381d(jVar));
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) i, "isQueryEmptyObservable");
        C12932j.m33815a((Object) i2, "modelsObservable");
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) i2, (BiFunction<? super T1, ? super T2, ? extends R>) new C3379b<Object,Object,Object>());
        C12932j.m33815a((Object) a, "Observables.combineLates…)\n            }\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
