package android.support.p001v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p001v4.media.session.IMediaSession;
import android.support.p001v4.media.session.IMediaSession.C0051a;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.MediaSessionCompat.Token;
import android.support.p001v4.p002os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0522d;
import androidx.media.C0936d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import p214e.p228e.C7571a;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f3b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final C0015e f4a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: h */
        private final String f5h;

        /* renamed from: i */
        private final Bundle f6i;

        /* renamed from: j */
        private final C0013c f7j;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo33a(int i, Bundle bundle) {
            if (this.f7j != null) {
                MediaSessionCompat.m143a(bundle);
                if (i == -1) {
                    this.f7j.mo51a(this.f5h, this.f6i, bundle);
                } else if (i == 0) {
                    this.f7j.mo53c(this.f5h, this.f6i, bundle);
                } else if (i != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown result code: ");
                    sb.append(i);
                    sb.append(" (extras=");
                    sb.append(this.f6i);
                    sb.append(", resultData=");
                    sb.append(bundle);
                    sb.append(")");
                    Log.w("MediaBrowserCompat", sb.toString());
                } else {
                    this.f7j.mo52b(this.f5h, this.f6i, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: h */
        private final String f8h;

        /* renamed from: i */
        private final C0014d f9i;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo33a(int i, Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            if (i == 0 && bundle != null) {
                String str = "media_item";
                if (bundle.containsKey(str)) {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (parcelable == null || (parcelable instanceof MediaItem)) {
                        this.f9i.mo54a((MediaItem) parcelable);
                    } else {
                        this.f9i.mo55a(this.f8h);
                    }
                    return;
                }
            }
            this.f9i.mo55a(this.f8h);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new C0008a();

        /* renamed from: e */
        private final int f10e;

        /* renamed from: f */
        private final MediaDescriptionCompat f11f;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        static class C0008a implements Creator<MediaItem> {
            C0008a() {
            }

            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo92b())) {
                this.f10e = i;
                this.f11f = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m9a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m69a(C0039c.m92a(obj)), C0039c.m93b(obj));
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.f10e);
            sb.append(", mDescription=");
            sb.append(this.f11f);
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10e);
            this.f11f.writeToParcel(parcel, i);
        }

        /* renamed from: a */
        public static List<MediaItem> m10a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m9a(a));
            }
            return arrayList;
        }

        MediaItem(Parcel parcel) {
            this.f10e = parcel.readInt();
            this.f11f = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: h */
        private final String f12h;

        /* renamed from: i */
        private final Bundle f13i;

        /* renamed from: j */
        private final C0026k f14j;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo33a(int i, Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            if (i == 0 && bundle != null) {
                String str = "search_results";
                if (bundle.containsKey(str)) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                    ArrayList arrayList = null;
                    if (parcelableArray != null) {
                        arrayList = new ArrayList();
                        for (Parcelable parcelable : parcelableArray) {
                            arrayList.add((MediaItem) parcelable);
                        }
                    }
                    this.f14j.mo73a(this.f12h, this.f13i, arrayList);
                    return;
                }
            }
            this.f14j.mo72a(this.f12h, this.f13i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0009a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0025j> f15a;

        /* renamed from: b */
        private WeakReference<Messenger> f16b;

        C0009a(C0025j jVar) {
            this.f15a = new WeakReference<>(jVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo39a(Messenger messenger) {
            this.f16b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            String str = "MediaBrowserCompat";
            WeakReference<Messenger> weakReference = this.f16b;
            if (weakReference != null && weakReference.get() != null && this.f15a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m143a(data);
                C0025j jVar = (C0025j) this.f15a.get();
                Messenger messenger = (Messenger) this.f16b.get();
                try {
                    int i = message.what;
                    String str2 = "data_media_item_id";
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m143a(bundle);
                        jVar.mo60a(messenger, data.getString(str2), (Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        jVar.mo59a(messenger);
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unhandled message: ");
                        sb.append(message);
                        sb.append("\n  Client version: ");
                        sb.append(1);
                        sb.append("\n  Service version: ");
                        sb.append(message.arg1);
                        Log.w(str, sb.toString());
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m143a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m143a(bundle3);
                        jVar.mo61a(messenger, data.getString(str2), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e(str, "Could not unparcel the data.");
                    if (message.what == 1) {
                        jVar.mo59a(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0010b {

        /* renamed from: a */
        final Object f17a;

        /* renamed from: b */
        C0011a f18b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface C0011a {
            /* renamed from: a */
            void mo45a();

            /* renamed from: b */
            void mo46b();

            /* renamed from: c */
            void mo47c();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        private class C0012b implements C0037a {
            C0012b() {
            }

            /* renamed from: a */
            public void mo48a() {
                C0011a aVar = C0010b.this.f18b;
                if (aVar != null) {
                    aVar.mo45a();
                }
                C0010b.this.mo41a();
            }

            /* renamed from: b */
            public void mo49b() {
                C0011a aVar = C0010b.this.f18b;
                if (aVar != null) {
                    aVar.mo46b();
                }
                C0010b.this.mo43b();
            }

            /* renamed from: c */
            public void mo50c() {
                C0011a aVar = C0010b.this.f18b;
                if (aVar != null) {
                    aVar.mo47c();
                }
                C0010b.this.mo44c();
            }
        }

        public C0010b() {
            if (VERSION.SDK_INT >= 21) {
                this.f17a = C0036a.m83a((C0037a) new C0012b());
            } else {
                this.f17a = null;
            }
        }

        /* renamed from: a */
        public void mo41a() {
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42a(C0011a aVar) {
            this.f18b = aVar;
        }

        /* renamed from: b */
        public void mo43b() {
            throw null;
        }

        /* renamed from: c */
        public void mo44c() {
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0013c {
        /* renamed from: a */
        public abstract void mo51a(String str, Bundle bundle, Bundle bundle2);

        /* renamed from: b */
        public abstract void mo52b(String str, Bundle bundle, Bundle bundle2);

        /* renamed from: c */
        public abstract void mo53c(String str, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0014d {
        /* renamed from: a */
        public abstract void mo54a(MediaItem mediaItem);

        /* renamed from: a */
        public abstract void mo55a(String str);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    interface C0015e {
        void connect();

        /* renamed from: d */
        Token mo57d();

        void disconnect();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0016f implements C0015e, C0025j, C0011a {

        /* renamed from: a */
        final Context f20a;

        /* renamed from: b */
        protected final Object f21b;

        /* renamed from: c */
        protected final Bundle f22c;

        /* renamed from: d */
        protected final C0009a f23d = new C0009a(this);

        /* renamed from: e */
        private final C7571a<String, C0028m> f24e = new C7571a<>();

        /* renamed from: f */
        protected C0027l f25f;

        /* renamed from: g */
        protected Messenger f26g;

        /* renamed from: h */
        private Token f27h;

        C0016f(Context context, ComponentName componentName, C0010b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f20a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f22c = bundle2;
            this.f22c.putInt("extra_client_version", 1);
            bVar.mo42a(this);
            this.f21b = C0036a.m82a(context, componentName, bVar.f17a, this.f22c);
        }

        /* renamed from: a */
        public void mo45a() {
            Bundle c = C0036a.m87c(this.f21b);
            if (c != null) {
                c.getInt("extra_service_version", 0);
                IBinder a = C0522d.m2465a(c, "extra_messenger");
                if (a != null) {
                    this.f25f = new C0027l(a, this.f22c);
                    this.f26g = new Messenger(this.f23d);
                    this.f23d.mo39a(this.f26g);
                    try {
                        this.f25f.mo77b(this.f20a, this.f26g);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IMediaSession a2 = C0051a.m119a(C0522d.m2465a(c, "extra_session_binder"));
                if (a2 != null) {
                    this.f27h = Token.m147a(C0036a.m88d(this.f21b), a2);
                }
            }
        }

        /* renamed from: a */
        public void mo59a(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo60a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo46b() {
        }

        /* renamed from: c */
        public void mo47c() {
            this.f25f = null;
            this.f26g = null;
            this.f27h = null;
            this.f23d.mo39a(null);
        }

        public void connect() {
            C0036a.m85a(this.f21b);
        }

        /* renamed from: d */
        public Token mo57d() {
            if (this.f27h == null) {
                this.f27h = Token.m146a(C0036a.m88d(this.f21b));
            }
            return this.f27h;
        }

        public void disconnect() {
            C0027l lVar = this.f25f;
            if (lVar != null) {
                Messenger messenger = this.f26g;
                if (messenger != null) {
                    try {
                        lVar.mo78b(messenger);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                    }
                }
            }
            C0036a.m86b(this.f21b);
        }

        /* renamed from: a */
        public void mo61a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f26g == messenger) {
                C0028m mVar = (C0028m) this.f24e.get(str);
                if (mVar == null) {
                    if (MediaBrowserCompat.f3b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onLoadChildren for id that isn't subscribed id=");
                        sb.append(str);
                        Log.d("MediaBrowserCompat", sb.toString());
                    }
                    return;
                }
                C0029n a = mVar.mo79a(bundle);
                if (a != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a.mo82a(str);
                        } else {
                            a.mo84a(str, list);
                        }
                    } else if (list == null) {
                        a.mo83a(str, bundle);
                    } else {
                        a.mo85a(str, list, bundle);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0017g extends C0016f {
        C0017g(Context context, ComponentName componentName, C0010b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0018h extends C0017g {
        C0018h(Context context, ComponentName componentName, C0010b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    static class C0019i implements C0015e, C0025j {

        /* renamed from: a */
        final Context f28a;

        /* renamed from: b */
        final ComponentName f29b;

        /* renamed from: c */
        final C0010b f30c;

        /* renamed from: d */
        final Bundle f31d;

        /* renamed from: e */
        final C0009a f32e = new C0009a(this);

        /* renamed from: f */
        private final C7571a<String, C0028m> f33f = new C7571a<>();

        /* renamed from: g */
        int f34g = 1;

        /* renamed from: h */
        C0022c f35h;

        /* renamed from: i */
        C0027l f36i;

        /* renamed from: j */
        Messenger f37j;

        /* renamed from: k */
        private String f38k;

        /* renamed from: l */
        private Token f39l;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        class C0020a implements Runnable {
            C0020a() {
            }

            public void run() {
                String str = "MediaBrowserCompat";
                C0019i iVar = C0019i.this;
                if (iVar.f34g != 0) {
                    iVar.f34g = 2;
                    if (!MediaBrowserCompat.f3b || iVar.f35h == null) {
                        C0019i iVar2 = C0019i.this;
                        if (iVar2.f36i != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("mServiceBinderWrapper should be null. Instead it is ");
                            sb.append(C0019i.this.f36i);
                            throw new RuntimeException(sb.toString());
                        } else if (iVar2.f37j == null) {
                            Intent intent = new Intent("android.media.browse.MediaBrowserService");
                            intent.setComponent(C0019i.this.f29b);
                            C0019i iVar3 = C0019i.this;
                            iVar3.f35h = new C0022c();
                            boolean z = false;
                            try {
                                z = C0019i.this.f28a.bindService(intent, C0019i.this.f35h, 1);
                            } catch (Exception unused) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Failed binding to service ");
                                sb2.append(C0019i.this.f29b);
                                Log.e(str, sb2.toString());
                            }
                            if (!z) {
                                C0019i.this.mo63b();
                                C0019i.this.f30c.mo43b();
                            }
                            if (MediaBrowserCompat.f3b) {
                                Log.d(str, "connect...");
                                C0019i.this.mo62a();
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("mCallbacksMessenger should be null. Instead it is ");
                            sb3.append(C0019i.this.f37j);
                            throw new RuntimeException(sb3.toString());
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("mServiceConnection should be null. Instead it is ");
                        sb4.append(C0019i.this.f35h);
                        throw new RuntimeException(sb4.toString());
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$b */
        class C0021b implements Runnable {
            C0021b() {
            }

            public void run() {
                C0019i iVar = C0019i.this;
                Messenger messenger = iVar.f37j;
                String str = "MediaBrowserCompat";
                if (messenger != null) {
                    try {
                        iVar.f36i.mo75a(messenger);
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("RemoteException during connect for ");
                        sb.append(C0019i.this.f29b);
                        Log.w(str, sb.toString());
                    }
                }
                C0019i iVar2 = C0019i.this;
                int i = iVar2.f34g;
                iVar2.mo63b();
                if (i != 0) {
                    C0019i.this.f34g = i;
                }
                if (MediaBrowserCompat.f3b) {
                    Log.d(str, "disconnect...");
                    C0019i.this.mo62a();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c */
        private class C0022c implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c$a */
            class C0023a implements Runnable {

                /* renamed from: e */
                final /* synthetic */ ComponentName f43e;

                /* renamed from: f */
                final /* synthetic */ IBinder f44f;

                C0023a(ComponentName componentName, IBinder iBinder) {
                    this.f43e = componentName;
                    this.f44f = iBinder;
                }

                public void run() {
                    String str = "ServiceCallbacks.onConnect...";
                    String str2 = "MediaBrowserCompat";
                    if (MediaBrowserCompat.f3b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceConnected name=");
                        sb.append(this.f43e);
                        sb.append(" binder=");
                        sb.append(this.f44f);
                        Log.d(str2, sb.toString());
                        C0019i.this.mo62a();
                    }
                    if (C0022c.this.mo67a("onServiceConnected")) {
                        C0019i iVar = C0019i.this;
                        iVar.f36i = new C0027l(this.f44f, iVar.f31d);
                        C0019i iVar2 = C0019i.this;
                        iVar2.f37j = new Messenger(iVar2.f32e);
                        C0019i iVar3 = C0019i.this;
                        iVar3.f32e.mo39a(iVar3.f37j);
                        C0019i.this.f34g = 2;
                        try {
                            if (MediaBrowserCompat.f3b) {
                                Log.d(str2, str);
                                C0019i.this.mo62a();
                            }
                            C0019i.this.f36i.mo74a(C0019i.this.f28a, C0019i.this.f37j);
                        } catch (RemoteException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("RemoteException during connect for ");
                            sb2.append(C0019i.this.f29b);
                            Log.w(str2, sb2.toString());
                            if (MediaBrowserCompat.f3b) {
                                Log.d(str2, str);
                                C0019i.this.mo62a();
                            }
                        }
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c$b */
            class C0024b implements Runnable {

                /* renamed from: e */
                final /* synthetic */ ComponentName f46e;

                C0024b(ComponentName componentName) {
                    this.f46e = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f3b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceDisconnected name=");
                        sb.append(this.f46e);
                        sb.append(" this=");
                        sb.append(this);
                        sb.append(" mServiceConnection=");
                        sb.append(C0019i.this.f35h);
                        Log.d("MediaBrowserCompat", sb.toString());
                        C0019i.this.mo62a();
                    }
                    if (C0022c.this.mo67a("onServiceDisconnected")) {
                        C0019i iVar = C0019i.this;
                        iVar.f36i = null;
                        iVar.f37j = null;
                        iVar.f32e.mo39a(null);
                        C0019i iVar2 = C0019i.this;
                        iVar2.f34g = 4;
                        iVar2.f30c.mo44c();
                    }
                }
            }

            C0022c() {
            }

            /* renamed from: a */
            private void m45a(Runnable runnable) {
                if (Thread.currentThread() == C0019i.this.f32e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0019i.this.f32e.post(runnable);
                }
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                m45a((Runnable) new C0023a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                m45a((Runnable) new C0024b(componentName));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo67a(String str) {
                C0019i iVar = C0019i.this;
                if (iVar.f35h == this) {
                    int i = iVar.f34g;
                    if (!(i == 0 || i == 1)) {
                        return true;
                    }
                }
                int i2 = C0019i.this.f34g;
                if (!(i2 == 0 || i2 == 1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" for ");
                    sb.append(C0019i.this.f29b);
                    sb.append(" with mServiceConnection=");
                    sb.append(C0019i.this.f35h);
                    sb.append(" this=");
                    sb.append(this);
                    Log.i("MediaBrowserCompat", sb.toString());
                }
                return false;
            }
        }

        public C0019i(Context context, ComponentName componentName, C0010b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f28a = context;
                this.f29b = componentName;
                this.f30c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f31d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: a */
        public void mo60a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (m37a(messenger, "onConnect")) {
                String str2 = "MediaBrowserCompat";
                if (this.f34g != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onConnect from service while mState=");
                    sb.append(m36a(this.f34g));
                    sb.append("... ignoring");
                    Log.w(str2, sb.toString());
                    return;
                }
                this.f38k = str;
                this.f39l = token;
                this.f34g = 3;
                if (MediaBrowserCompat.f3b) {
                    Log.d(str2, "ServiceCallbacks.onConnect...");
                    mo62a();
                }
                this.f30c.mo41a();
                try {
                    for (Entry entry : this.f33f.entrySet()) {
                        String str3 = (String) entry.getKey();
                        C0028m mVar = (C0028m) entry.getValue();
                        List a = mVar.mo80a();
                        List b = mVar.mo81b();
                        for (int i = 0; i < a.size(); i++) {
                            this.f36i.mo76a(str3, ((C0029n) a.get(i)).f52a, (Bundle) b.get(i), this.f37j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(str2, "addSubscription failed with RemoteException.");
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo63b() {
            C0022c cVar = this.f35h;
            if (cVar != null) {
                this.f28a.unbindService(cVar);
            }
            this.f34g = 1;
            this.f35h = null;
            this.f36i = null;
            this.f37j = null;
            this.f32e.mo39a(null);
            this.f38k = null;
            this.f39l = null;
        }

        /* renamed from: c */
        public boolean mo64c() {
            return this.f34g == 3;
        }

        public void connect() {
            int i = this.f34g;
            if (i == 0 || i == 1) {
                this.f34g = 2;
                this.f32e.post(new C0020a());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("connect() called while neigther disconnecting nor disconnected (state=");
            sb.append(m36a(this.f34g));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: d */
        public Token mo57d() {
            if (mo64c()) {
                return this.f39l;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getSessionToken() called while not connected(state=");
            sb.append(this.f34g);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        public void disconnect() {
            this.f34g = 0;
            this.f32e.post(new C0021b());
        }

        /* renamed from: a */
        public void mo59a(Messenger messenger) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectFailed for ");
            sb.append(this.f29b);
            String str = "MediaBrowserCompat";
            Log.e(str, sb.toString());
            if (m37a(messenger, "onConnectFailed")) {
                if (this.f34g != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConnect from service while mState=");
                    sb2.append(m36a(this.f34g));
                    sb2.append("... ignoring");
                    Log.w(str, sb2.toString());
                    return;
                }
                mo63b();
                this.f30c.mo43b();
            }
        }

        /* renamed from: a */
        public void mo61a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (m37a(messenger, "onLoadChildren")) {
                String str2 = "MediaBrowserCompat";
                if (MediaBrowserCompat.f3b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for ");
                    sb.append(this.f29b);
                    sb.append(" id=");
                    sb.append(str);
                    Log.d(str2, sb.toString());
                }
                C0028m mVar = (C0028m) this.f33f.get(str);
                if (mVar == null) {
                    if (MediaBrowserCompat.f3b) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onLoadChildren for id that isn't subscribed id=");
                        sb2.append(str);
                        Log.d(str2, sb2.toString());
                    }
                    return;
                }
                C0029n a = mVar.mo79a(bundle);
                if (a != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a.mo82a(str);
                        } else {
                            a.mo84a(str, list);
                        }
                    } else if (list == null) {
                        a.mo83a(str, bundle);
                    } else {
                        a.mo85a(str, list, bundle);
                    }
                }
            }
        }

        /* renamed from: a */
        private static String m36a(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("UNKNOWN/");
            sb.append(i);
            return sb.toString();
        }

        /* renamed from: a */
        private boolean m37a(Messenger messenger, String str) {
            if (this.f37j == messenger) {
                int i = this.f34g;
                if (!(i == 0 || i == 1)) {
                    return true;
                }
            }
            int i2 = this.f34g;
            if (!(i2 == 0 || i2 == 1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(this.f29b);
                sb.append(" with mCallbacksMessenger=");
                sb.append(this.f37j);
                sb.append(" this=");
                sb.append(this);
                Log.i("MediaBrowserCompat", sb.toString());
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo62a() {
            String str = "MediaBrowserCompat";
            Log.d(str, "MediaBrowserCompat...");
            StringBuilder sb = new StringBuilder();
            sb.append("  mServiceComponent=");
            sb.append(this.f29b);
            Log.d(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  mCallback=");
            sb2.append(this.f30c);
            Log.d(str, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  mRootHints=");
            sb3.append(this.f31d);
            Log.d(str, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  mState=");
            sb4.append(m36a(this.f34g));
            Log.d(str, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  mServiceConnection=");
            sb5.append(this.f35h);
            Log.d(str, sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceBinderWrapper=");
            sb6.append(this.f36i);
            Log.d(str, sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  mCallbacksMessenger=");
            sb7.append(this.f37j);
            Log.d(str, sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("  mRootId=");
            sb8.append(this.f38k);
            Log.d(str, sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  mMediaSessionToken=");
            sb9.append(this.f39l);
            Log.d(str, sb9.toString());
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface C0025j {
        /* renamed from: a */
        void mo59a(Messenger messenger);

        /* renamed from: a */
        void mo60a(Messenger messenger, String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo61a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0026k {
        /* renamed from: a */
        public abstract void mo72a(String str, Bundle bundle);

        /* renamed from: a */
        public abstract void mo73a(String str, Bundle bundle, List<MediaItem> list);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    private static class C0027l {

        /* renamed from: a */
        private Messenger f48a;

        /* renamed from: b */
        private Bundle f49b;

        public C0027l(IBinder iBinder, Bundle bundle) {
            this.f48a = new Messenger(iBinder);
            this.f49b = bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo74a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f49b);
            m52a(1, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo77b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f49b);
            m52a(6, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo75a(Messenger messenger) throws RemoteException {
            m52a(2, null, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo78b(Messenger messenger) throws RemoteException {
            m52a(7, null, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo76a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0522d.m2466a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m52a(3, bundle2, messenger);
        }

        /* renamed from: a */
        private void m52a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f48a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0028m {

        /* renamed from: a */
        private final List<C0029n> f50a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f51b = new ArrayList();

        /* renamed from: a */
        public List<C0029n> mo80a() {
            return this.f50a;
        }

        /* renamed from: b */
        public List<Bundle> mo81b() {
            return this.f51b;
        }

        /* renamed from: a */
        public C0029n mo79a(Bundle bundle) {
            for (int i = 0; i < this.f51b.size(); i++) {
                if (C0936d.m4197a((Bundle) this.f51b.get(i), bundle)) {
                    return (C0029n) this.f50a.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0029n {

        /* renamed from: a */
        final IBinder f52a = new Binder();

        /* renamed from: b */
        WeakReference<C0028m> f53b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class C0030a implements C0040d {
            C0030a() {
            }

            /* renamed from: a */
            public void mo87a(String str, List<?> list) {
                WeakReference<C0028m> weakReference = C0029n.this.f53b;
                C0028m mVar = weakReference == null ? null : (C0028m) weakReference.get();
                if (mVar == null) {
                    C0029n.this.mo84a(str, MediaItem.m10a(list));
                    return;
                }
                List a = MediaItem.m10a(list);
                List a2 = mVar.mo80a();
                List b = mVar.mo81b();
                for (int i = 0; i < a2.size(); i++) {
                    Bundle bundle = (Bundle) b.get(i);
                    if (bundle == null) {
                        C0029n.this.mo84a(str, a);
                    } else {
                        C0029n.this.mo85a(str, mo86a(a, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                C0029n.this.mo82a(str);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public List<MediaItem> mo86a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class C0031b extends C0030a implements C0043a {
            C0031b() {
                super();
            }

            /* renamed from: a */
            public void mo90a(String str, List<?> list, Bundle bundle) {
                C0029n.this.mo85a(str, MediaItem.m10a(list), bundle);
            }

            /* renamed from: a */
            public void mo89a(String str, Bundle bundle) {
                C0029n.this.mo83a(str, bundle);
            }
        }

        public C0029n() {
            int i = VERSION.SDK_INT;
            if (i >= 26) {
                C0042b.m95a(new C0031b());
            } else if (i >= 21) {
                C0036a.m84a((C0040d) new C0030a());
            }
        }

        /* renamed from: a */
        public void mo82a(String str) {
        }

        /* renamed from: a */
        public void mo83a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo84a(String str, List<MediaItem> list) {
        }

        /* renamed from: a */
        public void mo85a(String str, List<MediaItem> list, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0010b bVar, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f4a = new C0018h(context, componentName, bVar, bundle);
        } else if (i >= 23) {
            this.f4a = new C0017g(context, componentName, bVar, bundle);
        } else if (i >= 21) {
            this.f4a = new C0016f(context, componentName, bVar, bundle);
        } else {
            this.f4a = new C0019i(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo30a() {
        this.f4a.connect();
    }

    /* renamed from: b */
    public void mo31b() {
        this.f4a.disconnect();
    }

    /* renamed from: c */
    public Token mo32c() {
        return this.f4a.mo57d();
    }
}
