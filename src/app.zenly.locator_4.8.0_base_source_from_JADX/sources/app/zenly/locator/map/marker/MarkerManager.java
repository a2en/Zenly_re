package app.zenly.locator.map.marker;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.contracts.MapControllerContract.C2464g;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2908w.C2910b;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.map.base.Map;
import app.zenly.locator.map.base.Map.FinishCallback;
import app.zenly.locator.map.marker.C4167b0.C4169b;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.marker.C4217i0.C4218a;
import app.zenly.locator.map.marker.C4220j0.C4221a;
import app.zenly.locator.map.p108h1.C3990a;
import app.zenly.locator.map.p116n1.C4271a;
import app.zenly.locator.map.p116n1.C4274b;
import app.zenly.locator.map.p116n1.C4275c;
import app.zenly.locator.map.view.PrecisionCircleView;
import app.zenly.locator.p143s.p150n.C5458c;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import app.zenly.locator.p143s.p150n.C5460e.C5461a;
import app.zenly.locator.p143s.p150n.C5464h;
import app.zenly.locator.p143s.p151o.C5465a;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MarkerManager {

    /* renamed from: A */
    private boolean f10992A = false;

    /* renamed from: B */
    private double f10993B = 0.0d;

    /* renamed from: C */
    private double f10994C = 0.0d;

    /* renamed from: D */
    private double f10995D = 0.0d;

    /* renamed from: E */
    private C2458b f10996E = C2458b.NORMAL;

    /* renamed from: F */
    private final C5459d f10997F = new C5459d();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C4156d f10998G = new C4156d(this, null);

    /* renamed from: H */
    private final C4157e f10999H = new C4157e(this, null);
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C4159f f11000I = new C4159f(this, null);
    /* access modifiers changed from: private */

    /* renamed from: J */
    public ArrayList<C4178e0> f11001J = new ArrayList<>();

    /* renamed from: K */
    private final C4179a f11002K = new C4153a();

    /* renamed from: L */
    private final C4169b f11003L = new C4154b();

    /* renamed from: M */
    private final C4179a f11004M = new C4155c();

    /* renamed from: a */
    private final int f11005a;

    /* renamed from: b */
    private final int f11006b;

    /* renamed from: c */
    private final C5464h f11007c = new C5464h();

    /* renamed from: d */
    private final PointF f11008d;

    /* renamed from: e */
    private final PointF f11009e;

    /* renamed from: f */
    private final PointF f11010f;

    /* renamed from: g */
    private final PointF f11011g;

    /* renamed from: h */
    private final Context f11012h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map f11013i;

    /* renamed from: j */
    private final C4271a f11014j;

    /* renamed from: k */
    private final C4275c f11015k = new C4275c(50, 180, 50, 200);

    /* renamed from: l */
    private final C4275c f11016l = new C4275c(50, 180, 50, 20);

    /* renamed from: m */
    private final C4275c f11017m = new C4275c(80, 250, 80, 200);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f11018n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ArrayList<C4187h0> f11019o = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public PrecisionCircleView f11020p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C4178e0 f11021q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f11022r;

    /* renamed from: s */
    private Double f11023s;

    /* renamed from: t */
    private int f11024t;

    /* renamed from: u */
    private C2464g f11025u = C2464g.AUTO;

    /* renamed from: v */
    private MarkerManagerListener f11026v;

    /* renamed from: w */
    private int f11027w;

    /* renamed from: x */
    private int f11028x;

    /* renamed from: y */
    private int f11029y;

    /* renamed from: z */
    private int f11030z;

    public interface MarkerManagerListener {
        void onFollowMarkerChange(boolean z);

        void onMarkerSelectionChange(C4217i0 i0Var);

        void onMarkersSelectionChange(C4220j0 j0Var);
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerManager$a */
    class C4153a extends C4179a {
        C4153a() {
        }

        /* renamed from: a */
        public void mo10912a(C4178e0 e0Var, boolean z) {
            if (MarkerManager.this.f11021q == e0Var) {
                MarkerManager.this.f11020p.setColor(C5465a.m15551a(MarkerManager.this.f11021q.mo11073m(), 0.3f));
                MarkerManager.this.m12089p();
                MarkerManager.this.m12090q();
            }
        }

        /* renamed from: b */
        public void mo10913b(C4178e0 e0Var) {
            if (MarkerManager.this.f11021q == e0Var && e0Var.mo11122w()) {
                MarkerManager.this.m12086n();
                MarkerManager.this.m12089p();
            }
        }

        /* renamed from: c */
        public void mo10914c(C4178e0 e0Var) {
            if (MarkerManager.this.f11021q == e0Var && !e0Var.mo11019A()) {
                MarkerManager.this.m12091r();
                MarkerManager.this.m12064a(C4218a.LOST_POSITION, e0Var, false);
                MarkerManager.this.f11021q = null;
            }
        }

        /* renamed from: d */
        public void mo10915d(C4178e0 e0Var) {
            MarkerManager.this.m12089p();
        }

        /* renamed from: a */
        public void mo10954a(C4178e0 e0Var, double d) {
            if (MarkerManager.this.f11021q == e0Var && e0Var.mo11122w()) {
                if (MarkerManager.this.f11022r) {
                    MarkerManager.this.m12086n();
                }
                MarkerManager.this.m12090q();
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerManager$b */
    class C4154b extends C4169b {
        C4154b() {
        }

        /* renamed from: g */
        public void mo10912a(C4167b0 b0Var, boolean z) {
            if (MarkerManager.this.f11021q == b0Var) {
                MarkerManager.this.m12088o();
            }
        }

        /* renamed from: a */
        public void mo10787a(C4167b0 b0Var, C2910b bVar) {
            MarkerManager.this.m12086n();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerManager$c */
    class C4155c extends C4179a {
        C4155c() {
        }

        /* renamed from: b */
        public void mo10913b(C4178e0 e0Var) {
            MarkerManager.this.m12086n();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerManager$d */
    private final class C4156d extends C5458c {

        /* renamed from: f */
        private double f11034f;

        /* renamed from: g */
        private double f11035g;

        /* renamed from: h */
        private double f11036h;

        /* renamed from: i */
        private double f11037i;

        /* renamed from: j */
        private double f11038j;

        /* renamed from: k */
        private double f11039k;

        /* renamed from: l */
        private long f11040l;

        /* renamed from: m */
        private long f11041m;

        /* renamed from: n */
        private double f11042n;

        /* renamed from: o */
        private double f11043o;

        /* renamed from: p */
        private boolean f11044p;

        /* renamed from: q */
        private boolean f11045q;

        private C4156d() {
            this.f11034f = Double.NaN;
            this.f11035g = Double.NaN;
            this.f11036h = -1.0d;
            this.f11037i = Double.NaN;
            this.f11038j = Double.NaN;
            this.f11039k = -1.0d;
            this.f11040l = 0;
            this.f11041m = 0;
            this.f11042n = 0.0d;
            this.f11043o = 0.0d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo10958b() {
            return this.f11045q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo10959c() {
            return this.f11044p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo10960d() {
            this.f14041b = this.f11037i;
            this.f14042c = this.f11038j;
            this.f14044e = this.f11039k;
            this.f11045q = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C4156d mo10963f(double d) {
            if (!MarkerManager.this.f11018n) {
                mo10961e(d);
                return this;
            }
            double d2 = this.f14044e;
            if (d2 <= -1.0d) {
                d2 = MarkerManager.this.f11013i.getCameraPosition().f14044e;
            }
            this.f11036h = d2;
            this.f11039k = d;
            this.f11041m = System.currentTimeMillis();
            this.f11043o = Math.min((Math.abs(this.f11039k - this.f11036h) / 1.0d) * 1000.0d, 800.0d);
            return this;
        }

        /* renamed from: a */
        public C4156d mo10956a(C5459d dVar) {
            super.mo10956a(dVar);
            double d = Double.NaN;
            this.f11037i = dVar != null ? dVar.mo13060b() : Double.NaN;
            if (dVar != null) {
                d = dVar.mo13062c();
            }
            this.f11038j = d;
            this.f11042n = 0.0d;
            return this;
        }

        /* renamed from: e */
        public C4156d mo10961e(double d) {
            super.mo10961e(d);
            this.f11039k = d;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
            if (java.lang.Double.isNaN(r3) == false) goto L_0x0023;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10962e() {
            /*
                r18 = this;
                r0 = r18
                double r1 = r0.f14041b
                double r3 = r0.f11037i
                r5 = 1
                r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r8 = 0
                int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r10 == 0) goto L_0x0015
                boolean r1 = java.lang.Double.isNaN(r3)
                if (r1 == 0) goto L_0x0023
            L_0x0015:
                double r1 = r0.f14042c
                double r3 = r0.f11038j
                int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r10 == 0) goto L_0x007a
                boolean r1 = java.lang.Double.isNaN(r3)
                if (r1 != 0) goto L_0x007a
            L_0x0023:
                double r1 = r0.f11042n
                int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r3 <= 0) goto L_0x0035
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r0.f11040l
                long r1 = r1 - r3
                double r1 = (double) r1
                double r3 = r0.f11042n
                double r1 = r1 / r3
                goto L_0x0036
            L_0x0035:
                r1 = r6
            L_0x0036:
                double r1 = java.lang.Math.max(r8, r1)
                double r1 = java.lang.Math.min(r1, r6)
                double r3 = r0.f14041b
                double r12 = r0.f11037i
                int r10 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                if (r10 == 0) goto L_0x004f
                double r10 = r0.f11034f
                r14 = r1
                double r3 = app.zenly.locator.p143s.p150n.C5457b.m15509b(r10, r12, r14)
                r0.f14041b = r3
            L_0x004f:
                double r3 = r0.f14042c
                double r12 = r0.f11038j
                int r10 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                if (r10 == 0) goto L_0x0060
                double r10 = r0.f11035g
                r14 = r1
                double r1 = app.zenly.locator.p143s.p150n.C5457b.m15509b(r10, r12, r14)
                r0.f14042c = r1
            L_0x0060:
                double r10 = r0.f14041b
                double r12 = r0.f14042c
                double r14 = r0.f11037i
                double r1 = r0.f11038j
                r16 = r1
                boolean r1 = app.zenly.locator.p143s.p150n.C5457b.m15510b(r10, r12, r14, r16)
                if (r1 != 0) goto L_0x0072
                r1 = 1
                goto L_0x007b
            L_0x0072:
                double r1 = r0.f11037i
                r0.f14041b = r1
                double r1 = r0.f11038j
                r0.f14042c = r1
            L_0x007a:
                r1 = 0
            L_0x007b:
                double r2 = r0.f14044e
                double r10 = r0.f11039k
                int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x00bf
                double r2 = r0.f11043o
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 <= 0) goto L_0x0095
                long r2 = java.lang.System.currentTimeMillis()
                long r10 = r0.f11041m
                long r2 = r2 - r10
                double r2 = (double) r2
                double r10 = r0.f11043o
                double r2 = r2 / r10
                goto L_0x0096
            L_0x0095:
                r2 = r6
            L_0x0096:
                double r2 = java.lang.Math.max(r8, r2)
                double r2 = java.lang.Math.min(r2, r6)
                double r6 = r0.f11036h
                double r8 = r0.f11039k
                double r10 = r8 - r6
                double r10 = r10 * r2
                double r6 = r6 + r10
                r0.f14044e = r6
                double r2 = r0.f14044e
                double r2 = r2 - r8
                double r2 = java.lang.Math.abs(r2)
                r6 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
                int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x00bb
                r1 = 1
                goto L_0x00bf
            L_0x00bb:
                double r2 = r0.f11039k
                r0.f14044e = r2
            L_0x00bf:
                r1 = r1 ^ r5
                r0.f11045q = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.MarkerManager.C4156d.mo10962e():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C4156d mo10957a(C5459d dVar, boolean z) {
            if (!MarkerManager.this.f11018n) {
                mo10956a(dVar);
                return this;
            }
            this.f11034f = !Double.isNaN(this.f14041b) ? this.f14041b : MarkerManager.this.f11013i.getCameraPosition().f14041b;
            this.f11035g = !Double.isNaN(this.f14042c) ? this.f14042c : MarkerManager.this.f11013i.getCameraPosition().f14042c;
            this.f11037i = dVar.mo13060b();
            this.f11038j = dVar.mo13062c();
            this.f11040l = System.currentTimeMillis();
            this.f11044p = z;
            this.f11042n = (double) Math.min((C3225m.m10225a(this.f11034f, this.f11035g, this.f11037i, this.f11038j) / 10.0f) * 1000.0f, 800.0f);
            return this;
        }

        /* synthetic */ C4156d(MarkerManager markerManager, C4153a aVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerManager$e */
    private final class C4157e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Handler f11047a;

        /* renamed from: b */
        private boolean f11048b;

        /* renamed from: c */
        private boolean f11049c;

        /* renamed from: d */
        private boolean f11050d;

        /* renamed from: e */
        private boolean f11051e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f11052f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f11053g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final FinishCallback f11054h;

        /* renamed from: i */
        private final Runnable f11055i;

        /* renamed from: app.zenly.locator.map.marker.MarkerManager$e$a */
        class C4158a implements Runnable {
            C4158a() {
            }

            public void run() {
                if (C4157e.this.mo10970e()) {
                    if (!C4157e.this.mo10968c()) {
                        C4157e.this.m12153k();
                        C4157e.this.f11047a.postDelayed(this, 100);
                        return;
                    }
                    MarkerManager.this.f10998G.mo10962e();
                    boolean c = MarkerManager.this.f10998G.mo10959c();
                    if (c != C4157e.this.f11052f && (!c || MarkerManager.this.f10998G.mo10958b())) {
                        C4157e.this.f11052f = c;
                        if (!c) {
                            C4157e.this.f11053g = false;
                        }
                    }
                    C4157e.this.m12153k();
                    C5458c cameraPosition = MarkerManager.this.f11013i.getCameraPosition();
                    C4157e eVar = C4157e.this;
                    if (eVar.m12147a(cameraPosition, (C5458c) MarkerManager.this.f10998G)) {
                        MarkerManager.this.f11013i.animateCamera(MarkerManager.this.f10998G, 100, C4157e.this.f11054h);
                    } else {
                        C4157e.this.f11054h.onFinish(true);
                    }
                    C4157e.this.f11047a.postDelayed(this, 100);
                }
            }
        }

        private C4157e() {
            this.f11047a = new Handler();
            this.f11054h = new C4241q(this);
            this.f11055i = new C4158a();
        }

        /* renamed from: j */
        private void m12152j() {
            this.f11047a.removeCallbacks(this.f11055i);
            MarkerManager.this.f10998G.mo10960d();
            m12153k();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public void m12153k() {
            MarkerManager.this.f11000I.mo10976a(mo10970e() && mo10968c() && this.f11053g);
        }

        /* renamed from: l */
        private void m12154l() {
            this.f11055i.run();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo10970e() {
            return this.f11048b && this.f11049c;
        }

        /* renamed from: f */
        public void mo10971f() {
            if (this.f11049c) {
                this.f11049c = false;
                m12152j();
            }
        }

        /* renamed from: g */
        public void mo10972g() {
            if (!this.f11049c) {
                this.f11049c = true;
                if (mo10970e()) {
                    m12154l();
                }
            }
        }

        /* renamed from: h */
        public void mo10973h() {
            if (!this.f11048b) {
                this.f11048b = true;
                if (mo10970e()) {
                    m12154l();
                }
            }
        }

        /* renamed from: i */
        public void mo10974i() {
            if (this.f11048b) {
                this.f11048b = false;
                m12152j();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo10968c() {
            return this.f11051e && this.f11050d && ((MarkerManager.this.f11021q != null && MarkerManager.this.f11021q.mo11122w()) || MarkerManager.this.f11001J.size() > 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo10969d() {
            return this.f11050d;
        }

        /* renamed from: b */
        public void mo10966b() {
            this.f11051e = true;
        }

        /* renamed from: a */
        public void mo10964a() {
            this.f11051e = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo10967b(boolean z) {
            this.f11050d = z;
        }

        /* synthetic */ C4157e(MarkerManager markerManager, C4153a aVar) {
            this();
        }

        /* renamed from: a */
        public /* synthetic */ void mo10965a(boolean z) {
            if (z) {
                boolean z2 = this.f11052f;
                if (z2 != this.f11053g) {
                    this.f11053g = z2;
                }
            }
            m12153k();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            if (app.zenly.locator.map.p116n1.C4274b.m12688a(app.zenly.locator.map.marker.MarkerManager.m12071c(r17.f11056j), r1.f14041b, r1.f14042c, r0.f14041b, r0.f14042c) != false) goto L_0x0051;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean m12147a(app.zenly.locator.p143s.p150n.C5458c r18, app.zenly.locator.p143s.p150n.C5458c r19) {
            /*
                r17 = this;
                r0 = r18
                r1 = r19
                double r2 = r1.f14041b
                double r4 = r0.f14041b
                r6 = 1
                r7 = 0
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 != 0) goto L_0x001a
                double r2 = r1.f14042c
                double r4 = r0.f14042c
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L_0x0017
                goto L_0x001a
            L_0x0017:
                r2 = r17
                goto L_0x0051
            L_0x001a:
                double r2 = r1.f14041b
                boolean r2 = java.lang.Double.isNaN(r2)
                if (r2 != 0) goto L_0x0053
                double r2 = r1.f14042c
                boolean r2 = java.lang.Double.isNaN(r2)
                if (r2 != 0) goto L_0x0053
                double r2 = r0.f14041b
                boolean r2 = java.lang.Double.isNaN(r2)
                if (r2 != 0) goto L_0x0053
                double r2 = r0.f14042c
                boolean r2 = java.lang.Double.isNaN(r2)
                if (r2 != 0) goto L_0x0053
                r2 = r17
                app.zenly.locator.map.marker.MarkerManager r3 = app.zenly.locator.map.marker.MarkerManager.this
                app.zenly.locator.map.base.Map r8 = r3.f11013i
                double r9 = r1.f14041b
                double r11 = r1.f14042c
                double r13 = r0.f14041b
                double r3 = r0.f14042c
                r15 = r3
                boolean r3 = app.zenly.locator.map.p116n1.C4274b.m12688a(r8, r9, r11, r13, r15)
                if (r3 == 0) goto L_0x0055
            L_0x0051:
                r3 = 1
                goto L_0x0056
            L_0x0053:
                r2 = r17
            L_0x0055:
                r3 = 0
            L_0x0056:
                double r4 = r1.f14040a
                r8 = 4591870180174331904(0x3fb99999a0000000, double:0.10000000149011612)
                r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r12 == 0) goto L_0x0075
                double r12 = r0.f14040a
                int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r14 == 0) goto L_0x0073
                double r12 = r12 - r4
                double r4 = java.lang.Math.abs(r12)
                int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r12 >= 0) goto L_0x0073
                goto L_0x0075
            L_0x0073:
                r4 = 0
                goto L_0x0076
            L_0x0075:
                r4 = 1
            L_0x0076:
                double r12 = r1.f14043d
                int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x008e
                double r14 = r0.f14043d
                int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x008c
                double r14 = r14 - r12
                double r12 = java.lang.Math.abs(r14)
                int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r5 >= 0) goto L_0x008c
                goto L_0x008e
            L_0x008c:
                r5 = 0
                goto L_0x008f
            L_0x008e:
                r5 = 1
            L_0x008f:
                double r12 = r1.f14044e
                int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r1 == 0) goto L_0x00a7
                double r0 = r0.f14044e
                int r14 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
                if (r14 == 0) goto L_0x00a5
                double r0 = r0 - r12
                double r0 = java.lang.Math.abs(r0)
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r10 >= 0) goto L_0x00a5
                goto L_0x00a7
            L_0x00a5:
                r0 = 0
                goto L_0x00a8
            L_0x00a7:
                r0 = 1
            L_0x00a8:
                if (r3 == 0) goto L_0x00b2
                if (r4 == 0) goto L_0x00b2
                if (r5 == 0) goto L_0x00b2
                if (r0 != 0) goto L_0x00b1
                goto L_0x00b2
            L_0x00b1:
                r6 = 0
            L_0x00b2:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.MarkerManager.C4157e.m12147a(app.zenly.locator.s.n.c, app.zenly.locator.s.n.c):boolean");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerManager$f */
    private final class C4159f {

        /* renamed from: a */
        private boolean f11058a;

        private C4159f() {
            this.f11058a = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10976a(boolean z) {
            if (z != this.f11058a) {
                this.f11058a = z;
                for (int i = 0; i < MarkerManager.this.f11019o.size(); i++) {
                    ((C4187h0) MarkerManager.this.f11019o.get(i)).setCenterFocusedMarker(this.f11058a);
                }
            }
        }

        /* synthetic */ C4159f(MarkerManager markerManager, C4153a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo10977a() {
            return this.f11058a;
        }
    }

    public MarkerManager(Context context, Map map) {
        this.f11012h = context;
        this.f11013i = map;
        this.f11014j = new C4271a(map);
        this.f11015k.mo11288a(context);
        this.f11016l.mo11288a(context);
        this.f11017m.mo11288a(context);
        this.f11005a = C3200e0.m10183a(context, 100);
        this.f11006b = C3200e0.m10183a(context, -50);
        int i = this.f11005a;
        this.f11008d = new PointF((float) (-i), (float) (-i));
        this.f11009e = new PointF(0.0f, (float) (-this.f11005a));
        this.f11010f = new PointF(0.0f, 0.0f);
        this.f11011g = new PointF((float) (-this.f11005a), 0.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m12088o() {
        C4178e0 e0Var = this.f11021q;
        if (e0Var instanceof C4167b0) {
            C4167b0 b0Var = (C4167b0) e0Var;
            b0Var.mo11044l(!b0Var.mo11122w());
            b0Var.mo11045m(!b0Var.mo11122w());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m12089p() {
        C4178e0 e0Var = this.f11021q;
        if (e0Var == null || !e0Var.mo11122w()) {
            this.f11020p.setCenter(null);
            return;
        }
        PointF pointF = new PointF();
        if (this.f11021q.mo11020B()) {
            this.f11021q.mo11096a(pointF);
            pointF.set(this.f11021q.mo11113j().x + pointF.x, this.f11021q.mo11113j().y + pointF.y);
        } else {
            this.f11013i.toScreenLocation(this.f11021q.mo11114k(), pointF);
        }
        this.f11020p.setCenter(pointF);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m12090q() {
        C4178e0 e0Var = this.f11021q;
        if (e0Var == null || !e0Var.mo11122w()) {
            this.f11020p.setPrecision(0.0d);
        } else {
            this.f11020p.setPrecision(this.f11021q.mo11043l());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m12091r() {
        this.f11021q.mo11038g(false);
        this.f11021q.mo11042k(false);
        this.f11021q.mo11105b(this.f11002K);
        C4178e0 e0Var = this.f11021q;
        if (e0Var instanceof C4167b0) {
            e0Var.mo11105b((C4179a) this.f11003L);
        }
    }

    /* renamed from: k */
    private C5460e m12081k() {
        ArrayList arrayList = new ArrayList();
        C2896p P = ((C4167b0) this.f11021q).mo11025P();
        if (P.f8222z.mo8995d().mo9009g()) {
            m12061a(P.f8222z.mo8995d(), (List<C5459d>) arrayList);
        }
        C5460e a = C5460e.m15530a((List<C5459d>) arrayList);
        m12067b(a);
        return a;
    }

    /* renamed from: l */
    private C2464g m12082l() {
        C4178e0 e0Var = this.f11021q;
        if (!(e0Var instanceof C4167b0)) {
            return C2464g.ALL;
        }
        return C3990a.m11641a(this.f11025u, ((C4167b0) e0Var).mo11025P());
    }

    /* renamed from: m */
    private C5460e m12084m() {
        C5460e a = C5460e.m15531a(this.f11021q.mo11114k(), this.f10997F);
        m12067b(a);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m12086n() {
        if (this.f10999H.mo10968c()) {
            if (this.f11021q != null && this.f10999H.mo10969d()) {
                if (this.f10996E != C2458b.NORMAL || (m12070b(this.f11021q) && m12082l() != C2464g.MARKER)) {
                    C2458b bVar = this.f10996E;
                    if (bVar != C2458b.GATHERING) {
                        if (bVar == C2458b.MEET && this.f11022r) {
                            C5460e m = m12084m();
                            C4156d dVar = this.f10998G;
                            dVar.mo10957a(m.mo13067a(), false);
                            dVar.mo10963f(m12059a(m));
                        } else if (!m12070b(this.f11021q) || !this.f11022r) {
                            this.f10998G.mo10956a((C5459d) null);
                            this.f10998G.mo10961e(-1.0d);
                        } else {
                            C5460e k = m12081k();
                            C4156d dVar2 = this.f10998G;
                            dVar2.mo10957a(k.mo13067a(), false);
                            dVar2.mo10963f(m12059a(k));
                        }
                    }
                }
                this.f10998G.mo10957a(this.f11021q.mo11114k(), true);
                if (this.f11022r) {
                    this.f10998G.mo10963f(m12058a(this.f11021q.mo11114k(), this.f11021q.mo11043l(), this.f11021q.mo11071h()));
                } else {
                    Double d = this.f11023s;
                    if (d != null) {
                        this.f10998G.mo10961e(d.doubleValue());
                    } else {
                        this.f10998G.mo10961e(-1.0d);
                    }
                }
            } else if (this.f11001J.size() > 0) {
                C5461a aVar = new C5461a();
                Iterator it = this.f11001J.iterator();
                while (it.hasNext()) {
                    aVar.mo13073a(((C4178e0) it.next()).mo11114k());
                }
                C5460e a = aVar.mo13072a();
                m12067b(a);
                this.f10998G.mo10957a(a.mo13067a(), false);
                if (this.f11022r) {
                    this.f10998G.mo10963f(m12059a(a));
                } else {
                    Double d2 = this.f11023s;
                    if (d2 != null) {
                        this.f10998G.mo10961e(d2.doubleValue());
                    } else {
                        this.f10998G.mo10961e(-1.0d);
                    }
                }
            } else {
                this.f10998G.mo10956a((C5459d) null);
                this.f10998G.mo10961e(-1.0d);
            }
        }
    }

    /* renamed from: b */
    public void mo10938b(boolean z) {
        boolean z2 = z != this.f10999H.mo10969d();
        this.f10999H.mo10967b(z);
        if (this.f11021q != null) {
            m12086n();
        }
        if (z2) {
            MarkerManagerListener markerManagerListener = this.f11026v;
            if (markerManagerListener != null) {
                markerManagerListener.onFollowMarkerChange(z);
            }
        }
    }

    /* renamed from: c */
    public void mo10942c(boolean z) {
        mo10933a(null, z);
    }

    /* renamed from: d */
    public void mo10944d(boolean z) {
        mo10929a(z, false);
    }

    /* renamed from: e */
    public boolean mo10945e() {
        return this.f11001J.size() > 0;
    }

    /* renamed from: f */
    public boolean mo10946f() {
        return this.f11021q != null;
    }

    /* renamed from: g */
    public boolean mo10947g() {
        return this.f11021q != null && this.f11000I.mo10977a();
    }

    /* renamed from: h */
    public void mo10948h() {
        this.f11010f.x = (float) (this.f11013i.getMapViewWidth() + this.f11005a);
        this.f11010f.y = (float) (this.f11013i.getMapViewHeight() + this.f11005a);
        PointF pointF = this.f11009e;
        PointF pointF2 = this.f11010f;
        pointF.x = pointF2.x;
        this.f11011g.y = pointF2.y;
        this.f11013i.fromScreenLocation(this.f11008d, this.f11007c.f14060a);
        this.f11013i.fromScreenLocation(this.f11009e, this.f11007c.f14061b);
        this.f11013i.fromScreenLocation(this.f11010f, this.f11007c.f14063d);
        this.f11013i.fromScreenLocation(this.f11011g, this.f11007c.f14062c);
        for (int i = 0; i < this.f11019o.size(); i++) {
            ((C4187h0) this.f11019o.get(i)).mo11137a(this.f11007c);
        }
        this.f11020p.mo11479a();
    }

    /* renamed from: i */
    public void mo10949i() {
        this.f11018n = false;
        this.f10999H.mo10971f();
    }

    /* renamed from: j */
    public void mo10950j() {
        this.f11018n = true;
        C4178e0 e0Var = this.f11021q;
        if ((e0Var != null && e0Var.mo11122w()) || this.f11001J.size() > 0) {
            this.f11013i.animateCamera(this.f10998G, 1, null);
        }
        this.f10999H.mo10972g();
    }

    /* renamed from: e */
    private void m12074e(boolean z) {
        if (this.f10992A) {
            this.f10992A = false;
            C5458c cVar = new C5458c();
            cVar.mo13054d(this.f10995D);
            cVar.mo13049a(this.f10994C);
            double max = Math.max(this.f10993B, 14.0d);
            if (max < this.f11013i.getCameraPosition().f14044e) {
                cVar.mo10961e(max);
            }
            if (z) {
                this.f11013i.animateCamera(cVar, 500, null);
            } else {
                this.f11013i.animateCamera(cVar, 1, null);
            }
        }
    }

    /* renamed from: c */
    public void mo10941c(List<C4178e0> list, boolean z) {
        if (mo10946f()) {
            mo10929a(false, z);
        }
        ArrayList arrayList = new ArrayList();
        for (C4178e0 k : list) {
            arrayList.add(k.mo11114k());
        }
        C5460e a = C5460e.m15530a((List<C5459d>) arrayList);
        m12067b(a);
        this.f11013i.animateCamera(C4274b.m12687a(this.f11013i, a, 0), 400, null);
    }

    /* renamed from: d */
    public C4178e0 mo10943d() {
        return this.f11021q;
    }

    /* renamed from: a */
    public void mo10921a(int i, int i2, int i3, int i4) {
        this.f11028x = i;
        this.f11027w = i2;
        this.f11029y = i3;
        this.f11030z = i4;
        for (int i5 = 0; i5 < this.f11019o.size(); i5++) {
            ((C4187h0) this.f11019o.get(i5)).mo11133a(i, i2, i3, i4);
        }
        if (this.f11021q != null) {
            m12086n();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo10937b(List list, boolean z) {
        if (this.f11001J.equals(list)) {
            this.f10999H.mo10966b();
            this.f10999H.mo10967b(true);
            m12086n();
        }
    }

    /* renamed from: a */
    public void mo10927a(PrecisionCircleView precisionCircleView) {
        this.f11020p = precisionCircleView;
        this.f11020p.setPrecisionCalculator(new C4262t(this));
    }

    /* renamed from: b */
    public List<C4178e0> mo10936b() {
        return this.f11001J;
    }

    /* renamed from: c */
    public List<C4187h0> mo10940c() {
        return this.f11019o;
    }

    /* renamed from: b */
    public boolean mo10939b(C4178e0 e0Var, boolean z, boolean z2) {
        return m12066a(e0Var, z, z2, -1);
    }

    /* renamed from: b */
    private void m12068b(boolean z, boolean z2) {
        this.f10999H.mo10964a();
        int i = this.f11024t;
        if (i == -1) {
            this.f11022r = true;
            this.f11023s = null;
        } else if (i == -2) {
            this.f11022r = false;
            this.f11023s = null;
        } else {
            this.f11022r = false;
            this.f11023s = Double.valueOf(m12058a(this.f11021q.mo11114k(), (double) this.f11024t, this.f11021q.mo11071h()));
        }
        if (this.f10996E == C2458b.MEET) {
            C5460e m = m12084m();
            this.f10998G.mo10956a(m.mo13067a());
            this.f10998G.mo10961e(m12059a(m));
        } else if (!m12070b(this.f11021q) || m12082l() == C2464g.MARKER) {
            this.f10998G.mo10956a(this.f11021q.mo11114k());
            int i2 = this.f11024t;
            if (i2 != -2) {
                this.f10998G.mo10961e(m12058a(this.f11021q.mo11114k(), i2 == -1 ? this.f11021q.mo11043l() : (double) i2, this.f11021q.mo11071h()));
            }
        } else {
            C5460e k = m12081k();
            this.f10998G.mo10956a(k.mo13067a());
            this.f10998G.mo10961e(m12059a(k));
        }
        this.f10998G.mo13049a(0.0d);
        this.f10998G.mo13054d(0.0d);
        C4260r rVar = new C4260r(this, this.f11021q, z2);
        if (z) {
            this.f11013i.animateCamera(this.f10998G, 400, rVar);
        } else {
            this.f11013i.animateCamera(this.f10998G, 1, rVar);
        }
    }

    /* renamed from: a */
    public /* synthetic */ float mo10918a(double d) {
        C4178e0 e0Var = this.f11021q;
        if (e0Var == null) {
            return 0.0f;
        }
        return (float) (d / this.f11013i.getMetersPerPixelAtLatitude(e0Var.mo11114k().mo13060b()));
    }

    /* renamed from: a */
    public void mo10922a(C2458b bVar) {
        if (this.f10996E != bVar) {
            this.f10996E = bVar;
            m12090q();
            m12088o();
            if (this.f11021q != null) {
                m12068b(true, false);
            }
        }
    }

    /* renamed from: a */
    public C2458b mo10919a() {
        return this.f10996E;
    }

    /* renamed from: a */
    public void mo10923a(C2464g gVar) {
        this.f11025u = gVar;
        if (this.f11021q != null) {
            m12068b(true, false);
        }
    }

    /* renamed from: a */
    public boolean mo10933a(List<C4178e0> list, boolean z) {
        return mo10934a(list, z, false);
    }

    /* renamed from: a */
    public boolean mo10934a(List<C4178e0> list, boolean z, boolean z2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f10999H.mo10974i();
        boolean z3 = false;
        if (this.f11021q != null) {
            m12091r();
            m12064a(C4218a.UNSELECT, this.f11021q, false);
            this.f11021q = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11001J.iterator();
        while (it.hasNext()) {
            C4178e0 e0Var = (C4178e0) it.next();
            if (!list.contains(e0Var)) {
                e0Var.mo11039h(false);
                e0Var.mo11105b(this.f11004M);
                arrayList.add(e0Var);
            }
        }
        this.f11001J.removeAll(arrayList);
        for (C4178e0 e0Var2 : list) {
            if (e0Var2.mo11019A() && !this.f11001J.contains(e0Var2)) {
                this.f11001J.add(e0Var2);
                e0Var2.mo11099a(this.f11004M);
                e0Var2.mo11039h(true);
            }
        }
        if (this.f11001J.size() > 0) {
            if (!this.f10992A) {
                this.f10992A = true;
                this.f10993B = this.f11013i.getCameraPosition().f14044e;
                this.f10995D = this.f11013i.getCameraPosition().f14043d;
                this.f10994C = this.f11013i.getCameraPosition().f14040a;
            }
            this.f11022r = true;
            C5461a aVar = new C5461a();
            Iterator it2 = this.f11001J.iterator();
            while (it2.hasNext()) {
                aVar.mo13073a(((C4178e0) it2.next()).mo11114k());
            }
            C5460e a = aVar.mo13072a();
            m12067b(a);
            this.f10998G.mo10956a(a.mo13067a());
            this.f10998G.mo10961e(m12059a(a));
            this.f10998G.mo13049a(0.0d);
            this.f10998G.mo13054d(0.0d);
            C4261s sVar = new C4261s(this, new ArrayList(this.f11001J));
            this.f10999H.mo10964a();
            this.f10999H.mo10973h();
            if (z) {
                this.f11013i.animateCamera(this.f10998G, 400, sVar);
            } else {
                this.f11013i.animateCamera(this.f10998G, 1, sVar);
            }
            m12065a(C4221a.FOLLOW, (List<C4178e0>) this.f11001J, z2);
            return true;
        } else if (arrayList.size() > 0) {
            m12074e(z);
            m12065a(C4221a.UNFOLLOW, (List<C4178e0>) arrayList, z2);
            return true;
        } else {
            if (list.size() == 0) {
                z3 = true;
            }
            return z3;
        }
    }

    /* renamed from: b */
    private void m12067b(C5460e eVar) {
        C4275c cVar;
        if (this.f10996E == C2458b.MEET) {
            cVar = this.f11016l;
        } else if (m12070b(this.f11021q)) {
            cVar = this.f11017m;
        } else {
            cVar = this.f11015k;
        }
        this.f11014j.mo11286a(eVar, cVar.mo11289b(), cVar.mo11291d(), cVar.mo11290c(), cVar.mo11287a());
    }

    /* renamed from: b */
    private boolean m12070b(C4178e0 e0Var) {
        return (e0Var instanceof C4167b0) && ((C4167b0) e0Var).mo11025P().f8222z.mo8994c();
    }

    /* renamed from: a */
    public boolean mo10935a(boolean z, boolean z2, boolean z3) {
        if (this.f11021q != null) {
            if (z3) {
                this.f10992A = false;
            }
            mo10929a(z, z2);
            return true;
        } else if (this.f11001J.size() <= 0) {
            return false;
        } else {
            if (z3) {
                this.f10992A = false;
            }
            mo10934a(null, z, z2);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo10930a(C4178e0 e0Var) {
        return mo10931a(e0Var, true);
    }

    /* renamed from: a */
    public boolean mo10931a(C4178e0 e0Var, boolean z) {
        return mo10939b(e0Var, z, false);
    }

    /* renamed from: a */
    public boolean mo10932a(C4178e0 e0Var, boolean z, int i) {
        return m12066a(e0Var, z, false, i);
    }

    /* renamed from: a */
    private boolean m12066a(C4178e0 e0Var, boolean z, boolean z2, int i) {
        C4218a aVar;
        if (e0Var != null && !e0Var.mo11121v()) {
            return false;
        }
        if (this.f11001J.size() > 0) {
            Iterator it = this.f11001J.iterator();
            while (it.hasNext()) {
                C4178e0 e0Var2 = (C4178e0) it.next();
                e0Var2.mo11039h(false);
                e0Var2.mo11105b(this.f11004M);
            }
            ArrayList arrayList = new ArrayList(this.f11001J);
            this.f11001J.clear();
            m12065a(C4221a.UNFOLLOW, (List<C4178e0>) arrayList, false);
        }
        if (e0Var != this.f11021q) {
            this.f10999H.mo10974i();
            if (e0Var == null) {
                this.f11022r = false;
                if (this.f11021q != null) {
                    m12091r();
                    m12064a(C4218a.UNSELECT, this.f11021q, z2);
                    this.f11021q = null;
                }
                m12074e(z);
            } else if (!e0Var.mo11019A()) {
                return false;
            } else {
                if (z2) {
                    C5498a.m15600a(this.f11012h).mo13123a(C5501c.LIGHT, C5500b.MAP);
                }
                if (this.f11021q == null) {
                    aVar = C4218a.SELECT;
                } else {
                    m12091r();
                    aVar = C4218a.SWITCH;
                }
                m12064a(aVar, e0Var, z2);
                this.f11024t = i;
                this.f11021q = e0Var;
                this.f11021q.mo11099a(this.f11002K);
                C4178e0 e0Var3 = this.f11021q;
                if (e0Var3 instanceof C4167b0) {
                    e0Var3.mo11099a((C4179a) this.f11003L);
                }
                this.f11021q.mo11042k(true);
                if (!this.f10992A) {
                    this.f10992A = true;
                    this.f10993B = this.f11013i.getCameraPosition().f14044e;
                    this.f10995D = this.f11013i.getCameraPosition().f14043d;
                    this.f10994C = this.f11013i.getCameraPosition().f14040a;
                }
                this.f10999H.mo10973h();
                m12068b(z, z2);
            }
        } else if (e0Var != null) {
            this.f11022r = true;
            mo10938b(true);
            this.f10992A = true;
            m12064a(C4218a.RESELECT, e0Var, z2);
        }
        return true;
    }

    /* renamed from: a */
    public void mo10929a(boolean z, boolean z2) {
        mo10939b(null, z, z2);
    }

    /* renamed from: a */
    public /* synthetic */ void mo10925a(C4178e0 e0Var, boolean z, boolean z2) {
        if (e0Var == this.f11021q) {
            if (!e0Var.mo11122w()) {
                e0Var.mo11038g(true);
                m12064a(C4218a.FOCUS, e0Var, z);
            }
            mo10938b(true);
            this.f10999H.mo10966b();
            m12086n();
        }
    }

    /* renamed from: a */
    public void mo10928a(boolean z) {
        this.f11022r = z;
        this.f11023s = null;
        if (!z) {
            this.f10998G.mo10961e(-1.0d);
        } else if (this.f11021q != null) {
            m12086n();
        }
    }

    /* renamed from: a */
    public void mo10924a(MarkerManagerListener markerManagerListener) {
        this.f11026v = markerManagerListener;
    }

    /* renamed from: a */
    public void mo10926a(C4187h0 h0Var) {
        this.f11019o.add(h0Var);
        h0Var.mo11133a(this.f11028x, this.f11027w, this.f11029y, this.f11030z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12064a(C4218a aVar, C4178e0 e0Var, boolean z) {
        MarkerManagerListener markerManagerListener = this.f11026v;
        if (markerManagerListener != null) {
            markerManagerListener.onMarkerSelectionChange(new C4217i0(aVar, e0Var, z));
        }
    }

    /* renamed from: a */
    private void m12065a(C4221a aVar, List<C4178e0> list, boolean z) {
        MarkerManagerListener markerManagerListener = this.f11026v;
        if (markerManagerListener != null) {
            markerManagerListener.onMarkersSelectionChange(new C4220j0(aVar, list, z));
        }
    }

    /* renamed from: a */
    private double m12059a(C5460e eVar) {
        return C4274b.m12689b(this.f11013i, eVar, 0);
    }

    /* renamed from: a */
    private double m12058a(C5459d dVar, double d, int i) {
        return Math.min((double) i, C4274b.m12689b(this.f11013i, C5460e.m15529a(dVar, d), this.f11006b));
    }

    /* renamed from: a */
    private void m12061a(C2910b bVar, List<C5459d> list) {
        C2464g l = m12082l();
        if (l == C2464g.ALL || l == C2464g.MARKER || l == C2464g.MARKER_ORIGIN || l == C2464g.MARKER_DESTINATION) {
            list.add(this.f11021q.mo11114k());
        }
        C5459d b = bVar.mo9008f().mo9015b();
        if (b != null && (l == C2464g.ALL || l == C2464g.MARKER_ORIGIN || l == C2464g.ORIGIN)) {
            list.add(b);
        }
        C5459d b2 = bVar.mo9005c().mo9015b();
        if (b2 == null) {
            return;
        }
        if (l == C2464g.ALL || l == C2464g.MARKER_DESTINATION || l == C2464g.DESTINATION) {
            list.add(b2);
        }
    }

    /* renamed from: a */
    public void mo10920a(double d, double d2) {
        this.f10997F.mo13061b(d);
        this.f10997F.mo13063c(d2);
        if (this.f10996E == C2458b.MEET) {
            C4178e0 e0Var = this.f11021q;
            if (e0Var != null && e0Var.mo11122w()) {
                m12086n();
            }
        }
    }
}
