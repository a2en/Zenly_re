package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;

public class LatLngQuad implements Parcelable {
    public static final Creator<LatLngQuad> CREATOR = new C11458a();
    @Keep
    private final LatLng bottomLeft;
    @Keep
    private final LatLng bottomRight;
    @Keep
    private final LatLng topLeft;
    @Keep
    private final LatLng topRight;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLngQuad$a */
    static class C11458a implements Creator<LatLngQuad> {
        C11458a() {
        }

        public LatLngQuad createFromParcel(Parcel parcel) {
            return LatLngQuad.m29593b(parcel);
        }

        public LatLngQuad[] newArray(int i) {
            return new LatLngQuad[i];
        }
    }

    @Keep
    public LatLngQuad(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        this.topLeft = latLng;
        this.topRight = latLng2;
        this.bottomRight = latLng3;
        this.bottomLeft = latLng4;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static LatLngQuad m29593b(Parcel parcel) {
        return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int hashCode = this.topLeft.hashCode();
        int hashCode2 = (hashCode ^ (hashCode >>> 31)) + this.topRight.hashCode();
        int hashCode3 = (hashCode2 ^ (hashCode2 >>> 31)) + this.bottomRight.hashCode();
        return (hashCode3 ^ (hashCode3 >>> 31)) + this.bottomLeft.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.topLeft.writeToParcel(parcel, i);
        this.topRight.writeToParcel(parcel, i);
        this.bottomRight.writeToParcel(parcel, i);
        this.bottomLeft.writeToParcel(parcel, i);
    }
}
