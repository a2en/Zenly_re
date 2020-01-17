package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.f */
public enum C7295f implements EnumLite {
    CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN(0),
    CAMPAIGN_ORGANIZATION_TYPE_FRATERNITY(1),
    CAMPAIGN_ORGANIZATION_TYPE_SORORITY(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18114e;

    /* renamed from: co.znly.models.f$a */
    class C7296a implements EnumLiteMap<C7295f> {
        C7296a() {
        }

        public C7295f findValueByNumber(int i) {
            return C7295f.m17998a(i);
        }
    }

    static {
        new C7296a();
    }

    private C7295f(int i) {
        this.f18114e = i;
    }

    /* renamed from: a */
    public static C7295f m17998a(int i) {
        if (i == 0) {
            return CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return CAMPAIGN_ORGANIZATION_TYPE_FRATERNITY;
        }
        if (i != 2) {
            return null;
        }
        return CAMPAIGN_ORGANIZATION_TYPE_SORORITY;
    }

    public final int getNumber() {
        return this.f18114e;
    }
}
