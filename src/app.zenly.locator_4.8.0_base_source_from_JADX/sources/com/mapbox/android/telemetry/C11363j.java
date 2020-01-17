package com.mapbox.android.telemetry;

import android.os.Bundle;

/* renamed from: com.mapbox.android.telemetry.j */
class C11363j implements C11392t {

    /* renamed from: a */
    private C11392t f29456a;

    C11363j() {
    }

    /* renamed from: a */
    public void mo33011a(C11392t tVar) {
        this.f29456a = tVar;
    }

    /* renamed from: a */
    public C11389r0 mo33010a(Bundle bundle) {
        if (bundle.getBoolean("com.mapbox.CnEventsServer")) {
            return new C11389r0(C11388r.CHINA);
        }
        return this.f29456a.mo33010a(bundle);
    }
}
