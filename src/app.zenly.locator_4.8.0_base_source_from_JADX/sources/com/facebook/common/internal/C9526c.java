package com.facebook.common.internal;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.common.internal.c */
public class C9526c extends FilterOutputStream {

    /* renamed from: e */
    private long f24707e = 0;

    public C9526c(OutputStream outputStream) {
        super(outputStream);
    }

    public void close() throws IOException {
        this.out.close();
    }

    public long getCount() {
        return this.f24707e;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f24707e += (long) i2;
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        this.f24707e++;
    }
}
