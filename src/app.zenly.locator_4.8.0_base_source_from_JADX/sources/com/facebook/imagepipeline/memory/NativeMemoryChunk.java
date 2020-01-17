package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.common.internal.C9527d;
import com.facebook.common.internal.C9536j;
import com.facebook.imagepipeline.nativecode.C9773a;
import java.io.Closeable;
import java.nio.ByteBuffer;

@C9527d
public class NativeMemoryChunk implements MemoryChunk, Closeable {

    /* renamed from: e */
    private final long f25592e;

    /* renamed from: f */
    private final int f25593f;

    /* renamed from: g */
    private boolean f25594g;

    static {
        C9773a.m24270a();
    }

    public NativeMemoryChunk(int i) {
        C9536j.m23275a(i > 0);
        this.f25593f = i;
        this.f25592e = nativeAllocate(this.f25593f);
        this.f25594g = false;
    }

    /* renamed from: a */
    private void m24132a(int i, MemoryChunk memoryChunk, int i2, int i3) {
        if (memoryChunk instanceof NativeMemoryChunk) {
            C9536j.m23279b(!isClosed());
            C9536j.m23279b(!memoryChunk.isClosed());
            C9766t.m24252a(i, memoryChunk.getSize(), i2, i3, this.f25593f);
            nativeMemcpy(memoryChunk.getNativePtr() + ((long) i2), this.f25592e + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @C9527d
    private static native long nativeAllocate(int i);

    @C9527d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @C9527d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @C9527d
    private static native void nativeFree(long j);

    @C9527d
    private static native void nativeMemcpy(long j, long j2, int i);

    @C9527d
    private static native byte nativeReadByte(long j);

    public synchronized void close() {
        if (!this.f25594g) {
            this.f25594g = true;
            nativeFree(this.f25592e);
        }
    }

    public void copy(int i, MemoryChunk memoryChunk, int i2, int i3) {
        C9536j.m23271a(memoryChunk);
        if (memoryChunk.getUniqueId() == getUniqueId()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" to NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(memoryChunk)));
            sb.append(" which share the same address ");
            sb.append(Long.toHexString(this.f25592e));
            Log.w("NativeMemoryChunk", sb.toString());
            C9536j.m23275a(false);
        }
        if (memoryChunk.getUniqueId() < getUniqueId()) {
            synchronized (memoryChunk) {
                synchronized (this) {
                    m24132a(i, memoryChunk, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (memoryChunk) {
                m24132a(i, memoryChunk, i2, i3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!isClosed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("finalize: Chunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" still active. ");
            Log.w("NativeMemoryChunk", sb.toString());
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public ByteBuffer getByteBuffer() {
        return null;
    }

    public long getNativePtr() {
        return this.f25592e;
    }

    public int getSize() {
        return this.f25593f;
    }

    public long getUniqueId() {
        return this.f25592e;
    }

    public synchronized boolean isClosed() {
        return this.f25594g;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a;
        C9536j.m23271a(bArr);
        C9536j.m23279b(!isClosed());
        a = C9766t.m24251a(i, i3, this.f25593f);
        C9766t.m24252a(i, bArr.length, i2, a, this.f25593f);
        nativeCopyToByteArray(this.f25592e + ((long) i), bArr, i2, a);
        return a;
    }

    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a;
        C9536j.m23271a(bArr);
        C9536j.m23279b(!isClosed());
        a = C9766t.m24251a(i, i3, this.f25593f);
        C9766t.m24252a(i, bArr.length, i2, a, this.f25593f);
        nativeCopyFromByteArray(this.f25592e + ((long) i), bArr, i2, a);
        return a;
    }

    public NativeMemoryChunk() {
        this.f25593f = 0;
        this.f25592e = 0;
        this.f25594g = true;
    }

    public synchronized byte read(int i) {
        boolean z = true;
        C9536j.m23279b(!isClosed());
        C9536j.m23275a(i >= 0);
        if (i >= this.f25593f) {
            z = false;
        }
        C9536j.m23275a(z);
        return nativeReadByte(this.f25592e + ((long) i));
    }
}
