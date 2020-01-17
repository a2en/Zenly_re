package com.bumptech.glide.p300n;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.bumptech.glide.n.b */
public final class C9200b {

    /* renamed from: a */
    private static final ConcurrentMap<String, Key> f23860a = new ConcurrentHashMap();

    /* renamed from: a */
    private static String m22051a(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public static Key m22052b(Context context) {
        String packageName = context.getPackageName();
        Key key = (Key) f23860a.get(packageName);
        if (key != null) {
            return key;
        }
        Key c = m22053c(context);
        Key key2 = (Key) f23860a.putIfAbsent(packageName, c);
        return key2 == null ? c : key2;
    }

    /* renamed from: c */
    private static Key m22053c(Context context) {
        return new C9202d(m22051a(m22050a(context)));
    }

    /* renamed from: a */
    private static PackageInfo m22050a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            Log.e("AppVersionSignature", sb.toString(), e);
            return null;
        }
    }
}
