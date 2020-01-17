package com.crashlytics.android.ndk;

import android.content.Context;
import com.crashlytics.android.core.C9399o;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: com.crashlytics.android.ndk.a */
class C9426a implements C9432e {

    /* renamed from: a */
    private final Context f24399a;

    /* renamed from: b */
    private final C9428c f24400b;

    /* renamed from: c */
    private final CrashFilesManager f24401c;

    C9426a(Context context, C9428c cVar, CrashFilesManager crashFilesManager) {
        this.f24399a = context;
        this.f24400b = cVar;
        this.f24401c = crashFilesManager;
    }

    /* renamed from: a */
    public C9399o mo25241a() throws IOException {
        TreeSet allNativeDirectories = this.f24401c.getAllNativeDirectories();
        if (!allNativeDirectories.isEmpty()) {
            allNativeDirectories.pollFirst();
        }
        return new C9399o(allNativeDirectories);
    }

    public boolean initialize() {
        File newNativeDirectory = this.f24401c.getNewNativeDirectory();
        if (newNativeDirectory == null) {
            return false;
        }
        try {
            return this.f24400b.mo25240a(newNativeDirectory.getCanonicalPath(), this.f24399a.getAssets());
        } catch (IOException e) {
            C12154c.m32113f().mo35957e("CrashlyticsNdk", "Error initializing CrashlyticsNdk", e);
            return false;
        }
    }
}
