package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService.C0005a;

public class PostMessageService extends Service {

    /* renamed from: e */
    private C0005a f1323e = new C0294a(this);

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    class C0294a extends C0005a {
        C0294a(PostMessageService postMessageService) {
        }

        public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onMessageChannelReady(bundle);
        }

        public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            iCustomTabsCallback.onPostMessage(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1323e;
    }
}
