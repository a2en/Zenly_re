package android.support.p001v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener */
    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C0065a();

        /* renamed from: e */
        private final MediaDescriptionCompat f94e;

        /* renamed from: f */
        private final long f95f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0065a implements Creator<QueueItem> {
            C0065a() {
            }

            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f94e = mediaDescriptionCompat;
                this.f95f = j;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m144a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m69a(C0073b.m155a(obj)), C0073b.m156b(obj));
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.f94e);
            sb.append(", Id=");
            sb.append(this.f95f);
            sb.append(" }");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f94e.writeToParcel(parcel, i);
            parcel.writeLong(this.f95f);
        }

        QueueItem(Parcel parcel) {
            this.f94e = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f95f = parcel.readLong();
        }

        /* renamed from: a */
        public static List<QueueItem> m145a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m144a(a));
            }
            return arrayList;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C0066a();

        /* renamed from: e */
        ResultReceiver f96e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0066a implements Creator<ResultReceiverWrapper> {
            C0066a() {
            }

            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f96e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f96e.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C0067a();

        /* renamed from: e */
        private final Object f97e;

        /* renamed from: f */
        private IMediaSession f98f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0067a implements Creator<Token> {
            C0067a() {
            }

            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public static Token m146a(Object obj) {
            return m147a(obj, null);
        }

        /* renamed from: a */
        public void mo230a(Bundle bundle) {
        }

        /* renamed from: b */
        public Object mo232b() {
            return this.f97e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f97e;
            if (obj2 == null) {
                if (token.f97e != null) {
                    z = false;
                }
                return z;
            }
            Object obj3 = token.f97e;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f97e;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f97e, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f97e);
            }
        }

        Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        /* renamed from: a */
        public static Token m147a(Object obj, IMediaSession iMediaSession) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            C0071a.m154a(obj);
            return new Token(obj, iMediaSession);
        }

        Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
            this.f97e = obj;
            this.f98f = iMediaSession;
        }

        /* renamed from: a */
        public IMediaSession mo229a() {
            return this.f98f;
        }

        /* renamed from: a */
        public void mo231a(IMediaSession iMediaSession) {
            this.f98f = iMediaSession;
        }
    }

    /* renamed from: a */
    public static void m143a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
