package app.zenly.locator.core.util;

import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: app.zenly.locator.core.util.h */
public final class C3219h {
    /* renamed from: a */
    public static int m10210a(Timestamp timestamp, Timestamp timestamp2) {
        long seconds = timestamp.getSeconds() - timestamp2.getSeconds();
        if (seconds == 0) {
            seconds = (long) (timestamp.getNanos() - timestamp2.getNanos());
        }
        int i = (seconds > 0 ? 1 : (seconds == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? 1 : -1;
    }
}
