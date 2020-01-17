package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.common.internal.PendingResultUtil.zaa;
import com.google.android.gms.tasks.C10694d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.x */
final class C10140x implements StatusListener {

    /* renamed from: a */
    private final /* synthetic */ PendingResult f26654a;

    /* renamed from: b */
    private final /* synthetic */ C10694d f26655b;

    /* renamed from: c */
    private final /* synthetic */ ResultConverter f26656c;

    /* renamed from: d */
    private final /* synthetic */ zaa f26657d;

    C10140x(PendingResult pendingResult, C10694d dVar, ResultConverter resultConverter, zaa zaa) {
        this.f26654a = pendingResult;
        this.f26655b = dVar;
        this.f26656c = resultConverter;
        this.f26657d = zaa;
    }

    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.f26655b.mo29327a(this.f26656c.convert(this.f26654a.mo27047a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f26655b.mo29326a((Exception) this.f26657d.zaf(status));
    }
}
