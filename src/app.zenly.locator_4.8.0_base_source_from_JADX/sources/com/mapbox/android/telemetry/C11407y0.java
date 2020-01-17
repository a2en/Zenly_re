package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mapbox.android.telemetry.y0 */
class C11407y0 {

    /* renamed from: a */
    private final String f29506a;

    /* renamed from: b */
    private final String f29507b;

    /* renamed from: c */
    private final C11338e0 f29508c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C11341g f29509d;

    /* renamed from: e */
    private final Map<C11388r, C11405x0> f29510e = new C11408a();

    /* renamed from: com.mapbox.android.telemetry.y0$a */
    class C11408a extends HashMap<C11388r, C11405x0> {

        /* renamed from: com.mapbox.android.telemetry.y0$a$a */
        class C11409a implements C11405x0 {
            C11409a() {
            }

            /* renamed from: a */
            public C11402w0 mo33056a(C11389r0 r0Var) {
                C11407y0 y0Var = C11407y0.this;
                return y0Var.m29364a(C11388r.CHINA, y0Var.f29509d);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.y0$a$b */
        class C11410b implements C11405x0 {
            C11410b() {
            }

            /* renamed from: a */
            public C11402w0 mo33056a(C11389r0 r0Var) {
                C11407y0 y0Var = C11407y0.this;
                return y0Var.m29363a(r0Var, y0Var.f29509d);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.y0$a$c */
        class C11411c implements C11405x0 {
            C11411c() {
            }

            /* renamed from: a */
            public C11402w0 mo33056a(C11389r0 r0Var) {
                C11407y0 y0Var = C11407y0.this;
                return y0Var.m29364a(C11388r.COM, y0Var.f29509d);
            }
        }

        C11408a() {
            put(C11388r.CHINA, new C11409a());
            put(C11388r.STAGING, new C11410b());
            put(C11388r.COM, new C11411c());
        }
    }

    C11407y0(String str, String str2, C11338e0 e0Var, C11341g gVar) {
        this.f29506a = str;
        this.f29507b = str2;
        this.f29508c = e0Var;
        this.f29509d = gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11402w0 mo33058a(Context context) {
        C11392t a = new C11390s().mo33047a();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                C11389r0 a2 = a.mo33010a(applicationInfo.metaData);
                return ((C11405x0) this.f29510e.get(a2.mo33044b())).mo33056a(a2);
            }
        } catch (Exception e) {
            this.f29508c.mo32981b("TelemetryClientFactory", String.format("Failed when retrieving app meta-data: %s", new Object[]{e.getMessage()}));
        }
        return m29364a(C11388r.COM, this.f29509d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C11402w0 m29364a(C11388r rVar, C11341g gVar) {
        C11415b bVar = new C11415b();
        bVar.mo33067a(rVar);
        C11402w0 w0Var = new C11402w0(this.f29506a, this.f29507b, bVar.mo33074a(), this.f29508c, gVar);
        return w0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C11402w0 m29363a(C11389r0 r0Var, C11341g gVar) {
        C11388r b = r0Var.mo33044b();
        String c = r0Var.mo33046c();
        String a = r0Var.mo33042a();
        C11415b bVar = new C11415b();
        bVar.mo33067a(b);
        bVar.mo33071a(C11413z0.m29373a(c));
        C11402w0 w0Var = new C11402w0(a, this.f29507b, bVar.mo33074a(), this.f29508c, gVar);
        return w0Var;
    }
}
