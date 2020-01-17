package android.support.p001v4.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p001v4.media.session.MediaSessionCompat;
import p214e.p228e.C7571a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new C0034a();

    /* renamed from: g */
    static final C7571a<String, Integer> f73g = new C7571a<>();

    /* renamed from: e */
    final Bundle f74e;

    /* renamed from: f */
    private Object f75f;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    static class C0034a implements Creator<MediaMetadataCompat> {
        C0034a() {
        }

        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C7571a<String, Integer> aVar = f73g;
        Integer valueOf = Integer.valueOf(1);
        aVar.put("android.media.metadata.TITLE", valueOf);
        f73g.put("android.media.metadata.ARTIST", valueOf);
        C7571a<String, Integer> aVar2 = f73g;
        Integer valueOf2 = Integer.valueOf(0);
        aVar2.put("android.media.metadata.DURATION", valueOf2);
        f73g.put("android.media.metadata.ALBUM", valueOf);
        f73g.put("android.media.metadata.AUTHOR", valueOf);
        f73g.put("android.media.metadata.WRITER", valueOf);
        f73g.put("android.media.metadata.COMPOSER", valueOf);
        f73g.put("android.media.metadata.COMPILATION", valueOf);
        f73g.put("android.media.metadata.DATE", valueOf);
        f73g.put("android.media.metadata.YEAR", valueOf2);
        f73g.put("android.media.metadata.GENRE", valueOf);
        f73g.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        f73g.put("android.media.metadata.NUM_TRACKS", valueOf2);
        f73g.put("android.media.metadata.DISC_NUMBER", valueOf2);
        f73g.put("android.media.metadata.ALBUM_ARTIST", valueOf);
        C7571a<String, Integer> aVar3 = f73g;
        Integer valueOf3 = Integer.valueOf(2);
        String str = "android.media.metadata.ART";
        aVar3.put(str, valueOf3);
        String str2 = "android.media.metadata.ART_URI";
        f73g.put(str2, valueOf);
        String str3 = "android.media.metadata.ALBUM_ART";
        f73g.put(str3, valueOf3);
        String str4 = "android.media.metadata.ALBUM_ART_URI";
        f73g.put(str4, valueOf);
        C7571a<String, Integer> aVar4 = f73g;
        Integer valueOf4 = Integer.valueOf(3);
        aVar4.put("android.media.metadata.USER_RATING", valueOf4);
        f73g.put("android.media.metadata.RATING", valueOf4);
        f73g.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        f73g.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        f73g.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        String str5 = "android.media.metadata.DISPLAY_ICON";
        f73g.put(str5, valueOf3);
        String str6 = "android.media.metadata.DISPLAY_ICON_URI";
        f73g.put(str6, valueOf);
        f73g.put("android.media.metadata.MEDIA_ID", valueOf);
        f73g.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        f73g.put("android.media.metadata.MEDIA_URI", valueOf);
        f73g.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        f73g.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
        new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        new String[]{str5, str, str3};
        new String[]{str6, str2, str4};
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f74e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m81a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0049e.m118a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f75f = obj;
        return mediaMetadataCompat;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f74e);
    }
}
