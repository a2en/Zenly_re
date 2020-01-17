package com.appsflyer.internal;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.i */
public final class C8773i {
    C8773i() {
    }

    /* renamed from: ˏ */
    public static JSONObject m20735(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), m20734(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: ˏ */
    private static Object m20734(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
            if (obj.equals(JSONObject.NULL)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    JSONArray jSONArray = new JSONArray();
                    for (Object r1 : (Collection) obj) {
                        jSONArray.put(m20734(r1));
                    }
                    return jSONArray;
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < length; i++) {
                        jSONArray2.put(m20734(Array.get(obj, i)));
                    }
                    return jSONArray2;
                } else if (obj instanceof Map) {
                    return m20735((Map) obj);
                } else {
                    if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                        obj = obj.toString();
                    }
                    return obj;
                }
            } catch (Exception unused) {
                obj = JSONObject.NULL;
            }
        }
        return obj;
    }
}
