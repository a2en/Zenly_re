package zendesk.core;

import java.util.Date;

public class CoreSettings implements Settings {
    private AuthenticationType authentication;

    CoreSettings(Date date, AuthenticationType authenticationType) {
        this.authentication = authenticationType;
    }

    public AuthenticationType getAuthentication() {
        return this.authentication;
    }
}
