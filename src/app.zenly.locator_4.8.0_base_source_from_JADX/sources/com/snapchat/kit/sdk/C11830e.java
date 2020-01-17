package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.C11125d;
import com.snapchat.kit.sdk.core.controller.C11766a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C11791e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.security.C11818g;
import dagger.Lazy;
import java.util.List;
import okhttp3.C13204g;
import okhttp3.C13325v;

/* renamed from: com.snapchat.kit.sdk.e */
class C11830e {

    /* renamed from: a */
    private final Context f30628a;

    /* renamed from: b */
    private final String f30629b;

    /* renamed from: c */
    private final String f30630c;

    /* renamed from: d */
    private final List<String> f30631d;

    C11830e(Context context, String str, String str2, List<String> list) {
        this.f30628a = context;
        this.f30629b = str;
        this.f30630c = str2;
        this.f30631d = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Context mo34991a() {
        return this.f30628a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public LoginStateController mo34993a(C11766a aVar) {
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AuthTokenManager mo34994a(OAuth2Manager oAuth2Manager) {
        return oAuth2Manager;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo34996b() {
        return this.f30629b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo34997c() {
        return this.f30630c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C11125d mo34998d() {
        return new C11125d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public SharedPreferences mo34999e() {
        return this.f30628a.getSharedPreferences("com.snapchat.connect.sdk.sharedPreferences", 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C13204g mo35000f() {
        return new C13204g(this.f30628a.getCacheDir(), 1048576);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C13325v mo35001g() {
        return new C13325v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Handler mo35002h() {
        return new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r1 = new com.snapchat.kit.sdk.core.security.C11812c();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047 A[Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:10:0x0027] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.snapchat.kit.sdk.core.security.C11818g mo34995a(com.google.gson.C11125d r7, android.content.SharedPreferences r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f30628a
            java.lang.String r1 = "com.snapchat.connect.sdk.secureSharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r2 = 0
            r1.load(r2)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r4 = 23
            java.lang.String r5 = "rsa_public"
            if (r3 < r4) goto L_0x0027
            boolean r3 = r8.contains(r5)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            if (r3 == 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            com.snapchat.kit.sdk.core.security.e r8 = com.snapchat.kit.sdk.core.security.C11817f.m31008a(r1)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            goto L_0x005e
        L_0x0027:
            java.lang.String r3 = r8.getString(r5, r2)     // Catch:{ JsonParseException -> 0x0034, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f }
            java.lang.Class<com.snapchat.kit.sdk.core.security.d$b> r4 = com.snapchat.kit.sdk.core.security.C11813d.C11815b.class
            java.lang.Object r3 = r7.mo32457a(r3, r4)     // Catch:{ JsonParseException -> 0x0034, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f }
            com.snapchat.kit.sdk.core.security.d$b r3 = (com.snapchat.kit.sdk.core.security.C11813d.C11815b) r3     // Catch:{ JsonParseException -> 0x0034, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f }
            r2 = r3
        L_0x0034:
            com.snapchat.kit.sdk.core.security.d r3 = new com.snapchat.kit.sdk.core.security.d     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            android.content.Context r4 = r6.f30628a     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r3.<init>(r1, r4, r2)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            com.snapchat.kit.sdk.core.security.d$b r1 = r3.mo34952a()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            boolean r1 = r1.equals(r2)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x005a
            android.content.SharedPreferences$Editor r2 = r8.edit()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            com.snapchat.kit.sdk.core.security.d$b r4 = r3.mo34952a()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            java.lang.String r4 = r7.mo32460a(r4)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            android.content.SharedPreferences$Editor r2 = r2.putString(r5, r4)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r2.apply()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
        L_0x005a:
            com.snapchat.kit.sdk.core.security.e r8 = com.snapchat.kit.sdk.core.security.C11817f.m31007a(r8, r3, r1)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
        L_0x005e:
            boolean r1 = r8.mo34955b()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            if (r1 == 0) goto L_0x006f
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r1.apply()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
        L_0x006f:
            com.snapchat.kit.sdk.core.security.a r1 = new com.snapchat.kit.sdk.core.security.a     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            javax.crypto.SecretKey r8 = r8.mo34954a()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r1.<init>(r8, r7)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            goto L_0x0084
        L_0x0079:
            com.snapchat.kit.sdk.core.security.c r1 = new com.snapchat.kit.sdk.core.security.c
            r1.<init>()
            goto L_0x0084
        L_0x007f:
            com.snapchat.kit.sdk.core.security.c r1 = new com.snapchat.kit.sdk.core.security.c
            r1.<init>()
        L_0x0084:
            com.snapchat.kit.sdk.core.security.g r8 = new com.snapchat.kit.sdk.core.security.g
            r8.<init>(r0, r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C11830e.mo34995a(com.google.gson.d, android.content.SharedPreferences):com.snapchat.kit.sdk.core.security.g");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public OAuth2Manager mo34992a(C11818g gVar, C11766a aVar, C13325v vVar, C11125d dVar, Lazy<MetricQueue<ServerEvent>> lazy, C11791e eVar, Lazy<MetricQueue<OpMetric>> lazy2) {
        OAuth2Manager oAuth2Manager = new OAuth2Manager(this.f30629b, this.f30630c, this.f30631d, this.f30628a, gVar, aVar, vVar, dVar, lazy, eVar, lazy2);
        return oAuth2Manager;
    }
}
