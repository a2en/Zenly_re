package com.facebook.fresco.animation.bitmap.p307a;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache.FrameCacheListener;
import com.facebook.imagepipeline.animated.impl.C9665b;
import com.facebook.imagepipeline.image.C9729b;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;
import com.facebook.imagepipeline.image.C9733f;
import com.facebook.imageutils.C9896a;

/* renamed from: com.facebook.fresco.animation.bitmap.a.a */
public class C9629a implements BitmapFrameCache {

    /* renamed from: e */
    private static final Class<?> f25112e = C9629a.class;

    /* renamed from: a */
    private final C9665b f25113a;

    /* renamed from: b */
    private final boolean f25114b;

    /* renamed from: c */
    private final SparseArray<CloseableReference<C9730c>> f25115c = new SparseArray<>();

    /* renamed from: d */
    private CloseableReference<C9730c> f25116d;

    public C9629a(C9665b bVar, boolean z) {
        this.f25113a = bVar;
        this.f25114b = z;
    }

    /* renamed from: a */
    private synchronized int m23672a() {
        int i;
        i = 0;
        for (int i2 = 0; i2 < this.f25115c.size(); i2++) {
            i += m23677c((CloseableReference) this.f25115c.valueAt(i2));
        }
        return i;
    }

    /* renamed from: b */
    private static CloseableReference<C9730c> m23676b(CloseableReference<Bitmap> closeableReference) {
        return CloseableReference.m23349a(new C9731d(closeableReference, C9733f.f25573d, 0));
    }

    /* renamed from: c */
    private static int m23677c(CloseableReference<C9730c> closeableReference) {
        if (!CloseableReference.m23356c(closeableReference)) {
            return 0;
        }
        return m23673a((C9730c) closeableReference.mo25724b());
    }

    public synchronized void clear() {
        CloseableReference.m23355b(this.f25116d);
        this.f25116d = null;
        for (int i = 0; i < this.f25115c.size(); i++) {
            CloseableReference.m23355b((CloseableReference) this.f25115c.valueAt(i));
        }
        this.f25115c.clear();
    }

    public synchronized boolean contains(int i) {
        return this.f25113a.mo26193a(i);
    }

    public synchronized CloseableReference<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        if (!this.f25114b) {
            return null;
        }
        return m23674a(this.f25113a.mo26190a());
    }

    public synchronized CloseableReference<Bitmap> getCachedFrame(int i) {
        return m23674a(this.f25113a.mo26194b(i));
    }

    public synchronized CloseableReference<Bitmap> getFallbackFrame(int i) {
        return m23674a(CloseableReference.m23348a(this.f25116d));
    }

    public synchronized int getSizeInBytes() {
        return m23677c(this.f25116d) + m23672a();
    }

    public synchronized void onFramePrepared(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        C9536j.m23271a(closeableReference);
        CloseableReference closeableReference2 = null;
        try {
            closeableReference2 = m23676b(closeableReference);
            if (closeableReference2 != null) {
                CloseableReference a = this.f25113a.mo26191a(i, closeableReference2);
                if (CloseableReference.m23356c(a)) {
                    CloseableReference.m23355b((CloseableReference) this.f25115c.get(i));
                    this.f25115c.put(i, a);
                    C9543a.m23302a(f25112e, "cachePreparedFrame(%d) cached. Pending frames: %s", (Object) Integer.valueOf(i), (Object) this.f25115c);
                }
                CloseableReference.m23355b(closeableReference2);
            }
        } finally {
            CloseableReference.m23355b(closeableReference2);
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized void onFrameRendered(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        C9536j.m23271a(closeableReference);
        m23675a(i);
        try {
            CloseableReference b = m23676b(closeableReference);
            if (b != null) {
                CloseableReference.m23355b(this.f25116d);
                this.f25116d = this.f25113a.mo26191a(i, b);
            }
            CloseableReference.m23355b(b);
        } catch (Throwable th) {
            CloseableReference.m23355b(null);
            throw th;
        }
    }

    public void setFrameCacheListener(FrameCacheListener frameCacheListener) {
    }

    /* renamed from: a */
    private synchronized void m23675a(int i) {
        CloseableReference closeableReference = (CloseableReference) this.f25115c.get(i);
        if (closeableReference != null) {
            this.f25115c.delete(i);
            CloseableReference.m23355b(closeableReference);
            C9543a.m23302a(f25112e, "removePreparedReference(%d) removed. Pending frames: %s", (Object) Integer.valueOf(i), (Object) this.f25115c);
        }
    }

    /* renamed from: a */
    static CloseableReference<Bitmap> m23674a(CloseableReference<C9730c> closeableReference) {
        try {
            if (CloseableReference.m23356c(closeableReference) && (closeableReference.mo25724b() instanceof C9731d)) {
                C9731d dVar = (C9731d) closeableReference.mo25724b();
                if (dVar != null) {
                    return dVar.mo26413d();
                }
            }
            CloseableReference.m23355b(closeableReference);
            return null;
        } finally {
            CloseableReference.m23355b(closeableReference);
        }
    }

    /* renamed from: a */
    private static int m23673a(C9730c cVar) {
        if (!(cVar instanceof C9729b)) {
            return 0;
        }
        return C9896a.m24733a(((C9729b) cVar).mo26411c());
    }
}
