package app.zenly.locator.notifications;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0527h;
import androidx.core.app.NotificationCompat.C0509b;
import androidx.core.app.NotificationCompat.C0511d;
import androidx.core.app.NotificationCompat.C0512e;
import androidx.core.content.C0540a;
import app.zenly.locator.AppLifecycleObserver;
import app.zenly.locator.MainActivity;
import app.zenly.locator.MainActivity.C1480a;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3220i;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p213co.znly.models.C7339i;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6824b;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.notifications.C7793b;
import p213co.znly.models.notifications.C7809f;
import p213co.znly.models.notifications.C7813g;
import p213co.znly.models.notifications.C7819h;
import p213co.znly.models.notifications.C7823i;
import p213co.znly.models.notifications.C7825i0;
import p213co.znly.models.notifications.C7827j;
import p213co.znly.models.notifications.C7829j0;
import p213co.znly.models.notifications.C7837n;
import p213co.znly.models.notifications.C7841p;
import p213co.znly.models.notifications.C7845r;
import p213co.znly.models.notifications.C7849s;
import p213co.znly.models.notifications.C7857w;
import p213co.znly.models.notifications.C7857w.C7859b;
import p213co.znly.models.notifications.C7862y;
import p213co.znly.models.notifications.C7864z;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7711d;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.notifications.e */
public final class C4723e implements AppLifecycleObserver {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f12494d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f12495a;

    /* renamed from: b */
    private final Lazy f12496b = C12896f.m33751a(new C4725b(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f12497c;

    /* renamed from: app.zenly.locator.notifications.e$a */
    public static final class C4724a {
        private C4724a() {
        }

        public /* synthetic */ C4724a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.notifications.e$b */
    static final class C4725b extends C12933k implements Function0<C0527h> {

        /* renamed from: f */
        final /* synthetic */ C4723e f12498f;

        C4725b(C4723e eVar) {
            this.f12498f = eVar;
            super(0);
        }

        public final C0527h invoke() {
            return C0527h.m2485a(this.f12498f.f12495a);
        }
    }

    /* renamed from: app.zenly.locator.notifications.e$c */
    static final class C4726c implements Action {

        /* renamed from: a */
        final /* synthetic */ C4723e f12499a;

        C4726c(C4723e eVar) {
            this.f12499a = eVar;
        }

        public final void run() {
            this.f12499a.f12497c = false;
        }
    }

    /* renamed from: app.zenly.locator.notifications.e$d */
    static final /* synthetic */ class C4727d extends C12931i implements Function1<C7857w, C12956q> {
        C4727d(C4723e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo11920a(C7857w wVar) {
            C12932j.m33818b(wVar, "p1");
            ((C4723e) this.f33505f).m13704f(wVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C4723e.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onNewNotification(Lco/znly/models/notifications/NotificationProto$Notification;)V";
        }

        public final String getName() {
            return "onNewNotification";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11920a((C7857w) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.notifications.e$e */
    static final class C4728e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4728e f12500e = new C4728e();

        C4728e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting notifications stream", new Object[0]);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C4723e.class), "notificationManager", "getNotificationManager()Landroidx/core/app/NotificationManagerCompat;");
        C12946x.m33839a((C12940r) sVar);
        f12494d = new KProperty[]{sVar};
        new C4724a(null);
    }

    public C4723e(Context context) {
        C12932j.m33818b(context, "inContext");
        this.f12495a = context.getApplicationContext();
    }

    /* renamed from: b */
    private final PendingIntent m13698b() {
        C1480a aVar = MainActivity.f5311w;
        Context context = this.f12495a;
        C12932j.m33815a((Object) context, "context");
        PendingIntent activity = PendingIntent.getActivity(this.f12495a, 0, aVar.mo6997a(context), 0);
        C12932j.m33815a((Object) activity, "PendingIntent.getActivit…ontext, 0, mainIntent, 0)");
        return activity;
    }

    /* renamed from: c */
    private final PendingIntent m13700c(C7857w wVar) {
        Intent intent;
        String str = "PendingIntent.getActivit…ontext, 0, mainIntent, 0)";
        String str2 = "context";
        if (wVar.getNotificationCase() == C7859b.NO_FRIENDS) {
            C1480a aVar = MainActivity.f5311w;
            Context context = this.f12495a;
            C12932j.m33815a((Object) context, str2);
            PendingIntent activity = PendingIntent.getActivity(this.f12495a, 0, aVar.mo7004b(context), 0);
            C12932j.m33815a((Object) activity, str);
            return activity;
        } else if (wVar.getNotificationCase() == C7859b.PROFILE_PIC) {
            C1480a aVar2 = MainActivity.f5311w;
            Context context2 = this.f12495a;
            C12932j.m33815a((Object) context2, str2);
            C7864z profilePic = wVar.getProfilePic();
            C12932j.m33815a((Object) profilePic, "notification.profilePic");
            UserProto$User user = profilePic.getUser();
            C12932j.m33815a((Object) user, "notification.profilePic.user");
            String uuid = user.getUuid();
            C12932j.m33815a((Object) uuid, "notification.profilePic.user.uuid");
            PendingIntent activity2 = PendingIntent.getActivity(this.f12495a, 0, aVar2.mo7000a(context2, uuid), 0);
            C12932j.m33815a((Object) activity2, str);
            return activity2;
        } else if (wVar.getNotificationCase() == C7859b.ZENDESK) {
            C1480a aVar3 = MainActivity.f5311w;
            Context context3 = this.f12495a;
            C12932j.m33815a((Object) context3, str2);
            C7829j0 zendesk2 = wVar.getZendesk();
            C12932j.m33815a((Object) zendesk2, "notification.zendesk");
            PendingIntent activity3 = PendingIntent.getActivity(this.f12495a, 0, aVar3.mo6998a(context3, zendesk2.getTicketId()), 0);
            C12932j.m33815a((Object) activity3, str);
            return activity3;
        } else {
            String b = m13699b(wVar);
            if (b != null) {
                C1480a aVar4 = MainActivity.f5311w;
                Context context4 = this.f12495a;
                C12932j.m33815a((Object) context4, str2);
                PendingIntent activity4 = PendingIntent.getActivity(this.f12495a, 0, aVar4.mo7001a(context4, b, m13693a(wVar).getNumber()), 0);
                C12932j.m33815a((Object) activity4, str);
                return activity4;
            }
            String d = m13702d(wVar);
            if (d != null) {
                C7859b notificationCase = wVar.getNotificationCase();
                if (notificationCase != null) {
                    int i = C4729f.f12502b[notificationCase.ordinal()];
                    if (i == 1) {
                        C1480a aVar5 = MainActivity.f5311w;
                        Context context5 = this.f12495a;
                        C12932j.m33815a((Object) context5, str2);
                        intent = aVar5.mo7005b(context5, d);
                    } else if (i == 2) {
                        C1480a aVar6 = MainActivity.f5311w;
                        Context context6 = this.f12495a;
                        C12932j.m33815a((Object) context6, str2);
                        C7862y ping = wVar.getPing();
                        C12932j.m33815a((Object) ping, "notification.ping");
                        intent = aVar6.mo7003a(context6, d, ping);
                    }
                    PendingIntent activity5 = PendingIntent.getActivity(this.f12495a, 0, intent, 0);
                    C12932j.m33815a((Object) activity5, str);
                    return activity5;
                }
                C1480a aVar7 = MainActivity.f5311w;
                Context context7 = this.f12495a;
                C12932j.m33815a((Object) context7, str2);
                intent = aVar7.mo7002a(context7, d, wVar);
                PendingIntent activity52 = PendingIntent.getActivity(this.f12495a, 0, intent, 0);
                C12932j.m33815a((Object) activity52, str);
                return activity52;
            } else if (wVar.getNotificationCase() != C7859b.BRUMP) {
                return m13698b();
            } else {
                C1480a aVar8 = MainActivity.f5311w;
                Context context8 = this.f12495a;
                C12932j.m33815a((Object) context8, str2);
                C7793b brump = wVar.getBrump();
                C12932j.m33815a((Object) brump, "notification.brump");
                PendingIntent activity6 = PendingIntent.getActivity(this.f12495a, 0, aVar8.mo6999a(context8, brump), 0);
                C12932j.m33815a((Object) activity6, str);
                return activity6;
            }
        }
    }

    /* renamed from: c */
    private final C0527h m13701c() {
        Lazy lazy = this.f12496b;
        KProperty kProperty = f12494d[0];
        return (C0527h) lazy.getValue();
    }

    /* renamed from: d */
    private final String m13702d(C7857w wVar) {
        UserProto$User userProto$User;
        C7859b notificationCase = wVar.getNotificationCase();
        if (notificationCase != null) {
            switch (C4729f.f12505e[notificationCase.ordinal()]) {
                case 1:
                    C7823i countryChange = wVar.getCountryChange();
                    C12932j.m33815a((Object) countryChange, "notification.countryChange");
                    UserProto$User user = countryChange.getUser();
                    C12932j.m33815a((Object) user, "notification.countryChange.user");
                    return user.getUuid();
                case 2:
                    C7819h contactJoined = wVar.getContactJoined();
                    C12932j.m33815a((Object) contactJoined, "notification.contactJoined");
                    UserProto$User user2 = contactJoined.getUser();
                    C12932j.m33815a((Object) user2, "notification.contactJoined.user");
                    return user2.getUuid();
                case 3:
                    C7827j disableGhostAccepted = wVar.getDisableGhostAccepted();
                    C12932j.m33815a((Object) disableGhostAccepted, "notification.disableGhostAccepted");
                    UserProto$User target = disableGhostAccepted.getTarget();
                    C12932j.m33815a((Object) target, "notification.disableGhostAccepted.target");
                    return target.getUuid();
                case 4:
                    C7837n enableWifiAccepted = wVar.getEnableWifiAccepted();
                    C12932j.m33815a((Object) enableWifiAccepted, "notification.enableWifiAccepted");
                    UserProto$User user3 = enableWifiAccepted.getUser();
                    C12932j.m33815a((Object) user3, "notification.enableWifiAccepted.user");
                    return user3.getUuid();
                case 5:
                    C7845r friendIsBack = wVar.getFriendIsBack();
                    C12932j.m33815a((Object) friendIsBack, "notification.friendIsBack");
                    UserProto$User user4 = friendIsBack.getUser();
                    C12932j.m33815a((Object) user4, "notification.friendIsBack.user");
                    return user4.getUuid();
                case 6:
                    C7864z profilePic = wVar.getProfilePic();
                    C12932j.m33815a((Object) profilePic, "notification.profilePic");
                    UserProto$User user5 = profilePic.getUser();
                    C12932j.m33815a((Object) user5, "notification.profilePic.user");
                    return user5.getUuid();
                case 7:
                    String d = C5447b.m15477d(C5448c.m15478a());
                    C7849s friendRequestAccepted = wVar.getFriendRequestAccepted();
                    C12932j.m33815a((Object) friendRequestAccepted, "accepted");
                    UserProto$User author = friendRequestAccepted.getAuthor();
                    String str = "accepted.author";
                    C12932j.m33815a((Object) author, str);
                    if (C12932j.m33817a((Object) author.getUuid(), (Object) d)) {
                        userProto$User = friendRequestAccepted.getTarget();
                        C12932j.m33815a((Object) userProto$User, "accepted.target");
                    } else {
                        userProto$User = friendRequestAccepted.getAuthor();
                        C12932j.m33815a((Object) userProto$User, str);
                    }
                    return userProto$User.getUuid();
                case 8:
                    C7862y ping = wVar.getPing();
                    C12932j.m33815a((Object) ping, "notification.ping");
                    UserProto$User author2 = ping.getAuthor();
                    C12932j.m33815a((Object) author2, "notification.ping.author");
                    return author2.getUuid();
                case 9:
                    C7825i0 userMonitor = wVar.getUserMonitor();
                    C12932j.m33815a((Object) userMonitor, "notification.userMonitor");
                    UserProto$User user6 = userMonitor.getUser();
                    C12932j.m33815a((Object) user6, "notification.userMonitor.user");
                    return user6.getUuid();
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r1 = true ^ r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r1 = false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m13703e(p213co.znly.models.notifications.C7857w r5) {
        /*
            r4 = this;
            boolean r0 = r4.f12497c
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            co.znly.models.notifications.w$b r0 = r5.getNotificationCase()
            r2 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0069
        L_0x000e:
            int[] r3 = app.zenly.locator.notifications.C4729f.f12501a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L_0x0041;
                case 2: goto L_0x0041;
                case 3: goto L_0x0041;
                case 4: goto L_0x0041;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x001a;
                case 8: goto L_0x001a;
                case 9: goto L_0x001a;
                case 10: goto L_0x0069;
                case 11: goto L_0x0069;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0069
        L_0x001a:
            java.lang.String r0 = r4.m13702d(r5)
            if (r0 == 0) goto L_0x002f
            app.zenly.locator.map.a1$a r5 = app.zenly.locator.map.C3896a1.f10317n
            app.zenly.locator.map.a1 r5 = r5.mo10527a()
            java.lang.String r5 = r5.mo10517g()
            boolean r5 = kotlin.jvm.internal.C12932j.m33817a(r0, r5)
            goto L_0x0055
        L_0x002f:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            co.znly.models.notifications.w$b r5 = r5.getNotificationCase()
            java.lang.String r5 = r5.name()
            r0[r2] = r5
            java.lang.String r5 = "getUserUuid(notification) does not support %s"
            p387h.p388a.C12143a.m32037e(r5, r0)
            goto L_0x0068
        L_0x0041:
            java.lang.String r0 = r4.m13699b(r5)
            if (r0 == 0) goto L_0x0057
            app.zenly.locator.chat.y4$b r5 = app.zenly.locator.chat.C2388y4.f7188c
            app.zenly.locator.chat.y4 r5 = r5.mo8322a()
            java.lang.String r5 = r5.mo8321b()
            boolean r5 = kotlin.jvm.internal.C12932j.m33817a(r0, r5)
        L_0x0055:
            r1 = r1 ^ r5
            goto L_0x0069
        L_0x0057:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            co.znly.models.notifications.w$b r5 = r5.getNotificationCase()
            java.lang.String r5 = r5.name()
            r0[r2] = r5
            java.lang.String r5 = "getConversationUuid(notification) does not support %s"
            p387h.p388a.C12143a.m32037e(r5, r0)
        L_0x0068:
            r1 = 0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.notifications.C4723e.m13703e(co.znly.models.notifications.w):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m13704f(C7857w wVar) {
        if (m13703e(wVar)) {
            m13701c().mo3041a(wVar.getUuid(), 1, m13690a(wVar, m13700c(wVar)));
        }
    }

    public Disposable onForeground() {
        this.f12497c = true;
        Disposable a = C12276c.m32593a((Action) new C4726c(this));
        C12932j.m33815a((Object) a, "Disposables.fromAction {…eground = false\n        }");
        return a;
    }

    public Disposable onInitialize() {
        Disposable a = C5448c.m15478a().pushNotificationsStream().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4730g<Object>(new C4727d(this)), (Consumer<? super Throwable>) C4728e.f12500e);
        C12932j.m33815a((Object) a, "ZenlyCoreProvider.get().… notifications stream\") }");
        return a;
    }

    /* renamed from: b */
    private final String m13699b(C7857w wVar) {
        C7859b notificationCase = wVar.getNotificationCase();
        if (notificationCase != null) {
            int i = C4729f.f12504d[notificationCase.ordinal()];
            if (i == 1) {
                C7809f chatGroupMessage = wVar.getChatGroupMessage();
                C12932j.m33815a((Object) chatGroupMessage, "notification.chatGroupMessage");
                return chatGroupMessage.getConversationUuid();
            } else if (i == 2) {
                C7813g chatMessage = wVar.getChatMessage();
                C12932j.m33815a((Object) chatMessage, "notification.chatMessage");
                UserProto$User author = chatMessage.getAuthor();
                C12932j.m33815a((Object) author, "notification.chatMessage.author");
                return author.getUuid();
            } else if (i == 3) {
                C7862y ping = wVar.getPing();
                C12932j.m33815a((Object) ping, "notification.ping");
                return m13695a(ping);
            } else if (i == 4) {
                C7841p failedMsg = wVar.getFailedMsg();
                C12932j.m33815a((Object) failedMsg, "notification.failedMsg");
                return failedMsg.getTargetUuid();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo11919a() {
        m13701c().mo3043b();
    }

    /* renamed from: a */
    private final Notification m13691a(String str, String str2, PendingIntent pendingIntent, String str3) {
        C0509b bVar = new C0509b();
        bVar.mo2982a((CharSequence) str2);
        C0511d dVar = new C0511d(this.f12495a, str3);
        dVar.mo2991a((C0512e) bVar);
        dVar.mo2998b((CharSequence) str);
        dVar.mo2992a((CharSequence) str2);
        dVar.mo2985a(C0540a.m2536a(this.f12495a, (int) R.color.blue));
        dVar.mo3000c(2131231354);
        Context context = this.f12495a;
        C12932j.m33815a((Object) context, "context");
        dVar.mo2990a(C7711d.m18772b(context, R.raw.sound_zenly));
        dVar.mo2988a(pendingIntent);
        dVar.mo2994a(true);
        Notification a = dVar.mo2984a();
        C12932j.m33815a((Object) a, "NotificationCompat.Build…rue)\n            .build()");
        return a;
    }

    /* renamed from: a */
    private final C6826b m13693a(C7857w wVar) {
        C7859b notificationCase = wVar.getNotificationCase();
        if (notificationCase != null) {
            int i = C4729f.f12503c[notificationCase.ordinal()];
            if (i == 1) {
                C7809f chatGroupMessage = wVar.getChatGroupMessage();
                C12932j.m33815a((Object) chatGroupMessage, "notification.chatGroupMessage");
                C6824b content = chatGroupMessage.getMessage().getContent(0);
                C12932j.m33815a((Object) content, "notification.chatGroupMe…age.message.getContent(0)");
                C6826b type = content.getType();
                C12932j.m33815a((Object) type, "notification.chatGroupMe…essage.getContent(0).type");
                return type;
            } else if (i == 2) {
                C7813g chatMessage = wVar.getChatMessage();
                C12932j.m33815a((Object) chatMessage, "notification.chatMessage");
                C6824b content2 = chatMessage.getMessage().getContent(0);
                C12932j.m33815a((Object) content2, "notification.chatMessage.message.getContent(0)");
                C6826b type2 = content2.getType();
                C12932j.m33815a((Object) type2, "notification.chatMessage…essage.getContent(0).type");
                return type2;
            } else if (i == 3) {
                C7862y ping = wVar.getPing();
                C12932j.m33815a((Object) ping, "notification.ping");
                C6824b content3 = ping.getPing().getContent(0);
                C12932j.m33815a((Object) content3, "notification.ping.ping.getContent(0)");
                C6826b type3 = content3.getType();
                C12932j.m33815a((Object) type3, "notification.ping.ping.getContent(0).type");
                return type3;
            }
        }
        return C6826b.UNKNOWN;
    }

    /* renamed from: a */
    private final String m13695a(C7862y yVar) {
        if (yVar.getIsGroup()) {
            return yVar.getConversationUuid();
        }
        UserProto$User author = yVar.getAuthor();
        C12932j.m33815a((Object) author, "author");
        return author.getUuid();
    }

    /* renamed from: a */
    private final Notification m13690a(C7857w wVar, PendingIntent pendingIntent) {
        String str;
        String title = wVar.getTitle();
        if (title == null || title.length() == 0) {
            str = this.f12495a.getString(R.string.app_name);
        } else {
            str = wVar.getTitle();
        }
        String message = wVar.getMessage();
        C7859b notificationCase = wVar.getNotificationCase();
        String str2 = "9000-misc:0603-contact_joined";
        if (notificationCase != null) {
            switch (C4729f.f12506f[notificationCase.ordinal()]) {
                case 1:
                    str2 = "0200-features:0102-bump";
                    break;
                case 2:
                    C7813g chatMessage = wVar.getChatMessage();
                    C12932j.m33815a((Object) chatMessage, "chatMessage");
                    PingProto$Ping2 message2 = chatMessage.getMessage();
                    C12932j.m33815a((Object) message2, "chatMessage.message");
                    str2 = m13694a(message2);
                    break;
                case 3:
                    C7809f chatGroupMessage = wVar.getChatGroupMessage();
                    C12932j.m33815a((Object) chatGroupMessage, "chatGroupMessage");
                    PingProto$Ping2 message3 = chatGroupMessage.getMessage();
                    C12932j.m33815a((Object) message3, "chatGroupMessage.message");
                    str2 = m13694a(message3);
                    break;
                case 4:
                    str2 = "9000-misc:0202-back_live";
                    break;
                case 5:
                    C7819h contactJoined = wVar.getContactJoined();
                    C12932j.m33815a((Object) contactJoined, "contactJoined");
                    C7339i contact = contactJoined.getContact();
                    if (contact != null) {
                        str = this.f12495a.getString(R.string.notifications_contact_joined_title);
                        Context context = this.f12495a;
                        C12932j.m33815a((Object) context, "context");
                        message = C7709b.m18763a(context, R.string.notifications_contact_joined_content, C3220i.m10211a(contact));
                        break;
                    }
                    break;
                case 6:
                    str2 = "9000-misc:0702-travel";
                    break;
                case 7:
                case 8:
                    str2 = "9000-misc:0403-blur_out";
                    break;
                case 9:
                case 10:
                    str2 = "9000-misc:0503-wifi_on";
                    break;
                case 11:
                case 12:
                    str2 = "0400-core:0203-friend_request";
                    break;
                case 13:
                    str2 = "9000-misc:0303-frozen_out";
                    break;
                case 14:
                    str2 = "0200-features:0203-emojis";
                    break;
                case 15:
                    str2 = "9000-misc:0802-profile_pic";
                    break;
                case 16:
                    str2 = "0300-messaging:0203-media";
                    break;
                case 17:
                    str2 = "0100-community:0103-message";
                    break;
            }
        }
        str2 = "9000-misc:9002-others";
        C12932j.m33815a((Object) str, "title");
        C12932j.m33815a((Object) message, "content");
        return m13691a(str, message, pendingIntent, str2);
    }

    /* renamed from: a */
    private final String m13694a(PingProto$Ping2 pingProto$Ping2) {
        return (pingProto$Ping2.getContentCount() == 0 || !pingProto$Ping2.getContent(0).hasMedia()) ? "0300-messaging:0103-chat" : "0300-messaging:0203-media";
    }
}
