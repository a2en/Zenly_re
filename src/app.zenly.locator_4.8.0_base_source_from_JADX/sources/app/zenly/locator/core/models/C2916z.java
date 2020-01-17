package app.zenly.locator.core.models;

import app.zenly.locator.p143s.p150n.C5459d;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C6943a0;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6978c2;
import p213co.znly.models.C7276d2;
import p213co.znly.models.PinContextProto$HeadingStripped.C6815b;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.PlaceProto$Place.C6845c;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;

/* renamed from: app.zenly.locator.core.models.z */
public final class C2916z {

    /* renamed from: f */
    public static final C2916z f8285f;

    /* renamed from: g */
    public static final C2917a f8286g = new C2917a(null);

    /* renamed from: a */
    private final long f8287a;

    /* renamed from: b */
    private final C2918b f8288b;

    /* renamed from: c */
    private final C5459d f8289c;

    /* renamed from: d */
    private final double f8290d;

    /* renamed from: e */
    private final boolean f8291e;

    /* renamed from: app.zenly.locator.core.models.z$a */
    public static final class C2917a {
        private C2917a() {
        }

        /* renamed from: a */
        public final C2916z mo9022a(PlaceProto$Place placeProto$Place) {
            C2918b bVar;
            C5459d dVar;
            double d;
            boolean z;
            C12932j.m33818b(placeProto$Place, "place");
            String str = "place.label";
            if (placeProto$Place.hasLabel()) {
                C2919a aVar = C2918b.f8297k;
                C6845c label = placeProto$Place.getLabel();
                C12932j.m33815a((Object) label, str);
                C6847b tag = label.getTag();
                C12932j.m33815a((Object) tag, "place.label.tag");
                bVar = aVar.mo9025a(tag);
            } else {
                bVar = C2918b.NONE;
            }
            C2918b bVar2 = bVar;
            String str2 = "place.circle";
            if (!placeProto$Place.hasCircle() || !placeProto$Place.getCircle().hasCenter()) {
                dVar = null;
            } else {
                C6943a0 circle = placeProto$Place.getCircle();
                C12932j.m33815a((Object) circle, str2);
                C6950b0 center = circle.getCenter();
                String str3 = "place.circle.center";
                C12932j.m33815a((Object) center, str3);
                double latitude = center.getLatitude();
                C6943a0 circle2 = placeProto$Place.getCircle();
                C12932j.m33815a((Object) circle2, str2);
                C6950b0 center2 = circle2.getCenter();
                C12932j.m33815a((Object) center2, str3);
                dVar = new C5459d(latitude, center2.getLongitude());
            }
            C5459d dVar2 = dVar;
            if (placeProto$Place.hasCircle()) {
                C6943a0 circle3 = placeProto$Place.getCircle();
                C12932j.m33815a((Object) circle3, str2);
                d = circle3.getRadius();
            } else {
                d = 0.0d;
            }
            double d2 = d;
            if (placeProto$Place.hasLabel()) {
                C6845c label2 = placeProto$Place.getLabel();
                C12932j.m33815a((Object) label2, str);
                z = label2.getIsMain();
            } else {
                z = false;
            }
            C2916z zVar = new C2916z(placeProto$Place.getId(), bVar2, dVar2, d2, z);
            return zVar;
        }

        public /* synthetic */ C2917a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C2916z mo9023a(C6978c2 c2Var) {
            C12932j.m33818b(c2Var, "personalPlace");
            C2919a aVar = C2918b.f8297k;
            C7276d2 label = c2Var.getLabel();
            C12932j.m33815a((Object) label, "personalPlace.label");
            C2916z zVar = new C2916z(c2Var.getId(), aVar.mo9026a(label), new C5459d(c2Var.getLatitude(), c2Var.getLongitude()), c2Var.getRadius(), c2Var.getIsMain());
            return zVar;
        }

        /* renamed from: a */
        public final C2916z mo9021a(C6815b bVar) {
            C12932j.m33818b(bVar, "place");
            long id = (long) bVar.getId();
            C2919a aVar = C2918b.f8297k;
            C7276d2 label = bVar.getLabel();
            C12932j.m33815a((Object) label, "place.label");
            C2916z zVar = new C2916z(id, aVar.mo9026a(label), new C5459d(bVar.getLatitude(), bVar.getLongitude()), (double) bVar.getRadius(), bVar.getIsMain());
            return zVar;
        }
    }

    /* renamed from: app.zenly.locator.core.models.z$b */
    public enum C2918b {
        HOME(C6847b.HOME),
        NONE(C6847b.NOLABEL),
        SCHOOL(C6847b.SCHOOL),
        WORK(C6847b.WORK);
        

        /* renamed from: k */
        public static final C2919a f8297k = null;

        /* renamed from: e */
        private final C6847b f8298e;

        /* renamed from: app.zenly.locator.core.models.z$b$a */
        public static final class C2919a {
            private C2919a() {
            }

            /* renamed from: a */
            public final C2918b mo9025a(C6847b bVar) {
                C2918b bVar2;
                C12932j.m33818b(bVar, "tag");
                C2918b[] values = C2918b.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bVar2 = null;
                        break;
                    }
                    bVar2 = values[i];
                    if (bVar2.mo9024a() == bVar) {
                        break;
                    }
                    i++;
                }
                return bVar2 != null ? bVar2 : C2918b.NONE;
            }

            public /* synthetic */ C2919a(C12928f fVar) {
                this();
            }

            /* renamed from: a */
            public final C2918b mo9026a(C7276d2 d2Var) {
                C12932j.m33818b(d2Var, "personalPlaceLabel");
                int i = C2870a0.f8117a[d2Var.ordinal()];
                if (i == 1) {
                    return C2918b.HOME;
                }
                if (i == 2) {
                    return C2918b.WORK;
                }
                if (i != 3) {
                    return C2918b.NONE;
                }
                return C2918b.SCHOOL;
            }
        }

        static {
            f8297k = new C2919a(null);
        }

        private C2918b(C6847b bVar) {
            this.f8298e = bVar;
        }

        /* renamed from: a */
        public final C6847b mo9024a() {
            return this.f8298e;
        }
    }

    static {
        C2916z zVar = new C2916z(0, null, null, 0.0d, false, 31, null);
        f8285f = zVar;
    }

    public C2916z() {
        this(0, null, null, 0.0d, false, 31, null);
    }

    public C2916z(long j, C2918b bVar, C5459d dVar, double d, boolean z) {
        C12932j.m33818b(bVar, "tag");
        this.f8287a = j;
        this.f8288b = bVar;
        this.f8289c = dVar;
        this.f8290d = d;
        this.f8291e = z;
    }

    /* renamed from: a */
    public static final C2916z m9413a(PlaceProto$Place placeProto$Place) {
        return f8286g.mo9022a(placeProto$Place);
    }

    /* renamed from: a */
    public final long mo9014a() {
        return this.f8287a;
    }

    /* renamed from: b */
    public final C5459d mo9015b() {
        return this.f8289c;
    }

    /* renamed from: c */
    public final double mo9016c() {
        return this.f8290d;
    }

    /* renamed from: d */
    public final C2918b mo9017d() {
        return this.f8288b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2916z) {
                C2916z zVar = (C2916z) obj;
                if ((this.f8287a == zVar.f8287a) && C12932j.m33817a((Object) this.f8288b, (Object) zVar.f8288b) && C12932j.m33817a((Object) this.f8289c, (Object) zVar.f8289c) && Double.compare(this.f8290d, zVar.f8290d) == 0) {
                    if (this.f8291e == zVar.f8291e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f8287a).hashCode() * 31;
        C2918b bVar = this.f8288b;
        int i = 0;
        int hashCode = (a + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C5459d dVar = this.f8289c;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        int a2 = (((hashCode + i) * 31) + Double.valueOf(this.f8290d).hashCode()) * 31;
        boolean z = this.f8291e;
        if (z) {
            z = true;
        }
        return a2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Place(id=");
        sb.append(this.f8287a);
        sb.append(", tag=");
        sb.append(this.f8288b);
        sb.append(", location=");
        sb.append(this.f8289c);
        sb.append(", radius=");
        sb.append(this.f8290d);
        sb.append(", isMain=");
        sb.append(this.f8291e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2916z(long j, C2918b bVar, C5459d dVar, double d, boolean z, int i, C12928f fVar) {
        long j2 = (i & 1) != 0 ? 0 : j;
        this(j2, (i & 2) != 0 ? C2918b.NONE : bVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? false : z);
    }
}
