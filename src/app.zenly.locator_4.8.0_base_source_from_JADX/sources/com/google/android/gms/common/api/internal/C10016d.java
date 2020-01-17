package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C10067c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.C9995b;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.C10116i;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.C10125m;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.util.C10164a;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.internal.base.C10263e;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p214e.p228e.C7571a;
import p214e.p228e.C7573b;

/* renamed from: com.google.android.gms.common.api.internal.d */
public class C10016d implements Callback {

    /* renamed from: n */
    public static final Status f26339n = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Status f26340o = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Object f26341p = new Object();

    /* renamed from: q */
    private static C10016d f26342q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f26343a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f26344b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f26345c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f26346d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10067c f26347e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10116i f26348f;

    /* renamed from: g */
    private final AtomicInteger f26349g = new AtomicInteger(1);

    /* renamed from: h */
    private final AtomicInteger f26350h = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<C10011b<?>, C10017a<?>> f26351i = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10040n f26352j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Set<C10011b<?>> f26353k = new C7573b();

    /* renamed from: l */
    private final Set<C10011b<?>> f26354l = new C7573b();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Handler f26355m;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public class C10017a<O extends ApiOptions> implements ConnectionCallbacks, OnConnectionFailedListener, zar {

        /* renamed from: a */
        private final Queue<C10015c0> f26356a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Client f26357b;

        /* renamed from: c */
        private final AnyClient f26358c;

        /* renamed from: d */
        private final C10011b<O> f26359d;

        /* renamed from: e */
        private final C10061x0 f26360e;

        /* renamed from: f */
        private final Set<C10049r0> f26361f = new HashSet();

        /* renamed from: g */
        private final Map<C10006a<?>, C10012b0> f26362g = new HashMap();

        /* renamed from: h */
        private final int f26363h;

        /* renamed from: i */
        private final C10022e0 f26364i;

        /* renamed from: j */
        private boolean f26365j;

        /* renamed from: k */
        private final List<C10019c> f26366k = new ArrayList();

        /* renamed from: l */
        private ConnectionResult f26367l = null;

        public C10017a(C9995b<O> bVar) {
            this.f26357b = bVar.mo27070a(C10016d.this.f26355m.getLooper(), this);
            Client client = this.f26357b;
            if (client instanceof C10125m) {
                this.f26358c = ((C10125m) client).mo27501n();
            } else {
                this.f26358c = client;
            }
            this.f26359d = bVar.getApiKey();
            this.f26360e = new C10061x0();
            this.f26363h = bVar.mo27080c();
            if (this.f26357b.requiresSignIn()) {
                this.f26364i = bVar.mo27073a(C10016d.this.f26346d, C10016d.this.f26355m);
            } else {
                this.f26364i = null;
            }
        }

        /* renamed from: b */
        private final boolean m25159b(ConnectionResult connectionResult) {
            synchronized (C10016d.f26341p) {
                if (C10016d.this.f26352j == null || !C10016d.this.f26353k.contains(this.f26359d)) {
                    return false;
                }
                C10016d.this.f26352j.mo27227b(connectionResult, this.f26363h);
                return true;
            }
        }

        /* renamed from: c */
        private final void m25163c(C10015c0 c0Var) {
            c0Var.mo27155a(this.f26360e, mo27176d());
            try {
                c0Var.mo27154a(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.f26357b.disconnect();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final void m25164m() {
            mo27182j();
            m25162c(ConnectionResult.RESULT_SUCCESS);
            m25167p();
            Iterator it = this.f26362g.values().iterator();
            while (it.hasNext()) {
                C10012b0 b0Var = (C10012b0) it.next();
                if (m25150a(b0Var.f26333a.mo27204c()) != null) {
                    it.remove();
                } else {
                    try {
                        b0Var.f26333a.mo27202a(this.f26358c, new C10694d());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.f26357b.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m25166o();
            m25168q();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m25165n() {
            mo27182j();
            this.f26365j = true;
            this.f26360e.mo27243c();
            C10016d.this.f26355m.sendMessageDelayed(Message.obtain(C10016d.this.f26355m, 9, this.f26359d), C10016d.this.f26343a);
            C10016d.this.f26355m.sendMessageDelayed(Message.obtain(C10016d.this.f26355m, 11, this.f26359d), C10016d.this.f26344b);
            C10016d.this.f26348f.mo27491a();
        }

        /* renamed from: o */
        private final void m25166o() {
            ArrayList arrayList = new ArrayList(this.f26356a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C10015c0 c0Var = (C10015c0) obj;
                if (!this.f26357b.isConnected()) {
                    return;
                }
                if (m25160b(c0Var)) {
                    this.f26356a.remove(c0Var);
                }
            }
        }

        /* renamed from: p */
        private final void m25167p() {
            if (this.f26365j) {
                C10016d.this.f26355m.removeMessages(11, this.f26359d);
                C10016d.this.f26355m.removeMessages(9, this.f26359d);
                this.f26365j = false;
            }
        }

        /* renamed from: q */
        private final void m25168q() {
            C10016d.this.f26355m.removeMessages(12, this.f26359d);
            C10016d.this.f26355m.sendMessageDelayed(C10016d.this.f26355m.obtainMessage(12, this.f26359d), C10016d.this.f26345c);
        }

        /* renamed from: a */
        public final void mo27170a(ConnectionResult connectionResult) {
            C10123l.m25509a(C10016d.this.f26355m);
            this.f26357b.disconnect();
            onConnectionFailed(connectionResult);
        }

        /* renamed from: d */
        public final boolean mo27176d() {
            return this.f26357b.requiresSignIn();
        }

        /* renamed from: e */
        public final void mo27177e() {
            C10123l.m25509a(C10016d.this.f26355m);
            if (this.f26365j) {
                mo27169a();
            }
        }

        /* renamed from: f */
        public final Client mo27178f() {
            return this.f26357b;
        }

        /* renamed from: g */
        public final void mo27179g() {
            Status status;
            C10123l.m25509a(C10016d.this.f26355m);
            if (this.f26365j) {
                m25167p();
                if (C10016d.this.f26347e.mo27284a(C10016d.this.f26346d) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo27171a(status);
                this.f26357b.disconnect();
            }
        }

        /* renamed from: h */
        public final void mo27180h() {
            C10123l.m25509a(C10016d.this.f26355m);
            mo27171a(C10016d.f26339n);
            this.f26360e.mo27242b();
            for (C10006a q0Var : (C10006a[]) this.f26362g.keySet().toArray(new C10006a[this.f26362g.size()])) {
                mo27172a((C10015c0) new C10047q0(q0Var, new C10694d()));
            }
            m25162c(new ConnectionResult(4));
            if (this.f26357b.isConnected()) {
                this.f26357b.onUserSignOut(new C10058w(this));
            }
        }

        /* renamed from: i */
        public final Map<C10006a<?>, C10012b0> mo27181i() {
            return this.f26362g;
        }

        /* renamed from: j */
        public final void mo27182j() {
            C10123l.m25509a(C10016d.this.f26355m);
            this.f26367l = null;
        }

        /* renamed from: k */
        public final ConnectionResult mo27183k() {
            C10123l.m25509a(C10016d.this.f26355m);
            return this.f26367l;
        }

        /* renamed from: l */
        public final boolean mo27184l() {
            return m25155a(true);
        }

        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == C10016d.this.f26355m.getLooper()) {
                m25164m();
            } else {
                C10016d.this.f26355m.post(new C10050s(this));
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            C10123l.m25509a(C10016d.this.f26355m);
            C10022e0 e0Var = this.f26364i;
            if (e0Var != null) {
                e0Var.mo27197a();
            }
            mo27182j();
            C10016d.this.f26348f.mo27491a();
            m25162c(connectionResult);
            if (connectionResult.getErrorCode() == 4) {
                mo27171a(C10016d.f26340o);
            } else if (this.f26356a.isEmpty()) {
                this.f26367l = connectionResult;
            } else {
                if (!m25159b(connectionResult) && !C10016d.this.mo27167b(connectionResult, this.f26363h)) {
                    if (connectionResult.getErrorCode() == 18) {
                        this.f26365j = true;
                    }
                    if (this.f26365j) {
                        C10016d.this.f26355m.sendMessageDelayed(Message.obtain(C10016d.this.f26355m, 9, this.f26359d), C10016d.this.f26343a);
                        return;
                    }
                    String a = this.f26359d.mo27147a();
                    String valueOf = String.valueOf(connectionResult);
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 63 + String.valueOf(valueOf).length());
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    mo27171a(new Status(17, sb.toString()));
                }
            }
        }

        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == C10016d.this.f26355m.getLooper()) {
                m25165n();
            } else {
                C10016d.this.f26355m.post(new C10054u(this));
            }
        }

        public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == C10016d.this.f26355m.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                C10016d.this.f26355m.post(new C10052t(this, connectionResult));
            }
        }

        /* renamed from: a */
        public final void mo27172a(C10015c0 c0Var) {
            C10123l.m25509a(C10016d.this.f26355m);
            if (!this.f26357b.isConnected()) {
                this.f26356a.add(c0Var);
                ConnectionResult connectionResult = this.f26367l;
                if (connectionResult == null || !connectionResult.hasResolution()) {
                    mo27169a();
                } else {
                    onConnectionFailed(this.f26367l);
                }
            } else if (m25160b(c0Var)) {
                m25168q();
            } else {
                this.f26356a.add(c0Var);
            }
        }

        /* renamed from: c */
        private final void m25162c(ConnectionResult connectionResult) {
            for (C10049r0 r0Var : this.f26361f) {
                String str = null;
                if (C10120k.m25501a(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.f26357b.getEndpointPackageName();
                }
                r0Var.mo27225a(this.f26359d, connectionResult, str);
            }
            this.f26361f.clear();
        }

        /* renamed from: b */
        private final boolean m25160b(C10015c0 c0Var) {
            if (!(c0Var instanceof C10046q)) {
                m25163c(c0Var);
                return true;
            }
            C10046q qVar = (C10046q) c0Var;
            Feature a = m25150a(qVar.mo27222b(this));
            if (a == null) {
                m25163c(c0Var);
                return true;
            }
            if (qVar.mo27223c(this)) {
                C10019c cVar = new C10019c(this.f26359d, a, null);
                int indexOf = this.f26366k.indexOf(cVar);
                if (indexOf >= 0) {
                    C10019c cVar2 = (C10019c) this.f26366k.get(indexOf);
                    C10016d.this.f26355m.removeMessages(15, cVar2);
                    C10016d.this.f26355m.sendMessageDelayed(Message.obtain(C10016d.this.f26355m, 15, cVar2), C10016d.this.f26343a);
                } else {
                    this.f26366k.add(cVar);
                    C10016d.this.f26355m.sendMessageDelayed(Message.obtain(C10016d.this.f26355m, 15, cVar), C10016d.this.f26343a);
                    C10016d.this.f26355m.sendMessageDelayed(Message.obtain(C10016d.this.f26355m, 16, cVar), C10016d.this.f26344b);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!m25159b(connectionResult)) {
                        C10016d.this.mo27167b(connectionResult, this.f26363h);
                    }
                }
            } else {
                qVar.mo27156a((RuntimeException) new UnsupportedApiCallException(a));
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo27175c() {
            return this.f26357b.isConnected();
        }

        /* renamed from: a */
        public final void mo27171a(Status status) {
            C10123l.m25509a(C10016d.this.f26355m);
            for (C10015c0 a : this.f26356a) {
                a.mo27153a(status);
            }
            this.f26356a.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m25155a(boolean z) {
            C10123l.m25509a(C10016d.this.f26355m);
            if (!this.f26357b.isConnected() || this.f26362g.size() != 0) {
                return false;
            }
            if (this.f26360e.mo27241a()) {
                if (z) {
                    m25168q();
                }
                return false;
            }
            this.f26357b.disconnect();
            return true;
        }

        /* renamed from: a */
        public final void mo27169a() {
            C10123l.m25509a(C10016d.this.f26355m);
            if (!this.f26357b.isConnected() && !this.f26357b.isConnecting()) {
                int a = C10016d.this.f26348f.mo27490a(C10016d.this.f26346d, this.f26357b);
                if (a != 0) {
                    onConnectionFailed(new ConnectionResult(a, null));
                    return;
                }
                C10018b bVar = new C10018b(this.f26357b, this.f26359d);
                if (this.f26357b.requiresSignIn()) {
                    this.f26364i.mo27198a((zacf) bVar);
                }
                this.f26357b.connect(bVar);
            }
        }

        /* renamed from: a */
        public final void mo27173a(C10049r0 r0Var) {
            C10123l.m25509a(C10016d.this.f26355m);
            this.f26361f.add(r0Var);
        }

        /* renamed from: b */
        public final int mo27174b() {
            return this.f26363h;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m25158b(C10019c cVar) {
            if (this.f26366k.remove(cVar)) {
                C10016d.this.f26355m.removeMessages(15, cVar);
                C10016d.this.f26355m.removeMessages(16, cVar);
                Feature b = cVar.f26376b;
                ArrayList arrayList = new ArrayList(this.f26356a.size());
                for (C10015c0 c0Var : this.f26356a) {
                    if (c0Var instanceof C10046q) {
                        Feature[] b2 = ((C10046q) c0Var).mo27222b(this);
                        if (b2 != null && C10164a.m25655a((T[]) b2, b)) {
                            arrayList.add(c0Var);
                        }
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C10015c0 c0Var2 = (C10015c0) obj;
                    this.f26356a.remove(c0Var2);
                    c0Var2.mo27156a((RuntimeException) new UnsupportedApiCallException(b));
                }
            }
        }

        /* renamed from: a */
        private final Feature m25150a(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.f26357b.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                C7571a aVar = new C7571a(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    aVar.put(feature.mo26998a(), Long.valueOf(feature.mo26999b()));
                }
                for (Feature feature2 : featureArr) {
                    if (!aVar.containsKey(feature2.mo26998a()) || ((Long) aVar.get(feature2.mo26998a())).longValue() < feature2.mo26999b()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m25153a(C10019c cVar) {
            if (this.f26366k.contains(cVar) && !this.f26365j) {
                if (!this.f26357b.isConnected()) {
                    mo27169a();
                    return;
                }
                m25166o();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    private class C10018b implements zacf, ConnectionProgressReportCallbacks {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Client f26369a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C10011b<?> f26370b;

        /* renamed from: c */
        private IAccountAccessor f26371c = null;

        /* renamed from: d */
        private Set<Scope> f26372d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f26373e = false;

        public C10018b(Client client, C10011b<?> bVar) {
            this.f26369a = client;
            this.f26370b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m25186a() {
            if (this.f26373e) {
                IAccountAccessor iAccountAccessor = this.f26371c;
                if (iAccountAccessor != null) {
                    this.f26369a.getRemoteService(iAccountAccessor, this.f26372d);
                }
            }
        }

        public final void onReportServiceBinding(ConnectionResult connectionResult) {
            C10016d.this.f26355m.post(new C10062y(this, connectionResult));
        }

        public final void zaa(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                zag(new ConnectionResult(4));
                return;
            }
            this.f26371c = iAccountAccessor;
            this.f26372d = set;
            m25186a();
        }

        public final void zag(ConnectionResult connectionResult) {
            ((C10017a) C10016d.this.f26351i.get(this.f26370b)).mo27170a(connectionResult);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$c */
    private static class C10019c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C10011b<?> f26375a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f26376b;

        private C10019c(C10011b<?> bVar, Feature feature) {
            this.f26375a = bVar;
            this.f26376b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C10019c)) {
                C10019c cVar = (C10019c) obj;
                if (C10120k.m25501a(this.f26375a, cVar.f26375a) && C10120k.m25501a(this.f26376b, cVar.f26376b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return C10120k.m25499a(this.f26375a, this.f26376b);
        }

        public final String toString() {
            C10121a a = C10120k.m25500a((Object) this);
            a.mo27499a("key", this.f26375a);
            a.mo27499a("feature", this.f26376b);
            return a.toString();
        }

        /* synthetic */ C10019c(C10011b bVar, Feature feature, C10048r rVar) {
            this(bVar, feature);
        }
    }

    private C10016d(Context context, Looper looper, C10067c cVar) {
        this.f26346d = context;
        this.f26355m = new C10263e(looper, this);
        this.f26347e = cVar;
        this.f26348f = new C10116i(cVar);
        Handler handler = this.f26355m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static C10016d m25126a(Context context) {
        C10016d dVar;
        synchronized (f26341p) {
            if (f26342q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f26342q = new C10016d(context.getApplicationContext(), handlerThread.getLooper(), C10067c.m25293a());
            }
            dVar = f26342q;
        }
        return dVar;
    }

    /* renamed from: b */
    private final void m25128b(C9995b<?> bVar) {
        C10011b apiKey = bVar.getApiKey();
        C10017a aVar = (C10017a) this.f26351i.get(apiKey);
        if (aVar == null) {
            aVar = new C10017a(bVar);
            this.f26351i.put(apiKey, aVar);
        }
        if (aVar.mo27176d()) {
            this.f26354l.add(apiKey);
        }
        aVar.mo27169a();
    }

    public boolean handleMessage(Message message) {
        C10017a aVar;
        int i = message.what;
        long j = 300000;
        String str = "GoogleApiManager";
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f26345c = j;
                this.f26355m.removeMessages(12);
                for (C10011b bVar : this.f26351i.keySet()) {
                    Handler handler = this.f26355m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f26345c);
                }
                break;
            case 2:
                C10049r0 r0Var = (C10049r0) message.obj;
                Iterator it = r0Var.mo27224a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C10011b bVar2 = (C10011b) it.next();
                        C10017a aVar2 = (C10017a) this.f26351i.get(bVar2);
                        if (aVar2 == null) {
                            r0Var.mo27225a(bVar2, new ConnectionResult(13), null);
                            break;
                        } else if (aVar2.mo27175c()) {
                            r0Var.mo27225a(bVar2, ConnectionResult.RESULT_SUCCESS, aVar2.mo27178f().getEndpointPackageName());
                        } else if (aVar2.mo27183k() != null) {
                            r0Var.mo27225a(bVar2, aVar2.mo27183k(), null);
                        } else {
                            aVar2.mo27173a(r0Var);
                            aVar2.mo27169a();
                        }
                    }
                }
            case 3:
                for (C10017a aVar3 : this.f26351i.values()) {
                    aVar3.mo27182j();
                    aVar3.mo27169a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C10009a0 a0Var = (C10009a0) message.obj;
                C10017a aVar4 = (C10017a) this.f26351i.get(a0Var.f26325c.getApiKey());
                if (aVar4 == null) {
                    m25128b(a0Var.f26325c);
                    aVar4 = (C10017a) this.f26351i.get(a0Var.f26325c.getApiKey());
                }
                if (aVar4.mo27176d() && this.f26350h.get() != a0Var.f26324b) {
                    a0Var.f26323a.mo27153a(f26339n);
                    aVar4.mo27180h();
                    break;
                } else {
                    aVar4.mo27172a(a0Var.f26323a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f26351i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = (C10017a) it2.next();
                        if (aVar.mo27174b() == i2) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf(str, sb.toString(), new Exception());
                    break;
                } else {
                    String a = this.f26347e.mo27291a(connectionResult.getErrorCode());
                    String errorMessage = connectionResult.getErrorMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 69 + String.valueOf(errorMessage).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(a);
                    sb2.append(": ");
                    sb2.append(errorMessage);
                    aVar.mo27171a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C10174k.m25678a() && (this.f26346d.getApplicationContext() instanceof Application)) {
                    BackgroundDetector.m25075a((Application) this.f26346d.getApplicationContext());
                    BackgroundDetector.m25076b().mo27091a((BackgroundStateChangeListener) new C10048r(this));
                    if (!BackgroundDetector.m25076b().mo27093a(true)) {
                        this.f26345c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m25128b((C9995b) message.obj);
                break;
            case 9:
                if (this.f26351i.containsKey(message.obj)) {
                    ((C10017a) this.f26351i.get(message.obj)).mo27177e();
                    break;
                }
                break;
            case 10:
                for (C10011b remove : this.f26354l) {
                    ((C10017a) this.f26351i.remove(remove)).mo27180h();
                }
                this.f26354l.clear();
                break;
            case 11:
                if (this.f26351i.containsKey(message.obj)) {
                    ((C10017a) this.f26351i.get(message.obj)).mo27179g();
                    break;
                }
                break;
            case 12:
                if (this.f26351i.containsKey(message.obj)) {
                    ((C10017a) this.f26351i.get(message.obj)).mo27184l();
                    break;
                }
                break;
            case 14:
                C10042o oVar = (C10042o) message.obj;
                C10011b a2 = oVar.mo27220a();
                if (this.f26351i.containsKey(a2)) {
                    oVar.mo27221b().mo29327a(Boolean.valueOf(((C10017a) this.f26351i.get(a2)).m25155a(false)));
                    break;
                } else {
                    oVar.mo27221b().mo29327a(Boolean.valueOf(false));
                    break;
                }
            case 15:
                C10019c cVar = (C10019c) message.obj;
                if (this.f26351i.containsKey(cVar.f26375a)) {
                    ((C10017a) this.f26351i.get(cVar.f26375a)).m25153a(cVar);
                    break;
                }
                break;
            case 16:
                C10019c cVar2 = (C10019c) message.obj;
                if (this.f26351i.containsKey(cVar2.f26375a)) {
                    ((C10017a) this.f26351i.get(cVar2.f26375a)).m25158b(cVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w(str, sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27166b(C10040n nVar) {
        synchronized (f26341p) {
            if (this.f26352j == nVar) {
                this.f26352j = null;
                this.f26353k.clear();
            }
        }
    }

    /* renamed from: a */
    public final int mo27157a() {
        return this.f26349g.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo27161a(C9995b<?> bVar) {
        Handler handler = this.f26355m;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    /* renamed from: a */
    public final void mo27164a(C10040n nVar) {
        synchronized (f26341p) {
            if (this.f26352j != nVar) {
                this.f26352j = nVar;
                this.f26353k.clear();
            }
            this.f26353k.addAll(nVar.mo27218h());
        }
    }

    /* renamed from: b */
    public final void mo27165b() {
        Handler handler = this.f26355m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo27167b(ConnectionResult connectionResult, int i) {
        return this.f26347e.mo27293a(this.f26346d, connectionResult, i);
    }

    /* renamed from: a */
    public final <O extends ApiOptions> void mo27162a(C9995b<O> bVar, int i, C10014c<? extends Result, AnyClient> cVar) {
        C10039m0 m0Var = new C10039m0(i, cVar);
        Handler handler = this.f26355m;
        handler.sendMessage(handler.obtainMessage(4, new C10009a0(m0Var, this.f26350h.get(), bVar)));
    }

    /* renamed from: a */
    public final <O extends ApiOptions, ResultT> void mo27163a(C9995b<O> bVar, int i, C10029i<AnyClient, ResultT> iVar, C10694d<ResultT> dVar, StatusExceptionMapper statusExceptionMapper) {
        C10043o0 o0Var = new C10043o0(i, iVar, dVar, statusExceptionMapper);
        Handler handler = this.f26355m;
        handler.sendMessage(handler.obtainMessage(4, new C10009a0(o0Var, this.f26350h.get(), bVar)));
    }

    /* renamed from: a */
    public final <O extends ApiOptions> C10693c<Void> mo27159a(C9995b<O> bVar, C10025g<AnyClient, ?> gVar, C10034k<AnyClient, ?> kVar) {
        C10694d dVar = new C10694d();
        C10045p0 p0Var = new C10045p0(new C10012b0(gVar, kVar), dVar);
        Handler handler = this.f26355m;
        handler.sendMessage(handler.obtainMessage(8, new C10009a0(p0Var, this.f26350h.get(), bVar)));
        return dVar.mo29325a();
    }

    /* renamed from: a */
    public final <O extends ApiOptions> C10693c<Boolean> mo27158a(C9995b<O> bVar, C10006a<?> aVar) {
        C10694d dVar = new C10694d();
        C10047q0 q0Var = new C10047q0(aVar, dVar);
        Handler handler = this.f26355m;
        handler.sendMessage(handler.obtainMessage(13, new C10009a0(q0Var, this.f26350h.get(), bVar)));
        return dVar.mo29325a();
    }

    /* renamed from: a */
    public final void mo27160a(ConnectionResult connectionResult, int i) {
        if (!mo27167b(connectionResult, i)) {
            Handler handler = this.f26355m;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
