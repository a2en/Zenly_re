package app.zenly.locator.map.marker;

import android.content.Context;
import android.graphics.Bitmap;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2511d;
import app.zenly.locator.core.manager.MeUserManager.C2629b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2907v;
import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.p143s.p150n.C5459d;

/* renamed from: app.zenly.locator.map.marker.n0 */
public class C4234n0 extends C4267y {

    /* renamed from: M */
    private final int f11358M = R.color.blue;

    /* renamed from: N */
    private final int f11359N = R.color.blue_black;

    /* renamed from: O */
    private float f11360O;

    /* renamed from: P */
    private C2907v f11361P;

    /* renamed from: Q */
    private boolean f11362Q = true;

    /* renamed from: R */
    private int f11363R = 0;

    /* renamed from: app.zenly.locator.map.marker.n0$a */
    static /* synthetic */ class C4235a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11364a = new int[C2629b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                app.zenly.locator.core.manager.MeUserManager$b[] r0 = app.zenly.locator.core.manager.MeUserManager.C2629b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11364a = r0
                int[] r0 = f11364a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.LOCATION_CHANGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11364a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.USER_UPDATE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11364a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.HAS_BRUMP_CHANGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11364a     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.MOVING_STATE_CHANGE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11364a     // Catch:{ NoSuchFieldError -> 0x0040 }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.SPEED_CHANGE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f11364a     // Catch:{ NoSuchFieldError -> 0x004b }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.SIGNIFICANT_PLACE_CHANGE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f11364a     // Catch:{ NoSuchFieldError -> 0x0056 }
                app.zenly.locator.core.manager.MeUserManager$b r1 = app.zenly.locator.core.manager.MeUserManager.C2629b.BUBBLE_CHANGE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.C4234n0.C4235a.<clinit>():void");
        }
    }

    public C4234n0(Context context, String str) {
        super(context, str);
        mo11092a(1.0f);
        mo11109e(false);
    }

    /* renamed from: N */
    private void m12599N() {
        m12606U();
    }

    /* renamed from: O */
    private void m12600O() {
        C5459d dVar = this.f11361P.f8252c;
        if (dVar != null) {
            mo11091a(dVar.mo13060b(), this.f11361P.f8252c.mo13062c());
        } else {
            mo11091a(Double.NaN, Double.NaN);
        }
    }

    /* renamed from: P */
    private void m12601P() {
        m12606U();
    }

    /* renamed from: Q */
    private void m12602Q() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2907v vVar = this.f11361P;
            avatarMarkerView.mo10824a(vVar.f8261l, vVar.f8262m);
        }
        m12604S();
    }

    /* renamed from: R */
    private void m12603R() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2879d0 d0Var = this.f11361P.f8250a;
            if (d0Var != null) {
                avatarMarkerView.setUser(d0Var);
            }
        }
    }

    /* renamed from: S */
    private void m12604S() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2911c f = this.f11361P.f8260k.mo8997f();
            boolean z = true;
            boolean z2 = f == C2911c.MOVING && (this.f11361P.f8261l > 0.0d || this.f11363R == 2);
            if (f != C2911c.STATIC) {
                z = false;
            }
            if (z2) {
                this.f11363R = 2;
            } else if (z) {
                this.f11363R = 3;
            } else {
                this.f11363R = 0;
            }
            avatarMarkerView.setBottomLeftDecoration(this.f11363R);
        }
    }

    /* renamed from: T */
    private void m12605T() {
        mo11041j((!mo11125z() && !mo11123x() && !this.f11362Q) || this.f11360O <= 0.8f);
    }

    /* renamed from: U */
    private void m12606U() {
        Bitmap bitmap;
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2907v vVar = this.f11361P;
            C2890k kVar = null;
            if (vVar.f8257h != C2918b.NONE) {
                bitmap = C2511d.m8764a(mo11110f().getResources(), this.f11361P.f8257h);
            } else {
                C2890k kVar2 = vVar.f8259j;
                bitmap = kVar2 != null ? kVar2.mo8961a() : null;
            }
            C2907v vVar2 = this.f11361P;
            if (vVar2.f8257h != C2918b.HOME) {
                kVar = vVar2.f8259j;
            }
            avatarMarkerView.mo10827a(bitmap, kVar);
        }
    }

    /* renamed from: A */
    public boolean mo11019A() {
        C2907v vVar = this.f11361P;
        return (vVar == null || vVar.f8252c == null) ? false : true;
    }

    /* renamed from: L */
    public void mo11021L() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.mo10837d(this.f11361P.f8258i);
        }
    }

    /* renamed from: M */
    public void mo11232M() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.setTimeOnTheSpot(this.f11361P.f8260k.mo8996e());
        }
        m12604S();
    }

    /* renamed from: a */
    public void mo11033a() {
        super.mo11033a();
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        C2879d0 d0Var = this.f11361P.f8250a;
        if (d0Var != null) {
            avatarMarkerView.setUser(d0Var);
        }
        avatarMarkerView.mo10825a(this.f11358M, this.f11359N);
        avatarMarkerView.mo10835c(true);
        avatarMarkerView.mo10829a(true);
        avatarMarkerView.mo10837d(this.f11361P.f8258i);
        C2907v vVar = this.f11361P;
        avatarMarkerView.mo10824a(vVar.f8261l, vVar.f8262m);
        avatarMarkerView.setTimeOnTheSpot(this.f11361P.f8260k.mo8996e());
        m12604S();
        m12606U();
    }

    /* renamed from: h */
    public void mo11039h(boolean z) {
        super.mo11039h(z);
        m12605T();
    }

    /* renamed from: k */
    public void mo11042k(boolean z) {
        super.mo11042k(z);
        m12605T();
        if (mo11125z()) {
            mo11221a(mo11219J(), true);
        } else {
            mo11221a(-1.0f, true);
        }
    }

    /* renamed from: a */
    public void mo11233a(C2629b bVar, C2907v vVar) {
        this.f11361P = vVar;
        if (bVar == null) {
            m12600O();
            m12603R();
            mo11021L();
            mo11232M();
            m12602Q();
            m12601P();
            m12599N();
            return;
        }
        switch (C4235a.f11364a[bVar.ordinal()]) {
            case 1:
                m12600O();
                return;
            case 2:
                m12603R();
                return;
            case 3:
                mo11021L();
                return;
            case 4:
                mo11232M();
                return;
            case 5:
                m12602Q();
                return;
            case 6:
                m12601P();
                return;
            case 7:
                m12599N();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo11034a(float f, float f2) {
        super.mo11034a(f, f2);
        this.f11360O = f;
        m12605T();
    }
}
