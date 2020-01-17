package com.crashlytics.android.answers;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12178f;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.events.C12232d;
import p389io.fabric.sdk.android.services.events.FilesSender;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;
import p389io.fabric.sdk.android.services.settings.C12250b;

/* renamed from: com.crashlytics.android.answers.n */
class C9281n implements C9255a0 {

    /* renamed from: a */
    private final C12161g f24110a;

    /* renamed from: b */
    private final HttpRequestFactory f24111b;

    /* renamed from: c */
    private final Context f24112c;

    /* renamed from: d */
    private final C9296x f24113d;

    /* renamed from: e */
    private final ScheduledExecutorService f24114e;

    /* renamed from: f */
    private final AtomicReference<ScheduledFuture<?>> f24115f = new AtomicReference<>();

    /* renamed from: g */
    final C9262c0 f24116g;

    /* renamed from: h */
    private final C9283p f24117h;

    /* renamed from: i */
    FilesSender f24118i;

    /* renamed from: j */
    C12178f f24119j = new C12178f();

    /* renamed from: k */
    C9282o f24120k = new C9286s();

    /* renamed from: l */
    boolean f24121l = true;

    /* renamed from: m */
    boolean f24122m = true;

    /* renamed from: n */
    volatile int f24123n = -1;

    /* renamed from: o */
    boolean f24124o = false;

    /* renamed from: p */
    boolean f24125p = false;

    public C9281n(C12161g gVar, Context context, ScheduledExecutorService scheduledExecutorService, C9296x xVar, HttpRequestFactory httpRequestFactory, C9262c0 c0Var, C9283p pVar) {
        this.f24110a = gVar;
        this.f24112c = context;
        this.f24114e = scheduledExecutorService;
        this.f24113d = xVar;
        this.f24111b = httpRequestFactory;
        this.f24116g = c0Var;
        this.f24117h = pVar;
    }

    /* renamed from: a */
    public void mo24955a(C12250b bVar, String str) {
        C9297y yVar = new C9297y(this.f24110a, str, bVar.f31846a, this.f24111b, this.f24119j.mo36064d(this.f24112c));
        this.f24118i = C9277j.m22352a(yVar);
        this.f24113d.mo25029a(bVar);
        this.f24124o = bVar.f31851f;
        this.f24125p = bVar.f31852g;
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Firebase analytics forwarding ");
        String str2 = "enabled";
        String str3 = "disabled";
        sb.append(this.f24124o ? str2 : str3);
        String str4 = "Answers";
        f.mo35954d(str4, sb.toString());
        Logger f2 = C12154c.m32113f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Firebase analytics including purchase events ");
        sb2.append(this.f24125p ? str2 : str3);
        f2.mo35954d(str4, sb2.toString());
        this.f24121l = bVar.f31853h;
        Logger f3 = C12154c.m32113f();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Custom event tracking ");
        sb3.append(this.f24121l ? str2 : str3);
        f3.mo35954d(str4, sb3.toString());
        this.f24122m = bVar.f31854i;
        Logger f4 = C12154c.m32113f();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Predefined event tracking ");
        if (!this.f24122m) {
            str2 = str3;
        }
        sb4.append(str2);
        f4.mo35954d(str4, sb4.toString());
        if (bVar.f31856k > 1) {
            C12154c.m32113f().mo35954d(str4, "Event sampling enabled");
            this.f24120k = new C9294w(bVar.f31856k);
        }
        this.f24123n = bVar.f31847b;
        mo25014a(0, (long) this.f24123n);
    }

    public void cancelTimeBasedFileRollOver() {
        if (this.f24115f.get() != null) {
            C12180h.m32267c(this.f24112c, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f24115f.get()).cancel(false);
            this.f24115f.set(null);
        }
    }

    public void deleteAllEvents() {
        this.f24113d.mo36173a();
    }

    public boolean rollFileOver() {
        try {
            return this.f24113d.mo36179g();
        } catch (IOException e) {
            C12180h.m32252a(this.f24112c, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.f24123n != -1) {
            mo25014a((long) this.f24123n, (long) this.f24123n);
        }
    }

    public void sendEvents() {
        if (this.f24118i == null) {
            C12180h.m32267c(this.f24112c, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C12180h.m32267c(this.f24112c, "Sending all files");
        List d = this.f24113d.mo36178d();
        int i = 0;
        while (true) {
            try {
                if (d.size() <= 0) {
                    break;
                }
                C12180h.m32267c(this.f24112c, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(d.size())}));
                boolean send = this.f24118i.send(d);
                if (send) {
                    i += d.size();
                    this.f24113d.mo36176a(d);
                }
                if (!send) {
                    break;
                }
                d = this.f24113d.mo36178d();
            } catch (Exception e) {
                Context context = this.f24112c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to send batch of analytics files to server: ");
                sb.append(e.getMessage());
                C12180h.m32252a(context, sb.toString(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.f24113d.mo36177b();
        }
    }

    /* renamed from: a */
    public void mo24954a(C9259b bVar) {
        C9257b0 a = bVar.mo24966a(this.f24116g);
        String str = "Answers";
        if (!this.f24121l && C9260c.CUSTOM.equals(a.f24037c)) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Custom events tracking disabled - skipping event: ");
            sb.append(a);
            f.mo35954d(str, sb.toString());
        } else if (!this.f24122m && C9260c.PREDEFINED.equals(a.f24037c)) {
            Logger f2 = C12154c.m32113f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Predefined events tracking disabled - skipping event: ");
            sb2.append(a);
            f2.mo35954d(str, sb2.toString());
        } else if (this.f24120k.mo25015a(a)) {
            Logger f3 = C12154c.m32113f();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Skipping filtered event: ");
            sb3.append(a);
            f3.mo35954d(str, sb3.toString());
        } else {
            try {
                this.f24113d.mo36175a(a);
            } catch (IOException e) {
                Logger f4 = C12154c.m32113f();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to write event: ");
                sb4.append(a);
                f4.mo35957e(str, sb4.toString(), e);
            }
            scheduleTimeBasedRollOverIfNeeded();
            boolean z = C9260c.CUSTOM.equals(a.f24037c) || C9260c.PREDEFINED.equals(a.f24037c);
            boolean equals = "purchase".equals(a.f24041g);
            if (this.f24124o && z && (!equals || this.f24125p)) {
                try {
                    this.f24117h.mo25017a(a);
                } catch (Exception e2) {
                    Logger f5 = C12154c.m32113f();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Failed to map event to Firebase: ");
                    sb5.append(a);
                    f5.mo35957e(str, sb5.toString(), e2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25014a(long j, long j2) {
        if (this.f24115f.get() == null) {
            C12232d dVar = new C12232d(this.f24112c, this);
            Context context = this.f24112c;
            StringBuilder sb = new StringBuilder();
            sb.append("Scheduling time based file roll over every ");
            sb.append(j2);
            sb.append(" seconds");
            C12180h.m32267c(context, sb.toString());
            try {
                this.f24115f.set(this.f24114e.scheduleAtFixedRate(dVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C12180h.m32252a(this.f24112c, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }
}
