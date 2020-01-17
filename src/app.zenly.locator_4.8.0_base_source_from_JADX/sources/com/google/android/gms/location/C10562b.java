package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.C9995b;
import com.google.android.gms.common.api.internal.C10008a;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.C10693c;
import java.util.List;

/* renamed from: com.google.android.gms.location.b */
public class C10562b extends C9995b<C9989a> {
    public C10562b(Context context) {
        super(context, C10568e.f27538c, null, (StatusExceptionMapper) new C10008a());
    }

    /* renamed from: a */
    public C10693c<Void> mo28688a(PendingIntent pendingIntent) {
        return PendingResultUtil.m25414a(C10568e.f27540e.removeGeofences(mo27071a(), pendingIntent));
    }

    /* renamed from: a */
    public C10693c<Void> mo28689a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return PendingResultUtil.m25414a(C10568e.f27540e.addGeofences(mo27071a(), geofencingRequest, pendingIntent));
    }

    /* renamed from: a */
    public C10693c<Void> mo28690a(List<String> list) {
        return PendingResultUtil.m25414a(C10568e.f27540e.removeGeofences(mo27071a(), list));
    }
}
