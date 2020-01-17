package app.zenly.locator.notifications;

import android.app.NotificationChannel;
import java.util.List;

public interface NotificationManagerWrapper {

    /* renamed from: app.zenly.locator.notifications.NotificationManagerWrapper$a */
    public static final class C4714a {

        /* renamed from: a */
        static final /* synthetic */ C4714a f12478a = new C4714a();

        private C4714a() {
        }
    }

    static {
        C4714a aVar = C4714a.f12478a;
    }

    void createNotificationChannelGroups(List<C4719d> list);

    void createNotificationChannels(List<C4718c> list);

    void deleteNotificationChannel(String str);

    void deleteNotificationChannelGroup(String str);

    List<String> getNotificationChannelGroupIds();

    List<String> getNotificationChannelIds();

    List<NotificationChannel> getNotificationChannels();
}
