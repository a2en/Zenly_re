package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.C9995b;
import com.google.android.gms.common.api.internal.C10008a;
import com.google.android.gms.common.api.internal.C10023f;
import com.google.android.gms.common.api.internal.C10029i;
import com.google.android.gms.common.api.internal.C10032j;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.location.C10495f0;
import com.google.android.gms.internal.location.C10502j;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.location.a */
public class C10559a extends C9995b<C9989a> {

    /* renamed from: com.google.android.gms.location.a$a */
    private static class C10560a extends C10502j {

        /* renamed from: a */
        private final C10694d<Void> f27529a;

        public C10560a(C10694d<Void> dVar) {
            this.f27529a = dVar;
        }

        public final void zza(zzad zzad) {
            C10032j.m25219a(zzad.getStatus(), this.f27529a);
        }
    }

    public C10559a(Context context) {
        super(context, C10568e.f27538c, null, (StatusExceptionMapper) new C10008a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final zzaj m26998a(C10694d<Boolean> dVar) {
        return new C10570e0(this, dVar);
    }

    /* renamed from: a */
    public C10693c<Void> mo28680a(PendingIntent pendingIntent) {
        return PendingResultUtil.m25414a(C10568e.f27539d.removeLocationUpdates(mo27071a(), pendingIntent));
    }

    /* renamed from: a */
    public C10693c<Void> mo28681a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return PendingResultUtil.m25414a(C10568e.f27539d.requestLocationUpdates(mo27071a(), locationRequest, pendingIntent));
    }

    /* renamed from: a */
    public C10693c<Void> mo28682a(LocationRequest locationRequest, C10566d dVar, Looper looper) {
        zzbd a = zzbd.m26931a(locationRequest);
        ListenerHolder a2 = C10023f.m25202a(dVar, C10495f0.m26875a(looper), C10566d.class.getSimpleName());
        return mo27075a(new C10565c0(this, a2, a, a2), new C10567d0(this, a2.mo27135b()));
    }

    /* renamed from: a */
    public C10693c<Void> mo28683a(C10566d dVar) {
        return C10032j.m25218a(mo27074a(C10023f.m25201a(dVar, C10566d.class.getSimpleName())));
    }

    /* renamed from: e */
    public C10693c<Void> mo28684e() {
        return PendingResultUtil.m25414a(C10568e.f27539d.flushLocations(mo27071a()));
    }

    /* renamed from: f */
    public C10693c<Location> mo28685f() {
        return mo27076a((C10029i<A, TResult>) new C10563b0<A,TResult>(this));
    }
}
