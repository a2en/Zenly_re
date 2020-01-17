package app.zenly.locator.notifications.p122di;

import android.content.Context;
import app.zenly.locator.notifications.C4723e;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.notifications.di.a */
public final class C4720a {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f12491b;

    /* renamed from: a */
    private final Lazy f12492a;

    /* renamed from: app.zenly.locator.notifications.di.a$a */
    static final class C4721a extends C12933k implements Function0<C4723e> {

        /* renamed from: f */
        final /* synthetic */ Context f12493f;

        C4721a(Context context) {
            this.f12493f = context;
            super(0);
        }

        public final C4723e invoke() {
            return new C4723e(this.f12493f);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C4720a.class), "notificationManager", "getNotificationManager()Lapp/zenly/locator/notifications/NotificationManager;");
        C12946x.m33839a((C12940r) sVar);
        f12491b = new KProperty[]{sVar};
    }

    public C4720a(Context context) {
        C12932j.m33818b(context, "context");
        this.f12492a = C12896f.m33751a(new C4721a(context));
    }

    /* renamed from: b */
    private final C4723e m13687b() {
        Lazy lazy = this.f12492a;
        KProperty kProperty = f12491b[0];
        return (C4723e) lazy.getValue();
    }

    /* renamed from: a */
    public final C4723e mo11918a() {
        return m13687b();
    }
}
