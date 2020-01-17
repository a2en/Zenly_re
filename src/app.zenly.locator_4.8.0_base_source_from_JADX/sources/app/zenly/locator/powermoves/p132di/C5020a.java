package app.zenly.locator.powermoves.p132di;

import android.content.Context;
import app.zenly.locator.powermoves.api.C4966a;
import app.zenly.locator.powermoves.api.PowerMovesService;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.powermoves.di.a */
public final class C5020a {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f13061b;

    /* renamed from: a */
    private final Lazy f13062a;

    /* renamed from: app.zenly.locator.powermoves.di.a$a */
    static final class C5021a extends C12933k implements Function0<C4966a> {

        /* renamed from: f */
        final /* synthetic */ Context f13063f;

        C5021a(Context context) {
            this.f13063f = context;
            super(0);
        }

        public final C4966a invoke() {
            return new C4966a(this.f13063f);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5020a.class), "powerMovesService", "getPowerMovesService()Lapp/zenly/locator/powermoves/api/DefaultPowerMovesService;");
        C12946x.m33839a((C12940r) sVar);
        f13061b = new KProperty[]{sVar};
    }

    public C5020a(Context context) {
        C12932j.m33818b(context, "context");
        this.f13062a = C12896f.m33751a(new C5021a(context));
    }

    /* renamed from: b */
    private final C4966a m14398b() {
        Lazy lazy = this.f13062a;
        KProperty kProperty = f13061b[0];
        return (C4966a) lazy.getValue();
    }

    /* renamed from: a */
    public final PowerMovesService mo12268a() {
        return m14398b();
    }
}
