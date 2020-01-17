package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.g */
class C11870g {

    /* renamed from: a */
    final C11873b f30746a = new C11873b();

    /* renamed from: b */
    final Context f30747b;

    /* renamed from: c */
    final ExecutorService f30748c;

    /* renamed from: d */
    final Downloader f30749d;

    /* renamed from: e */
    final Map<String, C11859c> f30750e;

    /* renamed from: f */
    final Map<Object, C11849a> f30751f;

    /* renamed from: g */
    final Map<Object, C11849a> f30752g;

    /* renamed from: h */
    final Set<Object> f30753h;

    /* renamed from: i */
    final Handler f30754i;

    /* renamed from: j */
    final Handler f30755j;

    /* renamed from: k */
    final Cache f30756k;

    /* renamed from: l */
    final C11896w f30757l;

    /* renamed from: m */
    final List<C11859c> f30758m;

    /* renamed from: n */
    final C11874c f30759n;

    /* renamed from: o */
    final boolean f30760o;

    /* renamed from: p */
    boolean f30761p;

    /* renamed from: com.squareup.picasso.g$a */
    private static class C11871a extends Handler {

        /* renamed from: a */
        private final C11870g f30762a;

        /* renamed from: com.squareup.picasso.g$a$a */
        class C11872a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Message f30763e;

            C11872a(C11871a aVar, Message message) {
                this.f30763e = message;
            }

            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown handler message received: ");
                sb.append(this.f30763e.what);
                throw new AssertionError(sb.toString());
            }
        }

        public C11871a(Looper looper, C11870g gVar) {
            super(looper);
            this.f30762a = gVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f30762a.mo35111d((C11849a) message.obj);
                    return;
                case 2:
                    this.f30762a.mo35109c((C11849a) message.obj);
                    return;
                case 4:
                    this.f30762a.mo35112d((C11859c) message.obj);
                    return;
                case 5:
                    this.f30762a.mo35113e((C11859c) message.obj);
                    return;
                case 6:
                    this.f30762a.mo35101a((C11859c) message.obj, false);
                    return;
                case 7:
                    this.f30762a.mo35096a();
                    return;
                case 9:
                    this.f30762a.mo35104b((NetworkInfo) message.obj);
                    return;
                case 10:
                    C11870g gVar = this.f30762a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    gVar.mo35108b(z);
                    return;
                case 11:
                    this.f30762a.mo35102a(message.obj);
                    return;
                case 12:
                    this.f30762a.mo35107b(message.obj);
                    return;
                default:
                    Picasso.f30656p.post(new C11872a(this, message));
                    return;
            }
        }
    }

    /* renamed from: com.squareup.picasso.g$b */
    static class C11873b extends HandlerThread {
        C11873b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.g$c */
    static class C11874c extends BroadcastReceiver {

        /* renamed from: a */
        private final C11870g f30764a;

        C11874c(C11870g gVar) {
            this.f30764a = gVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35116a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f30764a.f30760o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f30764a.f30747b.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    String str = "state";
                    if (intent.hasExtra(str)) {
                        this.f30764a.mo35103a(intent.getBooleanExtra(str, false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f30764a.mo35097a(((ConnectivityManager) C11851a0.m31103a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    C11870g(Context context, ExecutorService executorService, Handler handler, Downloader downloader, Cache cache, C11896w wVar) {
        this.f30746a.start();
        C11851a0.m31110a(this.f30746a.getLooper());
        this.f30747b = context;
        this.f30748c = executorService;
        this.f30750e = new LinkedHashMap();
        this.f30751f = new WeakHashMap();
        this.f30752g = new WeakHashMap();
        this.f30753h = new HashSet();
        this.f30754i = new C11871a(this.f30746a.getLooper(), this);
        this.f30749d = downloader;
        this.f30755j = handler;
        this.f30756k = cache;
        this.f30757l = wVar;
        this.f30758m = new ArrayList(4);
        this.f30761p = C11851a0.m31121d(this.f30747b);
        this.f30760o = C11851a0.m31117b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.f30759n = new C11874c(this);
        this.f30759n.mo35116a();
    }

    /* renamed from: f */
    private void m31165f(C11859c cVar) {
        if (!cVar.mo35085m()) {
            this.f30758m.add(cVar);
            if (!this.f30754i.hasMessages(7)) {
                this.f30754i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: g */
    private void m31166g(C11859c cVar) {
        C11849a b = cVar.mo35073b();
        if (b != null) {
            m31164e(b);
        }
        List c = cVar.mo35075c();
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                m31164e((C11849a) c.get(i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35098a(C11849a aVar) {
        Handler handler = this.f30754i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35105b(C11849a aVar) {
        Handler handler = this.f30754i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo35110c(C11859c cVar) {
        Handler handler = this.f30754i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo35111d(C11849a aVar) {
        mo35099a(aVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo35113e(C11859c cVar) {
        if (!cVar.mo35085m()) {
            boolean z = false;
            if (this.f30748c.isShutdown()) {
                mo35101a(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f30760o) {
                networkInfo = ((ConnectivityManager) C11851a0.m31103a(this.f30747b, "connectivity")).getActiveNetworkInfo();
            }
            boolean z2 = networkInfo != null && networkInfo.isConnected();
            boolean a = cVar.mo35072a(this.f30761p, networkInfo);
            boolean n = cVar.mo35086n();
            if (!a) {
                if (this.f30760o && n) {
                    z = true;
                }
                mo35101a(cVar, z);
                if (z) {
                    m31166g(cVar);
                }
            } else if (!this.f30760o || z2) {
                if (cVar.mo35081i().f30671n) {
                    C11851a0.m31112a("Dispatcher", "retrying", C11851a0.m31105a(cVar));
                }
                if (cVar.mo35077e() instanceof C11884a) {
                    cVar.f30724m |= C11882n.NO_CACHE.f30794e;
                }
                cVar.f30729r = this.f30748c.submit(cVar);
            } else {
                mo35101a(cVar, n);
                if (n) {
                    m31166g(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35100a(C11859c cVar) {
        Handler handler = this.f30754i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35106b(C11859c cVar) {
        Handler handler = this.f30754i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo35109c(C11849a aVar) {
        String c = aVar.mo35055c();
        C11859c cVar = (C11859c) this.f30750e.get(c);
        String str = "canceled";
        String str2 = "Dispatcher";
        if (cVar != null) {
            cVar.mo35074b(aVar);
            if (cVar.mo35071a()) {
                this.f30750e.remove(c);
                if (aVar.mo35058f().f30671n) {
                    C11851a0.m31112a(str2, str, aVar.mo35060h().mo35144d());
                }
            }
        }
        if (this.f30753h.contains(aVar.mo35061i())) {
            this.f30752g.remove(aVar.mo35062j());
            if (aVar.mo35058f().f30671n) {
                C11851a0.m31113a(str2, str, aVar.mo35060h().mo35144d(), "because paused request got canceled");
            }
        }
        C11849a aVar2 = (C11849a) this.f30751f.remove(aVar.mo35062j());
        if (aVar2 != null && aVar2.mo35058f().f30671n) {
            C11851a0.m31113a(str2, str, aVar2.mo35060h().mo35144d(), "from replaying");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo35112d(C11859c cVar) {
        if (C11881m.m31203b(cVar.mo35080h())) {
            this.f30756k.set(cVar.mo35078f(), cVar.mo35083k());
        }
        this.f30750e.remove(cVar.mo35078f());
        m31165f(cVar);
        if (cVar.mo35081i().f30671n) {
            C11851a0.m31113a("Dispatcher", "batched", C11851a0.m31105a(cVar), "for completion");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35097a(NetworkInfo networkInfo) {
        Handler handler = this.f30754i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35107b(Object obj) {
        if (this.f30753h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator it = this.f30752g.values().iterator();
            while (it.hasNext()) {
                C11849a aVar = (C11849a) it.next();
                if (aVar.mo35061i().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f30755j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35103a(boolean z) {
        Handler handler = this.f30754i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35099a(C11849a aVar, boolean z) {
        String str = "Dispatcher";
        if (this.f30753h.contains(aVar.mo35061i())) {
            this.f30752g.put(aVar.mo35062j(), aVar);
            if (aVar.mo35058f().f30671n) {
                String d = aVar.f30697b.mo35144d();
                StringBuilder sb = new StringBuilder();
                sb.append("because tag '");
                sb.append(aVar.mo35061i());
                sb.append("' is paused");
                C11851a0.m31113a(str, "paused", d, sb.toString());
            }
            return;
        }
        C11859c cVar = (C11859c) this.f30750e.get(aVar.mo35055c());
        if (cVar != null) {
            cVar.mo35070a(aVar);
        } else if (this.f30748c.isShutdown()) {
            if (aVar.mo35058f().f30671n) {
                C11851a0.m31113a(str, "ignored", aVar.f30697b.mo35144d(), "because shut down");
            }
        } else {
            C11859c a = C11859c.m31131a(aVar.mo35058f(), this, this.f30756k, this.f30757l, aVar);
            a.f30729r = this.f30748c.submit(a);
            this.f30750e.put(aVar.mo35055c(), a);
            if (z) {
                this.f30751f.remove(aVar.mo35062j());
            }
            if (aVar.mo35058f().f30671n) {
                C11851a0.m31112a(str, "enqueued", aVar.f30697b.mo35144d());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35108b(boolean z) {
        this.f30761p = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35104b(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f30748c;
        if (executorService instanceof C11887r) {
            ((C11887r) executorService).mo35137a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m31163b();
        }
    }

    /* renamed from: b */
    private void m31163b() {
        if (!this.f30751f.isEmpty()) {
            Iterator it = this.f30751f.values().iterator();
            while (it.hasNext()) {
                C11849a aVar = (C11849a) it.next();
                it.remove();
                if (aVar.mo35058f().f30671n) {
                    C11851a0.m31112a("Dispatcher", "replaying", aVar.mo35060h().mo35144d());
                }
                mo35099a(aVar, false);
            }
        }
    }

    /* renamed from: e */
    private void m31164e(C11849a aVar) {
        Object j = aVar.mo35062j();
        if (j != null) {
            aVar.f30706k = true;
            this.f30751f.put(j, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35102a(Object obj) {
        if (this.f30753h.add(obj)) {
            Iterator it = this.f30750e.values().iterator();
            while (it.hasNext()) {
                C11859c cVar = (C11859c) it.next();
                boolean z = cVar.mo35081i().f30671n;
                C11849a b = cVar.mo35073b();
                List c = cVar.mo35075c();
                boolean z2 = c != null && !c.isEmpty();
                if (b != null || z2) {
                    String str = "' was paused";
                    String str2 = "because tag '";
                    String str3 = "paused";
                    String str4 = "Dispatcher";
                    if (b != null && b.mo35061i().equals(obj)) {
                        cVar.mo35074b(b);
                        this.f30752g.put(b.mo35062j(), b);
                        if (z) {
                            String d = b.f30697b.mo35144d();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(obj);
                            sb.append(str);
                            C11851a0.m31113a(str4, str3, d, sb.toString());
                        }
                    }
                    if (z2) {
                        for (int size = c.size() - 1; size >= 0; size--) {
                            C11849a aVar = (C11849a) c.get(size);
                            if (aVar.mo35061i().equals(obj)) {
                                cVar.mo35074b(aVar);
                                this.f30752g.put(aVar.mo35062j(), aVar);
                                if (z) {
                                    String d2 = aVar.f30697b.mo35144d();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    sb2.append(obj);
                                    sb2.append(str);
                                    C11851a0.m31113a(str4, str3, d2, sb2.toString());
                                }
                            }
                        }
                    }
                    if (cVar.mo35071a()) {
                        it.remove();
                        if (z) {
                            C11851a0.m31113a(str4, "canceled", C11851a0.m31105a(cVar), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35096a() {
        ArrayList arrayList = new ArrayList(this.f30758m);
        this.f30758m.clear();
        Handler handler = this.f30755j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m31162a((List<C11859c>) arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35101a(C11859c cVar, boolean z) {
        if (cVar.mo35081i().f30671n) {
            String a = C11851a0.m31105a(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            C11851a0.m31113a("Dispatcher", "batched", a, sb.toString());
        }
        this.f30750e.remove(cVar.mo35078f());
        m31165f(cVar);
    }

    /* renamed from: a */
    private void m31162a(List<C11859c> list) {
        if (list != null && !list.isEmpty() && ((C11859c) list.get(0)).mo35081i().f30671n) {
            StringBuilder sb = new StringBuilder();
            for (C11859c cVar : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C11851a0.m31105a(cVar));
            }
            C11851a0.m31112a("Dispatcher", "delivered", sb.toString());
        }
    }
}
