package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.j */
final class C10330j extends C10297e<Boolean> {
    C10330j(C10362n nVar, String str, Boolean bool) {
        super(nVar, str, bool, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Boolean mo27884a(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f26962b, false));
        } catch (ClassCastException e) {
            String str = "Invalid boolean value in SharedPreferences for ";
            String valueOf = String.valueOf(this.f26962b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo27885a(String str) {
        if (C10310f5.f26994c.matcher(str).matches()) {
            return Boolean.valueOf(true);
        }
        if (C10310f5.f26995d.matcher(str).matches()) {
            return Boolean.valueOf(false);
        }
        String str2 = this.f26962b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
