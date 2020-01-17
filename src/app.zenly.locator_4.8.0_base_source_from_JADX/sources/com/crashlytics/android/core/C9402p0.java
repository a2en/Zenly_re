package com.crashlytics.android.core;

import com.crashlytics.android.core.C9388l0.C9389a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: com.crashlytics.android.core.p0 */
class C9402p0 implements C9388l0 {

    /* renamed from: a */
    private final File f24359a;

    /* renamed from: b */
    private final File[] f24360b;

    /* renamed from: c */
    private final Map<String, String> f24361c;

    public C9402p0(File file) {
        this(file, Collections.emptyMap());
    }

    /* renamed from: a */
    public Map<String, String> mo25081a() {
        return Collections.unmodifiableMap(this.f24361c);
    }

    /* renamed from: b */
    public String mo25082b() {
        return mo25083c().getName();
    }

    /* renamed from: c */
    public File mo25083c() {
        return this.f24359a;
    }

    /* renamed from: d */
    public File[] mo25084d() {
        return this.f24360b;
    }

    public String getIdentifier() {
        String b = mo25082b();
        return b.substring(0, b.lastIndexOf(46));
    }

    public C9389a getType() {
        return C9389a.JAVA;
    }

    public void remove() {
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Removing report at ");
        sb.append(this.f24359a.getPath());
        f.mo35954d("CrashlyticsCore", sb.toString());
        this.f24359a.delete();
    }

    public C9402p0(File file, Map<String, String> map) {
        this.f24359a = file;
        this.f24360b = new File[]{file};
        this.f24361c = new HashMap(map);
        if (this.f24359a.length() == 0) {
            this.f24361c.putAll(C9391m0.f24340g);
        }
    }
}
