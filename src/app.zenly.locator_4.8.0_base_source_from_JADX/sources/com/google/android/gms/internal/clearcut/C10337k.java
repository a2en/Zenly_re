package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.k */
final class C10337k extends C10297e<String> {
    C10337k(C10362n nVar, String str, String str2) {
        super(nVar, str, str2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String mo27884a(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f26962b, null);
        } catch (ClassCastException e) {
            String str = "Invalid string value in SharedPreferences for ";
            String valueOf = String.valueOf(this.f26962b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo27885a(String str) {
        return str;
    }
}
