package android.support.p001v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new C0070a();

    /* renamed from: e */
    final int f104e;

    /* renamed from: f */
    final long f105f;

    /* renamed from: g */
    final long f106g;

    /* renamed from: h */
    final float f107h;

    /* renamed from: i */
    final long f108i;

    /* renamed from: j */
    final int f109j;

    /* renamed from: k */
    final CharSequence f110k;

    /* renamed from: l */
    final long f111l;

    /* renamed from: m */
    List<CustomAction> f112m;

    /* renamed from: n */
    final long f113n;

    /* renamed from: o */
    final Bundle f114o;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C0069a();

        /* renamed from: e */
        private final String f115e;

        /* renamed from: f */
        private final CharSequence f116f;

        /* renamed from: g */
        private final int f117g;

        /* renamed from: h */
        private final Bundle f118h;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0069a implements Creator<CustomAction> {
            C0069a() {
            }

            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f115e = str;
            this.f116f = charSequence;
            this.f117g = i;
            this.f118h = bundle;
        }

        /* renamed from: a */
        public static CustomAction m153a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new CustomAction(C0075a.m166a(obj), C0075a.m169d(obj), C0075a.m168c(obj), C0075a.m167b(obj));
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.f116f);
            sb.append(", mIcon=");
            sb.append(this.f117g);
            sb.append(", mExtras=");
            sb.append(this.f118h);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f115e);
            TextUtils.writeToParcel(this.f116f, parcel, i);
            parcel.writeInt(this.f117g);
            parcel.writeBundle(this.f118h);
        }

        CustomAction(Parcel parcel) {
            this.f115e = parcel.readString();
            this.f116f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f117g = parcel.readInt();
            this.f118h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0070a implements Creator<PlaybackStateCompat> {
        C0070a() {
        }

        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f104e = i;
        this.f105f = j;
        this.f106g = j2;
        this.f107h = f;
        this.f108i = j3;
        this.f109j = i2;
        this.f110k = charSequence;
        this.f111l = j4;
        this.f112m = new ArrayList(list);
        this.f113n = j5;
        this.f114o = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m152a(Object obj) {
        List list;
        Bundle bundle = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0074b.m160d(obj);
        if (d != null) {
            ArrayList arrayList = new ArrayList(d.size());
            for (Object a : d) {
                arrayList.add(CustomAction.m153a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = C0076c.m170a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0074b.m165i(obj), C0074b.m164h(obj), C0074b.m159c(obj), C0074b.m163g(obj), C0074b.m157a(obj), 0, C0074b.m161e(obj), C0074b.m162f(obj), list, C0074b.m158b(obj), bundle);
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f104e);
        sb.append(", position=");
        sb.append(this.f105f);
        sb.append(", buffered position=");
        sb.append(this.f106g);
        sb.append(", speed=");
        sb.append(this.f107h);
        sb.append(", updated=");
        sb.append(this.f111l);
        sb.append(", actions=");
        sb.append(this.f108i);
        sb.append(", error code=");
        sb.append(this.f109j);
        sb.append(", error message=");
        sb.append(this.f110k);
        sb.append(", custom actions=");
        sb.append(this.f112m);
        sb.append(", active item id=");
        sb.append(this.f113n);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f104e);
        parcel.writeLong(this.f105f);
        parcel.writeFloat(this.f107h);
        parcel.writeLong(this.f111l);
        parcel.writeLong(this.f106g);
        parcel.writeLong(this.f108i);
        TextUtils.writeToParcel(this.f110k, parcel, i);
        parcel.writeTypedList(this.f112m);
        parcel.writeLong(this.f113n);
        parcel.writeBundle(this.f114o);
        parcel.writeInt(this.f109j);
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f104e = parcel.readInt();
        this.f105f = parcel.readLong();
        this.f107h = parcel.readFloat();
        this.f111l = parcel.readLong();
        this.f106g = parcel.readLong();
        this.f108i = parcel.readLong();
        this.f110k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f112m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f113n = parcel.readLong();
        this.f114o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f109j = parcel.readInt();
    }
}
