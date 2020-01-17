package com.google.android.gms.internal.location;

import android.os.DeadObjectException;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.location.i0 */
final class C10501i0 implements zzbj<zzao> {

    /* renamed from: a */
    private final /* synthetic */ C10499h0 f27407a;

    C10501i0(C10499h0 h0Var) {
        this.f27407a = h0Var;
    }

    public final void checkConnected() {
        this.f27407a.mo27355a();
    }

    public final /* synthetic */ IInterface getService() throws DeadObjectException {
        return (zzao) this.f27407a.mo27380i();
    }
}
