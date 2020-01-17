package app.zenly.locator.map.p116n1;

import android.graphics.PointF;
import app.zenly.locator.core.util.C3193b;
import app.zenly.locator.map.base.Map;
import app.zenly.locator.map.p113l1.C4117b;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.n1.a */
public final class C4271a {

    /* renamed from: a */
    private final C4117b f11446a = new C4117b(this.f11449d.getMapTileSize());

    /* renamed from: b */
    private final C4273b f11447b = new C4273b(5);

    /* renamed from: c */
    private final C4272a f11448c = new C4272a(5);

    /* renamed from: d */
    private final Map f11449d;

    /* renamed from: app.zenly.locator.map.n1.a$a */
    public static final class C4272a extends C3193b<C5459d> {
        C4272a(int i) {
            super(i);
        }

        /* renamed from: a */
        public C5459d m12684a() {
            return new C5459d();
        }
    }

    /* renamed from: app.zenly.locator.map.n1.a$b */
    public static final class C4273b extends C3193b<PointF> {
        C4273b(int i) {
            super(i);
        }

        /* renamed from: a */
        public PointF m12686a() {
            return new PointF();
        }
    }

    public C4271a(Map map) {
        C12932j.m33818b(map, "map");
        this.f11449d = map;
    }

    /* renamed from: a */
    public final void mo11286a(C5460e eVar, int i, int i2, int i3, int i4) {
        C5460e eVar2 = eVar;
        C12932j.m33818b(eVar2, "bounds");
        Object acquire = this.f11448c.acquire();
        String str = "latLngPool.acquire()";
        C12932j.m33815a(acquire, str);
        C5459d dVar = (C5459d) acquire;
        Object acquire2 = this.f11448c.acquire();
        C12932j.m33815a(acquire2, str);
        C5459d dVar2 = (C5459d) acquire2;
        double d = eVar2.f14051d;
        double d2 = eVar2.f14048a;
        double d3 = eVar2.f14050c;
        double d4 = eVar2.f14049b;
        int i5 = 0;
        int i6 = 0;
        while (i6 <= 2) {
            C5459d a = eVar.mo13067a();
            double b = C4274b.m12689b(this.f11449d, eVar2, i5);
            int i7 = i6;
            double d5 = d4;
            this.f11446a.mo10792a((double) this.f11449d.getMapViewWidth(), (double) this.f11449d.getMapViewHeight(), a.mo13060b(), a.mo13062c(), b, 0.0d, 0.0d);
            dVar.mo13061b(d2);
            dVar.mo13063c(d);
            int i8 = i7;
            double d6 = d;
            double d7 = d5;
            m12681a(dVar, -((double) i), -((double) i2));
            dVar2.mo13061b(d7);
            dVar2.mo13063c(d3);
            C5459d dVar3 = dVar2;
            m12681a(dVar3, (double) i3, (double) i4);
            eVar2.f14048a = dVar.mo13060b();
            eVar2.f14051d = dVar.mo13062c();
            eVar2.f14049b = dVar2.mo13060b();
            eVar2.f14050c = dVar2.mo13062c();
            i6 = i8 + 1;
            d4 = d7;
            d = d6;
            i5 = 0;
        }
        this.f11448c.release(dVar);
        this.f11448c.release(dVar2);
    }

    /* renamed from: a */
    private final void m12681a(C5459d dVar, double d, double d2) {
        Object acquire = this.f11447b.acquire();
        C12932j.m33815a(acquire, "pointPool.acquire()");
        PointF pointF = (PointF) acquire;
        this.f11446a.mo10790a(dVar, pointF);
        this.f11446a.mo10791a(((double) pointF.x) + d, ((double) pointF.y) + d2, false, dVar);
        this.f11447b.release(pointF);
    }
}
