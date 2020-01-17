package p213co.znly.core.telephony;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;

/* renamed from: co.znly.core.telephony.GoTelephonyManager */
public class GoTelephonyManager {
    public static final String NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";
    private static final String TAG = "GoTelephonyManager";
    private final Context context;
    private final BroadcastReceiver phoneStateReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PHONE_STATE")) {
                GoTelephonyManager.this.onPhoneStateChanged(GoTelephonyManager.convertStatusToIntState(intent.getStringExtra("state")));
            }
        }
    };

    public GoTelephonyManager(Context context2) {
        this.context = context2;
    }

    public static int convertStatusToIntState(String str) {
        if (str.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
            return 1;
        }
        if (str.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
            return 2;
        }
        return str.equals(TelephonyManager.EXTRA_STATE_OFFHOOK) ? 3 : 0;
    }

    /* access modifiers changed from: private */
    public void onPhoneStateChanged(int i) {
        _onPhoneStateChanged(i);
    }

    /* access modifiers changed from: protected */
    public native void _onPhoneStateChanged(int i);

    public void removeUpdates() {
        this.context.unregisterReceiver(this.phoneStateReceiver);
    }

    public void requestUpdates() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
        intentFilter.addAction(NEW_OUTGOING_CALL);
        this.context.registerReceiver(this.phoneStateReceiver, intentFilter);
    }
}
