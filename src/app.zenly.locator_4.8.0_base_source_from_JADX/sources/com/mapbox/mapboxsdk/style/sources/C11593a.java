package com.mapbox.mapboxsdk.style.sources;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mapbox.mapboxsdk.style.sources.a */
public class C11593a {

    /* renamed from: a */
    private final String f30078a;

    /* renamed from: b */
    private String f30079b;

    /* renamed from: c */
    private String f30080c;

    /* renamed from: d */
    private String f30081d;

    /* renamed from: e */
    private String f30082e;

    /* renamed from: f */
    private String f30083f;

    /* renamed from: g */
    private String f30084g;

    /* renamed from: h */
    private String f30085h;

    /* renamed from: i */
    private final String[] f30086i;

    /* renamed from: j */
    private String[] f30087j;

    /* renamed from: k */
    private String[] f30088k;

    /* renamed from: l */
    private Float f30089l;

    /* renamed from: m */
    private Float f30090m;

    /* renamed from: n */
    private Float[] f30091n;

    /* renamed from: o */
    private Float[] f30092o;

    /* renamed from: p */
    private String f30093p;

    public C11593a(String str, String... strArr) {
        this.f30078a = str;
        this.f30086i = strArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, Object> mo34191a() {
        HashMap hashMap = new HashMap();
        hashMap.put("tilejson", this.f30078a);
        hashMap.put("tiles", this.f30086i);
        String str = this.f30079b;
        if (str != null) {
            hashMap.put("name", str);
        }
        String str2 = this.f30080c;
        if (str2 != null) {
            hashMap.put("description", str2);
        }
        String str3 = this.f30081d;
        if (str3 != null) {
            hashMap.put("version", str3);
        }
        String str4 = this.f30082e;
        if (str4 != null) {
            hashMap.put("attribution", str4);
        }
        String str5 = this.f30083f;
        if (str5 != null) {
            hashMap.put("template", str5);
        }
        String str6 = this.f30084g;
        if (str6 != null) {
            hashMap.put("legend", str6);
        }
        String str7 = this.f30085h;
        if (str7 != null) {
            hashMap.put("scheme", str7);
        }
        String[] strArr = this.f30087j;
        if (strArr != null) {
            hashMap.put("grids", strArr);
        }
        String[] strArr2 = this.f30088k;
        if (strArr2 != null) {
            hashMap.put("data", strArr2);
        }
        Float f = this.f30089l;
        if (f != null) {
            hashMap.put("minzoom", f);
        }
        Float f2 = this.f30090m;
        if (f2 != null) {
            hashMap.put("maxzoom", f2);
        }
        Float[] fArr = this.f30091n;
        if (fArr != null) {
            hashMap.put("bounds", fArr);
        }
        Float[] fArr2 = this.f30092o;
        if (fArr2 != null) {
            hashMap.put("center", fArr2);
        }
        String str8 = this.f30093p;
        if (str8 != null) {
            hashMap.put("encoding", str8);
        }
        return hashMap;
    }
}
