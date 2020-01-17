package com.mapbox.android.telemetry;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

public class LocationEvent extends Event implements Parcelable {
    public static final Creator<LocationEvent> CREATOR = new C11303a();

    /* renamed from: p */
    private static final String f29235p;
    @C11258c("event")

    /* renamed from: f */
    private final String f29236f;
    @C11258c("created")

    /* renamed from: g */
    private final String f29237g;
    @C11258c("source")

    /* renamed from: h */
    private String f29238h;
    @C11258c("sessionId")

    /* renamed from: i */
    private final String f29239i;
    @C11258c("lat")

    /* renamed from: j */
    private final double f29240j;
    @C11258c("lng")

    /* renamed from: k */
    private final double f29241k;
    @C11258c("altitude")

    /* renamed from: l */
    private Double f29242l;
    @C11258c("operatingSystem")

    /* renamed from: m */
    private String f29243m;
    @C11258c("applicationState")

    /* renamed from: n */
    private String f29244n;
    @C11258c("horizontalAccuracy")

    /* renamed from: o */
    private Float f29245o;

    /* renamed from: com.mapbox.android.telemetry.LocationEvent$a */
    static class C11303a implements Creator<LocationEvent> {
        C11303a() {
        }

        public LocationEvent createFromParcel(Parcel parcel) {
            return new LocationEvent(parcel, null);
        }

        public LocationEvent[] newArray(int i) {
            return new LocationEvent[i];
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("Android - ");
        sb.append(VERSION.RELEASE);
        f29235p = sb.toString();
    }

    /* synthetic */ LocationEvent(Parcel parcel, C11303a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.LOCATION;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29236f);
        parcel.writeString(this.f29237g);
        parcel.writeString(this.f29238h);
        parcel.writeString(this.f29239i);
        parcel.writeDouble(this.f29240j);
        parcel.writeDouble(this.f29241k);
        if (this.f29242l == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeDouble(this.f29242l.doubleValue());
        }
        parcel.writeString(this.f29243m);
        parcel.writeString(this.f29244n);
        if (this.f29245o == null) {
            parcel.writeByte(0);
            return;
        }
        parcel.writeByte(1);
        parcel.writeFloat(this.f29245o.floatValue());
    }

    public LocationEvent(String str, double d, double d2, String str2) {
        this.f29242l = null;
        this.f29245o = null;
        this.f29236f = "location";
        this.f29237g = C11330b1.m29167a();
        this.f29238h = "mapbox";
        this.f29239i = str;
        this.f29240j = d;
        this.f29241k = d2;
        this.f29243m = f29235p;
        this.f29244n = str2;
    }

    /* renamed from: a */
    public void mo32848a(Double d) {
        this.f29242l = d;
    }

    /* renamed from: a */
    public void mo32849a(Float f) {
        this.f29245o = f;
    }

    private LocationEvent(Parcel parcel) {
        Float f = null;
        this.f29242l = null;
        this.f29245o = null;
        this.f29236f = parcel.readString();
        this.f29237g = parcel.readString();
        this.f29238h = parcel.readString();
        this.f29239i = parcel.readString();
        this.f29240j = parcel.readDouble();
        this.f29241k = parcel.readDouble();
        this.f29242l = parcel.readByte() == 0 ? null : Double.valueOf(parcel.readDouble());
        this.f29243m = parcel.readString();
        this.f29244n = parcel.readString();
        if (parcel.readByte() != 0) {
            f = Float.valueOf(parcel.readFloat());
        }
        this.f29245o = f;
    }
}
