package com.crashlytics.android.answers;

import android.content.Context;
import java.util.Map;
import java.util.UUID;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12195p;
import p389io.fabric.sdk.android.services.common.C12195p.C12196a;

/* renamed from: com.crashlytics.android.answers.e0 */
class C9266e0 {

    /* renamed from: a */
    private final Context f24078a;

    /* renamed from: b */
    private final C12195p f24079b;

    /* renamed from: c */
    private final String f24080c;

    /* renamed from: d */
    private final String f24081d;

    public C9266e0(Context context, C12195p pVar, String str, String str2) {
        this.f24078a = context;
        this.f24079b = pVar;
        this.f24080c = str;
        this.f24081d = str2;
    }

    /* renamed from: a */
    public C9262c0 mo24982a() {
        Map e = this.f24079b.mo36087e();
        C9262c0 c0Var = new C9262c0(this.f24079b.mo36085c(), UUID.randomUUID().toString(), this.f24079b.mo36086d(), this.f24079b.mo36093k(), (String) e.get(C12196a.FONT_TOKEN), C12180h.m32280n(this.f24078a), this.f24079b.mo36092j(), this.f24079b.mo36089g(), this.f24080c, this.f24081d);
        return c0Var;
    }
}
