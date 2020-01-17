package p389io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: io.fabric.sdk.android.services.common.o */
public class C12194o {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo36077a(Context context) {
        int a = C12180h.m32237a(context, "google_app_id", "string");
        if (a == 0) {
            return null;
        }
        C12154c.m32113f().mo35954d("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return mo36078a(context.getResources().getString(a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo36079b(Context context) {
        if (!TextUtils.isEmpty(new C12178f().mo36062b(context))) {
            return true;
        }
        return !TextUtils.isEmpty(new C12178f().mo36063c(context));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo36080c(Context context) {
        int a = C12180h.m32237a(context, "google_app_id", "string");
        if (a == 0) {
            return false;
        }
        return !TextUtils.isEmpty(context.getResources().getString(a));
    }

    /* renamed from: d */
    public boolean mo36081d(Context context) {
        int a = C12180h.m32237a(context, "io.fabric.auto_initialize", "bool");
        if (a == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(a);
        if (z) {
            C12154c.m32113f().mo35954d("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo36082e(Context context) {
        boolean z = false;
        if (C12180h.m32258a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        if (mo36080c(context) && !mo36079b(context)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo36078a(String str) {
        return C12180h.m32270d(str).substring(0, 40);
    }
}
