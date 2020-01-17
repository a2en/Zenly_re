package com.google.android.gms.location;

import android.app.Activity;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.C9995b;
import com.google.android.gms.common.api.internal.C10008a;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.C10693c;

/* renamed from: com.google.android.gms.location.h */
public class C10575h extends C9995b<C9989a> {
    public C10575h(Activity activity) {
        super(activity, C10568e.f27538c, null, (StatusExceptionMapper) new C10008a());
    }

    /* renamed from: a */
    public C10693c<C10571f> mo28698a(LocationSettingsRequest locationSettingsRequest) {
        return PendingResultUtil.m25415a(C10568e.f27541f.checkLocationSettings(mo27071a(), locationSettingsRequest), new C10571f());
    }
}
