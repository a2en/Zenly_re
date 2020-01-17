package app.zenly.locator.media;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.android.feature.polenta.widget.OutlinedTextView;
import app.zenly.locator.R;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.media.PicResponse.Text;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import app.zenly.locator.p143s.p160v.p161b.C5518b;
import app.zenly.locator.p143s.p160v.p161b.C5553m;
import p213co.znly.models.C7394m3;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.services.C8036d6;
import p213co.znly.models.services.C8036d6.C8037a;
import p213co.znly.models.services.C8052e6;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.media.q0 */
public class C4459q0 extends C4455o0 {

    /* renamed from: f */
    private final C12275b f12017f = new C12275b();

    /* renamed from: g */
    private View f12018g;

    /* renamed from: h */
    private OutlinedTextView f12019h;

    /* renamed from: i */
    private OutlinedTextView f12020i;

    /* renamed from: j */
    private OutlinedTextView f12021j;

    /* renamed from: k */
    private String f12022k;

    /* renamed from: l */
    private String f12023l;

    /* renamed from: m */
    private String f12024m;

    /* renamed from: n */
    private int f12025n;

    /* renamed from: o */
    private MeUserManager f12026o;

    /* renamed from: d */
    private void m13235d() {
        this.f12025n = (this.f12025n + 1) % C4475w0.f12047l.size();
        ((C4475w0) C4475w0.f12047l.get(this.f12025n)).mo11639a(this.f12021j);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11631a(View view) {
        m13235d();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f12026o = C2666b.m9049a(context).mo8764b();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_camera_overlay_metadata, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        C5459d dVar = this.f12026o.mo8756b().f8252c;
        this.f12017f.add(C5448c.m15478a().geoReverseGeocode(dVar.mo13060b(), dVar.mo13062c()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4434e<Object>(this), (Consumer<? super Throwable>) C4428b.f11972e));
        C5460e eVar = new C5460e(dVar.mo13060b(), dVar.mo13062c(), dVar.mo13060b(), dVar.mo13062c());
        eVar.mo13068a(50.0d);
        C8037a newBuilder = C8036d6.newBuilder();
        newBuilder.mo22062a(C5457b.m15501a(eVar));
        this.f12019h.setVisibility(8);
        this.f12017f.add(C5448c.m15478a().weather((C8036d6) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4426a<Object>(this), (Consumer<? super Throwable>) C4432d.f11976e));
        this.f12023l = C5518b.m15645a(getContext(), System.currentTimeMillis());
        this.f12020i.setText(this.f12023l);
    }

    public void onStop() {
        this.f12017f.mo36401a();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f12018g = view;
        this.f12019h = (OutlinedTextView) view.findViewById(R.id.temperature);
        this.f12020i = (OutlinedTextView) view.findViewById(R.id.time);
        this.f12021j = (OutlinedTextView) view.findViewById(R.id.geo);
        C4475w0.DEFAULT.mo11639a(this.f12021j);
        this.f12021j.setOnClickListener(new C4430c(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11632a(C7911b bVar) throws Exception {
        this.f12024m = bVar.getLocality();
        this.f12021j.setText(this.f12024m);
    }

    /* renamed from: b */
    public void mo11627b(int i) {
        View view = this.f12018g;
        view.setPadding(0, i, 0, view.getPaddingBottom());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13232a(C8052e6 e6Var) {
        if (C5448c.m15478a().userMeCache() != null) {
            C7394m3 region = e6Var.getRegion();
            if (region.getWeathersCount() != 0) {
                this.f12022k = C5553m.m15739a(getContext(), region.getWeathers(0).getTemperature());
                this.f12019h.setVisibility(0);
                this.f12019h.setText(this.f12022k);
            }
        }
    }

    /* renamed from: a */
    public void mo11625a(int i) {
        View view = this.f12018g;
        view.setPadding(0, view.getPaddingTop(), 0, i);
    }

    /* renamed from: a */
    public void mo11626a(PicResponse picResponse) {
        picResponse.metadata.geo.text = this.f12024m;
        C4475w0 w0Var = (C4475w0) C4475w0.f12047l.get(this.f12025n);
        picResponse.metadata.geo.textConfig = w0Var.mo11638a();
        Text text = picResponse.metadata.time;
        text.text = this.f12023l;
        text.textConfig = C4475w0.DEFAULT.mo11638a();
        Text text2 = picResponse.metadata.temp;
        text2.text = this.f12022k;
        text2.textConfig = C4475w0.DEFAULT.mo11638a();
    }
}
