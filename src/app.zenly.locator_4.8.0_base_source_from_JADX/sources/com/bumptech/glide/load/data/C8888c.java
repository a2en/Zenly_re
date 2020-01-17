package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.data.c */
public final class C8888c extends OutputStream {

    /* renamed from: e */
    private final OutputStream f23186e;

    /* renamed from: f */
    private byte[] f23187f;

    /* renamed from: g */
    private ArrayPool f23188g;

    /* renamed from: h */
    private int f23189h;

    public C8888c(OutputStream outputStream, ArrayPool arrayPool) {
        this(outputStream, arrayPool, 65536);
    }

    /* renamed from: a */
    private void m21336a() throws IOException {
        int i = this.f23189h;
        if (i > 0) {
            this.f23186e.write(this.f23187f, 0, i);
            this.f23189h = 0;
        }
    }

    /* renamed from: b */
    private void m21337b() throws IOException {
        if (this.f23189h == this.f23187f.length) {
            m21336a();
        }
    }

    private void release() {
        byte[] bArr = this.f23187f;
        if (bArr != null) {
            this.f23188g.put(bArr);
            this.f23187f = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f23186e.close();
            release();
        } catch (Throwable th) {
            this.f23186e.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m21336a();
        this.f23186e.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f23187f;
        int i2 = this.f23189h;
        this.f23189h = i2 + 1;
        bArr[i2] = (byte) i;
        m21337b();
    }

    C8888c(OutputStream outputStream, ArrayPool arrayPool, int i) {
        this.f23186e = outputStream;
        this.f23188g = arrayPool;
        this.f23187f = (byte[]) arrayPool.get(i, byte[].class);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f23189h != 0 || i4 < this.f23187f.length) {
                int min = Math.min(i4, this.f23187f.length - this.f23189h);
                System.arraycopy(bArr, i5, this.f23187f, this.f23189h, min);
                this.f23189h += min;
                i3 += min;
                m21337b();
            } else {
                this.f23186e.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
