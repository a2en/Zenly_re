package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C9981b;
import com.google.android.gms.common.C10074e;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10111g;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.C10677a;
import com.google.android.gms.signin.zac;

/* renamed from: com.google.android.gms.signin.internal.a */
public class C10682a extends C10111g<zae> implements zac {

    /* renamed from: C */
    private final boolean f27769C;

    /* renamed from: D */
    private final C10103d f27770D;

    /* renamed from: E */
    private final Bundle f27771E;

    /* renamed from: F */
    private Integer f27772F;

    private C10682a(Context context, Looper looper, boolean z, C10103d dVar, Bundle bundle, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, dVar, connectionCallbacks, onConnectionFailedListener);
        this.f27769C = true;
        this.f27770D = dVar;
        this.f27771E = bundle;
        this.f27772F = dVar.mo27450d();
    }

    /* renamed from: a */
    public static Bundle m27197a(C10103d dVar) {
        C10677a h = dVar.mo27454h();
        Integer d = dVar.mo27450d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo27446a());
        if (d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d.intValue());
        }
        if (h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h.mo29269h());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h.mo29268g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h.mo29265e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h.mo29267f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h.mo29262b());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", h.mo29263c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h.mo29271i());
            if (h.mo29261a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h.mo29261a().longValue());
            }
            if (h.mo29264d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h.mo29264d().longValue());
            }
        }
        return bundle;
    }

    public final void connect() {
        connect(new C10086a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Bundle mo27370f() {
        if (!mo27369e().getPackageName().equals(this.f27770D.mo27452f())) {
            this.f27771E.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f27770D.mo27452f());
        }
        return this.f27771E;
    }

    public int getMinApkVersion() {
        return C10074e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo27383j() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo27384k() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean requiresSignIn() {
        return this.f27769C;
    }

    public final void zaa(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zae) mo27380i()).zaa(iAccountAccessor, this.f27772F.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void zacu() {
        try {
            ((zae) mo27380i()).zam(this.f27772F.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void zaa(zac zac) {
        C10123l.m25506a(zac, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f27770D.mo27448b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = C9981b.m25009a(mo27369e()).mo26967a();
            }
            ((zae) mo27380i()).zaa(new zai(new ResolveAccountRequest(b, this.f27772F.intValue(), googleSignInAccount)), zac);
        } catch (RemoteException e) {
            String str = "SignInClientImpl";
            Log.w(str, "Remote service probably died when signIn is called");
            try {
                zac.zab(new zak(8));
            } catch (RemoteException unused) {
                Log.wtf(str, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public C10682a(Context context, Looper looper, boolean z, C10103d dVar, C10677a aVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, dVar, m27197a(dVar), connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo27354a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zae) {
            return (zae) queryLocalInterface;
        }
        return new C10686e(iBinder);
    }
}
