package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C10074e;

/* renamed from: com.google.android.gms.ads.identifier.b */
public final class C9971b {

    /* renamed from: a */
    private SharedPreferences f26171a;

    public C9971b(Context context) {
        try {
            Context remoteContext = C10074e.getRemoteContext(context);
            this.f26171a = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f26171a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo26917a(String str, float f) {
        try {
            if (this.f26171a == null) {
                return 0.0f;
            }
            return this.f26171a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26918a(String str, String str2) {
        try {
            return this.f26171a == null ? str2 : this.f26171a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo26919a(String str, boolean z) {
        try {
            if (this.f26171a == null) {
                return false;
            }
            return this.f26171a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
