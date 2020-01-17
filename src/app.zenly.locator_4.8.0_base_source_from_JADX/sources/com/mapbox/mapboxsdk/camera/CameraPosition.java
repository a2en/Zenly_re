package com.mapbox.mapboxsdk.camera;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11470l;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.utils.C11597d;

public final class CameraPosition implements Parcelable {
    public static final Creator<CameraPosition> CREATOR = new C11447a();

    /* renamed from: e */
    public static final CameraPosition f29621e;
    @Keep
    public final double bearing;
    @Keep
    public final LatLng target;
    @Keep
    public final double tilt;
    @Keep
    public final double zoom;

    /* renamed from: com.mapbox.mapboxsdk.camera.CameraPosition$a */
    static class C11447a implements Creator<CameraPosition> {
        C11447a() {
        }

        public CameraPosition createFromParcel(Parcel parcel) {
            double readDouble = parcel.readDouble();
            CameraPosition cameraPosition = new CameraPosition((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()), parcel.readDouble(), parcel.readDouble(), readDouble);
            return cameraPosition;
        }

        public CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.camera.CameraPosition$b */
    public static final class C11448b {

        /* renamed from: a */
        private double f29622a = -1.0d;

        /* renamed from: b */
        private LatLng f29623b = null;

        /* renamed from: c */
        private double f29624c = -1.0d;

        /* renamed from: d */
        private double f29625d = -1.0d;

        public C11448b() {
        }

        /* renamed from: a */
        public C11448b mo33321a(double d) {
            while (d >= 360.0d) {
                d -= 360.0d;
            }
            while (d < 0.0d) {
                d += 360.0d;
            }
            this.f29622a = d;
            return this;
        }

        /* renamed from: b */
        public C11448b mo33324b(double d) {
            this.f29624c = C11597d.m30382a(d, 0.0d, 60.0d);
            return this;
        }

        /* renamed from: c */
        public C11448b mo33325c(double d) {
            this.f29625d = d;
            return this;
        }

        /* renamed from: a */
        public C11448b mo33322a(LatLng latLng) {
            this.f29623b = latLng;
            return this;
        }

        /* renamed from: a */
        public CameraPosition mo33323a() {
            CameraPosition cameraPosition = new CameraPosition(this.f29623b, this.f29625d, this.f29624c, this.f29622a);
            return cameraPosition;
        }

        public C11448b(CameraPosition cameraPosition) {
            if (cameraPosition != null) {
                this.f29622a = cameraPosition.bearing;
                this.f29623b = cameraPosition.target;
                this.f29624c = cameraPosition.tilt;
                this.f29625d = cameraPosition.zoom;
            }
        }

        public C11448b(TypedArray typedArray) {
            if (typedArray != null) {
                this.f29622a = (double) typedArray.getFloat(C11470l.mapbox_MapView_mapbox_cameraBearing, 0.0f);
                this.f29623b = new LatLng((double) typedArray.getFloat(C11470l.mapbox_MapView_mapbox_cameraTargetLat, 0.0f), (double) typedArray.getFloat(C11470l.mapbox_MapView_mapbox_cameraTargetLng, 0.0f));
                this.f29624c = (double) typedArray.getFloat(C11470l.mapbox_MapView_mapbox_cameraTilt, 0.0f);
                this.f29625d = (double) typedArray.getFloat(C11470l.mapbox_MapView_mapbox_cameraZoom, 0.0f);
            }
        }

        public C11448b(C11450a aVar) {
            if (aVar != null) {
                this.f29622a = aVar.mo33327a();
                this.f29623b = aVar.mo33328b();
                this.f29624c = aVar.mo33329c();
                this.f29625d = aVar.mo33330d();
            }
        }
    }

    static {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d);
        f29621e = cameraPosition;
    }

    @Keep
    CameraPosition(LatLng latLng, double d, double d2, double d3) {
        this.target = latLng;
        this.bearing = d3;
        this.tilt = d2;
        this.zoom = d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraPosition.class != obj.getClass()) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        LatLng latLng = this.target;
        return (latLng == null || latLng.equals(cameraPosition.target)) && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.bearing == cameraPosition.bearing;
    }

    public int hashCode() {
        LatLng latLng = this.target;
        return 31 + (latLng != null ? latLng.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target: ");
        sb.append(this.target);
        sb.append(", Zoom:");
        sb.append(this.zoom);
        sb.append(", Bearing:");
        sb.append(this.bearing);
        sb.append(", Tilt:");
        sb.append(this.tilt);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.bearing);
        parcel.writeParcelable(this.target, i);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.zoom);
    }
}
