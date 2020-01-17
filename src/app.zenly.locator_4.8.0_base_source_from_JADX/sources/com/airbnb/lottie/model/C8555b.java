package com.airbnb.lottie.model;

/* renamed from: com.airbnb.lottie.model.b */
public class C8555b {

    /* renamed from: a */
    public final String f21870a;

    /* renamed from: b */
    public final String f21871b;

    /* renamed from: c */
    public final double f21872c;

    /* renamed from: d */
    public final C8556a f21873d;

    /* renamed from: e */
    public final int f21874e;

    /* renamed from: f */
    public final double f21875f;

    /* renamed from: g */
    public final double f21876g;

    /* renamed from: h */
    public final int f21877h;

    /* renamed from: i */
    public final int f21878i;

    /* renamed from: j */
    public final double f21879j;

    /* renamed from: k */
    public final boolean f21880k;

    /* renamed from: com.airbnb.lottie.model.b$a */
    public enum C8556a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C8555b(String str, String str2, double d, C8556a aVar, int i, double d2, double d3, int i2, int i3, double d4, boolean z) {
        this.f21870a = str;
        this.f21871b = str2;
        this.f21872c = d;
        this.f21873d = aVar;
        this.f21874e = i;
        this.f21875f = d2;
        this.f21876g = d3;
        this.f21877h = i2;
        this.f21878i = i3;
        this.f21879j = d4;
        this.f21880k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((double) (((this.f21870a.hashCode() * 31) + this.f21871b.hashCode()) * 31)) + this.f21872c)) * 31) + this.f21873d.ordinal()) * 31) + this.f21874e;
        long doubleToLongBits = Double.doubleToLongBits(this.f21875f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f21877h;
    }
}
