package com.mapbox.mapboxsdk.attribution;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mapbox.mapboxsdk.attribution.a */
public class C11441a {

    /* renamed from: c */
    static final List<String> f29601c = new ArrayList();

    /* renamed from: a */
    private String f29602a;

    /* renamed from: b */
    private String f29603b;

    static {
        f29601c.add("https://www.mapbox.com/feedback/");
        f29601c.add("https://www.mapbox.com/map-feedback/");
        f29601c.add("https://apps.mapbox.com/feedback/");
    }

    C11441a(String str, String str2) {
        this.f29602a = str;
        this.f29603b = str2;
    }

    /* renamed from: a */
    public String mo33295a() {
        return this.f29602a;
    }

    /* renamed from: b */
    public String mo33296b() {
        if (this.f29602a.equals("OpenStreetMap")) {
            return "OSM";
        }
        return this.f29602a;
    }

    /* renamed from: c */
    public String mo33297c() {
        return this.f29603b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C11441a.class != obj.getClass()) {
            return false;
        }
        C11441a aVar = (C11441a) obj;
        String str = this.f29602a;
        if (str == null ? aVar.f29602a != null : !str.equals(aVar.f29602a)) {
            return false;
        }
        String str2 = this.f29603b;
        String str3 = aVar.f29603b;
        if (str2 != null) {
            z = str2.equals(str3);
        } else if (str3 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f29602a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f29603b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
