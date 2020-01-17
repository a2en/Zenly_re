package app.zenly.locator.chat;

import p213co.znly.models.core.C7073d;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.chat.o4 */
/* compiled from: lambda */
public final /* synthetic */ class C2118o4 implements Predicate {

    /* renamed from: e */
    public static final /* synthetic */ C2118o4 f6616e = new C2118o4();

    private /* synthetic */ C2118o4() {
    }

    public final boolean test(Object obj) {
        return ((C7073d) obj).getContainsUnread();
    }
}
