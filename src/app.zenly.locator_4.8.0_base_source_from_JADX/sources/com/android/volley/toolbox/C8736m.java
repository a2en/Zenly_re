package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.android.volley.toolbox.m */
public class C8736m extends ByteArrayOutputStream {

    /* renamed from: e */
    private final C8723d f22500e;

    public C8736m(C8723d dVar, int i) {
        this.f22500e = dVar;
        this.buf = this.f22500e.mo23593a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m20572a(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            byte[] a = this.f22500e.mo23593a((i2 + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f22500e.mo23592a(this.buf);
            this.buf = a;
        }
    }

    public void close() throws IOException {
        this.f22500e.mo23592a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f22500e.mo23592a(this.buf);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m20572a(i2);
        super.write(bArr, i, i2);
    }

    public synchronized void write(int i) {
        m20572a(1);
        super.write(i);
    }
}
