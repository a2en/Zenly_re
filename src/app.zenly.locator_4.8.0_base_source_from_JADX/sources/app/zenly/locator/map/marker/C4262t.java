package app.zenly.locator.map.marker;

import app.zenly.locator.map.view.PrecisionCircleView.PrecisionCalculator;

/* renamed from: app.zenly.locator.map.marker.t */
/* compiled from: lambda */
public final /* synthetic */ class C4262t implements PrecisionCalculator {

    /* renamed from: a */
    private final /* synthetic */ MarkerManager f11436a;

    public /* synthetic */ C4262t(MarkerManager markerManager) {
        this.f11436a = markerManager;
    }

    public final float computePrecisionRadius(double d) {
        return this.f11436a.mo10918a(d);
    }
}
