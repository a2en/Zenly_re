package com.mapbox.android.telemetry;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

class MapClickEvent extends Event implements Parcelable {
    public static final Creator<MapClickEvent> CREATOR = new C11304a();
    @C11258c("event")

    /* renamed from: f */
    private final String f29246f;
    @C11258c("created")

    /* renamed from: g */
    private String f29247g;
    @C11258c("gesture")

    /* renamed from: h */
    private final String f29248h;
    @C11258c("lat")

    /* renamed from: i */
    private double f29249i;
    @C11258c("lng")

    /* renamed from: j */
    private double f29250j;
    @C11258c("zoom")

    /* renamed from: k */
    private double f29251k;
    @C11258c("orientation")

    /* renamed from: l */
    private String f29252l;
    @C11258c("batteryLevel")

    /* renamed from: m */
    private Integer f29253m;
    @C11258c("pluggedIn")

    /* renamed from: n */
    private Boolean f29254n;
    @C11258c("carrier")

    /* renamed from: o */
    private String f29255o;
    @C11258c("cellularNetworkType")

    /* renamed from: p */
    private String f29256p;
    @C11258c("wifi")

    /* renamed from: q */
    private Boolean f29257q;

    /* renamed from: com.mapbox.android.telemetry.MapClickEvent$a */
    static class C11304a implements Creator<MapClickEvent> {
        C11304a() {
        }

        public MapClickEvent createFromParcel(Parcel parcel) {
            return new MapClickEvent(parcel, null);
        }

        public MapClickEvent[] newArray(int i) {
            return new MapClickEvent[i];
        }
    }

    /* synthetic */ MapClickEvent(Parcel parcel, C11304a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public MapClickEvent mo32854a(Context context) {
        this.f29253m = Integer.valueOf(C11330b1.m29176d(context));
        this.f29254n = Boolean.valueOf(C11330b1.m29173b(context));
        this.f29256p = C11330b1.m29178e(context);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo32857b(String str) {
        this.f29252l = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29246f);
        parcel.writeString(this.f29247g);
        parcel.writeString(this.f29248h);
        parcel.writeDouble(this.f29249i);
        parcel.writeDouble(this.f29250j);
        parcel.writeDouble(this.f29251k);
        parcel.writeString(this.f29252l);
        parcel.writeInt(this.f29253m.intValue());
        parcel.writeByte(this.f29254n.booleanValue() ? (byte) 1 : 0);
        parcel.writeString(this.f29255o);
        parcel.writeString(this.f29256p);
        Boolean bool = this.f29257q;
        if (bool == null) {
            parcel.writeByte(2);
        } else {
            parcel.writeByte(bool.booleanValue() ? (byte) 1 : 0);
        }
    }

    MapClickEvent(C11350h0 h0Var) {
        this.f29252l = null;
        this.f29255o = null;
        this.f29257q = null;
        this.f29246f = "map.click";
        this.f29248h = h0Var.mo32991a();
        this.f29249i = h0Var.mo32993b();
        this.f29250j = h0Var.mo32994c();
        this.f29251k = h0Var.mo32995d();
        this.f29247g = C11330b1.m29167a();
        this.f29253m = Integer.valueOf(0);
        this.f29254n = Boolean.valueOf(false);
        this.f29256p = "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.MAP_CLICK;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32855a(String str) {
        this.f29255o = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32856a(boolean z) {
        this.f29257q = Boolean.valueOf(z);
    }

    private MapClickEvent(Parcel parcel) {
        Boolean bool = null;
        this.f29252l = null;
        this.f29255o = null;
        this.f29257q = null;
        this.f29246f = parcel.readString();
        this.f29247g = parcel.readString();
        this.f29248h = parcel.readString();
        this.f29249i = parcel.readDouble();
        this.f29250j = parcel.readDouble();
        this.f29251k = parcel.readDouble();
        this.f29252l = parcel.readString();
        this.f29253m = Integer.valueOf(parcel.readInt());
        boolean z = true;
        this.f29254n = Boolean.valueOf(parcel.readByte() != 0);
        this.f29255o = parcel.readString();
        this.f29256p = parcel.readString();
        byte readByte = parcel.readByte();
        if (readByte != 2) {
            if (readByte == 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        this.f29257q = bool;
    }
}
