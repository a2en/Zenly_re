package com.google.android.gms.phenotype;

import android.net.Uri;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.C9993d;
import com.google.android.gms.internal.phenotype.C10554c;
import com.google.android.gms.internal.phenotype.C10555d;

/* renamed from: com.google.android.gms.phenotype.a */
public final class C10666a {

    /* renamed from: a */
    private static final C9993d<C10555d> f27745a = new C9993d<>();

    /* renamed from: b */
    private static final C9990a<C10555d, C9989a> f27746b = new C10675j();

    static {
        new Api("Phenotype.API", f27746b, f27745a);
        new C10554c();
    }

    /* renamed from: a */
    public static Uri m27182a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        String str2 = "content://com.google.android.gms.phenotype/";
        return Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
