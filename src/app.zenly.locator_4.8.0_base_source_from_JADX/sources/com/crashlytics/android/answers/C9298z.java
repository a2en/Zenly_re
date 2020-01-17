package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager.Listener;
import java.util.concurrent.ScheduledExecutorService;
import p389io.fabric.sdk.android.C12149a;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12188l;
import p389io.fabric.sdk.android.services.common.C12195p;
import p389io.fabric.sdk.android.services.network.C12239b;
import p389io.fabric.sdk.android.services.persistence.C12245a;
import p389io.fabric.sdk.android.services.settings.C12250b;

/* renamed from: com.crashlytics.android.answers.z */
class C9298z implements Listener {

    /* renamed from: a */
    private final long f24145a;

    /* renamed from: b */
    final C9267f f24146b;

    /* renamed from: c */
    final C12149a f24147c;

    /* renamed from: d */
    final BackgroundManager f24148d;

    /* renamed from: e */
    final C9276i f24149e;

    C9298z(C9267f fVar, C12149a aVar, BackgroundManager backgroundManager, C9276i iVar, long j) {
        this.f24146b = fVar;
        this.f24147c = aVar;
        this.f24148d = backgroundManager;
        this.f24149e = iVar;
        this.f24145a = j;
    }

    /* renamed from: a */
    public static C9298z m22397a(C12161g gVar, Context context, C12195p pVar, String str, String str2, long j) {
        Context context2 = context;
        C12195p pVar2 = pVar;
        C9266e0 e0Var = new C9266e0(context, pVar, str, str2);
        C12161g gVar2 = gVar;
        C9274g gVar3 = new C9274g(context, new C12245a(gVar));
        C12239b bVar = new C12239b(C12154c.m32113f());
        C12149a aVar = new C12149a(context);
        ScheduledExecutorService b = C12188l.m32294b("Answers Events Handler");
        BackgroundManager backgroundManager = new BackgroundManager(b);
        C9267f fVar = new C9267f(gVar2, context, gVar3, e0Var, bVar, b, new C9283p(context));
        C9298z zVar = new C9298z(fVar, aVar, backgroundManager, C9276i.m22349a(context), j);
        return zVar;
    }

    /* renamed from: a */
    public void mo25038a(String str) {
    }

    /* renamed from: b */
    public void mo25040b() {
        this.f24146b.mo24987b();
        this.f24147c.mo35970a(new C9275h(this, this.f24148d));
        this.f24148d.mo24947a((Listener) this);
        if (mo25041c()) {
            mo25034a(this.f24145a);
            this.f24149e.mo25007b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo25041c() {
        return !this.f24149e.mo25006a();
    }

    public void onBackground() {
        C12154c.m32113f().mo35954d("Answers", "Flush events when app is backgrounded");
        this.f24146b.mo24989c();
    }

    /* renamed from: a */
    public void mo25033a() {
        this.f24147c.mo35969a();
        this.f24146b.mo24983a();
    }

    /* renamed from: a */
    public void mo25036a(C9279l lVar) {
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged custom event: ");
        sb.append(lVar);
        f.mo35954d("Answers", sb.toString());
        this.f24146b.mo24984a(C9257b0.m22305a(lVar));
    }

    /* renamed from: a */
    public void mo25039a(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C12154c.m32113f().mo35954d("Answers", "Logged crash");
            this.f24146b.mo24990c(C9257b0.m22307a(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    /* renamed from: a */
    public void mo25034a(long j) {
        C12154c.m32113f().mo35954d("Answers", "Logged install");
        this.f24146b.mo24988b(C9257b0.m22303a(j));
    }

    /* renamed from: a */
    public void mo25035a(Activity activity, C9260c cVar) {
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged lifecycle event: ");
        sb.append(cVar.name());
        f.mo35954d("Answers", sb.toString());
        this.f24146b.mo24984a(C9257b0.m22304a(cVar, activity));
    }

    /* renamed from: a */
    public void mo25037a(C12250b bVar, String str) {
        this.f24148d.mo24948a(bVar.f31855j);
        this.f24146b.mo24986a(bVar, str);
    }
}
