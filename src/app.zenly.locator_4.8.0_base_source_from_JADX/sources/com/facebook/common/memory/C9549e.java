package com.facebook.common.memory;

import com.facebook.common.internal.C9542m;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.common.memory.e */
public abstract class C9549e extends OutputStream {
    /* renamed from: a */
    public abstract PooledByteBuffer mo25719a();

    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C9542m.m23285a(e);
            throw null;
        }
    }

    public abstract int size();
}
