package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11258c;
import com.mapbox.android.telemetry.Event.C11300a;

public class OfflineDownloadEndEvent extends Event implements Parcelable {
    public static final Creator<OfflineDownloadEndEvent> CREATOR = new C11318a();
    @C11258c("event")

    /* renamed from: f */
    private final String f29372f;
    @C11258c("created")

    /* renamed from: g */
    private final String f29373g;
    @C11258c("minZoom")

    /* renamed from: h */
    private final Double f29374h;
    @C11258c("maxZoom")

    /* renamed from: i */
    private final Double f29375i;
    @C11258c("shapeForOfflineRegion")

    /* renamed from: j */
    private final String f29376j;
    @C11258c("styleURL")

    /* renamed from: k */
    private String f29377k;
    @C11258c("sizeOfResourcesCompleted")

    /* renamed from: l */
    private Long f29378l;
    @C11258c("numberOfTilesCompleted")

    /* renamed from: m */
    private Long f29379m;
    @C11258c("state")

    /* renamed from: n */
    private String f29380n;

    /* renamed from: com.mapbox.android.telemetry.OfflineDownloadEndEvent$a */
    static class C11318a implements Creator<OfflineDownloadEndEvent> {
        C11318a() {
        }

        public OfflineDownloadEndEvent createFromParcel(Parcel parcel) {
            return new OfflineDownloadEndEvent(parcel, null);
        }

        public OfflineDownloadEndEvent[] newArray(int i) {
            return new OfflineDownloadEndEvent[i];
        }
    }

    /* synthetic */ OfflineDownloadEndEvent(Parcel parcel, C11318a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.OFFLINE_DOWNLOAD_COMPLETE;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29372f);
        parcel.writeString(this.f29373g);
        parcel.writeString(this.f29376j);
        parcel.writeDouble(this.f29374h.doubleValue());
        parcel.writeDouble(this.f29375i.doubleValue());
        parcel.writeString(this.f29377k);
        parcel.writeLong(this.f29378l.longValue());
        parcel.writeLong(this.f29379m.longValue());
        parcel.writeString(this.f29380n);
    }

    private OfflineDownloadEndEvent(Parcel parcel) {
        this.f29372f = parcel.readString();
        this.f29373g = parcel.readString();
        this.f29376j = parcel.readString();
        this.f29374h = Double.valueOf(parcel.readDouble());
        this.f29375i = Double.valueOf(parcel.readDouble());
        this.f29377k = parcel.readString();
        this.f29378l = Long.valueOf(parcel.readLong());
        this.f29379m = Long.valueOf(parcel.readLong());
        this.f29380n = parcel.readString();
    }
}
