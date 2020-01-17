package com.amplitude.api;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.i */
public class C8690i {

    /* renamed from: a */
    protected JSONObject f22375a = new JSONObject();

    /* renamed from: b */
    protected Set<String> f22376b = new HashSet();

    /* renamed from: a */
    public C8690i mo23443a(String str, JSONObject jSONObject) {
        m20410a("$set", str, jSONObject);
        return this;
    }

    /* renamed from: b */
    public C8690i mo23445b(String str, double d) {
        m20410a("$set", str, Double.valueOf(d));
        return this;
    }

    /* renamed from: c */
    public C8690i mo23450c(String str, double d) {
        m20410a("$setOnce", str, Double.valueOf(d));
        return this;
    }

    /* renamed from: a */
    public C8690i mo23444a(String str, String[] strArr) {
        m20410a("$set", str, m20409a(strArr));
        return this;
    }

    /* renamed from: b */
    public C8690i mo23446b(String str, float f) {
        m20410a("$set", str, Float.valueOf(f));
        return this;
    }

    /* renamed from: c */
    public C8690i mo23451c(String str, float f) {
        m20410a("$setOnce", str, Float.valueOf(f));
        return this;
    }

    /* renamed from: a */
    public C8690i mo23437a(String str, double d) {
        m20410a("$add", str, Double.valueOf(d));
        return this;
    }

    /* renamed from: b */
    public C8690i mo23447b(String str, int i) {
        m20410a("$set", str, Integer.valueOf(i));
        return this;
    }

    /* renamed from: c */
    public C8690i mo23452c(String str, int i) {
        m20410a("$setOnce", str, Integer.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public C8690i mo23438a(String str, float f) {
        m20410a("$add", str, Float.valueOf(f));
        return this;
    }

    /* renamed from: b */
    public C8690i mo23448b(String str, long j) {
        m20410a("$set", str, Long.valueOf(j));
        return this;
    }

    /* renamed from: c */
    public C8690i mo23453c(String str, long j) {
        m20410a("$setOnce", str, Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public C8690i mo23439a(String str, int i) {
        m20410a("$add", str, Integer.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public C8690i mo23449b(String str, String str2) {
        m20410a("$set", str, str2);
        return this;
    }

    /* renamed from: c */
    public C8690i mo23454c(String str, String str2) {
        m20410a("$setOnce", str, str2);
        return this;
    }

    /* renamed from: a */
    public C8690i mo23440a(String str, long j) {
        m20410a("$add", str, Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public C8690i mo23442a(String str, String str2) {
        m20410a("$add", str, str2);
        return this;
    }

    /* renamed from: a */
    private void m20410a(String str, String str2, Object obj) {
        String str3 = "com.amplitude.api.Identify";
        if (C8693l.m20451a(str2)) {
            C8681d.m20309a().mo23383d(str3, String.format("Attempting to perform operation %s with a null or empty string property, ignoring", new Object[]{str}));
        } else if (obj == null) {
            C8681d.m20309a().mo23383d(str3, String.format("Attempting to perform operation %s with null value for property %s, ignoring", new Object[]{str, str2}));
        } else if (this.f22375a.has("$clearAll")) {
            C8681d.m20309a().mo23383d(str3, String.format("This Identify already contains a $clearAll operation, ignoring operation %s", new Object[]{str}));
        } else if (this.f22376b.contains(str2)) {
            C8681d.m20309a().mo23383d(str3, String.format("Already used property %s in previous operation, ignoring operation %s", new Object[]{str2, str}));
        } else {
            try {
                if (!this.f22375a.has(str)) {
                    this.f22375a.put(str, new JSONObject());
                }
                this.f22375a.getJSONObject(str).put(str2, obj);
                this.f22376b.add(str2);
            } catch (JSONException e) {
                C8681d.m20309a().mo23381b(str3, e.toString());
            }
        }
    }

    /* renamed from: a */
    private JSONArray m20409a(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String put : strArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8690i mo23441a(String str, Object obj) {
        m20410a("$set", str, obj);
        return this;
    }
}
