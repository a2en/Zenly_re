package app.zenly.locator.map.p116n1;

import app.zenly.locator.map.base.Map;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5458c;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;

/* renamed from: app.zenly.locator.map.n1.b */
public final class C4274b {
    /* renamed from: a */
    public static boolean m12688a(Map map, double d, double d2, double d3, double d4) {
        return C5457b.m15503a(map.getHorizontalPixelsPerDegreeAtCenter(), d, d2, d3, d4);
    }

    /* renamed from: b */
    public static double m12689b(Map map, C5460e eVar, int i) {
        int i2 = i * 2;
        return C5457b.m15498a(eVar, (float) (map.getMapViewWidth() - i2), (float) (map.getMapViewHeight() - i2), map.getMapTileSize(), map.getMaxZoom());
    }

    /* renamed from: a */
    public static C5458c m12687a(Map map, C5460e eVar, int i) {
        double b = m12689b(map, eVar, i);
        C5459d a = eVar.mo13067a();
        C5458c e = new C5458c().mo10961e(b);
        e.mo13052b(a.mo13060b());
        e.mo13053c(a.mo13062c());
        return e;
    }
}
