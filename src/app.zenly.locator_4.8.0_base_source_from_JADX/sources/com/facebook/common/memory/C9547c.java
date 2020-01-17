package com.facebook.common.memory;

import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import com.facebook.common.references.ResourceReleaser;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.memory.c */
public class C9547c extends InputStream {

    /* renamed from: e */
    private final InputStream f24728e;

    /* renamed from: f */
    private final byte[] f24729f;

    /* renamed from: g */
    private final ResourceReleaser<byte[]> f24730g;

    /* renamed from: h */
    private int f24731h = 0;

    /* renamed from: i */
    private int f24732i = 0;

    /* renamed from: j */
    private boolean f24733j = false;

    public C9547c(InputStream inputStream, byte[] bArr, ResourceReleaser<byte[]> resourceReleaser) {
        C9536j.m23271a(inputStream);
        this.f24728e = inputStream;
        C9536j.m23271a(bArr);
        this.f24729f = bArr;
        C9536j.m23271a(resourceReleaser);
        this.f24730g = resourceReleaser;
    }

    /* renamed from: a */
    private boolean m23344a() throws IOException {
        if (this.f24732i < this.f24731h) {
            return true;
        }
        int read = this.f24728e.read(this.f24729f);
        if (read <= 0) {
            return false;
        }
        this.f24731h = read;
        this.f24732i = 0;
        return true;
    }

    /* renamed from: b */
    private void m23345b() throws IOException {
        if (this.f24733j) {
            throw new IOException("stream already closed");
        }
    }

    public int available() throws IOException {
        C9536j.m23279b(this.f24732i <= this.f24731h);
        m23345b();
        return (this.f24731h - this.f24732i) + this.f24728e.available();
    }

    public void close() throws IOException {
        if (!this.f24733j) {
            this.f24733j = true;
            this.f24730g.release(this.f24729f);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!this.f24733j) {
            C9543a.m23317b("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public int read() throws IOException {
        C9536j.m23279b(this.f24732i <= this.f24731h);
        m23345b();
        if (!m23344a()) {
            return -1;
        }
        byte[] bArr = this.f24729f;
        int i = this.f24732i;
        this.f24732i = i + 1;
        return bArr[i] & 255;
    }

    public long skip(long j) throws IOException {
        C9536j.m23279b(this.f24732i <= this.f24731h);
        m23345b();
        int i = this.f24731h;
        int i2 = this.f24732i;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.f24732i = (int) (((long) i2) + j);
            return j;
        }
        this.f24732i = i;
        return j2 + this.f24728e.skip(j - j2);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C9536j.m23279b(this.f24732i <= this.f24731h);
        m23345b();
        if (!m23344a()) {
            return -1;
        }
        int min = Math.min(this.f24731h - this.f24732i, i2);
        System.arraycopy(this.f24729f, this.f24732i, bArr, i, min);
        this.f24732i += min;
        return min;
    }
}
