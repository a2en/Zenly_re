package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9542m;
import com.facebook.common.memory.C9550f;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.memory.v */
public class C9768v implements PooledByteBufferFactory {

    /* renamed from: a */
    private final C9550f f25673a;

    /* renamed from: b */
    private final C9765s f25674b;

    public C9768v(C9765s sVar, C9550f fVar) {
        this.f25674b = sVar;
        this.f25673a = fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9767u mo26556a(InputStream inputStream, MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream) throws IOException {
        this.f25673a.mo25722a(inputStream, memoryPooledByteBufferOutputStream);
        return memoryPooledByteBufferOutputStream.mo25719a();
    }

    public MemoryPooledByteBufferOutputStream newOutputStream() {
        return new MemoryPooledByteBufferOutputStream(this.f25674b);
    }

    public MemoryPooledByteBufferOutputStream newOutputStream(int i) {
        return new MemoryPooledByteBufferOutputStream(this.f25674b, i);
    }

    public C9767u newByteBuffer(int i) {
        C9536j.m23275a(i > 0);
        CloseableReference a = CloseableReference.m23351a(this.f25674b.get(i), (ResourceReleaser<T>) this.f25674b);
        try {
            return new C9767u(a, i);
        } finally {
            a.close();
        }
    }

    public C9767u newByteBuffer(InputStream inputStream) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f25674b);
        try {
            return mo26556a(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    public C9767u newByteBuffer(byte[] bArr) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f25674b, bArr.length);
        try {
            memoryPooledByteBufferOutputStream.write(bArr, 0, bArr.length);
            C9767u a = memoryPooledByteBufferOutputStream.mo25719a();
            memoryPooledByteBufferOutputStream.close();
            return a;
        } catch (IOException e) {
            C9542m.m23285a(e);
            throw null;
        } catch (Throwable th) {
            memoryPooledByteBufferOutputStream.close();
            throw th;
        }
    }

    public C9767u newByteBuffer(InputStream inputStream, int i) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f25674b, i);
        try {
            return mo26556a(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }
}
