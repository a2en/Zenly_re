package com.crashlytics.android.ndk;

import com.crashlytics.android.core.C9382l;
import com.crashlytics.android.core.C9397n;
import com.crashlytics.android.core.C9399o;
import com.crashlytics.android.core.CrashlyticsNdkDataProvider;
import java.io.IOException;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import p389io.fabric.sdk.android.services.persistence.C12245a;

/* renamed from: com.crashlytics.android.ndk.b */
public class C9427b extends C12161g<Void> implements CrashlyticsNdkDataProvider {

    /* renamed from: k */
    private C9432e f24402k;

    /* renamed from: l */
    private C9399o f24403l;

    /* renamed from: f */
    public String mo24943f() {
        return "com.crashlytics.sdk.android.crashlytics-ndk";
    }

    public C9399o getCrashlyticsNdkData() {
        return this.f24403l;
    }

    /* renamed from: h */
    public String mo24945h() {
        return "2.0.5.27";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo24961k() {
        C9382l lVar = (C9382l) C12154c.m32104a(C9382l.class);
        if (lVar != null) {
            return mo25243a(new C9426a(mo36008b(), new JniNativeApi(), new C9429d(new C12245a(this))), lVar, new C9397n());
        }
        throw new UnmetDependencyException("CrashlyticsNdk requires Crashlytics");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25243a(C9432e eVar, C9382l lVar, C9397n nVar) {
        this.f24402k = eVar;
        boolean initialize = eVar.initialize();
        if (initialize) {
            nVar.mo25216a(lVar, this);
            C12154c.m32113f().mo35954d("CrashlyticsNdk", "Crashlytics NDK initialization successful");
        }
        return initialize;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void m22805a() {
        try {
            this.f24403l = this.f24402k.mo25241a();
        } catch (IOException e) {
            C12154c.m32113f().mo35957e("CrashlyticsNdk", "Could not process ndk data; ", e);
        }
        return null;
    }
}
