package com.getkeepsafe.relinker;

import android.os.Build;
import android.os.Build.VERSION;
import com.getkeepsafe.relinker.ReLinker.LibraryLoader;

/* renamed from: com.getkeepsafe.relinker.c */
final class C9939c implements LibraryLoader {
    C9939c() {
    }

    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }

    public void loadPath(String str) {
        System.load(str);
    }

    public String mapLibraryName(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }

    public String[] supportedAbis() {
        if (VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr;
            }
        }
        if (!C9940d.m24864a(Build.CPU_ABI2)) {
            return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
        return new String[]{Build.CPU_ABI};
    }

    public String unmapLibraryName(String str) {
        return str.substring(3, str.length() - 3);
    }
}
