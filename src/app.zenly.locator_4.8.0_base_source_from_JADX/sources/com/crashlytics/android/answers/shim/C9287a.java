package com.crashlytics.android.answers.shim;

import android.util.Log;
import com.crashlytics.android.answers.C9256b;

/* renamed from: com.crashlytics.android.answers.shim.a */
class C9287a implements KitEventLogger {

    /* renamed from: a */
    private final C9256b f24132a;

    private C9287a(C9256b bVar) {
        this.f24132a = bVar;
    }

    /* renamed from: a */
    public static C9287a m22382a() throws NoClassDefFoundError, IllegalStateException {
        return m22383a(C9256b.m22293m());
    }

    public void logKitEvent(C9289c cVar) {
        try {
            this.f24132a.mo24958a(cVar.mo25022a());
        } catch (Throwable th) {
            Log.w("AnswersKitEventLogger", "Unexpected error sending Answers event", th);
        }
    }

    /* renamed from: a */
    static C9287a m22383a(C9256b bVar) throws IllegalStateException {
        if (bVar != null) {
            return new C9287a(bVar);
        }
        throw new IllegalStateException("Answers must be initialized before logging kit events");
    }
}
