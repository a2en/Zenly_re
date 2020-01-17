package app.zenly.locator.core.models;

import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.models.VisitPointWrapper.HeadingWrapper;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5459d;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.models.w */
public final class C2908w {

    /* renamed from: a */
    private VisitPointWrapper f8263a;

    /* renamed from: b */
    private C2911c f8264b = C2911c.UNKNOWN;

    /* renamed from: c */
    private long f8265c;

    /* renamed from: d */
    private final C2910b f8266d = new C2910b();

    /* renamed from: app.zenly.locator.core.models.w$a */
    public static final class C2909a {
        private C2909a() {
        }

        public /* synthetic */ C2909a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.models.w$b */
    public static final class C2910b {

        /* renamed from: a */
        private C5459d f8267a;

        /* renamed from: b */
        private C2916z f8268b;

        /* renamed from: c */
        private C2916z f8269c;

        /* renamed from: d */
        private boolean f8270d;

        /* renamed from: e */
        private long f8271e;

        /* renamed from: f */
        private boolean f8272f;

        /* renamed from: g */
        private long f8273g;

        /* renamed from: h */
        private boolean f8274h;

        /* renamed from: i */
        private boolean f8275i;

        public C2910b() {
            C2916z zVar = new C2916z(0, null, null, 0.0d, false, 31, null);
            this.f8268b = zVar;
            C2916z zVar2 = new C2916z(0, null, null, 0.0d, false, 31, null);
            this.f8269c = zVar2;
        }

        /* renamed from: j */
        private final boolean m9397j() {
            C5459d dVar = this.f8267a;
            C5459d b = this.f8268b.mo9015b();
            C5459d b2 = this.f8269c.mo9015b();
            boolean z = (!mo9009g() || dVar == null || b == null || b2 == null || C3225m.m10226a(b, dVar) / C3225m.m10226a(b, b2) < 0.7f) ? false : true;
            if (z == this.f8275i) {
                return false;
            }
            this.f8275i = z;
            return true;
        }

        /* renamed from: a */
        public final long mo8999a() {
            return this.f8273g;
        }

        /* renamed from: b */
        public final long mo9004b() {
            return this.f8271e;
        }

        /* renamed from: c */
        public final C2916z mo9005c() {
            return this.f8269c;
        }

        /* renamed from: d */
        public final boolean mo9006d() {
            return this.f8272f;
        }

        /* renamed from: e */
        public final boolean mo9007e() {
            return this.f8270d;
        }

        /* renamed from: f */
        public final C2916z mo9008f() {
            return this.f8268b;
        }

        /* renamed from: g */
        public final boolean mo9009g() {
            return this.f8269c.mo9017d() != C2918b.NONE;
        }

        /* renamed from: h */
        public final boolean mo9010h() {
            return this.f8275i;
        }

        /* renamed from: i */
        public final boolean mo9011i() {
            return this.f8274h;
        }

        /* renamed from: a */
        public final void mo9001a(boolean z) {
            this.f8274h = z;
        }

        /* renamed from: a */
        public final C2910b mo9000a(C2910b bVar) {
            C12932j.m33818b(bVar, "clone");
            bVar.f8267a = this.f8267a;
            bVar.f8268b = this.f8268b;
            bVar.f8269c = this.f8269c;
            bVar.f8270d = this.f8270d;
            bVar.f8271e = this.f8271e;
            bVar.f8272f = this.f8272f;
            bVar.f8273g = this.f8273g;
            bVar.f8274h = this.f8274h;
            bVar.f8275i = this.f8275i;
            return bVar;
        }

        /* renamed from: a */
        public final boolean mo9002a(HeadingWrapper headingWrapper) {
            C12932j.m33818b(headingWrapper, "heading");
            boolean j = m9397j();
            if (!(!C12932j.m33817a((Object) headingWrapper.getOrigin(), (Object) this.f8268b)) && !(!C12932j.m33817a((Object) headingWrapper.getDestination(), (Object) this.f8269c)) && headingWrapper.getHasDepartureTime() == this.f8270d && headingWrapper.getDepartureTime() == this.f8271e && headingWrapper.getHasArrivalTime() == this.f8272f && headingWrapper.getArrivalTime() == this.f8273g) {
                return j;
            }
            this.f8268b = headingWrapper.getOrigin();
            this.f8269c = headingWrapper.getDestination();
            this.f8270d = headingWrapper.getHasDepartureTime();
            this.f8271e = headingWrapper.getDepartureTime();
            this.f8272f = headingWrapper.getHasArrivalTime();
            this.f8273g = headingWrapper.getArrivalTime();
            return true;
        }

        /* renamed from: a */
        public final boolean mo9003a(C5459d dVar) {
            C12932j.m33818b(dVar, "userLocation");
            this.f8267a = dVar;
            return m9397j();
        }
    }

    /* renamed from: app.zenly.locator.core.models.w$c */
    public enum C2911c {
        MOVING,
        STATIC,
        UNKNOWN
    }

    static {
        new C2909a(null);
    }

    /* renamed from: a */
    public final void mo8989a(VisitPointWrapper visitPointWrapper) {
        this.f8263a = visitPointWrapper;
    }

    /* renamed from: b */
    public final boolean mo8993b() {
        VisitPointWrapper visitPointWrapper = this.f8263a;
        if (visitPointWrapper != null) {
            C2911c movingState = visitPointWrapper.getMovingState();
            long j = 0;
            if (movingState == C2911c.STATIC) {
                j = C5447b.m15473a(C5448c.m15478a(), C3245z.m10288g(visitPointWrapper.getHereSince()));
            }
            if (!(movingState == this.f8264b && j == this.f8265c)) {
                this.f8264b = movingState;
                this.f8265c = j;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo8994c() {
        return this.f8266d.mo9005c().mo9017d() != C2918b.NONE;
    }

    /* renamed from: d */
    public final C2910b mo8995d() {
        return this.f8266d;
    }

    /* renamed from: e */
    public final long mo8996e() {
        return this.f8265c;
    }

    /* renamed from: f */
    public final C2911c mo8997f() {
        return this.f8264b;
    }

    /* renamed from: g */
    public final VisitPointWrapper mo8998g() {
        return this.f8263a;
    }

    /* renamed from: a */
    public final void mo8990a(C2911c cVar) {
        C12932j.m33818b(cVar, "<set-?>");
        this.f8264b = cVar;
    }

    /* renamed from: a */
    public final C2908w mo8988a(C2908w wVar) {
        C12932j.m33818b(wVar, "clone");
        wVar.f8263a = this.f8263a;
        wVar.f8264b = this.f8264b;
        wVar.f8265c = this.f8265c;
        this.f8266d.mo9000a(wVar.f8266d);
        return wVar;
    }

    /* renamed from: a */
    public final boolean mo8991a() {
        VisitPointWrapper visitPointWrapper = this.f8263a;
        if (visitPointWrapper != null) {
            HeadingWrapper heading = visitPointWrapper.getHeading();
            if (heading != null) {
                return this.f8266d.mo9002a(heading);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo8992a(C5459d dVar) {
        C12932j.m33818b(dVar, "userLocation");
        return this.f8266d.mo9003a(dVar);
    }
}
