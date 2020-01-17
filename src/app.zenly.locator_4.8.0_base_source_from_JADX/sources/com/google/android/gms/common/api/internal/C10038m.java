package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.m */
final class C10038m implements StatusListener {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f26402a;

    /* renamed from: b */
    private final /* synthetic */ C10061x0 f26403b;

    C10038m(C10061x0 x0Var, BasePendingResult basePendingResult) {
        this.f26403b = x0Var;
        this.f26402a = basePendingResult;
    }

    public final void onComplete(Status status) {
        this.f26403b.f26439a.remove(this.f26402a);
    }
}
