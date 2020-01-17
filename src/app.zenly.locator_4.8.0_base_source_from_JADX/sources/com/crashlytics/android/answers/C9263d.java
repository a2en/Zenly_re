package com.crashlytics.android.answers;

import com.crashlytics.android.answers.C9263d;
import java.util.Map;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: com.crashlytics.android.answers.d */
public abstract class C9263d<T extends C9263d> {

    /* renamed from: a */
    final C9265e f24073a = new C9265e(20, 100, C12154c.m32115h());

    /* renamed from: b */
    final C9261c f24074b = new C9261c(this.f24073a);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, Object> mo24975a() {
        return this.f24074b.f24061b;
    }

    /* renamed from: a */
    public T mo24974a(String str, String str2) {
        this.f24074b.mo24970a(str, str2);
        return this;
    }

    /* renamed from: a */
    public T mo24973a(String str, Number number) {
        this.f24074b.mo24968a(str, number);
        return this;
    }
}
