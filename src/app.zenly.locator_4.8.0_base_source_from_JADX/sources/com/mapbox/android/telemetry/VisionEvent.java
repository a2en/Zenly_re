package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;
import java.util.HashMap;

public class VisionEvent extends Event implements Parcelable {
    public static final Creator<VisionEvent> CREATOR = new C11320a();
    @C11258c("event")

    /* renamed from: f */
    private final String f29387f;
    @C11258c("name")

    /* renamed from: g */
    private String f29388g;
    @C11258c("contents")

    /* renamed from: h */
    private HashMap<String, Object> f29389h;

    /* renamed from: com.mapbox.android.telemetry.VisionEvent$a */
    static class C11320a implements Creator<VisionEvent> {
        C11320a() {
        }

        public VisionEvent createFromParcel(Parcel parcel) {
            return new VisionEvent(parcel, null);
        }

        public VisionEvent[] newArray(int i) {
            return new VisionEvent[i];
        }
    }

    /* synthetic */ VisionEvent(Parcel parcel, C11320a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.VIS_GENERAL;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29387f);
        parcel.writeString(this.f29388g);
        parcel.writeSerializable(this.f29389h);
    }

    VisionEvent() {
        this.f29388g = "";
        this.f29389h = new HashMap<>();
        this.f29387f = "vision.general";
    }

    private VisionEvent(Parcel parcel) {
        this.f29388g = "";
        this.f29389h = new HashMap<>();
        this.f29387f = parcel.readString();
        this.f29388g = parcel.readString();
        this.f29389h = (HashMap) parcel.readSerializable();
    }
}
