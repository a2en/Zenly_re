package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13170b0;
import okhttp3.C13321t;
import okhttp3.C13328w;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class ZendeskAccessInterceptor implements Interceptor {
    private AccessProvider accessProvider;
    private CoreSettingsStorage coreSettingsStorage;
    private IdentityManager identityManager;
    private Storage storage;

    ZendeskAccessInterceptor(IdentityManager identityManager2, AccessProvider accessProvider2, Storage storage2, CoreSettingsStorage coreSettingsStorage2) {
        this.identityManager = identityManager2;
        this.accessProvider = accessProvider2;
        this.storage = storage2;
        this.coreSettingsStorage = coreSettingsStorage2;
    }

    static String getErrorLogMessage(AuthenticationType authenticationType, Identity identity) {
        StringBuilder sb = new StringBuilder(160);
        sb.append("The expected type of authentication is ");
        String str = "jwt.";
        String str2 = "anonymous.";
        if (authenticationType == null) {
            sb.append("null. Check that settings have been downloaded.");
        } else if (authenticationType == AuthenticationType.ANONYMOUS) {
            sb.append(str2);
        } else if (authenticationType == AuthenticationType.JWT) {
            sb.append(str);
        }
        sb.append(10);
        sb.append("The local identity is");
        if (identity == null) {
            sb.append(" not");
        }
        sb.append(" present.\n");
        if (identity != null) {
            sb.append("The local identity is ");
            if (identity instanceof AnonymousIdentity) {
                sb.append(str2);
            } else if (identity instanceof JwtIdentity) {
                sb.append(str);
            } else {
                sb.append("unknown.");
            }
        }
        return sb.toString();
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        Identity identity = this.identityManager.getIdentity();
        String str = "ZendeskAccessIntercepto";
        if (this.identityManager.getStoredAccessTokenAsBearerToken() == null) {
            Logger.m31608a(str, "Access token is required, intercepting.", new Object[0]);
            AuthenticationType authentication = this.coreSettingsStorage.getCoreSettings().getAuthentication();
            if (AuthenticationType.ANONYMOUS == authentication && (identity instanceof AnonymousIdentity)) {
                Logger.m31608a(str, "Anonymous Identity found. Requesting and storing auth token.", new Object[0]);
                this.accessProvider.getAndStoreAuthTokenViaAnonymous((AnonymousIdentity) identity);
            } else if (AuthenticationType.JWT != authentication || !(identity instanceof JwtIdentity)) {
                this.storage.clear();
                String errorLogMessage = getErrorLogMessage(authentication, identity);
                Logger.m31610b(str, errorLogMessage, new Object[0]);
                C13168a aVar = new C13168a();
                aVar.mo37815a(chain.request());
                aVar.mo37814a(C13328w.HTTP_2);
                aVar.mo37806a(400);
                aVar.mo37808a(errorLogMessage);
                aVar.mo37811a(C13170b0.m34433a(C13321t.m35172b("txt/json"), "{}"));
                return aVar.mo37816a();
            } else {
                Logger.m31608a(str, "JWT Identity found. Requesting and storing auth token.", new Object[0]);
                this.accessProvider.getAndStoreAuthTokenViaJwt((JwtIdentity) identity);
            }
        } else {
            Logger.m31608a(str, "Access token present, no need to intercept.", new Object[0]);
        }
        return chain.proceed(chain.request());
    }
}
