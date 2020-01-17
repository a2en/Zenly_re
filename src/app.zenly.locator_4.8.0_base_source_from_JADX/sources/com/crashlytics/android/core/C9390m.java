package com.crashlytics.android.core;

import java.io.File;
import java.io.IOException;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.persistence.FileStore;

/* renamed from: com.crashlytics.android.core.m */
class C9390m {

    /* renamed from: a */
    private final String f24338a;

    /* renamed from: b */
    private final FileStore f24339b;

    public C9390m(String str, FileStore fileStore) {
        this.f24338a = str;
        this.f24339b = fileStore;
    }

    /* renamed from: d */
    private File m22702d() {
        return new File(this.f24339b.getFilesDir(), this.f24338a);
    }

    /* renamed from: a */
    public boolean mo25209a() {
        try {
            return m22702d().createNewFile();
        } catch (IOException e) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating marker: ");
            sb.append(this.f24338a);
            f.mo35957e("CrashlyticsCore", sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo25210b() {
        return m22702d().exists();
    }

    /* renamed from: c */
    public boolean mo25211c() {
        return m22702d().delete();
    }
}
