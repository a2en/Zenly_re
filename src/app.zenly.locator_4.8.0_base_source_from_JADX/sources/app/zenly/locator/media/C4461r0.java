package app.zenly.locator.media;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import app.zenly.locator.p143s.p162w.p166f.C5588b;
import p213co.znly.models.C7394m3;
import p213co.znly.models.C7408n3;
import p213co.znly.models.WeatherProto$Weather;
import p213co.znly.models.WeatherProto$Weather.C6939b;
import p213co.znly.models.services.C8036d6;
import p213co.znly.models.services.C8036d6.C8037a;
import p213co.znly.models.services.C8052e6;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.media.r0 */
public class C4461r0 extends C4455o0 {

    /* renamed from: f */
    private final C12275b f12028f = new C12275b();

    /* renamed from: g */
    private ParticleAnimation f12029g;

    /* renamed from: h */
    private ParticleView f12030h;

    /* renamed from: i */
    private C7408n3 f12031i = C7408n3.WEATHER_TYPE_UNKNOWN;

    /* renamed from: j */
    private MeUserManager f12032j;

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f12032j = C2666b.m9049a(context).mo8764b();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_camera_overlay_weather, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        C5459d dVar = this.f12032j.mo8756b().f8252c;
        if (dVar != null) {
            C5460e eVar = new C5460e(dVar.mo13060b(), dVar.mo13062c(), dVar.mo13060b(), dVar.mo13062c());
            eVar.mo13068a(50.0d);
            C8037a newBuilder = C8036d6.newBuilder();
            newBuilder.mo22062a(C5457b.m15501a(eVar));
            this.f12028f.add(C5448c.m15478a().weather((C8036d6) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4436f<Object>(this), (Consumer<? super Throwable>) C4438g.f11982e));
        }
    }

    public void onStop() {
        this.f12028f.mo36401a();
        ParticleAnimation particleAnimation = this.f12029g;
        if (particleAnimation != null) {
            particleAnimation.mo9493a(true);
            this.f12029g = null;
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f12030h = (ParticleView) view.findViewById(R.id.particle_view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13242a(C8052e6 e6Var) {
        if (C5448c.m15478a().userMeCache() != null) {
            C7394m3 region = e6Var.getRegion();
            if (!(region == null || region.getWeathersCount() == 0)) {
                WeatherProto$Weather weathers = region.getWeathers(0);
                C7408n3 n3Var = C7408n3.WEATHER_TYPE_UNKNOWN;
                for (C6939b weatherType : weathers.getConditionsList()) {
                    n3Var = weatherType.getWeatherType();
                    if (n3Var != C7408n3.WEATHER_TYPE_UNKNOWN) {
                        break;
                    }
                }
                if (n3Var != C7408n3.WEATHER_TYPE_UNKNOWN) {
                    this.f12031i = n3Var;
                    this.f12029g = C5588b.m15804a(getActivity(), n3Var.getNumber(), new Point(), new Point(this.f12030h.getWidth(), this.f12030h.getHeight()), 0);
                    ParticleAnimation particleAnimation = this.f12029g;
                    if (particleAnimation != null) {
                        this.f12030h.mo9542a(particleAnimation);
                        this.f12029g.mo9509q();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo11626a(PicResponse picResponse) {
        picResponse.metadata.weather.type = this.f12031i.getNumber();
    }
}
