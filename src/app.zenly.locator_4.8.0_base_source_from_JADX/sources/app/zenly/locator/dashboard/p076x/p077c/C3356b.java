package app.zenly.locator.dashboard.p076x.p077c;

import android.content.Context;
import android.view.View;
import app.zenly.locator.dashboard.C3313j;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p075w.C3333f;
import app.zenly.locator.dashboard.p075w.C3335g;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.x.c.b */
public final class C3356b extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f9318f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3313j f9319g;

    /* renamed from: h */
    private final C12279e<C3335g> f9320h;

    /* renamed from: i */
    private final C12279e<C3318o> f9321i;

    /* renamed from: j */
    private final C12279e<Boolean> f9322j;

    /* renamed from: k */
    private final C3333f f9323k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C11700c f9324l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C11727c f9325m;

    /* renamed from: app.zenly.locator.dashboard.x.c.b$a */
    public static final class C3357a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C3356b f9326a;

        public C3357a(C3356b bVar) {
            this.f9326a = bVar;
        }

        /* JADX WARNING: type inference failed for: r13v7, types: [app.zenly.locator.dashboard.z.i] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r13, T2 r14, T3 r15) {
            /*
                r12 = this;
                java.util.List r15 = (java.util.List) r15
                app.zenly.locator.dashboard.w.g r14 = (app.zenly.locator.dashboard.p075w.C3335g) r14
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                java.util.ArrayList r10 = new java.util.ArrayList
                r0 = 10
                int r0 = kotlin.collections.C12850p.m33647a(r15, r0)
                r10.<init>(r0)
                java.util.Iterator r15 = r15.iterator()
            L_0x0019:
                boolean r0 = r15.hasNext()
                r1 = 1
                if (r0 == 0) goto L_0x00fb
                java.lang.Object r0 = r15.next()
                app.zenly.locator.dashboard.w.k r0 = (app.zenly.locator.dashboard.p075w.C3345k) r0
                boolean r2 = r0 instanceof app.zenly.locator.dashboard.p075w.C3345k.C3347b
                if (r2 == 0) goto L_0x0071
                app.zenly.locator.dashboard.z.l r9 = new app.zenly.locator.dashboard.z.l
                app.zenly.locator.dashboard.x.c.b r1 = r12.f9326a
                app.zenly.locator.dashboard.j r1 = r1.f9319g
                app.zenly.locator.dashboard.x.c.b r2 = r12.f9326a
                app.zenly.locator.dashboard.w.k$b r0 = (app.zenly.locator.dashboard.p075w.C3345k.C3347b) r0
                co.znly.models.UserProto$User r3 = r0.mo9863a()
                java.lang.String r3 = r3.getUuid()
                java.lang.String r4 = "recent.user.uuid"
                kotlin.jvm.internal.C12932j.m33815a(r3, r4)
                long r1 = r1.mo9815a(r2, r3)
                app.zenly.locator.dashboard.z.m r3 = app.zenly.locator.dashboard.p081z.C3435m.RECENTLY_VIEWED_RESULT
                co.znly.models.UserProto$User r4 = r0.mo9863a()
                co.znly.models.UserProto$User r5 = r0.mo9863a()
                java.lang.String r5 = r5.getName()
                java.lang.String r6 = "recent.user.name"
                kotlin.jvm.internal.C12932j.m33815a(r5, r6)
                co.znly.models.UserProto$User r6 = r0.mo9863a()
                boolean r6 = r14.mo9851a(r6)
                co.znly.models.UserProto$User r0 = r0.mo9863a()
                boolean r7 = r14.mo9853b(r0)
                r0 = r9
                r8 = r13
                r0.<init>(r1, r3, r4, r5, r6, r7, r8)
                goto L_0x00f0
            L_0x0071:
                boolean r2 = r0 instanceof app.zenly.locator.dashboard.p075w.C3345k.C3346a
                if (r2 == 0) goto L_0x00f5
                app.zenly.locator.dashboard.w.k$a r0 = (app.zenly.locator.dashboard.p075w.C3345k.C3346a) r0
                co.znly.models.i r2 = r0.mo9862a()
                co.znly.models.UserProto$User r4 = r14.mo9855d(r2)
                if (r4 == 0) goto L_0x00b5
                app.zenly.locator.dashboard.z.l r9 = new app.zenly.locator.dashboard.z.l
                app.zenly.locator.dashboard.x.c.b r1 = r12.f9326a
                app.zenly.locator.dashboard.j r1 = r1.f9319g
                app.zenly.locator.dashboard.x.c.b r2 = r12.f9326a
                java.lang.String r3 = r4.getUuid()
                java.lang.String r5 = "user.uuid"
                kotlin.jvm.internal.C12932j.m33815a(r3, r5)
                long r1 = r1.mo9815a(r2, r3)
                app.zenly.locator.dashboard.z.m r3 = app.zenly.locator.dashboard.p081z.C3435m.RECENTLY_VIEWED_RESULT
                co.znly.models.i r0 = r0.mo9862a()
                java.lang.String r5 = r0.getFull()
                java.lang.String r0 = "recent.contact.full"
                kotlin.jvm.internal.C12932j.m33815a(r5, r0)
                boolean r6 = r14.mo9851a(r4)
                boolean r7 = r14.mo9853b(r4)
                r0 = r9
                r8 = r13
                r0.<init>(r1, r3, r4, r5, r6, r7, r8)
                goto L_0x00f0
            L_0x00b5:
                app.zenly.locator.dashboard.z.k r7 = new app.zenly.locator.dashboard.z.k
                app.zenly.locator.dashboard.x.c.b r2 = r12.f9326a
                app.zenly.locator.dashboard.j r2 = r2.f9319g
                app.zenly.locator.dashboard.x.c.b r3 = r12.f9326a
                co.znly.models.i r4 = r0.mo9862a()
                java.lang.String r4 = r4.getDeviceContactId()
                java.lang.String r5 = "recent.contact.deviceContactId"
                kotlin.jvm.internal.C12932j.m33815a(r4, r5)
                long r2 = r2.mo9815a(r3, r4)
                app.zenly.locator.dashboard.z.m r4 = app.zenly.locator.dashboard.p081z.C3435m.RECENTLY_VIEWED_RESULT
                co.znly.models.i r5 = r0.mo9862a()
                co.znly.models.i r0 = r0.mo9862a()
                app.zenly.locator.dashboard.w.i r0 = r14.mo9849a(r0)
                app.zenly.locator.dashboard.w.i r6 = app.zenly.locator.dashboard.p075w.C3341i.INVITED
                if (r0 != r6) goto L_0x00e4
                r6 = 1
                goto L_0x00e6
            L_0x00e4:
                r0 = 0
                r6 = 0
            L_0x00e6:
                r0 = r7
                r1 = r2
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r13
                r0.<init>(r1, r3, r4, r5, r6)
                r9 = r7
            L_0x00f0:
                r10.add(r9)
                goto L_0x0019
            L_0x00f5:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            L_0x00fb:
                r14 = 2132017519(0x7f14016f, float:1.9673319E38)
                boolean r15 = r10.isEmpty()
                r15 = r15 ^ r1
                if (r15 == 0) goto L_0x0108
                app.zenly.locator.dashboard.z.j$a r15 = app.zenly.locator.dashboard.p081z.C3431j.C3432a.Edit
                goto L_0x010a
            L_0x0108:
                app.zenly.locator.dashboard.z.j$a r15 = app.zenly.locator.dashboard.p081z.C3431j.C3432a.None
            L_0x010a:
                app.zenly.locator.dashboard.z.j r11 = new app.zenly.locator.dashboard.z.j
                r11.<init>(r14, r15, r13)
                com.snap.ui.recycling.d.b r13 = new com.snap.ui.recycling.d.b
                app.zenly.locator.dashboard.u r1 = app.zenly.locator.dashboard.C3324u.RECENTLY_VIEWED_CONTENT
                app.zenly.locator.dashboard.x.c.b r14 = r12.f9326a
                com.snap.ui.recycling.factory.c r2 = r14.f9325m
                app.zenly.locator.dashboard.x.c.b r14 = r12.f9326a
                com.snap.ui.event.c r14 = r14.f9324l
                com.snap.ui.event.EventDispatcher r3 = r14.mo34447a()
                r5 = 1
                r7 = -2
                r8 = 0
                app.zenly.locator.dashboard.x.c.b r14 = r12.f9326a
                android.content.Context r14 = r14.f9318f
                android.content.res.Resources r14 = r14.getResources()
                r15 = 2131165533(0x7f07015d, float:1.7945286E38)
                int r9 = r14.getDimensionPixelOffset(r15)
                r0 = r13
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
                com.snap.ui.seeking.Seekable r14 = com.snap.p327ui.seeking.C11751f.m30861a(r11)
                boolean r15 = r10.isEmpty()
                if (r15 == 0) goto L_0x014f
                app.zenly.locator.dashboard.z.i r13 = new app.zenly.locator.dashboard.z.i
                r15 = 2132017518(0x7f14016e, float:1.9673317E38)
                r13.<init>(r15)
            L_0x014f:
                com.snap.ui.seeking.Seekable r13 = com.snap.p327ui.seeking.C11751f.m30861a(r13)
                com.snap.ui.seeking.Seekable r13 = com.snap.p327ui.seeking.C11751f.m30860a(r14, r13)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.dashboard.p076x.p077c.C3356b.C3357a.apply(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.c.b$b */
    public static final class C3358b<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return ((C3318o) t1).mo9819c() ? (Seekable) t2 : C11751f.m30859a();
        }
    }

    public C3356b(Context context, C3313j jVar, C12279e<C3335g> eVar, C12279e<C3318o> eVar2, C12279e<Boolean> eVar3, C3333f fVar, C11700c cVar, C11727c cVar2) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(jVar, "dataIdMapper");
        C12932j.m33818b(eVar, "domainObservable");
        C12932j.m33818b(eVar2, "queryStateObservable");
        C12932j.m33818b(eVar3, "editModeObservable");
        C12932j.m33818b(fVar, "recentlyViewedRepository");
        C12932j.m33818b(cVar, "bus");
        C12932j.m33818b(cVar2, "viewFactory");
        this.f9318f = context;
        this.f9319g = jVar;
        this.f9320h = eVar;
        this.f9321i = eVar2;
        this.f9322j = eVar3;
        this.f9323k = fVar;
        this.f9324l = cVar;
        this.f9325m = cVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e a = C12279e.m32609a((ObservableSource<? extends T1>) this.f9322j, (ObservableSource<? extends T2>) this.f9320h, (ObservableSource<? extends T3>) this.f9323k.mo9843a(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3357a<Object,Object,Object,Object>(this));
        C12774b bVar2 = C12774b.f33320a;
        C12279e<C3318o> eVar = this.f9321i;
        C12932j.m33815a((Object) a, "modelsObservable");
        C12279e<Seekable<C11722a>> a2 = C12279e.m32610a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) a, (BiFunction<? super T1, ? super T2, ? extends R>) new C3358b<Object,Object,Object>());
        C12932j.m33815a((Object) a2, "Observables.combineLates…)\n            }\n        }");
        return a2;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
