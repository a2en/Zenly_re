package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C10531a;
import com.google.android.gms.internal.maps.C10532b;
import com.google.android.gms.internal.maps.C10534d;
import com.google.android.gms.internal.maps.C10539i;
import com.google.android.gms.internal.maps.C10542l;
import com.google.android.gms.internal.maps.C10544n;
import com.google.android.gms.internal.maps.C10546p;
import com.google.android.gms.internal.maps.C10548r;
import com.google.android.gms.internal.maps.C10550t;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzn;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.internal.maps.zzw;
import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* renamed from: com.google.android.gms.maps.internal.m */
public final class C10624m extends C10531a implements IGoogleMapDelegate {
    C10624m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final zzh addCircle(CircleOptions circleOptions) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) circleOptions);
        Parcel a2 = mo28412a(35, a);
        zzh a3 = C10542l.m26951a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzk addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) groundOverlayOptions);
        Parcel a2 = mo28412a(12, a);
        zzk a3 = C10544n.m26952a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzt addMarker(MarkerOptions markerOptions) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) markerOptions);
        Parcel a2 = mo28412a(11, a);
        zzt a3 = C10548r.m26954a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzw addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) polygonOptions);
        Parcel a2 = mo28412a(10, a);
        zzw a3 = C10550t.m26955a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzz addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) polylineOptions);
        Parcel a2 = mo28412a(9, a);
        zzz a3 = C10532b.m26938a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzac addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) tileOverlayOptions);
        Parcel a2 = mo28412a(13, a);
        zzac a3 = C10534d.m26939a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void animateCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(5, a);
    }

    public final void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzc zzc) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        C10539i.m26944a(a, (IInterface) zzc);
        mo28414b(6, a);
    }

    public final void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, zzc zzc) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        a.writeInt(i);
        C10539i.m26944a(a, (IInterface) zzc);
        mo28414b(7, a);
    }

    public final void clear() throws RemoteException {
        mo28414b(14, mo28411a());
    }

    public final CameraPosition getCameraPosition() throws RemoteException {
        Parcel a = mo28412a(1, mo28411a());
        CameraPosition cameraPosition = (CameraPosition) C10539i.m26943a(a, CameraPosition.CREATOR);
        a.recycle();
        return cameraPosition;
    }

    public final zzn getFocusedBuilding() throws RemoteException {
        Parcel a = mo28412a(44, mo28411a());
        zzn a2 = C10546p.m26953a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void getMapAsync(zzap zzap) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzap);
        mo28414b(53, a);
    }

    public final int getMapType() throws RemoteException {
        Parcel a = mo28412a(15, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final float getMaxZoomLevel() throws RemoteException {
        Parcel a = mo28412a(2, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float getMinZoomLevel() throws RemoteException {
        Parcel a = mo28412a(3, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final Location getMyLocation() throws RemoteException {
        Parcel a = mo28412a(23, mo28411a());
        Location location = (Location) C10539i.m26943a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    public final IProjectionDelegate getProjection() throws RemoteException {
        IProjectionDelegate iProjectionDelegate;
        Parcel a = mo28412a(26, mo28411a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            iProjectionDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof IProjectionDelegate) {
                iProjectionDelegate = (IProjectionDelegate) queryLocalInterface;
            } else {
                iProjectionDelegate = new C10615d(readStrongBinder);
            }
        }
        a.recycle();
        return iProjectionDelegate;
    }

    public final IUiSettingsDelegate getUiSettings() throws RemoteException {
        IUiSettingsDelegate iUiSettingsDelegate;
        Parcel a = mo28412a(25, mo28411a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            iUiSettingsDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof IUiSettingsDelegate) {
                iUiSettingsDelegate = (IUiSettingsDelegate) queryLocalInterface;
            } else {
                iUiSettingsDelegate = new C10619h(readStrongBinder);
            }
        }
        a.recycle();
        return iUiSettingsDelegate;
    }

    public final boolean isBuildingsEnabled() throws RemoteException {
        Parcel a = mo28412a(40, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isIndoorEnabled() throws RemoteException {
        Parcel a = mo28412a(19, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isMyLocationEnabled() throws RemoteException {
        Parcel a = mo28412a(21, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isTrafficEnabled() throws RemoteException {
        Parcel a = mo28412a(17, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final void moveCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(4, a);
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        mo28414b(54, a);
    }

    public final void onDestroy() throws RemoteException {
        mo28414b(57, mo28411a());
    }

    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        mo28414b(81, a);
    }

    public final void onExitAmbient() throws RemoteException {
        mo28414b(82, mo28411a());
    }

    public final void onLowMemory() throws RemoteException {
        mo28414b(58, mo28411a());
    }

    public final void onPause() throws RemoteException {
        mo28414b(56, mo28411a());
    }

    public final void onResume() throws RemoteException {
        mo28414b(55, mo28411a());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        Parcel a2 = mo28412a(60, a);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    public final void onStart() throws RemoteException {
        mo28414b(101, mo28411a());
    }

    public final void onStop() throws RemoteException {
        mo28414b(102, mo28411a());
    }

    public final void resetMinMaxZoomPreference() throws RemoteException {
        mo28414b(94, mo28411a());
    }

    public final void setBuildingsEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(41, a);
    }

    public final void setContentDescription(String str) throws RemoteException {
        Parcel a = mo28411a();
        a.writeString(str);
        mo28414b(61, a);
    }

    public final boolean setIndoorEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        Parcel a2 = mo28412a(20, a);
        boolean a3 = C10539i.m26947a(a2);
        a2.recycle();
        return a3;
    }

    public final void setInfoWindowAdapter(zzh zzh) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzh);
        mo28414b(33, a);
    }

    public final void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLngBounds);
        mo28414b(95, a);
    }

    public final void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iLocationSourceDelegate);
        mo28414b(24, a);
    }

    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) mapStyleOptions);
        Parcel a2 = mo28412a(91, a);
        boolean a3 = C10539i.m26947a(a2);
        a2.recycle();
        return a3;
    }

    public final void setMapType(int i) throws RemoteException {
        Parcel a = mo28411a();
        a.writeInt(i);
        mo28414b(16, a);
    }

    public final void setMaxZoomPreference(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(93, a);
    }

    public final void setMinZoomPreference(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(92, a);
    }

    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(22, a);
    }

    public final void setOnCameraChangeListener(zzl zzl) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzl);
        mo28414b(27, a);
    }

    public final void setOnCameraIdleListener(zzn zzn) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzn);
        mo28414b(99, a);
    }

    public final void setOnCameraMoveCanceledListener(zzp zzp) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzp);
        mo28414b(98, a);
    }

    public final void setOnCameraMoveListener(zzr zzr) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzr);
        mo28414b(97, a);
    }

    public final void setOnCameraMoveStartedListener(zzt zzt) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzt);
        mo28414b(96, a);
    }

    public final void setOnCircleClickListener(zzv zzv) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzv);
        mo28414b(89, a);
    }

    public final void setOnGroundOverlayClickListener(zzx zzx) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzx);
        mo28414b(83, a);
    }

    public final void setOnIndoorStateChangeListener(zzz zzz) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzz);
        mo28414b(45, a);
    }

    public final void setOnInfoWindowClickListener(zzab zzab) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzab);
        mo28414b(32, a);
    }

    public final void setOnInfoWindowCloseListener(zzad zzad) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzad);
        mo28414b(86, a);
    }

    public final void setOnInfoWindowLongClickListener(zzaf zzaf) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzaf);
        mo28414b(84, a);
    }

    public final void setOnMapClickListener(zzaj zzaj) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzaj);
        mo28414b(28, a);
    }

    public final void setOnMapLoadedCallback(zzal zzal) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzal);
        mo28414b(42, a);
    }

    public final void setOnMapLongClickListener(zzan zzan) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzan);
        mo28414b(29, a);
    }

    public final void setOnMarkerClickListener(zzar zzar) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzar);
        mo28414b(30, a);
    }

    public final void setOnMarkerDragListener(zzat zzat) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzat);
        mo28414b(31, a);
    }

    public final void setOnMyLocationButtonClickListener(zzav zzav) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzav);
        mo28414b(37, a);
    }

    public final void setOnMyLocationChangeListener(zzax zzax) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzax);
        mo28414b(36, a);
    }

    public final void setOnMyLocationClickListener(zzaz zzaz) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzaz);
        mo28414b(107, a);
    }

    public final void setOnPoiClickListener(zzbb zzbb) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbb);
        mo28414b(80, a);
    }

    public final void setOnPolygonClickListener(zzbd zzbd) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbd);
        mo28414b(85, a);
    }

    public final void setOnPolylineClickListener(zzbf zzbf) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbf);
        mo28414b(87, a);
    }

    public final void setPadding(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel a = mo28411a();
        a.writeInt(i);
        a.writeInt(i2);
        a.writeInt(i3);
        a.writeInt(i4);
        mo28414b(39, a);
    }

    public final void setTrafficEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(18, a);
    }

    public final void setWatermarkEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(51, a);
    }

    public final void snapshot(zzbs zzbs, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbs);
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(38, a);
    }

    public final void snapshotForTest(zzbs zzbs) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbs);
        mo28414b(71, a);
    }

    public final void stopAnimation() throws RemoteException {
        mo28414b(8, mo28411a());
    }

    public final boolean useViewLifecycleWhenInFragment() throws RemoteException {
        Parcel a = mo28412a(59, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }
}
