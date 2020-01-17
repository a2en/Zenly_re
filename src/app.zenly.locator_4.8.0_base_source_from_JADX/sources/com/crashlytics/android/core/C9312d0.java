package com.crashlytics.android.core;

import java.io.File;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12169a;
import p389io.fabric.sdk.android.services.common.C12199r;
import p389io.fabric.sdk.android.services.network.C12241c;
import p389io.fabric.sdk.android.services.network.HttpRequest;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;

/* renamed from: com.crashlytics.android.core.d0 */
class C9312d0 extends C12169a implements C9409s {
    public C9312d0(C12161g gVar, String str, String str2, HttpRequestFactory httpRequestFactory) {
        super(gVar, str, str2, httpRequestFactory, C12241c.POST);
    }

    /* renamed from: a */
    public boolean mo25076a(C9407r rVar) {
        HttpRequest a = mo36044a();
        m22456a(a, rVar.f24367a);
        m22455a(a, rVar.f24368b);
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending report to: ");
        sb.append(mo36046b());
        String str = "CrashlyticsCore";
        f.mo35954d(str, sb.toString());
        int g = a.mo36213g();
        Logger f2 = C12154c.m32113f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result was: ");
        sb2.append(g);
        f2.mo35954d(str, sb2.toString());
        return C12199r.m32327a(g) == 0;
    }

    /* renamed from: a */
    private HttpRequest m22456a(HttpRequest httpRequest, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(this.f31648e.mo24945h());
        httpRequest.mo36203c("User-Agent", sb.toString());
        httpRequest.mo36203c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpRequest.mo36203c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f31648e.mo24945h());
        httpRequest.mo36203c("X-CRASHLYTICS-API-KEY", str);
        return httpRequest;
    }

    /* renamed from: a */
    private HttpRequest m22455a(HttpRequest httpRequest, C9388l0 l0Var) {
        File[] d;
        httpRequest.mo36210e("report_id", l0Var.getIdentifier());
        for (File file : l0Var.mo25084d()) {
            String str = "application/octet-stream";
            if (file.getName().equals("minidump")) {
                httpRequest.mo36192a("minidump_file", file.getName(), str, file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.mo36192a("crash_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.mo36192a("binary_images_file", file.getName(), str, file);
            } else if (file.getName().equals("session")) {
                httpRequest.mo36192a("session_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("app")) {
                httpRequest.mo36192a("app_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("device")) {
                httpRequest.mo36192a("device_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("os")) {
                httpRequest.mo36192a("os_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("user")) {
                httpRequest.mo36192a("user_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("logs")) {
                httpRequest.mo36192a("logs_file", file.getName(), str, file);
            } else if (file.getName().equals("keys")) {
                httpRequest.mo36192a("keys_file", file.getName(), str, file);
            }
        }
        return httpRequest;
    }
}
