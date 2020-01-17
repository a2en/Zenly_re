package p213co.znly.models.footsteps;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.footsteps.g */
public enum C7315g implements EnumLite {
    TOP2(0),
    LeaderBoard(1),
    OnlyMe(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18175e;

    /* renamed from: co.znly.models.footsteps.g$a */
    class C7316a implements EnumLiteMap<C7315g> {
        C7316a() {
        }

        public C7315g findValueByNumber(int i) {
            return C7315g.m18006a(i);
        }
    }

    static {
        new C7316a();
    }

    private C7315g(int i) {
        this.f18175e = i;
    }

    /* renamed from: a */
    public static C7315g m18006a(int i) {
        if (i == 0) {
            return TOP2;
        }
        if (i == 1) {
            return LeaderBoard;
        }
        if (i != 2) {
            return null;
        }
        return OnlyMe;
    }

    public final int getNumber() {
        return this.f18175e;
    }
}
