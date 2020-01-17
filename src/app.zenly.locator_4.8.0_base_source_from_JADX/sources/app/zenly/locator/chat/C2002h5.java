package app.zenly.locator.chat;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.Map;
import p213co.znly.models.UserProto$User;
import p214e.p228e.C7571a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;

/* renamed from: app.zenly.locator.chat.h5 */
public final class C2002h5 {

    /* renamed from: a */
    private final Map<String, C12279e<UserProto$User>> f6411a = new C7571a();

    /* renamed from: a */
    public C12279e<UserProto$User> mo7813a(String str) {
        C12279e<UserProto$User> eVar = (C12279e) this.f6411a.get(str);
        if (eVar != null) {
            return eVar;
        }
        C12279e<UserProto$User> b = C5448c.m15478a().userPublicStream(str).mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36487e(1).mo36447b();
        this.f6411a.put(str, b);
        return b;
    }
}
