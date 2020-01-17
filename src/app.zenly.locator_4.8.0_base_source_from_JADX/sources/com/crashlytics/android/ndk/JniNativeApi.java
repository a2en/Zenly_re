package com.crashlytics.android.ndk;

import android.content.res.AssetManager;

class JniNativeApi implements C9428c {
    static {
        System.loadLibrary("crashlytics");
    }

    JniNativeApi() {
    }

    private native boolean nativeInit(String str, Object obj);

    /* renamed from: a */
    public boolean mo25240a(String str, AssetManager assetManager) {
        return nativeInit(str, assetManager);
    }
}
