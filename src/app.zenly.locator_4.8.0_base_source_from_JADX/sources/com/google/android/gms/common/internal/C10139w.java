package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C9999d;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;

/* renamed from: com.google.android.gms.common.internal.w */
final class C10139w implements ResultConverter<R, T> {

    /* renamed from: a */
    private final /* synthetic */ C9999d f26653a;

    C10139w(C9999d dVar) {
        this.f26653a = dVar;
    }

    public final /* synthetic */ Object convert(Result result) {
        this.f26653a.mo27086a(result);
        return this.f26653a;
    }
}
