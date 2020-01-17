package com.facebook.fresco.animation.bitmap.preparation;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.SparseArray;
import com.facebook.common.logging.C9543a;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import java.util.concurrent.ExecutorService;
import p333g.p339c.p352d.p355b.C12058f;

/* renamed from: com.facebook.fresco.animation.bitmap.preparation.a */
public class C9635a implements BitmapFramePreparer {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Class<?> f25127f = C9635a.class;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12058f f25128a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BitmapFrameRenderer f25129b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Config f25130c;

    /* renamed from: d */
    private final ExecutorService f25131d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SparseArray<Runnable> f25132e = new SparseArray<>();

    /* renamed from: com.facebook.fresco.animation.bitmap.preparation.a$a */
    private class C9636a implements Runnable {

        /* renamed from: e */
        private final BitmapFrameCache f25133e;

        /* renamed from: f */
        private final AnimationBackend f25134f;

        /* renamed from: g */
        private final int f25135g;

        /* renamed from: h */
        private final int f25136h;

        public C9636a(AnimationBackend animationBackend, BitmapFrameCache bitmapFrameCache, int i, int i2) {
            this.f25134f = animationBackend;
            this.f25133e = bitmapFrameCache;
            this.f25135g = i;
            this.f25136h = i2;
        }

        /* renamed from: a */
        private boolean m23686a(int i, int i2) {
            CloseableReference closeableReference;
            int i3 = 2;
            if (i2 == 1) {
                closeableReference = this.f25133e.getBitmapToReuseForFrame(i, this.f25134f.getIntrinsicWidth(), this.f25134f.getIntrinsicHeight());
            } else if (i2 != 2) {
                CloseableReference.m23355b(null);
                return false;
            } else {
                try {
                    closeableReference = C9635a.this.f25128a.mo35772a(this.f25134f.getIntrinsicWidth(), this.f25134f.getIntrinsicHeight(), C9635a.this.f25130c);
                    i3 = -1;
                } catch (RuntimeException e) {
                    C9543a.m23314b(C9635a.f25127f, "Failed to create frame bitmap", (Throwable) e);
                    CloseableReference.m23355b(null);
                    return false;
                } catch (Throwable th) {
                    CloseableReference.m23355b(null);
                    throw th;
                }
            }
            boolean a = m23687a(i, closeableReference, i2);
            CloseableReference.m23355b(closeableReference);
            return (a || i3 == -1) ? a : m23686a(i, i3);
        }

        public void run() {
            try {
                if (this.f25133e.contains(this.f25135g)) {
                    C9543a.m23313b(C9635a.f25127f, "Frame %d is cached already.", (Object) Integer.valueOf(this.f25135g));
                    synchronized (C9635a.this.f25132e) {
                        C9635a.this.f25132e.remove(this.f25136h);
                    }
                    return;
                }
                if (m23686a(this.f25135g, 1)) {
                    C9543a.m23313b(C9635a.f25127f, "Prepared frame frame %d.", (Object) Integer.valueOf(this.f25135g));
                } else {
                    C9543a.m23306a(C9635a.f25127f, "Could not prepare frame %d.", Integer.valueOf(this.f25135g));
                }
                synchronized (C9635a.this.f25132e) {
                    C9635a.this.f25132e.remove(this.f25136h);
                }
            } catch (Throwable th) {
                synchronized (C9635a.this.f25132e) {
                    C9635a.this.f25132e.remove(this.f25136h);
                    throw th;
                }
            }
        }

        /* renamed from: a */
        private boolean m23687a(int i, CloseableReference<Bitmap> closeableReference, int i2) {
            if (!CloseableReference.m23356c(closeableReference) || !C9635a.this.f25129b.renderFrame(i, (Bitmap) closeableReference.mo25724b())) {
                return false;
            }
            C9543a.m23313b(C9635a.f25127f, "Frame %d ready.", (Object) Integer.valueOf(this.f25135g));
            synchronized (C9635a.this.f25132e) {
                this.f25133e.onFramePrepared(this.f25135g, closeableReference, i2);
            }
            return true;
        }
    }

    public C9635a(C12058f fVar, BitmapFrameRenderer bitmapFrameRenderer, Config config, ExecutorService executorService) {
        this.f25128a = fVar;
        this.f25129b = bitmapFrameRenderer;
        this.f25130c = config;
        this.f25131d = executorService;
    }

    public boolean prepareFrame(BitmapFrameCache bitmapFrameCache, AnimationBackend animationBackend, int i) {
        int a = m23680a(animationBackend, i);
        synchronized (this.f25132e) {
            if (this.f25132e.get(a) != null) {
                C9543a.m23313b(f25127f, "Already scheduled decode job for frame %d", (Object) Integer.valueOf(i));
                return true;
            } else if (bitmapFrameCache.contains(i)) {
                C9543a.m23313b(f25127f, "Frame %d is cached already.", (Object) Integer.valueOf(i));
                return true;
            } else {
                C9636a aVar = new C9636a(animationBackend, bitmapFrameCache, i, a);
                this.f25132e.put(a, aVar);
                this.f25131d.execute(aVar);
                return true;
            }
        }
    }

    /* renamed from: a */
    private static int m23680a(AnimationBackend animationBackend, int i) {
        return (animationBackend.hashCode() * 31) + i;
    }
}
