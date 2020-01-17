package com.airbnb.lottie.model;

import com.airbnb.lottie.C8506c;
import p214e.p228e.C7577e;

/* renamed from: com.airbnb.lottie.model.f */
public class C8583f {

    /* renamed from: b */
    private static final C8583f f22012b = new C8583f();

    /* renamed from: a */
    private final C7577e<String, C8506c> f22013a = new C7577e<>(20);

    C8583f() {
    }

    /* renamed from: a */
    public static C8583f m19913a() {
        return f22012b;
    }

    /* renamed from: a */
    public C8506c mo23172a(String str) {
        if (str == null) {
            return null;
        }
        return (C8506c) this.f22013a.mo19526b(str);
    }

    /* renamed from: a */
    public void mo23173a(String str, C8506c cVar) {
        if (str != null) {
            this.f22013a.mo19521a(str, cVar);
        }
    }
}
