package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C10014c;
import com.google.android.gms.common.api.internal.C10016d.C10017a;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
public final class C10039m0<A extends C10014c<? extends Result, AnyClient>> extends C10015c0 {

    /* renamed from: a */
    private final A f26404a;

    public C10039m0(int i, A a) {
        super(i);
        this.f26404a = a;
    }

    /* renamed from: a */
    public final void mo27154a(C10017a<?> aVar) throws DeadObjectException {
        try {
            this.f26404a.mo27151b(aVar.mo27178f());
        } catch (RuntimeException e) {
            mo27156a(e);
        }
    }

    /* renamed from: a */
    public final void mo27153a(Status status) {
        this.f26404a.setFailedResult(status);
    }

    /* renamed from: a */
    public final void mo27156a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f26404a.setFailedResult(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo27155a(C10061x0 x0Var, boolean z) {
        x0Var.mo27239a((BasePendingResult<? extends Result>) this.f26404a, z);
    }
}
