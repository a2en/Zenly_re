package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

public class OfflineDownloadStartEvent extends Event implements Parcelable {
    public static final Creator<OfflineDownloadStartEvent> CREATOR = new C11319a();
    @C11258c("event")

    /* renamed from: f */
    private final String f29381f;
    @C11258c("created")

    /* renamed from: g */
    private final String f29382g;
    @C11258c("minZoom")

    /* renamed from: h */
    private final Double f29383h;
    @C11258c("maxZoom")

    /* renamed from: i */
    private final Double f29384i;
    @C11258c("shapeForOfflineRegion")

    /* renamed from: j */
    private final String f29385j;
    @C11258c("styleURL")

    /* renamed from: k */
    private String f29386k;

    /* renamed from: com.mapbox.android.telemetry.OfflineDownloadStartEvent$a */
    static class C11319a implements Creator<OfflineDownloadStartEvent> {
        C11319a() {
        }

        public OfflineDownloadStartEvent createFromParcel(Parcel parcel) {
            return new OfflineDownloadStartEvent(parcel, null);
        }

        public OfflineDownloadStartEvent[] newArray(int i) {
            return new OfflineDownloadStartEvent[i];
        }
    }

    /* synthetic */ OfflineDownloadStartEvent(Parcel parcel, C11319a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public void mo32951a(String str) {
        this.f29386k = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29381f);
        parcel.writeString(this.f29382g);
        parcel.writeString(this.f29385j);
        parcel.writeDouble(this.f29383h.doubleValue());
        parcel.writeDouble(this.f29384i.doubleValue());
        parcel.writeString(this.f29386k);
    }

    OfflineDownloadStartEvent(String str, Double d, Double d2) {
        this.f29381f = "map.offlineDownload.start";
        this.f29382g = C11330b1.m29167a();
        this.f29385j = str;
        this.f29383h = d;
        this.f29384i = d2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.OFFLINE_DOWNLOAD_START;
    }

    private OfflineDownloadStartEvent(Parcel parcel) {
        this.f29381f = parcel.readString();
        this.f29382g = parcel.readString();
        this.f29385j = parcel.readString();
        this.f29383h = Double.valueOf(parcel.readDouble());
        this.f29384i = Double.valueOf(parcel.readDouble());
        this.f29386k = parcel.readString();
    }
}
