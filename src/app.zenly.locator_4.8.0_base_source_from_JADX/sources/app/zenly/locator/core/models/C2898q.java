package app.zenly.locator.core.models;

import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.p143s.p150n.C5459d;
import java.util.ArrayList;

/* renamed from: app.zenly.locator.core.models.q */
public class C2898q {

    /* renamed from: a */
    public int f8224a;

    /* renamed from: b */
    public final C5459d f8225b = new C5459d();

    /* renamed from: c */
    public boolean f8226c;

    /* renamed from: d */
    public boolean f8227d;

    /* renamed from: e */
    public float f8228e;

    /* renamed from: f */
    public C2899a f8229f = C2899a.NORMAL;

    /* renamed from: g */
    public double f8230g;

    /* renamed from: h */
    public boolean f8231h;

    /* renamed from: i */
    public int f8232i;

    /* renamed from: j */
    public C2918b f8233j = C2918b.NONE;

    /* renamed from: k */
    public C2890k f8234k;

    /* renamed from: app.zenly.locator.core.models.q$a */
    public enum C2899a {
        BUMP,
        INTERESTING,
        NORMAL,
        SLEEPING
    }

    /* renamed from: app.zenly.locator.core.models.q$b */
    public static class C2900b extends C2898q {

        /* renamed from: l */
        public final ArrayList<C2896p> f8240l = new ArrayList<>();
    }

    /* renamed from: a */
    public C2898q mo8983a(C2898q qVar) {
        qVar.f8224a = this.f8224a;
        qVar.f8225b.mo13061b(this.f8225b.mo13060b());
        qVar.f8225b.mo13063c(this.f8225b.mo13062c());
        qVar.f8226c = this.f8226c;
        qVar.f8227d = this.f8227d;
        qVar.f8228e = this.f8228e;
        qVar.f8229f = this.f8229f;
        qVar.f8230g = this.f8230g;
        qVar.f8231h = this.f8231h;
        qVar.f8232i = this.f8232i;
        qVar.f8233j = this.f8233j;
        qVar.f8234k = this.f8234k;
        return qVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2898q) && this.f8224a == ((C2898q) obj).f8224a;
    }

    public int hashCode() {
        return this.f8224a;
    }

    /* renamed from: a */
    public boolean mo8984a() {
        C2899a aVar = this.f8229f;
        return aVar == C2899a.INTERESTING || aVar == C2899a.BUMP;
    }
}
