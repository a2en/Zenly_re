package com.amplitude.api;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.j */
public class C8691j {

    /* renamed from: h */
    private static C8681d f22377h = C8681d.m20309a();

    /* renamed from: a */
    protected String f22378a = null;

    /* renamed from: b */
    protected int f22379b = 1;

    /* renamed from: c */
    protected Double f22380c = null;

    /* renamed from: d */
    protected String f22381d = null;

    /* renamed from: e */
    protected String f22382e = null;

    /* renamed from: f */
    protected String f22383f = null;

    /* renamed from: g */
    protected JSONObject f22384g = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23460a() {
        if (this.f22380c != null) {
            return true;
        }
        f22377h.mo23383d("com.amplitude.api.Revenue", "Invalid revenue, need to set price");
        return false;
    }

    /* renamed from: b */
    public C8691j mo23461b(String str) {
        this.f22381d = str;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8691j.class != obj.getClass()) {
            return false;
        }
        C8691j jVar = (C8691j) obj;
        if (this.f22379b != jVar.f22379b) {
            return false;
        }
        String str = this.f22378a;
        if (str == null ? jVar.f22378a != null : !str.equals(jVar.f22378a)) {
            return false;
        }
        Double d = this.f22380c;
        if (d == null ? jVar.f22380c != null : !d.equals(jVar.f22380c)) {
            return false;
        }
        String str2 = this.f22381d;
        if (str2 == null ? jVar.f22381d != null : !str2.equals(jVar.f22381d)) {
            return false;
        }
        String str3 = this.f22382e;
        if (str3 == null ? jVar.f22382e != null : !str3.equals(jVar.f22382e)) {
            return false;
        }
        String str4 = this.f22383f;
        if (str4 == null ? jVar.f22383f != null : !str4.equals(jVar.f22383f)) {
            return false;
        }
        JSONObject jSONObject = this.f22384g;
        JSONObject jSONObject2 = jVar.f22384g;
        if (jSONObject == null ? jSONObject2 != null : !C8693l.m20452a(jSONObject, jSONObject2)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f22378a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f22379b) * 31;
        Double d = this.f22380c;
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f22381d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22382e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f22383f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f22384g;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode5 + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONObject mo23462b() {
        JSONObject jSONObject = this.f22384g;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("$productId", this.f22378a);
            jSONObject.put("$quantity", this.f22379b);
            jSONObject.put("$price", this.f22380c);
            jSONObject.put("$revenueType", this.f22381d);
            jSONObject.put("$receipt", this.f22382e);
            jSONObject.put("$receiptSig", this.f22383f);
        } catch (JSONException e) {
            f22377h.mo23381b("com.amplitude.api.Revenue", String.format("Failed to convert revenue object to JSON: %s", new Object[]{e.toString()}));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public C8691j mo23457a(String str) {
        if (C8693l.m20451a(str)) {
            f22377h.mo23383d("com.amplitude.api.Revenue", "Invalid empty productId");
            return this;
        }
        this.f22378a = str;
        return this;
    }

    /* renamed from: a */
    public C8691j mo23456a(int i) {
        this.f22379b = i;
        return this;
    }

    /* renamed from: a */
    public C8691j mo23455a(double d) {
        this.f22380c = Double.valueOf(d);
        return this;
    }

    /* renamed from: a */
    public C8691j mo23458a(String str, String str2) {
        this.f22382e = str;
        this.f22383f = str2;
        return this;
    }

    /* renamed from: a */
    public C8691j mo23459a(JSONObject jSONObject) {
        this.f22384g = C8693l.m20450a(jSONObject);
        return this;
    }
}
