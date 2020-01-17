package com.mapbox.android.telemetry;

/* renamed from: com.mapbox.android.telemetry.t0 */
public class C11393t0 {

    /* renamed from: a */
    private final int f29490a;

    public C11393t0(int i) {
        m29334a(i);
        this.f29490a = i;
    }

    /* renamed from: a */
    private void m29334a(int i) {
        if (i < 1 || i > 24) {
            throw new IllegalArgumentException("The interval passed in must be an an integer in the range of 1 to 24 hours.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33048a() {
        return this.f29490a;
    }
}
