package com.facebook.common.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: com.facebook.common.internal.a */
public final class C9522a {

    /* renamed from: com.facebook.common.internal.a$b */
    private static final class C9524b extends ByteArrayOutputStream {
        private C9524b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo25659a(byte[] bArr, int i) {
            System.arraycopy(this.buf, 0, bArr, i, this.count);
        }
    }

    /* renamed from: a */
    public static long m23248a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C9536j.m23271a(inputStream);
        C9536j.m23271a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static int m23247a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        C9536j.m23271a(inputStream);
        C9536j.m23271a(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    /* renamed from: a */
    public static byte[] m23249a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m23248a(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[] m23250a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        C9524b bVar = new C9524b();
        bVar.write(read2);
        m23248a(inputStream, (OutputStream) bVar);
        byte[] bArr2 = new byte[(bArr.length + bVar.size())];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bVar.mo25659a(bArr2, bArr.length);
        return bArr2;
    }
}
