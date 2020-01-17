package app.zenly.locator.core.models;

import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2916z.C2917a;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.models.VisitPointWrapper.HeadingWrapper;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7276d2;
import p213co.znly.models.C7320g1.C7322b;
import p213co.znly.models.C7492v2;
import p213co.znly.models.PinContextProto$HeadingStripped.C6815b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.PinContextUIProto$PinContext;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6990b;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6994d;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6996e;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6998f;

/* renamed from: app.zenly.locator.core.models.x */
public final class C2912x implements TrackingContextWrapper, VisitPointWrapper, UserLocationWrapper {

    /* renamed from: b */
    private static final C6994d f8280b = ((C6994d) C6994d.newBuilder().build());

    /* renamed from: a */
    private final PinContextUIProto$PinContext f8281a;

    /* renamed from: app.zenly.locator.core.models.x$a */
    public static final class C2913a {
        private C2913a() {
        }

        public /* synthetic */ C2913a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.models.x$b */
    private static final class C2914b implements HeadingWrapper {

        /* renamed from: a */
        private final C6994d f8282a;

        public C2914b(C6994d dVar) {
            C12932j.m33818b(dVar, "heading");
            this.f8282a = dVar;
        }

        public long getArrivalTime() {
            if (!getHasArrivalTime()) {
                return 0;
            }
            ZenlyCore a = C5448c.m15478a();
            Timestamp eta = this.f8282a.getEta();
            C12932j.m33815a((Object) eta, "heading.eta");
            return C5447b.m15473a(a, C3245z.m10288g(eta));
        }

        public long getDepartureTime() {
            if (!getHasDepartureTime()) {
                return 0;
            }
            ZenlyCore a = C5448c.m15478a();
            Timestamp departureTime = this.f8282a.getDepartureTime();
            C12932j.m33815a((Object) departureTime, "heading.departureTime");
            return C5447b.m15473a(a, C3245z.m10288g(departureTime));
        }

        public C2916z getDestination() {
            C2917a aVar = C2916z.f8286g;
            C6815b destination = this.f8282a.getDestination();
            C12932j.m33815a((Object) destination, "heading.destination");
            return aVar.mo9021a(destination);
        }

        public boolean getHasArrivalTime() {
            return this.f8282a.hasEta();
        }

        public boolean getHasDepartureTime() {
            return this.f8282a.hasDepartureTime();
        }

        public C2916z getOrigin() {
            C2917a aVar = C2916z.f8286g;
            C6815b origin = this.f8282a.getOrigin();
            C12932j.m33815a((Object) origin, "heading.origin");
            return aVar.mo9021a(origin);
        }
    }

    static {
        new C2913a(null);
    }

    public C2912x(PinContextUIProto$PinContext pinContextUIProto$PinContext) {
        C12932j.m33818b(pinContextUIProto$PinContext, "pinContext");
        this.f8281a = pinContextUIProto$PinContext;
    }

    /* renamed from: a */
    public final UserProto$User mo9012a() {
        UserProto$User user = this.f8281a.getUser();
        C12932j.m33815a((Object) user, "pinContext.user");
        return user;
    }

    /* renamed from: b */
    public final boolean mo9013b() {
        return this.f8281a.getIsDeleted();
    }

    public int getBatteryLevel() {
        return this.f8281a.getBatteryLevel();
    }

    public Timestamp getCreatedAt() {
        Timestamp createdAt = this.f8281a.getCreatedAt();
        C12932j.m33815a((Object) createdAt, "pinContext.createdAt");
        return createdAt;
    }

    public C7492v2 getGhostType() {
        C7492v2 ghostType = this.f8281a.getGhostType();
        C12932j.m33815a((Object) ghostType, "pinContext.ghostType");
        return ghostType;
    }

    public boolean getHasWifiEnabled() {
        return this.f8281a.getIsWifiActive();
    }

    public HeadingWrapper getHeading() {
        C6994d dVar;
        if (this.f8281a.hasHeading()) {
            dVar = this.f8281a.getHeading();
        } else {
            dVar = f8280b;
        }
        C12932j.m33815a((Object) dVar, "protoHeading");
        return new C2914b(dVar);
    }

    public double getHeight() {
        if (!this.f8281a.hasElevation()) {
            return -1.0d;
        }
        C6990b elevation = this.f8281a.getElevation();
        C12932j.m33815a((Object) elevation, "pinContext.elevation");
        return (double) elevation.getHeight();
    }

    public Timestamp getHereSince() {
        String str;
        Timestamp timestamp;
        if (this.f8281a.hasLocExtra()) {
            C6996e locExtra = this.f8281a.getLocExtra();
            C12932j.m33815a((Object) locExtra, "pinContext.locExtra");
            timestamp = locExtra.getHereSince();
            str = "pinContext.locExtra.hereSince";
        } else {
            timestamp = Timestamp.getDefaultInstance();
            str = "Timestamp.getDefaultInstance()";
        }
        C12932j.m33815a((Object) timestamp, str);
        return timestamp;
    }

    public double getHorizontalPrecision() {
        if (!this.f8281a.hasLocExtra()) {
            return (double) this.f8281a.getHpRaw();
        }
        C6996e locExtra = this.f8281a.getLocExtra();
        C12932j.m33815a((Object) locExtra, "pinContext.locExtra");
        return (double) locExtra.getHp();
    }

    public double getLatitude() {
        if (!this.f8281a.hasLocExtra()) {
            return getRawLatitude();
        }
        C6996e locExtra = this.f8281a.getLocExtra();
        C12932j.m33815a((Object) locExtra, "pinContext.locExtra");
        return locExtra.getLat();
    }

    public double getLongitude() {
        if (!this.f8281a.hasLocExtra()) {
            return getRawLongitude();
        }
        C6996e locExtra = this.f8281a.getLocExtra();
        C12932j.m33815a((Object) locExtra, "pinContext.locExtra");
        return locExtra.getLng();
    }

    public C2911c getMovingState() {
        if (!this.f8281a.hasLocExtra()) {
            return C2911c.UNKNOWN;
        }
        C6996e locExtra = this.f8281a.getLocExtra();
        C12932j.m33815a((Object) locExtra, "pinContext.locExtra");
        C7322b dynamic = locExtra.getDynamic();
        if (dynamic != null) {
            int i = C2915y.f8283a[dynamic.ordinal()];
            if (i == 1) {
                return C2911c.MOVING;
            }
            if (i == 2) {
                return C2911c.STATIC;
            }
        }
        return C2911c.UNKNOWN;
    }

    public C2918b getPlace() {
        if (!this.f8281a.hasPersonalPlace()) {
            return C2918b.NONE;
        }
        C6998f personalPlace = this.f8281a.getPersonalPlace();
        C12932j.m33815a((Object) personalPlace, "pinContext.personalPlace");
        C7276d2 label = personalPlace.getLabel();
        if (label != null) {
            int i = C2915y.f8284b[label.ordinal()];
            if (i == 1) {
                return C2918b.HOME;
            }
            if (i == 2) {
                return C2918b.SCHOOL;
            }
            if (i == 3) {
                return C2918b.WORK;
            }
        }
        return C2918b.NONE;
    }

    public double getRawHorizontalPrecision() {
        return (double) this.f8281a.getHpRaw();
    }

    public double getRawLatitude() {
        return this.f8281a.getLatRaw();
    }

    public double getRawLongitude() {
        return this.f8281a.getLngRaw();
    }

    public double getSpeed() {
        if (!this.f8281a.hasLocExtra()) {
            return 0.0d;
        }
        C6996e locExtra = this.f8281a.getLocExtra();
        C12932j.m33815a((Object) locExtra, "pinContext.locExtra");
        return (double) locExtra.getSpeed();
    }

    public String getUserUuid() {
        String userUuid = this.f8281a.getUserUuid();
        C12932j.m33815a((Object) userUuid, "pinContext.userUuid");
        return userUuid;
    }

    public boolean isCharging() {
        return this.f8281a.getIsCharging();
    }

    public boolean isInApp() {
        return this.f8281a.getIsInApp();
    }

    public boolean isInSubway() {
        if (this.f8281a.hasElevation()) {
            C6990b elevation = this.f8281a.getElevation();
            C12932j.m33815a((Object) elevation, "pinContext.elevation");
            if (elevation.getIsInSubway()) {
                return true;
            }
        }
        return false;
    }

    public boolean isLive() {
        return this.f8281a.getIsLive();
    }
}
