package com.mapbox.android.telemetry;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

class MapDragendEvent extends Event implements Parcelable {
    public static final Creator<MapDragendEvent> CREATOR = new C11305a();
    @C11258c("event")

    /* renamed from: f */
    private final String f29258f;
    @C11258c("created")

    /* renamed from: g */
    private String f29259g;
    @C11258c("lat")

    /* renamed from: h */
    private double f29260h;
    @C11258c("lng")

    /* renamed from: i */
    private double f29261i;
    @C11258c("zoom")

    /* renamed from: j */
    private double f29262j;
    @C11258c("orientation")

    /* renamed from: k */
    private String f29263k;
    @C11258c("batteryLevel")

    /* renamed from: l */
    private int f29264l;
    @C11258c("pluggedIn")

    /* renamed from: m */
    private Boolean f29265m;
    @C11258c("carrier")

    /* renamed from: n */
    private String f29266n;
    @C11258c("cellularNetworkType")

    /* renamed from: o */
    private String f29267o;
    @C11258c("wifi")

    /* renamed from: p */
    private Boolean f29268p;

    /* renamed from: com.mapbox.android.telemetry.MapDragendEvent$a */
    static class C11305a implements Creator<MapDragendEvent> {
        C11305a() {
        }

        public MapDragendEvent createFromParcel(Parcel parcel) {
            return new MapDragendEvent(parcel, null);
        }

        public MapDragendEvent[] newArray(int i) {
            return new MapDragendEvent[i];
        }
    }

    /* synthetic */ MapDragendEvent(Parcel parcel, C11305a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public MapDragendEvent mo32862a(Context context) {
        this.f29264l = C11330b1.m29176d(context);
        this.f29265m = Boolean.valueOf(C11330b1.m29173b(context));
        this.f29267o = C11330b1.m29178e(context);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo32865b(String str) {
        this.f29263k = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29258f);
        parcel.writeString(this.f29259g);
        parcel.writeDouble(this.f29260h);
        parcel.writeDouble(this.f29261i);
        parcel.writeDouble(this.f29262j);
        parcel.writeString(this.f29263k);
        parcel.writeInt(this.f29264l);
        parcel.writeByte(this.f29265m.booleanValue() ? (byte) 1 : 0);
        parcel.writeString(this.f29266n);
        parcel.writeString(this.f29267o);
        Boolean bool = this.f29268p;
        if (bool == null) {
            parcel.writeByte(2);
        } else {
            parcel.writeByte(bool.booleanValue() ? (byte) 1 : 0);
        }
    }

    MapDragendEvent(C11350h0 h0Var) {
        this.f29263k = null;
        this.f29266n = null;
        this.f29268p = null;
        this.f29258f = "map.dragend";
        this.f29260h = h0Var.mo32993b();
        this.f29261i = h0Var.mo32994c();
        this.f29262j = h0Var.mo32995d();
        this.f29259g = C11330b1.m29167a();
        this.f29264l = 0;
        this.f29265m = Boolean.valueOf(false);
        this.f29267o = "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.MAP_DRAGEND;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32863a(String str) {
        this.f29266n = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32864a(boolean z) {
        this.f29268p = Boolean.valueOf(z);
    }

    private MapDragendEvent(Parcel parcel) {
        Boolean bool = null;
        this.f29263k = null;
        this.f29266n = null;
        this.f29268p = null;
        this.f29258f = parcel.readString();
        this.f29259g = parcel.readString();
        this.f29260h = parcel.readDouble();
        this.f29261i = parcel.readDouble();
        this.f29262j = parcel.readDouble();
        this.f29263k = parcel.readString();
        this.f29264l = parcel.readInt();
        boolean z = true;
        this.f29265m = Boolean.valueOf(parcel.readByte() != 0);
        this.f29266n = parcel.readString();
        this.f29267o = parcel.readString();
        byte readByte = parcel.readByte();
        if (readByte != 2) {
            if (readByte == 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        this.f29268p = bool;
    }
}
