package p213co.znly.core.authenticator;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;

/* renamed from: co.znly.core.authenticator.ZenlyCoreAuthenticator */
public class ZenlyCoreAuthenticator extends AbstractAccountAuthenticator {
    public ZenlyCoreAuthenticator(Context context) {
        super(context);
    }

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        throw new UnsupportedOperationException();
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    public String getAuthTokenLabel(String str) {
        throw new UnsupportedOperationException();
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }
}
