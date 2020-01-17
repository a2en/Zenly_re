package zendesk.core;

import android.content.Context;
import com.google.gson.C11125d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.C13204g;
import okhttp3.C13312n;
import okhttp3.C13325v;
import okhttp3.C13325v.C13327b;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.C13430i;
import retrofit2.C13430i.C13432b;
import retrofit2.Converter.C13389a;
import retrofit2.p424l.p425a.C13439a;

class ZendeskNetworkModule {
    ZendeskNetworkModule() {
    }

    static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return new AcceptLanguageHeaderInterceptor(context);
    }

    static ZendeskAccessInterceptor provideAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        return new ZendeskAccessInterceptor(identityManager, accessProvider, storage, coreSettingsStorage);
    }

    static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(IdentityManager identityManager) {
        return new ZendeskAuthHeaderInterceptor(identityManager);
    }

    static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return new CachingInterceptor(baseStorage);
    }

    static C13325v provideCoreOkHttpClient(C13325v vVar, AcceptLanguageHeaderInterceptor acceptLanguageHeaderInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor) {
        C13327b r = vVar.mo38347r();
        r.mo38362a((Interceptor) acceptLanguageHeaderInterceptor);
        r.mo38362a((Interceptor) acceptHeaderInterceptor);
        return r.mo38367a();
    }

    static C13430i provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, C11125d dVar, C13325v vVar) {
        C13432b bVar = new C13432b();
        bVar.mo38683a(applicationConfiguration.getZendeskUrl());
        bVar.mo38687a((C13389a) C13439a.m35610a(dVar));
        bVar.mo38686a(vVar);
        return bVar.mo38688a();
    }

    static C13325v provideMediaOkHttpClient(C13325v vVar, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, CachingInterceptor cachingInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor) {
        C13327b r = vVar.mo38347r();
        r.mo38362a((Interceptor) zendeskSettingsInterceptor);
        r.mo38362a((Interceptor) cachingInterceptor);
        r.mo38362a((Interceptor) zendeskAccessInterceptor);
        r.mo38362a((Interceptor) zendeskAuthHeaderInterceptor);
        r.mo38362a((Interceptor) zendeskUnauthorizedInterceptor);
        return r.mo38367a();
    }

    static C13325v provideOkHttpClient(C13325v vVar, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor, C13204g gVar) {
        C13327b r = vVar.mo38347r();
        r.mo38362a((Interceptor) zendeskSettingsInterceptor);
        r.mo38362a((Interceptor) zendeskAccessInterceptor);
        r.mo38362a((Interceptor) zendeskAuthHeaderInterceptor);
        r.mo38362a((Interceptor) zendeskUnauthorizedInterceptor);
        r.mo38362a((Interceptor) acceptHeaderInterceptor);
        r.mo38363a(gVar);
        return r.mo38367a();
    }

    static RestServiceProvider provideRestServiceProvider(C13430i iVar, C13325v vVar, C13325v vVar2) {
        return new ZendeskRestServiceProvider(iVar, vVar, vVar2);
    }

    static C13430i provideRetrofit(ApplicationConfiguration applicationConfiguration, C11125d dVar, C13325v vVar) {
        C13432b bVar = new C13432b();
        bVar.mo38683a(applicationConfiguration.getZendeskUrl());
        bVar.mo38687a((C13389a) C13439a.m35610a(dVar));
        bVar.mo38686a(vVar);
        return bVar.mo38688a();
    }

    static ZendeskSettingsInterceptor provideSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        return new ZendeskSettingsInterceptor(sdkSettingsProviderInternal, settingsStorage);
    }

    static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage) {
        return new ZendeskUnauthorizedInterceptor(sessionStorage);
    }

    static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return new AcceptHeaderInterceptor();
    }

    /* access modifiers changed from: 0000 */
    public C13325v provideBaseOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ZendeskOauthIdHeaderInterceptor zendeskOauthIdHeaderInterceptor, UserAgentAndClientHeadersInterceptor userAgentAndClientHeadersInterceptor, ExecutorService executorService) {
        C13327b bVar = new C13327b();
        Tls12SocketFactory.enableTls12OnPreLollipop(bVar);
        bVar.mo38362a((Interceptor) zendeskOauthIdHeaderInterceptor);
        bVar.mo38362a((Interceptor) httpLoggingInterceptor);
        bVar.mo38362a((Interceptor) userAgentAndClientHeadersInterceptor);
        bVar.mo38356a(30, TimeUnit.SECONDS);
        bVar.mo38368b(30, TimeUnit.SECONDS);
        bVar.mo38371c(30, TimeUnit.SECONDS);
        bVar.mo38365a(new C13312n(executorService));
        return bVar.mo38367a();
    }

    /* access modifiers changed from: 0000 */
    public ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ApplicationConfiguration applicationConfiguration) {
        return new ZendeskOauthIdHeaderInterceptor(applicationConfiguration.getOauthClientId());
    }

    /* access modifiers changed from: 0000 */
    public UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor() {
        return new UserAgentAndClientHeadersInterceptor("2.0.1", "Core");
    }
}
