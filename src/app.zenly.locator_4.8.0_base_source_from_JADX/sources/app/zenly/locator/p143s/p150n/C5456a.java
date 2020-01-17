package app.zenly.locator.p143s.p150n;

/* renamed from: app.zenly.locator.s.n.a */
public class C5456a {

    /* renamed from: a */
    private double f14035a;

    /* renamed from: b */
    private double f14036b;

    /* renamed from: c */
    private double f14037c;

    /* renamed from: d */
    private double f14038d;

    /* renamed from: e */
    private boolean f14039e;

    /* renamed from: a */
    public void mo13047a(double d, C5464h hVar) {
        mo13046a(d, hVar.f14060a, hVar.f14061b, hVar.f14063d, hVar.f14062c);
    }

    /* renamed from: a */
    public void mo13046a(double d, C5459d dVar, C5459d dVar2, C5459d dVar3, C5459d dVar4) {
        boolean z = true;
        boolean z2 = d > 90.0d && d < 270.0d;
        boolean z3 = d % 360.0d > 180.0d;
        double d2 = z2 ? z3 ? dVar3.mo13060b() : dVar4.mo13060b() : z3 ? dVar2.mo13060b() : dVar.mo13060b();
        this.f14035a = d2;
        double d3 = z2 ? z3 ? dVar.mo13060b() : dVar2.mo13060b() : z3 ? dVar4.mo13060b() : dVar3.mo13060b();
        this.f14036b = d3;
        double d4 = z2 ? z3 ? dVar2.mo13062c() : dVar3.mo13062c() : z3 ? dVar.mo13062c() : dVar4.mo13062c();
        this.f14037c = d4;
        double d5 = z2 ? z3 ? dVar4.mo13062c() : dVar.mo13062c() : z3 ? dVar3.mo13062c() : dVar2.mo13062c();
        this.f14038d = d5;
        if (this.f14035a - this.f14036b <= 140.0d) {
            z = false;
        }
        this.f14039e = z;
    }

    /* renamed from: a */
    public boolean mo13048a(C5459d dVar) {
        double b = dVar.mo13060b();
        double c = dVar.mo13062c();
        if (this.f14035a > b && b > this.f14036b) {
            if (!this.f14039e) {
                double d = this.f14037c;
                double d2 = this.f14038d;
                if (d > d2) {
                }
            }
            return true;
        }
        return false;
    }
}
