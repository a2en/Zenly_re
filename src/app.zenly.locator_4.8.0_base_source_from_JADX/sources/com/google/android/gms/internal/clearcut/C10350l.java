package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.l */
final class C10350l extends C10297e<T> {

    /* renamed from: k */
    private final Object f27127k = new Object();

    /* renamed from: l */
    private String f27128l;

    /* renamed from: m */
    private T f27129m;

    /* renamed from: n */
    private final /* synthetic */ zzan f27130n;

    C10350l(C10362n nVar, String str, Object obj, zzan zzan) {
        this.f27130n = zzan;
        super(nVar, str, obj, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo27884a(SharedPreferences sharedPreferences) {
        try {
            return mo27885a(sharedPreferences.getString(this.f26962b, ""));
        } catch (ClassCastException e) {
            String str = "Invalid byte[] value in SharedPreferences for ";
            String valueOf = String.valueOf(this.f26962b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo27885a(String str) {
        T t;
        try {
            synchronized (this.f27127k) {
                if (!str.equals(this.f27128l)) {
                    T zzb = this.f27130n.zzb(Base64.decode(str, 3));
                    this.f27128l = str;
                    this.f27129m = zzb;
                }
                t = this.f27129m;
            }
            return t;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f26962b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
