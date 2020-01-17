package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zzb;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.C9995b;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C10008a;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* renamed from: com.google.android.gms.internal.clearcut.g2 */
public final class C10314g2 extends C9995b<C9989a> implements zzb {
    private C10314g2(Context context) {
        super(context, ClearcutLogger.f26223o, null, (StatusExceptionMapper) new C10008a());
    }

    /* renamed from: a */
    public static zzb m26121a(Context context) {
        return new C10314g2(context);
    }

    public final PendingResult<Status> zzb(zze zze) {
        C10412u4 u4Var = new C10412u4(zze, mo27071a());
        mo27072a(u4Var);
        return u4Var;
    }
}
