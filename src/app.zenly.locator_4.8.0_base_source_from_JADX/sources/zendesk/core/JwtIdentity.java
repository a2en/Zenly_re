package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;

public final class JwtIdentity implements Identity {
    private final String token;

    public JwtIdentity(String str) {
        if (C12017g.m31659c(str)) {
            Logger.m31610b("JwtIdentity", "A null or empty JWT was specified. This will not work. Please check your initialisation of JwtIdentity!", new Object[0]);
        }
        this.token = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JwtIdentity.class != obj.getClass()) {
            return false;
        }
        JwtIdentity jwtIdentity = (JwtIdentity) obj;
        String str = this.token;
        String str2 = jwtIdentity.token;
        return str == null ? str2 == null : str.equals(str2);
    }

    public String getJwtUserIdentifier() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
