package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.g */
public final class C10573g {
    /* renamed from: a */
    public static int m27020a(int i) {
        if ((i < 0 || i > 1) && (1000 > i || i > 1002)) {
            return 1;
        }
        return i;
    }

    /* renamed from: b */
    public static Status m27021b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
