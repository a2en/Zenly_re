package app.zenly.locator.map.marker;

import app.zenly.locator.map.base.Map.FinishCallback;
import java.util.List;

/* renamed from: app.zenly.locator.map.marker.s */
/* compiled from: lambda */
public final /* synthetic */ class C4261s implements FinishCallback {

    /* renamed from: a */
    private final /* synthetic */ MarkerManager f11434a;

    /* renamed from: b */
    private final /* synthetic */ List f11435b;

    public /* synthetic */ C4261s(MarkerManager markerManager, List list) {
        this.f11434a = markerManager;
        this.f11435b = list;
    }

    public final void onFinish(boolean z) {
        this.f11434a.mo10937b(this.f11435b, z);
    }
}
