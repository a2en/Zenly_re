package app.zenly.locator.core.helper;

import android.app.PendingIntent;
import android.content.Context;
import app.zenly.locator.p143s.C5407g;
import com.google.android.gms.common.C10067c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.C10605c;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.core.helper.e */
public final class C2513e {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f7525d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10067c f7526a = C10067c.m25293a();

    /* renamed from: b */
    private final Lazy f7527b = C12896f.m33751a(new C2514a(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f7528c;

    /* renamed from: app.zenly.locator.core.helper.e$a */
    static final class C2514a extends C12933k implements Function0<Integer> {

        /* renamed from: f */
        final /* synthetic */ C2513e f7529f;

        C2514a(C2513e eVar) {
            this.f7529f = eVar;
            super(0);
        }

        public final int invoke() {
            int a = this.f7529f.f7526a.mo27284a(this.f7529f.f7528c);
            return (a == 0 && C5407g.f13966d.mo12991a(this.f7529f.f7528c).mo12981e() == 2) ? C10605c.m27078a(this.f7529f.f7528c) : a;
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C2513e.class), "status", "getStatus()I");
        C12946x.m33839a((C12940r) sVar);
        f7525d = new KProperty[]{sVar};
    }

    public C2513e(Context context) {
        C12932j.m33818b(context, "context");
        this.f7528c = context;
    }

    /* renamed from: b */
    public final int mo8586b() {
        Lazy lazy = this.f7527b;
        KProperty kProperty = f7525d[0];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: c */
    public final boolean mo8587c() {
        return mo8586b() == 0 || this.f7526a.mo27296b(mo8586b());
    }

    /* renamed from: d */
    public final boolean mo8588d() {
        return mo8586b() != 0;
    }

    /* renamed from: a */
    public final PendingIntent mo8585a() {
        return this.f7526a.mo27288a(this.f7528c, new ConnectionResult(mo8586b()));
    }
}
