package com.wonderkiln.camerakit;

import p214e.p228e.C7585h;

/* renamed from: com.wonderkiln.camerakit.l */
class C11977l extends C11975j<String> {

    /* renamed from: b */
    private static final C7585h<String> f31214b = new C7585h<>();

    static {
        f31214b.mo19622c(0, "off");
        f31214b.mo19622c(1, "on");
        f31214b.mo19622c(2, "auto");
        f31214b.mo19622c(3, "torch");
    }

    protected C11977l(int i) {
        super(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo35562a() {
        C7585h<String> hVar = f31214b;
        return (String) hVar.mo19620b(this.f31212a, hVar.mo19617a(0));
    }
}
