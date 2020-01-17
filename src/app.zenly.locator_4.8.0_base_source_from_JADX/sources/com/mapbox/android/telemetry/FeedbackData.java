package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FeedbackData implements Parcelable {
    public static final Creator<FeedbackData> CREATOR = new C11301a();

    /* renamed from: e */
    private String f29229e;

    /* renamed from: f */
    private String f29230f;

    /* renamed from: com.mapbox.android.telemetry.FeedbackData$a */
    static class C11301a implements Creator<FeedbackData> {
        C11301a() {
        }

        public FeedbackData createFromParcel(Parcel parcel) {
            return new FeedbackData(parcel, null);
        }

        public FeedbackData[] newArray(int i) {
            return new FeedbackData[i];
        }
    }

    /* synthetic */ FeedbackData(Parcel parcel, C11301a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29229e);
        parcel.writeString(this.f29230f);
    }

    public FeedbackData() {
        this.f29230f = null;
        this.f29229e = C11330b1.m29171b();
    }

    private FeedbackData(Parcel parcel) {
        this.f29230f = null;
        this.f29229e = parcel.readString();
        this.f29230f = parcel.readString();
    }
}
