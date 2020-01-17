package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C10016d.C10017a;
import com.google.android.gms.common.util.C10174k;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
public abstract class C10015c0 {
    public C10015c0(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m25119a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C10174k.m25679b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo27153a(Status status);

    /* renamed from: a */
    public abstract void mo27154a(C10017a<?> aVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo27155a(C10061x0 x0Var, boolean z);

    /* renamed from: a */
    public abstract void mo27156a(RuntimeException runtimeException);
}
