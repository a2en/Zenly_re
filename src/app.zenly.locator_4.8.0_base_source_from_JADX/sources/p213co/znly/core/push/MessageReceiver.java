package p213co.znly.core.push;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/* renamed from: co.znly.core.push.MessageReceiver */
public class MessageReceiver extends FirebaseMessagingService {
    public static native void onMessageReceived(String str);

    public void onMessageReceived(RemoteMessage remoteMessage) {
        FirebaseHeartbeatReceiver.getInstance().pushBack(getApplicationContext());
        String str = "p";
        if (remoteMessage.mo32348a().containsKey(str)) {
            onMessageReceived((String) remoteMessage.mo32348a().get(str));
        }
    }

    public void onNewToken(String str) {
        super.onNewToken(str);
        TokenProvider.onTokenReceived(str);
    }
}
