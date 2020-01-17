package app.zenly.locator.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import app.zenly.android.feature.base.migration.C1324a;
import app.zenly.android.feature.base.migration.C1325b;
import app.zenly.locator.notifications.p123h.C4731a;
import app.zenly.locator.notifications.p123h.C4733c;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

public final class NotificationChannelsHelper {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f12471d;

    /* renamed from: e */
    private static final int f12472e = 9;

    /* renamed from: a */
    private final Lazy f12473a;

    /* renamed from: b */
    private final NotificationManagerWrapper f12474b;

    /* renamed from: c */
    private final Property<Integer> f12475c;

    public static final class LocaleChangedReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(intent, "intent");
            if (VERSION.SDK_INT >= 26 && !(!C12932j.m33817a((Object) intent.getAction(), (Object) "android.intent.action.LOCALE_CHANGED"))) {
                new NotificationChannelsHelper(context).m13663b();
            }
        }
    }

    /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$a */
    public static final class C4703a implements Property<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f12476a;

        C4703a(Context context) {
            this.f12476a = context;
        }

        /* renamed from: a */
        public void mo11892a(int i) {
            C5408a aVar = C5407g.f13966d;
            Context applicationContext = this.f12476a.getApplicationContext();
            C12932j.m33815a((Object) applicationContext, "context.applicationContext");
            aVar.mo12991a(applicationContext).mo12982e(i);
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj) {
            mo11892a(((Number) obj).intValue());
        }

        public Integer getValue() {
            C5408a aVar = C5407g.f13966d;
            Context applicationContext = this.f12476a.getApplicationContext();
            C12932j.m33815a((Object) applicationContext, "context.applicationContext");
            return Integer.valueOf(aVar.mo12991a(applicationContext).mo12985g());
        }
    }

    /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$b */
    public static final class C4704b {
        private C4704b() {
        }

        public /* synthetic */ C4704b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c */
    static final class C4705c extends C12933k implements Function0<C1325b<NotificationManagerWrapper>> {

        /* renamed from: f */
        public static final C4705c f12477f = new C4705c();

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$a */
        public static final class C4706a extends C1324a<NotificationManagerWrapper> {
            public C4706a(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$b */
        public static final class C4707b extends C1324a<NotificationManagerWrapper> {
            public C4707b(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$c */
        public static final class C4708c extends C1324a<NotificationManagerWrapper> {
            public C4708c(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$d */
        public static final class C4709d extends C1324a<NotificationManagerWrapper> {
            public C4709d(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$e */
        public static final class C4710e extends C1324a<NotificationManagerWrapper> {
            public C4710e(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$f */
        public static final class C4711f extends C1324a<NotificationManagerWrapper> {
            public C4711f(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$g */
        public static final class C4712g extends C1324a<NotificationManagerWrapper> {
            public C4712g(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        /* renamed from: app.zenly.locator.notifications.NotificationChannelsHelper$c$h */
        public static final class C4713h extends C1324a<NotificationManagerWrapper> {
            public C4713h(int i, int i2, int i3, int i4) {
                super(i3, i4);
            }

            /* renamed from: a */
            public void mo6516a(NotificationManagerWrapper notificationManagerWrapper) {
                new C4733c(notificationManagerWrapper).mo11924b();
            }
        }

        C4705c() {
            super(0);
        }

        public final C1325b<NotificationManagerWrapper> invoke() {
            return new C1325b<>((C1324a<T>[]) new C1324a[]{new C4706a(1, 9, 1, 9), new C4707b(2, 9, 2, 9), new C4708c(3, 9, 3, 9), new C4709d(4, 9, 4, 9), new C4710e(5, 9, 5, 9), new C4711f(6, 9, 6, 9), new C4712g(7, 9, 7, 9), new C4713h(8, 9, 8, 9)});
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(NotificationChannelsHelper.class), "migrateSet", "getMigrateSet()Lapp/zenly/android/feature/base/migration/MigrationHandler;");
        C12946x.m33839a((C12940r) sVar);
        f12471d = new KProperty[]{sVar};
        new C4704b(null);
    }

    public NotificationChannelsHelper(NotificationManagerWrapper notificationManagerWrapper, Property<Integer> property) {
        C12932j.m33818b(notificationManagerWrapper, "notificationManager");
        C12932j.m33818b(property, "storedProperty");
        this.f12474b = notificationManagerWrapper;
        this.f12475c = property;
        this.f12473a = C12896f.m33751a(C4705c.f12477f);
        int intValue = ((Number) this.f12475c.getValue()).intValue();
        int i = f12472e;
        if (intValue != i) {
            if (intValue == 0) {
                m13663b();
            } else if (intValue < i) {
                m13664b(intValue, i);
            } else {
                m13661a(intValue, i);
                throw null;
            }
            this.f12475c.setValue(Integer.valueOf(f12472e));
        }
    }

    /* renamed from: a */
    private final C1325b<NotificationManagerWrapper> m13660a() {
        Lazy lazy = this.f12473a;
        KProperty kProperty = f12471d[0];
        return (C1325b) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m13663b() {
        new C4731a(this.f12474b).mo11922a();
    }

    /* renamed from: a */
    private final void m13661a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Can't downgrade notification channels from ");
        sb.append("version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new UnsupportedOperationException(sb.toString());
    }

    /* renamed from: b */
    private final void m13664b(int i, int i2) {
        m13660a().mo6518a(this.f12474b, i, i2);
    }

    public NotificationChannelsHelper(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        C12932j.m33815a((Object) applicationContext, "context.applicationContext");
        this(new C4715a(applicationContext), new C4703a(context));
    }
}
