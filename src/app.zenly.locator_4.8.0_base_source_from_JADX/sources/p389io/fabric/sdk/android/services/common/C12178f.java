package p389io.fabric.sdk.android.services.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: io.fabric.sdk.android.services.common.f */
public class C12178f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo36060a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo36061a(Context context) {
        return new C12194o().mo36077a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo36062b(Context context) {
        String str = "Fabric";
        String str2 = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    C12154c.m32113f().mo35954d(str, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
                C12154c.m32113f().mo35954d(str, "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                e = e;
                str2 = string;
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Caught non-fatal exception while retrieving apiKey: ");
                sb.append(e);
                f.mo35954d(str, sb.toString());
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
            Logger f2 = C12154c.m32113f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Caught non-fatal exception while retrieving apiKey: ");
            sb2.append(e);
            f2.mo35954d(str, sb2.toString());
            return str2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo36063c(Context context) {
        String str = "string";
        int a = C12180h.m32237a(context, "io.fabric.ApiKey", str);
        if (a == 0) {
            C12154c.m32113f().mo35954d("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = C12180h.m32237a(context, "com.crashlytics.ApiKey", str);
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    /* renamed from: d */
    public String mo36064d(Context context) {
        String b = mo36062b(context);
        if (TextUtils.isEmpty(b)) {
            b = mo36063c(context);
        }
        if (TextUtils.isEmpty(b)) {
            b = mo36061a(context);
        }
        if (TextUtils.isEmpty(b)) {
            mo36065e(context);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo36065e(Context context) {
        if (C12154c.m32115h() || C12180h.m32276j(context)) {
            throw new IllegalArgumentException(mo36060a());
        }
        C12154c.m32113f().mo35956e("Fabric", mo36060a());
    }
}
