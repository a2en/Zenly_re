package com.google.android.gms.iid;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.C0540a;
import java.io.File;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.iid.o */
final class C10239o {
    C10239o() {
    }

    /* renamed from: a */
    static void m25869a(Context context, String str) {
        File b = m25871b(context, str);
        if (b.exists()) {
            b.delete();
        }
    }

    /* renamed from: b */
    private static File m25870b(Context context) {
        File b = C0540a.m2544b(context);
        if (b != null && b.isDirectory()) {
            return b;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: a */
    static void m25868a(Context context) {
        File[] listFiles;
        for (File file : m25870b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: b */
    private static File m25871b(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m25870b(context), str2);
    }
}
