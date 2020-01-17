package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.C9993d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C10682a;

/* renamed from: com.google.android.gms.signin.c */
public final class C10680c {

    /* renamed from: a */
    private static final C9993d<C10682a> f27765a = new C9993d<>();

    /* renamed from: b */
    private static final C9993d<C10682a> f27766b = new C9993d<>();

    /* renamed from: c */
    public static final C9990a<C10682a, C10677a> f27767c = new C10679b();

    /* renamed from: d */
    private static final C9990a<C10682a, Object> f27768d = new C10681d();

    static {
        new Scope("profile");
        new Scope("email");
        new Api("SignIn.API", f27767c, f27765a);
        new Api("SignIn.INTERNAL_API", f27768d, f27766b);
    }
}
