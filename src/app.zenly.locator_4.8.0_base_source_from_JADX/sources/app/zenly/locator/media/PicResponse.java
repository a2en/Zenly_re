package app.zenly.locator.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;

@Keep
public class PicResponse implements Parcelable {
    public static final Creator<PicResponse> CREATOR = new C4412a();
    public String author;
    public String imageUrl;
    public double lat;
    public double lon;
    public Metadata metadata;
    public boolean replied;
    public boolean seen;
    public long timestamp;

    @Keep
    public static class Metadata {
        public Text counter = new Text();
        public Text geo = new Text();
        public Text temp = new Text();
        public Text time = new Text();
        public Weather weather = new Weather();
    }

    @Keep
    public static class Text {
        public String text;
        public String textConfig;
    }

    @Keep
    public static class Weather {
        public int type;
    }

    /* renamed from: app.zenly.locator.media.PicResponse$a */
    static class C4412a implements Creator<PicResponse> {
        C4412a() {
        }

        public PicResponse createFromParcel(Parcel parcel) {
            return new PicResponse(parcel, null);
        }

        public PicResponse[] newArray(int i) {
            return new PicResponse[i];
        }
    }

    /* synthetic */ PicResponse(Parcel parcel, C4412a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.author);
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.metadata.geo.text);
        parcel.writeString(this.metadata.geo.textConfig);
        parcel.writeString(this.metadata.time.text);
        parcel.writeString(this.metadata.time.textConfig);
        parcel.writeString(this.metadata.temp.text);
        parcel.writeString(this.metadata.temp.textConfig);
        parcel.writeString(this.metadata.counter.text);
        parcel.writeString(this.metadata.counter.textConfig);
        parcel.writeInt(this.metadata.weather.type);
    }

    public PicResponse() {
        this.metadata = new Metadata();
    }

    private PicResponse(Parcel parcel) {
        this.metadata = new Metadata();
        this.author = parcel.readString();
        this.timestamp = parcel.readLong();
        this.imageUrl = parcel.readString();
        this.metadata.geo.text = parcel.readString();
        this.metadata.geo.textConfig = parcel.readString();
        this.metadata.time.text = parcel.readString();
        this.metadata.time.textConfig = parcel.readString();
        this.metadata.temp.text = parcel.readString();
        this.metadata.temp.textConfig = parcel.readString();
        this.metadata.counter.text = parcel.readString();
        this.metadata.counter.textConfig = parcel.readString();
        this.metadata.weather.type = parcel.readInt();
    }
}
