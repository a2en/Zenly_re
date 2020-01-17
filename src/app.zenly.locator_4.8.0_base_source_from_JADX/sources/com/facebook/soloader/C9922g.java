package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.g */
public final class C9922g implements Closeable {

    /* renamed from: e */
    private final FileOutputStream f26052e;

    /* renamed from: f */
    private final FileLock f26053f;

    private C9922g(File file) throws IOException {
        this.f26052e = new FileOutputStream(file);
        try {
            FileLock lock = this.f26052e.getChannel().lock();
            if (lock == null) {
            }
            this.f26053f = lock;
        } finally {
            this.f26052e.close();
        }
    }

    /* renamed from: a */
    public static C9922g m24811a(File file) throws IOException {
        return new C9922g(file);
    }

    public void close() throws IOException {
        try {
            if (this.f26053f != null) {
                this.f26053f.release();
            }
        } finally {
            this.f26052e.close();
        }
    }
}
