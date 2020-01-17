package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.AnimatedImageFrame;
import com.facebook.imagepipeline.animated.base.C9653a;
import com.facebook.imagepipeline.animated.base.C9656b;
import p333g.p339c.p352d.p353a.p354a.C12052a;

/* renamed from: com.facebook.imagepipeline.animated.impl.a */
public class C9664a implements AnimatedDrawableBackend {

    /* renamed from: a */
    private final C12052a f25249a;

    /* renamed from: b */
    private final C9656b f25250b;

    /* renamed from: c */
    private final AnimatedImage f25251c;

    /* renamed from: d */
    private final Rect f25252d;

    /* renamed from: e */
    private final int[] f25253e;

    /* renamed from: f */
    private final int[] f25254f;

    /* renamed from: g */
    private final int f25255g;

    /* renamed from: h */
    private final C9653a[] f25256h;

    /* renamed from: i */
    private final Rect f25257i = new Rect();

    /* renamed from: j */
    private final Rect f25258j = new Rect();

    /* renamed from: k */
    private final boolean f25259k;

    /* renamed from: l */
    private Bitmap f25260l;

    public C9664a(C12052a aVar, C9656b bVar, Rect rect, boolean z) {
        this.f25249a = aVar;
        this.f25250b = bVar;
        this.f25251c = bVar.mo26178c();
        this.f25253e = this.f25251c.getFrameDurations();
        this.f25249a.mo35767a(this.f25253e);
        this.f25255g = this.f25249a.mo35769c(this.f25253e);
        this.f25254f = this.f25249a.mo35768b(this.f25253e);
        this.f25252d = m23757a(this.f25251c, rect);
        this.f25259k = z;
        this.f25256h = new C9653a[this.f25251c.getFrameCount()];
        for (int i = 0; i < this.f25251c.getFrameCount(); i++) {
            this.f25256h[i] = this.f25251c.getFrameInfo(i);
        }
    }

    /* renamed from: a */
    private static Rect m23757a(AnimatedImage animatedImage, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, animatedImage.getWidth(), animatedImage.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), animatedImage.getWidth()), Math.min(rect.height(), animatedImage.getHeight()));
    }

    /* renamed from: b */
    private void m23761b(Canvas canvas, AnimatedImageFrame animatedImageFrame) {
        double width = ((double) this.f25252d.width()) / ((double) this.f25251c.getWidth());
        double height = ((double) this.f25252d.height()) / ((double) this.f25251c.getHeight());
        int round = (int) Math.round(((double) animatedImageFrame.getWidth()) * width);
        int round2 = (int) Math.round(((double) animatedImageFrame.getHeight()) * height);
        int xOffset = (int) (((double) animatedImageFrame.getXOffset()) * width);
        int yOffset = (int) (((double) animatedImageFrame.getYOffset()) * height);
        synchronized (this) {
            int width2 = this.f25252d.width();
            int height2 = this.f25252d.height();
            m23759a(width2, height2);
            animatedImageFrame.renderFrame(round, round2, this.f25260l);
            this.f25257i.set(0, 0, width2, height2);
            this.f25258j.set(xOffset, yOffset, width2 + xOffset, height2 + yOffset);
            canvas.drawBitmap(this.f25260l, this.f25257i, this.f25258j, null);
        }
    }

    public synchronized void dropCaches() {
        m23758a();
    }

    public AnimatedDrawableBackend forNewBounds(Rect rect) {
        if (m23757a(this.f25251c, rect).equals(this.f25252d)) {
            return this;
        }
        return new C9664a(this.f25249a, this.f25250b, rect, this.f25259k);
    }

    public C9656b getAnimatedImageResult() {
        return this.f25250b;
    }

    public int getDurationMs() {
        return this.f25255g;
    }

    public int getDurationMsForFrame(int i) {
        return this.f25253e[i];
    }

    public int getFrameCount() {
        return this.f25251c.getFrameCount();
    }

    public int getFrameForPreview() {
        return this.f25250b.mo26176b();
    }

    public int getFrameForTimestampMs(int i) {
        return this.f25249a.mo35766a(this.f25254f, i);
    }

    public C9653a getFrameInfo(int i) {
        return this.f25256h[i];
    }

    public int getHeight() {
        return this.f25251c.getHeight();
    }

    public int getLoopCount() {
        return this.f25251c.getLoopCount();
    }

    public synchronized int getMemoryUsage() {
        int i;
        i = 0;
        if (this.f25260l != null) {
            i = 0 + this.f25249a.mo35765a(this.f25260l);
        }
        return i + this.f25251c.getSizeInBytes();
    }

    public CloseableReference<Bitmap> getPreDecodedFrame(int i) {
        return this.f25250b.mo26174a(i);
    }

    public int getRenderedHeight() {
        return this.f25252d.height();
    }

    public int getRenderedWidth() {
        return this.f25252d.width();
    }

    public int getTimestampMsForFrame(int i) {
        C9536j.m23270a(i, this.f25254f.length);
        return this.f25254f[i];
    }

    public int getWidth() {
        return this.f25251c.getWidth();
    }

    public boolean hasPreDecodedFrame(int i) {
        return this.f25250b.mo26177b(i);
    }

    public void renderFrame(int i, Canvas canvas) {
        AnimatedImageFrame frame = this.f25251c.getFrame(i);
        try {
            if (this.f25251c.doesRenderSupportScaling()) {
                m23761b(canvas, frame);
            } else {
                m23760a(canvas, frame);
            }
        } finally {
            frame.dispose();
        }
    }

    /* renamed from: a */
    private synchronized void m23759a(int i, int i2) {
        if (this.f25260l != null && (this.f25260l.getWidth() < i || this.f25260l.getHeight() < i2)) {
            m23758a();
        }
        if (this.f25260l == null) {
            this.f25260l = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
        this.f25260l.eraseColor(0);
    }

    /* renamed from: a */
    private void m23760a(Canvas canvas, AnimatedImageFrame animatedImageFrame) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f25259k) {
            float max = Math.max(((float) animatedImageFrame.getWidth()) / ((float) Math.min(animatedImageFrame.getWidth(), canvas.getWidth())), ((float) animatedImageFrame.getHeight()) / ((float) Math.min(animatedImageFrame.getHeight(), canvas.getHeight())));
            i3 = (int) (((float) animatedImageFrame.getWidth()) / max);
            i2 = (int) (((float) animatedImageFrame.getHeight()) / max);
            i = (int) (((float) animatedImageFrame.getXOffset()) / max);
            i4 = (int) (((float) animatedImageFrame.getYOffset()) / max);
        } else {
            i3 = animatedImageFrame.getWidth();
            i2 = animatedImageFrame.getHeight();
            i = animatedImageFrame.getXOffset();
            i4 = animatedImageFrame.getYOffset();
        }
        synchronized (this) {
            m23759a(i3, i2);
            animatedImageFrame.renderFrame(i3, i2, this.f25260l);
            canvas.save();
            canvas.translate((float) i, (float) i4);
            canvas.drawBitmap(this.f25260l, 0.0f, 0.0f, null);
            canvas.restore();
        }
    }

    /* renamed from: a */
    private synchronized void m23758a() {
        if (this.f25260l != null) {
            this.f25260l.recycle();
            this.f25260l = null;
        }
    }
}
