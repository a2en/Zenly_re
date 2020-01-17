package app.zenly.locator.map.p111j1;

import java.util.Date;
import p213co.znly.models.C7408n3;

/* renamed from: app.zenly.locator.map.j1.c */
public class C4081c {

    /* renamed from: a */
    public final Date f10704a = new Date();

    /* renamed from: b */
    public C7408n3 f10705b = C7408n3.WEATHER_TYPE_UNKNOWN;

    /* renamed from: c */
    public int f10706c;

    /* renamed from: d */
    public double f10707d;

    /* renamed from: e */
    public final Date f10708e = new Date();

    /* renamed from: f */
    public final Date f10709f = new Date();

    /* renamed from: g */
    public final Date f10710g = new Date();

    /* renamed from: h */
    public double f10711h;

    /* renamed from: a */
    public C4081c mo10745a(C4081c cVar) {
        cVar.f10704a.setTime(this.f10704a.getTime());
        cVar.f10705b = this.f10705b;
        cVar.f10706c = this.f10706c;
        cVar.f10707d = this.f10707d;
        cVar.f10708e.setTime(this.f10708e.getTime());
        cVar.f10709f.setTime(this.f10709f.getTime());
        cVar.f10710g.setTime(this.f10710g.getTime());
        cVar.f10711h = this.f10711h;
        return cVar;
    }

    /* renamed from: a */
    public boolean mo10746a() {
        return this.f10708e.before(this.f10710g) && this.f10709f.after(this.f10710g);
    }
}
