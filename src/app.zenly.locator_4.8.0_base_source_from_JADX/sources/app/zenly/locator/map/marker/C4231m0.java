package app.zenly.locator.map.marker;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import app.zenly.locator.core.manager.MeUserManager.C2629b;
import app.zenly.locator.core.models.C2907v;
import app.zenly.locator.p143s.p150n.C5459d;

/* renamed from: app.zenly.locator.map.marker.m0 */
public class C4231m0 extends C4178e0<UserCompassMarkerView> {

    /* renamed from: A */
    private Integer f11353A;

    /* renamed from: B */
    private Integer f11354B;

    /* renamed from: z */
    private C5459d f11355z;

    /* renamed from: app.zenly.locator.map.marker.m0$a */
    static /* synthetic */ class C4232a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11356a = new int[C2629b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                app.zenly.locator.core.manager.MeUserManager$b[] r0 = app.zenly.locator.core.manager.MeUserManager.C2629b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11356a = r0
                int[] r0 = f11356a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.LOCATION_CHANGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11356a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.HEADING_CHANGE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.C4231m0.C4232a.<clinit>():void");
        }
    }

    public C4231m0(Context context, String str) {
        super(context, str);
        mo11109e(false);
    }

    /* renamed from: b */
    private void m12590b(Integer num) {
        if (num != null && !num.equals(this.f11353A)) {
            this.f11353A = num;
            if (mo11112g() != null) {
                ((UserCompassMarkerView) mo11112g()).setHeading(num.intValue());
            }
        }
    }

    /* renamed from: A */
    public boolean mo11019A() {
        return (this.f11355z == null || this.f11354B == null || this.f11353A == null) ? false : true;
    }

    /* renamed from: a */
    public void mo11033a() {
        UserCompassMarkerView userCompassMarkerView = (UserCompassMarkerView) mo11112g();
        userCompassMarkerView.setBearing(this.f11354B.intValue());
        userCompassMarkerView.setHeading(this.f11353A.intValue());
    }

    /* renamed from: d */
    public float mo11069d() {
        return 0.5f;
    }

    /* renamed from: e */
    public float mo11070e() {
        return 0.0f;
    }

    /* renamed from: r */
    public UserCompassMarkerView m12598r() {
        UserCompassMarkerView userCompassMarkerView = new UserCompassMarkerView(mo11110f());
        userCompassMarkerView.setLayoutParams(new LayoutParams(-2, -2));
        return userCompassMarkerView;
    }

    /* renamed from: a */
    public void mo11230a(Integer num) {
        if (num != null && !num.equals(this.f11354B)) {
            this.f11354B = num;
            if (mo11112g() != null) {
                ((UserCompassMarkerView) mo11112g()).setBearing(num.intValue());
            }
        }
    }

    /* renamed from: b */
    private void m12589b(C5459d dVar) {
        this.f11355z = dVar;
        if (dVar != null) {
            mo11091a(dVar.mo13060b(), dVar.mo13062c());
        } else {
            mo11091a(Double.NaN, Double.NaN);
        }
    }

    /* renamed from: a */
    public void mo11229a(C2629b bVar, C2907v vVar) {
        if (bVar == null) {
            m12589b(vVar.f8252c);
            m12590b(vVar.f8254e);
            return;
        }
        int i = C4232a.f11356a[bVar.ordinal()];
        if (i == 1) {
            m12589b(vVar.f8252c);
        } else if (i == 2) {
            m12590b(vVar.f8254e);
        }
    }
}
