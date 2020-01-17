package com.facebook.fresco.animation.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.logging.C9543a;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.drawable.C9611c;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.frame.C9648a;
import com.facebook.fresco.animation.frame.FrameScheduler;

public class AnimatedDrawable2 extends Drawable implements Animatable, DrawableWithCaches {

    /* renamed from: s */
    private static final Class<?> f25140s = AnimatedDrawable2.class;

    /* renamed from: t */
    private static final AnimationListener f25141t = new C9639a();

    /* renamed from: e */
    private AnimationBackend f25142e;

    /* renamed from: f */
    private FrameScheduler f25143f;

    /* renamed from: g */
    private volatile boolean f25144g;

    /* renamed from: h */
    private long f25145h;

    /* renamed from: i */
    private long f25146i;

    /* renamed from: j */
    private long f25147j;

    /* renamed from: k */
    private int f25148k;

    /* renamed from: l */
    private long f25149l;

    /* renamed from: m */
    private long f25150m;

    /* renamed from: n */
    private int f25151n;

    /* renamed from: o */
    private volatile AnimationListener f25152o;

    /* renamed from: p */
    private volatile DrawListener f25153p;

    /* renamed from: q */
    private C9611c f25154q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f25155r;

    public interface DrawListener {
        void onDraw(AnimatedDrawable2 animatedDrawable2, FrameScheduler frameScheduler, int i, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, long j6, long j7);
    }

    /* renamed from: com.facebook.fresco.animation.drawable.AnimatedDrawable2$a */
    class C9638a implements Runnable {
        C9638a() {
        }

        public void run() {
            AnimatedDrawable2 animatedDrawable2 = AnimatedDrawable2.this;
            animatedDrawable2.unscheduleSelf(animatedDrawable2.f25155r);
            AnimatedDrawable2.this.invalidateSelf();
        }
    }

    public AnimatedDrawable2() {
        this(null);
    }

    /* renamed from: b */
    private long m23690b() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    private void m23692c() {
        this.f25151n++;
        if (C9543a.m23311a(2)) {
            C9543a.m23313b(f25140s, "Dropped a frame. Count: %s", (Object) Integer.valueOf(this.f25151n));
        }
    }

    public void draw(Canvas canvas) {
        long j;
        long j2;
        long j3;
        long j4;
        AnimatedDrawable2 animatedDrawable2;
        if (this.f25142e == null || this.f25143f == null) {
            return;
        }
        long b = m23690b();
        if (this.f25144g) {
            j = (b - this.f25145h) + this.f25150m;
        } else {
            j = Math.max(this.f25146i, 0);
        }
        long j5 = j;
        int frameNumberToRender = this.f25143f.getFrameNumberToRender(j5, this.f25146i);
        if (frameNumberToRender == -1) {
            frameNumberToRender = this.f25142e.getFrameCount() - 1;
            this.f25152o.onAnimationStop(this);
            this.f25144g = false;
        } else if (frameNumberToRender == 0 && this.f25148k != -1 && b >= this.f25147j) {
            this.f25152o.onAnimationRepeat(this);
        }
        int i = frameNumberToRender;
        boolean drawFrame = this.f25142e.drawFrame(this, canvas, i);
        if (drawFrame) {
            this.f25152o.onAnimationFrame(this, i);
            this.f25148k = i;
        }
        if (!drawFrame) {
            m23692c();
        }
        long b2 = m23690b();
        if (this.f25144g) {
            long targetRenderTimeForNextFrameMs = this.f25143f.getTargetRenderTimeForNextFrameMs(b2 - this.f25145h);
            if (targetRenderTimeForNextFrameMs != -1) {
                long j6 = this.f25149l + targetRenderTimeForNextFrameMs;
                m23689a(j6);
                j2 = j6;
            } else {
                j2 = -1;
            }
            j3 = targetRenderTimeForNextFrameMs;
        } else {
            j3 = -1;
            j2 = -1;
        }
        DrawListener drawListener = this.f25153p;
        if (drawListener != null) {
            long j7 = j5;
            drawListener.onDraw(this, this.f25143f, i, drawFrame, this.f25144g, this.f25145h, j5, this.f25146i, b, b2, j3, j2);
            animatedDrawable2 = this;
            j4 = j7;
        } else {
            animatedDrawable2 = this;
            j4 = j5;
        }
        animatedDrawable2.f25146i = j4;
    }

    public void dropCaches() {
        AnimationBackend animationBackend = this.f25142e;
        if (animationBackend != null) {
            animationBackend.clear();
        }
    }

    public int getIntrinsicHeight() {
        AnimationBackend animationBackend = this.f25142e;
        if (animationBackend == null) {
            return super.getIntrinsicHeight();
        }
        return animationBackend.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        AnimationBackend animationBackend = this.f25142e;
        if (animationBackend == null) {
            return super.getIntrinsicWidth();
        }
        return animationBackend.getIntrinsicWidth();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f25144g;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        AnimationBackend animationBackend = this.f25142e;
        if (animationBackend != null) {
            animationBackend.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f25144g) {
            return false;
        }
        long j = (long) i;
        if (this.f25146i == j) {
            return false;
        }
        this.f25146i = j;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        if (this.f25154q == null) {
            this.f25154q = new C9611c();
        }
        this.f25154q.mo25964a(i);
        AnimationBackend animationBackend = this.f25142e;
        if (animationBackend != null) {
            animationBackend.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f25154q == null) {
            this.f25154q = new C9611c();
        }
        this.f25154q.mo25965a(colorFilter);
        AnimationBackend animationBackend = this.f25142e;
        if (animationBackend != null) {
            animationBackend.setColorFilter(colorFilter);
        }
    }

    public void start() {
        if (!this.f25144g) {
            AnimationBackend animationBackend = this.f25142e;
            if (animationBackend != null && animationBackend.getFrameCount() > 1) {
                this.f25144g = true;
                this.f25145h = m23690b();
                this.f25147j = this.f25145h;
                this.f25146i = -1;
                this.f25148k = -1;
                invalidateSelf();
                this.f25152o.onAnimationStart(this);
            }
        }
    }

    public void stop() {
        if (this.f25144g) {
            this.f25144g = false;
            this.f25145h = 0;
            this.f25147j = this.f25145h;
            this.f25146i = -1;
            this.f25148k = -1;
            unscheduleSelf(this.f25155r);
            this.f25152o.onAnimationStop(this);
        }
    }

    public AnimatedDrawable2(AnimationBackend animationBackend) {
        this.f25149l = 8;
        this.f25150m = 0;
        this.f25152o = f25141t;
        this.f25153p = null;
        this.f25155r = new C9638a();
        this.f25142e = animationBackend;
        this.f25143f = m23691b(this.f25142e);
    }

    /* renamed from: b */
    private static FrameScheduler m23691b(AnimationBackend animationBackend) {
        if (animationBackend == null) {
            return null;
        }
        return new C9648a(animationBackend);
    }

    /* renamed from: a */
    public void mo26122a(AnimationBackend animationBackend) {
        this.f25142e = animationBackend;
        AnimationBackend animationBackend2 = this.f25142e;
        if (animationBackend2 != null) {
            this.f25143f = new C9648a(animationBackend2);
            this.f25142e.setBounds(getBounds());
            C9611c cVar = this.f25154q;
            if (cVar != null) {
                cVar.mo25966a((Drawable) this);
            }
        }
        this.f25143f = m23691b(this.f25142e);
        stop();
    }

    /* renamed from: a */
    public AnimationBackend mo26120a() {
        return this.f25142e;
    }

    /* renamed from: a */
    public void mo26121a(int i) {
        if (this.f25142e != null) {
            FrameScheduler frameScheduler = this.f25143f;
            if (frameScheduler != null) {
                this.f25146i = frameScheduler.getTargetRenderTimeMs(i);
                this.f25145h = m23690b() - this.f25146i;
                this.f25147j = this.f25145h;
                invalidateSelf();
            }
        }
    }

    /* renamed from: a */
    public void mo26123a(AnimationListener animationListener) {
        if (animationListener == null) {
            animationListener = f25141t;
        }
        this.f25152o = animationListener;
    }

    /* renamed from: a */
    private void m23689a(long j) {
        this.f25147j = this.f25145h + j;
        scheduleSelf(this.f25155r, this.f25147j);
    }
}
