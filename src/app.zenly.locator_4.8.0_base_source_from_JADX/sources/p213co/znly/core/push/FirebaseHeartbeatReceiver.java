package p213co.znly.core.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: co.znly.core.push.FirebaseHeartbeatReceiver */
public class FirebaseHeartbeatReceiver extends BroadcastReceiver {
    private static final String ACTION_GTALK_HEARTBEAT = "com.google.android.intent.action.GTALK_HEARTBEAT";
    private static final String ACTION_HEARTBEAT = "co.znly.core.push.firebase.intent.action.HEARTBEAT";
    private static final String ACTION_MCS_HEARTBEAT = "com.google.android.intent.action.MCS_HEARTBEAT";
    private static final long HEARTBEAT_INTERVAL = 420000;
    private static final String TAG = "FirebaseHeartbeatReceiver";
    private static FirebaseHeartbeatReceiver instance;
    private Intent gtalkIntent = new Intent(ACTION_GTALK_HEARTBEAT);
    private Intent mcsIntent = new Intent(ACTION_MCS_HEARTBEAT);

    public static synchronized FirebaseHeartbeatReceiver getInstance() {
        FirebaseHeartbeatReceiver firebaseHeartbeatReceiver;
        synchronized (FirebaseHeartbeatReceiver.class) {
            if (instance == null) {
                instance = new FirebaseHeartbeatReceiver();
            }
            firebaseHeartbeatReceiver = instance;
        }
        return firebaseHeartbeatReceiver;
    }

    private synchronized void schedulePeriodicHeartbeatAt(Context context, long j) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(ACTION_HEARTBEAT, null, context, FirebaseHeartbeatReceiver.class), 0);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        alarmManager.cancel(broadcast);
        alarmManager.setInexactRepeating(2, j, HEARTBEAT_INTERVAL, broadcast);
    }

    public synchronized void heartbeat(Context context) {
        context.sendBroadcast(this.mcsIntent);
        context.sendBroadcast(this.gtalkIntent);
    }

    public void onReceive(Context context, Intent intent) {
        getInstance().heartbeat(context);
    }

    public synchronized void pushBack(Context context) {
        schedulePeriodicHeartbeat(context);
    }

    public synchronized void schedulePeriodicHeartbeat(Context context) {
        schedulePeriodicHeartbeatAt(context, SystemClock.elapsedRealtime() + HEARTBEAT_INTERVAL);
    }
}
