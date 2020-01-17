package com.facebook.common.memory;

import com.facebook.common.internal.C9536j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.memory.f */
public class C9550f {

    /* renamed from: a */
    private final int f24737a;

    /* renamed from: b */
    private final ByteArrayPool f24738b;

    public C9550f(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 16384);
    }

    /* renamed from: a */
    public long mo25722a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = (byte[]) this.f24738b.get(this.f24737a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f24737a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f24738b.release(bArr);
            }
        }
    }

    public C9550f(ByteArrayPool byteArrayPool, int i) {
        C9536j.m23275a(i > 0);
        this.f24737a = i;
        this.f24738b = byteArrayPool;
    }
}
