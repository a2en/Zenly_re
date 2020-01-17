package com.crashlytics.android.core;

import com.crashlytics.android.core.C9388l0.C9389a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: com.crashlytics.android.core.y */
class C9424y implements C9388l0 {

    /* renamed from: a */
    private final File[] f24394a;

    /* renamed from: b */
    private final Map<String, String> f24395b = new HashMap(C9391m0.f24340g);

    /* renamed from: c */
    private final String f24396c;

    public C9424y(String str, File[] fileArr) {
        this.f24394a = fileArr;
        this.f24396c = str;
    }

    /* renamed from: a */
    public Map<String, String> mo25081a() {
        return Collections.unmodifiableMap(this.f24395b);
    }

    /* renamed from: b */
    public String mo25082b() {
        return this.f24394a[0].getName();
    }

    /* renamed from: c */
    public File mo25083c() {
        return this.f24394a[0];
    }

    /* renamed from: d */
    public File[] mo25084d() {
        return this.f24394a;
    }

    public String getIdentifier() {
        return this.f24396c;
    }

    public C9389a getType() {
        return C9389a.JAVA;
    }

    public void remove() {
        File[] fileArr;
        for (File file : this.f24394a) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Removing invalid report file at ");
            sb.append(file.getPath());
            f.mo35954d("CrashlyticsCore", sb.toString());
            file.delete();
        }
    }
}
