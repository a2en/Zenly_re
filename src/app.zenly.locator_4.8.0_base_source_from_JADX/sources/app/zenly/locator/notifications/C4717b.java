package app.zenly.locator.notifications;

import android.content.Context;
import app.zenly.locator.notifications.p123h.C4731a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.notifications.b */
public final class C4717b {

    /* renamed from: a */
    private final C4715a f12481a;

    public C4717b(Context context) {
        C12932j.m33818b(context, "context");
        this.f12481a = new C4715a(context);
    }

    /* renamed from: a */
    public final void mo11902a() {
        if (this.f12481a.getNotificationChannels().isEmpty()) {
            for (String deleteNotificationChannel : this.f12481a.getNotificationChannelIds()) {
                this.f12481a.deleteNotificationChannel(deleteNotificationChannel);
            }
            for (String deleteNotificationChannelGroup : this.f12481a.getNotificationChannelGroupIds()) {
                this.f12481a.deleteNotificationChannelGroup(deleteNotificationChannelGroup);
            }
            new C4731a(this.f12481a).mo11922a();
        }
    }
}
