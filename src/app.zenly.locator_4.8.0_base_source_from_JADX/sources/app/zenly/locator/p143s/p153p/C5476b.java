package app.zenly.locator.p143s.p153p;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.p.b */
public final class C5476b extends C5471a {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final boolean f14085j;

    /* renamed from: k */
    public static final C5477a f14086k = new C5477a(null);

    /* renamed from: app.zenly.locator.s.p.b$a */
    public static final class C5477a {
        private C5477a() {
        }

        /* renamed from: a */
        public final boolean mo13108a() {
            return C5476b.f14085j;
        }

        public /* synthetic */ C5477a(C12928f fVar) {
            this();
        }
    }

    static {
        String str = Build.MANUFACTURER;
        C12932j.m33815a((Object) str, "Build.MANUFACTURER");
        if (str != null) {
            String upperCase = str.toUpperCase();
            C12932j.m33815a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            boolean z = true;
            if (!(!C12932j.m33817a((Object) upperCase, (Object) "HUAWEI"))) {
                if (C12840k.m33571a((Object[]) new Integer[]{Integer.valueOf(24), Integer.valueOf(25)}, (Object) Integer.valueOf(VERSION.SDK_INT))) {
                    z = false;
                }
            }
            f14085j = z;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public C5476b(Context context, Function3<? super Float, ? super Float, ? super Float, C12956q> function3) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(function3, "listener");
        super(context, 50.0f, 50.0f, 50.0f, function3);
    }

    /* renamed from: e */
    public void mo13098e() {
        if (f14085j) {
            super.mo13098e();
        }
    }
}
