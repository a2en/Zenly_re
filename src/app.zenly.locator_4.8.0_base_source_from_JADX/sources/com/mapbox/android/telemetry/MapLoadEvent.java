package com.mapbox.android.telemetry;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

class MapLoadEvent extends Event implements Parcelable {
    public static final Creator<MapLoadEvent> CREATOR = new C11306a();

    /* renamed from: u */
    private static final String f29269u;
    @C11258c("event")

    /* renamed from: f */
    private final String f29270f;
    @C11258c("created")

    /* renamed from: g */
    private String f29271g;
    @C11258c("userId")

    /* renamed from: h */
    private String f29272h;
    @C11258c("model")

    /* renamed from: i */
    private String f29273i;
    @C11258c("operatingSystem")

    /* renamed from: j */
    private String f29274j;
    @C11258c("resolution")

    /* renamed from: k */
    private Float f29275k;
    @C11258c("accessibilityFontScale")

    /* renamed from: l */
    private Float f29276l;
    @C11258c("orientation")

    /* renamed from: m */
    private String f29277m;
    @C11258c("batteryLevel")

    /* renamed from: n */
    private Integer f29278n;
    @C11258c("pluggedIn")

    /* renamed from: o */
    private Boolean f29279o;
    @C11258c("carrier")

    /* renamed from: p */
    private String f29280p;
    @C11258c("cellularNetworkType")

    /* renamed from: q */
    private String f29281q;
    @C11258c("wifi")

    /* renamed from: r */
    private Boolean f29282r;
    @C11258c("sdkIdentifier")

    /* renamed from: s */
    private String f29283s;
    @C11258c("sdkVersion")

    /* renamed from: t */
    private String f29284t;

    /* renamed from: com.mapbox.android.telemetry.MapLoadEvent$a */
    static class C11306a implements Creator<MapLoadEvent> {
        C11306a() {
        }

        public MapLoadEvent createFromParcel(Parcel parcel) {
            return new MapLoadEvent(parcel, null);
        }

        public MapLoadEvent[] newArray(int i) {
            return new MapLoadEvent[i];
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("Android - ");
        sb.append(VERSION.RELEASE);
        f29269u = sb.toString();
    }

    /* synthetic */ MapLoadEvent(Parcel parcel, C11306a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public MapLoadEvent mo32870a(Context context) {
        this.f29278n = Integer.valueOf(C11330b1.m29176d(context));
        this.f29279o = Boolean.valueOf(C11330b1.m29173b(context));
        this.f29281q = C11330b1.m29178e(context);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo32874b(float f) {
        this.f29275k = Float.valueOf(f);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29270f);
        parcel.writeString(this.f29271g);
        parcel.writeString(this.f29272h);
        parcel.writeString(this.f29273i);
        parcel.writeString(this.f29274j);
        if (this.f29275k == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeFloat(this.f29275k.floatValue());
        }
        if (this.f29276l == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeFloat(this.f29276l.floatValue());
        }
        parcel.writeString(this.f29277m);
        parcel.writeInt(this.f29278n.intValue());
        parcel.writeByte(this.f29279o.booleanValue() ? (byte) 1 : 0);
        parcel.writeString(this.f29280p);
        parcel.writeString(this.f29281q);
        Boolean bool = this.f29282r;
        if (bool == null) {
            parcel.writeByte(2);
        } else {
            parcel.writeByte(bool.booleanValue() ? (byte) 1 : 0);
        }
        parcel.writeString(this.f29283s);
        parcel.writeString(this.f29284t);
    }

    MapLoadEvent(String str) {
        this.f29273i = null;
        this.f29274j = null;
        this.f29275k = null;
        this.f29276l = null;
        this.f29277m = null;
        this.f29280p = null;
        this.f29282r = null;
        this.f29283s = null;
        this.f29284t = null;
        this.f29270f = "map.load";
        this.f29273i = Build.MODEL;
        this.f29274j = f29269u;
        this.f29271g = C11330b1.m29167a();
        this.f29272h = str;
        this.f29278n = Integer.valueOf(0);
        this.f29279o = Boolean.valueOf(false);
        this.f29281q = "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo32875b(String str) {
        this.f29277m = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.MAP_LOAD;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32871a(float f) {
        this.f29276l = Float.valueOf(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32872a(String str) {
        this.f29280p = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32873a(boolean z) {
        this.f29282r = Boolean.valueOf(z);
    }

    private MapLoadEvent(Parcel parcel) {
        Boolean bool = null;
        this.f29273i = null;
        this.f29274j = null;
        this.f29275k = null;
        this.f29276l = null;
        this.f29277m = null;
        this.f29280p = null;
        this.f29282r = null;
        this.f29283s = null;
        this.f29284t = null;
        this.f29270f = parcel.readString();
        this.f29271g = parcel.readString();
        this.f29272h = parcel.readString();
        this.f29273i = parcel.readString();
        this.f29274j = parcel.readString();
        this.f29275k = parcel.readByte() == 0 ? null : Float.valueOf(parcel.readFloat());
        this.f29276l = parcel.readByte() == 0 ? null : Float.valueOf(parcel.readFloat());
        this.f29277m = parcel.readString();
        this.f29278n = Integer.valueOf(parcel.readInt());
        boolean z = true;
        this.f29279o = Boolean.valueOf(parcel.readByte() != 0);
        this.f29280p = parcel.readString();
        this.f29281q = parcel.readString();
        byte readByte = parcel.readByte();
        if (readByte != 2) {
            if (readByte == 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        this.f29282r = bool;
        this.f29283s = parcel.readString();
        this.f29284t = parcel.readString();
    }
}
