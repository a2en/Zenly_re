package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.maps.internal.C10622k;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.C10637c;
import com.google.android.gms.maps.model.C10639d;
import com.google.android.gms.maps.model.C10641e;
import com.google.android.gms.maps.model.C10643f;
import com.google.android.gms.maps.model.C10645g;
import com.google.android.gms.maps.model.C10646h;
import com.google.android.gms.maps.model.C10647i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlayOptions;

public final class GoogleMap {

    /* renamed from: a */
    private final IGoogleMapDelegate f27562a;

    /* renamed from: b */
    private C10606d f27563b;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(C10643f fVar);

        View getInfoWindow(C10643f fVar);
    }

    @Deprecated
    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        void onCameraMoveStarted(int i);
    }

    public interface OnCircleClickListener {
        void onCircleClick(C10637c cVar);
    }

    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(C10639d dVar);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(C10641e eVar);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(C10643f fVar);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(C10643f fVar);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(C10643f fVar);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(C10643f fVar);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(C10643f fVar);

        void onMarkerDragEnd(C10643f fVar);

        void onMarkerDragStart(C10643f fVar);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface OnMyLocationClickListener {
        void onMyLocationClick(Location location);
    }

    public interface OnPoiClickListener {
        void onPoiClick(PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(C10645g gVar);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(C10646h hVar);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$a */
    private static final class C10600a extends C10622k {

        /* renamed from: a */
        private final CancelableCallback f27564a;

        C10600a(CancelableCallback cancelableCallback) {
            this.f27564a = cancelableCallback;
        }

        public final void onCancel() {
            this.f27564a.onCancel();
        }

        public final void onFinish() {
            this.f27564a.onFinish();
        }
    }

    public GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        C10123l.m25505a(iGoogleMapDelegate);
        this.f27562a = iGoogleMapDelegate;
    }

    /* renamed from: a */
    public final CameraPosition mo28749a() {
        try {
            return this.f27562a.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final int mo28762b() {
        try {
            return this.f27562a.getMapType();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final float mo28763c() {
        try {
            return this.f27562a.getMinZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final C10606d mo28764d() {
        try {
            if (this.f27563b == null) {
                this.f27563b = new C10606d(this.f27562a.getUiSettings());
            }
            return this.f27563b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final void mo28765e() {
        try {
            this.f27562a.stopAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo28758a(C10603a aVar) {
        try {
            this.f27562a.moveCamera(aVar.mo28826a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo28759a(C10603a aVar, int i, CancelableCallback cancelableCallback) {
        zzc zzc;
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.f27562a;
            IObjectWrapper a = aVar.mo28826a();
            if (cancelableCallback == null) {
                zzc = null;
            } else {
                zzc = new C10600a(cancelableCallback);
            }
            iGoogleMapDelegate.animateCameraWithDurationAndCallback(a, i, zzc);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final C10646h mo28750a(PolylineOptions polylineOptions) {
        try {
            return new C10646h(this.f27562a.addPolyline(polylineOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final C10647i mo28751a(TileOverlayOptions tileOverlayOptions) {
        try {
            zzac addTileOverlay = this.f27562a.addTileOverlay(tileOverlayOptions);
            if (addTileOverlay != null) {
                return new C10647i(addTileOverlay);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo28753a(int i) {
        try {
            this.f27562a.setMapType(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final boolean mo28761a(boolean z) {
        try {
            return this.f27562a.setIndoorEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo28757a(OnCameraMoveListener onCameraMoveListener) {
        if (onCameraMoveListener == null) {
            try {
                this.f27562a.setOnCameraMoveListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f27562a.setOnCameraMoveListener(new C10610h(this, onCameraMoveListener));
        }
    }

    /* renamed from: a */
    public final void mo28756a(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        if (onCameraMoveCanceledListener == null) {
            try {
                this.f27562a.setOnCameraMoveCanceledListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f27562a.setOnCameraMoveCanceledListener(new C10611i(this, onCameraMoveCanceledListener));
        }
    }

    /* renamed from: a */
    public final void mo28755a(OnCameraIdleListener onCameraIdleListener) {
        if (onCameraIdleListener == null) {
            try {
                this.f27562a.setOnCameraIdleListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f27562a.setOnCameraIdleListener(new C10630j(this, onCameraIdleListener));
        }
    }

    /* renamed from: a */
    public final void mo28754a(int i, int i2, int i3, int i4) {
        try {
            this.f27562a.setPadding(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final boolean mo28760a(MapStyleOptions mapStyleOptions) {
        try {
            return this.f27562a.setMapStyle(mapStyleOptions);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo28752a(float f) {
        try {
            this.f27562a.setMaxZoomPreference(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
