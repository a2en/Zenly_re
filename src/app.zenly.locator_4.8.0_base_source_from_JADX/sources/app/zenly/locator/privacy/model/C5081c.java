package app.zenly.locator.privacy.model;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.Arrays;
import java.util.Date;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp.Builder;
import p213co.znly.models.C7492v2;
import p213co.znly.models.services.C8305u2;
import p213co.znly.models.services.C8305u2.C8306a;
import p387h.p388a.C12143a;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.privacy.model.c */
public class C5081c {
    /* renamed from: a */
    public static String m14487a(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = j2 - (3600 * j3);
        long j5 = j4 / 60;
        return String.format("%1$02d:%2$02d:%3$02d", new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j4 - (60 * j5))});
    }

    /* renamed from: b */
    public static boolean m14491b(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = j2 - (3600 * j3);
        long j5 = j4 / 60;
        int i = (j3 > 24 ? 1 : (j3 == 24 ? 0 : -1));
        return i > 0 || (i == 0 && j5 == 0 && j4 - (60 * j5) == 0);
    }

    /* renamed from: a */
    public static void m14490a(String[] strArr, C5082d dVar, long j, ICallbackUpdateUser iCallbackUpdateUser) {
        C8306a newBuilder = C8305u2.newBuilder();
        newBuilder.mo22267a((Iterable<String>) Arrays.asList(strArr));
        if (dVar == C5082d.Frozen) {
            newBuilder.mo22266a(C7492v2.hidden);
        } else if (dVar == C5082d.Blurred) {
            newBuilder.mo22266a(C7492v2.city);
        } else {
            newBuilder.mo22266a(C7492v2.city);
        }
        Date timeNow = C5448c.m15478a().timeNow();
        if (j > 0) {
            Builder newBuilder2 = Timestamp.newBuilder();
            newBuilder2.setSeconds((timeNow.getTime() + j) / 1000);
            newBuilder.mo22265a(newBuilder2);
        }
        C5448c.m15478a().friendGhost((C8305u2) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5079a<Object>(iCallbackUpdateUser), (Consumer<? super Throwable>) new C5080b<Object>(iCallbackUpdateUser));
    }

    /* renamed from: a */
    static /* synthetic */ void m14489a(ICallbackUpdateUser iCallbackUpdateUser, Throwable th) throws Exception {
        iCallbackUpdateUser.onUpdateUserError();
        C12143a.m32032b(th, "failed changing ghost mode", new Object[0]);
    }
}
