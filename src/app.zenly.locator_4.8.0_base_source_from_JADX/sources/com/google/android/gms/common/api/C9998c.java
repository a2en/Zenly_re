package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C10027h;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.api.c */
public final class C9998c {
    /* renamed from: a */
    public static PendingResult<Status> m25073a(Status status, GoogleApiClient googleApiClient) {
        C10123l.m25506a(status, (Object) "Result must not be null");
        C10027h hVar = new C10027h(googleApiClient);
        hVar.mo27108a(status);
        return hVar;
    }
}
