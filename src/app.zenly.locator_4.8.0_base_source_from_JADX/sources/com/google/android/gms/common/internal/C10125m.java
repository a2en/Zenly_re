package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Api.SimpleClient;

/* renamed from: com.google.android.gms.common.internal.m */
public class C10125m<T extends IInterface> extends C10111g<T> {

    /* renamed from: C */
    private final SimpleClient<T> f26639C;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo27354a(IBinder iBinder) {
        return this.f26639C.createServiceInterface(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo27383j() {
        return this.f26639C.getServiceDescriptor();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo27384k() {
        return this.f26639C.getStartServiceAction();
    }

    /* renamed from: n */
    public SimpleClient<T> mo27501n() {
        return this.f26639C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27359a(int i, T t) {
        this.f26639C.setState(i, t);
    }
}
