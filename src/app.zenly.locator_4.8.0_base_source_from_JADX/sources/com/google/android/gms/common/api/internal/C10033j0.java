package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
final class C10033j0 implements Continuation<Boolean, Void> {
    C10033j0() {
    }

    public final /* synthetic */ Object then(C10693c cVar) throws Exception {
        if (((Boolean) cVar.mo29315b()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
