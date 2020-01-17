package app.zenly.locator.p143s.p148l;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat.C0511d;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.ZenlyCore.Builder;
import p213co.znly.core.location.NotificationProvider;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.s.l.c */
public final class C5448c {

    /* renamed from: a */
    private static ZenlyCore f14019a;

    /* renamed from: app.zenly.locator.s.l.c$a */
    static final class C5449a implements NotificationProvider {

        /* renamed from: a */
        final /* synthetic */ Context f14020a;

        C5449a(Context context) {
            this.f14020a = context;
        }

        public final Notification getNotification() {
            PendingIntent activity = PendingIntent.getActivity(this.f14020a, 0, this.f14020a.getPackageManager().getLaunchIntentForPackage(this.f14020a.getPackageName()), 0);
            C0511d dVar = new C0511d(this.f14020a, "0400-core:0101-geolocation");
            dVar.mo2996b(-1);
            dVar.mo3002c(true);
            dVar.mo2999b(true);
            dVar.mo2985a(C0540a.m2536a(this.f14020a, (int) R.color.blue));
            dVar.mo3000c(2131231355);
            dVar.mo2988a(activity);
            dVar.mo2998b((CharSequence) "Zenly");
            dVar.mo2992a((CharSequence) C7709b.m18762a(this.f14020a, R.string.notification_foreground_location));
            return dVar.mo2984a();
        }
    }

    static {
        new C5448c();
    }

    private C5448c() {
    }

    /* renamed from: a */
    public static final void m15479a(Context context) {
        C12932j.m33818b(context, "context");
        ZenlyCore build = new Builder(context, "rpc.znly.co:443", new C5449a(context)).build();
        C12932j.m33815a((Object) build, "builder.build()");
        f14019a = build;
        Object[] objArr = new Object[1];
        ZenlyCore zenlyCore = f14019a;
        if (zenlyCore != null) {
            objArr[0] = zenlyCore.version();
            C12143a.m32027a("ZenlyCore for WRITE ONLY (on testing, PROD) %s initialized", objArr);
            return;
        }
        C12932j.m33820c("zenlyCore");
        throw null;
    }

    /* renamed from: a */
    public static final ZenlyCore m15478a() {
        ZenlyCore zenlyCore = f14019a;
        if (zenlyCore != null) {
            return zenlyCore;
        }
        C12932j.m33820c("zenlyCore");
        throw null;
    }
}
