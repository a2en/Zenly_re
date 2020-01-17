package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.MediaBrowserCompat.MediaItem;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.MediaSessionCompat.Token;
import android.support.p001v4.p002os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0522d;
import androidx.core.util.C0603e;
import androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p214e.p228e.C7571a;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: j */
    static final boolean f3526j = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: e */
    private C0904g f3527e;

    /* renamed from: f */
    final C7571a<IBinder, C0902f> f3528f = new C7571a<>();

    /* renamed from: g */
    C0902f f3529g;

    /* renamed from: h */
    final C0926q f3530h = new C0926q();

    /* renamed from: i */
    Token f3531i;

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    class C0897a extends C0913m<List<MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ C0902f f3532f;

        /* renamed from: g */
        final /* synthetic */ String f3533g;

        /* renamed from: h */
        final /* synthetic */ Bundle f3534h;

        /* renamed from: i */
        final /* synthetic */ Bundle f3535i;

        C0897a(Object obj, C0902f fVar, String str, Bundle bundle, Bundle bundle2) {
            this.f3532f = fVar;
            this.f3533g = str;
            this.f3534h = bundle;
            this.f3535i = bundle2;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4545a(List<MediaItem> list) {
            String str = "MBServiceCompat";
            if (MediaBrowserServiceCompat.this.f3528f.get(this.f3532f.f3541b.asBinder()) != this.f3532f) {
                if (MediaBrowserServiceCompat.f3526j) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    sb.append(this.f3532f.f3540a);
                    sb.append(" id=");
                    sb.append(this.f3533g);
                    Log.d(str, sb.toString());
                }
                return;
            }
            if ((mo4564a() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.mo4527a(list, this.f3534h);
            }
            try {
                this.f3532f.f3541b.mo4588a(this.f3533g, list, this.f3534h, this.f3535i);
            } catch (RemoteException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Calling onLoadChildren() failed for id=");
                sb2.append(this.f3533g);
                sb2.append(" package=");
                sb2.append(this.f3532f.f3540a);
                Log.w(str, sb2.toString());
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    class C0898b extends C0913m<MediaItem> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3537f;

        C0898b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            this.f3537f = resultReceiver;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4545a(MediaItem mediaItem) {
            if ((mo4564a() & 2) != 0) {
                this.f3537f.mo262b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f3537f.mo262b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    class C0899c extends C0913m<List<MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3538f;

        C0899c(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            this.f3538f = resultReceiver;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4545a(List<MediaItem> list) {
            if ((mo4564a() & 4) != 0 || list == null) {
                this.f3538f.mo262b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaItem[0]));
            this.f3538f.mo262b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    class C0900d extends C0913m<Bundle> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3539f;

        C0900d(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            this.f3539f = resultReceiver;
            super(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4545a(Bundle bundle) {
            this.f3539f.mo262b(0, bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4549a(Bundle bundle) {
            this.f3539f.mo262b(-1, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0901e {
        /* renamed from: a */
        public Bundle mo4551a() {
            throw null;
        }

        /* renamed from: b */
        public String mo4552b() {
            throw null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    private class C0902f implements DeathRecipient {

        /* renamed from: a */
        public final String f3540a;

        /* renamed from: b */
        public final C0924o f3541b;

        /* renamed from: c */
        public final HashMap<String, List<C0603e<IBinder, Bundle>>> f3542c = new HashMap<>();

        /* renamed from: d */
        public C0901e f3543d;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        class C0903a implements Runnable {
            C0903a() {
            }

            public void run() {
                C0902f fVar = C0902f.this;
                MediaBrowserServiceCompat.this.f3528f.remove(fVar.f3541b.asBinder());
            }
        }

        C0902f(String str, int i, int i2, Bundle bundle, C0924o oVar) {
            this.f3540a = str;
            new C0937e(str, i, i2);
            this.f3541b = oVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f3530h.post(new C0903a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    interface C0904g {
        /* renamed from: a */
        IBinder mo4555a(Intent intent);

        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    class C0905h implements C0904g, ServiceCompatProxy {

        /* renamed from: a */
        final List<Bundle> f3546a = new ArrayList();

        /* renamed from: b */
        Object f3547b;

        /* renamed from: c */
        Messenger f3548c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        class C0906a extends C0913m<List<MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0929c f3550f;

            C0906a(C0905h hVar, Object obj, C0929c cVar) {
                this.f3550f = cVar;
                super(obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo4545a(List<MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3550f.mo4596a(arrayList);
            }
        }

        C0905h() {
        }

        /* renamed from: a */
        public IBinder mo4555a(Intent intent) {
            return MediaBrowserServiceCompatApi21.m4184a(this.f3547b, intent);
        }

        public void onCreate() {
            this.f3547b = MediaBrowserServiceCompatApi21.m4185a((Context) MediaBrowserServiceCompat.this, (ServiceCompatProxy) this);
            MediaBrowserServiceCompatApi21.m4186a(this.f3547b);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.media.MediaBrowserServiceCompatApi21.C0927a onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
            /*
                r11 = this;
                r0 = 0
                if (r14 == 0) goto L_0x004e
                r1 = 0
                java.lang.String r2 = "extra_client_version"
                int r1 = r14.getInt(r2, r1)
                if (r1 == 0) goto L_0x004e
                r14.remove(r2)
                android.os.Messenger r1 = new android.os.Messenger
                androidx.media.MediaBrowserServiceCompat r2 = androidx.media.MediaBrowserServiceCompat.this
                androidx.media.MediaBrowserServiceCompat$q r2 = r2.f3530h
                r1.<init>(r2)
                r11.f3548c = r1
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                r2 = 2
                java.lang.String r3 = "extra_service_version"
                r1.putInt(r3, r2)
                android.os.Messenger r2 = r11.f3548c
                android.os.IBinder r2 = r2.getBinder()
                java.lang.String r3 = "extra_messenger"
                androidx.core.app.C0522d.m2466a(r1, r3, r2)
                androidx.media.MediaBrowserServiceCompat r2 = androidx.media.MediaBrowserServiceCompat.this
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.f3531i
                if (r2 == 0) goto L_0x0048
                android.support.v4.media.session.IMediaSession r2 = r2.mo229a()
                if (r2 != 0) goto L_0x003e
                r2 = r0
                goto L_0x0042
            L_0x003e:
                android.os.IBinder r2 = r2.asBinder()
            L_0x0042:
                java.lang.String r3 = "extra_session_binder"
                androidx.core.app.C0522d.m2466a(r1, r3, r2)
                goto L_0x004f
            L_0x0048:
                java.util.List<android.os.Bundle> r2 = r11.f3546a
                r2.add(r1)
                goto L_0x004f
            L_0x004e:
                r1 = r0
            L_0x004f:
                androidx.media.MediaBrowserServiceCompat r9 = androidx.media.MediaBrowserServiceCompat.this
                androidx.media.MediaBrowserServiceCompat$f r10 = new androidx.media.MediaBrowserServiceCompat$f
                r5 = -1
                r8 = 0
                r2 = r10
                r3 = r9
                r4 = r12
                r6 = r13
                r7 = r14
                r2.<init>(r4, r5, r6, r7, r8)
                r9.f3529g = r10
                androidx.media.MediaBrowserServiceCompat r2 = androidx.media.MediaBrowserServiceCompat.this
                androidx.media.MediaBrowserServiceCompat$e r12 = r2.mo4526a(r12, r13, r14)
                androidx.media.MediaBrowserServiceCompat r13 = androidx.media.MediaBrowserServiceCompat.this
                r13.f3529g = r0
                if (r12 != 0) goto L_0x006c
                return r0
            L_0x006c:
                if (r1 != 0) goto L_0x0072
                r12.mo4551a()
                throw r0
            L_0x0072:
                r12.mo4551a()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.MediaBrowserServiceCompat.C0905h.onGetRoot(java.lang.String, int, android.os.Bundle):androidx.media.MediaBrowserServiceCompatApi21$a");
        }

        public void onLoadChildren(String str, C0929c<List<Parcel>> cVar) {
            MediaBrowserServiceCompat.this.mo4535a(str, (C0913m<List<MediaItem>>) new C0906a<List<MediaItem>>(this, str, cVar));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    class C0907i extends C0905h implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        class C0908a extends C0913m<MediaItem> {

            /* renamed from: f */
            final /* synthetic */ C0929c f3552f;

            C0908a(C0907i iVar, Object obj, C0929c cVar) {
                this.f3552f = cVar;
                super(obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo4545a(MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f3552f.mo4596a(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f3552f.mo4596a(obtain);
            }
        }

        C0907i() {
            super();
        }

        public void onCreate() {
            this.f3547b = MediaBrowserServiceCompatApi23.m4189a(MediaBrowserServiceCompat.this, this);
            MediaBrowserServiceCompatApi21.m4186a(this.f3547b);
        }

        public void onLoadItem(String str, C0929c<Parcel> cVar) {
            MediaBrowserServiceCompat.this.mo4541b(str, new C0908a(this, str, cVar));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    class C0909j extends C0907i implements MediaBrowserServiceCompatApi26.ServiceCompatProxy {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        class C0910a extends C0913m<List<MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0932b f3554f;

            C0910a(C0909j jVar, Object obj, C0932b bVar) {
                this.f3554f = bVar;
                super(obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo4545a(List<MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3554f.mo4600a(arrayList, mo4564a());
            }
        }

        C0909j() {
            super();
        }

        public void onCreate() {
            this.f3547b = MediaBrowserServiceCompatApi26.m4190a(MediaBrowserServiceCompat.this, this);
            MediaBrowserServiceCompatApi21.m4186a(this.f3547b);
        }

        public void onLoadChildren(String str, C0932b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.mo4536a(str, (C0913m<List<MediaItem>>) new C0910a<List<MediaItem>>(this, str, bVar), bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    class C0911k extends C0909j {
        C0911k(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    class C0912l implements C0904g {

        /* renamed from: a */
        private Messenger f3555a;

        C0912l() {
        }

        /* renamed from: a */
        public IBinder mo4555a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f3555a.getBinder();
            }
            return null;
        }

        public void onCreate() {
            this.f3555a = new Messenger(MediaBrowserServiceCompat.this.f3530h);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C0913m<T> {

        /* renamed from: a */
        private final Object f3557a;

        /* renamed from: b */
        private boolean f3558b;

        /* renamed from: c */
        private boolean f3559c;

        /* renamed from: d */
        private boolean f3560d;

        /* renamed from: e */
        private int f3561e;

        C0913m(Object obj) {
            this.f3557a = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4565a(int i) {
            this.f3561e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4545a(T t) {
            throw null;
        }

        /* renamed from: b */
        public void mo4567b(T t) {
            if (this.f3559c || this.f3560d) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f3557a);
                throw new IllegalStateException(sb.toString());
            }
            this.f3559c = true;
            mo4545a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4564a() {
            return this.f3561e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4549a(Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an error for ");
            sb.append(this.f3557a);
            throw new UnsupportedOperationException(sb.toString());
        }

        /* renamed from: b */
        public void mo4566b(Bundle bundle) {
            if (this.f3559c || this.f3560d) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendError() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f3557a);
                throw new IllegalStateException(sb.toString());
            }
            this.f3560d = true;
            mo4549a(bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4568b() {
            return this.f3558b || this.f3559c || this.f3560d;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    private class C0914n {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$a */
        class C0915a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3563e;

            /* renamed from: f */
            final /* synthetic */ String f3564f;

            /* renamed from: g */
            final /* synthetic */ int f3565g;

            /* renamed from: h */
            final /* synthetic */ int f3566h;

            /* renamed from: i */
            final /* synthetic */ Bundle f3567i;

            C0915a(C0924o oVar, String str, int i, int i2, Bundle bundle) {
                this.f3563e = oVar;
                this.f3564f = str;
                this.f3565g = i;
                this.f3566h = i2;
                this.f3567i = bundle;
            }

            public void run() {
                IBinder asBinder = this.f3563e.asBinder();
                MediaBrowserServiceCompat.this.f3528f.remove(asBinder);
                C0902f fVar = new C0902f(this.f3564f, this.f3565g, this.f3566h, this.f3567i, this.f3563e);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3529g = fVar;
                fVar.f3543d = mediaBrowserServiceCompat.mo4526a(this.f3564f, this.f3566h, this.f3567i);
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f3529g = null;
                String str = "MBServiceCompat";
                if (fVar.f3543d == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f3564f);
                    sb.append(" from service ");
                    sb.append(C0915a.class.getName());
                    Log.i(str, sb.toString());
                    try {
                        this.f3563e.mo4587a();
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb2.append(this.f3564f);
                        Log.w(str, sb2.toString());
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.f3528f.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.f3531i != null) {
                            fVar.f3543d.mo4552b();
                            throw null;
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                        sb3.append(this.f3564f);
                        Log.w(str, sb3.toString());
                        MediaBrowserServiceCompat.this.f3528f.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$b */
        class C0916b implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3569e;

            C0916b(C0924o oVar) {
                this.f3569e = oVar;
            }

            public void run() {
                C0902f fVar = (C0902f) MediaBrowserServiceCompat.this.f3528f.remove(this.f3569e.asBinder());
                if (fVar != null) {
                    fVar.f3541b.asBinder().unlinkToDeath(fVar, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$c */
        class C0917c implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3571e;

            /* renamed from: f */
            final /* synthetic */ String f3572f;

            /* renamed from: g */
            final /* synthetic */ IBinder f3573g;

            /* renamed from: h */
            final /* synthetic */ Bundle f3574h;

            C0917c(C0924o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f3571e = oVar;
                this.f3572f = str;
                this.f3573g = iBinder;
                this.f3574h = bundle;
            }

            public void run() {
                C0902f fVar = (C0902f) MediaBrowserServiceCompat.this.f3528f.get(this.f3571e.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription for callback that isn't registered id=");
                    sb.append(this.f3572f);
                    Log.w("MBServiceCompat", sb.toString());
                    return;
                }
                MediaBrowserServiceCompat.this.mo4533a(this.f3572f, fVar, this.f3573g, this.f3574h);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$d */
        class C0918d implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3576e;

            /* renamed from: f */
            final /* synthetic */ String f3577f;

            /* renamed from: g */
            final /* synthetic */ IBinder f3578g;

            C0918d(C0924o oVar, String str, IBinder iBinder) {
                this.f3576e = oVar;
                this.f3577f = str;
                this.f3578g = iBinder;
            }

            public void run() {
                C0902f fVar = (C0902f) MediaBrowserServiceCompat.this.f3528f.get(this.f3576e.asBinder());
                String str = "MBServiceCompat";
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription for callback that isn't registered id=");
                    sb.append(this.f3577f);
                    Log.w(str, sb.toString());
                    return;
                }
                if (!MediaBrowserServiceCompat.this.mo4538a(this.f3577f, fVar, this.f3578g)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription called for ");
                    sb2.append(this.f3577f);
                    sb2.append(" which is not subscribed");
                    Log.w(str, sb2.toString());
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$e */
        class C0919e implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3580e;

            /* renamed from: f */
            final /* synthetic */ String f3581f;

            /* renamed from: g */
            final /* synthetic */ ResultReceiver f3582g;

            C0919e(C0924o oVar, String str, ResultReceiver resultReceiver) {
                this.f3580e = oVar;
                this.f3581f = str;
                this.f3582g = resultReceiver;
            }

            public void run() {
                C0902f fVar = (C0902f) MediaBrowserServiceCompat.this.f3528f.get(this.f3580e.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMediaItem for callback that isn't registered id=");
                    sb.append(this.f3581f);
                    Log.w("MBServiceCompat", sb.toString());
                    return;
                }
                MediaBrowserServiceCompat.this.mo4534a(this.f3581f, fVar, this.f3582g);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$f */
        class C0920f implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3584e;

            /* renamed from: f */
            final /* synthetic */ String f3585f;

            /* renamed from: g */
            final /* synthetic */ int f3586g;

            /* renamed from: h */
            final /* synthetic */ int f3587h;

            /* renamed from: i */
            final /* synthetic */ Bundle f3588i;

            C0920f(C0924o oVar, String str, int i, int i2, Bundle bundle) {
                this.f3584e = oVar;
                this.f3585f = str;
                this.f3586g = i;
                this.f3587h = i2;
                this.f3588i = bundle;
            }

            public void run() {
                IBinder asBinder = this.f3584e.asBinder();
                MediaBrowserServiceCompat.this.f3528f.remove(asBinder);
                C0902f fVar = new C0902f(this.f3585f, this.f3586g, this.f3587h, this.f3588i, this.f3584e);
                MediaBrowserServiceCompat.this.f3528f.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$g */
        class C0921g implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3590e;

            C0921g(C0924o oVar) {
                this.f3590e = oVar;
            }

            public void run() {
                IBinder asBinder = this.f3590e.asBinder();
                C0902f fVar = (C0902f) MediaBrowserServiceCompat.this.f3528f.remove(asBinder);
                if (fVar != null) {
                    asBinder.unlinkToDeath(fVar, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$h */
        class C0922h implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3592e;

            /* renamed from: f */
            final /* synthetic */ String f3593f;

            /* renamed from: g */
            final /* synthetic */ Bundle f3594g;

            /* renamed from: h */
            final /* synthetic */ ResultReceiver f3595h;

            C0922h(C0924o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3592e = oVar;
                this.f3593f = str;
                this.f3594g = bundle;
                this.f3595h = resultReceiver;
            }

            public void run() {
                C0902f fVar = (C0902f) MediaBrowserServiceCompat.this.f3528f.get(this.f3592e.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("search for callback that isn't registered query=");
                    sb.append(this.f3593f);
                    Log.w("MBServiceCompat", sb.toString());
                    return;
                }
                MediaBrowserServiceCompat.this.mo4539b(this.f3593f, this.f3594g, fVar, this.f3595h);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$i */
        class C0923i implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0924o f3597e;

            /* renamed from: f */
            final /* synthetic */ String f3598f;

            /* renamed from: g */
            final /* synthetic */ Bundle f3599g;

            /* renamed from: h */
            final /* synthetic */ ResultReceiver f3600h;

            C0923i(C0924o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3597e = oVar;
                this.f3598f = str;
                this.f3599g = bundle;
                this.f3600h = resultReceiver;
            }

            public void run() {
                C0902f fVar = (C0902f) MediaBrowserServiceCompat.this.f3528f.get(this.f3597e.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendCustomAction for callback that isn't registered action=");
                    sb.append(this.f3598f);
                    sb.append(", extras=");
                    sb.append(this.f3599g);
                    Log.w("MBServiceCompat", sb.toString());
                    return;
                }
                MediaBrowserServiceCompat.this.mo4530a(this.f3598f, this.f3599g, fVar, this.f3600h);
            }
        }

        C0914n() {
        }

        /* renamed from: a */
        public void mo4571a(String str, int i, int i2, Bundle bundle, C0924o oVar) {
            if (MediaBrowserServiceCompat.this.mo4537a(str, i2)) {
                C0926q qVar = MediaBrowserServiceCompat.this.f3530h;
                C0915a aVar = new C0915a(oVar, str, i, i2, bundle);
                qVar.mo4590a(aVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Package/uid mismatch: uid=");
            sb.append(i2);
            sb.append(" package=");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public void mo4576b(C0924o oVar) {
            MediaBrowserServiceCompat.this.f3530h.mo4590a(new C0921g(oVar));
        }

        /* renamed from: b */
        public void mo4577b(String str, Bundle bundle, ResultReceiver resultReceiver, C0924o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C0926q qVar = MediaBrowserServiceCompat.this.f3530h;
                C0923i iVar = new C0923i(oVar, str, bundle, resultReceiver);
                qVar.mo4590a(iVar);
            }
        }

        /* renamed from: a */
        public void mo4569a(C0924o oVar) {
            MediaBrowserServiceCompat.this.f3530h.mo4590a(new C0916b(oVar));
        }

        /* renamed from: a */
        public void mo4573a(String str, IBinder iBinder, Bundle bundle, C0924o oVar) {
            C0926q qVar = MediaBrowserServiceCompat.this.f3530h;
            C0917c cVar = new C0917c(oVar, str, iBinder, bundle);
            qVar.mo4590a(cVar);
        }

        /* renamed from: a */
        public void mo4574a(String str, IBinder iBinder, C0924o oVar) {
            MediaBrowserServiceCompat.this.f3530h.mo4590a(new C0918d(oVar, str, iBinder));
        }

        /* renamed from: a */
        public void mo4575a(String str, ResultReceiver resultReceiver, C0924o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f3530h.mo4590a(new C0919e(oVar, str, resultReceiver));
            }
        }

        /* renamed from: a */
        public void mo4570a(C0924o oVar, String str, int i, int i2, Bundle bundle) {
            C0926q qVar = MediaBrowserServiceCompat.this.f3530h;
            C0920f fVar = new C0920f(oVar, str, i, i2, bundle);
            qVar.mo4590a(fVar);
        }

        /* renamed from: a */
        public void mo4572a(String str, Bundle bundle, ResultReceiver resultReceiver, C0924o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C0926q qVar = MediaBrowserServiceCompat.this.f3530h;
                C0922h hVar = new C0922h(oVar, str, bundle, resultReceiver);
                qVar.mo4590a(hVar);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    private interface C0924o {
        /* renamed from: a */
        void mo4587a() throws RemoteException;

        /* renamed from: a */
        void mo4588a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    private static class C0925p implements C0924o {

        /* renamed from: a */
        final Messenger f3602a;

        C0925p(Messenger messenger) {
            this.f3602a = messenger;
        }

        /* renamed from: a */
        public void mo4587a() throws RemoteException {
            m4180a(2, null);
        }

        public IBinder asBinder() {
            return this.f3602a.getBinder();
        }

        /* renamed from: a */
        public void mo4588a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            m4180a(3, bundle3);
        }

        /* renamed from: a */
        private void m4180a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f3602a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    private final class C0926q extends Handler {

        /* renamed from: a */
        private final C0914n f3603a = new C0914n();

        C0926q() {
        }

        /* renamed from: a */
        public void mo4590a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            String str = "data_callback_token";
            String str2 = "data_calling_uid";
            String str3 = "data_calling_pid";
            String str4 = "data_package_name";
            String str5 = "data_root_hints";
            String str6 = "data_result_receiver";
            String str7 = "data_media_item_id";
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(str5);
                    MediaSessionCompat.m143a(bundle);
                    this.f3603a.mo4571a(data.getString(str4), data.getInt(str3), data.getInt(str2), bundle, (C0924o) new C0925p(message.replyTo));
                    return;
                case 2:
                    this.f3603a.mo4569a(new C0925p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m143a(bundle2);
                    this.f3603a.mo4573a(data.getString(str7), C0522d.m2465a(data, str), bundle2, (C0924o) new C0925p(message.replyTo));
                    return;
                case 4:
                    this.f3603a.mo4574a(data.getString(str7), C0522d.m2465a(data, str), (C0924o) new C0925p(message.replyTo));
                    return;
                case 5:
                    this.f3603a.mo4575a(data.getString(str7), (ResultReceiver) data.getParcelable(str6), (C0924o) new C0925p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(str5);
                    MediaSessionCompat.m143a(bundle3);
                    this.f3603a.mo4570a((C0924o) new C0925p(message.replyTo), data.getString(str4), data.getInt(str3), data.getInt(str2), bundle3);
                    return;
                case 7:
                    this.f3603a.mo4576b(new C0925p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m143a(bundle4);
                    this.f3603a.mo4572a(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable(str6), (C0924o) new C0925p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m143a(bundle5);
                    this.f3603a.mo4577b(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable(str6), new C0925p(message.replyTo));
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    Log.w("MBServiceCompat", sb.toString());
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public abstract C0901e mo4526a(String str, int i, Bundle bundle);

    /* renamed from: a */
    public void mo4528a(String str) {
    }

    /* renamed from: a */
    public void mo4529a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo4535a(String str, C0913m<List<MediaItem>> mVar);

    /* renamed from: a */
    public void mo4536a(String str, C0913m<List<MediaItem>> mVar, Bundle bundle) {
        mVar.mo4565a(1);
        mo4535a(str, mVar);
    }

    /* renamed from: b */
    public void mo4541b(String str, C0913m<MediaItem> mVar) {
        mVar.mo4565a(2);
        mVar.mo4567b(null);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return this.f3527e.mo4555a(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f3527e = new C0911k(this);
        } else if (i >= 26) {
            this.f3527e = new C0909j();
        } else if (i >= 23) {
            this.f3527e = new C0907i();
        } else if (i >= 21) {
            this.f3527e = new C0905h();
        } else {
            this.f3527e = new C0912l();
        }
        this.f3527e.onCreate();
    }

    /* renamed from: a */
    public void mo4531a(String str, Bundle bundle, C0913m<Bundle> mVar) {
        mVar.mo4566b((Bundle) null);
    }

    /* renamed from: b */
    public void mo4540b(String str, Bundle bundle, C0913m<List<MediaItem>> mVar) {
        mVar.mo4565a(4);
        mVar.mo4567b(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4537a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4539b(String str, Bundle bundle, C0902f fVar, ResultReceiver resultReceiver) {
        C0899c cVar = new C0899c(this, str, resultReceiver);
        mo4540b(str, bundle, cVar);
        if (!cVar.mo4568b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSearch must call detach() or sendResult() before returning for query=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4533a(String str, C0902f fVar, IBinder iBinder, Bundle bundle) {
        List<C0603e> list = (List) fVar.f3542c.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0603e eVar : list) {
            if (iBinder == eVar.f2729a && C0936d.m4197a(bundle, (Bundle) eVar.f2730b)) {
                return;
            }
        }
        list.add(new C0603e(iBinder, bundle));
        fVar.f3542c.put(str, list);
        mo4532a(str, fVar, bundle, (Bundle) null);
        mo4529a(str, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4538a(String str, C0902f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f3542c.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                mo4528a(str);
            }
        } else {
            List list = (List) fVar.f3542c.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C0603e) it.next()).f2729a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f3542c.remove(str);
                }
            }
            mo4528a(str);
            return z2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4532a(String str, C0902f fVar, Bundle bundle, Bundle bundle2) {
        C0897a aVar = new C0897a(str, fVar, str, bundle, bundle2);
        if (bundle == null) {
            mo4535a(str, (C0913m<List<MediaItem>>) aVar);
        } else {
            mo4536a(str, (C0913m<List<MediaItem>>) aVar, bundle);
        }
        if (!aVar.mo4568b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(fVar.f3540a);
            sb.append(" id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<MediaItem> mo4527a(List<MediaItem> list, Bundle bundle) {
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4534a(String str, C0902f fVar, ResultReceiver resultReceiver) {
        C0898b bVar = new C0898b(this, str, resultReceiver);
        mo4541b(str, bVar);
        if (!bVar.mo4568b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadItem must call detach() or sendResult() before returning for id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4530a(String str, Bundle bundle, C0902f fVar, ResultReceiver resultReceiver) {
        C0900d dVar = new C0900d(this, str, resultReceiver);
        mo4531a(str, bundle, (C0913m<Bundle>) dVar);
        if (!dVar.mo4568b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            sb.append(str);
            sb.append(" extras=");
            sb.append(bundle);
            throw new IllegalStateException(sb.toString());
        }
    }
}
