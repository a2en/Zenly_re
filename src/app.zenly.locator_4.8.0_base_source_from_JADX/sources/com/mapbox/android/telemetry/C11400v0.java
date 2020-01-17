package com.mapbox.android.telemetry;

import android.os.Bundle;

/* renamed from: com.mapbox.android.telemetry.v0 */
class C11400v0 implements C11392t {

    /* renamed from: a */
    private C11392t f29497a;

    C11400v0() {
    }

    /* renamed from: a */
    public void mo33011a(C11392t tVar) {
        this.f29497a = tVar;
    }

    /* renamed from: a */
    public C11389r0 mo33010a(Bundle bundle) {
        String string = bundle.getString("com.mapbox.TestEventsServer");
        String string2 = bundle.getString("com.mapbox.TestEventsAccessToken");
        if (C11330b1.m29170a(string) || C11330b1.m29170a(string2)) {
            return this.f29497a.mo33010a(bundle);
        }
        return m29345a(string, string2);
    }

    /* renamed from: a */
    private C11389r0 m29345a(String str, String str2) {
        C11389r0 r0Var = new C11389r0(C11388r.STAGING);
        r0Var.mo33045b(str);
        r0Var.mo33043a(str2);
        return r0Var;
    }
}
