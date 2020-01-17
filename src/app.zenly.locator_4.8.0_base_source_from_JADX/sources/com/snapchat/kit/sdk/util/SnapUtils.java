package com.snapchat.kit.sdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

public class SnapUtils {
    /* renamed from: a */
    private static boolean m31060a(int i) {
        return i >= 1729;
    }

    public static String getFileProviderAuthority(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".fileprovider");
        return sb.toString();
    }

    public static Uri getFileProviderUri(Context context, File file) {
        if (file == null) {
            return null;
        }
        return FileProvider.m2525a(context, getFileProviderAuthority(context), file);
    }

    public static boolean isSnapchatInstalled(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (!applicationInfo.enabled || !m31060a(packageInfo.versionCode)) {
                return false;
            }
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
