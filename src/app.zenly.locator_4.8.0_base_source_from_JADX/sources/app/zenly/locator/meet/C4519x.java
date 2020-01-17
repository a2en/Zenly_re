package app.zenly.locator.meet;

import p213co.znly.models.core.C7060b1;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.meet.x */
/* compiled from: lambda */
public final /* synthetic */ class C4519x implements Function {

    /* renamed from: e */
    public static final /* synthetic */ C4519x f12136e = new C4519x();

    private /* synthetic */ C4519x() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((C7060b1) obj).getDuration().getSeconds() * 1000);
    }
}
