package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C10162a;
import com.google.android.gms.internal.common.C10450d;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.f0 */
final class C10110f0 extends C10113h implements Callback {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<C10114a, C10115h0> f26604c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f26605d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f26606e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10162a f26607f;

    /* renamed from: g */
    private final long f26608g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f26609h;

    C10110f0(Context context) {
        this.f26605d = context.getApplicationContext();
        this.f26606e = new C10450d(context.getMainLooper(), this);
        this.f26607f = C10162a.m25644a();
        this.f26608g = 5000;
        this.f26609h = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27466a(C10114a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C10123l.m25506a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f26604c) {
            C10115h0 h0Var = (C10115h0) this.f26604c.get(aVar);
            if (h0Var == null) {
                h0Var = new C10115h0(this, aVar);
                h0Var.mo27479a(serviceConnection, serviceConnection, str);
                h0Var.mo27481a(str);
                this.f26604c.put(aVar, h0Var);
            } else {
                this.f26606e.removeMessages(0, aVar);
                if (!h0Var.mo27482a(serviceConnection)) {
                    h0Var.mo27479a(serviceConnection, serviceConnection, str);
                    int c = h0Var.mo27485c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(h0Var.mo27483b(), h0Var.mo27478a());
                    } else if (c == 2) {
                        h0Var.mo27481a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = h0Var.mo27486d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27467b(C10114a aVar, ServiceConnection serviceConnection, String str) {
        C10123l.m25506a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f26604c) {
            C10115h0 h0Var = (C10115h0) this.f26604c.get(aVar);
            if (h0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (h0Var.mo27482a(serviceConnection)) {
                h0Var.mo27480a(serviceConnection, str);
                if (h0Var.mo27487e()) {
                    this.f26606e.sendMessageDelayed(this.f26606e.obtainMessage(0, aVar), this.f26608g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f26604c) {
                C10114a aVar = (C10114a) message.obj;
                C10115h0 h0Var = (C10115h0) this.f26604c.get(aVar);
                if (h0Var != null && h0Var.mo27487e()) {
                    if (h0Var.mo27486d()) {
                        h0Var.mo27484b("GmsClientSupervisor");
                    }
                    this.f26604c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f26604c) {
                C10114a aVar2 = (C10114a) message.obj;
                C10115h0 h0Var2 = (C10115h0) this.f26604c.get(aVar2);
                if (h0Var2 != null && h0Var2.mo27485c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = h0Var2.mo27483b();
                    if (b == null) {
                        b = aVar2.mo27471a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo27473b(), "unknown");
                    }
                    h0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
