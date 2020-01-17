package com.amplitude.api;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.l */
public class C8693l {

    /* renamed from: a */
    private static C8681d f22386a = C8681d.m20309a();

    /* renamed from: a */
    static JSONObject m20450a(JSONObject jSONObject) {
        JSONArray jSONArray;
        String str = "com.amplitude.api.Utils";
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e) {
            f22386a.mo23381b(str, e.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e2) {
            f22386a.mo23381b(str, e2.toString());
            return null;
        }
    }

    /* renamed from: b */
    static String m20453b(String str) {
        if (m20451a(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }

    /* renamed from: a */
    static boolean m20452a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if ((jSONObject != null && jSONObject2 == null) || (jSONObject == null && jSONObject2 != null)) {
            return false;
        }
        try {
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (!jSONObject2.has(str)) {
                    return false;
                }
                Object obj = jSONObject.get(str);
                Object obj2 = jSONObject2.get(str);
                if (!obj.getClass().equals(obj2.getClass())) {
                    return false;
                }
                if (obj.getClass() == JSONObject.class) {
                    if (!m20452a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m20451a(String str) {
        return str == null || str.length() == 0;
    }
}
