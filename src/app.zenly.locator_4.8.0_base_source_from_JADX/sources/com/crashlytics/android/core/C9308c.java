package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: com.crashlytics.android.core.c */
class C9308c {

    /* renamed from: a */
    private final Context f24166a;

    /* renamed from: b */
    private final C9309a f24167b;

    /* renamed from: com.crashlytics.android.core.c$a */
    interface C9309a {
        /* renamed from: a */
        String mo25070a(File file) throws IOException;
    }

    C9308c(Context context, C9309a aVar) {
        this.f24166a = context;
        this.f24167b = aVar;
    }

    /* renamed from: b */
    private JSONArray m22443b(BufferedReader bufferedReader) throws IOException {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject c = m22444c(readLine);
            if (c != null) {
                jSONArray.put(c);
            }
        }
    }

    /* renamed from: c */
    private JSONObject m22444c(String str) {
        String str2 = "CrashlyticsCore";
        C9323h0 a = C9330i0.m22539a(str);
        if (a != null && m22439a(a)) {
            try {
                try {
                    return m22438a(this.f24167b.mo25070a(m22441b(a.f24190d)), a);
                } catch (JSONException e) {
                    C12154c.m32113f().mo35955d(str2, "Could not create a binary image json string", e);
                    return null;
                }
            } catch (IOException e2) {
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not generate ID for file ");
                sb.append(a.f24190d);
                f.mo35955d(str2, sb.toString(), e2);
            }
        }
        return null;
    }

    /* renamed from: d */
    private JSONArray m22445d(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = m22442b(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String c : split) {
                JSONObject c2 = m22444c(c);
                if (c2 != null) {
                    jSONArray.put(c2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            C12154c.m32113f().mo35968w("CrashlyticsCore", "Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo25069a(String str) throws IOException {
        return m22440a(m22445d(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo25068a(BufferedReader bufferedReader) throws IOException {
        return m22440a(m22443b(bufferedReader));
    }

    /* renamed from: a */
    private File m22437a(File file) {
        if (VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith("/data")) {
            try {
                file = new File(this.f24166a.getPackageManager().getApplicationInfo(this.f24166a.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (NameNotFoundException e) {
                C12154c.m32113f().mo35957e("CrashlyticsCore", "Error getting ApplicationInfo", e);
            }
        }
        return file;
    }

    /* renamed from: b */
    private File m22441b(String str) {
        File file = new File(str);
        return !file.exists() ? m22437a(file) : file;
    }

    /* renamed from: b */
    private static String m22442b(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static byte[] m22440a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            C12154c.m32113f().mo35968w("CrashlyticsCore", "Binary images string is null", e);
            return new byte[0];
        }
    }

    /* renamed from: a */
    private static JSONObject m22438a(String str, C9323h0 h0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", h0Var.f24187a);
        jSONObject.put("size", h0Var.f24188b);
        jSONObject.put("name", h0Var.f24190d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    /* renamed from: a */
    private static boolean m22439a(C9323h0 h0Var) {
        return (h0Var.f24189c.indexOf(120) == -1 || h0Var.f24190d.indexOf(47) == -1) ? false : true;
    }
}
