package com.mapbox.android.telemetry;

import android.app.AlarmManager;
import android.content.Context;

/* renamed from: com.mapbox.android.telemetry.q0 */
class C11387q0 {

    /* renamed from: c */
    static long f29480c = 180000;

    /* renamed from: a */
    private final Context f29481a;

    /* renamed from: b */
    private final C11322a f29482b;

    C11387q0(Context context, C11322a aVar) {
        this.f29481a = context;
        this.f29482b = aVar;
        m29324a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11385p0 mo33041a() {
        return new C11328b(this.f29481a, (AlarmManager) this.f29481a.getSystemService("alarm"), this.f29482b);
    }

    /* renamed from: a */
    private void m29324a(Context context) {
        if (C11330b1.m29169a(context)) {
            f29480c = 600000;
        }
    }
}
