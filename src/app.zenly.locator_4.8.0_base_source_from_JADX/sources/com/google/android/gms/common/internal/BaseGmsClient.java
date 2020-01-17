package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C10069d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C9994a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IGmsCallbacks.C10096a;
import com.google.android.gms.internal.common.C10450d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseGmsClient<T extends IInterface> {

    /* renamed from: z */
    private static final Feature[] f26515z = new Feature[0];

    /* renamed from: a */
    private int f26516a;

    /* renamed from: b */
    private long f26517b;

    /* renamed from: c */
    private long f26518c;

    /* renamed from: d */
    private int f26519d;

    /* renamed from: e */
    private long f26520e;

    /* renamed from: f */
    private C10117i0 f26521f;

    /* renamed from: g */
    private final Context f26522g;

    /* renamed from: h */
    private final C10113h f26523h;

    /* renamed from: i */
    final Handler f26524i;

    /* renamed from: j */
    private final Object f26525j = new Object();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Object f26526k = new Object();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public IGmsServiceBroker f26527l;

    /* renamed from: m */
    protected ConnectionProgressReportCallbacks f26528m;

    /* renamed from: n */
    private T f26529n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final ArrayList<C10088c<?>> f26530o = new ArrayList<>();

    /* renamed from: p */
    private C10091f f26531p;

    /* renamed from: q */
    private int f26532q = 1;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final BaseConnectionCallbacks f26533r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final BaseOnConnectionFailedListener f26534s;

    /* renamed from: t */
    private final int f26535t;

    /* renamed from: u */
    private final String f26536u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public ConnectionResult f26537v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f26538w = false;

    /* renamed from: x */
    private volatile zza f26539x = null;

    /* renamed from: y */
    protected AtomicInteger f26540y = new AtomicInteger(0);

    public interface BaseConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(ConnectionResult connectionResult);
    }

    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$a */
    protected class C10086a implements ConnectionProgressReportCallbacks {
        public C10086a() {
        }

        public void onReportServiceBinding(ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.mo27379h());
                return;
            }
            if (BaseGmsClient.this.f26534s != null) {
                BaseGmsClient.this.f26534s.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$b */
    private abstract class C10087b extends C10088c<Boolean> {

        /* renamed from: d */
        private final int f26542d;

        /* renamed from: e */
        private final Bundle f26543e;

        protected C10087b(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f26542d = i;
            this.f26543e = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo27395a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo27396a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                BaseGmsClient.this.m25365b(1, null);
                return;
            }
            int i = this.f26542d;
            if (i != 0) {
                if (i != 10) {
                    BaseGmsClient.this.m25365b(1, null);
                    Bundle bundle = this.f26543e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    mo27395a(new ConnectionResult(this.f26542d, pendingIntent));
                } else {
                    BaseGmsClient.this.m25365b(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), BaseGmsClient.this.mo27384k(), BaseGmsClient.this.mo27383j()}));
                }
            } else if (!mo27398e()) {
                BaseGmsClient.this.m25365b(1, null);
                mo27395a(new ConnectionResult(8, null));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo27397c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract boolean mo27398e();
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$c */
    protected abstract class C10088c<TListener> {

        /* renamed from: a */
        private TListener f26545a;

        /* renamed from: b */
        private boolean f26546b = false;

        public C10088c(TListener tlistener) {
            this.f26545a = tlistener;
        }

        /* renamed from: a */
        public final void mo27399a() {
            synchronized (this) {
                this.f26545a = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo27396a(TListener tlistener);

        /* renamed from: b */
        public final void mo27400b() {
            mo27399a();
            synchronized (BaseGmsClient.this.f26530o) {
                BaseGmsClient.this.f26530o.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo27397c();

        /* renamed from: d */
        public final void mo27401d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f26545a;
                if (this.f26546b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo27396a(tlistener);
                } catch (RuntimeException e) {
                    mo27397c();
                    throw e;
                }
            } else {
                mo27397c();
            }
            synchronized (this) {
                this.f26546b = true;
            }
            mo27400b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$d */
    final class C10089d extends C10450d {
        public C10089d(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m25406a(Message message) {
            C10088c cVar = (C10088c) message.obj;
            cVar.mo27397c();
            cVar.mo27400b();
        }

        /* renamed from: b */
        private static boolean m25407b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (BaseGmsClient.this.f26540y.get() != message.arg1) {
                if (m25407b(message)) {
                    m25406a(message);
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !BaseGmsClient.this.mo27363b()) || message.what == 5)) && !BaseGmsClient.this.isConnecting()) {
                m25406a(message);
                return;
            }
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                BaseGmsClient.this.f26537v = new ConnectionResult(message.arg2);
                if (!BaseGmsClient.this.m25375p() || BaseGmsClient.this.f26538w) {
                    if (BaseGmsClient.this.f26537v != null) {
                        connectionResult2 = BaseGmsClient.this.f26537v;
                    } else {
                        connectionResult2 = new ConnectionResult(8);
                    }
                    BaseGmsClient.this.f26528m.onReportServiceBinding(connectionResult2);
                    BaseGmsClient.this.mo27361a(connectionResult2);
                    return;
                }
                BaseGmsClient.this.m25365b(3, null);
            } else if (i2 == 5) {
                if (BaseGmsClient.this.f26537v != null) {
                    connectionResult = BaseGmsClient.this.f26537v;
                } else {
                    connectionResult = new ConnectionResult(8);
                }
                BaseGmsClient.this.f26528m.onReportServiceBinding(connectionResult);
                BaseGmsClient.this.mo27361a(connectionResult);
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                BaseGmsClient.this.f26528m.onReportServiceBinding(connectionResult3);
                BaseGmsClient.this.mo27361a(connectionResult3);
            } else if (i2 == 6) {
                BaseGmsClient.this.m25365b(5, null);
                if (BaseGmsClient.this.f26533r != null) {
                    BaseGmsClient.this.f26533r.onConnectionSuspended(message.arg2);
                }
                BaseGmsClient.this.mo27356a(message.arg2);
                BaseGmsClient.this.m25363a(5, 1, null);
            } else if (i2 == 2 && !BaseGmsClient.this.isConnected()) {
                m25406a(message);
            } else if (m25407b(message)) {
                ((C10088c) message.obj).mo27401d();
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("GmsClient", sb.toString(), new Exception());
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$e */
    public static final class C10090e extends C10096a {

        /* renamed from: a */
        private BaseGmsClient f26549a;

        /* renamed from: b */
        private final int f26550b;

        public C10090e(BaseGmsClient baseGmsClient, int i) {
            this.f26549a = baseGmsClient;
            this.f26550b = i;
        }

        public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
            C10123l.m25506a(this.f26549a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f26549a.mo27358a(i, iBinder, bundle, this.f26550b);
            this.f26549a = null;
        }

        public final void zza(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        public final void zza(int i, IBinder iBinder, zza zza) {
            C10123l.m25506a(this.f26549a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C10123l.m25505a(zza);
            this.f26549a.m25362a(zza);
            onPostInitComplete(i, iBinder, zza.f26658e);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$f */
    public final class C10091f implements ServiceConnection {

        /* renamed from: a */
        private final int f26551a;

        public C10091f(int i) {
            this.f26551a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGmsServiceBroker iGmsServiceBroker;
            if (iBinder == null) {
                BaseGmsClient.this.m25367c(16);
                return;
            }
            synchronized (BaseGmsClient.this.f26526k) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                if (iBinder == null) {
                    iGmsServiceBroker = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                        iGmsServiceBroker = new C10118j(iBinder);
                    } else {
                        iGmsServiceBroker = (IGmsServiceBroker) queryLocalInterface;
                    }
                }
                baseGmsClient.f26527l = iGmsServiceBroker;
            }
            BaseGmsClient.this.mo27357a(0, (Bundle) null, this.f26551a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (BaseGmsClient.this.f26526k) {
                BaseGmsClient.this.f26527l = null;
            }
            Handler handler = BaseGmsClient.this.f26524i;
            handler.sendMessage(handler.obtainMessage(6, this.f26551a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$g */
    protected final class C10092g extends C10087b {
        public C10092g(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo27395a(ConnectionResult connectionResult) {
            if (!BaseGmsClient.this.mo27363b() || !BaseGmsClient.this.m25375p()) {
                BaseGmsClient.this.f26528m.onReportServiceBinding(connectionResult);
                BaseGmsClient.this.mo27361a(connectionResult);
                return;
            }
            BaseGmsClient.this.m25367c(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo27398e() {
            BaseGmsClient.this.f26528m.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
            return true;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$h */
    protected final class C10093h extends C10087b {

        /* renamed from: g */
        private final IBinder f26554g;

        public C10093h(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f26554g = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo27395a(ConnectionResult connectionResult) {
            if (BaseGmsClient.this.f26534s != null) {
                BaseGmsClient.this.f26534s.onConnectionFailed(connectionResult);
            }
            BaseGmsClient.this.mo27361a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo27398e() {
            String str = "GmsClient";
            try {
                String interfaceDescriptor = this.f26554g.getInterfaceDescriptor();
                if (!BaseGmsClient.this.mo27383j().equals(interfaceDescriptor)) {
                    String j = BaseGmsClient.this.mo27383j();
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(j);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e(str, sb.toString());
                    return false;
                }
                IInterface a = BaseGmsClient.this.mo27354a(this.f26554g);
                if (a == null || (!BaseGmsClient.this.m25363a(2, 4, a) && !BaseGmsClient.this.m25363a(3, 4, a))) {
                    return false;
                }
                BaseGmsClient.this.f26537v = null;
                Bundle connectionHint = BaseGmsClient.this.getConnectionHint();
                if (BaseGmsClient.this.f26533r != null) {
                    BaseGmsClient.this.f26533r.onConnected(connectionHint);
                }
                return true;
            } catch (RemoteException unused) {
                Log.w(str, "service probably died");
                return false;
            }
        }
    }

    static {
        new String[]{"service_esmobile", "service_googleme"};
    }

    protected BaseGmsClient(Context context, Looper looper, C10113h hVar, C10069d dVar, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        C10123l.m25506a(context, (Object) "Context must not be null");
        this.f26522g = context;
        C10123l.m25506a(looper, (Object) "Looper must not be null");
        Looper looper2 = looper;
        C10123l.m25506a(hVar, (Object) "Supervisor must not be null");
        this.f26523h = hVar;
        C10123l.m25506a(dVar, (Object) "API availability must not be null");
        C10069d dVar2 = dVar;
        this.f26524i = new C10089d(looper);
        this.f26535t = i;
        this.f26533r = baseConnectionCallbacks;
        this.f26534s = baseOnConnectionFailedListener;
        this.f26536u = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25362a(zza zza) {
        this.f26539x = zza;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m25365b(int i, T t) {
        C10117i0 i0Var;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C10123l.m25512a(z);
        synchronized (this.f26525j) {
            this.f26532q = i;
            this.f26529n = t;
            mo27359a(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f26531p == null || this.f26521f == null)) {
                        String d = this.f26521f.mo27495d();
                        String a = this.f26521f.mo27492a();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 70 + String.valueOf(a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(d);
                        sb.append(" on ");
                        sb.append(a);
                        Log.e("GmsClient", sb.toString());
                        this.f26523h.mo27470a(this.f26521f.mo27495d(), this.f26521f.mo27492a(), this.f26521f.mo27494c(), this.f26531p, mo27501n());
                        this.f26540y.incrementAndGet();
                    }
                    this.f26531p = new C10091f(this.f26540y.get());
                    if (this.f26532q != 3 || mo27371g() == null) {
                        i0Var = new C10117i0(mo27385l(), mo27384k(), false, 129, mo27386m());
                    } else {
                        i0Var = new C10117i0(mo27369e().getPackageName(), mo27371g(), true, 129, false);
                    }
                    this.f26521f = i0Var;
                    if (!this.f26523h.mo27466a(new C10114a(this.f26521f.mo27495d(), this.f26521f.mo27492a(), this.f26521f.mo27494c(), this.f26521f.mo27493b()), this.f26531p, mo27501n())) {
                        String d2 = this.f26521f.mo27495d();
                        String a2 = this.f26521f.mo27492a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 34 + String.valueOf(a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(d2);
                        sb2.append(" on ");
                        sb2.append(a2);
                        Log.e("GmsClient", sb2.toString());
                        mo27357a(16, (Bundle) null, this.f26540y.get());
                    }
                } else if (i == 4) {
                    mo27360a(t);
                }
            } else if (this.f26531p != null) {
                this.f26523h.mo27470a(this.f26521f.mo27495d(), this.f26521f.mo27492a(), this.f26521f.mo27494c(), this.f26531p, mo27501n());
                this.f26531p = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m25367c(int i) {
        int i2;
        if (m25374o()) {
            i2 = 5;
            this.f26538w = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f26524i;
        handler.sendMessage(handler.obtainMessage(i2, this.f26540y.get(), 16));
    }

    /* renamed from: n */
    private final String mo27501n() {
        String str = this.f26536u;
        return str == null ? this.f26522g.getClass().getName() : str;
    }

    /* renamed from: o */
    private final boolean m25374o() {
        boolean z;
        synchronized (this.f26525j) {
            z = this.f26532q == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m25375p() {
        if (this.f26538w || TextUtils.isEmpty(mo27383j()) || TextUtils.isEmpty(mo27371g())) {
            return false;
        }
        try {
            Class.forName(mo27383j());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo27354a(IBinder iBinder);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27359a(int i, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo27363b() {
        return false;
    }

    /* renamed from: c */
    public abstract Account mo27364c();

    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        C10123l.m25506a(connectionProgressReportCallbacks, (Object) "Connection progress callbacks cannot be null.");
        this.f26528m = connectionProgressReportCallbacks;
        m25365b(2, null);
    }

    /* renamed from: d */
    public Feature[] mo27366d() {
        return f26515z;
    }

    public void disconnect() {
        this.f26540y.incrementAndGet();
        synchronized (this.f26530o) {
            int size = this.f26530o.size();
            for (int i = 0; i < size; i++) {
                ((C10088c) this.f26530o.get(i)).mo27399a();
            }
            this.f26530o.clear();
        }
        synchronized (this.f26526k) {
            this.f26527l = null;
        }
        m25365b(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.f26525j) {
            i = this.f26532q;
            t = this.f26529n;
        }
        synchronized (this.f26526k) {
            iGmsServiceBroker = this.f26527l;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo27383j()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f26518c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f26518c;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f26517b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f26516a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f26517b;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f26520e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C9994a.getStatusCodeString(this.f26519d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f26520e;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: e */
    public final Context mo27369e() {
        return this.f26522g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Bundle mo27370f() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo27371g() {
        return null;
    }

    public final Feature[] getAvailableFeatures() {
        zza zza = this.f26539x;
        if (zza == null) {
            return null;
        }
        return zza.f26659f;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public String getEndpointPackageName() {
        if (isConnected()) {
            C10117i0 i0Var = this.f26521f;
            if (i0Var != null) {
                return i0Var.mo27492a();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getMinApkVersion() {
        return C10069d.f26459a;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle f = mo27370f();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f26535t);
        getServiceRequest.f26562h = this.f26522g.getPackageName();
        getServiceRequest.f26565k = f;
        if (set != null) {
            getServiceRequest.f26564j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            getServiceRequest.f26566l = mo27364c() != null ? mo27364c() : new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.f26563i = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f26566l = mo27364c();
        }
        getServiceRequest.f26567m = f26515z;
        getServiceRequest.f26568n = mo27366d();
        try {
            synchronized (this.f26526k) {
                if (this.f26527l != null) {
                    this.f26527l.getService(new C10090e(this, this.f26540y.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo27362b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo27358a(8, (IBinder) null, (Bundle) null, this.f26540y.get());
        }
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.f26526k) {
            if (this.f26527l == null) {
                return null;
            }
            IBinder asBinder = this.f26527l.asBinder();
            return asBinder;
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract Set<Scope> mo27379h();

    /* renamed from: i */
    public final T mo27380i() throws DeadObjectException {
        T t;
        synchronized (this.f26525j) {
            if (this.f26532q != 5) {
                mo27355a();
                C10123l.m25517b(this.f26529n != null, "Client is connected but service is null");
                t = this.f26529n;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f26525j) {
            z = this.f26532q == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.f26525j) {
            if (this.f26532q != 2) {
                if (this.f26532q != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo27383j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo27384k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo27385l() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo27386m() {
        return false;
    }

    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27360a(T t) {
        this.f26518c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27356a(int i) {
        this.f26516a = i;
        this.f26517b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27361a(ConnectionResult connectionResult) {
        this.f26519d = connectionResult.getErrorCode();
        this.f26520e = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m25363a(int i, int i2, T t) {
        synchronized (this.f26525j) {
            if (this.f26532q != i) {
                return false;
            }
            m25365b(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27358a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f26524i;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C10093h(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27357a(int i, Bundle bundle, int i2) {
        Handler handler = this.f26524i;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C10092g(i, null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27355a() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: b */
    public void mo27362b(int i) {
        Handler handler = this.f26524i;
        handler.sendMessage(handler.obtainMessage(6, this.f26540y.get(), i));
    }
}
