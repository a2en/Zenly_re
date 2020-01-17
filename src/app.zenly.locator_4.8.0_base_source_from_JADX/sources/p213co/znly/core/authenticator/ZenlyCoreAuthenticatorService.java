package p213co.znly.core.authenticator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: co.znly.core.authenticator.ZenlyCoreAuthenticatorService */
public class ZenlyCoreAuthenticatorService extends Service {
    private ZenlyCoreAuthenticator authenticator;

    public IBinder onBind(Intent intent) {
        return this.authenticator.getIBinder();
    }

    public void onCreate() {
        this.authenticator = new ZenlyCoreAuthenticator(this);
    }
}
