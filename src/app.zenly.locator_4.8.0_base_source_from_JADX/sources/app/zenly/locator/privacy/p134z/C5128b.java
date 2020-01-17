package app.zenly.locator.privacy.p134z;

import android.util.Pair;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.privacy.model.C5082d;
import java.util.Date;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6980c3;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.C7492v2;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.privacy.z.b */
public class C5128b {

    /* renamed from: app.zenly.locator.privacy.z.b$a */
    static /* synthetic */ class C5129a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13309a = new int[C5082d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                app.zenly.locator.privacy.model.d[] r0 = app.zenly.locator.privacy.model.C5082d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13309a = r0
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Precise     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.privacy.model.d r1 = app.zenly.locator.privacy.model.C5082d.Blurred     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.privacy.p134z.C5128b.C5129a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C5082d m14615a(UserProto$User userProto$User, C6980c3 c3Var) {
        if (userProto$User == null) {
            return C5082d.Precise;
        }
        Date timeNow = C5448c.m15478a().timeNow();
        if (!c3Var.hasGhostedUntil() || !timeNow.before(new Date(c3Var.getGhostedUntil().getSeconds() * 1000))) {
            return C5082d.Precise;
        }
        if (c3Var.getGhostedType() == C7492v2.city) {
            return C5082d.Blurred;
        }
        return C5082d.Frozen;
    }

    /* renamed from: a */
    public static void m14616a(Pair<UserProto$User, C6981a> pair, C5082d dVar, long j) {
        int i = C5129a.f13309a[dVar.ordinal()];
        if (i == 1) {
            ((C6981a) pair.second).mo18187a(Timestamp.newBuilder());
            ((C6981a) pair.second).mo18189a(C7492v2.city);
        } else if (i != 2) {
            ((C6981a) pair.second).mo18189a(C7492v2.hidden);
            ((C6981a) pair.second).mo18187a(Timestamp.newBuilder().setSeconds(new Date(new Date().getTime() + j).getTime() / 1000));
        } else {
            ((C6981a) pair.second).mo18189a(C7492v2.city);
            ((C6981a) pair.second).mo18187a(Timestamp.newBuilder().setSeconds(new Date(new Date().getTime() + j).getTime() / 1000));
        }
    }
}
