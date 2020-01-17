package app.zenly.locator.map.marker;

import android.content.Context;
import android.util.SparseArray;
import app.zenly.locator.core.contracts.MapControllerContract.C2462e;
import app.zenly.locator.debug.C3439b;
import p333g.p339c.p344b.p345a.C12033b;

/* renamed from: app.zenly.locator.map.marker.d0 */
public class C4175d0 extends MarkerAdapter<C4171c0, GatheringMarkerView> {

    /* renamed from: h */
    private SparseArray<C4171c0> f11149h = new SparseArray<>();

    /* renamed from: i */
    private C2462e f11150i = C2462e.STATIC;

    /* renamed from: j */
    private final boolean f11151j;

    /* renamed from: k */
    private boolean f11152k;

    /* renamed from: app.zenly.locator.map.marker.d0$a */
    static /* synthetic */ class C4176a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11153a = new int[C2462e.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.core.contracts.MapControllerContract$e[] r0 = app.zenly.locator.core.contracts.MapControllerContract.C2462e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11153a = r0
                int[] r0 = f11153a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.contracts.MapControllerContract$e r1 = app.zenly.locator.core.contracts.MapControllerContract.C2462e.AUTO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11153a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.contracts.MapControllerContract$e r1 = app.zenly.locator.core.contracts.MapControllerContract.C2462e.SHADER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11153a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.contracts.MapControllerContract$e r1 = app.zenly.locator.core.contracts.MapControllerContract.C2462e.STATIC     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.C4175d0.C4176a.<clinit>():void");
        }
    }

    public C4175d0(Context context) {
        super("GatheringMarkerAdapter");
        this.f11151j = C12033b.m31704c(context) >= 2014;
    }

    /* renamed from: d */
    private boolean m12386d() {
        int i = C4176a.f11153a[this.f11150i.ordinal()];
        if (i != 1) {
            return i == 2;
        }
        return this.f11151j;
    }

    /* renamed from: e */
    private void m12387e() {
        boolean d = m12386d();
        for (C4171c0 l : mo10901a()) {
            l.mo11044l(d);
        }
    }

    /* renamed from: a */
    public void mo11082a(boolean z) {
        this.f11152k = z;
        for (C4171c0 n : mo10901a()) {
            n.mo11075n(!this.f11152k);
        }
    }

    /* renamed from: b */
    public void mo11083b(C4171c0 c0Var) {
        super.mo10909d(c0Var);
        this.f11149h.remove(c0Var.mo11063M());
        C3439b.m10684a().unregisterGatheringMarker(c0Var);
    }

    /* renamed from: c */
    public void mo10907c() {
        super.mo10907c();
        this.f11149h.clear();
        C3439b.m10684a().clearGatheringMarkers();
    }

    /* renamed from: a */
    public void mo11081a(C4171c0 c0Var) {
        super.mo10904a(c0Var);
        this.f11149h.put(c0Var.mo11063M(), c0Var);
        c0Var.mo11075n(!this.f11152k);
        c0Var.mo11044l(m12386d());
        C3439b.m10684a().registerGatheringMarker(c0Var);
    }

    /* renamed from: a */
    public C4171c0 mo11079a(int i) {
        return (C4171c0) this.f11149h.get(i);
    }

    /* renamed from: a */
    public void mo11080a(C2462e eVar) {
        if (eVar != this.f11150i) {
            this.f11150i = eVar;
            m12387e();
        }
    }
}
