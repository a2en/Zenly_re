package com.facebook.common.time;

/* renamed from: com.facebook.common.time.a */
public class C9554a implements Clock {

    /* renamed from: a */
    private static final C9554a f24754a = new C9554a();

    private C9554a() {
    }

    /* renamed from: a */
    public static C9554a m23375a() {
        return f24754a;
    }

    public long now() {
        return System.currentTimeMillis();
    }
}
