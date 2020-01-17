package app.zenly.locator.recommendation;

import android.content.Context;
import app.zenly.locator.core.glide.C2477e;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.recommendation.h */
public final class C5263h {

    /* renamed from: a */
    private final Context f13563a;

    /* renamed from: b */
    private final ZenlyCore f13564b;

    public C5263h(Context context, ZenlyCore zenlyCore) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlyCore, "core");
        this.f13563a = context;
        this.f13564b = zenlyCore;
    }

    /* renamed from: a */
    public final C2477e mo12618a() {
        return new C2477e(this.f13563a);
    }

    /* renamed from: b */
    public final C5266k mo12619b() {
        return new C5266k(this.f13563a, this.f13564b);
    }
}
