package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb;

/* renamed from: com.google.android.gms.dynamite.a */
final class C10195a implements zzb {
    C10195a() {
    }

    public final int getLocalVersion(Context context, String str) {
        return DynamiteModule.m25720a(context, str);
    }

    public final int zza(Context context, String str, boolean z) throws LoadingException {
        return DynamiteModule.m25721a(context, str, z);
    }
}
