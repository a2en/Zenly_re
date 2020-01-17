package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck.InactivityListener;
import com.facebook.fresco.animation.backend.AnimationInformation;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparationStrategy;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer;
import p333g.p339c.p352d.p355b.C12058f;

public class BitmapAnimationBackend implements AnimationBackend, InactivityListener {

    /* renamed from: m */
    private static final Class<?> f25099m = BitmapAnimationBackend.class;

    /* renamed from: a */
    private final C12058f f25100a;

    /* renamed from: b */
    private final BitmapFrameCache f25101b;

    /* renamed from: c */
    private final AnimationInformation f25102c;

    /* renamed from: d */
    private final BitmapFrameRenderer f25103d;

    /* renamed from: e */
    private final BitmapFramePreparationStrategy f25104e;

    /* renamed from: f */
    private final BitmapFramePreparer f25105f;

    /* renamed from: g */
    private final Paint f25106g;

    /* renamed from: h */
    private Rect f25107h;

    /* renamed from: i */
    private int f25108i;

    /* renamed from: j */
    private int f25109j;

    /* renamed from: k */
    private Config f25110k = Config.ARGB_8888;

    /* renamed from: l */
    private FrameListener f25111l;

    public interface FrameListener {
        void onDrawFrameStart(BitmapAnimationBackend bitmapAnimationBackend, int i);

        void onFrameDrawn(BitmapAnimationBackend bitmapAnimationBackend, int i, int i2);

        void onFrameDropped(BitmapAnimationBackend bitmapAnimationBackend, int i);
    }

    public BitmapAnimationBackend(C12058f fVar, BitmapFrameCache bitmapFrameCache, AnimationInformation animationInformation, BitmapFrameRenderer bitmapFrameRenderer, BitmapFramePreparationStrategy bitmapFramePreparationStrategy, BitmapFramePreparer bitmapFramePreparer) {
        this.f25100a = fVar;
        this.f25101b = bitmapFrameCache;
        this.f25102c = animationInformation;
        this.f25103d = bitmapFrameRenderer;
        this.f25104e = bitmapFramePreparationStrategy;
        this.f25105f = bitmapFramePreparer;
        this.f25106g = new Paint(6);
        m23668a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        com.facebook.common.logging.C9543a.m23314b(f25099m, "Failed to create frame bitmap", (java.lang.Throwable) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        com.facebook.common.references.CloseableReference.m23355b(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        com.facebook.common.references.CloseableReference.m23355b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007e, code lost:
        throw r10;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x0012, B:10:0x001e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m23671a(android.graphics.Canvas r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = -1
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            if (r12 == 0) goto L_0x0061
            if (r12 == r4) goto L_0x0046
            if (r12 == r2) goto L_0x001e
            if (r12 == r1) goto L_0x0012
            com.facebook.common.references.CloseableReference.m23355b(r5)
            return r3
        L_0x0012:
            com.facebook.fresco.animation.bitmap.BitmapFrameCache r12 = r9.f25101b     // Catch:{ all -> 0x007a }
            com.facebook.common.references.CloseableReference r5 = r12.getFallbackFrame(r11)     // Catch:{ all -> 0x007a }
            boolean r12 = r9.m23670a(r11, r5, r10, r1)     // Catch:{ all -> 0x007a }
            r1 = -1
            goto L_0x006c
        L_0x001e:
            g.c.d.b.f r12 = r9.f25100a     // Catch:{ RuntimeException -> 0x003a }
            int r6 = r9.f25108i     // Catch:{ RuntimeException -> 0x003a }
            int r7 = r9.f25109j     // Catch:{ RuntimeException -> 0x003a }
            android.graphics.Bitmap$Config r8 = r9.f25110k     // Catch:{ RuntimeException -> 0x003a }
            com.facebook.common.references.CloseableReference r5 = r12.mo35772a(r6, r7, r8)     // Catch:{ RuntimeException -> 0x003a }
            boolean r12 = r9.m23669a(r11, r5)     // Catch:{ all -> 0x007a }
            if (r12 == 0) goto L_0x0038
            boolean r12 = r9.m23670a(r11, r5, r10, r2)     // Catch:{ all -> 0x007a }
            if (r12 == 0) goto L_0x0038
            r12 = 1
            goto L_0x006c
        L_0x0038:
            r12 = 0
            goto L_0x006c
        L_0x003a:
            r10 = move-exception
            java.lang.Class<?> r11 = f25099m     // Catch:{ all -> 0x007a }
            java.lang.String r12 = "Failed to create frame bitmap"
            com.facebook.common.logging.C9543a.m23314b(r11, r12, r10)     // Catch:{ all -> 0x007a }
            com.facebook.common.references.CloseableReference.m23355b(r5)
            return r3
        L_0x0046:
            com.facebook.fresco.animation.bitmap.BitmapFrameCache r12 = r9.f25101b     // Catch:{ all -> 0x007a }
            int r1 = r9.f25108i     // Catch:{ all -> 0x007a }
            int r6 = r9.f25109j     // Catch:{ all -> 0x007a }
            com.facebook.common.references.CloseableReference r5 = r12.getBitmapToReuseForFrame(r11, r1, r6)     // Catch:{ all -> 0x007a }
            boolean r12 = r9.m23669a(r11, r5)     // Catch:{ all -> 0x007a }
            if (r12 == 0) goto L_0x005e
            boolean r12 = r9.m23670a(r11, r5, r10, r4)     // Catch:{ all -> 0x007a }
            if (r12 == 0) goto L_0x005e
            r12 = 1
            goto L_0x005f
        L_0x005e:
            r12 = 0
        L_0x005f:
            r1 = 2
            goto L_0x006c
        L_0x0061:
            com.facebook.fresco.animation.bitmap.BitmapFrameCache r12 = r9.f25101b     // Catch:{ all -> 0x007a }
            com.facebook.common.references.CloseableReference r5 = r12.getCachedFrame(r11)     // Catch:{ all -> 0x007a }
            boolean r12 = r9.m23670a(r11, r5, r10, r3)     // Catch:{ all -> 0x007a }
            r1 = 1
        L_0x006c:
            com.facebook.common.references.CloseableReference.m23355b(r5)
            if (r12 != 0) goto L_0x0079
            if (r1 != r0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            boolean r10 = r9.m23671a(r10, r11, r1)
            return r10
        L_0x0079:
            return r12
        L_0x007a:
            r10 = move-exception
            com.facebook.common.references.CloseableReference.m23355b(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.bitmap.BitmapAnimationBackend.m23671a(android.graphics.Canvas, int, int):boolean");
    }

    public void clear() {
        this.f25101b.clear();
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        FrameListener frameListener = this.f25111l;
        if (frameListener != null) {
            frameListener.onDrawFrameStart(this, i);
        }
        boolean a = m23671a(canvas, i, 0);
        if (!a) {
            FrameListener frameListener2 = this.f25111l;
            if (frameListener2 != null) {
                frameListener2.onFrameDropped(this, i);
            }
        }
        BitmapFramePreparationStrategy bitmapFramePreparationStrategy = this.f25104e;
        if (bitmapFramePreparationStrategy != null) {
            BitmapFramePreparer bitmapFramePreparer = this.f25105f;
            if (bitmapFramePreparer != null) {
                bitmapFramePreparationStrategy.prepareFrames(bitmapFramePreparer, this.f25101b, this, i);
            }
        }
        return a;
    }

    public int getFrameCount() {
        return this.f25102c.getFrameCount();
    }

    public int getFrameDurationMs(int i) {
        return this.f25102c.getFrameDurationMs(i);
    }

    public int getIntrinsicHeight() {
        return this.f25109j;
    }

    public int getIntrinsicWidth() {
        return this.f25108i;
    }

    public int getLoopCount() {
        return this.f25102c.getLoopCount();
    }

    public int getSizeInBytes() {
        return this.f25101b.getSizeInBytes();
    }

    public void onInactive() {
        clear();
    }

    public void setAlpha(int i) {
        this.f25106g.setAlpha(i);
    }

    public void setBounds(Rect rect) {
        this.f25107h = rect;
        this.f25103d.setBounds(rect);
        m23668a();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f25106g.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private void m23668a() {
        this.f25108i = this.f25103d.getIntrinsicWidth();
        int i = -1;
        if (this.f25108i == -1) {
            Rect rect = this.f25107h;
            this.f25108i = rect == null ? -1 : rect.width();
        }
        this.f25109j = this.f25103d.getIntrinsicHeight();
        if (this.f25109j == -1) {
            Rect rect2 = this.f25107h;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.f25109j = i;
        }
    }

    /* renamed from: a */
    private boolean m23669a(int i, CloseableReference<Bitmap> closeableReference) {
        if (!CloseableReference.m23356c(closeableReference)) {
            return false;
        }
        boolean renderFrame = this.f25103d.renderFrame(i, (Bitmap) closeableReference.mo25724b());
        if (!renderFrame) {
            CloseableReference.m23355b(closeableReference);
        }
        return renderFrame;
    }

    /* renamed from: a */
    private boolean m23670a(int i, CloseableReference<Bitmap> closeableReference, Canvas canvas, int i2) {
        if (!CloseableReference.m23356c(closeableReference)) {
            return false;
        }
        if (this.f25107h == null) {
            canvas.drawBitmap((Bitmap) closeableReference.mo25724b(), 0.0f, 0.0f, this.f25106g);
        } else {
            canvas.drawBitmap((Bitmap) closeableReference.mo25724b(), null, this.f25107h, this.f25106g);
        }
        if (i2 != 3) {
            this.f25101b.onFrameRendered(i, closeableReference, i2);
        }
        FrameListener frameListener = this.f25111l;
        if (frameListener != null) {
            frameListener.onFrameDrawn(this, i, i2);
        }
        return true;
    }
}
