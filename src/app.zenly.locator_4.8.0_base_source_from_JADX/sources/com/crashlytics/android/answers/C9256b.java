package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.File;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12183i.C12184a;
import p389io.fabric.sdk.android.services.common.C12183i.C12185b;
import p389io.fabric.sdk.android.services.common.C12186j;
import p389io.fabric.sdk.android.services.common.C12194o;
import p389io.fabric.sdk.android.services.settings.C12266r;
import p389io.fabric.sdk.android.services.settings.Settings;

/* renamed from: com.crashlytics.android.answers.b */
public class C9256b extends C12161g<Boolean> {

    /* renamed from: k */
    boolean f24033k = false;

    /* renamed from: l */
    C9298z f24034l;

    /* renamed from: m */
    public static C9256b m22293m() {
        return (C9256b) C12154c.m32104a(C9256b.class);
    }

    /* renamed from: f */
    public String mo24943f() {
        return "com.crashlytics.sdk.android:answers";
    }

    /* renamed from: h */
    public String mo24945h() {
        return "1.4.7.32";
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: k */
    public boolean mo24961k() {
        long lastModified;
        try {
            Context b = mo36008b();
            PackageManager packageManager = b.getPackageManager();
            String packageName = b.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.f24034l = C9298z.m22397a(this, b, mo36014e(), num, str, lastModified);
            this.f24034l.mo25040b();
            this.f24033k = new C12194o().mo36082e(b);
            return true;
        } catch (Exception e) {
            C12154c.m32113f().mo35957e("Answers", "Error retrieving app properties", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public String mo24962l() {
        return C12180h.m32261b(mo36008b(), "com.crashlytics.ApiEndpoint");
    }

    /* renamed from: a */
    public void mo24958a(C9279l lVar) {
        if (lVar == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f24033k) {
            m22292a("logCustom");
        } else {
            C9298z zVar = this.f24034l;
            if (zVar != null) {
                zVar.mo25036a(lVar);
            }
        }
    }

    /* renamed from: a */
    public void mo24960a(C12185b bVar) {
        C9298z zVar = this.f24034l;
        if (zVar != null) {
            zVar.mo25038a(bVar.mo36070b());
        }
    }

    /* renamed from: a */
    public void mo24959a(C12184a aVar) {
        C9298z zVar = this.f24034l;
        if (zVar != null) {
            zVar.mo25039a(aVar.mo36070b(), aVar.mo36069a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean m22295a() {
        String str = "Answers";
        boolean a = C12186j.m32286a(mo36008b()).mo36071a();
        Boolean valueOf = Boolean.valueOf(false);
        if (!a) {
            C12154c.m32113f().mo35954d("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.");
            this.f24034l.mo25033a();
            return valueOf;
        }
        try {
            C12266r a2 = Settings.m32463d().mo36256a();
            if (a2 == null) {
                C12154c.m32113f().mo35956e(str, "Failed to retrieve settings");
                return valueOf;
            } else if (a2.f31919d.f31892d) {
                C12154c.m32113f().mo35954d(str, "Analytics collection enabled");
                this.f24034l.mo25037a(a2.f31920e, mo24962l());
                return Boolean.valueOf(true);
            } else {
                C12154c.m32113f().mo35954d(str, "Analytics collection disabled");
                this.f24034l.mo25033a();
                return valueOf;
            }
        } catch (Exception e) {
            C12154c.m32113f().mo35957e(str, "Error dealing with settings", e);
            return valueOf;
        }
    }

    /* renamed from: a */
    private void m22292a(String str) {
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(str);
        sb.append(" is not supported when using Crashlytics through Firebase.");
        f.mo35967w("Answers", sb.toString());
    }
}
