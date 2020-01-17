package com.airbnb.lottie.p286o;

/* renamed from: com.airbnb.lottie.o.a */
public enum C8604a {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: e */
    public final String f22127e;

    private C8604a(String str) {
        this.f22127e = str;
    }

    /* renamed from: a */
    public String mo23218a() {
        StringBuilder sb = new StringBuilder();
        sb.append(".temp");
        sb.append(this.f22127e);
        return sb.toString();
    }

    public String toString() {
        return this.f22127e;
    }
}
