package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.C9993d;
import com.google.android.gms.common.api.C9995b;
import com.google.android.gms.common.api.C9995b.C9996a;
import com.google.android.gms.internal.auth-api-phone.C10254i;
import com.google.android.gms.tasks.C10693c;

/* renamed from: com.google.android.gms.auth.api.phone.b */
public abstract class C9974b extends C9995b<C9989a> implements SmsRetrieverApi {

    /* renamed from: j */
    private static final C9993d<C10254i> f26172j = new C9993d<>();

    /* renamed from: k */
    private static final C9990a<C10254i, C9989a> f26173k = new C9975c();

    /* renamed from: l */
    private static final Api<C9989a> f26174l = new Api<>("SmsRetriever.API", f26173k, f26172j);

    public C9974b(Activity activity) {
        super(activity, f26174l, null, C9996a.f26291c);
    }

    public abstract C10693c<Void> startSmsRetriever();
}
