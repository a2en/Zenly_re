package com.google.android.gms.common.p309i;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.util.C10174k;

/* renamed from: com.google.android.gms.common.i.a */
public class C10078a {

    /* renamed from: a */
    private final Context f26479a;

    public C10078a(Context context) {
        this.f26479a = context;
    }

    /* renamed from: a */
    public ApplicationInfo mo27331a(String str, int i) throws NameNotFoundException {
        return this.f26479a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public PackageInfo mo27333b(String str, int i) throws NameNotFoundException {
        return this.f26479a.getPackageManager().getPackageInfo(str, i);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo27332a(int i, String str) {
        if (C10174k.m25682e()) {
            try {
                ((AppOpsManager) this.f26479a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f26479a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public CharSequence mo27334b(String str) throws NameNotFoundException {
        return this.f26479a.getPackageManager().getApplicationLabel(this.f26479a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: a */
    public int mo27330a(String str) {
        return this.f26479a.checkCallingOrSelfPermission(str);
    }
}
