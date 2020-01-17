package app.zenly.locator.dashboard.p076x.p078d;

import android.view.View;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.dashboard.C3313j;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p075w.C3335g;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7052a2;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.x.d.a */
public final class C3359a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3313j f9327f;

    /* renamed from: g */
    private final C12279e<C3335g> f9328g;

    /* renamed from: h */
    private final C12279e<C3318o> f9329h;

    /* renamed from: i */
    private final ZenlyCore f9330i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3201f<C2936a0> f9331j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C3201f<C7339i> f9332k;

    /* renamed from: app.zenly.locator.dashboard.x.d.a$a */
    static final class C3360a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3359a f9333e;

        C3360a(C3359a aVar) {
            this.f9333e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(C3318o oVar) {
            C12932j.m33818b(oVar, "state");
            if (oVar.mo9820d()) {
                return this.f9333e.m10553a(oVar.mo9817a());
            }
            C12279e<Seekable<C11722a>> e = C12279e.m32626e(C11751f.m30859a());
            C12932j.m33815a((Object) e, "Observable.just(Seekables.empty())");
            return e;
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.d.a$b */
    public static final class C3361b<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C3359a f9334a;

        public C3361b(C3359a aVar) {
            this.f9334a = aVar;
        }

        /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r6v6, types: [app.zenly.locator.dashboard.z.g] */
        /* JADX WARNING: type inference failed for: r11v1, types: [app.zenly.locator.dashboard.z.o] */
        /* JADX WARNING: type inference failed for: r6v17, types: [app.zenly.locator.dashboard.z.g] */
        /* JADX WARNING: type inference failed for: r11v3, types: [app.zenly.locator.dashboard.z.o] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v17, types: [app.zenly.locator.dashboard.z.g]
          assigns: [app.zenly.locator.dashboard.z.g, app.zenly.locator.dashboard.z.o]
          uses: [app.zenly.locator.dashboard.z.g, java.lang.Object, app.zenly.locator.dashboard.z.o]
          mth insns count: 114
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
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r23, T2 r24, T3 r25) {
            /*
                r22 = this;
                r0 = r22
                r1 = r25
                java.util.List r1 = (java.util.List) r1
                r2 = r24
                java.util.List r2 = (java.util.List) r2
                r3 = r23
                app.zenly.locator.dashboard.w.g r3 = (app.zenly.locator.dashboard.p075w.C3335g) r3
                java.lang.String r4 = "friendResults"
                kotlin.jvm.internal.C12932j.m33815a(r2, r4)
                app.zenly.locator.dashboard.x.d.a r4 = r0.f9334a
                app.zenly.locator.core.util.f r4 = r4.f9331j
                java.util.List r2 = kotlin.collections.C12857w.m33665a(r2, r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r6 = kotlin.collections.C12850p.m33647a(r2, r5)
                r4.<init>(r6)
                java.util.Iterator r2 = r2.iterator()
            L_0x002c:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0087
                java.lang.Object r6 = r2.next()
                app.zenly.locator.core.store.api.a0 r6 = (app.zenly.locator.core.store.api.C2936a0) r6
                app.zenly.locator.dashboard.z.o r15 = new app.zenly.locator.dashboard.z.o
                app.zenly.locator.dashboard.x.d.a r7 = r0.f9334a
                app.zenly.locator.dashboard.j r7 = r7.f9327f
                app.zenly.locator.dashboard.x.d.a r8 = r0.f9334a
                co.znly.models.UserProto$User r9 = r6.mo9074a()
                java.lang.String r9 = r9.getUuid()
                java.lang.String r10 = "result.user.uuid"
                kotlin.jvm.internal.C12932j.m33815a(r9, r10)
                long r8 = r7.mo9815a(r8, r9)
                app.zenly.locator.dashboard.z.m r10 = app.zenly.locator.dashboard.p081z.C3435m.SEARCH_RESULT
                co.znly.models.UserProto$User r11 = r6.mo9074a()
                co.znly.models.UserProto$User r7 = r6.mo9074a()
                java.lang.String r12 = r7.getName()
                java.lang.String r7 = "result.user.name"
                kotlin.jvm.internal.C12932j.m33815a(r12, r7)
                co.znly.models.UserProto$User r7 = r6.mo9074a()
                boolean r13 = r3.mo9851a(r7)
                co.znly.models.UserProto$User r6 = r6.mo9074a()
                boolean r14 = r3.mo9853b(r6)
                r6 = 0
                r16 = 64
                r17 = 0
                r7 = r15
                r5 = r15
                r15 = r6
                r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r17)
                r4.add(r5)
                r5 = 10
                goto L_0x002c
            L_0x0087:
                java.lang.String r2 = "contactResults"
                kotlin.jvm.internal.C12932j.m33815a(r1, r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0095:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x00b3
                java.lang.Object r5 = r1.next()
                r6 = r5
                co.znly.models.i r6 = (p213co.znly.models.C7339i) r6
                java.lang.String r7 = "it"
                kotlin.jvm.internal.C12932j.m33815a(r6, r7)
                boolean r6 = r3.mo9854c(r6)
                r6 = r6 ^ 1
                if (r6 == 0) goto L_0x0095
                r2.add(r5)
                goto L_0x0095
            L_0x00b3:
                app.zenly.locator.dashboard.x.d.a r1 = r0.f9334a
                app.zenly.locator.core.util.f r1 = r1.f9332k
                java.util.List r1 = kotlin.collections.C12857w.m33665a(r2, r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.collections.C12850p.m33647a(r1, r5)
                r2.<init>(r5)
                java.util.Iterator r1 = r1.iterator()
            L_0x00cc:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0148
                java.lang.Object r5 = r1.next()
                r10 = r5
                co.znly.models.i r10 = (p213co.znly.models.C7339i) r10
                java.lang.String r5 = "contact"
                kotlin.jvm.internal.C12932j.m33815a(r10, r5)
                co.znly.models.UserProto$User r15 = r3.mo9855d(r10)
                if (r15 == 0) goto L_0x011b
                app.zenly.locator.dashboard.z.o r5 = new app.zenly.locator.dashboard.z.o
                app.zenly.locator.dashboard.x.d.a r6 = r0.f9334a
                app.zenly.locator.dashboard.j r6 = r6.f9327f
                app.zenly.locator.dashboard.x.d.a r7 = r0.f9334a
                java.lang.String r8 = r15.getUuid()
                java.lang.String r9 = "user.uuid"
                kotlin.jvm.internal.C12932j.m33815a(r8, r9)
                long r12 = r6.mo9815a(r7, r8)
                app.zenly.locator.dashboard.z.m r14 = app.zenly.locator.dashboard.p081z.C3435m.SEARCH_RESULT
                java.lang.String r6 = r10.getFull()
                java.lang.String r7 = "contact.full"
                kotlin.jvm.internal.C12932j.m33815a(r6, r7)
                boolean r17 = r3.mo9851a(r15)
                boolean r18 = r3.mo9853b(r15)
                r19 = 0
                r20 = 64
                r21 = 0
                r11 = r5
                r16 = r6
                r11.<init>(r12, r14, r15, r16, r17, r18, r19, r20, r21)
                goto L_0x0144
            L_0x011b:
                app.zenly.locator.dashboard.z.g r5 = new app.zenly.locator.dashboard.z.g
                app.zenly.locator.dashboard.x.d.a r6 = r0.f9334a
                app.zenly.locator.dashboard.j r6 = r6.f9327f
                app.zenly.locator.dashboard.x.d.a r7 = r0.f9334a
                java.lang.String r8 = r10.getDeviceContactId()
                java.lang.String r9 = "contact.deviceContactId"
                kotlin.jvm.internal.C12932j.m33815a(r8, r9)
                long r7 = r6.mo9815a(r7, r8)
                app.zenly.locator.dashboard.z.m r9 = app.zenly.locator.dashboard.p081z.C3435m.SEARCH_RESULT
                int r11 = r3.mo9852b(r10)
                app.zenly.locator.dashboard.w.i r12 = r3.mo9849a(r10)
                r13 = 0
                r14 = 32
                r15 = 0
                r6 = r5
                r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15)
            L_0x0144:
                r2.add(r5)
                goto L_0x00cc
            L_0x0148:
                boolean r1 = r4.isEmpty()
                if (r1 == 0) goto L_0x0161
                boolean r1 = r2.isEmpty()
                if (r1 == 0) goto L_0x0161
                app.zenly.locator.dashboard.z.i r1 = new app.zenly.locator.dashboard.z.i
                r2 = 2132017515(0x7f14016b, float:1.967331E38)
                r1.<init>(r2)
                com.snap.ui.seeking.Seekable r1 = com.snap.p327ui.seeking.C11751f.m30861a(r1)
                goto L_0x018b
            L_0x0161:
                f.a.a.b.a.j.e r1 = p250f.p251a.p252a.p263b.p264a.p272j.C7712e.f19340a
                app.zenly.locator.dashboard.z.j r3 = new app.zenly.locator.dashboard.z.j
                r6 = 2132017771(0x7f14026b, float:1.967383E38)
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                com.snap.ui.seeking.Seekable r1 = r1.mo19921a(r3, r4)
                f.a.a.b.a.j.e r3 = p250f.p251a.p252a.p263b.p264a.p272j.C7712e.f19340a
                app.zenly.locator.dashboard.z.j r10 = new app.zenly.locator.dashboard.z.j
                r5 = 2132017772(0x7f14026c, float:1.9673832E38)
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r10
                r4.<init>(r5, r6, r7, r8, r9)
                com.snap.ui.seeking.Seekable r2 = r3.mo19921a(r10, r2)
                com.snap.ui.seeking.Seekable r1 = com.snap.p327ui.seeking.C11751f.m30860a(r1, r2)
            L_0x018b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.dashboard.p076x.p078d.C3359a.C3361b.apply(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.d.a$c */
    static final class C3362c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3362c f9335e = new C3362c();

        C3362c() {
        }

        /* renamed from: a */
        public final List<C7339i> apply(C7052a2 a2Var) {
            C12932j.m33818b(a2Var, "it");
            return a2Var.getContactsList();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.d.a$d */
    static final class C3363d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3363d f9336e = new C3363d();

        C3363d() {
        }

        /* renamed from: a */
        public final C2936a0 apply(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            return new C2936a0(userProto$User);
        }
    }

    public C3359a(C3313j jVar, C12279e<C3335g> eVar, C12279e<C3318o> eVar2, ZenlyCore zenlyCore, C3201f<C2936a0> fVar, C3201f<C7339i> fVar2) {
        C12932j.m33818b(jVar, "dataIdMapper");
        C12932j.m33818b(eVar, "domainObservable");
        C12932j.m33818b(eVar2, "queryStateObservable");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(fVar, "friendComparator");
        C12932j.m33818b(fVar2, "contactComparator");
        this.f9327f = jVar;
        this.f9328g = eVar;
        this.f9329h = eVar2;
        this.f9330i = zenlyCore;
        this.f9331j = fVar;
        this.f9332k = fVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> m = this.f9329h.mo36509m(new C3360a(this));
        C12932j.m33815a((Object) m, "queryStateObservable.swi…)\n            }\n        }");
        return m;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<Seekable<C11722a>> m10553a(String str) {
        C12279e e = this.f9330i.friendsSearchStream(str).mo36501i(C3363d.f9336e).mo36511n().mo36553e();
        C12279e i = this.f9330i.contactsSearchBatch(str).mo36501i(C3362c.f9335e);
        C12774b bVar = C12774b.f33320a;
        C12279e<C3335g> eVar = this.f9328g;
        C12932j.m33815a((Object) e, "searchFriendObservable");
        C12932j.m33815a((Object) i, "searchContactObservable");
        C12279e<Seekable<C11722a>> a = C12279e.m32609a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) e, (ObservableSource<? extends T3>) i, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3361b<Object,Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…)\n            }\n        }");
        return a;
    }
}
