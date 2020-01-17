package com.crashlytics.android.core;

import com.crashlytics.android.core.C9388l0.C9389a;
import java.io.File;
import java.util.Map;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: com.crashlytics.android.core.f0 */
class C9317f0 implements C9388l0 {

    /* renamed from: a */
    private final File f24177a;

    public C9317f0(File file) {
        this.f24177a = file;
    }

    /* renamed from: a */
    public Map<String, String> mo25081a() {
        return null;
    }

    /* renamed from: b */
    public String mo25082b() {
        return null;
    }

    /* renamed from: c */
    public File mo25083c() {
        return null;
    }

    /* renamed from: d */
    public File[] mo25084d() {
        return this.f24177a.listFiles();
    }

    public String getIdentifier() {
        return this.f24177a.getName();
    }

    public C9389a getType() {
        return C9389a.NATIVE;
    }

    public void remove() {
        File[] d = mo25084d();
        int length = d.length;
        int i = 0;
        while (true) {
            String str = "CrashlyticsCore";
            if (i < length) {
                File file = d[i];
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Removing native report file at ");
                sb.append(file.getPath());
                f.mo35954d(str, sb.toString());
                file.delete();
                i++;
            } else {
                Logger f2 = C12154c.m32113f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Removing native report directory at ");
                sb2.append(this.f24177a);
                f2.mo35954d(str, sb2.toString());
                this.f24177a.delete();
                return;
            }
        }
    }
}
