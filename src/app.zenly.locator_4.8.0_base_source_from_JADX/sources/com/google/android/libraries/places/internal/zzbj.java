package com.google.android.libraries.places.internal;

import com.google.gson.C11118c;
import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.JsonSyntaxException;

public final class zzbj implements zzam {
    private final C11125d zza;

    public zzbj() {
        C11132e eVar = new C11132e();
        eVar.mo32478a(C11118c.LOWER_CASE_WITH_UNDERSCORES);
        this.zza = eVar.mo32476a();
    }

    public final <T> T zza(String str, Class<T> cls) throws zzal {
        try {
            return this.zza.mo32457a(str, cls);
        } catch (JsonSyntaxException unused) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 55);
            sb.append("Could not convert JSON string to ");
            sb.append(name);
            sb.append(" due to syntax errors.");
            throw new zzal(sb.toString());
        }
    }
}
