package com.crashlytics.android.core;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p389io.fabric.sdk.android.services.common.C12180h;

/* renamed from: com.crashlytics.android.core.q0 */
class C9406q0 implements C9309a {
    C9406q0() {
    }

    /* renamed from: a */
    public String mo25070a(File file) throws IOException {
        return m22760a(file.getPath());
    }

    /* renamed from: a */
    private static String m22760a(String str) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String a = C12180h.m32245a((InputStream) bufferedInputStream2);
                C12180h.m32253a((Closeable) bufferedInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                C12180h.m32253a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C12180h.m32253a((Closeable) bufferedInputStream);
            throw th;
        }
    }
}
