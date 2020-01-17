package zendesk.core;

interface AccessProvider {
    AccessToken getAndStoreAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity);

    AccessToken getAndStoreAuthTokenViaJwt(JwtIdentity jwtIdentity);
}
