package app.zenly.locator.debug;

import android.content.Context;
import app.zenly.locator.map.marker.C4171c0;
import app.zenly.locator.map.p111j1.C4079a;

public interface IDebugState {

    public interface State {
    }

    void clearGatheringMarkers();

    State getState(Context context);

    void registerGatheringMarker(C4171c0 c0Var);

    void setContextualLabeling(C4079a aVar);

    void setMarkerVisibility(String str, boolean z, boolean z2, boolean z3, boolean z4);

    void unregisterGatheringMarker(C4171c0 c0Var);
}
