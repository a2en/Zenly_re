package p213co.znly.models.gdpr;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.gdpr.a */
public enum C7327a implements EnumLite {
    NOFILTER(0),
    EMPTY(1),
    HASH(2),
    REPLACE_CHARS(3),
    REPLACE_STRING(4),
    TRUNCATE_TIMESTAMP_TO_YEAR(5),
    OBFUSCATE_STRING(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18210e;

    /* renamed from: co.znly.models.gdpr.a$a */
    class C7328a implements EnumLiteMap<C7327a> {
        C7328a() {
        }

        public C7327a findValueByNumber(int i) {
            return C7327a.m18010a(i);
        }
    }

    static {
        new C7328a();
    }

    private C7327a(int i) {
        this.f18210e = i;
    }

    /* renamed from: a */
    public static C7327a m18010a(int i) {
        switch (i) {
            case 0:
                return NOFILTER;
            case 1:
                return EMPTY;
            case 2:
                return HASH;
            case 3:
                return REPLACE_CHARS;
            case 4:
                return REPLACE_STRING;
            case 5:
                return TRUNCATE_TIMESTAMP_TO_YEAR;
            case 6:
                return OBFUSCATE_STRING;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f18210e;
    }
}
