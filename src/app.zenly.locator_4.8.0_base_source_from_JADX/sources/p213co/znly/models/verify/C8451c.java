package p213co.znly.models.verify;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.verify.c */
public enum C8451c implements EnumLite {
    ID_UNKNOWN(0),
    ID_ZENLY_TWILIO(1),
    ID_ZENLY_MESSAGEBIRD(2),
    ID_ZENLY_NEXMO(3),
    ID_ZENLY_INFOBIP(4),
    ID_ZENLY_CLICKATELL(5),
    ID_ZENLY_TELESIGN(6),
    ID_ZENLY_TELEFONICA(7),
    ID_ZENLY_MITTO(8),
    ID_ZENLY_AWS_PINPOINT(9),
    ID_ZENLY_WAVECELL(10),
    ID_ZENLY_MAX_ID(51),
    ID_NEXMO_PROVIDER(10000),
    ID_DIGITS_PROVIDER(10001),
    ID_INFOBIP_PROVIDER(10002),
    ID_DEVAUTH_PROVIDER(10003),
    ID_TOKENAUTH_PROVIDER(10004),
    ID_PASSAUTH_PROVIDER(10005),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21471e;

    /* renamed from: co.znly.models.verify.c$a */
    class C8452a implements EnumLiteMap<C8451c> {
        C8452a() {
        }

        public C8451c findValueByNumber(int i) {
            return C8451c.m19514a(i);
        }
    }

    static {
        new C8452a();
    }

    private C8451c(int i) {
        this.f21471e = i;
    }

    /* renamed from: a */
    public static C8451c m19514a(int i) {
        if (i == 51) {
            return ID_ZENLY_MAX_ID;
        }
        switch (i) {
            case 0:
                return ID_UNKNOWN;
            case 1:
                return ID_ZENLY_TWILIO;
            case 2:
                return ID_ZENLY_MESSAGEBIRD;
            case 3:
                return ID_ZENLY_NEXMO;
            case 4:
                return ID_ZENLY_INFOBIP;
            case 5:
                return ID_ZENLY_CLICKATELL;
            case 6:
                return ID_ZENLY_TELESIGN;
            case 7:
                return ID_ZENLY_TELEFONICA;
            case 8:
                return ID_ZENLY_MITTO;
            case 9:
                return ID_ZENLY_AWS_PINPOINT;
            case 10:
                return ID_ZENLY_WAVECELL;
            default:
                switch (i) {
                    case 10000:
                        return ID_NEXMO_PROVIDER;
                    case 10001:
                        return ID_DIGITS_PROVIDER;
                    case 10002:
                        return ID_INFOBIP_PROVIDER;
                    case 10003:
                        return ID_DEVAUTH_PROVIDER;
                    case 10004:
                        return ID_TOKENAUTH_PROVIDER;
                    case 10005:
                        return ID_PASSAUTH_PROVIDER;
                    default:
                        return null;
                }
        }
    }

    public final int getNumber() {
        return this.f21471e;
    }
}
