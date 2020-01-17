package p213co.znly.core.push;

import android.content.Context;

/* renamed from: co.znly.core.push.PushProvider */
public class PushProvider {
    public static void initialize(Context context) {
        FirebaseHeartbeatReceiver.getInstance().schedulePeriodicHeartbeat(context);
        FirebaseHeartbeatReceiver.getInstance().heartbeat(context);
    }
}
