package com.bumptech.glide.p301o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.o.d */
public class C9208d extends InputStream {

    /* renamed from: g */
    private static final Queue<C9208d> f23872g = C9217k.m22099a(0);

    /* renamed from: e */
    private InputStream f23873e;

    /* renamed from: f */
    private IOException f23874f;

    C9208d() {
    }

    /* renamed from: b */
    public static C9208d m22066b(InputStream inputStream) {
        C9208d dVar;
        synchronized (f23872g) {
            dVar = (C9208d) f23872g.poll();
        }
        if (dVar == null) {
            dVar = new C9208d();
        }
        dVar.mo24809a(inputStream);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24809a(InputStream inputStream) {
        this.f23873e = inputStream;
    }

    public int available() throws IOException {
        return this.f23873e.available();
    }

    public void close() throws IOException {
        this.f23873e.close();
    }

    public void mark(int i) {
        this.f23873e.mark(i);
    }

    public boolean markSupported() {
        return this.f23873e.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f23873e.read(bArr);
        } catch (IOException e) {
            this.f23874f = e;
            return -1;
        }
    }

    public void release() {
        this.f23874f = null;
        this.f23873e = null;
        synchronized (f23872g) {
            f23872g.offer(this);
        }
    }

    public synchronized void reset() throws IOException {
        this.f23873e.reset();
    }

    public long skip(long j) {
        try {
            return this.f23873e.skip(j);
        } catch (IOException e) {
            this.f23874f = e;
            return 0;
        }
    }

    /* renamed from: a */
    public IOException mo24808a() {
        return this.f23874f;
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f23873e.read(bArr, i, i2);
        } catch (IOException e) {
            this.f23874f = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f23873e.read();
        } catch (IOException e) {
            this.f23874f = e;
            return -1;
        }
    }
}
