package app.zenly.locator.map.marker;

import android.content.Context;
import app.zenly.locator.p143s.p150n.C5464h;
import java.util.List;

/* renamed from: app.zenly.locator.map.marker.p0 */
public class C4240p0 extends C4187h0 {
    public C4240p0(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo11137a(C5464h hVar) {
        super.mo11137a(hVar);
        for (int i = 0; i < this.f11192B.size(); i++) {
            List a = ((MarkerAdapter) this.f11192B.get(i)).mo10901a();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Object obj = a.get(i2);
                if (obj instanceof C4231m0) {
                    ((C4231m0) obj).mo11230a(Integer.valueOf((int) this.f11199h.getCameraPosition().f14040a));
                }
            }
        }
    }
}
