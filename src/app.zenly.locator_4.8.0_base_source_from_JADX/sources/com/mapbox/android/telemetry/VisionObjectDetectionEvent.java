package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

public class VisionObjectDetectionEvent extends Event implements Parcelable {
    public static final Creator<VisionObjectDetectionEvent> CREATOR = new C11321a();
    @C11258c("event")

    /* renamed from: f */
    private final String f29390f;
    @C11258c("created")

    /* renamed from: g */
    private final String f29391g;
    @C11258c("object_lat")

    /* renamed from: h */
    private Double f29392h;
    @C11258c("object_lon")

    /* renamed from: i */
    private Double f29393i;
    @C11258c("vehicle_lat")

    /* renamed from: j */
    private Double f29394j;
    @C11258c("vehicle_lon")

    /* renamed from: k */
    private Double f29395k;
    @C11258c("class")

    /* renamed from: l */
    private String f29396l;
    @C11258c("sign_value")

    /* renamed from: m */
    private String f29397m;
    @C11258c("object_size_width")

    /* renamed from: n */
    private Double f29398n;
    @C11258c("object_size_height")

    /* renamed from: o */
    private Double f29399o;
    @C11258c("object_pos_height")

    /* renamed from: p */
    private Double f29400p;
    @C11258c("distance_from_camera")

    /* renamed from: q */
    private Double f29401q;

    /* renamed from: com.mapbox.android.telemetry.VisionObjectDetectionEvent$a */
    static class C11321a implements Creator<VisionObjectDetectionEvent> {
        C11321a() {
        }

        public VisionObjectDetectionEvent createFromParcel(Parcel parcel) {
            return new VisionObjectDetectionEvent(parcel, null);
        }

        public VisionObjectDetectionEvent[] newArray(int i) {
            return new VisionObjectDetectionEvent[i];
        }
    }

    /* synthetic */ VisionObjectDetectionEvent(Parcel parcel, C11321a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    private static String m29158b(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return null;
        }
        return parcel.readString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.VIS_OBJ_DETECTION;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29390f);
        parcel.writeString(this.f29391g);
        m29156a(parcel, this.f29392h);
        m29156a(parcel, this.f29393i);
        m29156a(parcel, this.f29394j);
        m29156a(parcel, this.f29395k);
        m29157a(parcel, this.f29396l);
        m29157a(parcel, this.f29397m);
        m29156a(parcel, this.f29398n);
        m29156a(parcel, this.f29399o);
        m29156a(parcel, this.f29400p);
        m29156a(parcel, this.f29401q);
    }

    private VisionObjectDetectionEvent(Parcel parcel) {
        this.f29390f = parcel.readString();
        this.f29391g = parcel.readString();
        this.f29392h = m29155a(parcel);
        this.f29393i = m29155a(parcel);
        this.f29394j = m29155a(parcel);
        this.f29395k = m29155a(parcel);
        this.f29396l = m29158b(parcel);
        this.f29397m = m29158b(parcel);
        this.f29398n = m29155a(parcel);
        this.f29399o = m29155a(parcel);
        this.f29400p = m29155a(parcel);
        this.f29401q = m29155a(parcel);
    }

    /* renamed from: a */
    private static void m29156a(Parcel parcel, Double d) {
        parcel.writeByte((byte) (d != null ? 1 : 0));
        if (d != null) {
            parcel.writeDouble(d.doubleValue());
        }
    }

    /* renamed from: a */
    private static void m29157a(Parcel parcel, String str) {
        parcel.writeByte((byte) (str != null ? 1 : 0));
        if (str != null) {
            parcel.writeString(str);
        }
    }

    /* renamed from: a */
    private static Double m29155a(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return null;
        }
        return Double.valueOf(parcel.readDouble());
    }
}
