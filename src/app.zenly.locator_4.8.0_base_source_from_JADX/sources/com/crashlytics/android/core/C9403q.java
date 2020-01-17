package com.crashlytics.android.core;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.services.settings.C12266r;

/* renamed from: com.crashlytics.android.core.q */
class C9403q implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final C9404a f24362a;

    /* renamed from: b */
    private final C9405b f24363b;

    /* renamed from: c */
    private final boolean f24364c;

    /* renamed from: d */
    private final UncaughtExceptionHandler f24365d;

    /* renamed from: e */
    private final AtomicBoolean f24366e = new AtomicBoolean(false);

    /* renamed from: com.crashlytics.android.core.q$a */
    interface C9404a {
        /* renamed from: a */
        void mo25182a(C9405b bVar, Thread thread, Throwable th, boolean z);
    }

    /* renamed from: com.crashlytics.android.core.q$b */
    interface C9405b {
        /* renamed from: a */
        C12266r mo25159a();
    }

    public C9403q(C9404a aVar, C9405b bVar, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f24362a = aVar;
        this.f24363b = bVar;
        this.f24364c = z;
        this.f24365d = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25222a() {
        return this.f24366e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "Crashlytics completed exception processing. Invoking default exception handler.";
        String str2 = "CrashlyticsCore";
        this.f24366e.set(true);
        try {
            this.f24362a.mo25182a(this.f24363b, thread, th, this.f24364c);
        } catch (Exception e) {
            C12154c.m32113f().mo35957e(str2, "An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C12154c.m32113f().mo35954d(str2, str);
            this.f24365d.uncaughtException(thread, th);
            this.f24366e.set(false);
            throw th2;
        }
        C12154c.m32113f().mo35954d(str2, str);
        this.f24365d.uncaughtException(thread, th);
        this.f24366e.set(false);
    }
}
