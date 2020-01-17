package com.crashlytics.android.answers;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.services.events.EventsStorageListener;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;
import p389io.fabric.sdk.android.services.settings.C12250b;

/* renamed from: com.crashlytics.android.answers.f */
class C9267f implements EventsStorageListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12161g f24082a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f24083b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9274g f24084c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9266e0 f24085d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final HttpRequestFactory f24086e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C9283p f24087f;

    /* renamed from: g */
    final ScheduledExecutorService f24088g;

    /* renamed from: h */
    C9255a0 f24089h = new C9280m();

    /* renamed from: com.crashlytics.android.answers.f$a */
    class C9268a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C12250b f24090e;

        /* renamed from: f */
        final /* synthetic */ String f24091f;

        C9268a(C12250b bVar, String str) {
            this.f24090e = bVar;
            this.f24091f = str;
        }

        public void run() {
            try {
                C9267f.this.f24089h.mo24955a(this.f24090e, this.f24091f);
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("Answers", "Failed to set analytics settings data", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.f$b */
    class C9269b implements Runnable {
        C9269b() {
        }

        public void run() {
            try {
                C9255a0 a0Var = C9267f.this.f24089h;
                C9267f.this.f24089h = new C9280m();
                a0Var.deleteAllEvents();
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("Answers", "Failed to disable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.f$c */
    class C9270c implements Runnable {
        C9270c() {
        }

        public void run() {
            try {
                C9267f.this.f24089h.sendEvents();
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("Answers", "Failed to send events files", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.f$d */
    class C9271d implements Runnable {
        C9271d() {
        }

        public void run() {
            try {
                C9262c0 a = C9267f.this.f24085d.mo24982a();
                C9296x a2 = C9267f.this.f24084c.mo24998a();
                a2.mo36174a((EventsStorageListener) C9267f.this);
                C9267f fVar = C9267f.this;
                C9281n nVar = new C9281n(C9267f.this.f24082a, C9267f.this.f24083b, C9267f.this.f24088g, a2, C9267f.this.f24086e, a, C9267f.this.f24087f);
                fVar.f24089h = nVar;
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("Answers", "Failed to enable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.f$e */
    class C9272e implements Runnable {
        C9272e() {
        }

        public void run() {
            try {
                C9267f.this.f24089h.rollFileOver();
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("Answers", "Failed to flush events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.f$f */
    class C9273f implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C9259b f24097e;

        /* renamed from: f */
        final /* synthetic */ boolean f24098f;

        C9273f(C9259b bVar, boolean z) {
            this.f24097e = bVar;
            this.f24098f = z;
        }

        public void run() {
            try {
                C9267f.this.f24089h.mo24954a(this.f24097e);
                if (this.f24098f) {
                    C9267f.this.f24089h.rollFileOver();
                }
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("Answers", "Failed to process event", e);
            }
        }
    }

    public C9267f(C12161g gVar, Context context, C9274g gVar2, C9266e0 e0Var, HttpRequestFactory httpRequestFactory, ScheduledExecutorService scheduledExecutorService, C9283p pVar) {
        this.f24082a = gVar;
        this.f24083b = context;
        this.f24084c = gVar2;
        this.f24085d = e0Var;
        this.f24086e = httpRequestFactory;
        this.f24088g = scheduledExecutorService;
        this.f24087f = pVar;
    }

    public void onRollOver(String str) {
        m22326a((Runnable) new C9270c());
    }

    /* renamed from: a */
    public void mo24984a(C9259b bVar) {
        mo24985a(bVar, false, false);
    }

    /* renamed from: b */
    public void mo24988b(C9259b bVar) {
        mo24985a(bVar, false, true);
    }

    /* renamed from: c */
    public void mo24990c(C9259b bVar) {
        mo24985a(bVar, true, false);
    }

    /* renamed from: a */
    public void mo24986a(C12250b bVar, String str) {
        m22326a((Runnable) new C9268a(bVar, str));
    }

    /* renamed from: b */
    public void mo24987b() {
        m22326a((Runnable) new C9271d());
    }

    /* renamed from: c */
    public void mo24989c() {
        m22326a((Runnable) new C9272e());
    }

    /* renamed from: b */
    private void m22328b(Runnable runnable) {
        try {
            this.f24088g.submit(runnable).get();
        } catch (Exception e) {
            C12154c.m32113f().mo35957e("Answers", "Failed to run events task", e);
        }
    }

    /* renamed from: a */
    public void mo24983a() {
        m22326a((Runnable) new C9269b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24985a(C9259b bVar, boolean z, boolean z2) {
        C9273f fVar = new C9273f(bVar, z2);
        if (z) {
            m22328b((Runnable) fVar);
        } else {
            m22326a((Runnable) fVar);
        }
    }

    /* renamed from: a */
    private void m22326a(Runnable runnable) {
        try {
            this.f24088g.submit(runnable);
        } catch (Exception e) {
            C12154c.m32113f().mo35957e("Answers", "Failed to submit events task", e);
        }
    }
}
