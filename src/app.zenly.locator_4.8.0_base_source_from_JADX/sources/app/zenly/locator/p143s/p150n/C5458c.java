package app.zenly.locator.p143s.p150n;

/* renamed from: app.zenly.locator.s.n.c */
public class C5458c {

    /* renamed from: a */
    public double f14040a;

    /* renamed from: b */
    public double f14041b;

    /* renamed from: c */
    public double f14042c;

    /* renamed from: d */
    public double f14043d;

    /* renamed from: e */
    public double f14044e;

    public C5458c() {
        mo13050a();
    }

    /* renamed from: a */
    public void mo13051a(C5458c cVar) {
        this.f14040a = cVar.f14040a;
        this.f14041b = cVar.f14041b;
        this.f14042c = cVar.f14042c;
        this.f14043d = cVar.f14043d;
        this.f14044e = cVar.f14044e;
    }

    /* renamed from: b */
    public C5458c mo13052b(double d) {
        this.f14041b = d;
        return this;
    }

    /* renamed from: c */
    public C5458c mo13053c(double d) {
        this.f14042c = d;
        return this;
    }

    /* renamed from: d */
    public C5458c mo13054d(double d) {
        this.f14043d = d;
        return this;
    }

    /* renamed from: e */
    public C5458c mo10961e(double d) {
        this.f14044e = d;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5458c cVar = (C5458c) obj;
        if (Double.compare(cVar.f14040a, this.f14040a) != 0 || Double.compare(cVar.f14041b, this.f14041b) != 0 || Double.compare(cVar.f14042c, this.f14042c) != 0 || Double.compare(cVar.f14043d, this.f14043d) != 0) {
            return false;
        }
        if (Double.compare(cVar.f14044e, this.f14044e) != 0) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f14040a);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f14041b);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f14042c);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f14043d);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.f14044e);
        return (i4 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
    }

    /* renamed from: a */
    public void mo13050a() {
        this.f14040a = -1.0d;
        this.f14041b = Double.NaN;
        this.f14042c = Double.NaN;
        this.f14043d = -1.0d;
        this.f14044e = -1.0d;
    }

    /* renamed from: a */
    public C5458c mo13049a(double d) {
        this.f14040a = d;
        return this;
    }

    /* renamed from: a */
    public C5458c mo10956a(C5459d dVar) {
        double d = Double.NaN;
        this.f14041b = dVar != null ? dVar.mo13060b() : Double.NaN;
        if (dVar != null) {
            d = dVar.mo13062c();
        }
        this.f14042c = d;
        return this;
    }
}
