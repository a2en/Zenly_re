package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import p389io.fabric.sdk.android.services.common.C12195p;

/* renamed from: com.crashlytics.android.core.a */
class C9303a {

    /* renamed from: a */
    public final String f24154a;

    /* renamed from: b */
    public final String f24155b;

    /* renamed from: c */
    public final String f24156c;

    /* renamed from: d */
    public final String f24157d;

    /* renamed from: e */
    public final String f24158e;

    /* renamed from: f */
    public final String f24159f;

    C9303a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f24154a = str;
        this.f24155b = str2;
        this.f24156c = str3;
        this.f24157d = str4;
        this.f24158e = str5;
        this.f24159f = str6;
    }

    /* renamed from: a */
    public static C9303a m22426a(Context context, C12195p pVar, String str, String str2) throws NameNotFoundException {
        String packageName = context.getPackageName();
        String f = pVar.mo36088f();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        C9303a aVar = new C9303a(str, str2, f, packageName, num, str3);
        return aVar;
    }
}
