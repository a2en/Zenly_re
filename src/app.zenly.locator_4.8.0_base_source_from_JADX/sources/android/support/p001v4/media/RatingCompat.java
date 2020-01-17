package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C0035a();

    /* renamed from: e */
    private final int f76e;

    /* renamed from: f */
    private final float f77f;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0035a implements Creator<RatingCompat> {
        C0035a() {
        }

        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f76e = i;
        this.f77f = f;
    }

    public int describeContents() {
        return this.f76e;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f76e);
        sb.append(" rating=");
        float f = this.f77f;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f76e);
        parcel.writeFloat(this.f77f);
    }
}
