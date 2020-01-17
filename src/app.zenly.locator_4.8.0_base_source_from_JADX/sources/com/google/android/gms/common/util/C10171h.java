package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* renamed from: com.google.android.gms.common.util.h */
public final class C10171h {
    /* renamed from: a */
    public static void m25673a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    private static long m25671a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return m25672a(inputStream, outputStream, z, 1024);
    }

    @Deprecated
    /* renamed from: a */
    public static long m25672a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m25673a((Closeable) inputStream);
                    m25673a((Closeable) outputStream);
                }
            }
        }
        return j;
    }

    @Deprecated
    /* renamed from: a */
    public static byte[] m25674a(InputStream inputStream) throws IOException {
        return m25675a(inputStream, true);
    }

    @Deprecated
    /* renamed from: a */
    public static byte[] m25675a(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m25671a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
