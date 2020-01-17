package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.C9991b;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.internal.C10014c;
import java.util.Collections;
import java.util.WeakHashMap;

@Deprecated
public abstract class GoogleApiClient {

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    static {
        Collections.newSetFromMap(new WeakHashMap());
    }

    /* renamed from: a */
    public <A extends AnyClient, R extends Result, T extends C10014c<R, A>> T mo27044a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends AnyClient, T extends C10014c<? extends Result, A>> T mo27045b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <C extends Client> C mo27043a(C9991b<C> bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public Looper mo27042a() {
        throw new UnsupportedOperationException();
    }
}
