package zendesk.belvedere;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.File;

public class MediaResult implements Parcelable, Comparable<MediaResult> {
    public static final Creator<MediaResult> CREATOR = new C13485a();

    /* renamed from: e */
    private final File f34975e;

    /* renamed from: f */
    private final Uri f34976f;

    /* renamed from: g */
    private final Uri f34977g;

    /* renamed from: h */
    private final String f34978h;

    /* renamed from: i */
    private final String f34979i;

    /* renamed from: j */
    private final long f34980j;

    /* renamed from: k */
    private final long f34981k;

    /* renamed from: l */
    private final long f34982l;

    /* renamed from: zendesk.belvedere.MediaResult$a */
    static class C13485a implements Creator<MediaResult> {
        C13485a() {
        }

        public MediaResult createFromParcel(Parcel parcel) {
            return new MediaResult(parcel, null);
        }

        public MediaResult[] newArray(int i) {
            return new MediaResult[i];
        }
    }

    /* synthetic */ MediaResult(Parcel parcel, C13485a aVar) {
        this(parcel);
    }

    /* renamed from: i */
    static MediaResult m35715i() {
        MediaResult mediaResult = new MediaResult(null, null, null, null, null, -1, -1, -1);
        return mediaResult;
    }

    /* renamed from: a */
    public File mo38840a() {
        return this.f34975e;
    }

    /* renamed from: b */
    public long mo38841b() {
        return this.f34982l;
    }

    /* renamed from: c */
    public String mo38842c() {
        return this.f34979i;
    }

    /* renamed from: d */
    public String mo38844d() {
        return this.f34978h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Uri mo38846e() {
        return this.f34977g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaResult.class == obj.getClass()) {
            MediaResult mediaResult = (MediaResult) obj;
            if (this.f34980j == mediaResult.f34980j && this.f34981k == mediaResult.f34981k && this.f34982l == mediaResult.f34982l) {
                File file = this.f34975e;
                if (file == null ? mediaResult.f34975e != null : !file.equals(mediaResult.f34975e)) {
                    return false;
                }
                Uri uri = this.f34976f;
                if (uri == null ? mediaResult.f34976f != null : !uri.equals(mediaResult.f34976f)) {
                    return false;
                }
                Uri uri2 = this.f34977g;
                if (uri2 == null ? mediaResult.f34977g != null : !uri2.equals(mediaResult.f34977g)) {
                    return false;
                }
                String str = this.f34978h;
                if (str == null ? mediaResult.f34978h != null : !str.equals(mediaResult.f34978h)) {
                    return false;
                }
                String str2 = this.f34979i;
                String str3 = mediaResult.f34979i;
                if (str2 != null) {
                    z = str2.equals(str3);
                } else if (str3 != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo38848f() {
        return this.f34980j;
    }

    /* renamed from: g */
    public Uri mo38849g() {
        return this.f34976f;
    }

    /* renamed from: h */
    public long mo38850h() {
        return this.f34981k;
    }

    public int hashCode() {
        File file = this.f34975e;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        Uri uri = this.f34976f;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Uri uri2 = this.f34977g;
        int hashCode3 = (hashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        String str = this.f34978h;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34979i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        long j = this.f34980j;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f34981k;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f34982l;
        return i4 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f34975e);
        parcel.writeParcelable(this.f34976f, i);
        parcel.writeString(this.f34978h);
        parcel.writeString(this.f34979i);
        parcel.writeParcelable(this.f34977g, i);
        parcel.writeLong(this.f34980j);
        parcel.writeLong(this.f34981k);
        parcel.writeLong(this.f34982l);
    }

    public MediaResult(File file, Uri uri, Uri uri2, String str, String str2, long j, long j2, long j3) {
        this.f34975e = file;
        this.f34976f = uri;
        this.f34977g = uri2;
        this.f34979i = str2;
        this.f34978h = str;
        this.f34980j = j;
        this.f34981k = j2;
        this.f34982l = j3;
    }

    /* renamed from: a */
    public int compareTo(MediaResult mediaResult) {
        return this.f34977g.compareTo(mediaResult.mo38846e());
    }

    private MediaResult(Parcel parcel) {
        this.f34975e = (File) parcel.readSerializable();
        this.f34976f = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.f34978h = parcel.readString();
        this.f34979i = parcel.readString();
        this.f34977g = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.f34980j = parcel.readLong();
        this.f34981k = parcel.readLong();
        this.f34982l = parcel.readLong();
    }
}
