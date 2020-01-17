package app.zenly.locator.notifications;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes.Builder;
import app.zenly.locator.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7711d;

/* renamed from: app.zenly.locator.notifications.a */
public final class C4715a implements NotificationManagerWrapper {

    /* renamed from: a */
    private final NotificationManager f12479a = ((NotificationManager) this.f12480b.getSystemService(NotificationManager.class));

    /* renamed from: b */
    private final Context f12480b;

    /* renamed from: app.zenly.locator.notifications.a$a */
    public static final class C4716a {
        private C4716a() {
        }

        public /* synthetic */ C4716a(C12928f fVar) {
            this();
        }
    }

    static {
        new C4716a(null);
    }

    public C4715a(Context context) {
        C12932j.m33818b(context, "context");
        this.f12480b = context;
    }

    /* renamed from: a */
    private final NotificationChannelGroup m13676a(C4719d dVar) {
        return new NotificationChannelGroup(dVar.mo11913a(), this.f12480b.getString(dVar.mo11914b()));
    }

    public void createNotificationChannelGroups(List<C4719d> list) {
        C12932j.m33818b(list, "groups");
        NotificationManager notificationManager = this.f12479a;
        ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
        for (C4719d a : list) {
            arrayList.add(m13676a(a));
        }
        notificationManager.createNotificationChannelGroups(arrayList);
    }

    public void createNotificationChannels(List<C4718c> list) {
        C12932j.m33818b(list, "channels");
        NotificationManager notificationManager = this.f12479a;
        ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
        for (C4718c a : list) {
            arrayList.add(m13675a(a));
        }
        notificationManager.createNotificationChannels(arrayList);
    }

    public void deleteNotificationChannel(String str) {
        C12932j.m33818b(str, "channelId");
        this.f12479a.deleteNotificationChannel(str);
    }

    public void deleteNotificationChannelGroup(String str) {
        C12932j.m33818b(str, "groupId");
        this.f12479a.deleteNotificationChannelGroup(str);
    }

    public List<String> getNotificationChannelGroupIds() {
        NotificationManager notificationManager = this.f12479a;
        C12932j.m33815a((Object) notificationManager, "notificationManager");
        List<NotificationChannelGroup> notificationChannelGroups = notificationManager.getNotificationChannelGroups();
        C12932j.m33815a((Object) notificationChannelGroups, "notificationManager.notificationChannelGroups");
        ArrayList arrayList = new ArrayList(C12850p.m33647a(notificationChannelGroups, 10));
        for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
            C12932j.m33815a((Object) notificationChannelGroup, "it");
            arrayList.add(notificationChannelGroup.getId());
        }
        return arrayList;
    }

    public List<String> getNotificationChannelIds() {
        NotificationManager notificationManager = this.f12479a;
        C12932j.m33815a((Object) notificationManager, "notificationManager");
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        C12932j.m33815a((Object) notificationChannels, "notificationManager.notificationChannels");
        ArrayList arrayList = new ArrayList(C12850p.m33647a(notificationChannels, 10));
        for (NotificationChannel notificationChannel : notificationChannels) {
            C12932j.m33815a((Object) notificationChannel, "it");
            arrayList.add(notificationChannel.getId());
        }
        return arrayList;
    }

    public List<NotificationChannel> getNotificationChannels() {
        NotificationManager notificationManager = this.f12479a;
        C12932j.m33815a((Object) notificationManager, "notificationManager");
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        C12932j.m33815a((Object) notificationChannels, "notificationManager.notificationChannels");
        return notificationChannels;
    }

    /* renamed from: a */
    private final NotificationChannel m13675a(C4718c cVar) {
        String str = "Deleted";
        String string = C7674a.m18692a(cVar.mo11907e()) ? this.f12480b.getString(cVar.mo11907e()) : str;
        C12932j.m33815a((Object) string, "if (ResourceId.isValid(n… else PLACEHOLDER_DELETED");
        NotificationChannel notificationChannel = new NotificationChannel(cVar.mo11905c(), string, m13674a(cVar.mo11906d()));
        if (cVar.mo11904b() != null) {
            notificationChannel.setGroup(cVar.mo11904b());
        }
        if (cVar.mo11903a() != null) {
            if (C7674a.m18692a(cVar.mo11903a().intValue())) {
                notificationChannel.setDescription(this.f12480b.getString(cVar.mo11903a().intValue()));
            } else {
                notificationChannel.setDescription(str);
            }
        }
        notificationChannel.setShowBadge(cVar.mo11910g());
        if (cVar.mo11909f()) {
            notificationChannel.setSound(C7711d.m18772b(this.f12480b, R.raw.sound_zenly), new Builder().setUsage(5).setContentType(4).build());
        }
        return notificationChannel;
    }

    /* renamed from: a */
    private final int m13674a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 5) {
            return 5;
        }
        throw new IllegalArgumentException();
    }
}
