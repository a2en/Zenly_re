package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.f */
public class C10075f {

    /* renamed from: b */
    private static C10075f f26475b;

    /* renamed from: a */
    private final Context f26476a;

    private C10075f(Context context) {
        this.f26476a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C10075f m25325a(Context context) {
        C10123l.m25505a(context);
        synchronized (C10075f.class) {
            if (f26475b == null) {
                C10145l.m25600a(context);
                f26475b = new C10075f(context);
            }
        }
        return f26475b;
    }

    /* renamed from: a */
    public static boolean m25327a(PackageInfo packageInfo, boolean z) {
        C10146m mVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                mVar = m25326a(packageInfo, C10150q.f26667a);
            } else {
                mVar = m25326a(packageInfo, C10150q.f26667a[0]);
            }
            if (mVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo27329a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m25327a(packageInfo, false)) {
            return true;
        }
        if (m25327a(packageInfo, true)) {
            if (C10074e.honorsDebugCertificates(this.f26476a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: a */
    private static C10146m m25326a(PackageInfo packageInfo, C10146m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C10148o oVar = new C10148o(signatureArr[0].toByteArray());
        for (int i = 0; i < mVarArr.length; i++) {
            if (mVarArr[i].equals(oVar)) {
                return mVarArr[i];
            }
        }
        return null;
    }
}
