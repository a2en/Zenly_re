package com.appsflyer;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Scanner;

public final class AFFacebookDeferredDeeplink {

    /* renamed from: ˊ */
    String f22509;

    /* renamed from: ˋ */
    public String f22510;

    /* renamed from: ˏ */
    String f22511;

    /* renamed from: ॱ */
    String f22512;

    /* renamed from: com.appsflyer.AFFacebookDeferredDeeplink$2 */
    public static class C87402 implements InvocationHandler {

        /* renamed from: ˋ */
        private static String f22513;

        /* renamed from: ˏ */
        private static String f22514;

        /* renamed from: ˊ */
        private /* synthetic */ Class f22515;

        /* renamed from: ॱ */
        private /* synthetic */ AppLinkFetchEvents f22516;

        C87402(Class cls, AppLinkFetchEvents appLinkFetchEvents) {
            this.f22515 = cls;
            this.f22516 = appLinkFetchEvents;
        }

        /* renamed from: ˊ */
        static void m20580(String str) {
            f22514 = str;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
            f22513 = sb.toString();
        }

        /* renamed from: ˎ */
        public static void m20581(String str) {
            if (f22514 == null) {
                m20580(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
            }
            String str2 = f22514;
            if (str2 != null && str.contains(str2)) {
                AFLogger.afInfoLog(str.replace(f22514, f22513));
            }
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String str;
            String str2;
            String str3;
            if (method.getName().equals("onDeferredAppLinkDataFetched")) {
                if (objArr[0] != null) {
                    Object cast = this.f22515.cast(objArr[0]);
                    Bundle bundle = (Bundle) Bundle.class.cast(this.f22515.getMethod("getArgumentBundle", new Class[0]).invoke(cast, new Object[0]));
                    if (bundle != null) {
                        str = bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                        str3 = bundle.getString("target_url");
                        Bundle bundle2 = bundle.getBundle("extras");
                        if (bundle2 != null) {
                            Bundle bundle3 = bundle2.getBundle("deeplink_context");
                            if (bundle3 != null) {
                                str2 = bundle3.getString("promo_code");
                            }
                        }
                        str2 = null;
                    } else {
                        str2 = null;
                        str = null;
                        str3 = null;
                    }
                    AppLinkFetchEvents appLinkFetchEvents = this.f22516;
                    if (appLinkFetchEvents != null) {
                        appLinkFetchEvents.onAppLinkFetchFinished(str, str3, str2);
                    }
                } else {
                    AppLinkFetchEvents appLinkFetchEvents2 = this.f22516;
                    if (appLinkFetchEvents2 != null) {
                        appLinkFetchEvents2.onAppLinkFetchFinished(null, null, null);
                    }
                }
                return null;
            }
            AppLinkFetchEvents appLinkFetchEvents3 = this.f22516;
            if (appLinkFetchEvents3 != null) {
                appLinkFetchEvents3.onAppLinkFetchFailed("onDeferredAppLinkDataFetched invocation failed");
            }
            return null;
        }

        C87402() {
        }
    }

    public interface AppLinkFetchEvents {
        void onAppLinkFetchFailed(String str);

        void onAppLinkFetchFinished(String str, String str2, String str3);
    }

    AFFacebookDeferredDeeplink() {
    }

    AFFacebookDeferredDeeplink(String str, String str2, String str3) {
        this.f22509 = str;
        this.f22511 = str2;
        this.f22512 = str3;
    }

    public AFFacebookDeferredDeeplink(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f22509 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f22512 = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.f22511 = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }
}
