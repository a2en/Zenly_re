package app.zenly.locator.map.mapbox;

import android.content.res.Resources;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5462f;
import app.zenly.locator.p143s.p150n.C5463g;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: app.zenly.locator.map.mapbox.f */
public class C4135f extends C5462f {

    /* renamed from: b */
    private Polyline f10840b;

    protected C4135f(C5463g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    public void mo10823a(MapboxMap mapboxMap) {
        PolylineOptions polylineOptions = new PolylineOptions();
        for (C5459d dVar : this.f14056a.mo13078b()) {
            polylineOptions.mo33238a(new LatLng(dVar.mo13060b(), dVar.mo13062c()));
        }
        polylineOptions.mo33237a(this.f14056a.mo13074a());
        polylineOptions.mo33241b(this.f14056a.mo13079c() / Resources.getSystem().getDisplayMetrics().density);
        this.f10840b = mapboxMap.mo33540a(polylineOptions);
    }

    /* renamed from: a */
    public void mo10662a(List<C5459d> list) {
        if (this.f10840b != null) {
            ArrayList arrayList = new ArrayList();
            for (C5459d dVar : list) {
                arrayList.add(new LatLng(dVar.mo13060b(), dVar.mo13062c()));
            }
            this.f10840b.mo33173a((List<LatLng>) arrayList);
        }
    }

    /* renamed from: a */
    public void mo10660a(int i) {
        Polyline polyline = this.f10840b;
        if (polyline != null) {
            polyline.mo33231a(i);
        }
    }

    /* renamed from: a */
    public void mo10659a() {
        Polyline polyline = this.f10840b;
        if (polyline != null) {
            polyline.mo33257c();
            this.f10840b = null;
        }
    }
}
