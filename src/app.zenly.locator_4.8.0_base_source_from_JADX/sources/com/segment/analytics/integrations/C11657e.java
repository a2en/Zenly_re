package com.segment.analytics.integrations;

import android.util.Log;
import com.segment.analytics.Analytics.C11615l;

/* renamed from: com.segment.analytics.integrations.e */
public final class C11657e {

    /* renamed from: a */
    public final C11615l f30237a;

    /* renamed from: b */
    private final String f30238b;

    public C11657e(String str, C11615l lVar) {
        this.f30238b = str;
        this.f30237a = lVar;
    }

    /* renamed from: a */
    public void mo34347a(String str, Object... objArr) {
        if (m30557a(C11615l.DEBUG)) {
            Log.d(this.f30238b, String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo34349b(String str, Object... objArr) {
        if (m30557a(C11615l.INFO)) {
            Log.i(this.f30238b, String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public void mo34350c(String str, Object... objArr) {
        if (m30557a(C11615l.VERBOSE)) {
            Log.v(this.f30238b, String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static C11657e m30558b(C11615l lVar) {
        return new C11657e("Analytics", lVar);
    }

    /* renamed from: a */
    public void mo34348a(Throwable th, String str, Object... objArr) {
        if (m30557a(C11615l.INFO)) {
            Log.e(this.f30238b, String.format(str, objArr), th);
        }
    }

    /* renamed from: a */
    public C11657e mo34346a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Analytics-");
        sb.append(str);
        return new C11657e(sb.toString(), this.f30237a);
    }

    /* renamed from: a */
    private boolean m30557a(C11615l lVar) {
        return this.f30237a.ordinal() >= lVar.ordinal();
    }
}
