package zendesk.core;

import retrofit2.Call;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13456l;

interface AccessService {
    @C13456l("/access/sdk/anonymous")
    Call<AuthenticationResponse> getAuthTokenForAnonymous(@C13445a AuthenticationRequestWrapper authenticationRequestWrapper);

    @C13456l("/access/sdk/jwt")
    Call<AuthenticationResponse> getAuthTokenForJwt(@C13445a AuthenticationRequestWrapper authenticationRequestWrapper);
}
