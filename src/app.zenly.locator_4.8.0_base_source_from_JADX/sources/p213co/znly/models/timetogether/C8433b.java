package p213co.znly.models.timetogether;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.timetogether.b */
public enum C8433b implements EnumLite {
    UNKNOWN_CATEGORY(0),
    LIVE(1),
    MUTUAL_LOVE(2),
    CRUSH(3),
    BFF(4),
    SECOND_BEST(5),
    SCHOOL_BUDDY(6),
    JOB_MATE(7),
    PARTY_ANIMAL(8),
    LUNCH_PAL(9),
    DINER_PAL(10),
    MORNING_BEES(11),
    MOST_SEEN(12),
    FAV_FAM(13),
    ALL_TIME_MUTUAL_LOVE(14),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21397e;

    /* renamed from: co.znly.models.timetogether.b$a */
    class C8434a implements EnumLiteMap<C8433b> {
        C8434a() {
        }

        public C8433b findValueByNumber(int i) {
            return C8433b.m19506a(i);
        }
    }

    static {
        new C8434a();
    }

    private C8433b(int i) {
        this.f21397e = i;
    }

    /* renamed from: a */
    public static C8433b m19506a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CATEGORY;
            case 1:
                return LIVE;
            case 2:
                return MUTUAL_LOVE;
            case 3:
                return CRUSH;
            case 4:
                return BFF;
            case 5:
                return SECOND_BEST;
            case 6:
                return SCHOOL_BUDDY;
            case 7:
                return JOB_MATE;
            case 8:
                return PARTY_ANIMAL;
            case 9:
                return LUNCH_PAL;
            case 10:
                return DINER_PAL;
            case 11:
                return MORNING_BEES;
            case 12:
                return MOST_SEEN;
            case 13:
                return FAV_FAM;
            case 14:
                return ALL_TIME_MUTUAL_LOVE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f21397e;
    }
}
