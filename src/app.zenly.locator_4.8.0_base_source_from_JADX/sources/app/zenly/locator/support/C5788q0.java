package app.zenly.locator.support;

import app.zenly.locator.p143s.p148l.C5448c;
import com.android.volley.toolbox.C8733j;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.support.q0 */
public final class C5788q0 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m16194b(UserProto$User userProto$User) {
        Calendar instance = Calendar.getInstance();
        C12932j.m33815a((Object) instance, "now");
        Date timeNow = C5448c.m15478a().timeNow();
        C12932j.m33815a((Object) timeNow, "ZenlyCoreProvider.get().timeNow()");
        instance.setTimeInMillis(timeNow.getTime());
        Calendar instance2 = Calendar.getInstance();
        C12932j.m33815a((Object) instance2, "dob");
        Timestamp birthdate = userProto$User.getBirthdate();
        C12932j.m33815a((Object) birthdate, "birthdate");
        instance2.setTimeInMillis(birthdate.getSeconds() * ((long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS));
        if (instance2.after(instance)) {
            return -1;
        }
        int i = instance.get(1) - instance2.get(1);
        int i2 = instance.get(2);
        int i3 = instance2.get(2);
        if (i3 > i2 || (i3 == i2 && instance2.get(5) > instance.get(5))) {
            i--;
        }
        return i;
    }
}
