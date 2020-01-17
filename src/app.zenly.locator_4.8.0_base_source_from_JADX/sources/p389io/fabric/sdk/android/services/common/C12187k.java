package p389io.fabric.sdk.android.services.common;

/* renamed from: io.fabric.sdk.android.services.common.k */
public enum C12187k {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: e */
    private final int f31690e;

    private C12187k(int i) {
        this.f31690e = i;
    }

    /* renamed from: a */
    public int mo36073a() {
        return this.f31690e;
    }

    public String toString() {
        return Integer.toString(this.f31690e);
    }

    /* renamed from: a */
    public static C12187k m32289a(String str) {
        if ("io.crash.air".equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }
}
