package app.zenly.locator.map.p107g1;

import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5462f;
import app.zenly.locator.p143s.p150n.C5463g;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.C10646h;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: app.zenly.locator.map.g1.d */
public class C3987d extends C5462f {

    /* renamed from: b */
    private C10646h f10538b;

    protected C3987d(C5463g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    public void mo10661a(GoogleMap googleMap) {
        PolylineOptions polylineOptions = new PolylineOptions();
        for (C5459d dVar : this.f14056a.mo13078b()) {
            polylineOptions.mo29143a(new LatLng(dVar.mo13060b(), dVar.mo13062c()));
        }
        polylineOptions.mo29141a(this.f14056a.mo13074a());
        polylineOptions.mo29140a(this.f14056a.mo13079c());
        polylineOptions.mo29145b(new RoundCap());
        polylineOptions.mo29142a((Cap) new RoundCap());
        this.f10538b = googleMap.mo28750a(polylineOptions);
    }

    /* renamed from: a */
    public void mo10662a(List<C5459d> list) {
        if (this.f10538b != null) {
            ArrayList arrayList = new ArrayList();
            for (C5459d dVar : list) {
                arrayList.add(new LatLng(dVar.mo13060b(), dVar.mo13062c()));
            }
            this.f10538b.mo29203a((List<LatLng>) arrayList);
        }
    }

    /* renamed from: a */
    public void mo10660a(int i) {
        C10646h hVar = this.f10538b;
        if (hVar != null) {
            hVar.mo29202a(i);
        }
    }

    /* renamed from: a */
    public void mo10659a() {
        C10646h hVar = this.f10538b;
        if (hVar != null) {
            hVar.mo29201a();
            this.f10538b = null;
        }
    }
}
