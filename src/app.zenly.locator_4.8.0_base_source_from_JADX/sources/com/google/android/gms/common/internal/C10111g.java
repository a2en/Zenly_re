package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C10067c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C10111g<T extends IInterface> extends BaseGmsClient<T> implements Client, GmsClientEventManager$GmsClientEventState {

    /* renamed from: A */
    private final Set<Scope> f26610A;

    /* renamed from: B */
    private final Account f26611B;

    protected C10111g(Context context, Looper looper, int i, C10103d dVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        C10113h a = C10113h.m25475a(context);
        C10067c a2 = C10067c.m25293a();
        C10123l.m25505a(connectionCallbacks);
        ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C10123l.m25505a(onConnectionFailedListener);
        this(context, looper, a, a2, i, dVar, connectionCallbacks2, onConnectionFailedListener);
    }

    /* renamed from: a */
    private static BaseConnectionCallbacks m25466a(ConnectionCallbacks connectionCallbacks) {
        if (connectionCallbacks == null) {
            return null;
        }
        return new C10136t(connectionCallbacks);
    }

    /* renamed from: b */
    private final Set<Scope> m25468b(Set<Scope> set) {
        mo27469a(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<Scope> mo27469a(Set<Scope> set) {
        return set;
    }

    /* renamed from: c */
    public final Account mo27364c() {
        return this.f26611B;
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.f26610A : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Set<Scope> mo27379h() {
        return this.f26610A;
    }

    /* renamed from: a */
    private static BaseOnConnectionFailedListener m25467a(OnConnectionFailedListener onConnectionFailedListener) {
        if (onConnectionFailedListener == null) {
            return null;
        }
        return new C10137u(onConnectionFailedListener);
    }

    @Deprecated
    protected C10111g(Context context, Looper looper, int i, C10103d dVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, dVar, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    protected C10111g(Context context, Looper looper, C10113h hVar, C10067c cVar, int i, C10103d dVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, hVar, cVar, i, m25466a(connectionCallbacks), m25467a(onConnectionFailedListener), dVar.mo27451e());
        this.f26611B = dVar.mo27446a();
        Set<Scope> c = dVar.mo27449c();
        m25468b(c);
        this.f26610A = c;
    }
}
