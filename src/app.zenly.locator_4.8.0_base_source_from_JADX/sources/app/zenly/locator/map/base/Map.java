package app.zenly.locator.map.base;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import app.zenly.locator.p143s.p150n.C5458c;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5462f;
import app.zenly.locator.p143s.p150n.C5463g;
import app.zenly.locator.p143s.p150n.C5464h;

public interface Map {

    public interface FinishCallback {
        void onFinish(boolean z);
    }

    public interface MapListener {
        void onMapCameraMove();

        boolean onMapTouch(View view, MotionEvent motionEvent);
    }

    public interface OnMapReadyCallback {
        void onMapReady(Map map);
    }

    /* renamed from: app.zenly.locator.map.base.Map$a */
    public enum C3901a {
        STANDARD,
        HYBRID,
        ZENLY
    }

    void addOverlay(View view);

    C5462f addPolyline(C5463g gVar);

    void animateCamera(C5458c cVar, int i, FinishCallback finishCallback);

    void fromScreenLocation(PointF pointF, C5459d dVar);

    C5458c getCameraPosition();

    double getCurrentZoom();

    float getCurrentZoomRatio();

    double getDistanceBetween(int i, int i2, int i3, int i4);

    double getHorizontalDistanceAtCenter();

    double getHorizontalMetersPerPixelAtCenter();

    double getHorizontalPixelsPerDegreeAtCenter();

    FrameLayout getMapContainer();

    C3901a getMapStyle();

    int getMapTileSize();

    int getMapViewHeight();

    int getMapViewWidth();

    double getMaxZoom();

    double getMetersPerPixelAtLatitude(double d);

    double getMinZoom();

    double getVerticalDistanceAtCenter();

    C5464h getVisibleRegion();

    boolean isNightModeEnabled();

    boolean isReady();

    void moveCamera(C5458c cVar, FinishCallback finishCallback);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void setListener(MapListener mapListener);

    void setMapPadding(int i, int i2, int i3, int i4);

    void setMapStyle(C3901a aVar);

    void setNightModeEnabled(boolean z);

    void setOnMapReadyCallback(OnMapReadyCallback onMapReadyCallback);

    void setTileOverlay(String str);

    void toScreenLocation(C5459d dVar, PointF pointF);
}
