package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C10677a;
import com.google.android.gms.signin.C10680c;
import com.google.android.gms.signin.internal.C10684c;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zac;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
public final class C10022e0 extends C10684c implements ConnectionCallbacks, OnConnectionFailedListener {

    /* renamed from: h */
    private static C9990a<? extends zac, C10677a> f26379h = C10680c.f27767c;

    /* renamed from: a */
    private final Context f26380a;

    /* renamed from: b */
    private final Handler f26381b;

    /* renamed from: c */
    private final C9990a<? extends zac, C10677a> f26382c;

    /* renamed from: d */
    private Set<Scope> f26383d;

    /* renamed from: e */
    private C10103d f26384e;

    /* renamed from: f */
    private zac f26385f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zacf f26386g;

    public C10022e0(Context context, Handler handler, C10103d dVar) {
        this(context, handler, dVar, f26379h);
    }

    /* renamed from: a */
    public final void mo27198a(zacf zacf) {
        zac zac = this.f26385f;
        if (zac != null) {
            zac.disconnect();
        }
        this.f26384e.mo27447a(Integer.valueOf(System.identityHashCode(this)));
        C9990a<? extends zac, C10677a> aVar = this.f26382c;
        Context context = this.f26380a;
        Looper looper = this.f26381b.getLooper();
        C10103d dVar = this.f26384e;
        this.f26385f = (zac) aVar.mo26974a(context, looper, dVar, dVar.mo27454h(), (ConnectionCallbacks) this, (OnConnectionFailedListener) this);
        this.f26386g = zacf;
        Set<Scope> set = this.f26383d;
        if (set == null || set.isEmpty()) {
            this.f26381b.post(new C10020d0(this));
        } else {
            this.f26385f.connect();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f26385f.zaa(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f26386g.zag(connectionResult);
    }

    public final void onConnectionSuspended(int i) {
        this.f26385f.disconnect();
    }

    public final void zab(zak zak) {
        this.f26381b.post(new C10024f0(this, zak));
    }

    public C10022e0(Context context, Handler handler, C10103d dVar, C9990a<? extends zac, C10677a> aVar) {
        this.f26380a = context;
        this.f26381b = handler;
        C10123l.m25506a(dVar, (Object) "ClientSettings must not be null");
        this.f26384e = dVar;
        this.f26383d = dVar.mo27453g();
        this.f26382c = aVar;
    }

    /* renamed from: a */
    public final void mo27197a() {
        zac zac = this.f26385f;
        if (zac != null) {
            zac.disconnect();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25198a(zak zak) {
        ConnectionResult a = zak.mo29291a();
        if (a.isSuccess()) {
            ResolveAccountResponse b = zak.mo29292b();
            ConnectionResult b2 = b.mo27431b();
            if (!b2.isSuccess()) {
                String valueOf = String.valueOf(b2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f26386g.zag(b2);
                this.f26385f.disconnect();
                return;
            }
            this.f26386g.zaa(b.mo27430a(), this.f26383d);
        } else {
            this.f26386g.zag(a);
        }
        this.f26385f.disconnect();
    }
}
