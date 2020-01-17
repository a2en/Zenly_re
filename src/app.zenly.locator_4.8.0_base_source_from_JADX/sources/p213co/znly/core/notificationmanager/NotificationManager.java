package p213co.znly.core.notificationmanager;

import android.content.Context;
import androidx.core.app.C0527h;

/* renamed from: co.znly.core.notificationmanager.NotificationManager */
public class NotificationManager {
    protected C0527h manager;

    public NotificationManager(Context context) {
        this.manager = C0527h.m2485a(context);
    }

    public boolean hasNotificationsEnabled() {
        return this.manager.mo3042a();
    }
}
