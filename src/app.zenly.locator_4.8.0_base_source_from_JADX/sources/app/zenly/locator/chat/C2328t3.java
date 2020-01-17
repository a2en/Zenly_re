package app.zenly.locator.chat;

import java.util.List;
import p213co.znly.models.PingProto$Ping2;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.chat.t3 */
/* compiled from: lambda */
public final /* synthetic */ class C2328t3 implements Function {

    /* renamed from: e */
    public static final /* synthetic */ C2328t3 f7043e = new C2328t3();

    private /* synthetic */ C2328t3() {
    }

    public final Object apply(Object obj) {
        return ((PingProto$Ping2) ((List) obj).get(((List) obj).size() - 1)).getUuid();
    }
}
