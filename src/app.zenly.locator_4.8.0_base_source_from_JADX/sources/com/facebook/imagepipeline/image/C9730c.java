package com.facebook.imagepipeline.image;

import com.facebook.common.logging.C9543a;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.image.c */
public abstract class C9730c implements Closeable, ImageInfo {
    /* renamed from: a */
    public abstract int mo26406a();

    /* renamed from: b */
    public boolean mo26407b() {
        return false;
    }

    public abstract void close();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!isClosed()) {
            C9543a.m23324c("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public QualityInfo getQualityInfo() {
        return C9733f.f25573d;
    }

    public abstract boolean isClosed();
}
