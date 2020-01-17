package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.mapbox.android.telemetry.C11324a1.C11327c;
import com.mapbox.android.telemetry.Event.C11300a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C13167a0;
import okhttp3.C13170b0;
import okhttp3.C13325v;
import okhttp3.Call;
import okhttp3.Callback;

/* renamed from: com.mapbox.android.telemetry.i0 */
public class C11354i0 implements C11329b0, C11391s0 {

    /* renamed from: m */
    private static AtomicReference<String> f29433m = new AtomicReference<>();

    /* renamed from: n */
    static Context f29434n = null;

    /* renamed from: a */
    private String f29435a;

    /* renamed from: b */
    private final C11394u f29436b;

    /* renamed from: c */
    private C11402w0 f29437c;

    /* renamed from: d */
    private Callback f29438d;

    /* renamed from: e */
    private final C11385p0 f29439e;

    /* renamed from: f */
    private C11365k f29440f = null;

    /* renamed from: g */
    private final C11324a1 f29441g;

    /* renamed from: h */
    private CopyOnWriteArraySet<TelemetryListener> f29442h = null;

    /* renamed from: i */
    private C11341g f29443i;

    /* renamed from: j */
    private CopyOnWriteArraySet<AttachmentListener> f29444j = null;

    /* renamed from: k */
    private C11383p f29445k;

    /* renamed from: l */
    private final ExecutorService f29446l;

    /* renamed from: com.mapbox.android.telemetry.i0$a */
    class C11355a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ long f29447e;

        C11355a(C11354i0 i0Var, long j) {
            this.f29447e = j;
        }

        public void run() {
            Editor edit = C11330b1.m29179f(C11354i0.f29434n).edit();
            edit.putLong("mapboxSessionRotationInterval", TimeUnit.HOURS.toMillis(this.f29447e));
            edit.apply();
        }
    }

    /* renamed from: com.mapbox.android.telemetry.i0$b */
    class C11356b implements C11382o0 {
        C11356b() {
        }

        /* renamed from: a */
        public void mo33003a() {
            C11354i0.this.m29248d();
        }
    }

    /* renamed from: com.mapbox.android.telemetry.i0$c */
    class C11357c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ List f29449e;

        C11357c(List list) {
            this.f29449e = list;
        }

        public void run() {
            C11354i0.this.m29246c(this.f29449e);
        }
    }

    /* renamed from: com.mapbox.android.telemetry.i0$d */
    class C11358d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ List f29451e;

        C11358d(List list) {
            this.f29451e = list;
        }

        public void run() {
            C11354i0.this.m29246c(this.f29451e);
        }
    }

    /* renamed from: com.mapbox.android.telemetry.i0$e */
    class C11359e implements Runnable {

        /* renamed from: e */
        final /* synthetic */ boolean f29453e;

        C11359e(C11354i0 i0Var, boolean z) {
            this.f29453e = z;
        }

        public void run() {
            Editor edit = C11330b1.m29179f(C11354i0.f29434n).edit();
            edit.putBoolean("mapboxTelemetryLocationState", this.f29453e);
            edit.apply();
        }
    }

    /* renamed from: com.mapbox.android.telemetry.i0$f */
    static class C11360f implements Callback {

        /* renamed from: a */
        final /* synthetic */ Set f29454a;

        C11360f(Set set) {
            this.f29454a = set;
        }

        public void onFailure(Call call, IOException iOException) {
            for (TelemetryListener onHttpFailure : this.f29454a) {
                onHttpFailure.onHttpFailure(iOException.getMessage());
            }
        }

        public void onResponse(Call call, C13167a0 a0Var) throws IOException {
            C13170b0 a = a0Var.mo37789a();
            if (a != null) {
                a.close();
            }
            for (TelemetryListener onHttpResponse : this.f29454a) {
                onHttpResponse.onHttpResponse(a0Var.mo37796g(), a0Var.mo37793d());
            }
        }
    }

    /* renamed from: com.mapbox.android.telemetry.i0$g */
    private static final class C11361g {

        /* renamed from: com.mapbox.android.telemetry.i0$g$a */
        static class C11362a implements ThreadFactory {

            /* renamed from: e */
            final /* synthetic */ String f29455e;

            C11362a(String str) {
                this.f29455e = str;
            }

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.f29455e);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized ExecutorService m29271b(String str, int i, long j) {
            ThreadPoolExecutor threadPoolExecutor;
            synchronized (C11361g.class) {
                threadPoolExecutor = new ThreadPoolExecutor(0, i, j, TimeUnit.SECONDS, new LinkedBlockingQueue(), m29270a(str));
            }
            return threadPoolExecutor;
        }

        /* renamed from: a */
        private static ThreadFactory m29270a(String str) {
            return new C11362a(str);
        }
    }

    public C11354i0(Context context, String str, String str2) {
        m29234a(context);
        f29433m.set(str);
        this.f29435a = str2;
        this.f29439e = new C11387q0(f29434n, m29255i()).mo33041a();
        this.f29441g = new C11324a1(true);
        m29253g();
        m29250e();
        this.f29438d = m29233a((Set<TelemetryListener>) this.f29442h);
        this.f29446l = C11361g.m29271b("MapboxTelemetryExecutor", 3, 20);
        this.f29436b = C11394u.m29337a(this, this.f29446l);
    }

    /* renamed from: c */
    private C11402w0 m29244c(String str, String str2) {
        this.f29437c = new C11407y0(str, C11330b1.m29168a(str2, f29434n), new C11338e0(), this.f29443i).mo33058a(f29434n);
        return this.f29437c;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m29248d() {
        List a = this.f29436b.mo33049a();
        if (!a.isEmpty()) {
            m29237a((Runnable) new C11357c(a));
        }
    }

    /* renamed from: e */
    private void m29250e() {
        this.f29444j = new CopyOnWriteArraySet<>();
    }

    /* renamed from: f */
    private void m29252f() {
        if (this.f29445k == null) {
            Context context = f29434n;
            this.f29445k = new C11383p(context, C11330b1.m29168a(this.f29435a, context), (String) f29433m.get(), new C13325v());
        }
        if (this.f29443i == null) {
            this.f29443i = new C11341g(f29434n, this.f29445k);
        }
        if (this.f29437c == null) {
            this.f29437c = m29244c((String) f29433m.get(), this.f29435a);
        }
    }

    /* renamed from: g */
    private void m29253g() {
        this.f29442h = new CopyOnWriteArraySet<>();
    }

    /* renamed from: h */
    private boolean m29254h() {
        boolean z = false;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f29434n.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            z = activeNetworkInfo.isConnected();
            return z;
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private C11322a m29255i() {
        return new C11322a(new C11356b());
    }

    /* renamed from: j */
    private C11365k m29256j() {
        if (this.f29440f == null) {
            this.f29440f = new C11365k();
        }
        return this.f29440f;
    }

    /* renamed from: k */
    private void m29257k() {
        this.f29439e.register();
        this.f29439e.mo32970a(m29256j().mo33012a());
    }

    /* renamed from: l */
    private void m29258l() {
        if (C11327c.ENABLED.equals(this.f29441g.mo32969a())) {
            m29257k();
            m29241b(true);
        }
    }

    /* renamed from: m */
    private void m29259m() {
        if (C11327c.ENABLED.equals(this.f29441g.mo32969a())) {
            m29248d();
            m29260n();
            m29241b(false);
        }
    }

    /* renamed from: n */
    private void m29260n() {
        this.f29439e.unregister();
    }

    /* renamed from: b */
    public boolean mo33001b() {
        if (!C11324a1.m29162a(f29434n)) {
            return false;
        }
        m29258l();
        return true;
    }

    /* renamed from: e */
    private boolean m29251e(Event event) {
        if (C11300a.TURNSTILE.equals(event.mo32828a())) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(event);
            m29237a((Runnable) new C11358d(arrayList));
            return true;
        } else if (!C11300a.VIS_ATTACHMENT.equals(event.mo32828a())) {
            return false;
        } else {
            m29249d(event);
            return true;
        }
    }

    /* renamed from: b */
    private boolean m29243b(String str, String str2) {
        return m29238a(str) && m29242b(str2);
    }

    /* renamed from: a */
    public void mo32973a(List<Event> list) {
        if (C11327c.ENABLED.equals(this.f29441g.mo32969a()) && !C11330b1.m29169a(f29434n)) {
            m29246c(list);
        }
    }

    /* renamed from: b */
    private boolean m29242b(String str) {
        if (C11330b1.m29170a(str)) {
            return false;
        }
        this.f29435a = str;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m29246c(List<Event> list) {
        if (m29254h()) {
            m29240b(list);
        }
    }

    /* renamed from: b */
    private void m29240b(List<Event> list) {
        if (mo33000a((String) f29433m.get(), this.f29435a)) {
            this.f29437c.mo33054a(list, this.f29438d);
        }
    }

    /* renamed from: d */
    private void m29249d(Event event) {
        if (m29245c().booleanValue()) {
            this.f29437c.mo33053a(m29239b(event), this.f29444j);
        }
    }

    /* renamed from: a */
    public boolean mo32998a(Event event) {
        if (m29251e(event)) {
            return true;
        }
        return m29247c(event);
    }

    /* renamed from: b */
    private synchronized void m29241b(boolean z) {
        m29237a((Runnable) new C11359e(this, z));
    }

    /* renamed from: c */
    private boolean m29247c(Event event) {
        if (C11327c.ENABLED.equals(this.f29441g.mo32969a())) {
            return this.f29436b.mo33050a(event);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo32997a() {
        if (!C11324a1.m29162a(f29434n)) {
            return false;
        }
        m29259m();
        return true;
    }

    /* renamed from: b */
    private Attachment m29239b(Event event) {
        return (Attachment) event;
    }

    /* renamed from: c */
    private Boolean m29245c() {
        return Boolean.valueOf(m29254h() && mo33000a((String) f29433m.get(), this.f29435a));
    }

    /* renamed from: a */
    public boolean mo32999a(C11393t0 t0Var) {
        m29237a((Runnable) new C11355a(this, (long) t0Var.mo33048a()));
        return true;
    }

    /* renamed from: a */
    public void mo32996a(boolean z) {
        C11402w0 w0Var = this.f29437c;
        if (w0Var != null) {
            w0Var.mo33055a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33000a(String str, String str2) {
        boolean b = m29243b(str, str2);
        if (b) {
            m29252f();
        }
        return b;
    }

    /* renamed from: a */
    private void m29234a(Context context) {
        if (f29434n != null) {
            return;
        }
        if (context == null || context.getApplicationContext() == null) {
            throw new IllegalArgumentException("Non-null application context required.");
        }
        f29434n = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m29238a(String str) {
        if (C11330b1.m29170a(str)) {
            return false;
        }
        f29433m.set(str);
        return true;
    }

    /* renamed from: a */
    private void m29237a(Runnable runnable) {
        try {
            this.f29446l.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.e("MapboxTelemetry", e.toString());
        }
    }

    /* renamed from: a */
    private static Callback m29233a(Set<TelemetryListener> set) {
        return new C11360f(set);
    }
}
