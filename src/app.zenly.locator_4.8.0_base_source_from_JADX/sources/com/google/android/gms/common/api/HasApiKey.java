package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.C10011b;

public interface HasApiKey<O extends ApiOptions> {
    C10011b<O> getApiKey();
}
