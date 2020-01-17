package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
final class C10055u0 {

    /* renamed from: a */
    private final int f26432a;

    /* renamed from: b */
    private final ConnectionResult f26433b;

    C10055u0(ConnectionResult connectionResult, int i) {
        C10123l.m25505a(connectionResult);
        this.f26433b = connectionResult;
        this.f26432a = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ConnectionResult mo27233a() {
        return this.f26433b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo27234b() {
        return this.f26432a;
    }
}
