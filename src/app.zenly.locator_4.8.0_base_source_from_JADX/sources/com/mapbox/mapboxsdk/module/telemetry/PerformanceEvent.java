package com.mapbox.mapboxsdk.module.telemetry;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.mapbox.android.telemetry.Event;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PerformanceEvent extends Event {
    public static final Creator<PerformanceEvent> CREATOR = new C11575a();

    /* renamed from: j */
    private static final SimpleDateFormat f30030j = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: f */
    private final String f30031f;

    /* renamed from: g */
    private final String f30032g;

    /* renamed from: h */
    private final String f30033h;

    /* renamed from: i */
    private final Bundle f30034i;

    /* renamed from: com.mapbox.mapboxsdk.module.telemetry.PerformanceEvent$a */
    static class C11575a implements Creator<PerformanceEvent> {
        C11575a() {
        }

        public PerformanceEvent createFromParcel(Parcel parcel) {
            return new PerformanceEvent(parcel, (C11575a) null);
        }

        public PerformanceEvent[] newArray(int i) {
            return new PerformanceEvent[i];
        }
    }

    /* synthetic */ PerformanceEvent(Parcel parcel, C11575a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30031f);
        parcel.writeString(this.f30032g);
        parcel.writeString(this.f30033h);
        parcel.writeBundle(this.f30034i);
    }

    PerformanceEvent(String str, Bundle bundle) {
        this.f30031f = "performance.trace";
        this.f30032g = f30030j.format(new Date());
        this.f30033h = str;
        this.f30034i = bundle;
    }

    private PerformanceEvent(Parcel parcel) {
        this.f30031f = parcel.readString();
        this.f30032g = parcel.readString();
        this.f30033h = parcel.readString();
        this.f30034i = parcel.readBundle();
    }
}
