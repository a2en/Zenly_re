package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.common.internal.h0 */
final class C10115h0 implements ServiceConnection {

    /* renamed from: a */
    private final Map<ServiceConnection, ServiceConnection> f26620a = new HashMap();

    /* renamed from: b */
    private int f26621b = 2;

    /* renamed from: c */
    private boolean f26622c;

    /* renamed from: d */
    private IBinder f26623d;

    /* renamed from: e */
    private final C10114a f26624e;

    /* renamed from: f */
    private ComponentName f26625f;

    /* renamed from: g */
    private final /* synthetic */ C10110f0 f26626g;

    public C10115h0(C10110f0 f0Var, C10114a aVar) {
        this.f26626g = f0Var;
        this.f26624e = aVar;
    }

    /* renamed from: a */
    public final void mo27481a(String str) {
        this.f26621b = 3;
        this.f26622c = this.f26626g.f26607f.mo27589a(this.f26626g.f26605d, str, this.f26624e.mo27472a(this.f26626g.f26605d), this, this.f26624e.mo27474c());
        if (this.f26622c) {
            this.f26626g.f26606e.sendMessageDelayed(this.f26626g.f26606e.obtainMessage(1, this.f26624e), this.f26626g.f26609h);
            return;
        }
        this.f26621b = 2;
        try {
            this.f26626g.f26607f.mo27587a(this.f26626g.f26605d, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo27484b(String str) {
        this.f26626g.f26606e.removeMessages(1, this.f26624e);
        this.f26626g.f26607f.mo27587a(this.f26626g.f26605d, this);
        this.f26622c = false;
        this.f26621b = 2;
    }

    /* renamed from: c */
    public final int mo27485c() {
        return this.f26621b;
    }

    /* renamed from: d */
    public final boolean mo27486d() {
        return this.f26622c;
    }

    /* renamed from: e */
    public final boolean mo27487e() {
        return this.f26620a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f26626g.f26604c) {
            this.f26626g.f26606e.removeMessages(1, this.f26624e);
            this.f26623d = iBinder;
            this.f26625f = componentName;
            for (ServiceConnection onServiceConnected : this.f26620a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f26621b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f26626g.f26604c) {
            this.f26626g.f26606e.removeMessages(1, this.f26624e);
            this.f26623d = null;
            this.f26625f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f26620a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f26621b = 2;
        }
    }

    /* renamed from: b */
    public final ComponentName mo27483b() {
        return this.f26625f;
    }

    /* renamed from: a */
    public final void mo27479a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f26626g.f26607f;
        this.f26626g.f26605d;
        this.f26624e.mo27472a(this.f26626g.f26605d);
        this.f26620a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: a */
    public final void mo27480a(ServiceConnection serviceConnection, String str) {
        this.f26626g.f26607f;
        this.f26626g.f26605d;
        this.f26620a.remove(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo27482a(ServiceConnection serviceConnection) {
        return this.f26620a.containsKey(serviceConnection);
    }

    /* renamed from: a */
    public final IBinder mo27478a() {
        return this.f26623d;
    }
}
