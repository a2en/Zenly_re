package p213co.znly.models.reversegeocoder;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.reversegeocoder.e */
public enum C7917e implements EnumLite {
    UNUSED(0),
    COUNTRY(30),
    MACROREGION(60),
    REGION(90),
    LOCALITY(120),
    BOROUGH(150),
    NEIGHBOURHOOD(180),
    MICROHOOD(210),
    CAMPUS(220),
    INTERSECTION(230),
    ADDRESS(260),
    BUILDING(290),
    VENUE(310),
    CHECKIN(320),
    ALTITUDE(330),
    USERPOSITION(360),
    SIGNIFICANT_PLACE(90100),
    BUBBLE(90200),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20077e;

    /* renamed from: co.znly.models.reversegeocoder.e$a */
    class C7918a implements EnumLiteMap<C7917e> {
        C7918a() {
        }

        public C7917e findValueByNumber(int i) {
            return C7917e.m18960a(i);
        }
    }

    static {
        new C7918a();
    }

    private C7917e(int i) {
        this.f20077e = i;
    }

    /* renamed from: a */
    public static C7917e m18960a(int i) {
        switch (i) {
            case 0:
                return UNUSED;
            case 30:
                return COUNTRY;
            case 60:
                return MACROREGION;
            case 90:
                return REGION;
            case 120:
                return LOCALITY;
            case 150:
                return BOROUGH;
            case 180:
                return NEIGHBOURHOOD;
            case 210:
                return MICROHOOD;
            case 220:
                return CAMPUS;
            case 230:
                return INTERSECTION;
            case 260:
                return ADDRESS;
            case 290:
                return BUILDING;
            case 310:
                return VENUE;
            case 320:
                return CHECKIN;
            case 330:
                return ALTITUDE;
            case 360:
                return USERPOSITION;
            case 90100:
                return SIGNIFICANT_PLACE;
            case 90200:
                return BUBBLE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f20077e;
    }
}
