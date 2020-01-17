package app.zenly.locator.core.models;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2939c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7370k;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7226u0;

/* renamed from: app.zenly.locator.core.models.f */
public final class C2884f {
    static {
        new C2884f();
    }

    private C2884f() {
    }

    /* renamed from: a */
    public static final Avatar m9355a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "data");
        return new C2883e0(userProto$User);
    }

    /* renamed from: a */
    public static final Avatar m9353a(C2879d0 d0Var) {
        C12932j.m33818b(d0Var, "data");
        return new C2883e0(d0Var);
    }

    /* renamed from: a */
    public static final Avatar m9356a(C7226u0 u0Var) {
        C12932j.m33818b(u0Var, "data");
        return new C2895o(u0Var);
    }

    /* renamed from: a */
    public static final Avatar m9358a(C7370k kVar) {
        C12932j.m33818b(kVar, "data");
        return m9354a(C2939c.m9453a(kVar));
    }

    /* renamed from: a */
    public static final Avatar m9354a(C2935a aVar) {
        C12932j.m33818b(aVar, "data");
        return new C2871b(aVar);
    }

    /* renamed from: a */
    public static final Avatar m9357a(C7339i iVar) {
        C12932j.m33818b(iVar, "data");
        return new C2894n(iVar);
    }
}
