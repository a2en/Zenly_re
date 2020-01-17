package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.n */
public enum C7396n implements EnumLite {
    RUNTIMEVARIANT_NONE(0),
    RUNTIMEVARIANT_DISMISS(1),
    RUNTIMEVARIANT_SPRINKLE_CONTACTS(2),
    RUNTIMEVARIANT_SPRINKLE_CHURNED(3),
    RUNTIMEVARIANT_SAME_COUNTRY_BOOST(4),
    RUNTIMEVARIANT_CHURNED_OUT_OF_POOL(5),
    RUNTIMEVARIANT_CHURNED_OUT_OF_POOL_INFINITE(6),
    RUNTIMEVARIANT_CHURNED_OUT_OF_POOL_INFINITE_NO_COUNTRY_BOOST(7),
    RUNTIMEVARIANT_CHURNED_OUT_OF_POOL_INFINITE_NO_SPRINKLE(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18455e;

    /* renamed from: co.znly.models.n$a */
    class C7397a implements EnumLiteMap<C7396n> {
        C7397a() {
        }

        public C7396n findValueByNumber(int i) {
            return C7396n.m18076a(i);
        }
    }

    static {
        new C7397a();
    }

    private C7396n(int i) {
        this.f18455e = i;
    }

    /* renamed from: a */
    public static C7396n m18076a(int i) {
        switch (i) {
            case 0:
                return RUNTIMEVARIANT_NONE;
            case 1:
                return RUNTIMEVARIANT_DISMISS;
            case 2:
                return RUNTIMEVARIANT_SPRINKLE_CONTACTS;
            case 3:
                return RUNTIMEVARIANT_SPRINKLE_CHURNED;
            case 4:
                return RUNTIMEVARIANT_SAME_COUNTRY_BOOST;
            case 5:
                return RUNTIMEVARIANT_CHURNED_OUT_OF_POOL;
            case 6:
                return RUNTIMEVARIANT_CHURNED_OUT_OF_POOL_INFINITE;
            case 7:
                return RUNTIMEVARIANT_CHURNED_OUT_OF_POOL_INFINITE_NO_COUNTRY_BOOST;
            case 8:
                return RUNTIMEVARIANT_CHURNED_OUT_OF_POOL_INFINITE_NO_SPRINKLE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f18455e;
    }
}
