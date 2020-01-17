package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.c2 */
public enum C7070c2 implements EnumLite {
    MUSIC_STATE_UNKNOWN(0),
    MUSIC_STOPPED(1),
    MUSIC_PLAYING(2),
    MUSIC_PAUSED(3),
    MUSIC_INTERRUPTED(4),
    MUSIC_SEEKING_FORWARD(5),
    MUSIC_SEEKING_BACKWARD(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17493e;

    /* renamed from: co.znly.models.core.c2$a */
    class C7071a implements EnumLiteMap<C7070c2> {
        C7071a() {
        }

        public C7070c2 findValueByNumber(int i) {
            return C7070c2.m17771a(i);
        }
    }

    static {
        new C7071a();
    }

    private C7070c2(int i) {
        this.f17493e = i;
    }

    /* renamed from: a */
    public static C7070c2 m17771a(int i) {
        switch (i) {
            case 0:
                return MUSIC_STATE_UNKNOWN;
            case 1:
                return MUSIC_STOPPED;
            case 2:
                return MUSIC_PLAYING;
            case 3:
                return MUSIC_PAUSED;
            case 4:
                return MUSIC_INTERRUPTED;
            case 5:
                return MUSIC_SEEKING_FORWARD;
            case 6:
                return MUSIC_SEEKING_BACKWARD;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f17493e;
    }
}
