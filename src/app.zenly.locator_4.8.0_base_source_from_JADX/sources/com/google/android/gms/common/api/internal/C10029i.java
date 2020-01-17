package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.i */
public abstract class C10029i<A extends AnyClient, ResultT> {

    /* renamed from: a */
    private final Feature[] f26393a;

    /* renamed from: b */
    private final boolean f26394b;

    /* renamed from: com.google.android.gms.common.api.internal.i$a */
    public static class C10030a<A extends AnyClient, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public RemoteCall<A, C10694d<ResultT>> f26395a;

        /* renamed from: b */
        private boolean f26396b;

        /* renamed from: c */
        private Feature[] f26397c;

        private C10030a() {
            this.f26396b = true;
        }

        /* renamed from: a */
        public C10030a<A, ResultT> mo27209a(RemoteCall<A, C10694d<ResultT>> remoteCall) {
            this.f26395a = remoteCall;
            return this;
        }

        /* renamed from: a */
        public C10030a<A, ResultT> mo27210a(Feature... featureArr) {
            this.f26397c = featureArr;
            return this;
        }

        /* renamed from: a */
        public C10029i<A, ResultT> mo27211a() {
            C10123l.m25513a(this.f26395a != null, (Object) "execute parameter required");
            return new C10028h0(this, this.f26397c, this.f26396b);
        }
    }

    @Deprecated
    public C10029i() {
        this.f26393a = null;
        this.f26394b = false;
    }

    /* renamed from: c */
    public static <A extends AnyClient, ResultT> C10030a<A, ResultT> m25210c() {
        return new C10030a<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27206a(A a, C10694d<ResultT> dVar) throws RemoteException;

    /* renamed from: a */
    public boolean mo27207a() {
        return this.f26394b;
    }

    /* renamed from: b */
    public final Feature[] mo27208b() {
        return this.f26393a;
    }

    private C10029i(Feature[] featureArr, boolean z) {
        this.f26393a = featureArr;
        this.f26394b = z;
    }
}
