package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.C8573m;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.d */
public class C8581d {

    /* renamed from: a */
    private final List<C8573m> f22005a;

    /* renamed from: b */
    private final char f22006b;

    /* renamed from: c */
    private final double f22007c;

    /* renamed from: d */
    private final String f22008d;

    /* renamed from: e */
    private final String f22009e;

    public C8581d(List<C8573m> list, char c, double d, double d2, String str, String str2) {
        this.f22005a = list;
        this.f22006b = c;
        this.f22007c = d2;
        this.f22008d = str;
        this.f22009e = str2;
    }

    /* renamed from: a */
    public static int m19901a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: b */
    public double mo23162b() {
        return this.f22007c;
    }

    public int hashCode() {
        return m19901a(this.f22006b, this.f22009e, this.f22008d);
    }

    /* renamed from: a */
    public List<C8573m> mo23161a() {
        return this.f22005a;
    }
}
