package com.facebook.fresco.animation.bitmap.p307a;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache.FrameCacheListener;
import com.facebook.imageutils.C9896a;

/* renamed from: com.facebook.fresco.animation.bitmap.a.b */
public class C9630b implements BitmapFrameCache {

    /* renamed from: a */
    private int f25117a = -1;

    /* renamed from: b */
    private FrameCacheListener f25118b;

    /* renamed from: c */
    private CloseableReference<Bitmap> f25119c;

    /* renamed from: a */
    private synchronized void m23678a() {
        if (!(this.f25118b == null || this.f25117a == -1)) {
            this.f25118b.onFrameEvicted(this, this.f25117a);
        }
        CloseableReference.m23355b(this.f25119c);
        this.f25119c = null;
        this.f25117a = -1;
    }

    public synchronized void clear() {
        m23678a();
    }

    public synchronized boolean contains(int i) {
        return i == this.f25117a && CloseableReference.m23356c(this.f25119c);
    }

    public synchronized CloseableReference<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        CloseableReference<Bitmap> a;
        try {
            a = CloseableReference.m23348a(this.f25119c);
            m23678a();
        } catch (Throwable th) {
            m23678a();
            throw th;
        }
        return a;
    }

    public synchronized CloseableReference<Bitmap> getCachedFrame(int i) {
        if (this.f25117a != i) {
            return null;
        }
        return CloseableReference.m23348a(this.f25119c);
    }

    public synchronized CloseableReference<Bitmap> getFallbackFrame(int i) {
        return CloseableReference.m23348a(this.f25119c);
    }

    public synchronized int getSizeInBytes() {
        int i;
        if (this.f25119c == null) {
            i = 0;
        } else {
            i = C9896a.m24733a((Bitmap) this.f25119c.mo25724b());
        }
        return i;
    }

    public void onFramePrepared(int i, CloseableReference<Bitmap> closeableReference, int i2) {
    }

    public synchronized void onFrameRendered(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        if (closeableReference != null) {
            if (this.f25119c != null && ((Bitmap) closeableReference.mo25724b()).equals(this.f25119c.mo25724b())) {
                return;
            }
        }
        CloseableReference.m23355b(this.f25119c);
        if (!(this.f25118b == null || this.f25117a == -1)) {
            this.f25118b.onFrameEvicted(this, this.f25117a);
        }
        this.f25119c = CloseableReference.m23348a(closeableReference);
        if (this.f25118b != null) {
            this.f25118b.onFrameCached(this, i);
        }
        this.f25117a = i;
    }

    public void setFrameCacheListener(FrameCacheListener frameCacheListener) {
        this.f25118b = frameCacheListener;
    }
}
