package com.crashlytics.android.core;

import android.content.Context;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.settings.C12263o;

/* renamed from: com.crashlytics.android.core.w */
class C9421w {

    /* renamed from: a */
    private final Context f24392a;

    /* renamed from: b */
    private final C12263o f24393b;

    public C9421w(Context context, C12263o oVar) {
        this.f24392a = context;
        this.f24393b = oVar;
    }

    /* renamed from: a */
    public String mo25233a() {
        return m22783a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.f24393b.f31904g);
    }

    /* renamed from: b */
    public String mo25234b() {
        return m22783a("com.crashlytics.CrashSubmissionCancelTitle", this.f24393b.f31902e);
    }

    /* renamed from: c */
    public String mo25235c() {
        return m22783a("com.crashlytics.CrashSubmissionPromptMessage", this.f24393b.f31899b);
    }

    /* renamed from: d */
    public String mo25236d() {
        return m22783a("com.crashlytics.CrashSubmissionSendTitle", this.f24393b.f31900c);
    }

    /* renamed from: e */
    public String mo25237e() {
        return m22783a("com.crashlytics.CrashSubmissionPromptTitle", this.f24393b.f31898a);
    }

    /* renamed from: a */
    private String m22783a(String str, String str2) {
        return m22785b(C12180h.m32261b(this.f24392a, str), str2);
    }

    /* renamed from: b */
    private String m22785b(String str, String str2) {
        return m22784a(str) ? str2 : str;
    }

    /* renamed from: a */
    private boolean m22784a(String str) {
        return str == null || str.length() == 0;
    }
}
