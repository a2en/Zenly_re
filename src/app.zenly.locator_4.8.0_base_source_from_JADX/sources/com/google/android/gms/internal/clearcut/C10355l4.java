package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.l4 */
public enum C10355l4 implements zzcj {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    

    /* renamed from: e */
    private final int f27142e;

    static {
        new C10379p4();
    }

    private C10355l4(int i) {
        this.f27142e = i;
    }

    /* renamed from: a */
    public static C10355l4 m26308a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public final int zzc() {
        return this.f27142e;
    }
}
