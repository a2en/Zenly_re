package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.C9995b;
import com.google.android.gms.common.api.Result;

/* renamed from: com.google.android.gms.common.api.internal.x */
public final class C10060x<O extends ApiOptions> extends C10044p {

    /* renamed from: a */
    private final C9995b<O> f26438a;

    public C10060x(C9995b<O> bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f26438a = bVar;
    }

    /* renamed from: a */
    public final <A extends AnyClient, R extends Result, T extends C10014c<R, A>> T mo27044a(T t) {
        this.f26438a.mo27077b(t);
        return t;
    }

    /* renamed from: b */
    public final <A extends AnyClient, T extends C10014c<? extends Result, A>> T mo27045b(T t) {
        this.f26438a.mo27081c(t);
        return t;
    }

    /* renamed from: a */
    public final Looper mo27042a() {
        return this.f26438a.mo27082d();
    }
}
