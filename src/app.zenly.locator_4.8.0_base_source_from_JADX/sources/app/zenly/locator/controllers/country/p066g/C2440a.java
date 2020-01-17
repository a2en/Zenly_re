package app.zenly.locator.controllers.country.p066g;

import app.zenly.locator.controllers.country.C2431d;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.controllers.country.g.a */
public final class C2440a extends C11722a {

    /* renamed from: f */
    private final int f7328f;

    /* renamed from: g */
    private final String f7329g;

    /* renamed from: h */
    private final int f7330h;

    /* renamed from: i */
    private final String f7331i;

    /* renamed from: j */
    private final boolean f7332j;

    public C2440a(long j, int i, String str, int i2, String str2, boolean z) {
        C12932j.m33818b(str, "name");
        C12932j.m33818b(str2, "isoCode");
        super(C2431d.COUNTRY, j);
        this.f7328f = i;
        this.f7329g = str;
        this.f7330h = i2;
        this.f7331i = str2;
        this.f7332j = z;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C2440a aVar2 = (C2440a) aVar;
        return this.f7328f == aVar2.f7328f && C12932j.m33817a((Object) this.f7329g, (Object) aVar2.f7329g) && this.f7330h == aVar2.f7330h && C12932j.m33817a((Object) this.f7331i, (Object) aVar2.f7331i);
    }

    /* renamed from: f */
    public final int mo8404f() {
        return this.f7330h;
    }

    /* renamed from: g */
    public final int mo8405g() {
        return this.f7328f;
    }

    /* renamed from: h */
    public final String mo8406h() {
        return this.f7331i;
    }

    /* renamed from: i */
    public final String mo8407i() {
        return this.f7329g;
    }

    /* renamed from: j */
    public final boolean mo8408j() {
        return this.f7332j;
    }
}
