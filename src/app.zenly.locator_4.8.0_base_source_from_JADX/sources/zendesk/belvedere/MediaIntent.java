package zendesk.belvedere;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.util.C0603e;
import androidx.fragment.app.Fragment;

public class MediaIntent implements Parcelable {
    public static final Creator<MediaIntent> CREATOR = new C13482a();

    /* renamed from: e */
    private final boolean f34963e;

    /* renamed from: f */
    private final int f34964f;

    /* renamed from: g */
    private final Intent f34965g;

    /* renamed from: h */
    private final String f34966h;

    /* renamed from: i */
    private final int f34967i;

    /* renamed from: zendesk.belvedere.MediaIntent$a */
    static class C13482a implements Creator<MediaIntent> {
        C13482a() {
        }

        public MediaIntent createFromParcel(Parcel parcel) {
            return new MediaIntent(parcel);
        }

        public MediaIntent[] newArray(int i) {
            return new MediaIntent[i];
        }
    }

    /* renamed from: zendesk.belvedere.MediaIntent$b */
    public static class C13483b {

        /* renamed from: a */
        private final C13520k f34968a;

        /* renamed from: b */
        private final C13519j f34969b;

        /* renamed from: c */
        private final int f34970c;

        C13483b(int i, C13520k kVar, C13519j jVar) {
            this.f34970c = i;
            this.f34968a = kVar;
            this.f34969b = jVar;
        }

        /* renamed from: a */
        public MediaIntent mo38835a() {
            C0603e a = this.f34968a.mo38896a(this.f34970c);
            MediaIntent mediaIntent = (MediaIntent) a.f2729a;
            MediaResult mediaResult = (MediaResult) a.f2730b;
            if (mediaIntent.mo38830d()) {
                this.f34969b.mo38894a(this.f34970c, mediaResult);
            }
            return mediaIntent;
        }
    }

    /* renamed from: zendesk.belvedere.MediaIntent$c */
    public static class C13484c {

        /* renamed from: a */
        private final C13520k f34971a;

        /* renamed from: b */
        private final int f34972b;

        /* renamed from: c */
        String f34973c = "*/*";

        /* renamed from: d */
        boolean f34974d = false;

        C13484c(int i, C13520k kVar) {
            this.f34971a = kVar;
            this.f34972b = i;
        }

        /* renamed from: a */
        public MediaIntent mo38838a() {
            return this.f34971a.mo38897a(this.f34972b, this.f34973c, this.f34974d);
        }

        /* renamed from: a */
        public C13484c mo38836a(String str) {
            this.f34973c = str;
            return this;
        }

        /* renamed from: a */
        public C13484c mo38837a(boolean z) {
            this.f34974d = z;
            return this;
        }
    }

    MediaIntent(int i, Intent intent, String str, boolean z, int i2) {
        this.f34964f = i;
        this.f34965g = intent;
        this.f34966h = str;
        this.f34963e = z;
        this.f34967i = i2;
    }

    /* renamed from: e */
    static MediaIntent m35705e() {
        MediaIntent mediaIntent = new MediaIntent(-1, null, null, false, -1);
        return mediaIntent;
    }

    /* renamed from: a */
    public void mo38827a(Fragment fragment) {
        fragment.startActivityForResult(this.f34965g, this.f34964f);
    }

    /* renamed from: b */
    public String mo38828b() {
        return this.f34966h;
    }

    /* renamed from: c */
    public int mo38829c() {
        return this.f34967i;
    }

    /* renamed from: d */
    public boolean mo38830d() {
        return this.f34963e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34964f);
        parcel.writeParcelable(this.f34965g, i);
        parcel.writeString(this.f34966h);
        parcel.writeBooleanArray(new boolean[]{this.f34963e});
        parcel.writeInt(this.f34967i);
    }

    /* renamed from: a */
    public Intent mo38826a() {
        return this.f34965g;
    }

    MediaIntent(Parcel parcel) {
        this.f34964f = parcel.readInt();
        this.f34965g = (Intent) parcel.readParcelable(MediaIntent.class.getClassLoader());
        this.f34966h = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f34963e = zArr[0];
        this.f34967i = parcel.readInt();
    }
}
