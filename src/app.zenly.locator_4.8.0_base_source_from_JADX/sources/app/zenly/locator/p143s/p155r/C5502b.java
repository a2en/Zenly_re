package app.zenly.locator.p143s.p155r;

import android.content.Context;
import android.os.Vibrator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.r.b */
public final class C5502b {

    /* renamed from: b */
    public static final C5503a f14138b = new C5503a(null);

    /* renamed from: a */
    private final Vibrator f14139a;

    /* renamed from: app.zenly.locator.s.r.b$a */
    public static final class C5503a {
        private C5503a() {
        }

        /* renamed from: a */
        public final C5502b mo13134a(Context context) {
            C12932j.m33818b(context, "context");
            return new C5502b(context, null);
        }

        public /* synthetic */ C5503a(C12928f fVar) {
            this();
        }
    }

    private C5502b(Context context) {
        Object systemService = context.getSystemService("vibrator");
        if (systemService != null) {
            this.f14139a = (Vibrator) systemService;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
    }

    /* renamed from: a */
    public static final C5502b m15610a(Context context) {
        return f14138b.mo13134a(context);
    }

    /* renamed from: a */
    public final void mo13131a(long[] jArr, int i) {
        C12932j.m33818b(jArr, "pattern");
        this.f14139a.vibrate(jArr, i);
    }

    /* renamed from: b */
    public final boolean mo13133b() {
        return C5504c.m15617a(this.f14139a);
    }

    /* renamed from: a */
    public final void mo13132a(long[] jArr, int[] iArr, int i) {
        C12932j.m33818b(jArr, "timings");
        C12932j.m33818b(iArr, "amplitude");
        C5504c.m15616a(this.f14139a, jArr, iArr, i);
    }

    public /* synthetic */ C5502b(Context context, C12928f fVar) {
        this(context);
    }

    /* renamed from: a */
    public final void mo13130a() {
        this.f14139a.cancel();
    }
}
