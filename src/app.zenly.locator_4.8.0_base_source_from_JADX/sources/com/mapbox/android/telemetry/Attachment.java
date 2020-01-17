package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;
import java.util.ArrayList;
import java.util.List;

public class Attachment extends Event implements Parcelable {
    public static final Creator<Attachment> CREATOR = new C11299a();
    @C11258c("event")

    /* renamed from: f */
    private final String f29208f;
    @C11258c("files")

    /* renamed from: g */
    private List<C11412z> f29209g;

    /* renamed from: com.mapbox.android.telemetry.Attachment$a */
    static class C11299a implements Creator<Attachment> {
        C11299a() {
        }

        public Attachment createFromParcel(Parcel parcel) {
            return new Attachment(parcel);
        }

        public Attachment[] newArray(int i) {
            return new Attachment[i];
        }
    }

    Attachment() {
        this.f29208f = "vis.attachment";
        this.f29209g = new ArrayList();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.VIS_ATTACHMENT;
    }

    /* renamed from: b */
    public List<C11412z> mo32833b() {
        return this.f29209g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29208f);
    }

    protected Attachment(Parcel parcel) {
        this.f29208f = parcel.readString();
    }
}
