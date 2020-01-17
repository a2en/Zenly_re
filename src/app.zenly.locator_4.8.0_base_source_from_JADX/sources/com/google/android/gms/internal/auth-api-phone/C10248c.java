package com.google.android.gms.internal.auth-api-phone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C10029i;
import com.google.android.gms.common.api.internal.C10032j;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.internal.auth-api-phone.c */
abstract class C10248c extends C10029i<C10254i, Void> {

    /* renamed from: c */
    private C10694d<Void> f26867c;

    private C10248c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27764a(Status status) {
        C10032j.m25219a(status, this.f26867c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27765a(zzj zzj) throws RemoteException;

    /* synthetic */ C10248c(C10255j jVar) {
        this();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo27206a(AnyClient anyClient, C10694d dVar) throws RemoteException {
        C10254i iVar = (C10254i) anyClient;
        this.f26867c = dVar;
        mo27765a((zzj) iVar.mo27380i());
    }
}
