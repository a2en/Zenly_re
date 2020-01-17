package com.crashlytics.android.core;

import com.appsflyer.AppsFlyerProperties;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.services.common.C12180h;

/* renamed from: com.crashlytics.android.core.a0 */
class C9304a0 {

    /* renamed from: b */
    private static final Charset f24160b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f24161a;

    /* renamed from: com.crashlytics.android.core.a0$a */
    static class C9305a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ C9415u0 f24162a;

        C9305a(C9415u0 u0Var) throws JSONException {
            this.f24162a = u0Var;
            put("userId", this.f24162a.f24378a);
            put("userName", this.f24162a.f24379b);
            put(AppsFlyerProperties.USER_EMAIL, this.f24162a.f24380c);
        }
    }

    public C9304a0(File file) {
        this.f24161a = file;
    }

    /* renamed from: d */
    private static C9415u0 m22430d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new C9415u0(m22429a(jSONObject, "userId"), m22429a(jSONObject, "userName"), m22429a(jSONObject, AppsFlyerProperties.USER_EMAIL));
    }

    /* renamed from: a */
    public void mo25062a(String str, C9415u0 u0Var) {
        String str2 = "Failed to close user metadata file.";
        File b = mo25064b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String a = m22427a(u0Var);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), f24160b));
            try {
                bufferedWriter2.write(a);
                bufferedWriter2.flush();
                C12180h.m32254a((Closeable) bufferedWriter2, str2);
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C12154c.m32113f().mo35957e("CrashlyticsCore", "Error serializing user metadata.", e);
                    C12180h.m32254a((Closeable) bufferedWriter, str2);
                } catch (Throwable th) {
                    th = th;
                    C12180h.m32254a((Closeable) bufferedWriter, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C12180h.m32254a((Closeable) bufferedWriter, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C12154c.m32113f().mo35957e("CrashlyticsCore", "Error serializing user metadata.", e);
            C12180h.m32254a((Closeable) bufferedWriter, str2);
        }
    }

    /* renamed from: b */
    public File mo25064b(String str) {
        File file = this.f24161a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    /* renamed from: c */
    public C9415u0 mo25065c(String str) {
        String str2 = "Failed to close user metadata file.";
        File b = mo25064b(str);
        if (!b.exists()) {
            return C9415u0.f24377d;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b);
            try {
                C9415u0 d = m22430d(C12180h.m32262b((InputStream) fileInputStream2));
                C12180h.m32254a((Closeable) fileInputStream2, str2);
                return d;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C12154c.m32113f().mo35957e("CrashlyticsCore", "Error deserializing user metadata.", e);
                    C12180h.m32254a((Closeable) fileInputStream, str2);
                    return C9415u0.f24377d;
                } catch (Throwable th) {
                    th = th;
                    C12180h.m32254a((Closeable) fileInputStream, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C12180h.m32254a((Closeable) fileInputStream, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C12154c.m32113f().mo35957e("CrashlyticsCore", "Error deserializing user metadata.", e);
            C12180h.m32254a((Closeable) fileInputStream, str2);
            return C9415u0.f24377d;
        }
    }

    /* renamed from: a */
    public void mo25063a(String str, Map<String, String> map) {
        String str2 = "Failed to close key/value metadata file.";
        File a = mo25061a(str);
        BufferedWriter bufferedWriter = null;
        try {
            String a2 = m22428a(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), f24160b));
            try {
                bufferedWriter2.write(a2);
                bufferedWriter2.flush();
                C12180h.m32254a((Closeable) bufferedWriter2, str2);
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C12154c.m32113f().mo35957e("CrashlyticsCore", "Error serializing key/value metadata.", e);
                    C12180h.m32254a((Closeable) bufferedWriter, str2);
                } catch (Throwable th) {
                    th = th;
                    C12180h.m32254a((Closeable) bufferedWriter, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C12180h.m32254a((Closeable) bufferedWriter, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C12154c.m32113f().mo35957e("CrashlyticsCore", "Error serializing key/value metadata.", e);
            C12180h.m32254a((Closeable) bufferedWriter, str2);
        }
    }

    /* renamed from: a */
    public File mo25061a(String str) {
        File file = this.f24161a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    /* renamed from: a */
    private static String m22427a(C9415u0 u0Var) throws JSONException {
        return new C9305a(u0Var).toString();
    }

    /* renamed from: a */
    private static String m22428a(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    /* renamed from: a */
    private static String m22429a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }
}
