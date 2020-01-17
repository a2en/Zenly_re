package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat.Action;
import androidx.core.app.NotificationCompat.C0510c;
import androidx.core.app.NotificationCompat.C0511d;
import androidx.core.app.NotificationCompat.C0512e;
import androidx.core.p004os.C0563a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.f */
class C0525f implements NotificationBuilderWithBuilderAccessor {

    /* renamed from: a */
    private final Builder f2517a;

    /* renamed from: b */
    private final C0511d f2518b;

    /* renamed from: c */
    private RemoteViews f2519c;

    /* renamed from: d */
    private RemoteViews f2520d;

    /* renamed from: e */
    private final List<Bundle> f2521e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2522f = new Bundle();

    /* renamed from: g */
    private int f2523g;

    /* renamed from: h */
    private RemoteViews f2524h;

    C0525f(C0511d dVar) {
        this.f2518b = dVar;
        if (VERSION.SDK_INT >= 26) {
            this.f2517a = new Builder(dVar.f2449a, dVar.f2440I);
        } else {
            this.f2517a = new Builder(dVar.f2449a);
        }
        Notification notification = dVar.f2447P;
        this.f2517a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f2456h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f2452d).setContentText(dVar.f2453e).setContentInfo(dVar.f2458j).setContentIntent(dVar.f2454f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f2455g, (notification.flags & 128) != 0).setLargeIcon(dVar.f2457i).setNumber(dVar.f2459k).setProgress(dVar.f2466r, dVar.f2467s, dVar.f2468t);
        if (VERSION.SDK_INT < 21) {
            this.f2517a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f2517a.setSubText(dVar.f2464p).setUsesChronometer(dVar.f2462n).setPriority(dVar.f2460l);
            Iterator it = dVar.f2450b.iterator();
            while (it.hasNext()) {
                m2476a((Action) it.next());
            }
            Bundle bundle = dVar.f2433B;
            if (bundle != null) {
                this.f2522f.putAll(bundle);
            }
            if (VERSION.SDK_INT < 20) {
                if (dVar.f2472x) {
                    this.f2522f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.f2469u;
                if (str != null) {
                    this.f2522f.putString("android.support.groupKey", str);
                    if (dVar.f2470v) {
                        this.f2522f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2522f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.f2471w;
                if (str2 != null) {
                    this.f2522f.putString("android.support.sortKey", str2);
                }
            }
            this.f2519c = dVar.f2437F;
            this.f2520d = dVar.f2438G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f2517a.setShowWhen(dVar.f2461m);
            if (VERSION.SDK_INT < 21) {
                ArrayList<String> arrayList = dVar.f2448Q;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle2 = this.f2522f;
                    ArrayList<String> arrayList2 = dVar.f2448Q;
                    bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f2517a.setLocalOnly(dVar.f2472x).setGroup(dVar.f2469u).setGroupSummary(dVar.f2470v).setSortKey(dVar.f2471w);
            this.f2523g = dVar.f2444M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f2517a.setCategory(dVar.f2432A).setColor(dVar.f2434C).setVisibility(dVar.f2435D).setPublicVersion(dVar.f2436E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = dVar.f2448Q.iterator();
            while (it2.hasNext()) {
                this.f2517a.addPerson((String) it2.next());
            }
            this.f2524h = dVar.f2439H;
            if (dVar.f2451c.size() > 0) {
                String str3 = "android.car.EXTENSIONS";
                Bundle bundle3 = dVar.mo2995b().getBundle(str3);
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < dVar.f2451c.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), C0526g.m2481a((Action) dVar.f2451c.get(i)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.mo2995b().putBundle(str3, bundle3);
                this.f2522f.putBundle(str3, bundle3);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.f2517a.setExtras(dVar.f2433B).setRemoteInputHistory(dVar.f2465q);
            RemoteViews remoteViews = dVar.f2437F;
            if (remoteViews != null) {
                this.f2517a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f2438G;
            if (remoteViews2 != null) {
                this.f2517a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f2439H;
            if (remoteViews3 != null) {
                this.f2517a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f2517a.setBadgeIconType(dVar.f2441J).setShortcutId(dVar.f2442K).setTimeoutAfter(dVar.f2443L).setGroupAlertBehavior(dVar.f2444M);
            if (dVar.f2474z) {
                this.f2517a.setColorized(dVar.f2473y);
            }
            if (!TextUtils.isEmpty(dVar.f2440I)) {
                this.f2517a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (C0563a.m2669a()) {
            this.f2517a.setAllowSystemGeneratedContextualActions(dVar.f2445N);
            this.f2517a.setBubbleMetadata(C0510c.m2401a(dVar.f2446O));
        }
    }

    /* renamed from: a */
    public Notification mo3039a() {
        C0512e eVar = this.f2518b.f2463o;
        if (eVar != null) {
            eVar.mo2980a((NotificationBuilderWithBuilderAccessor) this);
        }
        RemoteViews c = eVar != null ? eVar.mo3006c(this) : null;
        Notification b = mo3040b();
        if (c != null) {
            b.contentView = c;
        } else {
            RemoteViews remoteViews = this.f2518b.f2437F;
            if (remoteViews != null) {
                b.contentView = remoteViews;
            }
        }
        if (VERSION.SDK_INT >= 16 && eVar != null) {
            RemoteViews b2 = eVar.mo3005b(this);
            if (b2 != null) {
                b.bigContentView = b2;
            }
        }
        if (VERSION.SDK_INT >= 21 && eVar != null) {
            RemoteViews d = this.f2518b.f2463o.mo3007d(this);
            if (d != null) {
                b.headsUpContentView = d;
            }
        }
        if (VERSION.SDK_INT >= 16 && eVar != null) {
            Bundle a = NotificationCompat.m2385a(b);
            if (a != null) {
                eVar.mo3003a(a);
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Notification mo3040b() {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return this.f2517a.build();
        }
        if (i >= 24) {
            Notification build = this.f2517a.build();
            if (this.f2523g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f2523g != 2)) {
                    m2475a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f2523g == 1) {
                    m2475a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f2517a.setExtras(this.f2522f);
            Notification build2 = this.f2517a.build();
            RemoteViews remoteViews = this.f2519c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2520d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2524h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2523g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f2523g != 2)) {
                    m2475a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f2523g == 1) {
                    m2475a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f2517a.setExtras(this.f2522f);
            Notification build3 = this.f2517a.build();
            RemoteViews remoteViews4 = this.f2519c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2520d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2523g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f2523g != 2)) {
                    m2475a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f2523g == 1) {
                    m2475a(build3);
                }
            }
            return build3;
        } else {
            String str = "android.support.actionExtras";
            if (i >= 19) {
                SparseArray a = C0526g.m2483a(this.f2521e);
                if (a != null) {
                    this.f2522f.putSparseParcelableArray(str, a);
                }
                this.f2517a.setExtras(this.f2522f);
                Notification build4 = this.f2517a.build();
                RemoteViews remoteViews6 = this.f2519c;
                if (remoteViews6 != null) {
                    build4.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.f2520d;
                if (remoteViews7 != null) {
                    build4.bigContentView = remoteViews7;
                }
                return build4;
            } else if (i < 16) {
                return this.f2517a.getNotification();
            } else {
                Notification build5 = this.f2517a.build();
                Bundle a2 = NotificationCompat.m2385a(build5);
                Bundle bundle = new Bundle(this.f2522f);
                for (String str2 : this.f2522f.keySet()) {
                    if (a2.containsKey(str2)) {
                        bundle.remove(str2);
                    }
                }
                a2.putAll(bundle);
                SparseArray a3 = C0526g.m2483a(this.f2521e);
                if (a3 != null) {
                    NotificationCompat.m2385a(build5).putSparseParcelableArray(str, a3);
                }
                RemoteViews remoteViews8 = this.f2519c;
                if (remoteViews8 != null) {
                    build5.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.f2520d;
                if (remoteViews9 != null) {
                    build5.bigContentView = remoteViews9;
                }
                return build5;
            }
        }
    }

    public Builder getBuilder() {
        return this.f2517a;
    }

    /* renamed from: a */
    private void m2476a(Action action) {
        Bundle bundle;
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(action.mo2971e(), action.mo2975i(), action.mo2967a());
            if (action.mo2972f() != null) {
                for (RemoteInput addRemoteInput : C0534i.m2506a(action.mo2972f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (action.mo2970d() != null) {
                bundle = new Bundle(action.mo2970d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.mo2968b());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.mo2968b());
            }
            bundle.putInt("android.support.action.semanticAction", action.mo2973g());
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(action.mo2973g());
            }
            if (C0563a.m2669a()) {
                builder.setContextual(action.mo2976j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", action.mo2974h());
            builder.addExtras(bundle);
            this.f2517a.addAction(builder.build());
        } else if (i >= 16) {
            this.f2521e.add(C0526g.m2479a(this.f2517a, action));
        }
    }

    /* renamed from: a */
    private void m2475a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
