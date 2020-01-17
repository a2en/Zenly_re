package app.zenly.locator;

import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.p143s.p154q.C5478a;
import app.zenly.locator.p143s.p154q.C5480b;
import app.zenly.locator.p143s.p154q.C5483c;
import app.zenly.locator.p143s.p154q.C5495d;
import java.util.Set;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.b */
public final class C1687b {
    /* renamed from: a */
    public static final Set<ActivityLifecycleObserver> m7021a(BaseActivity baseActivity) {
        C12932j.m33818b(baseActivity, "activity");
        return C12845m0.m33634a((Object[]) new ActivityLifecycleObserver[]{new C5478a(C3818g.m11315a()), new C5480b(baseActivity, C3818g.m11315a()), new C5483c(baseActivity, C3818g.m11315a()), new C5495d(baseActivity)});
    }
}
