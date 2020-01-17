package com.crashlytics.android.core;

import java.io.File;
import java.util.Map.Entry;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12169a;
import p389io.fabric.sdk.android.services.common.C12199r;
import p389io.fabric.sdk.android.services.network.C12241c;
import p389io.fabric.sdk.android.services.network.HttpRequest;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;

/* renamed from: com.crashlytics.android.core.u */
class C9414u extends C12169a implements C9409s {
    public C9414u(C12161g gVar, String str, String str2, HttpRequestFactory httpRequestFactory) {
        super(gVar, str, str2, httpRequestFactory, C12241c.POST);
    }

    /* renamed from: a */
    public boolean mo25076a(C9407r rVar) {
        HttpRequest a = mo36044a();
        m22775a(a, rVar);
        m22774a(a, rVar.f24368b);
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending report to: ");
        sb.append(mo36046b());
        String str = "CrashlyticsCore";
        f.mo35954d(str, sb.toString());
        int g = a.mo36213g();
        Logger f2 = C12154c.m32113f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Create report request ID: ");
        sb2.append(a.mo36205c("X-REQUEST-ID"));
        f2.mo35954d(str, sb2.toString());
        Logger f3 = C12154c.m32113f();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Result was: ");
        sb3.append(g);
        f3.mo35954d(str, sb3.toString());
        return C12199r.m32327a(g) == 0;
    }

    /* renamed from: a */
    private HttpRequest m22775a(HttpRequest httpRequest, C9407r rVar) {
        httpRequest.mo36203c("X-CRASHLYTICS-API-KEY", rVar.f24367a);
        httpRequest.mo36203c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpRequest.mo36203c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f31648e.mo24945h());
        for (Entry a : rVar.f24368b.mo25081a().entrySet()) {
            httpRequest.mo36195a(a);
        }
        return httpRequest;
    }

    /* renamed from: a */
    private HttpRequest m22774a(HttpRequest httpRequest, C9388l0 l0Var) {
        File[] d;
        httpRequest.mo36210e("report[identifier]", l0Var.getIdentifier());
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = "CrashlyticsCore";
        if (l0Var.mo25084d().length == 1) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Adding single file ");
            sb.append(l0Var.mo25082b());
            sb.append(str2);
            sb.append(l0Var.getIdentifier());
            f.mo35954d(str3, sb.toString());
            httpRequest.mo36192a("report[file]", l0Var.mo25082b(), str, l0Var.mo25083c());
            return httpRequest;
        }
        int i = 0;
        for (File file : l0Var.mo25084d()) {
            Logger f2 = C12154c.m32113f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding file ");
            sb2.append(file.getName());
            sb2.append(str2);
            sb2.append(l0Var.getIdentifier());
            f2.mo35954d(str3, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("report[file");
            sb3.append(i);
            sb3.append("]");
            httpRequest.mo36192a(sb3.toString(), file.getName(), str, file);
            i++;
        }
        return httpRequest;
    }
}
