package com.crashlytics.android.p302c;

import java.util.Collections;
import java.util.Map;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.services.common.C12195p.C12196a;
import p389io.fabric.sdk.android.services.common.DeviceIdentifierProvider;

/* renamed from: com.crashlytics.android.c.a */
public class C9300a extends C12161g<Boolean> implements DeviceIdentifierProvider {
    /* renamed from: f */
    public String mo24943f() {
        return "com.crashlytics.sdk.android:beta";
    }

    public Map<C12196a, String> getDeviceIdentifiers() {
        return Collections.emptyMap();
    }

    /* renamed from: h */
    public String mo24945h() {
        return "1.2.10.27";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean m22409a() {
        C12154c.m32113f().mo35954d("Beta", "Beta kit initializing...");
        return Boolean.valueOf(true);
    }
}
