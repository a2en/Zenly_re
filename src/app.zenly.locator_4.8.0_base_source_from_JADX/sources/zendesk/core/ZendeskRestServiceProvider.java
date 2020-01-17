package zendesk.core;

import okhttp3.C13325v;
import okhttp3.C13325v.C13327b;
import okhttp3.Interceptor;
import retrofit2.C13430i;
import retrofit2.C13430i.C13432b;

class ZendeskRestServiceProvider implements RestServiceProvider {
    private final C13325v mediaHttpClient;
    private final C13430i retrofit;
    private final C13325v standardOkHttpClient;

    ZendeskRestServiceProvider(C13430i iVar, C13325v vVar, C13325v vVar2) {
        this.retrofit = iVar;
        this.mediaHttpClient = vVar;
        this.standardOkHttpClient = vVar2;
    }

    public <E> E createRestService(Class<E> cls, String str, String str2) {
        C13432b c = this.retrofit.mo38681c();
        C13327b r = this.standardOkHttpClient.mo38347r();
        r.mo38362a((Interceptor) new UserAgentAndClientHeadersInterceptor(str, str2));
        c.mo38686a(r.mo38367a());
        return c.mo38688a().mo38670a(cls);
    }

    public C13325v getMediaOkHttpClient() {
        return this.mediaHttpClient;
    }

    public <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        C13327b r = this.standardOkHttpClient.mo38347r();
        customNetworkConfig.configureOkHttpClient(r);
        r.mo38362a((Interceptor) new UserAgentAndClientHeadersInterceptor(str, str2));
        C13432b c = this.retrofit.mo38681c();
        customNetworkConfig.configureRetrofit(c);
        c.mo38686a(r.mo38367a());
        return c.mo38688a().mo38670a(cls);
    }
}
