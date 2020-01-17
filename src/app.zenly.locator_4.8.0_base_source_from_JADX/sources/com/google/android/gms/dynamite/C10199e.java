package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.C10192a;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb;

/* renamed from: com.google.android.gms.dynamite.e */
final class C10199e implements VersionPolicy {
    C10199e() {
    }

    public final C10192a zza(Context context, String str, zzb zzb) throws LoadingException {
        C10192a aVar = new C10192a();
        aVar.f26760a = zzb.getLocalVersion(context, str);
        aVar.f26761b = zzb.zza(context, str, true);
        if (aVar.f26760a == 0 && aVar.f26761b == 0) {
            aVar.f26762c = 0;
        } else if (aVar.f26760a >= aVar.f26761b) {
            aVar.f26762c = -1;
        } else {
            aVar.f26762c = 1;
        }
        return aVar;
    }
}
