package com.crashlytics.android.answers;

import android.content.Context;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: com.crashlytics.android.answers.p */
class C9283p {

    /* renamed from: a */
    private final Context f24126a;

    /* renamed from: b */
    private final C9285r f24127b;

    /* renamed from: c */
    private EventLogger f24128c;

    public C9283p(Context context) {
        this(context, new C9285r());
    }

    /* renamed from: a */
    public EventLogger mo25016a() {
        if (this.f24128c == null) {
            this.f24128c = C9278k.m22355b(this.f24126a);
        }
        return this.f24128c;
    }

    public C9283p(Context context, C9285r rVar) {
        this.f24126a = context;
        this.f24127b = rVar;
    }

    /* renamed from: a */
    public void mo25017a(C9257b0 b0Var) {
        EventLogger a = mo25016a();
        String str = "Answers";
        if (a == null) {
            C12154c.m32113f().mo35954d(str, "Firebase analytics logging was enabled, but not available...");
            return;
        }
        C9284q a2 = this.f24127b.mo25020a(b0Var);
        if (a2 == null) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Fabric event was not mappable to Firebase event: ");
            sb.append(b0Var);
            f.mo35954d(str, sb.toString());
            return;
        }
        a.logEvent(a2.mo25018a(), a2.mo25019b());
        if ("levelEnd".equals(b0Var.f24041g)) {
            a.logEvent("post_score", a2.mo25019b());
        }
    }
}
