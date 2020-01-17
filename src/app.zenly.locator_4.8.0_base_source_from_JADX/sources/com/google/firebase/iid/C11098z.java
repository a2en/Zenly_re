package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.z */
final class C11098z implements Runnable {

    /* renamed from: e */
    private final long f28779e;

    /* renamed from: f */
    private final WakeLock f28780f = ((PowerManager) mo32330a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: g */
    private final FirebaseInstanceId f28781g;

    /* renamed from: h */
    private final C11052b0 f28782h;

    C11098z(FirebaseInstanceId firebaseInstanceId, C11073m mVar, C11052b0 b0Var, long j) {
        this.f28781g = firebaseInstanceId;
        this.f28782h = b0Var;
        this.f28779e = j;
        this.f28780f.setReferenceCounted(false);
    }

    /* renamed from: c */
    private final boolean m28575c() {
        String str = "FirebaseInstanceId";
        C11093w zzk = this.f28781g.zzk();
        if (!this.f28781g.zzr() && !this.f28781g.zza(zzk)) {
            return true;
        }
        try {
            String zzl = this.f28781g.zzl();
            if (zzl == null) {
                Log.e(str, "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Token successfully retrieved");
            }
            if (zzk == null || (zzk != null && !zzl.equals(zzk.f28769a))) {
                Context a = mo32330a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", zzl);
                C11089u.m28536b(a, intent);
                C11089u.m28533a(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (IOException | SecurityException e) {
            String str2 = "Token retrieval failed: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo32330a() {
        return this.f28781g.zzi().mo32135a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo32331b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo32330a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        try {
            if (C11089u.m28535b().mo32313a(mo32330a())) {
                this.f28780f.acquire();
            }
            this.f28781g.zza(true);
            if (!this.f28781g.zzo()) {
                this.f28781g.zza(false);
            } else if (!C11089u.m28535b().mo32314b(mo32330a()) || mo32331b()) {
                if (!m28575c() || !this.f28782h.mo32268a(this.f28781g)) {
                    this.f28781g.zza(this.f28779e);
                } else {
                    this.f28781g.zza(false);
                }
                if (C11089u.m28535b().mo32313a(mo32330a())) {
                    this.f28780f.release();
                }
            } else {
                new C11097y(this).mo32328a();
                if (C11089u.m28535b().mo32313a(mo32330a())) {
                    this.f28780f.release();
                }
            }
        } finally {
            if (C11089u.m28535b().mo32313a(mo32330a())) {
                this.f28780f.release();
            }
        }
    }
}
