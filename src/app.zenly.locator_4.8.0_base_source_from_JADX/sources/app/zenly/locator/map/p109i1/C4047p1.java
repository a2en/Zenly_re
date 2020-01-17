package app.zenly.locator.map.p109i1;

import android.content.Context;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2881e;
import app.zenly.locator.core.models.C2881e.C2882a;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.p143s.p147k.C5441d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p406n.C12789c;
import p389io.reactivex.p406n.C12791d;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.map.i1.p1 */
public class C4047p1 {

    /* renamed from: e */
    private static C4047p1 f10634e;

    /* renamed from: a */
    private final C5441d<C2881e> f10635a;

    /* renamed from: b */
    private final C12791d<Map<String, C2881e>> f10636b = C12791d.m33470g(1);

    /* renamed from: c */
    private final C12789c<C2881e> f10637c = C12789c.m33462s();

    /* renamed from: d */
    private final C2718k5 f10638d;

    private C4047p1(Context context, C2718k5 k5Var) {
        this.f10638d = k5Var;
        this.f10635a = new C5441d<>(context, "discover_viewed", C2881e.getDefaultInstance());
        C12279e i = this.f10635a.mo13014a().mo36501i(C4001c1.f10552e);
        C12791d<Map<String, C2881e>> dVar = this.f10636b;
        dVar.getClass();
        i.mo36412a((Consumer<? super T>) new C4025k1<Object>(dVar), (Consumer<? super Throwable>) C4007e1.f10560e);
        C12279e a = this.f10637c.mo36426a((ObservableSource<? extends U>) this.f10636b, (BiFunction<? super T, ? super U, ? extends R>) C4010f1.f10565a).mo36428a(C12295a.m32802a());
        C12791d<Map<String, C2881e>> dVar2 = this.f10636b;
        dVar2.getClass();
        a.mo36455b((Consumer<? super T>) new C4025k1<Object>(dVar2)).mo36449b(10, TimeUnit.SECONDS).mo36428a(C12802a.m33491b()).mo36509m(new C3995a1(this)).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) C3998b1.f10549e, (Consumer<? super Throwable>) C4004d1.f10557e);
    }

    /* renamed from: a */
    public static C4047p1 m11729a(Context context) {
        if (f10634e == null) {
            f10634e = new C4047p1(context.getApplicationContext(), C2666b.m9049a(context).mo8763a());
        }
        return f10634e;
    }

    /* renamed from: a */
    static /* synthetic */ void m11733a(Boolean bool) throws Exception {
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<app.zenly.locator.core.models.e>, for r3v0, types: [java.util.List, java.util.List<app.zenly.locator.core.models.e>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.Map m11732a(java.util.List<app.zenly.locator.core.models.C2881e> r3) throws java.lang.Exception {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r3.next()
            app.zenly.locator.core.models.e r1 = (app.zenly.locator.core.models.C2881e) r1
            java.lang.String r2 = r1.getFriendUuid()
            r0.put(r2, r1)
            goto L_0x0009
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p109i1.C4047p1.m11732a(java.util.List):java.util.Map");
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo10703a(Map map) throws Exception {
        return this.f10635a.mo13016b(map.values());
    }

    /* renamed from: a */
    public C12279e<Map<String, C2881e>> mo10704a() {
        return this.f10636b;
    }

    /* renamed from: a */
    public void mo10706a(C2896p pVar) {
        C2882a newBuilder = C2881e.newBuilder();
        newBuilder.mo8951a(pVar.f8197a);
        newBuilder.setLatitude(pVar.f8199c.mo13060b());
        newBuilder.setLongitude(pVar.f8199c.mo13062c());
        newBuilder.mo8949a(pVar.f8202f);
        int i = pVar.f8216t;
        if (i != -1) {
            C2900b a = this.f10638d.mo8780a(i);
            if (a != null && a.f8226c && a.mo8984a()) {
                newBuilder.mo8950a((Iterable<String>) m11730a(a));
            }
        }
        this.f10637c.onNext(newBuilder.build());
    }

    /* renamed from: a */
    public void mo10707a(String str) {
        C2896p a = this.f10638d.mo8779a(str);
        if (a != null && a.mo8979d()) {
            mo10706a(a);
        }
    }

    /* renamed from: a */
    public void mo10705a(C2879d0 d0Var) {
        mo10707a(d0Var.mo8945g());
    }

    /* renamed from: a */
    private List<String> m11730a(C2900b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.f8240l.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2896p) it.next()).f8197a);
        }
        return arrayList;
    }
}
