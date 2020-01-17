package app.zenly.locator.support.p168di;

import android.content.Context;
import app.zenly.locator.support.C5724n0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.support.di.a */
public final class C5663a {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f14433b;

    /* renamed from: a */
    private final Lazy f14434a;

    /* renamed from: app.zenly.locator.support.di.a$a */
    static final class C5664a extends C12933k implements Function0<C5724n0> {

        /* renamed from: f */
        final /* synthetic */ Context f14435f;

        C5664a(Context context) {
            this.f14435f = context;
            super(0);
        }

        public final C5724n0 invoke() {
            return new C5724n0(this.f14435f);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5663a.class), "zendeskSdk", "getZendeskSdk()Lapp/zenly/locator/support/ZendeskSdk;");
        C12946x.m33839a((C12940r) sVar);
        f14433b = new KProperty[]{sVar};
    }

    public C5663a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14434a = C12896f.m33751a(new C5664a(context));
    }

    /* renamed from: b */
    private final C5724n0 m15985b() {
        Lazy lazy = this.f14434a;
        KProperty kProperty = f14433b[0];
        return (C5724n0) lazy.getValue();
    }

    /* renamed from: a */
    public final C5724n0 mo13329a() {
        return m15985b();
    }
}
