package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import java.io.IOException;
import retrofit2.C13429h;

class ZendeskAccessProvider implements AccessProvider {
    private final AccessService accessService;
    private final IdentityManager identityManager;

    ZendeskAccessProvider(IdentityManager identityManager2, AccessService accessService2) {
        this.identityManager = identityManager2;
        this.accessService = accessService2;
    }

    private void storeAccessTokenAndUserId(AccessToken accessToken) {
        this.identityManager.storeAccessToken(accessToken);
    }

    public AccessToken getAndStoreAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity) {
        C13429h hVar;
        String str = "ZendeskAccessProvider";
        Logger.m31608a(str, "Requesting an access token for anonymous identity.", new Object[0]);
        AccessToken accessToken = null;
        try {
            AuthenticationRequestWrapper authenticationRequestWrapper = new AuthenticationRequestWrapper();
            authenticationRequestWrapper.setUser(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()));
            hVar = this.accessService.getAuthTokenForAnonymous(authenticationRequestWrapper).execute();
        } catch (IOException e) {
            Logger.m31607a(str, e.getMessage(), e, new Object[0]);
            hVar = null;
        }
        if (!(hVar == null || hVar.mo38662a() == null)) {
            accessToken = ((AuthenticationResponse) hVar.mo38662a()).getAuthentication();
            if (accessToken != null) {
                storeAccessTokenAndUserId(accessToken);
            }
        }
        return accessToken;
    }

    public AccessToken getAndStoreAuthTokenViaJwt(JwtIdentity jwtIdentity) {
        C13429h hVar;
        String str = "ZendeskAccessProvider";
        Logger.m31608a(str, "Requesting an access token for jwt identity.", new Object[0]);
        AccessToken accessToken = null;
        if (C12017g.m31659c(jwtIdentity.getJwtUserIdentifier())) {
            Logger.m31610b(str, "The jwt user identifier is null or empty. We cannot proceed to get an access token", new Object[0]);
            return null;
        }
        try {
            AuthenticationRequestWrapper authenticationRequestWrapper = new AuthenticationRequestWrapper();
            authenticationRequestWrapper.setUser(jwtIdentity);
            hVar = this.accessService.getAuthTokenForJwt(authenticationRequestWrapper).execute();
        } catch (IOException e) {
            Logger.m31607a(str, e.getMessage(), e, new Object[0]);
            hVar = null;
        }
        if (!(hVar == null || hVar.mo38662a() == null)) {
            accessToken = ((AuthenticationResponse) hVar.mo38662a()).getAuthentication();
            if (accessToken != null) {
                storeAccessTokenAndUserId(accessToken);
            }
        }
        return accessToken;
    }
}
