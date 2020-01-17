package app.zenly.locator.core.models;

import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2916z.C2917a;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.models.C2916z.C2918b.C2919a;
import app.zenly.locator.core.models.VisitPointWrapper.HeadingWrapper;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;
import p213co.znly.models.services.ZenlyProto$UserVisitPointResponse.UserVisitPoint;
import p213co.znly.models.services.ZenlyProto$UserVisitPointResponse.UserVisitPoint.C7967b;
import p213co.znly.models.services.ZenlyProto$UserVisitPointResponse.UserVisitPoint.C7969c;

/* renamed from: app.zenly.locator.core.models.t */
public final class C2903t implements VisitPointWrapper {

    /* renamed from: b */
    private static final C7967b f8244b = ((C7967b) C7967b.newBuilder().build());

    /* renamed from: a */
    private final UserVisitPoint f8245a;

    /* renamed from: app.zenly.locator.core.models.t$a */
    public static final class C2904a {
        private C2904a() {
        }

        public /* synthetic */ C2904a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.models.t$b */
    private static final class C2905b implements HeadingWrapper {

        /* renamed from: a */
        private final C2916z f8246a;

        /* renamed from: b */
        private final boolean f8247b = this.f8248c.hasDepartureTime();

        /* renamed from: c */
        private final C7967b f8248c;

        public C2905b(C7967b bVar) {
            C12932j.m33818b(bVar, "heading");
            this.f8248c = bVar;
            C2917a aVar = C2916z.f8286g;
            PlaceProto$Place origin = this.f8248c.getOrigin();
            C12932j.m33815a((Object) origin, "heading.origin");
            this.f8246a = aVar.mo9022a(origin);
        }

        public long getArrivalTime() {
            if (!getHasArrivalTime()) {
                return 0;
            }
            ZenlyCore a = C5448c.m15478a();
            Timestamp eta = this.f8248c.getEta();
            C12932j.m33815a((Object) eta, "heading.eta");
            return C5447b.m15473a(a, C3245z.m10288g(eta));
        }

        public long getDepartureTime() {
            if (!getHasDepartureTime()) {
                return 0;
            }
            ZenlyCore a = C5448c.m15478a();
            Timestamp departureTime = this.f8248c.getDepartureTime();
            C12932j.m33815a((Object) departureTime, "heading.departureTime");
            return C5447b.m15473a(a, C3245z.m10288g(departureTime));
        }

        public C2916z getDestination() {
            C2917a aVar = C2916z.f8286g;
            PlaceProto$Place destination = this.f8248c.getDestination();
            C12932j.m33815a((Object) destination, "heading.destination");
            return aVar.mo9022a(destination);
        }

        public boolean getHasArrivalTime() {
            return this.f8248c.hasEta();
        }

        public boolean getHasDepartureTime() {
            return this.f8247b;
        }

        public C2916z getOrigin() {
            return this.f8246a;
        }
    }

    static {
        new C2904a(null);
    }

    public C2903t(UserVisitPoint userVisitPoint) {
        C12932j.m33818b(userVisitPoint, "visitPoint");
        this.f8245a = userVisitPoint;
    }

    public HeadingWrapper getHeading() {
        C7967b bVar;
        if (this.f8245a.hasHeading()) {
            bVar = this.f8245a.getHeading();
        } else {
            bVar = f8244b;
        }
        C12932j.m33815a((Object) bVar, "protoHeading");
        return new C2905b(bVar);
    }

    public Timestamp getHereSince() {
        Timestamp timeIn = this.f8245a.getTimeIn();
        C12932j.m33815a((Object) timeIn, "visitPoint.timeIn");
        return timeIn;
    }

    public C2911c getMovingState() {
        C7969c status = this.f8245a.getStatus();
        if (status != null) {
            int i = C2906u.f8249a[status.ordinal()];
            if (i == 1) {
                return C2911c.STATIC;
            }
            if (i == 2) {
                return C2911c.MOVING;
            }
            if (i == 3) {
                return C2911c.UNKNOWN;
            }
        }
        return C2911c.UNKNOWN;
    }

    public C2918b getPlace() {
        C2919a aVar = C2918b.f8297k;
        C6847b placeTag = this.f8245a.getPlaceTag();
        C12932j.m33815a((Object) placeTag, "visitPoint.placeTag");
        return aVar.mo9025a(placeTag);
    }

    public String getUserUuid() {
        String userUuid = this.f8245a.getUserUuid();
        C12932j.m33815a((Object) userUuid, "visitPoint.userUuid");
        return userUuid;
    }
}
