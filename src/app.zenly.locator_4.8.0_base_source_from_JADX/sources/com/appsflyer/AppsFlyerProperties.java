package com.appsflyer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_KEY = "AppsFlyerKey";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_FINGER_PRINT = "collectFingerPrint";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_MAC = "collectMAC";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String IS_MONITOR = "shouldMonitor";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";

    /* renamed from: ॱ */
    private static AppsFlyerProperties f22586 = new AppsFlyerProperties();

    /* renamed from: ʽ */
    private boolean f22587 = false;

    /* renamed from: ˊ */
    private boolean f22588;

    /* renamed from: ˋ */
    private Map<String, Object> f22589 = Collections.synchronizedMap(new HashMap());

    /* renamed from: ˎ */
    private boolean f22590;

    /* renamed from: ˏ */
    private String f22591;

    public enum EmailsCryptType {
        NONE(0),
        SHA1(1),
        MD5(2),
        SHA256(3);
        

        /* renamed from: ˏ */
        private final int f22593;

        private EmailsCryptType(int i) {
            this.f22593 = i;
        }

        public final int getValue() {
            return this.f22593;
        }
    }

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return f22586;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.valueOf(string).longValue();
    }

    public Object getObject(String str) {
        return this.f22589.get(str);
    }

    public String getReferrer(Context context) {
        String str = this.f22591;
        if (str != null) {
            return str;
        }
        String str2 = "AF_REFERRER";
        if (getString(str2) != null) {
            return getString(str2);
        }
        if (context == null) {
            return null;
        }
        return AppsFlyerLibCore.m20625(context).getString("referrer", null);
    }

    public String getString(String str) {
        return (String) this.f22589.get(str);
    }

    public boolean isEnableLog() {
        return getBoolean("shouldLog", true);
    }

    /* access modifiers changed from: protected */
    public boolean isFirstLaunchCalled() {
        return this.f22590;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    /* access modifiers changed from: protected */
    public boolean isOnReceiveCalled() {
        return this.f22588;
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public void loadProperties(Context context) {
        if (!this.f22587) {
            String string = AppsFlyerLibCore.m20625(context).getString("savedProperties", null);
            if (string != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (this.f22589.get(str) == null) {
                            this.f22589.put(str, jSONObject.getString(str));
                        }
                    }
                    this.f22587 = true;
                } catch (JSONException e) {
                    AFLogger.afErrorLog("Failed loading properties", e);
                }
                StringBuilder sb = new StringBuilder("Done loading properties: ");
                sb.append(this.f22587);
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }

    public void remove(String str) {
        this.f22589.remove(str);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void saveProperties(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.f22589).toString();
        Editor edit = sharedPreferences.edit();
        edit.putString("savedProperties", jSONObject);
        edit.apply();
    }

    public void set(String str, String str2) {
        this.f22589.put(str, str2);
    }

    public void setCustomData(String str) {
        this.f22589.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled(boolean z) {
        this.f22590 = z;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.f22588 = true;
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f22591 = str;
    }

    public void setUserEmails(String str) {
        this.f22589.put(USER_EMAILS, str);
    }

    public void set(String str, String[] strArr) {
        this.f22589.put(str, strArr);
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled() {
        this.f22590 = true;
    }

    public void set(String str, int i) {
        this.f22589.put(str, Integer.toString(i));
    }

    public void set(String str, long j) {
        this.f22589.put(str, Long.toString(j));
    }

    public void set(String str, boolean z) {
        this.f22589.put(str, Boolean.toString(z));
    }
}
