package com.mapbox.android.telemetry.location;

import com.mapbox.android.telemetry.C11330b1;

/* renamed from: com.mapbox.android.telemetry.location.e */
public class C11376e {

    /* renamed from: a */
    private final long f29470a;

    /* renamed from: b */
    private String f29471b;

    /* renamed from: c */
    private long f29472c;

    public C11376e() {
        this(86400000);
    }

    /* renamed from: a */
    public long mo33024a() {
        return this.f29470a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo33025b() {
        if (System.currentTimeMillis() - this.f29472c >= this.f29470a || this.f29471b == null) {
            this.f29471b = C11330b1.m29171b();
            this.f29472c = System.currentTimeMillis();
        }
        return this.f29471b;
    }

    public C11376e(long j) {
        this.f29471b = null;
        this.f29470a = j;
    }
}
