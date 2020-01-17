package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.common.internal.C9536j;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.g */
public class C9751g implements MemoryChunk, Closeable {

    /* renamed from: e */
    private ByteBuffer f25653e;

    /* renamed from: f */
    private final int f25654f;

    /* renamed from: g */
    private final long f25655g = ((long) System.identityHashCode(this));

    public C9751g(int i) {
        this.f25653e = ByteBuffer.allocateDirect(i);
        this.f25654f = i;
    }

    /* renamed from: a */
    private void m24210a(int i, MemoryChunk memoryChunk, int i2, int i3) {
        if (memoryChunk instanceof C9751g) {
            C9536j.m23279b(!isClosed());
            C9536j.m23279b(!memoryChunk.isClosed());
            C9766t.m24252a(i, memoryChunk.getSize(), i2, i3, this.f25654f);
            this.f25653e.position(i);
            memoryChunk.getByteBuffer().position(i2);
            byte[] bArr = new byte[i3];
            this.f25653e.get(bArr, 0, i3);
            memoryChunk.getByteBuffer().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public synchronized void close() {
        this.f25653e = null;
    }

    public void copy(int i, MemoryChunk memoryChunk, int i2, int i3) {
        C9536j.m23271a(memoryChunk);
        if (memoryChunk.getUniqueId() == getUniqueId()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from BufferMemoryChunk ");
            sb.append(Long.toHexString(getUniqueId()));
            sb.append(" to BufferMemoryChunk ");
            sb.append(Long.toHexString(memoryChunk.getUniqueId()));
            sb.append(" which are the same ");
            Log.w("BufferMemoryChunk", sb.toString());
            C9536j.m23275a(false);
        }
        if (memoryChunk.getUniqueId() < getUniqueId()) {
            synchronized (memoryChunk) {
                synchronized (this) {
                    m24210a(i, memoryChunk, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (memoryChunk) {
                m24210a(i, memoryChunk, i2, i3);
            }
        }
    }

    public synchronized ByteBuffer getByteBuffer() {
        return this.f25653e;
    }

    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public int getSize() {
        return this.f25654f;
    }

    public long getUniqueId() {
        return this.f25655g;
    }

    public synchronized boolean isClosed() {
        return this.f25653e == null;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a;
        C9536j.m23271a(bArr);
        C9536j.m23279b(!isClosed());
        a = C9766t.m24251a(i, i3, this.f25654f);
        C9766t.m24252a(i, bArr.length, i2, a, this.f25654f);
        this.f25653e.position(i);
        this.f25653e.get(bArr, i2, a);
        return a;
    }

    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a;
        C9536j.m23271a(bArr);
        C9536j.m23279b(!isClosed());
        a = C9766t.m24251a(i, i3, this.f25654f);
        C9766t.m24252a(i, bArr.length, i2, a, this.f25654f);
        this.f25653e.position(i);
        this.f25653e.put(bArr, i2, a);
        return a;
    }

    public synchronized byte read(int i) {
        boolean z = true;
        C9536j.m23279b(!isClosed());
        C9536j.m23275a(i >= 0);
        if (i >= this.f25654f) {
            z = false;
        }
        C9536j.m23275a(z);
        return this.f25653e.get(i);
    }
}
