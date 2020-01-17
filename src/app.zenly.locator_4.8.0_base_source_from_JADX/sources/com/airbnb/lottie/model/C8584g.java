package com.airbnb.lottie.model;

/* renamed from: com.airbnb.lottie.model.g */
public class C8584g {

    /* renamed from: d */
    private static String f22014d = "\r";

    /* renamed from: a */
    private final String f22015a;

    /* renamed from: b */
    public final float f22016b;

    /* renamed from: c */
    public final float f22017c;

    public C8584g(String str, float f, float f2) {
        this.f22015a = str;
        this.f22017c = f2;
        this.f22016b = f;
    }

    /* renamed from: a */
    public boolean mo23174a(String str) {
        if (this.f22015a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f22015a.endsWith(f22014d)) {
            String str2 = this.f22015a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
