package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C10099b;

/* renamed from: com.google.android.gms.common.api.internal.a */
public class C10008a implements StatusExceptionMapper {
    public Exception getException(Status status) {
        return C10099b.m25428a(status);
    }
}
