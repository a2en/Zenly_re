package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.ac */
public final class C8754ac implements C8755a {

    /* renamed from: ˊ */
    private C8755a f22637 = this;

    /* renamed from: com.appsflyer.internal.ac$a */
    interface C8755a {
        /* renamed from: ˊ */
        Class<?> mo23775(String str) throws ClassNotFoundException;
    }

    /* renamed from: com.appsflyer.internal.ac$b */
    enum C8756b {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT(r6, r6),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "io.flutter.plugin.common.MethodChannel.MethodCallHandler");
        
        /* access modifiers changed from: private */

        /* renamed from: ʽ */
        public String f22647;
        /* access modifiers changed from: private */

        /* renamed from: ᐝ */
        public String f22648;

        private C8756b(String str, String str2) {
            this.f22647 = str;
            this.f22648 = str2;
        }
    }

    /* renamed from: ˎ */
    private boolean m20689(String str) {
        try {
            this.f22637.mo23775(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: ˊ */
    public final Class<?> mo23775(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* renamed from: ˏ */
    public final String mo23776() {
        C8756b[] values;
        for (C8756b bVar : C8756b.values()) {
            if (m20689(bVar.f22648)) {
                return bVar.f22647;
            }
        }
        return C8756b.DEFAULT.f22647;
    }
}
