package com.segment.analytics.p326t;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.segment.analytics.t.b */
public final class C11692b {

    /* renamed from: com.segment.analytics.t.b$a */
    public static class C11693a extends ThreadPoolExecutor {
        public C11693a() {
            super(1, 2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C11695c());
        }
    }

    /* renamed from: com.segment.analytics.t.b$b */
    private static class C11694b extends Thread {

        /* renamed from: e */
        private static final AtomicInteger f30319e = new AtomicInteger(1);

        public C11694b(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("Segment-");
            sb.append(f30319e.getAndIncrement());
            super(runnable, sb.toString());
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.segment.analytics.t.b$c */
    public static class C11695c implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new C11694b(runnable);
        }
    }

    /* renamed from: com.segment.analytics.t.b$d */
    public static class C11696d<K, V> extends ConcurrentHashMap<K, V> {
        public C11696d() {
        }

        public V put(K k, V v) {
            if (k == null || v == null) {
                return null;
            }
            return super.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        public C11696d(Map<? extends K, ? extends V> map) {
            super(map);
        }
    }

    /* renamed from: a */
    public static String m30703a(Date date) {
        return m30715b(date);
    }

    /* renamed from: b */
    public static String m30715b(Date date) {
        return C11691a.m30691a(date);
    }

    /* renamed from: c */
    public static <T> T m30719c(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: d */
    public static boolean m30722d(Context context, String str) {
        return context.getPackageManager().hasSystemFeature(str);
    }

    /* renamed from: e */
    public static boolean m30723e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: a */
    private static int m30694a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (length > i && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        return length - i;
    }

    /* renamed from: b */
    private static boolean m30717b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: c */
    public static boolean m30721c(CharSequence charSequence) {
        return m30717b(charSequence) || m30694a(charSequence) == 0;
    }

    /* renamed from: b */
    public static boolean m30718b(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: c */
    public static JSONObject m30720c(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), m30697a(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static SharedPreferences m30713b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("analytics-android-");
        sb.append(str);
        return context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: a */
    public static boolean m30712a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: b */
    public static boolean m30716b(Context context) {
        boolean z = true;
        if (!m30723e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) m30719c(context, "connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static String m30702a(String str, String str2) {
        if (!m30721c((CharSequence) str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" cannot be null or empty");
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: a */
    public static <T> T m30698a(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m30706a(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: b */
    public static String m30714b(InputStream inputStream) throws IOException {
        return m30701a(m30695a(inputStream));
    }

    /* renamed from: a */
    public static <T> List<T> m30704a(List<T> list) {
        if (m30712a((Collection) list)) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static String m30699a(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!m30721c((CharSequence) string) && !"9774d56d682e549c".equals(string) && !"unknown".equals(string) && !"000000000000000".equals(string)) {
            return string;
        }
        if (!m30721c((CharSequence) Build.SERIAL)) {
            return Build.SERIAL;
        }
        if (m30723e(context, "android.permission.READ_PHONE_STATE") && m30722d(context, "android.hardware.telephony")) {
            String deviceId = ((TelephonyManager) m30719c(context, "phone")).getDeviceId();
            if (!m30721c((CharSequence) deviceId)) {
                return deviceId;
            }
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m30700a(Context context, String str) {
        int a = m30693a(context, "string", str);
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    /* renamed from: a */
    private static int m30693a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str2, str, context.getPackageName());
    }

    /* renamed from: a */
    public static boolean m30711a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m30709a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static BufferedReader m30695a(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    /* renamed from: a */
    public static String m30701a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    /* renamed from: a */
    public static InputStream m30696a(HttpURLConnection httpURLConnection) throws IOException {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    public static <T> Map<String, T> m30707a(Map<String, T> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!map2.containsKey(str)) {
                linkedHashMap.put(str, entry.getValue());
            } else {
                String str2 = (String) map2.get(str);
                if (!m30721c((CharSequence) str2)) {
                    linkedHashMap.put(str2, entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static Object m30697a(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
            if (obj.equals(JSONObject.NULL)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    return new JSONArray((Collection) obj);
                }
                if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < length; i++) {
                        jSONArray.put(m30697a(Array.get(jSONArray, i)));
                    }
                    return jSONArray;
                } else if (obj instanceof Map) {
                    return m30720c((Map) obj);
                } else {
                    if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short)) {
                        if (!(obj instanceof String)) {
                            obj = obj.toString();
                        }
                    }
                    return obj;
                }
            } catch (Exception unused) {
                obj = JSONObject.NULL;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public static <T> Map<String, T> m30705a() {
        return new C11696d();
    }

    /* renamed from: a */
    public static void m30710a(File file) throws IOException {
        if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create directory at ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m30708a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        Editor edit = sharedPreferences2.edit();
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                edit.putString(str, (String) value);
            } else if (value instanceof Set) {
                edit.putStringSet(str, (Set) value);
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(str, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            }
        }
        edit.apply();
    }
}
