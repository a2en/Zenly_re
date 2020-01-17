package app.zenly.locator.map.p109i1;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.map.C4409z0;
import app.zenly.locator.map.p109i1.p110s1.C4062a;
import app.zenly.locator.map.p111j1.C4081c;
import p213co.znly.models.C7394m3;
import p213co.znly.models.C7408n3;
import p213co.znly.models.WeatherProto$Weather;
import p213co.znly.models.services.C8052e6;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.map.i1.r1 */
public class C4059r1 extends C4044o1 {

    /* renamed from: k */
    private static C4059r1 f10658k;

    /* renamed from: d */
    private final ZenlySchedulers f10659d = C1351e.m6372a(C4409z0.f11896b.mo19916a("weatherManager"));

    /* renamed from: e */
    private final C12286f f10660e = this.f10659d.getMainThread();

    /* renamed from: f */
    private final C12286f f10661f = this.f10659d.getSingle();

    /* renamed from: g */
    private final C12785a<C4062a> f10662g = C12785a.m33447u();

    /* renamed from: h */
    private C4081c f10663h = null;

    /* renamed from: i */
    private C4081c f10664i = null;

    /* renamed from: j */
    private final C12279e<C4062a> f10665j = this.f10662g.mo36452b(this.f10661f).mo36428a(this.f10660e).mo36501i(new C4016h1(this)).mo36506l();

    private C4059r1() {
    }

    /* renamed from: g */
    public static C4059r1 m11760g() {
        if (f10658k == null) {
            f10658k = new C4059r1();
        }
        return f10658k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10700b() {
        mo10699a(this.f10665j.mo36508m());
        mo10699a(this.f10629a.weatherStream().mo36428a(this.f10661f).mo36413a((Consumer<? super T>) new C4019i1<Object>(this), (Consumer<? super Throwable>) C4022j1.f10579e, (Action) C4013g1.f10568a));
    }

    /* renamed from: e */
    public C12279e<C4062a> mo10728e() {
        C4062a aVar = new C4062a();
        C4081c cVar = this.f10664i;
        if (cVar != null) {
            aVar.mo10732a(cVar);
            aVar.mo10731a(2);
        } else {
            aVar.mo10731a(1);
        }
        return this.f10665j.mo36485d(aVar);
    }

    /* renamed from: f */
    public C4081c mo10729f() {
        return this.f10664i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11758a(C8052e6 e6Var) {
        C7394m3 region = e6Var.getRegion();
        if (region != null) {
            C4062a aVar = new C4062a();
            if (region.getWeathersCount() > 0) {
                if (this.f10663h == null) {
                    this.f10663h = new C4081c();
                    aVar.mo10731a(2);
                }
                WeatherProto$Weather weathers = region.getWeathers(0);
                long g = C3245z.m10288g(weathers.getTimestamp());
                long g2 = C3245z.m10288g(weathers.getSunrise());
                long g3 = C3245z.m10288g(weathers.getSunset());
                long g4 = C3245z.m10288g(weathers.getTimestamp());
                C7408n3 n3Var = C7408n3.WEATHER_TYPE_UNKNOWN;
                for (int i = 0; i < weathers.getConditionsCount(); i++) {
                    n3Var = weathers.getConditions(i).getWeatherType();
                    if (n3Var != C7408n3.WEATHER_TYPE_UNKNOWN) {
                        break;
                    }
                }
                if (g != this.f10663h.f10704a.getTime()) {
                    this.f10663h.f10704a.setTime(g);
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(8);
                    }
                }
                double temperature = weathers.getTemperature();
                C4081c cVar = this.f10663h;
                if (temperature != cVar.f10711h) {
                    cVar.f10711h = weathers.getTemperature();
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(512);
                    }
                }
                double pressure = weathers.getPressure();
                C4081c cVar2 = this.f10663h;
                if (pressure != cVar2.f10707d) {
                    cVar2.f10707d = weathers.getPressure();
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(32);
                    }
                }
                int humidity = weathers.getHumidity();
                C4081c cVar3 = this.f10663h;
                if (humidity != cVar3.f10706c) {
                    cVar3.f10706c = weathers.getHumidity();
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(16);
                    }
                }
                if (g2 != this.f10663h.f10708e.getTime()) {
                    this.f10663h.f10708e.setTime(g2);
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(64);
                    }
                }
                if (g3 != this.f10663h.f10709f.getTime()) {
                    this.f10663h.f10709f.setTime(g3);
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(128);
                    }
                }
                if (g4 != this.f10663h.f10710g.getTime()) {
                    this.f10663h.f10710g.setTime(g4);
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(256);
                    }
                }
                C4081c cVar4 = this.f10663h;
                if (n3Var != cVar4.f10705b) {
                    cVar4.f10705b = n3Var;
                    if (aVar.mo10730a() != 2) {
                        aVar.mo10731a(4);
                    }
                }
                C4081c cVar5 = this.f10663h;
                C4081c cVar6 = new C4081c();
                cVar5.mo10745a(cVar6);
                aVar.mo10732a(cVar6);
            } else {
                this.f10663h = null;
                aVar.mo10731a(1);
            }
            if (aVar.mo10730a() != 0) {
                this.f10662g.onNext(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C4062a m11756a(C4062a aVar) {
        this.f10664i = aVar.mo10733b();
        return aVar;
    }
}
