package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.p310o.C10178a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10697f;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.firebase.C11019a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {
    private static final long zzaq = TimeUnit.HOURS.toSeconds(8);
    private static C11095x zzar;
    private static ScheduledThreadPoolExecutor zzas;
    private final Executor zzat;
    /* access modifiers changed from: private */
    public final FirebaseApp zzau;
    private final C11073m zzav;
    private MessagingChannel zzaw;
    private final C11083r zzax;
    private final C11052b0 zzay;
    private boolean zzaz;
    private final C11047a zzba;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C11047a {

        /* renamed from: a */
        private final boolean f28663a = m28453c();

        /* renamed from: b */
        private final Subscriber f28664b;

        /* renamed from: c */
        private EventHandler<C11019a> f28665c;

        /* renamed from: d */
        private Boolean f28666d = m28452b();

        C11047a(Subscriber subscriber) {
            this.f28664b = subscriber;
            if (this.f28666d == null && this.f28663a) {
                this.f28665c = new C11078o0(this);
                subscriber.subscribe(C11019a.class, this.f28665c);
            }
        }

        /* renamed from: b */
        private final Boolean m28452b() {
            String str = "firebase_messaging_auto_init_enabled";
            Context a = FirebaseInstanceId.this.zzau.mo32135a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: c */
        private final boolean m28453c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.zzau.mo32135a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized boolean mo32243a() {
            if (this.f28666d == null) {
                return this.f28663a && FirebaseInstanceId.this.zzau.isDataCollectionDefaultEnabled();
            }
            return this.f28666d.booleanValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized void mo32242a(boolean z) {
            if (this.f28665c != null) {
                this.f28664b.unsubscribe(C11019a.class, this.f28665c);
                this.f28665c = null;
            }
            Editor edit = FirebaseInstanceId.this.zzau.mo32135a().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.zzh();
            }
            this.f28666d = Boolean.valueOf(z);
        }
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber, UserAgentPublisher userAgentPublisher) {
        this(firebaseApp, new C11073m(firebaseApp.mo32135a()), C11062g0.m28493b(), C11062g0.m28493b(), subscriber, userAgentPublisher);
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private final synchronized void startSync() {
        if (!this.zzaz) {
            zza(0);
        }
    }

    private static C11093w zzb(String str, String str2) {
        return zzar.mo32320a("", str, str2);
    }

    private static String zzd(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: private */
    public final void zzh() {
        C11093w zzk = zzk();
        if (zzr() || zza(zzk) || this.zzay.mo32267a()) {
            startSync();
        }
    }

    private static String zzj() {
        return C11073m.m28508a(zzar.mo32324b("").mo32263b());
    }

    static boolean zzm() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    public void deleteInstanceId() throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zza(this.zzaw.deleteInstanceId(zzj()));
            zzn();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public void deleteToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String zzd = zzd(str2);
            zza(this.zzaw.deleteToken(zzj(), C11093w.m28559a(zzb(str, zzd)), str, zzd));
            zzar.mo32326b("", str, zzd);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public long getCreationTime() {
        return zzar.mo32324b("").mo32262a();
    }

    public String getId() {
        zzh();
        return zzj();
    }

    public C10693c<InstanceIdResult> getInstanceId() {
        return zza(C11073m.m28507a(this.zzau), "*");
    }

    @Deprecated
    public String getToken() {
        C11093w zzk = zzk();
        if (this.zzaw.needsRefresh() || zza(zzk)) {
            startSync();
        }
        return C11093w.m28559a(zzk);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void zza(boolean z) {
        this.zzaz = z;
    }

    /* access modifiers changed from: 0000 */
    public final void zzc(String str) throws IOException {
        C11093w zzk = zzk();
        if (!zza(zzk)) {
            zza(this.zzaw.unsubscribeFromTopic(zzj(), zzk.f28769a, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* access modifiers changed from: 0000 */
    public final FirebaseApp zzi() {
        return this.zzau;
    }

    /* access modifiers changed from: 0000 */
    public final C11093w zzk() {
        return zzb(C11073m.m28507a(this.zzau), "*");
    }

    /* access modifiers changed from: 0000 */
    public final String zzl() throws IOException {
        return getToken(C11073m.m28507a(this.zzau), "*");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void zzn() {
        zzar.mo32325b();
        if (this.zzba.mo32243a()) {
            startSync();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzo() {
        return this.zzaw.isAvailable();
    }

    /* access modifiers changed from: 0000 */
    public final void zzp() {
        zzar.mo32327c("");
        startSync();
    }

    public final boolean zzq() {
        return this.zzba.mo32243a();
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzr() {
        return this.zzaw.needsRefresh();
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.mo32136a(FirebaseInstanceId.class);
    }

    /* access modifiers changed from: 0000 */
    public final void zzb(String str) throws IOException {
        C11093w zzk = zzk();
        if (!zza(zzk)) {
            zza(this.zzaw.subscribeToTopic(zzj(), zzk.f28769a, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void zza(long j) {
        C11098z zVar = new C11098z(this, this.zzav, this.zzay, Math.min(Math.max(30, j << 1), zzaq));
        zza((Runnable) zVar, j);
        this.zzaz = true;
    }

    public String getToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) zza(zza(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, C11073m mVar, Executor executor, Executor executor2, Subscriber subscriber, UserAgentPublisher userAgentPublisher) {
        this.zzaz = false;
        if (C11073m.m28507a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (zzar == null) {
                    zzar = new C11095x(firebaseApp.mo32135a());
                }
            }
            this.zzau = firebaseApp;
            this.zzav = mVar;
            if (this.zzaw == null) {
                MessagingChannel messagingChannel = (MessagingChannel) firebaseApp.mo32136a(MessagingChannel.class);
                if (messagingChannel == null || !messagingChannel.isAvailable()) {
                    this.zzaw = new C11080p0(firebaseApp, mVar, executor, userAgentPublisher);
                } else {
                    this.zzaw = messagingChannel;
                }
            }
            this.zzaw = this.zzaw;
            this.zzat = executor2;
            this.zzay = new C11052b0(zzar);
            this.zzba = new C11047a(subscriber);
            this.zzax = new C11083r(executor);
            if (this.zzba.mo32243a()) {
                zzh();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    static void zza(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (zzas == null) {
                zzas = new ScheduledThreadPoolExecutor(1, new C10178a("FirebaseInstanceId"));
            }
            zzas.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public final void zzb(boolean z) {
        this.zzba.mo32242a(z);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C10693c zzb(String str, String str2, String str3, String str4) throws Exception {
        zzar.mo32323a("", str, str2, str4, this.zzav.mo32302b());
        return C10697f.m27261a(new C11094w0(str3, str4));
    }

    private final C10693c<InstanceIdResult> zza(String str, String str2) {
        return C10697f.m27261a(null).mo29314b(this.zzat, new C11074m0(this, str, zzd(str2)));
    }

    private final <T> T zza(C10693c<T> cVar) throws IOException {
        try {
            return C10697f.m27264a(cVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zzn();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final synchronized C10693c<Void> zza(String str) {
        C10693c<Void> a;
        a = this.zzay.mo32266a(str);
        startSync();
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zza(C11093w wVar) {
        return wVar == null || wVar.mo32319a(this.zzav.mo32302b());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C10693c zza(String str, String str2, C10693c cVar) throws Exception {
        String zzj = zzj();
        C11093w zzb = zzb(str, str2);
        if (!this.zzaw.needsRefresh() && !zza(zzb)) {
            return C10697f.m27261a(new C11094w0(zzj, zzb.f28769a));
        }
        String a = C11093w.m28559a(zzb);
        C11083r rVar = this.zzax;
        C11072l0 l0Var = new C11072l0(this, zzj, a, str, str2);
        return rVar.mo32307a(str, str2, l0Var);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C10693c zza(String str, String str2, String str3, String str4) {
        return this.zzaw.getToken(str, str2, str3, str4).mo29308a(this.zzat, (SuccessContinuation<TResult, TContinuationResult>) new C11076n0<TResult,TContinuationResult>(this, str3, str4, str));
    }
}
