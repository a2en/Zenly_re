package app.zenly.locator.privacy.model;

import android.util.Pair;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.C7492v2;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.privacy.model.f */
public class C5084f {

    /* renamed from: a */
    public Timestamp f13166a;

    /* renamed from: b */
    public C7492v2 f13167b;

    public C5084f(Pair<UserProto$User, C6981a> pair) {
        this.f13166a = ((C6981a) pair.second).getGhostedUntil();
        this.f13167b = ((C6981a) pair.second).getGhostedType();
    }

    /* renamed from: a */
    public void mo12329a(Pair<UserProto$User, C6981a> pair) {
        ((C6981a) pair.second).mo18188a(this.f13166a);
        ((C6981a) pair.second).mo18189a(this.f13167b);
    }
}
