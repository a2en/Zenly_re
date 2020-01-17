package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBuffer.ClosedException;
import com.facebook.common.references.CloseableReference;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.u */
public class C9767u implements PooledByteBuffer {

    /* renamed from: e */
    private final int f25671e;

    /* renamed from: f */
    CloseableReference<MemoryChunk> f25672f;

    public C9767u(CloseableReference<MemoryChunk> closeableReference, int i) {
        C9536j.m23271a(closeableReference);
        C9536j.m23275a(i >= 0 && i <= ((MemoryChunk) closeableReference.mo25724b()).getSize());
        this.f25672f = closeableReference.clone();
        this.f25671e = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo26555a() {
        if (isClosed()) {
            throw new ClosedException();
        }
    }

    public synchronized void close() {
        CloseableReference.m23355b(this.f25672f);
        this.f25672f = null;
    }

    public synchronized ByteBuffer getByteBuffer() {
        return ((MemoryChunk) this.f25672f.mo25724b()).getByteBuffer();
    }

    public synchronized long getNativePtr() throws UnsupportedOperationException {
        mo26555a();
        return ((MemoryChunk) this.f25672f.mo25724b()).getNativePtr();
    }

    public synchronized boolean isClosed() {
        return !CloseableReference.m23356c(this.f25672f);
    }

    public synchronized byte read(int i) {
        mo26555a();
        boolean z = true;
        C9536j.m23275a(i >= 0);
        if (i >= this.f25671e) {
            z = false;
        }
        C9536j.m23275a(z);
        return ((MemoryChunk) this.f25672f.mo25724b()).read(i);
    }

    public synchronized int size() {
        mo26555a();
        return this.f25671e;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        mo26555a();
        C9536j.m23275a(i + i3 <= this.f25671e);
        return ((MemoryChunk) this.f25672f.mo25724b()).read(i, bArr, i2, i3);
    }
}
