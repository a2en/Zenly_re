package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.Continuation;

/* renamed from: com.google.android.gms.common.api.internal.j */
public class C10032j {
    /* renamed from: a */
    public static void m25219a(Status status, C10694d<Void> dVar) {
        m25220a(status, null, dVar);
    }

    /* renamed from: a */
    public static <TResult> void m25220a(Status status, TResult tresult, C10694d<TResult> dVar) {
        if (status.isSuccess()) {
            dVar.mo29327a(tresult);
        } else {
            dVar.mo29326a((Exception) new ApiException(status));
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C10693c<Void> m25218a(C10693c<Boolean> cVar) {
        return cVar.mo29298a((Continuation<TResult, TContinuationResult>) new C10033j0<TResult,TContinuationResult>());
    }
}
