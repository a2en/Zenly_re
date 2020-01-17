package app.zenly.locator.p143s.p150n;

import kotlin.jvm.internal.C12929g;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.n.d */
public final class C5459d {

    /* renamed from: a */
    private double f14045a;

    /* renamed from: b */
    private double f14046b;

    /* renamed from: c */
    private double f14047c;

    public C5459d(double d, double d2, double d3) {
        this.f14045a = d;
        this.f14046b = d2;
        this.f14047c = d3;
    }

    /* renamed from: a */
    public final void mo13058a(double d) {
        this.f14047c = d;
    }

    /* renamed from: b */
    public final double mo13060b() {
        return this.f14045a;
    }

    /* renamed from: c */
    public final double mo13062c() {
        return this.f14046b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (java.lang.Double.compare(r4.f14047c, r5.f14047c) == 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 == r5) goto L_0x0029
            boolean r0 = r5 instanceof app.zenly.locator.p143s.p150n.C5459d
            if (r0 == 0) goto L_0x0027
            app.zenly.locator.s.n.d r5 = (app.zenly.locator.p143s.p150n.C5459d) r5
            double r0 = r4.f14045a
            double r2 = r5.f14045a
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 != 0) goto L_0x0027
            double r0 = r4.f14046b
            double r2 = r5.f14046b
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 != 0) goto L_0x0027
            double r0 = r4.f14047c
            double r2 = r5.f14047c
            int r5 = java.lang.Double.compare(r0, r2)
            if (r5 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r5 = 0
            return r5
        L_0x0029:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p143s.p150n.C5459d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((Double.valueOf(this.f14045a).hashCode() * 31) + Double.valueOf(this.f14046b).hashCode()) * 31) + Double.valueOf(this.f14047c).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ZenLatLng(latitude=");
        sb.append(this.f14045a);
        sb.append(", longitude=");
        sb.append(this.f14046b);
        sb.append(", height=");
        sb.append(this.f14047c);
        sb.append(")");
        return sb.toString();
    }

    public C5459d() {
        this(C12929g.f33511c.mo37275b(), C12929g.f33511c.mo37275b(), C12929g.f33511c.mo37275b());
    }

    /* renamed from: a */
    public final void mo13057a() {
        this.f14047c = C12929g.f33511c.mo37275b();
    }

    /* renamed from: b */
    public final void mo13061b(double d) {
        this.f14045a = d;
    }

    /* renamed from: c */
    public final void mo13063c(double d) {
        this.f14046b = d;
    }

    public C5459d(double d, double d2) {
        this(d, d2, C12929g.f33511c.mo37275b());
    }

    /* renamed from: a */
    public final void mo13059a(C5459d dVar) {
        C12932j.m33818b(dVar, "zenLatLng");
        this.f14045a = dVar.f14045a;
        this.f14046b = dVar.f14046b;
        this.f14047c = dVar.f14047c;
    }
}
