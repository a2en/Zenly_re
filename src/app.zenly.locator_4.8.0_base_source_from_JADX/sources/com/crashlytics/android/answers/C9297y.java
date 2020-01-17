package com.crashlytics.android.answers;

import java.io.File;
import java.util.List;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12169a;
import p389io.fabric.sdk.android.services.common.C12199r;
import p389io.fabric.sdk.android.services.events.FilesSender;
import p389io.fabric.sdk.android.services.network.C12241c;
import p389io.fabric.sdk.android.services.network.HttpRequest;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;

/* renamed from: com.crashlytics.android.answers.y */
class C9297y extends C12169a implements FilesSender {

    /* renamed from: g */
    private final String f24144g;

    public C9297y(C12161g gVar, String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        super(gVar, str, str2, httpRequestFactory, C12241c.POST);
        this.f24144g = str3;
    }

    public boolean send(List<File> list) {
        HttpRequest a = mo36044a();
        a.mo36203c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a.mo36203c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f31648e.mo24945h());
        a.mo36203c("X-CRASHLYTICS-API-KEY", this.f24144g);
        int i = 0;
        for (File file : list) {
            StringBuilder sb = new StringBuilder();
            sb.append("session_analytics_file_");
            sb.append(i);
            a.mo36192a(sb.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        Logger f = C12154c.m32113f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        sb2.append(list.size());
        sb2.append(" analytics files to ");
        sb2.append(mo36046b());
        String sb3 = sb2.toString();
        String str = "Answers";
        f.mo35954d(str, sb3);
        int g = a.mo36213g();
        Logger f2 = C12154c.m32113f();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Response code for analytics file send is ");
        sb4.append(g);
        f2.mo35954d(str, sb4.toString());
        if (C12199r.m32327a(g) == 0) {
            return true;
        }
        return false;
    }
}
