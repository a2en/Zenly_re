package app.zenly.locator.debug;

import android.content.Context;
import app.zenly.locator.debug.IDebugState.State;
import app.zenly.locator.map.marker.C4171c0;
import app.zenly.locator.map.p111j1.C4079a;

/* renamed from: app.zenly.locator.debug.b */
public final class C3439b implements IDebugState {

    /* renamed from: app.zenly.locator.debug.b$b */
    private static class C3441b {

        /* renamed from: a */
        static final IDebugState f9465a = new C3439b();
    }

    /* renamed from: a */
    public static IDebugState m10684a() {
        return C3441b.f9465a;
    }

    public void clearGatheringMarkers() {
    }

    public State getState(Context context) {
        return null;
    }

    public void registerGatheringMarker(C4171c0 c0Var) {
    }

    public void setContextualLabeling(C4079a aVar) {
    }

    public void setMarkerVisibility(String str, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public void unregisterGatheringMarker(C4171c0 c0Var) {
    }

    private C3439b() {
    }
}
