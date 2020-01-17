package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public class C10099b {
    /* renamed from: a */
    public static ApiException m25428a(Status status) {
        if (status.hasResolution()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
