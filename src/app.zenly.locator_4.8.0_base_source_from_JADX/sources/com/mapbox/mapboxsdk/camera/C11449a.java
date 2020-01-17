package com.mapbox.mapboxsdk.camera;

import com.mapbox.mapboxsdk.camera.CameraPosition.C11448b;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;

/* renamed from: com.mapbox.mapboxsdk.camera.a */
public final class C11449a {

    /* renamed from: com.mapbox.mapboxsdk.camera.a$a */
    static final class C11450a implements CameraUpdate {

        /* renamed from: a */
        private final double f29626a;

        /* renamed from: b */
        private final LatLng f29627b;

        /* renamed from: c */
        private final double f29628c;

        /* renamed from: d */
        private final double f29629d;

        C11450a(double d, LatLng latLng, double d2, double d3) {
            this.f29626a = d;
            this.f29627b = latLng;
            this.f29628c = d2;
            this.f29629d = d3;
        }

        /* renamed from: a */
        public double mo33327a() {
            return this.f29626a;
        }

        /* renamed from: b */
        public LatLng mo33328b() {
            return this.f29627b;
        }

        /* renamed from: c */
        public double mo33329c() {
            return this.f29628c;
        }

        /* renamed from: d */
        public double mo33330d() {
            return this.f29629d;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C11450a.class != obj.getClass()) {
                return false;
            }
            C11450a aVar = (C11450a) obj;
            if (Double.compare(aVar.f29626a, this.f29626a) != 0 || Double.compare(aVar.f29628c, this.f29628c) != 0 || Double.compare(aVar.f29629d, this.f29629d) != 0) {
                return false;
            }
            LatLng latLng = this.f29627b;
            LatLng latLng2 = aVar.f29627b;
            if (latLng != null) {
                z = latLng.equals(latLng2);
            } else if (latLng2 != null) {
                z = false;
            }
            return z;
        }

        public CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            CameraPosition a = mapboxMap.mo33541a();
            if (this.f29627b != null) {
                return new C11448b(this).mo33323a();
            }
            C11448b bVar = new C11448b(this);
            bVar.mo33322a(a.target);
            return bVar.mo33323a();
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.f29626a);
            int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
            LatLng latLng = this.f29627b;
            int hashCode = i + (latLng != null ? latLng.hashCode() : 0);
            long doubleToLongBits2 = Double.doubleToLongBits(this.f29628c);
            int i2 = (hashCode * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
            long doubleToLongBits3 = Double.doubleToLongBits(this.f29629d);
            return (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CameraPositionUpdate{bearing=");
            sb.append(this.f29626a);
            sb.append(", target=");
            sb.append(this.f29627b);
            sb.append(", tilt=");
            sb.append(this.f29628c);
            sb.append(", zoom=");
            sb.append(this.f29629d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static CameraUpdate m29559a(CameraPosition cameraPosition) {
        C11450a aVar = new C11450a(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom);
        return aVar;
    }
}
