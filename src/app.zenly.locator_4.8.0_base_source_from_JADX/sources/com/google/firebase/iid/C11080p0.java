package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.C10697f;
import com.google.android.gms.tasks.Continuation;
import com.google.firebase.FirebaseApp;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.p0 */
final class C11080p0 implements MessagingChannel {

    /* renamed from: a */
    private final FirebaseApp f28739a;

    /* renamed from: b */
    private final C11073m f28740b;

    /* renamed from: c */
    private final C11085s f28741c;

    /* renamed from: d */
    private final Executor f28742d;

    /* renamed from: e */
    private final UserAgentPublisher f28743e;

    C11080p0(FirebaseApp firebaseApp, C11073m mVar, Executor executor, UserAgentPublisher userAgentPublisher) {
        this(firebaseApp, mVar, executor, new C11085s(firebaseApp.mo32135a(), mVar), userAgentPublisher);
    }

    /* renamed from: a */
    private final C10693c<Bundle> m28517a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(AppsFlyerProperties.APP_ID, str);
        bundle.putString("gmp_app_id", this.f28739a.mo32138c().mo32163a());
        bundle.putString("gmsv", Integer.toString(this.f28740b.mo32304d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f28740b.mo32302b());
        bundle.putString("app_ver_name", this.f28740b.mo32303c());
        bundle.putString("cliv", "fiid-12451000");
        bundle.putString("Firebase-Client", this.f28743e.getUserAgent());
        C10694d dVar = new C10694d();
        this.f28742d.execute(new C11084r0(this, bundle, dVar));
        return dVar.mo29325a();
    }

    /* renamed from: b */
    private final C10693c<String> m28520b(C10693c<Bundle> cVar) {
        return cVar.mo29303a(this.f28742d, (Continuation<TResult, TContinuationResult>) new C11088t0<TResult,TContinuationResult>(this));
    }

    public final C10693c<Void> ackMessage(String str) {
        return null;
    }

    public final C10693c<Void> buildChannel(String str, String str2) {
        return C10697f.m27261a(null);
    }

    public final C10693c<Void> deleteInstanceId(String str) {
        Bundle bundle = new Bundle();
        String str2 = "delete";
        bundle.putString("iid-operation", str2);
        bundle.putString(str2, "1");
        String str3 = "*";
        return m28516a(m28520b(m28517a(str, str3, str3, bundle)));
    }

    public final C10693c<Void> deleteToken(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m28516a(m28520b(m28517a(str, str3, str4, bundle)));
    }

    public final C10693c<String> getToken(String str, String str2, String str3, String str4) {
        return m28520b(m28517a(str, str3, str4, new Bundle()));
    }

    public final boolean isAvailable() {
        return this.f28740b.mo32301a() != 0;
    }

    public final boolean isChannelBuilt() {
        return true;
    }

    public final boolean needsRefresh() {
        return false;
    }

    public final C10693c<Void> subscribeToTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        String valueOf2 = String.valueOf(str3);
        return m28516a(m28520b(m28517a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    public final C10693c<Void> unsubscribeFromTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m28516a(m28520b(m28517a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    private C11080p0(FirebaseApp firebaseApp, C11073m mVar, Executor executor, C11085s sVar, UserAgentPublisher userAgentPublisher) {
        this.f28739a = firebaseApp;
        this.f28740b = mVar;
        this.f28741c = sVar;
        this.f28742d = executor;
        this.f28743e = userAgentPublisher;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m28518a(Bundle bundle) throws IOException {
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }

    /* renamed from: a */
    private final <T> C10693c<Void> m28516a(C10693c<T> cVar) {
        return cVar.mo29303a(C11062g0.m28492a(), (Continuation<TResult, TContinuationResult>) new C11082q0<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32305a(Bundle bundle, C10694d dVar) {
        try {
            dVar.mo29327a(this.f28741c.mo32309a(bundle));
        } catch (IOException e) {
            dVar.mo29326a((Exception) e);
        }
    }
}
