package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.C9549e;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import java.io.IOException;

public class MemoryPooledByteBufferOutputStream extends C9549e {

    /* renamed from: e */
    private final C9765s f25589e;

    /* renamed from: f */
    private CloseableReference<MemoryChunk> f25590f;

    /* renamed from: g */
    private int f25591g;

    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(C9765s sVar) {
        this(sVar, sVar.mo26554f());
    }

    /* renamed from: b */
    private void m24128b() {
        if (!CloseableReference.m23356c(this.f25590f)) {
            throw new InvalidStreamException();
        }
    }

    public void close() {
        CloseableReference.m23355b(this.f25590f);
        this.f25590f = null;
        this.f25591g = -1;
        super.close();
    }

    public int size() {
        return this.f25591g;
    }

    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public MemoryPooledByteBufferOutputStream(C9765s sVar, int i) {
        C9536j.m23275a(i > 0);
        C9536j.m23271a(sVar);
        this.f25589e = sVar;
        this.f25591g = 0;
        this.f25590f = CloseableReference.m23351a(this.f25589e.get(i), (ResourceReleaser<T>) this.f25589e);
    }

    /* renamed from: a */
    public C9767u m24130a() {
        m24128b();
        return new C9767u(this.f25590f, this.f25591g);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        m24128b();
        mo26479a(this.f25591g + i2);
        ((MemoryChunk) this.f25590f.mo25724b()).write(this.f25591g, bArr, i, i2);
        this.f25591g += i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26479a(int i) {
        m24128b();
        if (i > ((MemoryChunk) this.f25590f.mo25724b()).getSize()) {
            MemoryChunk memoryChunk = (MemoryChunk) this.f25589e.get(i);
            ((MemoryChunk) this.f25590f.mo25724b()).copy(0, memoryChunk, 0, this.f25591g);
            this.f25590f.close();
            this.f25590f = CloseableReference.m23351a(memoryChunk, (ResourceReleaser<T>) this.f25589e);
        }
    }
}
