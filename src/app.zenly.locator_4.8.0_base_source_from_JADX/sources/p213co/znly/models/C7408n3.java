package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.n3 */
public enum C7408n3 implements EnumLite {
    WEATHER_TYPE_UNKNOWN(0),
    WEATHER_TYPE_RAIN(1),
    WEATHER_TYPE_SNOW(2),
    WEATHER_TYPE_SUNSHINE(4),
    WEATHER_TYPE_PRECIPITATION_MASK(7),
    WEATHER_TYPE_SCATTERED(65536),
    WEATHER_TYPE_LIGHT(131072),
    WEATHER_TYPE_MODERATE(262144),
    WEATHER_TYPE_HEAVY(524288),
    WEATHER_TYPE_STRENGTH_MASK(983040),
    WEATHER_TYPE_MASK(983047),
    WEATHER_TYPE_RAIN_SCATTERED(65537),
    WEATHER_TYPE_RAIN_LIGHT(131073),
    WEATHER_TYPE_RAIN_MODERATE(262145),
    WEATHER_TYPE_RAIN_HEAVY(524289),
    WEATHER_TYPE_SNOW_SCATTERED(65538),
    WEATHER_TYPE_SNOW_LIGHT(131074),
    WEATHER_TYPE_SNOW_MODERATE(262146),
    WEATHER_TYPE_SNOW_HEAVY(524290),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18521e;

    /* renamed from: co.znly.models.n3$a */
    class C7409a implements EnumLiteMap<C7408n3> {
        C7409a() {
        }

        public C7408n3 findValueByNumber(int i) {
            return C7408n3.m18081a(i);
        }
    }

    static {
        new C7409a();
    }

    private C7408n3(int i) {
        this.f18521e = i;
    }

    /* renamed from: a */
    public static C7408n3 m18081a(int i) {
        if (i == 0) {
            return WEATHER_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return WEATHER_TYPE_RAIN;
        }
        if (i == 2) {
            return WEATHER_TYPE_SNOW;
        }
        if (i == 4) {
            return WEATHER_TYPE_SUNSHINE;
        }
        if (i == 7) {
            return WEATHER_TYPE_PRECIPITATION_MASK;
        }
        if (i == 983040) {
            return WEATHER_TYPE_STRENGTH_MASK;
        }
        if (i == 983047) {
            return WEATHER_TYPE_MASK;
        }
        switch (i) {
            case 65536:
                return WEATHER_TYPE_SCATTERED;
            case 65537:
                return WEATHER_TYPE_RAIN_SCATTERED;
            case 65538:
                return WEATHER_TYPE_SNOW_SCATTERED;
            default:
                switch (i) {
                    case 131072:
                        return WEATHER_TYPE_LIGHT;
                    case 131073:
                        return WEATHER_TYPE_RAIN_LIGHT;
                    case 131074:
                        return WEATHER_TYPE_SNOW_LIGHT;
                    default:
                        switch (i) {
                            case 262144:
                                return WEATHER_TYPE_MODERATE;
                            case 262145:
                                return WEATHER_TYPE_RAIN_MODERATE;
                            case 262146:
                                return WEATHER_TYPE_SNOW_MODERATE;
                            default:
                                switch (i) {
                                    case 524288:
                                        return WEATHER_TYPE_HEAVY;
                                    case 524289:
                                        return WEATHER_TYPE_RAIN_HEAVY;
                                    case 524290:
                                        return WEATHER_TYPE_SNOW_HEAVY;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public final int getNumber() {
        return this.f18521e;
    }
}
