package com.crashlytics.android.core;

import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import p389io.fabric.sdk.android.services.common.C12180h;

/* renamed from: com.crashlytics.android.core.e0 */
final class C9314e0 {
    /* renamed from: a */
    private static byte[] m22467a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    static byte[] m22468b(File file) {
        File a = m22463a(file, ".dmp");
        if (a == null) {
            return new byte[0];
        }
        return m22470c(a);
    }

    /* renamed from: c */
    private static byte[] m22470c(File file) {
        return m22472d(file);
    }

    /* renamed from: d */
    static byte[] m22472d(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] a = m22467a((InputStream) fileInputStream);
                C12180h.m32253a((Closeable) fileInputStream);
                return a;
            } catch (FileNotFoundException unused) {
                C12180h.m32253a((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                C12180h.m32253a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C12180h.m32253a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
            C12180h.m32253a((Closeable) fileInputStream);
            return null;
        } catch (IOException unused4) {
            fileInputStream = null;
            C12180h.m32253a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C12180h.m32253a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* renamed from: c */
    private static byte[] m22471c(File file, Context context) throws IOException {
        BufferedReader bufferedReader;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new C9308c(context, new C9406q0()).mo25068a(bufferedReader);
                C12180h.m32253a((Closeable) bufferedReader);
                return a;
            } catch (Throwable th) {
                th = th;
                C12180h.m32253a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            C12180h.m32253a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: b */
    static byte[] m22469b(File file, Context context) throws IOException {
        File a = m22463a(file, ".maps");
        if (a != null) {
            return m22471c(a, context);
        }
        File a2 = m22463a(file, ".binary_libs");
        if (a2 != null) {
            return m22466a(a2, context);
        }
        return null;
    }

    /* renamed from: a */
    private static File m22463a(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m22466a(File file, Context context) throws IOException {
        byte[] d = m22472d(file);
        if (d == null || d.length == 0) {
            return null;
        }
        return m22464a(context, new String(d));
    }

    /* renamed from: a */
    static byte[] m22465a(File file) {
        File a = m22463a(file, ".device_info");
        if (a == null) {
            return null;
        }
        return m22472d(a);
    }

    /* renamed from: a */
    private static byte[] m22464a(Context context, String str) throws IOException {
        return new C9308c(context, new C9406q0()).mo25069a(str);
    }
}
