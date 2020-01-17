package app.zenly.locator;

import android.content.Context;
import app.zenly.locator.debug.C3438a;
import app.zenly.locator.debug.C3442c;
import com.crashlytics.android.C9252a;
import com.crashlytics.android.answers.C9256b;
import com.crashlytics.android.ndk.C9427b;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7402n2;
import p387h.p388a.C12143a;
import p387h.p388a.C12143a.C12146c;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: app.zenly.locator.f */
public final class C3763f {

    /* renamed from: a */
    public static final C3763f f10063a = new C3763f();

    private C3763f() {
    }

    /* renamed from: a */
    public final void mo10321a(Context context) {
        C12932j.m33818b(context, "context");
        C12154c.m32103a(context, new C9252a(), new C9427b(), new C9256b());
        C9252a.m22274a("commit_hash", "8afd4a3");
    }

    /* renamed from: b */
    public final void mo10323b() {
        C12143a.m32026a((C12146c) new C3438a());
    }

    /* renamed from: a */
    public final void mo10322a(C7402n2 n2Var) {
        C12932j.m33818b(n2Var, "session");
        C9252a.m22277b(n2Var.getUserUuid());
        C9252a.m22274a("user_uuid", n2Var.getUserUuid());
        C9252a.m22274a("device_uuid", n2Var.getDeviceUuid());
        C9252a.m22274a("session_uuid", n2Var.getUuid());
    }

    /* renamed from: a */
    public final void mo10320a() {
        C3442c.m10685a();
    }
}
