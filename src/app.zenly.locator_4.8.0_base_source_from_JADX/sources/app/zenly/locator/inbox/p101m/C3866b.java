package app.zenly.locator.inbox.p101m;

import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7117i;

/* renamed from: app.zenly.locator.inbox.m.b */
final class C3866b {

    /* renamed from: a */
    private final boolean f10261a;

    /* renamed from: b */
    private final List<C7117i> f10262b;

    public C3866b(boolean z, List<C7117i> list) {
        C12932j.m33818b(list, "conversations");
        this.f10261a = z;
        this.f10262b = list;
    }

    /* renamed from: a */
    public final List<C7117i> mo10462a() {
        return this.f10262b;
    }

    /* renamed from: b */
    public final boolean mo10463b() {
        return this.f10261a;
    }
}
