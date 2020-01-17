package com.amplitude.api;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.amplitude.api.k */
public class C8692k {

    /* renamed from: a */
    Set<String> f22385a = new HashSet();

    static {
        new String[]{"city", "country", "dma", "ip_address", "lat_lng", "region"};
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo23465a() {
        return m20437a("adid");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo23466b() {
        return m20437a("carrier");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo23467c() {
        return m20437a("country");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo23468d() {
        return m20437a("device_brand");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo23469e() {
        return m20437a("device_manufacturer");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo23470f() {
        return m20437a("device_model");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo23471g() {
        return m20437a("language");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo23472h() {
        return m20437a("lat_lng");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo23473i() {
        return m20437a("os_name");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo23474j() {
        return m20437a("os_version");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo23475k() {
        return m20437a("platform");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo23476l() {
        return m20437a("version_name");
    }

    /* renamed from: a */
    private boolean m20437a(String str) {
        return !this.f22385a.contains(str);
    }
}
