package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FeedbackEventData implements Parcelable {
    public static final Creator<FeedbackEventData> CREATOR = new C11302a();

    /* renamed from: e */
    private String f29231e;

    /* renamed from: f */
    private String f29232f;

    /* renamed from: g */
    private String f29233g;

    /* renamed from: h */
    private String f29234h;

    /* renamed from: com.mapbox.android.telemetry.FeedbackEventData$a */
    static class C11302a implements Creator<FeedbackEventData> {
        C11302a() {
        }

        public FeedbackEventData createFromParcel(Parcel parcel) {
            return new FeedbackEventData(parcel, null);
        }

        public FeedbackEventData[] newArray(int i) {
            return new FeedbackEventData[i];
        }
    }

    /* synthetic */ FeedbackEventData(Parcel parcel, C11302a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29231e);
        parcel.writeString(this.f29232f);
        parcel.writeString(this.f29233g);
        parcel.writeString(this.f29234h);
    }

    private FeedbackEventData(Parcel parcel) {
        this.f29234h = null;
        this.f29231e = parcel.readString();
        this.f29232f = parcel.readString();
        this.f29233g = parcel.readString();
        this.f29234h = parcel.readString();
    }
}
