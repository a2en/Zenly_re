package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.C11125d;
import com.snapchat.kit.sdk.core.controller.C11766a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C11791e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.models.AuthToken;
import com.snapchat.kit.sdk.core.models.AuthorizationRequest;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.security.C11818g;
import com.snapchat.kit.sdk.p329a.C11760a;
import com.snapchat.kit.sdk.p329a.C11760a.C11761a;
import com.snapchat.kit.sdk.util.SnapConstants;
import com.snapchat.kit.sdk.util.SnapUtils;
import dagger.Lazy;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C13167a0;
import okhttp3.C13314p.C13315a;
import okhttp3.C13325v;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import okhttp3.Call;
import okhttp3.Callback;

public class OAuth2Manager implements AuthTokenManager {

    /* renamed from: p */
    static final Set<String> f30436p = new C11752a();

    /* renamed from: a */
    private final String f30437a;

    /* renamed from: b */
    private final String f30438b;

    /* renamed from: c */
    private final List<String> f30439c;

    /* renamed from: d */
    private final Context f30440d;

    /* renamed from: e */
    private final C11818g f30441e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11766a f30442f;

    /* renamed from: g */
    private final C13325v f30443g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C11125d f30444h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Lazy<MetricQueue<ServerEvent>> f30445i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11791e f30446j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C11760a f30447k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AuthorizationRequest f30448l;

    /* renamed from: m */
    private AtomicReference<AuthToken> f30449m;

    /* renamed from: n */
    private final AtomicBoolean f30450n = new AtomicBoolean(false);

    /* renamed from: o */
    private int f30451o = 0;

    public interface OnTokenRefreshCallback {
        void onTokenRefreshFailed(boolean z);

        void onTokenRefreshSucceeded(boolean z);
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$a */
    static class C11752a extends HashSet<String> {
        C11752a() {
            add("invalid_grant");
            add("invalid_request");
            add("invalid_scope");
            add("unsupported_grant_type");
        }
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$b */
    class C11753b implements Callback {
        C11753b() {
        }

        public void onFailure(Call call, IOException iOException) {
            OAuth2Manager.this.f30447k.mo34612a(C11761a.REVOKE, false);
        }

        public void onResponse(Call call, C13167a0 a0Var) throws IOException {
            a0Var.mo37796g();
            OAuth2Manager.this.f30447k.mo34612a(C11761a.REVOKE, true);
        }
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$c */
    class C11754c implements Callback {

        /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$c$a */
        class C11755a implements Runnable {
            C11755a() {
            }

            public void run() {
                ((MetricQueue) OAuth2Manager.this.f30445i.get()).push(OAuth2Manager.this.f30446j.mo34661a(false));
                OAuth2Manager.this.f30447k.mo34612a(C11761a.GRANT, false);
                OAuth2Manager.this.f30442f.mo34626c();
            }
        }

        /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$c$b */
        class C11756b implements Runnable {
            C11756b() {
            }

            public void run() {
                ((MetricQueue) OAuth2Manager.this.f30445i.get()).push(OAuth2Manager.this.f30446j.mo34661a(true));
                OAuth2Manager.this.f30442f.mo34625b();
            }
        }

        /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$c$c */
        class C11757c implements Runnable {
            C11757c() {
            }

            public void run() {
                ((MetricQueue) OAuth2Manager.this.f30445i.get()).push(OAuth2Manager.this.f30446j.mo34661a(false));
                OAuth2Manager.this.f30447k.mo34612a(C11761a.GRANT, false);
                OAuth2Manager.this.f30442f.mo34626c();
            }
        }

        C11754c() {
        }

        public void onFailure(Call call, IOException iOException) {
            OAuth2Manager.this.m30870a((Runnable) new C11755a());
        }

        public void onResponse(Call call, C13167a0 a0Var) {
            if (!(!a0Var.mo37796g() || a0Var.mo37789a() == null || a0Var.mo37789a().mo37825c() == null)) {
                AuthToken authToken = (AuthToken) OAuth2Manager.this.f30444h.mo32455a(a0Var.mo37789a().mo37825c(), AuthToken.class);
                if (OAuth2Manager.this.mo34582b(authToken)) {
                    authToken.setLastUpdated(System.currentTimeMillis());
                    OAuth2Manager.this.mo34575a(authToken);
                    OAuth2Manager.this.f30448l = null;
                    OAuth2Manager.this.f30447k.mo34612a(C11761a.GRANT, true);
                    OAuth2Manager.this.m30870a((Runnable) new C11756b());
                    return;
                }
            }
            OAuth2Manager.this.m30870a((Runnable) new C11757c());
        }
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$d */
    class C11758d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ boolean f30457e;

        /* renamed from: f */
        final /* synthetic */ OnTokenRefreshCallback f30458f;

        /* renamed from: g */
        final /* synthetic */ boolean f30459g;

        /* renamed from: h */
        final /* synthetic */ boolean f30460h;

        C11758d(OAuth2Manager oAuth2Manager, boolean z, OnTokenRefreshCallback onTokenRefreshCallback, boolean z2, boolean z3) {
            this.f30457e = z;
            this.f30458f = onTokenRefreshCallback;
            this.f30459g = z2;
            this.f30460h = z3;
        }

        public void run() {
            if (this.f30457e) {
                this.f30458f.onTokenRefreshSucceeded(this.f30459g);
            } else {
                this.f30458f.onTokenRefreshFailed(this.f30460h);
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$e */
    private static class C11759e extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final WeakReference<OAuth2Manager> f30461a;

        /* renamed from: b */
        private final boolean f30462b;

        /* synthetic */ C11759e(OAuth2Manager oAuth2Manager, boolean z, C11752a aVar) {
            this(oAuth2Manager, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            OAuth2Manager oAuth2Manager = (OAuth2Manager) this.f30461a.get();
            if (oAuth2Manager == null) {
                return null;
            }
            oAuth2Manager.mo34577a(this.f30462b);
            return null;
        }

        private C11759e(OAuth2Manager oAuth2Manager, boolean z) {
            this.f30461a = new WeakReference<>(oAuth2Manager);
            this.f30462b = z;
        }
    }

    OAuth2Manager(String str, String str2, List<String> list, Context context, C11818g gVar, C11766a aVar, C13325v vVar, C11125d dVar, Lazy<MetricQueue<ServerEvent>> lazy, C11791e eVar, Lazy<MetricQueue<OpMetric>> lazy2) {
        this.f30437a = str;
        this.f30438b = str2;
        this.f30439c = list;
        this.f30440d = context;
        this.f30441e = gVar;
        this.f30442f = aVar;
        this.f30443g = vVar;
        this.f30444h = dVar;
        this.f30445i = lazy;
        this.f30446j = eVar;
        this.f30447k = new C11760a(lazy2);
        this.f30449m = new AtomicReference<>(null);
    }

    /* renamed from: f */
    private String m30878f() {
        AuthToken e = m30877e();
        if (e == null) {
            return null;
        }
        return e.getRefreshToken();
    }

    /* renamed from: g */
    private AuthorizationRequest m30879g() {
        return this.f30448l;
    }

    public boolean hasAccessToScope(String str) {
        AuthToken e = m30877e();
        if (e == null || e.getScope() == null) {
            return false;
        }
        return Arrays.asList(e.getScope().split(" ")).contains(str);
    }

    public boolean isUserLoggedIn() {
        return !TextUtils.isEmpty(mo34581b());
    }

    public void revokeToken() {
        AuthToken e = m30877e();
        if (e != null) {
            C13315a aVar = new C13315a();
            aVar.mo38250a("token", e.getRefreshToken());
            aVar.mo38250a(SnapConstants.CLIENT_ID, this.f30437a);
            C13331y a = m30866a((C13333z) aVar.mo38251a(), "/accounts/oauth2/revoke");
            if (a != null) {
                this.f30447k.mo34611a(C11761a.REVOKE);
                this.f30443g.newCall(a).enqueue(new C11753b());
                this.f30449m.set(null);
                mo34584c((AuthToken) null);
                this.f30442f.mo34624a();
            }
        }
    }

    public void startTokenGrant() {
        if (!TextUtils.isEmpty(this.f30438b)) {
            List<String> list = this.f30439c;
            if (list == null || list.isEmpty()) {
                throw new IllegalStateException("Valid scopes must be set");
            }
            AuthorizationRequest a = C11762b.m30905a(this.f30437a, this.f30438b, this.f30439c);
            this.f30448l = a;
            PackageManager packageManager = this.f30440d.getPackageManager();
            String str = "com.snapchat.android";
            if (this.f30451o < 3 && SnapUtils.isSnapchatInstalled(packageManager, str)) {
                Context context = this.f30440d;
                if (m30871a(context, packageManager, str, a.toUri("snapchat://", "oauth2", context.getPackageName(), null))) {
                    this.f30447k.mo34613a("authSnapchat");
                    ((MetricQueue) this.f30445i.get()).push(this.f30446j.mo34660a());
                    this.f30451o++;
                    return;
                }
            }
            Uri uri = a.toUri("https://accounts.snapchat.com/accounts", "/oauth2/auth", null, "snapkit_web");
            this.f30447k.mo34613a("authWeb");
            m30868a(uri, this.f30440d);
            ((MetricQueue) this.f30445i.get()).push(this.f30446j.mo34660a());
            return;
        }
        throw new IllegalStateException("Redirect URL must be set!");
    }

    /* renamed from: e */
    private AuthToken m30877e() {
        mo34583c();
        return (AuthToken) this.f30449m.get();
    }

    /* renamed from: b */
    public String mo34581b() {
        AuthToken e = m30877e();
        if (e == null) {
            return null;
        }
        return e.getAccessToken();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo34583c() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<com.snapchat.kit.sdk.core.models.AuthToken> r0 = r4.f30449m     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0029
            com.snapchat.kit.sdk.core.models.AuthToken r0 = r4.mo34585d()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r4)
            return
        L_0x0011:
            java.lang.String r1 = r0.getScope()     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0024
            com.snapchat.kit.sdk.OAuth2Manager$e r1 = new com.snapchat.kit.sdk.OAuth2Manager$e     // Catch:{ all -> 0x002b }
            r2 = 1
            r3 = 0
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x002b }
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
        L_0x0024:
            java.util.concurrent.atomic.AtomicReference<com.snapchat.kit.sdk.core.models.AuthToken> r1 = r4.f30449m     // Catch:{ all -> 0x002b }
            r1.set(r0)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.OAuth2Manager.mo34583c():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public AuthToken mo34585d() {
        return (AuthToken) this.f30441e.get("auth_token", AuthToken.class);
    }

    /* renamed from: b */
    private static boolean m30873b(boolean z, AuthToken authToken) {
        boolean z2 = ((double) (System.currentTimeMillis() - authToken.getLastUpdated())) >= Math.min(3600000.0d, ((double) authToken.getExpiresInMillis()) / 2.0d);
        boolean z3 = System.currentTimeMillis() >= authToken.getLastUpdated() + authToken.getExpiresInMillis();
        boolean z4 = authToken.getScope() == null;
        if (z || z2 || z3 || z4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo34572a() {
        this.f30449m.set(null);
        mo34584c((AuthToken) null);
    }

    /* renamed from: a */
    public void mo34577a(boolean z) {
        mo34578a(z, (OnTokenRefreshCallback) null);
    }

    /* renamed from: a */
    public void mo34578a(boolean z, OnTokenRefreshCallback onTokenRefreshCallback) {
        C13331y a = m30867a(z, m30877e());
        if (a != null && this.f30450n.compareAndSet(false, true)) {
            this.f30447k.mo34611a(C11761a.REFRESH);
            try {
                mo34576a(this.f30443g.newCall(a).execute(), onTokenRefreshCallback);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f30450n.set(false);
                throw th;
            }
            this.f30450n.set(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo34582b(AuthToken authToken) {
        return authToken != null && !TextUtils.isEmpty(authToken.getAccessToken()) && !TextUtils.isEmpty(authToken.getRefreshToken()) && TextUtils.equals(authToken.getTokenType(), "Bearer") && authToken.getExpiresIn() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo34584c(AuthToken authToken) {
        this.f30441e.put("auth_token", authToken);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public TokenErrorResponse mo34580b(C13167a0 a0Var) throws IOException {
        if (a0Var == null || a0Var.mo37796g() || a0Var.mo37793d() != 400) {
            return null;
        }
        return (TokenErrorResponse) this.f30444h.mo32455a(a0Var.mo37789a().mo37825c(), TokenErrorResponse.class);
    }

    /* renamed from: a */
    private C13331y m30867a(boolean z, AuthToken authToken) {
        if (!mo34582b(authToken) || !m30873b(z, authToken)) {
            return null;
        }
        C13315a aVar = new C13315a();
        String str = "refresh_token";
        aVar.mo38250a("grant_type", str);
        aVar.mo38250a(str, authToken.getRefreshToken());
        aVar.mo38250a(SnapConstants.CLIENT_ID, this.f30437a);
        return m30866a((C13333z) aVar.mo38251a(), "/accounts/oauth2/token");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34576a(C13167a0 a0Var, OnTokenRefreshCallback onTokenRefreshCallback) throws IOException {
        AuthToken a = mo34571a(a0Var);
        if (a != null) {
            if (TextUtils.isEmpty(a.getRefreshToken())) {
                a.setRefreshToken(m30878f());
            }
            if (mo34582b(a)) {
                a.setLastUpdated(System.currentTimeMillis());
                mo34575a(a);
                this.f30447k.mo34612a(C11761a.REFRESH, true);
                mo34574a(onTokenRefreshCallback, true, true, false);
                return;
            }
        }
        TokenErrorResponse b = mo34580b(a0Var);
        if (b == null || TextUtils.isEmpty(b.getError()) || !f30436p.contains(b.getError().toLowerCase())) {
            this.f30447k.mo34612a(C11761a.REFRESH, false);
            mo34574a(onTokenRefreshCallback, false, false, false);
            return;
        }
        mo34572a();
        this.f30447k.mo34612a(C11761a.REFRESH, false);
        mo34574a(onTokenRefreshCallback, false, false, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo34575a(AuthToken authToken) {
        AuthToken d = mo34585d();
        if (mo34582b(authToken) && (d == null || d.getLastUpdated() <= authToken.getLastUpdated())) {
            mo34584c(authToken);
            this.f30449m.set(authToken);
        }
    }

    /* renamed from: a */
    public void mo34573a(Uri uri) {
        AuthorizationRequest g = m30879g();
        if (uri != null) {
            String str = "code";
            if (!TextUtils.isEmpty(uri.getQueryParameter(str))) {
                String str2 = "state";
                if (!TextUtils.isEmpty(uri.getQueryParameter(str2)) && g != null && TextUtils.equals(uri.getQueryParameter(str2), g.getState()) && !TextUtils.isEmpty(g.getRedirectUri()) && !TextUtils.isEmpty(g.getCodeVerifier())) {
                    this.f30451o = 0;
                    C13315a aVar = new C13315a();
                    aVar.mo38250a("grant_type", "authorization_code");
                    aVar.mo38250a(str, uri.getQueryParameter(str));
                    aVar.mo38250a("redirect_uri", g.getRedirectUri());
                    aVar.mo38250a(SnapConstants.CLIENT_ID, this.f30437a);
                    aVar.mo38250a("code_verifier", g.getCodeVerifier());
                    C13331y a = m30866a((C13333z) aVar.mo38251a(), "/accounts/oauth2/token");
                    if (a == null) {
                        ((MetricQueue) this.f30445i.get()).push(this.f30446j.mo34661a(false));
                        this.f30442f.mo34626c();
                        return;
                    }
                    this.f30442f.mo34627d();
                    this.f30447k.mo34611a(C11761a.GRANT);
                    this.f30443g.newCall(a).enqueue(new C11754c());
                    return;
                }
            }
        }
        ((MetricQueue) this.f30445i.get()).push(this.f30446j.mo34661a(false));
        this.f30442f.mo34626c();
    }

    /* renamed from: a */
    public boolean mo34579a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        return data.toString().startsWith(this.f30438b);
    }

    /* renamed from: a */
    private C13331y m30866a(C13333z zVar, String str) {
        C13332a aVar = new C13332a();
        aVar.mo38403b("Content-Type", "application/x-www-form-urlencoded");
        aVar.mo38402b(String.format("%s%s", new Object[]{"https://accounts.snapchat.com", str}));
        aVar.mo38399a(zVar);
        return aVar.mo38400a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34574a(OnTokenRefreshCallback onTokenRefreshCallback, boolean z, boolean z2, boolean z3) {
        if (onTokenRefreshCallback != null) {
            C11758d dVar = new C11758d(this, z, onTokenRefreshCallback, z2, z3);
            m30870a((Runnable) dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AuthToken mo34571a(C13167a0 a0Var) throws IOException {
        if (a0Var == null || !a0Var.mo37796g() || a0Var.mo37789a() == null || a0Var.mo37789a().mo37825c() == null) {
            return null;
        }
        return (AuthToken) this.f30444h.mo32455a(a0Var.mo37789a().mo37825c(), AuthToken.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30870a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: a */
    private void m30868a(Uri uri, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private boolean m30871a(Context context, PackageManager packageManager, String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(str);
        intent.setFlags(268435456);
        if (intent.resolveActivity(packageManager) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
