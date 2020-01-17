package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.C9991b;
import com.google.android.gms.common.api.Api.C9993d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.C10014c;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.internal.location.C10491d0;
import com.google.android.gms.internal.location.C10494f;
import com.google.android.gms.internal.location.C10507l0;
import com.google.android.gms.internal.location.C10526v;

/* renamed from: com.google.android.gms.location.e */
public class C10568e {

    /* renamed from: a */
    private static final C9993d<C10526v> f27536a = new C9993d<>();

    /* renamed from: b */
    private static final C9990a<C10526v, C9989a> f27537b = new C10583l();

    /* renamed from: c */
    public static final Api<C9989a> f27538c = new Api<>("LocationServices.API", f27537b, f27536a);
    @Deprecated

    /* renamed from: d */
    public static final FusedLocationProviderApi f27539d = new C10507l0();
    @Deprecated

    /* renamed from: e */
    public static final GeofencingApi f27540e = new C10494f();
    @Deprecated

    /* renamed from: f */
    public static final SettingsApi f27541f = new C10491d0();

    /* renamed from: com.google.android.gms.location.e$a */
    public static abstract class C10569a<R extends Result> extends C10014c<R, C10526v> {
        public C10569a(GoogleApiClient googleApiClient) {
            super(C10568e.f27538c, googleApiClient);
        }
    }

    /* renamed from: a */
    public static C10526v m27016a(GoogleApiClient googleApiClient) {
        C10123l.m25513a(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        googleApiClient.mo27043a((C9991b<C>) f27536a);
        throw null;
    }

    /* renamed from: a */
    public static C10559a m27017a(Context context) {
        return new C10559a(context);
    }

    /* renamed from: a */
    public static C10575h m27018a(Activity activity) {
        return new C10575h(activity);
    }

    /* renamed from: b */
    public static C10562b m27019b(Context context) {
        return new C10562b(context);
    }
}
